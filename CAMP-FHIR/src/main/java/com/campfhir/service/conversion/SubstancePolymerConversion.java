package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstancePolymer;
public class SubstancePolymerConversion 
{
	public org.hl7.fhir.r4.model.SubstancePolymer SubstancePolymers(SubstancePolymer s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstancePolymer substancepolymer = new org.hl7.fhir.r4.model.SubstancePolymer();

		/******************** id ********************************************************************************/
		substancepolymer.setId(s.getId());

		/******************** substancepolymerclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerclass =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymer.setClass_(substancepolymerclass);

		/******************** substancepolymerclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerclasscoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerclass.addCoding(substancepolymerclasscoding);

		/******************** SbstncPlymr_Cls__Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrClsCdgCd() != null) {
			substancepolymerclasscoding.setCode(s.getSbstncPlymrClsCdgCd());
		}
		/******************** SbstncPlymr_Cls__Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrClsCdgDsply() != null) {
			substancepolymerclasscoding.setDisplay(s.getSbstncPlymrClsCdgDsply());
		}
		/******************** SbstncPlymr_Cls__Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrClsCdgSys() != null) {
			substancepolymerclasscoding.setSystem(s.getSbstncPlymrClsCdgSys());
		}
		/******************** SbstncPlymr_Cls__Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrClsCdgUsrSltd() != null) {
			substancepolymerclasscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrClsCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Cls__Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrClsCdgVrsn() != null) {
			substancepolymerclasscoding.setVersion(s.getSbstncPlymrClsCdgVrsn());
		}
		/******************** SbstncPlymr_Cls__Txt ********************************************************************************/
		if(s.getSbstncPlymrClsTxt() != null) {
			substancepolymerclass.setText(s.getSbstncPlymrClsTxt());
		}
		/******************** substancepolymercopolymerconnectivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymercopolymerconnectivity =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymer.addCopolymerConnectivity(substancepolymercopolymerconnectivity);

		/******************** substancepolymercopolymerconnectivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymercopolymerconnectivitycoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymercopolymerconnectivity.addCoding(substancepolymercopolymerconnectivitycoding);

		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgCd() != null) {
			substancepolymercopolymerconnectivitycoding.setCode(s.getSbstncPlymrCopolymerConnectivityCdgCd());
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgDsply() != null) {
			substancepolymercopolymerconnectivitycoding.setDisplay(s.getSbstncPlymrCopolymerConnectivityCdgDsply());
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgSys() != null) {
			substancepolymercopolymerconnectivitycoding.setSystem(s.getSbstncPlymrCopolymerConnectivityCdgSys());
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgUsrSltd() != null) {
			substancepolymercopolymerconnectivitycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrCopolymerConnectivityCdgUsrSltd()));
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgVrsn() != null) {
			substancepolymercopolymerconnectivitycoding.setVersion(s.getSbstncPlymrCopolymerConnectivityCdgVrsn());
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Txt ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityTxt() != null) {
			substancepolymercopolymerconnectivity.setText(s.getSbstncPlymrCopolymerConnectivityTxt());
		}
		/******************** substancepolymergeometry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymergeometry =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymer.setGeometry(substancepolymergeometry);

		/******************** substancepolymergeometrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymergeometrycoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymergeometry.addCoding(substancepolymergeometrycoding);

		/******************** SbstncPlymr_Geometry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgCd() != null) {
			substancepolymergeometrycoding.setCode(s.getSbstncPlymrGeometryCdgCd());
		}
		/******************** SbstncPlymr_Geometry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgDsply() != null) {
			substancepolymergeometrycoding.setDisplay(s.getSbstncPlymrGeometryCdgDsply());
		}
		/******************** SbstncPlymr_Geometry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgSys() != null) {
			substancepolymergeometrycoding.setSystem(s.getSbstncPlymrGeometryCdgSys());
		}
		/******************** SbstncPlymr_Geometry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgUsrSltd() != null) {
			substancepolymergeometrycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrGeometryCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Geometry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgVrsn() != null) {
			substancepolymergeometrycoding.setVersion(s.getSbstncPlymrGeometryCdgVrsn());
		}
		/******************** SbstncPlymr_Geometry_Txt ********************************************************************************/
		if(s.getSbstncPlymrGeometryTxt() != null) {
			substancepolymergeometry.setText(s.getSbstncPlymrGeometryTxt());
		}
		/******************** SbstncPlymr_Modification ********************************************************************************/
		if(s.getSbstncPlymrModification() != null) {
			substancepolymer.addModification(s.getSbstncPlymrModification());
		}
		/******************** substancepolymermonomerset ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent substancepolymermonomerset =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent();
		substancepolymer.addMonomerSet(substancepolymermonomerset);

		/******************** substancepolymermonomersetratiotype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetratiotype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymermonomerset.setRatioType(substancepolymermonomersetratiotype);

		/******************** substancepolymermonomersetratiotypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetratiotypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymermonomersetratiotype.addCoding(substancepolymermonomersetratiotypecoding);

		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgCd() != null) {
			substancepolymermonomersetratiotypecoding.setCode(s.getSbstncPlymrMonomerStRtioTypCdgCd());
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgDsply() != null) {
			substancepolymermonomersetratiotypecoding.setDisplay(s.getSbstncPlymrMonomerStRtioTypCdgDsply());
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgSys() != null) {
			substancepolymermonomersetratiotypecoding.setSystem(s.getSbstncPlymrMonomerStRtioTypCdgSys());
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgUsrSltd() != null) {
			substancepolymermonomersetratiotypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrMonomerStRtioTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgVrsn() != null) {
			substancepolymermonomersetratiotypecoding.setVersion(s.getSbstncPlymrMonomerStRtioTypCdgVrsn());
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypTxt() != null) {
			substancepolymermonomersetratiotype.setText(s.getSbstncPlymrMonomerStRtioTypTxt());
		}
		/******************** substancepolymermonomersetstartingmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent substancepolymermonomersetstartingmaterial =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent();
		substancepolymermonomerset.addStartingMaterial(substancepolymermonomersetstartingmaterial);

		/******************** substancepolymermonomersetstartingmaterialamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymermonomersetstartingmaterialamount =  new org.hl7.fhir.r4.model.SubstanceAmount();
		substancepolymermonomersetstartingmaterial.setAmount(substancepolymermonomersetstartingmaterialamount);

		/******************** substancepolymermonomersetstartingmaterialamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymermonomersetstartingmaterialamount.setAmount(substancepolymermonomersetstartingmaterialamountamountquantity);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd() != null) {
			substancepolymermonomersetstartingmaterialamountamountquantity.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd());
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymermonomersetstartingmaterialamountamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymermonomersetstartingmaterialamountamountquantity.setComparator(substancepolymermonomersetstartingmaterialamountamountquantitycomparator.fromCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr()));

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys() != null) {
			substancepolymermonomersetstartingmaterialamountamountquantity.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt() != null) {
			substancepolymermonomersetstartingmaterialamountamountquantity.setUnit(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl() != null) {
			substancepolymermonomersetstartingmaterialamountamountquantity.setValue(Double.parseDouble((s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl())));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymermonomersetstartingmaterialamountamountrange =  new org.hl7.fhir.r4.model.Range();
		substancepolymermonomersetstartingmaterialamount.setAmount(substancepolymermonomersetstartingmaterialamountamountrange);

		/******************** substancepolymermonomersetstartingmaterialamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymermonomersetstartingmaterialamountamountrange.setHigh(substancepolymermonomersetstartingmaterialamountamountrangehigh);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangehigh.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd());
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymermonomersetstartingmaterialamountamountrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymermonomersetstartingmaterialamountamountrangehigh.setComparator(substancepolymermonomersetstartingmaterialamountamountrangehighcomparator.fromCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr()));

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangehigh.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangehigh.setUnit(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangehigh.setValue(Double.parseDouble((s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl())));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangelow =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymermonomersetstartingmaterialamountamountrange.setLow(substancepolymermonomersetstartingmaterialamountamountrangelow);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangelow.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd());
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymermonomersetstartingmaterialamountamountrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymermonomersetstartingmaterialamountamountrangelow.setComparator(substancepolymermonomersetstartingmaterialamountamountrangelowcomparator.fromCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr()));

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangelow.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangelow.setUnit(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl() != null) {
			substancepolymermonomersetstartingmaterialamountamountrangelow.setValue(Double.parseDouble((s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl())));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntStrgTyp() != null) {
			substancepolymermonomersetstartingmaterialamount.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntStrgTyp()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxt() != null) {
			substancepolymermonomersetstartingmaterialamount.setAmountText(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTxtElmnt ********************************************************************************/
//		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxtElmnt() != null) {
//			substancepolymermonomersetstartingmaterialamount.setAmountTextElement(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxtElmnt());
//		}
		/******************** substancepolymermonomersetstartingmaterialamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialamountamounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymermonomersetstartingmaterialamount.setAmountType(substancepolymermonomersetstartingmaterialamountamounttype);

		/******************** substancepolymermonomersetstartingmaterialamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialamountamounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymermonomersetstartingmaterialamountamounttype.addCoding(substancepolymermonomersetstartingmaterialamountamounttypecoding);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd() != null) {
			substancepolymermonomersetstartingmaterialamountamounttypecoding.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply() != null) {
			substancepolymermonomersetstartingmaterialamountamounttypecoding.setDisplay(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys() != null) {
			substancepolymermonomersetstartingmaterialamountamounttypecoding.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd() != null) {
			substancepolymermonomersetstartingmaterialamountamounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn() != null) {
			substancepolymermonomersetstartingmaterialamountamounttypecoding.setVersion(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt() != null) {
			substancepolymermonomersetstartingmaterialamountamounttype.setText(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt());
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymermonomersetstartingmaterialamountreferencerange =  new org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent();
		substancepolymermonomersetstartingmaterialamount.setReferenceRange(substancepolymermonomersetstartingmaterialamountreferencerange);

		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangehighlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymermonomersetstartingmaterialamountreferencerange.setHighLimit(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd());
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.setComparator(substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator.fromCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr()));

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.setUnit(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.setValue(Double.parseDouble((s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl())));
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangelowlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymermonomersetstartingmaterialamountreferencerange.setLowLimit(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.setCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd());
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.setComparator(substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator.fromCode(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr()));

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.setUnit(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl() != null) {
			substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.setValue(Double.parseDouble((s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl())));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_IsDefining ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlIsDefining() != null) {
			substancepolymermonomersetstartingmaterial.setIsDefining(Boolean.parseBoolean(s.getSbstncPlymrMonomerStStrtingMtrlIsDefining()));
		}
		/******************** substancepolymermonomersetstartingmaterialmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialmaterial =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymermonomersetstartingmaterial.setMaterial(substancepolymermonomersetstartingmaterialmaterial);

		/******************** substancepolymermonomersetstartingmaterialmaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialmaterialcoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymermonomersetstartingmaterialmaterial.addCoding(substancepolymermonomersetstartingmaterialmaterialcoding);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd() != null) {
			substancepolymermonomersetstartingmaterialmaterialcoding.setCode(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply() != null) {
			substancepolymermonomersetstartingmaterialmaterialcoding.setDisplay(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys() != null) {
			substancepolymermonomersetstartingmaterialmaterialcoding.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd() != null) {
			substancepolymermonomersetstartingmaterialmaterialcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn() != null) {
			substancepolymermonomersetstartingmaterialmaterialcoding.setVersion(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlTxt() != null) {
			substancepolymermonomersetstartingmaterialmaterial.setText(s.getSbstncPlymrMonomerStStrtingMtrlMtrlTxt());
		}
		/******************** substancepolymermonomersetstartingmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymermonomersetstartingmaterial.setType(substancepolymermonomersetstartingmaterialtype);

		/******************** substancepolymermonomersetstartingmaterialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymermonomersetstartingmaterialtype.addCoding(substancepolymermonomersetstartingmaterialtypecoding);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd() != null) {
			substancepolymermonomersetstartingmaterialtypecoding.setCode(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply() != null) {
			substancepolymermonomersetstartingmaterialtypecoding.setDisplay(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys() != null) {
			substancepolymermonomersetstartingmaterialtypecoding.setSystem(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd() != null) {
			substancepolymermonomersetstartingmaterialtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn() != null) {
			substancepolymermonomersetstartingmaterialtypecoding.setVersion(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn());
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypTxt() != null) {
			substancepolymermonomersetstartingmaterialtype.setText(s.getSbstncPlymrMonomerStStrtingMtrlTypTxt());
		}
		/******************** substancepolymerrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent substancepolymerrepeat =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent();
		substancepolymer.addRepeat(substancepolymerrepeat);

		/******************** SbstncPlymr_Rpt_AverageMoleclrFrmula ********************************************************************************/
		if(s.getSbstncPlymrRptAverageMoleclrFrmula() != null) {
			substancepolymerrepeat.setAverageMolecularFormula(s.getSbstncPlymrRptAverageMoleclrFrmula());
		}
		/******************** SbstncPlymr_Rpt_NmbrOfUnts ********************************************************************************/
		if(s.getSbstncPlymrRptNmbrOfUnts() != null) {
			substancepolymerrepeat.setNumberOfUnits(Integer.parseInt(s.getSbstncPlymrRptNmbrOfUnts()));
		}
		/******************** substancepolymerrepeatrepeatunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent substancepolymerrepeatrepeatunit =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent();
		substancepolymerrepeat.addRepeatUnit(substancepolymerrepeatrepeatunit);

		/******************** substancepolymerrepeatrepeatunitamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitamount =  new org.hl7.fhir.r4.model.SubstanceAmount();
		substancepolymerrepeatrepeatunit.setAmount(substancepolymerrepeatrepeatunitamount);

		/******************** substancepolymerrepeatrepeatunitamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitamount.setAmount(substancepolymerrepeatrepeatunitamountamountquantity);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyCd() != null) {
			substancepolymerrepeatrepeatunitamountamountquantity.setCode(s.getSbstncPlymrRptRptUntAmntAmntQntyCd());
		}
		/******************** substancepolymerrepeatrepeatunitamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitamountamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitamountamountquantity.setComparator(substancepolymerrepeatrepeatunitamountamountquantitycomparator.fromCode(s.getSbstncPlymrRptRptUntAmntAmntQntyCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntySys() != null) {
			substancepolymerrepeatrepeatunitamountamountquantity.setSystem(s.getSbstncPlymrRptRptUntAmntAmntQntySys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyUnt() != null) {
			substancepolymerrepeatrepeatunitamountamountquantity.setUnit(s.getSbstncPlymrRptRptUntAmntAmntQntyUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyVl() != null) {
			substancepolymerrepeatrepeatunitamountamountquantity.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntAmntAmntQntyVl())));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitamountamountrange =  new org.hl7.fhir.r4.model.Range();
		substancepolymerrepeatrepeatunitamount.setAmount(substancepolymerrepeatrepeatunitamountamountrange);

		/******************** substancepolymerrepeatrepeatunitamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitamountamountrange.setHigh(substancepolymerrepeatrepeatunitamountamountrangehigh);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiCd() != null) {
			substancepolymerrepeatrepeatunitamountamountrangehigh.setCode(s.getSbstncPlymrRptRptUntAmntAmntRngHiCd());
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitamountamountrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitamountamountrangehigh.setComparator(substancepolymerrepeatrepeatunitamountamountrangehighcomparator.fromCode(s.getSbstncPlymrRptRptUntAmntAmntRngHiCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiSys() != null) {
			substancepolymerrepeatrepeatunitamountamountrangehigh.setSystem(s.getSbstncPlymrRptRptUntAmntAmntRngHiSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiUnt() != null) {
			substancepolymerrepeatrepeatunitamountamountrangehigh.setUnit(s.getSbstncPlymrRptRptUntAmntAmntRngHiUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiVl() != null) {
			substancepolymerrepeatrepeatunitamountamountrangehigh.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntAmntAmntRngHiVl())));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangelow =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitamountamountrange.setLow(substancepolymerrepeatrepeatunitamountamountrangelow);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwCd() != null) {
			substancepolymerrepeatrepeatunitamountamountrangelow.setCode(s.getSbstncPlymrRptRptUntAmntAmntRngLwCd());
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitamountamountrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitamountamountrangelow.setComparator(substancepolymerrepeatrepeatunitamountamountrangelowcomparator.fromCode(s.getSbstncPlymrRptRptUntAmntAmntRngLwCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwSys() != null) {
			substancepolymerrepeatrepeatunitamountamountrangelow.setSystem(s.getSbstncPlymrRptRptUntAmntAmntRngLwSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwUnt() != null) {
			substancepolymerrepeatrepeatunitamountamountrangelow.setUnit(s.getSbstncPlymrRptRptUntAmntAmntRngLwUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwVl() != null) {
			substancepolymerrepeatrepeatunitamountamountrangelow.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntAmntAmntRngLwVl())));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntStrgTyp() != null) {
			substancepolymerrepeatrepeatunitamount.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncPlymrRptRptUntAmntAmntStrgTyp()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTxt() != null) {
			substancepolymerrepeatrepeatunitamount.setAmountText(s.getSbstncPlymrRptRptUntAmntAmntTxt());
		}
//		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTxtElmnt ********************************************************************************/
//		if(s.getSbstncPlymrRptRptUntAmntAmntTxtElmnt() != null) {
//			substancepolymerrepeatrepeatunitamount.getAmountTextElement(s.getSbstncPlymrRptRptUntAmntAmntTxtElmnt());
//		}
		/******************** substancepolymerrepeatrepeatunitamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamountamounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeatrepeatunitamount.setAmountType(substancepolymerrepeatrepeatunitamountamounttype);

		/******************** substancepolymerrepeatrepeatunitamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitamountamounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitamountamounttype.addCoding(substancepolymerrepeatrepeatunitamountamounttypecoding);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd() != null) {
			substancepolymerrepeatrepeatunitamountamounttypecoding.setCode(s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply() != null) {
			substancepolymerrepeatrepeatunitamountamounttypecoding.setDisplay(s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys() != null) {
			substancepolymerrepeatrepeatunitamountamounttypecoding.setSystem(s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitamountamounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitamountamounttypecoding.setVersion(s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypTxt() != null) {
			substancepolymerrepeatrepeatunitamountamounttype.setText(s.getSbstncPlymrRptRptUntAmntAmntTypTxt());
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitamountreferencerange =  new org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent();
		substancepolymerrepeatrepeatunitamount.setReferenceRange(substancepolymerrepeatrepeatunitamountreferencerange);

		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangehighlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitamountreferencerange.setHighLimit(substancepolymerrepeatrepeatunitamountreferencerangehighlimit);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangehighlimit.setCode(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd());
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitamountreferencerangehighlimit.setComparator(substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator.fromCode(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangehighlimit.setSystem(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangehighlimit.setUnit(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangehighlimit.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl())));
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangelowlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitamountreferencerange.setLowLimit(substancepolymerrepeatrepeatunitamountreferencerangelowlimit);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangelowlimit.setCode(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd());
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitamountreferencerangelowlimit.setComparator(substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator.fromCode(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangelowlimit.setSystem(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangelowlimit.setUnit(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl() != null) {
			substancepolymerrepeatrepeatunitamountreferencerangelowlimit.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl())));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent substancepolymerrepeatrepeatunitdegreeofpolymerisation =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent();
		substancepolymerrepeatrepeatunit.addDegreeOfPolymerisation(substancepolymerrepeatrepeatunitdegreeofpolymerisation);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitdegreeofpolymerisationamount =  new org.hl7.fhir.r4.model.SubstanceAmount();
		substancepolymerrepeatrepeatunitdegreeofpolymerisation.setAmount(substancepolymerrepeatrepeatunitdegreeofpolymerisationamount);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setAmount(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.setComparator(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator.fromCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.setUnit(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl())));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange =  new org.hl7.fhir.r4.model.Range();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setAmount(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.setHigh(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.setComparator(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator.fromCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.setUnit(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl())));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.setLow(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.setComparator(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator.fromCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.setUnit(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl())));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setAmountText(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt());
		}
//		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTxtElmnt ********************************************************************************/
//		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxtElmnt() != null) {
//			substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountTextElement(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxtElmnt());
//		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setAmountType(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.addCoding(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.setDisplay(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.setVersion(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.setText(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange =  new org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.setReferenceRange(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.setHighLimit(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.setComparator(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator.fromCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.setUnit(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl())));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit =  new org.hl7.fhir.r4.model.Quantity();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.setLowLimit(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd());
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.setComparator(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator.fromCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr()));

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.setUnit(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.setValue(Double.parseDouble((s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl())));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeatrepeatunitdegreeofpolymerisation.setDegree(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.addCoding(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.setCode(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.setDisplay(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.setSystem(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.setVersion(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt() != null) {
			substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.setText(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt());
		}
		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitorientationofpolymerisation =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeatrepeatunit.setOrientationOfPolymerisation(substancepolymerrepeatrepeatunitorientationofpolymerisation);

		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitorientationofpolymerisationcoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitorientationofpolymerisation.addCoding(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding);

		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.setCode(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.setDisplay(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.setSystem(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.setVersion(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationTxt() != null) {
			substancepolymerrepeatrepeatunitorientationofpolymerisation.setText(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationTxt());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_RptUnt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntRptUnt() != null) {
			substancepolymerrepeatrepeatunit.setRepeatUnit(s.getSbstncPlymrRptRptUntRptUnt());
		}
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent substancepolymerrepeatrepeatunitstructuralrepresentation =  new org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent();
		substancepolymerrepeatrepeatunit.addStructuralRepresentation(substancepolymerrepeatrepeatunitstructuralrepresentation);

		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancepolymerrepeatrepeatunitstructuralrepresentationattachment =  new org.hl7.fhir.r4.model.Attachment();
		substancepolymerrepeatrepeatunitstructuralrepresentation.setAttachment(substancepolymerrepeatrepeatunitstructuralrepresentationattachment);

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setContentType(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creation ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation() != null) {
			java.text.SimpleDateFormat SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creationdate = SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creationsdf.parse(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation());
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setCreation(SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creationdate);
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Data ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Hash ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setLanguage(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Sz ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setSize(Integer.parseInt(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Ttl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setTitle(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Url ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationattachment.setUrl(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Representation ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentation.setRepresentation(s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation());
		}
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitstructuralrepresentationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeatrepeatunitstructuralrepresentation.setType(substancepolymerrepeatrepeatunitstructuralrepresentationtype);

		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitstructuralrepresentationtype.addCoding(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding);

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.setCode(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.setDisplay(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.setSystem(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.setVersion(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt() != null) {
			substancepolymerrepeatrepeatunitstructuralrepresentationtype.setText(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt());
		}
		/******************** substancepolymerrepeatrepeatunitamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancepolymerrepeat.setRepeatUnitAmountType(substancepolymerrepeatrepeatunitamounttype);

		/******************** substancepolymerrepeatrepeatunitamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitamounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancepolymerrepeatrepeatunitamounttype.addCoding(substancepolymerrepeatrepeatunitamounttypecoding);

		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgCd() != null) {
			substancepolymerrepeatrepeatunitamounttypecoding.setCode(s.getSbstncPlymrRptRptUntAmntTypCdgCd());
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgDsply() != null) {
			substancepolymerrepeatrepeatunitamounttypecoding.setDisplay(s.getSbstncPlymrRptRptUntAmntTypCdgDsply());
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgSys() != null) {
			substancepolymerrepeatrepeatunitamounttypecoding.setSystem(s.getSbstncPlymrRptRptUntAmntTypCdgSys());
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgUsrSltd() != null) {
			substancepolymerrepeatrepeatunitamounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncPlymrRptRptUntAmntTypCdgUsrSltd()));
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgVrsn() != null) {
			substancepolymerrepeatrepeatunitamounttypecoding.setVersion(s.getSbstncPlymrRptRptUntAmntTypCdgVrsn());
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypTxt() != null) {
			substancepolymerrepeatrepeatunitamounttype.setText(s.getSbstncPlymrRptRptUntAmntTypTxt());
		}
		return substancepolymer;
	}
}
