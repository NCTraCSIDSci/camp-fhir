package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstancePolymer;
public class SubstancePolymerBidirectionalConversion 
{
	public SubstancePolymer SubstancePolymers(org.hl7.fhir.r4.model.SubstancePolymer substancepolymer) throws ParseException
	{
		 main.java.com.campfhir.model.SubstancePolymer s = new  main.java.com.campfhir.model.SubstancePolymer();

		/******************** id ********************************************************************************/
		s.setId(substancepolymer.getIdElement().getIdPart());

		/******************** substancepolymercopolymerconnectivity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancepolymercopolymerconnectivitylist = substancepolymer.getCopolymerConnectivity();
		for(int substancepolymercopolymerconnectivityi = 0; substancepolymercopolymerconnectivityi<substancepolymercopolymerconnectivitylist.size();substancepolymercopolymerconnectivityi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancepolymercopolymerconnectivity = substancepolymercopolymerconnectivitylist.get(substancepolymercopolymerconnectivityi);

		/******************** SbstncPlymr_CopolymerConnectivity_Txt ********************************************************************************/
		if(substancepolymercopolymerconnectivityi == 0) {s.addSbstncPlymrCopolymerConnectivityTxt("[");}
		if(substancepolymercopolymerconnectivity.hasText()) {

			s.addSbstncPlymrCopolymerConnectivityTxt(String.valueOf(substancepolymercopolymerconnectivity.getText()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityTxt("NULL");
		}

		if(substancepolymercopolymerconnectivityi == substancepolymercopolymerconnectivitylist.size()-1) {s.addSbstncPlymrCopolymerConnectivityTxt("]");}


		/******************** substancepolymercopolymerconnectivitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymercopolymerconnectivitycodinglist = substancepolymercopolymerconnectivity.getCoding();
		for(int substancepolymercopolymerconnectivitycodingi = 0; substancepolymercopolymerconnectivitycodingi<substancepolymercopolymerconnectivitycodinglist.size();substancepolymercopolymerconnectivitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymercopolymerconnectivitycoding = substancepolymercopolymerconnectivitycodinglist.get(substancepolymercopolymerconnectivitycodingi);

		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Dsply ********************************************************************************/
		if(substancepolymercopolymerconnectivitycodingi == 0) {s.addSbstncPlymrCopolymerConnectivityCdgDsply("[[");}
		if(substancepolymercopolymerconnectivitycoding.hasDisplay()) {

			s.addSbstncPlymrCopolymerConnectivityCdgDsply(String.valueOf(substancepolymercopolymerconnectivitycoding.getDisplay()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityCdgDsply("NULL");
		}

		if(substancepolymercopolymerconnectivitycodingi == substancepolymercopolymerconnectivitycodinglist.size()-1) {s.addSbstncPlymrCopolymerConnectivityCdgDsply("]]");}


		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Vrsn ********************************************************************************/
		if(substancepolymercopolymerconnectivitycodingi == 0) {s.addSbstncPlymrCopolymerConnectivityCdgVrsn("[[");}
		if(substancepolymercopolymerconnectivitycoding.hasVersion()) {

			s.addSbstncPlymrCopolymerConnectivityCdgVrsn(String.valueOf(substancepolymercopolymerconnectivitycoding.getVersion()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityCdgVrsn("NULL");
		}

		if(substancepolymercopolymerconnectivitycodingi == substancepolymercopolymerconnectivitycodinglist.size()-1) {s.addSbstncPlymrCopolymerConnectivityCdgVrsn("]]");}


		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Cd ********************************************************************************/
		if(substancepolymercopolymerconnectivitycodingi == 0) {s.addSbstncPlymrCopolymerConnectivityCdgCd("[[");}
		if(substancepolymercopolymerconnectivitycoding.hasCode()) {

			s.addSbstncPlymrCopolymerConnectivityCdgCd(String.valueOf(substancepolymercopolymerconnectivitycoding.getCode()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityCdgCd("NULL");
		}

		if(substancepolymercopolymerconnectivitycodingi == substancepolymercopolymerconnectivitycodinglist.size()-1) {s.addSbstncPlymrCopolymerConnectivityCdgCd("]]");}


		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymercopolymerconnectivitycodingi == 0) {s.addSbstncPlymrCopolymerConnectivityCdgUsrSltd("[[");}
		if(substancepolymercopolymerconnectivitycoding.hasUserSelected()) {

			s.addSbstncPlymrCopolymerConnectivityCdgUsrSltd(String.valueOf(substancepolymercopolymerconnectivitycoding.getUserSelected()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityCdgUsrSltd("NULL");
		}

		if(substancepolymercopolymerconnectivitycodingi == substancepolymercopolymerconnectivitycodinglist.size()-1) {s.addSbstncPlymrCopolymerConnectivityCdgUsrSltd("]]");}


		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Sys ********************************************************************************/
		if(substancepolymercopolymerconnectivitycodingi == 0) {s.addSbstncPlymrCopolymerConnectivityCdgSys("[[");}
		if(substancepolymercopolymerconnectivitycoding.hasSystem()) {

			s.addSbstncPlymrCopolymerConnectivityCdgSys(String.valueOf(substancepolymercopolymerconnectivitycoding.getSystem()));
		} else {
			s.addSbstncPlymrCopolymerConnectivityCdgSys("NULL");
		}

		if(substancepolymercopolymerconnectivitycodingi == substancepolymercopolymerconnectivitycodinglist.size()-1) {s.addSbstncPlymrCopolymerConnectivityCdgSys("]]");}


		 };
		 };
		/******************** SbstncPlymr_Modification ********************************************************************************/
		if(substancepolymer.hasModification()) {

			String  array = "[";
			for(int incr=0; incr<substancepolymer.getModification().size(); incr++) {
				array = array + substancepolymer.getModification().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncPlymrModification(array);

		} else {
			s.addSbstncPlymrModification("NULL");
		}


		/******************** substancepolymergeometry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymergeometry = substancepolymer.getGeometry();

		/******************** SbstncPlymr_Geometry_Txt ********************************************************************************/
		if(substancepolymergeometry.hasText()) {

			s.addSbstncPlymrGeometryTxt(String.valueOf(substancepolymergeometry.getText()));
		} else {
			s.addSbstncPlymrGeometryTxt("NULL");
		}


		/******************** substancepolymergeometrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymergeometrycodinglist = substancepolymergeometry.getCoding();
		for(int substancepolymergeometrycodingi = 0; substancepolymergeometrycodingi<substancepolymergeometrycodinglist.size();substancepolymergeometrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymergeometrycoding = substancepolymergeometrycodinglist.get(substancepolymergeometrycodingi);

		/******************** SbstncPlymr_Geometry_Cdg_Dsply ********************************************************************************/
		if(substancepolymergeometrycodingi == 0) {s.addSbstncPlymrGeometryCdgDsply("[");}
		if(substancepolymergeometrycoding.hasDisplay()) {

			s.addSbstncPlymrGeometryCdgDsply(String.valueOf(substancepolymergeometrycoding.getDisplay()));
		} else {
			s.addSbstncPlymrGeometryCdgDsply("NULL");
		}

		if(substancepolymergeometrycodingi == substancepolymergeometrycodinglist.size()-1) {s.addSbstncPlymrGeometryCdgDsply("]");}


		/******************** SbstncPlymr_Geometry_Cdg_Vrsn ********************************************************************************/
		if(substancepolymergeometrycodingi == 0) {s.addSbstncPlymrGeometryCdgVrsn("[");}
		if(substancepolymergeometrycoding.hasVersion()) {

			s.addSbstncPlymrGeometryCdgVrsn(String.valueOf(substancepolymergeometrycoding.getVersion()));
		} else {
			s.addSbstncPlymrGeometryCdgVrsn("NULL");
		}

		if(substancepolymergeometrycodingi == substancepolymergeometrycodinglist.size()-1) {s.addSbstncPlymrGeometryCdgVrsn("]");}


		/******************** SbstncPlymr_Geometry_Cdg_Cd ********************************************************************************/
		if(substancepolymergeometrycodingi == 0) {s.addSbstncPlymrGeometryCdgCd("[");}
		if(substancepolymergeometrycoding.hasCode()) {

			s.addSbstncPlymrGeometryCdgCd(String.valueOf(substancepolymergeometrycoding.getCode()));
		} else {
			s.addSbstncPlymrGeometryCdgCd("NULL");
		}

		if(substancepolymergeometrycodingi == substancepolymergeometrycodinglist.size()-1) {s.addSbstncPlymrGeometryCdgCd("]");}


		/******************** SbstncPlymr_Geometry_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymergeometrycodingi == 0) {s.addSbstncPlymrGeometryCdgUsrSltd("[");}
		if(substancepolymergeometrycoding.hasUserSelected()) {

			s.addSbstncPlymrGeometryCdgUsrSltd(String.valueOf(substancepolymergeometrycoding.getUserSelected()));
		} else {
			s.addSbstncPlymrGeometryCdgUsrSltd("NULL");
		}

		if(substancepolymergeometrycodingi == substancepolymergeometrycodinglist.size()-1) {s.addSbstncPlymrGeometryCdgUsrSltd("]");}


		/******************** SbstncPlymr_Geometry_Cdg_Sys ********************************************************************************/
		if(substancepolymergeometrycodingi == 0) {s.addSbstncPlymrGeometryCdgSys("[");}
		if(substancepolymergeometrycoding.hasSystem()) {

			s.addSbstncPlymrGeometryCdgSys(String.valueOf(substancepolymergeometrycoding.getSystem()));
		} else {
			s.addSbstncPlymrGeometryCdgSys("NULL");
		}

		if(substancepolymergeometrycodingi == substancepolymergeometrycodinglist.size()-1) {s.addSbstncPlymrGeometryCdgSys("]");}


		 };
		/******************** substancepolymerrepeat ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent> substancepolymerrepeatlist = substancepolymer.getRepeat();
		for(int substancepolymerrepeati = 0; substancepolymerrepeati<substancepolymerrepeatlist.size();substancepolymerrepeati++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent  substancepolymerrepeat = substancepolymerrepeatlist.get(substancepolymerrepeati);

		/******************** substancepolymerrepeatrepeatunit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent> substancepolymerrepeatrepeatunitlist = substancepolymerrepeat.getRepeatUnit();
		for(int substancepolymerrepeatrepeatuniti = 0; substancepolymerrepeatrepeatuniti<substancepolymerrepeatrepeatunitlist.size();substancepolymerrepeatrepeatuniti++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent  substancepolymerrepeatrepeatunit = substancepolymerrepeatrepeatunitlist.get(substancepolymerrepeatrepeatuniti);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent> substancepolymerrepeatrepeatunitdegreeofpolymerisationlist = substancepolymerrepeatrepeatunit.getDegreeOfPolymerisation();
		for(int substancepolymerrepeatrepeatunitdegreeofpolymerisationi = 0; substancepolymerrepeatrepeatunitdegreeofpolymerisationi<substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size();substancepolymerrepeatrepeatunitdegreeofpolymerisationi++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent  substancepolymerrepeatrepeatunitdegreeofpolymerisation = substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.get(substancepolymerrepeatrepeatunitdegreeofpolymerisationi);

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree = substancepolymerrepeatrepeatunitdegreeofpolymerisation.getDegree();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.hasText()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.getText()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist = substancepolymerrepeatrepeatunitdegreeofpolymerisationdegree.getCoding();
		for(int substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi = 0; substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi<substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size();substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding = substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.get(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationdegreecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys("]]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitdegreeofpolymerisationamount = substancepolymerrepeatrepeatunitdegreeofpolymerisation.getAmount();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountType();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.hasText()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.getText()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttype.getCoding();
		for(int substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi = 0; substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi<substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size();substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.get(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi);

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys("[[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodingi == substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys("]]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountRange();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.getLow();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasValue()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getComparator();
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator!=null) {
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr("[[[");		}
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelowcomparator.toCode());
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr("]]]");		}

		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasUnit()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangelow.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrange.getHigh();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasValue()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getComparator();
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator!=null) {
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr("[[[");		}
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehighcomparator.toCode());
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr("]]]");		}

		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasUnit()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountrangehigh.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getAmountQuantity();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasValue()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getComparator();
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator!=null) {
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr("[[[");		}
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantitycomparator.toCode());
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr("]]]");		}

		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasUnit()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountamountquantity.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange = substancepolymerrepeatrepeatunitdegreeofpolymerisationamount.getReferenceRange();

		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasValue()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getComparator();
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator!=null) {
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr("[[[");		}
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimitcomparator.toCode());
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr("]]]");		}

		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasUnit()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangelowlimit.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasValue()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl("]]]");}


		/******************** substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator = substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getComparator();
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator!=null) {
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr("[[[");		}
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimitcomparator.toCode());
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {

		s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr("]]]");		}

		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasCode()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasUnit()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == 0) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys("[[[");}
		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.hasSystem()) {

			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys(String.valueOf(substancepolymerrepeatrepeatunitdegreeofpolymerisationamountreferencerangehighlimit.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitdegreeofpolymerisationi == substancepolymerrepeatrepeatunitdegreeofpolymerisationlist.size()-1) {s.addSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys("]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent> substancepolymerrepeatrepeatunitstructuralrepresentationlist = substancepolymerrepeatrepeatunit.getStructuralRepresentation();
		for(int substancepolymerrepeatrepeatunitstructuralrepresentationi = 0; substancepolymerrepeatrepeatunitstructuralrepresentationi<substancepolymerrepeatrepeatunitstructuralrepresentationlist.size();substancepolymerrepeatrepeatunitstructuralrepresentationi++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent  substancepolymerrepeatrepeatunitstructuralrepresentation = substancepolymerrepeatrepeatunitstructuralrepresentationlist.get(substancepolymerrepeatrepeatunitstructuralrepresentationi);

		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitstructuralrepresentationtype = substancepolymerrepeatrepeatunitstructuralrepresentation.getType();

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtype.hasText()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtype.getText()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt("]]]");}


		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist = substancepolymerrepeatrepeatunitstructuralrepresentationtype.getCoding();
		for(int substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi = 0; substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi<substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size();substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding = substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.get(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi);

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply("[[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn("[[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd("[[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasCode()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd("[[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd("]]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys("[[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationtypecoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationtypecodingi == substancepolymerrepeatrepeatunitstructuralrepresentationtypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys("]]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitstructuralrepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancepolymerrepeatrepeatunitstructuralrepresentationattachment = substancepolymerrepeatrepeatunitstructuralrepresentation.getAttachment();

		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Sz ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasSize()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getSize()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Lnguage ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasLanguage()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getLanguage()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_CntntTyp ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasContentType()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getContentType()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Hash ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasHash()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash(new String(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getHash()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Data ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasData()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData(new String(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getData()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creation ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasCreation()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getCreation())+"\"");
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Ttl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasTitle()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getTitle()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Url ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.hasUrl()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentationattachment.getUrl()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Representation ********************************************************************************/
		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == 0) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation("[[[");}
		if(substancepolymerrepeatrepeatunitstructuralrepresentation.hasRepresentation()) {

			s.addSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation(String.valueOf(substancepolymerrepeatrepeatunitstructuralrepresentation.getRepresentation()));
		} else {
			s.addSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation("NULL");
		}

		if(substancepolymerrepeatrepeatunitstructuralrepresentationi == substancepolymerrepeatrepeatunitstructuralrepresentationlist.size()-1) {s.addSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation("]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitorientationofpolymerisation = substancepolymerrepeatrepeatunit.getOrientationOfPolymerisation();

		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisation.hasText()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationTxt(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisation.getText()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationTxt("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitorientationofpolymerisationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist = substancepolymerrepeatrepeatunitorientationofpolymerisation.getCoding();
		for(int substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi = 0; substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi<substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size();substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitorientationofpolymerisationcoding = substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.get(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi);

		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == 0) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply("[[[");}
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size()-1) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == 0) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn("[[[");}
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size()-1) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == 0) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd("[[[");}
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasCode()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size()-1) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == 0) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd("[[[");}
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size()-1) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == 0) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys("[[[");}
		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys(String.valueOf(substancepolymerrepeatrepeatunitorientationofpolymerisationcoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitorientationofpolymerisationcodingi == substancepolymerrepeatrepeatunitorientationofpolymerisationcodinglist.size()-1) {s.addSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys("]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymerrepeatrepeatunitamount = substancepolymerrepeatrepeatunit.getAmount();

		/******************** substancepolymerrepeatrepeatunitamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamountamounttype = substancepolymerrepeatrepeatunitamount.getAmountType();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttype.hasText()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitamountamounttype.getText()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypTxt("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitamountamounttypecodinglist = substancepolymerrepeatrepeatunitamountamounttype.getCoding();
		for(int substancepolymerrepeatrepeatunitamountamounttypecodingi = 0; substancepolymerrepeatrepeatunitamountamounttypecodingi<substancepolymerrepeatrepeatunitamountamounttypecodinglist.size();substancepolymerrepeatrepeatunitamountamounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitamountamounttypecoding = substancepolymerrepeatrepeatunitamountamounttypecodinglist.get(substancepolymerrepeatrepeatunitamountamounttypecodingi);

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgDsply("[[[");}
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == substancepolymerrepeatrepeatunitamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgDsply("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgVrsn("[[[");}
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == substancepolymerrepeatrepeatunitamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgVrsn("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgCd("[[[");}
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == substancepolymerrepeatrepeatunitamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgCd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd("[[[");}
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == substancepolymerrepeatrepeatunitamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd("]]]");}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgSys("[[[");}
		if(substancepolymerrepeatrepeatunitamountamounttypecoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitamountamounttypecoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntTypCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitamountamounttypecodingi == substancepolymerrepeatrepeatunitamountamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntAmntTypCdgSys("]]]");}


		 };
		/******************** substancepolymerrepeatrepeatunitamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymerrepeatrepeatunitamountamountrange = substancepolymerrepeatrepeatunitamount.getAmountRange();

		/******************** substancepolymerrepeatrepeatunitamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangelow = substancepolymerrepeatrepeatunitamountamountrange.getLow();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasValue()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngLwVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwVl("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountrangelowcomparator = substancepolymerrepeatrepeatunitamountamountrangelow.getComparator();
		if(substancepolymerrepeatrepeatunitamountamountrangelowcomparator!=null) {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwCmprtr(substancepolymerrepeatrepeatunitamountamountrangelowcomparator.toCode());
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngLwCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwCd("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasUnit()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngLwUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwUnt("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangelow.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngLwSys(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangelow.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngLwSys("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountrangehigh = substancepolymerrepeatrepeatunitamountamountrange.getHigh();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasValue()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngHiVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiVl("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountrangehighcomparator = substancepolymerrepeatrepeatunitamountamountrangehigh.getComparator();
		if(substancepolymerrepeatrepeatunitamountamountrangehighcomparator!=null) {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiCmprtr(substancepolymerrepeatrepeatunitamountamountrangehighcomparator.toCode());
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngHiCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiCd("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasUnit()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngHiUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiUnt("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountrangehigh.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntAmntRngHiSys(String.valueOf(substancepolymerrepeatrepeatunitamountamountrangehigh.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntRngHiSys("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountamountquantity = substancepolymerrepeatrepeatunitamount.getAmountQuantity();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasValue()) {

			s.addSbstncPlymrRptRptUntAmntAmntQntyVl(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntQntyVl("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountamountquantitycomparator = substancepolymerrepeatrepeatunitamountamountquantity.getComparator();
		if(substancepolymerrepeatrepeatunitamountamountquantitycomparator!=null) {
			s.addSbstncPlymrRptRptUntAmntAmntQntyCmprtr(substancepolymerrepeatrepeatunitamountamountquantitycomparator.toCode());
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntQntyCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntAmntQntyCd(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntQntyCd("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasUnit()) {

			s.addSbstncPlymrRptRptUntAmntAmntQntyUnt(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntQntyUnt("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountamountquantity.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntAmntQntySys(String.valueOf(substancepolymerrepeatrepeatunitamountamountquantity.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntAmntQntySys("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymerrepeatrepeatunitamountreferencerange = substancepolymerrepeatrepeatunitamount.getReferenceRange();

		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangelowlimit = substancepolymerrepeatrepeatunitamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasValue()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator = substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getComparator();
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator!=null) {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr(substancepolymerrepeatrepeatunitamountreferencerangelowlimitcomparator.toCode());
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasUnit()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangelowlimit.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymerrepeatrepeatunitamountreferencerangehighlimit = substancepolymerrepeatrepeatunitamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasValue()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getValue()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator = substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getComparator();
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator!=null) {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr(substancepolymerrepeatrepeatunitamountreferencerangehighlimitcomparator.toCode());
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasUnit()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getUnit()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt("NULL");
		}


		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys(String.valueOf(substancepolymerrepeatrepeatunitamountreferencerangehighlimit.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys("NULL");
		}


		 };
		/******************** SbstncPlymr_Rpt_NmbrOfUnts ********************************************************************************/
		if(substancepolymerrepeat.hasNumberOfUnits()) {

			s.addSbstncPlymrRptNmbrOfUnts(String.valueOf(substancepolymerrepeat.getNumberOfUnits()));
		} else {
			s.addSbstncPlymrRptNmbrOfUnts("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerrepeatrepeatunitamounttype = substancepolymerrepeat.getRepeatUnitAmountType();

		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Txt ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttype.hasText()) {

			s.addSbstncPlymrRptRptUntAmntTypTxt(String.valueOf(substancepolymerrepeatrepeatunitamounttype.getText()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypTxt("NULL");
		}


		/******************** substancepolymerrepeatrepeatunitamounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerrepeatrepeatunitamounttypecodinglist = substancepolymerrepeatrepeatunitamounttype.getCoding();
		for(int substancepolymerrepeatrepeatunitamounttypecodingi = 0; substancepolymerrepeatrepeatunitamounttypecodingi<substancepolymerrepeatrepeatunitamounttypecodinglist.size();substancepolymerrepeatrepeatunitamounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerrepeatrepeatunitamounttypecoding = substancepolymerrepeatrepeatunitamounttypecodinglist.get(substancepolymerrepeatrepeatunitamounttypecodingi);

		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntTypCdgDsply("[[");}
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasDisplay()) {

			s.addSbstncPlymrRptRptUntAmntTypCdgDsply(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypCdgDsply("NULL");
		}

		if(substancepolymerrepeatrepeatunitamounttypecodingi == substancepolymerrepeatrepeatunitamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntTypCdgDsply("]]");}


		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntTypCdgVrsn("[[");}
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasVersion()) {

			s.addSbstncPlymrRptRptUntAmntTypCdgVrsn(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getVersion()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypCdgVrsn("NULL");
		}

		if(substancepolymerrepeatrepeatunitamounttypecodingi == substancepolymerrepeatrepeatunitamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntTypCdgVrsn("]]");}


		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntTypCdgCd("[[");}
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasCode()) {

			s.addSbstncPlymrRptRptUntAmntTypCdgCd(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getCode()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypCdgCd("NULL");
		}

		if(substancepolymerrepeatrepeatunitamounttypecodingi == substancepolymerrepeatrepeatunitamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntTypCdgCd("]]");}


		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntTypCdgUsrSltd("[[");}
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasUserSelected()) {

			s.addSbstncPlymrRptRptUntAmntTypCdgUsrSltd(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypCdgUsrSltd("NULL");
		}

		if(substancepolymerrepeatrepeatunitamounttypecodingi == substancepolymerrepeatrepeatunitamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntTypCdgUsrSltd("]]");}


		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymerrepeatrepeatunitamounttypecodingi == 0) {s.addSbstncPlymrRptRptUntAmntTypCdgSys("[[");}
		if(substancepolymerrepeatrepeatunitamounttypecoding.hasSystem()) {

			s.addSbstncPlymrRptRptUntAmntTypCdgSys(String.valueOf(substancepolymerrepeatrepeatunitamounttypecoding.getSystem()));
		} else {
			s.addSbstncPlymrRptRptUntAmntTypCdgSys("NULL");
		}

		if(substancepolymerrepeatrepeatunitamounttypecodingi == substancepolymerrepeatrepeatunitamounttypecodinglist.size()-1) {s.addSbstncPlymrRptRptUntAmntTypCdgSys("]]");}


		 };
		/******************** SbstncPlymr_Rpt_AverageMoleclrFrmula ********************************************************************************/
		if(substancepolymerrepeat.hasAverageMolecularFormula()) {

			s.addSbstncPlymrRptAverageMoleclrFrmula(String.valueOf(substancepolymerrepeat.getAverageMolecularFormula()));
		} else {
			s.addSbstncPlymrRptAverageMoleclrFrmula("NULL");
		}


		 };
		/******************** substancepolymermonomerset ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent> substancepolymermonomersetlist = substancepolymer.getMonomerSet();
		for(int substancepolymermonomerseti = 0; substancepolymermonomerseti<substancepolymermonomersetlist.size();substancepolymermonomerseti++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent  substancepolymermonomerset = substancepolymermonomersetlist.get(substancepolymermonomerseti);

		/******************** substancepolymermonomersetratiotype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetratiotype = substancepolymermonomerset.getRatioType();

		/******************** SbstncPlymr_MonomerSt_RtioTyp_Txt ********************************************************************************/
		if(substancepolymermonomerseti == 0) {s.addSbstncPlymrMonomerStRtioTypTxt("[");}
		if(substancepolymermonomersetratiotype.hasText()) {

			s.addSbstncPlymrMonomerStRtioTypTxt(String.valueOf(substancepolymermonomersetratiotype.getText()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypTxt("NULL");
		}

		if(substancepolymermonomerseti == substancepolymermonomersetlist.size()-1) {s.addSbstncPlymrMonomerStRtioTypTxt("]");}


		/******************** substancepolymermonomersetratiotypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymermonomersetratiotypecodinglist = substancepolymermonomersetratiotype.getCoding();
		for(int substancepolymermonomersetratiotypecodingi = 0; substancepolymermonomersetratiotypecodingi<substancepolymermonomersetratiotypecodinglist.size();substancepolymermonomersetratiotypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymermonomersetratiotypecoding = substancepolymermonomersetratiotypecodinglist.get(substancepolymermonomersetratiotypecodingi);

		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetratiotypecodingi == 0) {s.addSbstncPlymrMonomerStRtioTypCdgDsply("[[");}
		if(substancepolymermonomersetratiotypecoding.hasDisplay()) {

			s.addSbstncPlymrMonomerStRtioTypCdgDsply(String.valueOf(substancepolymermonomersetratiotypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypCdgDsply("NULL");
		}

		if(substancepolymermonomersetratiotypecodingi == substancepolymermonomersetratiotypecodinglist.size()-1) {s.addSbstncPlymrMonomerStRtioTypCdgDsply("]]");}


		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetratiotypecodingi == 0) {s.addSbstncPlymrMonomerStRtioTypCdgVrsn("[[");}
		if(substancepolymermonomersetratiotypecoding.hasVersion()) {

			s.addSbstncPlymrMonomerStRtioTypCdgVrsn(String.valueOf(substancepolymermonomersetratiotypecoding.getVersion()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypCdgVrsn("NULL");
		}

		if(substancepolymermonomersetratiotypecodingi == substancepolymermonomersetratiotypecodinglist.size()-1) {s.addSbstncPlymrMonomerStRtioTypCdgVrsn("]]");}


		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetratiotypecodingi == 0) {s.addSbstncPlymrMonomerStRtioTypCdgCd("[[");}
		if(substancepolymermonomersetratiotypecoding.hasCode()) {

			s.addSbstncPlymrMonomerStRtioTypCdgCd(String.valueOf(substancepolymermonomersetratiotypecoding.getCode()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypCdgCd("NULL");
		}

		if(substancepolymermonomersetratiotypecodingi == substancepolymermonomersetratiotypecodinglist.size()-1) {s.addSbstncPlymrMonomerStRtioTypCdgCd("]]");}


		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetratiotypecodingi == 0) {s.addSbstncPlymrMonomerStRtioTypCdgUsrSltd("[[");}
		if(substancepolymermonomersetratiotypecoding.hasUserSelected()) {

			s.addSbstncPlymrMonomerStRtioTypCdgUsrSltd(String.valueOf(substancepolymermonomersetratiotypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypCdgUsrSltd("NULL");
		}

		if(substancepolymermonomersetratiotypecodingi == substancepolymermonomersetratiotypecodinglist.size()-1) {s.addSbstncPlymrMonomerStRtioTypCdgUsrSltd("]]");}


		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetratiotypecodingi == 0) {s.addSbstncPlymrMonomerStRtioTypCdgSys("[[");}
		if(substancepolymermonomersetratiotypecoding.hasSystem()) {

			s.addSbstncPlymrMonomerStRtioTypCdgSys(String.valueOf(substancepolymermonomersetratiotypecoding.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStRtioTypCdgSys("NULL");
		}

		if(substancepolymermonomersetratiotypecodingi == substancepolymermonomersetratiotypecodinglist.size()-1) {s.addSbstncPlymrMonomerStRtioTypCdgSys("]]");}


		 };
		/******************** substancepolymermonomersetstartingmaterial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent> substancepolymermonomersetstartingmateriallist = substancepolymermonomerset.getStartingMaterial();
		for(int substancepolymermonomersetstartingmateriali = 0; substancepolymermonomersetstartingmateriali<substancepolymermonomersetstartingmateriallist.size();substancepolymermonomersetstartingmateriali++ ) {
		org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent  substancepolymermonomersetstartingmaterial = substancepolymermonomersetstartingmateriallist.get(substancepolymermonomersetstartingmateriali);

		/******************** substancepolymermonomersetstartingmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialtype = substancepolymermonomersetstartingmaterial.getType();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypTxt("[[");}
		if(substancepolymermonomersetstartingmaterialtype.hasText()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypTxt(String.valueOf(substancepolymermonomersetstartingmaterialtype.getText()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypTxt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypTxt("]]");}


		/******************** substancepolymermonomersetstartingmaterialtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymermonomersetstartingmaterialtypecodinglist = substancepolymermonomersetstartingmaterialtype.getCoding();
		for(int substancepolymermonomersetstartingmaterialtypecodingi = 0; substancepolymermonomersetstartingmaterialtypecodingi<substancepolymermonomersetstartingmaterialtypecodinglist.size();substancepolymermonomersetstartingmaterialtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymermonomersetstartingmaterialtypecoding = substancepolymermonomersetstartingmaterialtypecodinglist.get(substancepolymermonomersetstartingmaterialtypecodingi);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgDsply("[[[");}
		if(substancepolymermonomersetstartingmaterialtypecoding.hasDisplay()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgDsply("NULL");
		}

		if(substancepolymermonomersetstartingmaterialtypecodingi == substancepolymermonomersetstartingmaterialtypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgDsply("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn("[[[");}
		if(substancepolymermonomersetstartingmaterialtypecoding.hasVersion()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getVersion()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn("NULL");
		}

		if(substancepolymermonomersetstartingmaterialtypecodingi == substancepolymermonomersetstartingmaterialtypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgCd("[[[");}
		if(substancepolymermonomersetstartingmaterialtypecoding.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgCd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialtypecodingi == substancepolymermonomersetstartingmaterialtypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgCd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd("[[[");}
		if(substancepolymermonomersetstartingmaterialtypecoding.hasUserSelected()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialtypecodingi == substancepolymermonomersetstartingmaterialtypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialtypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgSys("[[[");}
		if(substancepolymermonomersetstartingmaterialtypecoding.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialtypecoding.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlTypCdgSys("NULL");
		}

		if(substancepolymermonomersetstartingmaterialtypecodingi == substancepolymermonomersetstartingmaterialtypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlTypCdgSys("]]]");}


		 };
		/******************** substancepolymermonomersetstartingmaterialmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialmaterial = substancepolymermonomersetstartingmaterial.getMaterial();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlTxt("[[");}
		if(substancepolymermonomersetstartingmaterialmaterial.hasText()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlTxt(String.valueOf(substancepolymermonomersetstartingmaterialmaterial.getText()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlTxt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlTxt("]]");}


		/******************** substancepolymermonomersetstartingmaterialmaterialcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymermonomersetstartingmaterialmaterialcodinglist = substancepolymermonomersetstartingmaterialmaterial.getCoding();
		for(int substancepolymermonomersetstartingmaterialmaterialcodingi = 0; substancepolymermonomersetstartingmaterialmaterialcodingi<substancepolymermonomersetstartingmaterialmaterialcodinglist.size();substancepolymermonomersetstartingmaterialmaterialcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymermonomersetstartingmaterialmaterialcoding = substancepolymermonomersetstartingmaterialmaterialcodinglist.get(substancepolymermonomersetstartingmaterialmaterialcodingi);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply("[[[");}
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasDisplay()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getDisplay()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply("NULL");
		}

		if(substancepolymermonomersetstartingmaterialmaterialcodingi == substancepolymermonomersetstartingmaterialmaterialcodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn("[[[");}
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasVersion()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getVersion()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn("NULL");
		}

		if(substancepolymermonomersetstartingmaterialmaterialcodingi == substancepolymermonomersetstartingmaterialmaterialcodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd("[[[");}
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialmaterialcodingi == substancepolymermonomersetstartingmaterialmaterialcodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd("[[[");}
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasUserSelected()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getUserSelected()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialmaterialcodingi == substancepolymermonomersetstartingmaterialmaterialcodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialmaterialcodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys("[[[");}
		if(substancepolymermonomersetstartingmaterialmaterialcoding.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialmaterialcoding.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys("NULL");
		}

		if(substancepolymermonomersetstartingmaterialmaterialcodingi == substancepolymermonomersetstartingmaterialmaterialcodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys("]]]");}


		 };
		/******************** substancepolymermonomersetstartingmaterialamount ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount substancepolymermonomersetstartingmaterialamount = substancepolymermonomersetstartingmaterial.getAmount();

		/******************** substancepolymermonomersetstartingmaterialamountamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymermonomersetstartingmaterialamountamounttype = substancepolymermonomersetstartingmaterialamount.getAmountType();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Txt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt("[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttype.hasText()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttype.getText()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymermonomersetstartingmaterialamountamounttypecodinglist = substancepolymermonomersetstartingmaterialamountamounttype.getCoding();
		for(int substancepolymermonomersetstartingmaterialamountamounttypecodingi = 0; substancepolymermonomersetstartingmaterialamountamounttypecodingi<substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size();substancepolymermonomersetstartingmaterialamountamounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymermonomersetstartingmaterialamountamounttypecoding = substancepolymermonomersetstartingmaterialamountamounttypecodinglist.get(substancepolymermonomersetstartingmaterialamountamounttypecodingi);

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply("[[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasDisplay()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getDisplay()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply("NULL");
		}

		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn("[[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasVersion()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getVersion()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn("NULL");
		}

		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd("[[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd("[[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasUserSelected()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getUserSelected()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd("NULL");
		}

		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd("]]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys("[[[");}
		if(substancepolymermonomersetstartingmaterialamountamounttypecoding.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamounttypecoding.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys("NULL");
		}

		if(substancepolymermonomersetstartingmaterialamountamounttypecodingi == substancepolymermonomersetstartingmaterialamountamounttypecodinglist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys("]]]");}


		 };
		/******************** substancepolymermonomersetstartingmaterialamountamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancepolymermonomersetstartingmaterialamountamountrange = substancepolymermonomersetstartingmaterialamount.getAmountRange();

		/******************** substancepolymermonomersetstartingmaterialamountamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangelow = substancepolymermonomersetstartingmaterialamountamountrange.getLow();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasValue()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getValue()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountrangelowcomparator = substancepolymermonomersetstartingmaterialamountamountrangelow.getComparator();
		if(substancepolymermonomersetstartingmaterialamountamountrangelowcomparator!=null) {
		if(substancepolymermonomersetstartingmateriali == 0) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr("[[");		}
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr(substancepolymermonomersetstartingmaterialamountamountrangelowcomparator.toCode());
		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr("]]");		}

		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr("NULL");
		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasUnit()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getUnit()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangelow.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangelow.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountrangehigh = substancepolymermonomersetstartingmaterialamountamountrange.getHigh();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasValue()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getValue()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountrangehighcomparator = substancepolymermonomersetstartingmaterialamountamountrangehigh.getComparator();
		if(substancepolymermonomersetstartingmaterialamountamountrangehighcomparator!=null) {
		if(substancepolymermonomersetstartingmateriali == 0) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr("[[");		}
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr(substancepolymermonomersetstartingmaterialamountamountrangehighcomparator.toCode());
		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr("]]");		}

		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr("NULL");
		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasUnit()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getUnit()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountrangehigh.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountrangehigh.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountamountquantity = substancepolymermonomersetstartingmaterialamount.getAmountQuantity();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasValue()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getValue()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountamountquantitycomparator = substancepolymermonomersetstartingmaterialamountamountquantity.getComparator();
		if(substancepolymermonomersetstartingmaterialamountamountquantitycomparator!=null) {
		if(substancepolymermonomersetstartingmateriali == 0) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr("[[");		}
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr(substancepolymermonomersetstartingmaterialamountamountquantitycomparator.toCode());
		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr("]]");		}

		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr("NULL");
		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasUnit()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getUnit()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys("[[");}
		if(substancepolymermonomersetstartingmaterialamountamountquantity.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys(String.valueOf(substancepolymermonomersetstartingmaterialamountamountquantity.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent substancepolymermonomersetstartingmaterialamountreferencerange = substancepolymermonomersetstartingmaterialamount.getReferenceRange();

		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangelowlimit = substancepolymermonomersetstartingmaterialamountreferencerange.getLowLimit();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasValue()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getValue()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator = substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getComparator();
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator!=null) {
		if(substancepolymermonomersetstartingmateriali == 0) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr("[[");		}
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr(substancepolymermonomersetstartingmaterialamountreferencerangelowlimitcomparator.toCode());
		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr("]]");		}

		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasUnit()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getUnit()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangelowlimit.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancepolymermonomersetstartingmaterialamountreferencerangehighlimit = substancepolymermonomersetstartingmaterialamountreferencerange.getHighLimit();

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasValue()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getValue()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl("]]");}


		/******************** substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator = substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getComparator();
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator!=null) {
		if(substancepolymermonomersetstartingmateriali == 0) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr("[[");		}
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr(substancepolymermonomersetstartingmaterialamountreferencerangehighlimitcomparator.toCode());
		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {

		s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr("]]");		}

		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr("NULL");
		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasCode()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getCode()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasUnit()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getUnit()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys("[[");}
		if(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.hasSystem()) {

			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys(String.valueOf(substancepolymermonomersetstartingmaterialamountreferencerangehighlimit.getSystem()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys("]]");}


		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_IsDefining ********************************************************************************/
		if(substancepolymermonomersetstartingmateriali == 0) {s.addSbstncPlymrMonomerStStrtingMtrlIsDefining("[[");}
		if(substancepolymermonomersetstartingmaterial.hasIsDefining()) {

			s.addSbstncPlymrMonomerStStrtingMtrlIsDefining(String.valueOf(substancepolymermonomersetstartingmaterial.getIsDefining()));
		} else {
			s.addSbstncPlymrMonomerStStrtingMtrlIsDefining("NULL");
		}

		if(substancepolymermonomersetstartingmateriali == substancepolymermonomersetstartingmateriallist.size()-1) {s.addSbstncPlymrMonomerStStrtingMtrlIsDefining("]]");}


		 };
		 };
		/******************** substancepolymerclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancepolymerclass = substancepolymer.getClass_();

		/******************** SbstncPlymr_Cls__Txt ********************************************************************************/
		if(substancepolymerclass.hasText()) {

			s.addSbstncPlymrClsTxt(String.valueOf(substancepolymerclass.getText()));
		} else {
			s.addSbstncPlymrClsTxt("NULL");
		}


		/******************** substancepolymerclasscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancepolymerclasscodinglist = substancepolymerclass.getCoding();
		for(int substancepolymerclasscodingi = 0; substancepolymerclasscodingi<substancepolymerclasscodinglist.size();substancepolymerclasscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancepolymerclasscoding = substancepolymerclasscodinglist.get(substancepolymerclasscodingi);

		/******************** SbstncPlymr_Cls__Cdg_Dsply ********************************************************************************/
		if(substancepolymerclasscodingi == 0) {s.addSbstncPlymrClsCdgDsply("[");}
		if(substancepolymerclasscoding.hasDisplay()) {

			s.addSbstncPlymrClsCdgDsply(String.valueOf(substancepolymerclasscoding.getDisplay()));
		} else {
			s.addSbstncPlymrClsCdgDsply("NULL");
		}

		if(substancepolymerclasscodingi == substancepolymerclasscodinglist.size()-1) {s.addSbstncPlymrClsCdgDsply("]");}


		/******************** SbstncPlymr_Cls__Cdg_Vrsn ********************************************************************************/
		if(substancepolymerclasscodingi == 0) {s.addSbstncPlymrClsCdgVrsn("[");}
		if(substancepolymerclasscoding.hasVersion()) {

			s.addSbstncPlymrClsCdgVrsn(String.valueOf(substancepolymerclasscoding.getVersion()));
		} else {
			s.addSbstncPlymrClsCdgVrsn("NULL");
		}

		if(substancepolymerclasscodingi == substancepolymerclasscodinglist.size()-1) {s.addSbstncPlymrClsCdgVrsn("]");}


		/******************** SbstncPlymr_Cls__Cdg_Cd ********************************************************************************/
		if(substancepolymerclasscodingi == 0) {s.addSbstncPlymrClsCdgCd("[");}
		if(substancepolymerclasscoding.hasCode()) {

			s.addSbstncPlymrClsCdgCd(String.valueOf(substancepolymerclasscoding.getCode()));
		} else {
			s.addSbstncPlymrClsCdgCd("NULL");
		}

		if(substancepolymerclasscodingi == substancepolymerclasscodinglist.size()-1) {s.addSbstncPlymrClsCdgCd("]");}


		/******************** SbstncPlymr_Cls__Cdg_UsrSltd ********************************************************************************/
		if(substancepolymerclasscodingi == 0) {s.addSbstncPlymrClsCdgUsrSltd("[");}
		if(substancepolymerclasscoding.hasUserSelected()) {

			s.addSbstncPlymrClsCdgUsrSltd(String.valueOf(substancepolymerclasscoding.getUserSelected()));
		} else {
			s.addSbstncPlymrClsCdgUsrSltd("NULL");
		}

		if(substancepolymerclasscodingi == substancepolymerclasscodinglist.size()-1) {s.addSbstncPlymrClsCdgUsrSltd("]");}


		/******************** SbstncPlymr_Cls__Cdg_Sys ********************************************************************************/
		if(substancepolymerclasscodingi == 0) {s.addSbstncPlymrClsCdgSys("[");}
		if(substancepolymerclasscoding.hasSystem()) {

			s.addSbstncPlymrClsCdgSys(String.valueOf(substancepolymerclasscoding.getSystem()));
		} else {
			s.addSbstncPlymrClsCdgSys("NULL");
		}

		if(substancepolymerclasscodingi == substancepolymerclasscodinglist.size()-1) {s.addSbstncPlymrClsCdgSys("]");}


		 };
		return s;
	}
}
