package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstancePolymer;
public class SubstancePolymerBidirectionalConversion 
{
	public SubstancePolymer SubstancePolymers(org.hl7.fhir.r4.model.SubstancePolymer substancepolymer) throws ParseException
	{
		 main.java.com.campfhir.model.SubstancePolymer s = new  main.java.com.campfhir.model.SubstancePolymer();

		/******************** id ********************************************************************************/
		substancepolymer.setId(s.getId());

		/******************** substancepolymerclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerclass = substancepolymer.getClass_();

		/******************** SbstncPlymr_Cls__Txt ********************************************************************************/
		if(substancepolymerclass.hasText()) {
			s.setSbstncPlymrClsTxt(String.valueOf(substancepolymerclass.getText()));
		}
		/******************** substancepolymerclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerclasscoding = substancepolymerclass.getCodingFirstRep();

		/******************** SbstncPlymr_Cls__Cdg_Vrsn ********************************************************************************/
		if(substancepolymerclasscoding.hasVersion()) {
			s.setSbstncPlymrClsCdgVrsn(String.valueOf(substancepolymerclasscoding.getVersion()));
		}
		/******************** SbstncPlymr_Cls__Cdg_Dsply ********************************************************************************/
		if(substancepolymerclasscoding.hasDisplay()) {
			s.setSbstncPlymrClsCdgDsply(String.valueOf(substancepolymerclasscoding.getDisplay()));
		}
		/******************** SbstncPlymr_Cls__Cdg_Cd ********************************************************************************/
		if(substancepolymerclasscoding.hasCode()) {
			s.setSbstncPlymrClsCdgCd(String.valueOf(substancepolymerclasscoding.getCode()));
		}
		/******************** SbstncPlymr_Cls__Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerclasscoding.hasUserSelected()) {
			s.setSbstncPlymrClsCdgUsrSltd(String.valueOf(substancepolymerclasscoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Cls__Cdg_Sys ********************************************************************************/
		if(substancepolymerclasscoding.hasSystem()) {
			s.setSbstncPlymrClsCdgSys(String.valueOf(substancepolymerclasscoding.getSystem()));
		}
		/******************** substancepolymergeometry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymergeometry = substancepolymer.getGeometry();

		/******************** SbstncPlymr_Geometry_Txt ********************************************************************************/
		if(substancepolymergeometry.hasText()) {
			s.setSbstncPlymrGeometryTxt(String.valueOf(substancepolymergeometry.getText()));
		}
		/******************** substancepolymergeometrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymergeometrycoding = substancepolymergeometry.getCodingFirstRep();

		/******************** SbstncPlymr_Geometry_Cdg_Vrsn ********************************************************************************/
		if(substancepolymergeometrycoding.hasVersion()) {
			s.setSbstncPlymrGeometryCdgVrsn(String.valueOf(substancepolymergeometrycoding.getVersion()));
		}
		/******************** SbstncPlymr_Geometry_Cdg_Dsply ********************************************************************************/
		if(substancepolymergeometrycoding.hasDisplay()) {
			s.setSbstncPlymrGeometryCdgDsply(String.valueOf(substancepolymergeometrycoding.getDisplay()));
		}
		/******************** SbstncPlymr_Geometry_Cdg_Cd ********************************************************************************/
		if(substancepolymergeometrycoding.hasCode()) {
			s.setSbstncPlymrGeometryCdgCd(String.valueOf(substancepolymergeometrycoding.getCode()));
		}
		/******************** SbstncPlymr_Geometry_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymergeometrycoding.hasUserSelected()) {
			s.setSbstncPlymrGeometryCdgUsrSltd(String.valueOf(substancepolymergeometrycoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Geometry_Cdg_Sys ********************************************************************************/
		if(substancepolymergeometrycoding.hasSystem()) {
			s.setSbstncPlymrGeometryCdgSys(String.valueOf(substancepolymergeometrycoding.getSystem()));
		}
		/******************** substancepolymerrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent substancepolymerrepeat = substancepolymer.getRepeatFirstRep();

		/******************** substancepolymerrepeatrepeatunitamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamounttype = substancepolymerrepeat.getRepeatUnitAmountType();

		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttype.hasText()) {
			s.setSbstncPlymrRptRptUntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitamounttype.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitamounttypecoding = substancepolymerrepeatrepeatunitamounttype.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent substancepolymerrepeatrepeatunit = substancepolymerrepeat.getRepeatUnitFirstRep();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent substancepolymerrepeatrepeatunitdegreeofpolymerisation = substancepolymerrepeatrepeatunit.getDegreeOfPolymerisationFirstRep();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree = substancepolymerrepeatrepeatunitdegreeofpolymerisation.getDegree();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.hasText()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding = substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitdegreeofpolymerisationamount = substancepolymerrepeatrepeatunitdegreeofpolymerisation.getAmount();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountQuantity();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasValue()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getComparator();
		s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasUnit()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountRange();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.getLow();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasValue()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getComparator();
		s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasUnit()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.getHigh();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasValue()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getComparator();
		s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasUnit()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountType();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.hasText()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getReferenceRange();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasValue()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getComparator();
		s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasUnit()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasValue()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getComparator();
		s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasCode()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasUnit()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasSystem()) {
			s.setSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitorientationofpolymerisation = substancepolymerrepeatrepeatunit.getOrientationOfPolymerisation();

		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisation.hasText()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationTxt(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisation.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitorientationofpolymerisationcoding = substancepolymerrepeatrepeatunitorientationofpolymerisation.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasCode()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent substancepolymerrepeatrepeatunitstructuralrepresentation = substancepolymerrepeatrepeatunit.getStructuralRepresentationFirstRep();

		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitstructuralrepresentationtype = substancepolymerrepeatrepeatunitstructuralrepresentation.getType();

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtype.hasText()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtype.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding = substancepolymerrepeatrepeatunitstructuralrepresentationtype.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasCode()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancepolymerrepeatrepeatunitstructuralrepresentationattachment = substancepolymerrepeatrepeatunitstructuralrepresentation.getAttachment();

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Sz ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasSize()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getSize()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Lnguage ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasLanguage()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getLanguage()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_CntntTyp ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasContentType()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getContentType()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Ttl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasTitle()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getTitle()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Url ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasUrl()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getUrl()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Data ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasData()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getData()));
		}

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Hash ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasHash()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getHash()));
		}

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creation ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasCreation()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getCreation()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Representation ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentation.hasRepresentation()) {
			s.setSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentation.getRepresentation()));
		}
		/******************** substancepolymerrepeatrepeatunitamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitamount = substancepolymerrepeatrepeatunit.getAmount();

		/******************** substancepolymerrepeatrepeatunitamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountquantity = substancepolymerrepeatrepeatunitamount.getAmountQuantity();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasValue()) {
			s.setSbstncPlymrRptRptUntAmntAmntQntyVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountquantitycomparator = substancepolymerrepeatrepeatunitamountamountquantity.getComparator();
		s.setSbstncPlymrRptRptUntAmntAmntQntyCmprtr(substancepolymerrepeatrepeatunitamountamountquantitycomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntAmntQntyCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasUnit()) {
			s.setSbstncPlymrRptRptUntAmntAmntQntyUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntAmntQntySys(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitamountamountrange = substancepolymerrepeatrepeatunitamount.getAmountRange();

		/******************** substancepolymerrepeatrepeatunitamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangelow = substancepolymerrepeatrepeatunitamountamountrange.getLow();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasValue()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngLwVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountrangelowcomparator = substancepolymerrepeatrepeatunitamountamountrangelow.getComparator();
		s.setSbstncPlymrRptRptUntAmntAmntRngLwCmprtr(substancepolymerrepeatrepeatunitamountamountrangelowcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngLwCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasUnit()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngLwUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngLwSys(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangehigh = substancepolymerrepeatrepeatunitamountamountrange.getHigh();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasValue()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngHiVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountrangehighcomparator = substancepolymerrepeatrepeatunitamountamountrangehigh.getComparator();
		s.setSbstncPlymrRptRptUntAmntAmntRngHiCmprtr(substancepolymerrepeatrepeatunitamountamountrangehighcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngHiCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasUnit()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngHiUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntAmntRngHiSys(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamountamounttype = substancepolymerrepeatrepeatunitamount.getAmountType();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttype.hasText()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitamountamounttype.getText()));
		}
		/******************** substancepolymerrepeatrepeatunitamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymerrepeatrepeatunitamountamounttypecoding = substancepolymerrepeatrepeatunitamountamounttype.getCodingFirstRep();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasVersion()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getVersion()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasDisplay()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasUserSelected()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitamountreferencerange = substancepolymerrepeatrepeatunitamount.getReferenceRange();

		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangelowlimit = substancepolymerrepeatrepeatunitamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasValue()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator = substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getComparator();
		s.setSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr(substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasUnit()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getSystem()));
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangehighlimit = substancepolymerrepeatrepeatunitamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasValue()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getValue()));
		}
		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator = substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getComparator();
		s.setSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr(substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator.toCode());

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasCode()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getCode()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasUnit()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getUnit()));
		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasSystem()) {
			s.setSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getSystem()));
		}
		/******************** SbstncPlymr_Rpt_AverageMoleclrFrmula ********************************************************************************/
		if(substancepolymerrepeat.hasAverageMolecularFormula()) {
			s.setSbstncPlymrRptAverageMoleclrFrmula(String.valueOf(substancepolymerrepeat.getAverageMolecularFormula()));
		}
		/******************** SbstncPlymr_Rpt_NmbrOfUnts ********************************************************************************/
		if(substancepolymerrepeat.hasNumberOfUnits()) {
			s.setSbstncPlymrRptNmbrOfUnts(String.valueOf(substancepolymerrepeat.getNumberOfUnits()));
		}
		/******************** substancepolymercopolymerconnectivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymercopolymerconnectivity = substancepolymer.getCopolymerConnectivityFirstRep();

		/******************** SbstncPlymr_CopolymerConnectivity_Txt ********************************************************************************/
		if(substancepolymercopolymerconnectivity.hasText()) {
			s.setSbstncPlymrCopolymerConnectivityTxt(String.valueOf(substancepolymercopolymerconnectivity.getText()));
		}
		/******************** substancepolymercopolymerconnectivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymercopolymerconnectivitycoding = substancepolymercopolymerconnectivity.getCodingFirstRep();

		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Vrsn ********************************************************************************/
		if(substancepolymercopolymerconnectivitycoding.hasVersion()) {
			s.setSbstncPlymrCopolymerConnectivityCdgVrsn(String.valueOf(substancepolymercopolymerconnectivitycoding.getVersion()));
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Dsply ********************************************************************************/
		if(substancepolymercopolymerconnectivitycoding.hasDisplay()) {
			s.setSbstncPlymrCopolymerConnectivityCdgDsply(String.valueOf(substancepolymercopolymerconnectivitycoding.getDisplay()));
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Cd ********************************************************************************/
		if(substancepolymercopolymerconnectivitycoding.hasCode()) {
			s.setSbstncPlymrCopolymerConnectivityCdgCd(String.valueOf(substancepolymercopolymerconnectivitycoding.getCode()));
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymercopolymerconnectivitycoding.hasUserSelected()) {
			s.setSbstncPlymrCopolymerConnectivityCdgUsrSltd(String.valueOf(substancepolymercopolymerconnectivitycoding.getUserSelected()));
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Sys ********************************************************************************/
		if(substancepolymercopolymerconnectivitycoding.hasSystem()) {
			s.setSbstncPlymrCopolymerConnectivityCdgSys(String.valueOf(substancepolymercopolymerconnectivitycoding.getSystem()));
		}
		/******************** substancepolymermonomerset ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent substancepolymermonomerset = substancepolymer.getMonomerSetFirstRep();

		/******************** substancepolymermonomersetstartingmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent substancepolymermonomersetstartingmaterial = substancepolymermonomerset.getStartingMaterialFirstRep();

		/******************** substancepolymermonomersetstartingmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialtype = substancepolymermonomersetstartingmaterial.getType();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtype.hasText()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypTxt(String.valueOf(substancepolymermonomersetstartingmaterialtype.getText()));
		}
		/******************** substancepolymermonomersetstartingmaterialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialtypecoding = substancepolymermonomersetstartingmaterialtype.getCodingFirstRep();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecoding.hasVersion()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getVersion()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecoding.hasDisplay()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecoding.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecoding.hasUserSelected()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecoding.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlTypCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getSystem()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_IsDefining ********************************************************************************/
		if(substancepolymermonomersetstartingmaterial.hasIsDefining()) {
			s.setSbstncPlymrMonomerStStrtingMtrlIsDefining(String.valueOf(substancepolymermonomersetstartingmaterial.getIsDefining()));
		}
		/******************** substancepolymermonomersetstartingmaterialmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialmaterial = substancepolymermonomersetstartingmaterial.getMaterial();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterial.hasText()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlTxt(String.valueOf(substancepolymermonomersetstartingmaterialmaterial.getText()));
		}
		/******************** substancepolymermonomersetstartingmaterialmaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialmaterialcoding = substancepolymermonomersetstartingmaterialmaterial.getCodingFirstRep();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasVersion()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getVersion()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasDisplay()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getDisplay()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasUserSelected()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getUserSelected()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymermonomersetstartingmaterialamount = substancepolymermonomersetstartingmaterial.getAmount();

		/******************** substancepolymermonomersetstartingmaterialamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountquantity = substancepolymermonomersetstartingmaterialamount.getAmountQuantity();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasValue()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getValue()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountquantitycomparator = substancepolymermonomersetstartingmaterialamountamountquantity.getComparator();
		s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr(substancepolymermonomersetstartingmaterialamountamountquantitycomparator.toCode());

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasUnit()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getUnit()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymermonomersetstartingmaterialamountamountrange = substancepolymermonomersetstartingmaterialamount.getAmountRange();

		/******************** substancepolymermonomersetstartingmaterialamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangelow = substancepolymermonomersetstartingmaterialamountamountrange.getLow();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasValue()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getValue()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountrangelowcomparator = substancepolymermonomersetstartingmaterialamountamountrangelow.getComparator();
		s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr(substancepolymermonomersetstartingmaterialamountamountrangelowcomparator.toCode());

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasUnit()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getUnit()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangehigh = substancepolymermonomersetstartingmaterialamountamountrange.getHigh();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasValue()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getValue()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountrangehighcomparator = substancepolymermonomersetstartingmaterialamountamountrangehigh.getComparator();
		s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr(substancepolymermonomersetstartingmaterialamountamountrangehighcomparator.toCode());

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasUnit()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getUnit()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialamountamounttype = substancepolymermonomersetstartingmaterialamount.getAmountType();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttype.hasText()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttype.getText()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetstartingmaterialamountamounttypecoding = substancepolymermonomersetstartingmaterialamountamounttype.getCodingFirstRep();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasVersion()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getVersion()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasDisplay()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasUserSelected()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymermonomersetstartingmaterialamountreferencerange = substancepolymermonomersetstartingmaterialamount.getReferenceRange();

		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangelowlimit = substancepolymermonomersetstartingmaterialamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasValue()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getValue()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator = substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getComparator();
		s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr(substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator.toCode());

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasUnit()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getUnit()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getSystem()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangehighlimit = substancepolymermonomersetstartingmaterialamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasValue()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getValue()));
		}
		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator = substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getComparator();
		s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr(substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator.toCode());

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasCode()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasUnit()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getUnit()));
		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasSystem()) {
			s.setSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getSystem()));
		}
		/******************** substancepolymermonomersetratiotype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetratiotype = substancepolymermonomerset.getRatioType();

		/******************** SbstncPlymr_MonomerSt_RtioTyp_Txt ********************************************************************************/
		if(substancepolymermonomersetratiotype.hasText()) {
			s.setSbstncPlymrMonomerStRtioTypTxt(String.valueOf(substancepolymermonomersetratiotype.getText()));
		}
		/******************** substancepolymermonomersetratiotypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancepolymermonomersetratiotypecoding = substancepolymermonomersetratiotype.getCodingFirstRep();

		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetratiotypecoding.hasVersion()) {
			s.setSbstncPlymrMonomerStRtioTypCdgVrsn(String.valueOf(substancepolymermonomersetratiotypecoding.getVersion()));
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetratiotypecoding.hasDisplay()) {
			s.setSbstncPlymrMonomerStRtioTypCdgDsply(String.valueOf(substancepolymermonomersetratiotypecoding.getDisplay()));
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetratiotypecoding.hasCode()) {
			s.setSbstncPlymrMonomerStRtioTypCdgCd(String.valueOf(substancepolymermonomersetratiotypecoding.getCode()));
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetratiotypecoding.hasUserSelected()) {
			s.setSbstncPlymrMonomerStRtioTypCdgUsrSltd(String.valueOf(substancepolymermonomersetratiotypecoding.getUserSelected()));
		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetratiotypecoding.hasSystem()) {
			s.setSbstncPlymrMonomerStRtioTypCdgSys(String.valueOf(substancepolymermonomersetratiotypecoding.getSystem()));
		}
		return s;
	}
}
