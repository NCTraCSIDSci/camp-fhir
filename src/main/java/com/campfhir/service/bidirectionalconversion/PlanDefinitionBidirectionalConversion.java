package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PlanDefinition;
public class PlanDefinitionBidirectionalConversion 
{
	public PlanDefinition PlanDefinitions(org.hl7.fhir.r4.model.PlanDefinition plandefinition) throws ParseException
	{
		 main.java.com.campfhir.model.PlanDefinition p = new  main.java.com.campfhir.model.PlanDefinition();

		/******************** id ********************************************************************************/
		p.setId(plandefinition.getIdElement().getIdPart());

		/******************** PlnDfn_Nm ********************************************************************************/
		if(plandefinition.hasName()) {

			p.addPlnDfnNm(String.valueOf(plandefinition.getName()));
		} else {
			p.addPlnDfnNm("NULL");
		}


		/******************** plandefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiontype = plandefinition.getType();

		/******************** PlnDfn_Typ_Txt ********************************************************************************/
		if(plandefinitiontype.hasText()) {

			p.addPlnDfnTypTxt(String.valueOf(plandefinitiontype.getText()));
		} else {
			p.addPlnDfnTypTxt("NULL");
		}


		/******************** plandefinitiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiontypecodinglist = plandefinitiontype.getCoding();
		for(int plandefinitiontypecodingi = 0; plandefinitiontypecodingi<plandefinitiontypecodinglist.size();plandefinitiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiontypecoding = plandefinitiontypecodinglist.get(plandefinitiontypecodingi);

		/******************** PlnDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitiontypecodingi == 0) {p.addPlnDfnTypCdgDsply("[");}
		if(plandefinitiontypecoding.hasDisplay()) {

			p.addPlnDfnTypCdgDsply(String.valueOf(plandefinitiontypecoding.getDisplay()));
		} else {
			p.addPlnDfnTypCdgDsply("NULL");
		}

		if(plandefinitiontypecodingi == plandefinitiontypecodinglist.size()-1) {p.addPlnDfnTypCdgDsply("]");}


		/******************** PlnDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiontypecodingi == 0) {p.addPlnDfnTypCdgVrsn("[");}
		if(plandefinitiontypecoding.hasVersion()) {

			p.addPlnDfnTypCdgVrsn(String.valueOf(plandefinitiontypecoding.getVersion()));
		} else {
			p.addPlnDfnTypCdgVrsn("NULL");
		}

		if(plandefinitiontypecodingi == plandefinitiontypecodinglist.size()-1) {p.addPlnDfnTypCdgVrsn("]");}


		/******************** PlnDfn_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitiontypecodingi == 0) {p.addPlnDfnTypCdgCd("[");}
		if(plandefinitiontypecoding.hasCode()) {

			p.addPlnDfnTypCdgCd(String.valueOf(plandefinitiontypecoding.getCode()));
		} else {
			p.addPlnDfnTypCdgCd("NULL");
		}

		if(plandefinitiontypecodingi == plandefinitiontypecodinglist.size()-1) {p.addPlnDfnTypCdgCd("]");}


		/******************** PlnDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiontypecodingi == 0) {p.addPlnDfnTypCdgUsrSltd("[");}
		if(plandefinitiontypecoding.hasUserSelected()) {

			p.addPlnDfnTypCdgUsrSltd(String.valueOf(plandefinitiontypecoding.getUserSelected()));
		} else {
			p.addPlnDfnTypCdgUsrSltd("NULL");
		}

		if(plandefinitiontypecodingi == plandefinitiontypecodinglist.size()-1) {p.addPlnDfnTypCdgUsrSltd("]");}


		/******************** PlnDfn_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitiontypecodingi == 0) {p.addPlnDfnTypCdgSys("[");}
		if(plandefinitiontypecoding.hasSystem()) {

			p.addPlnDfnTypCdgSys(String.valueOf(plandefinitiontypecoding.getSystem()));
		} else {
			p.addPlnDfnTypCdgSys("NULL");
		}

		if(plandefinitiontypecodingi == plandefinitiontypecodinglist.size()-1) {p.addPlnDfnTypCdgSys("]");}


		 };
		/******************** PlnDfn_Vrsn ********************************************************************************/
		if(plandefinition.hasVersion()) {

			p.addPlnDfnVrsn(String.valueOf(plandefinition.getVersion()));
		} else {
			p.addPlnDfnVrsn("NULL");
		}


		/******************** plandefinitionaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent> plandefinitionactionlist = plandefinition.getAction();
		for(int plandefinitionactioni = 0; plandefinitionactioni<plandefinitionactionlist.size();plandefinitionactioni++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent  plandefinitionaction = plandefinitionactionlist.get(plandefinitionactioni);

		/******************** plandefinitionactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.RequestPriority plandefinitionactionpriority = plandefinitionaction.getPriority();
		if(plandefinitionactionpriority!=null) {
		if(plandefinitionactioni == 0) {

		p.addPlnDfnActnPriority("[");		}
			p.addPlnDfnActnPriority(plandefinitionactionpriority.toCode());
		if(plandefinitionactioni == plandefinitionactionlist.size()-1) {

		p.addPlnDfnActnPriority("]");		}

		} else {
			p.addPlnDfnActnPriority("NULL");
		}

		/******************** plandefinitionactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontype = plandefinitionaction.getType();

		/******************** PlnDfn_Actn_Typ_Txt ********************************************************************************/
		if(plandefinitionactioni == 0) {p.addPlnDfnActnTypTxt("[");}
		if(plandefinitionactiontype.hasText()) {

			p.addPlnDfnActnTypTxt(String.valueOf(plandefinitionactiontype.getText()));
		} else {
			p.addPlnDfnActnTypTxt("NULL");
		}

		if(plandefinitionactioni == plandefinitionactionlist.size()-1) {p.addPlnDfnActnTypTxt("]");}


		/******************** plandefinitionactiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactiontypecodinglist = plandefinitionactiontype.getCoding();
		for(int plandefinitionactiontypecodingi = 0; plandefinitionactiontypecodingi<plandefinitionactiontypecodinglist.size();plandefinitionactiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactiontypecoding = plandefinitionactiontypecodinglist.get(plandefinitionactiontypecodingi);

		/******************** PlnDfn_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontypecodingi == 0) {p.addPlnDfnActnTypCdgDsply("[[");}
		if(plandefinitionactiontypecoding.hasDisplay()) {

			p.addPlnDfnActnTypCdgDsply(String.valueOf(plandefinitionactiontypecoding.getDisplay()));
		} else {
			p.addPlnDfnActnTypCdgDsply("NULL");
		}

		if(plandefinitionactiontypecodingi == plandefinitionactiontypecodinglist.size()-1) {p.addPlnDfnActnTypCdgDsply("]]");}


		/******************** PlnDfn_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontypecodingi == 0) {p.addPlnDfnActnTypCdgVrsn("[[");}
		if(plandefinitionactiontypecoding.hasVersion()) {

			p.addPlnDfnActnTypCdgVrsn(String.valueOf(plandefinitionactiontypecoding.getVersion()));
		} else {
			p.addPlnDfnActnTypCdgVrsn("NULL");
		}

		if(plandefinitionactiontypecodingi == plandefinitionactiontypecodinglist.size()-1) {p.addPlnDfnActnTypCdgVrsn("]]");}


		/******************** PlnDfn_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontypecodingi == 0) {p.addPlnDfnActnTypCdgCd("[[");}
		if(plandefinitionactiontypecoding.hasCode()) {

			p.addPlnDfnActnTypCdgCd(String.valueOf(plandefinitionactiontypecoding.getCode()));
		} else {
			p.addPlnDfnActnTypCdgCd("NULL");
		}

		if(plandefinitionactiontypecodingi == plandefinitionactiontypecodinglist.size()-1) {p.addPlnDfnActnTypCdgCd("]]");}


		/******************** PlnDfn_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontypecodingi == 0) {p.addPlnDfnActnTypCdgUsrSltd("[[");}
		if(plandefinitionactiontypecoding.hasUserSelected()) {

			p.addPlnDfnActnTypCdgUsrSltd(String.valueOf(plandefinitionactiontypecoding.getUserSelected()));
		} else {
			p.addPlnDfnActnTypCdgUsrSltd("NULL");
		}

		if(plandefinitionactiontypecodingi == plandefinitionactiontypecodinglist.size()-1) {p.addPlnDfnActnTypCdgUsrSltd("]]");}


		/******************** PlnDfn_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontypecodingi == 0) {p.addPlnDfnActnTypCdgSys("[[");}
		if(plandefinitionactiontypecoding.hasSystem()) {

			p.addPlnDfnActnTypCdgSys(String.valueOf(plandefinitionactiontypecoding.getSystem()));
		} else {
			p.addPlnDfnActnTypCdgSys("NULL");
		}

		if(plandefinitionactiontypecodingi == plandefinitionactiontypecodinglist.size()-1) {p.addPlnDfnActnTypCdgSys("]]");}


		 };
		/******************** plandefinitionactionreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> plandefinitionactionreasonlist = plandefinitionaction.getReason();
		for(int plandefinitionactionreasoni = 0; plandefinitionactionreasoni<plandefinitionactionreasonlist.size();plandefinitionactionreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  plandefinitionactionreason = plandefinitionactionreasonlist.get(plandefinitionactionreasoni);

		/******************** PlnDfn_Actn_Rsn_Txt ********************************************************************************/
		if(plandefinitionactionreasoni == 0) {p.addPlnDfnActnRsnTxt("[[");}
		if(plandefinitionactionreason.hasText()) {

			p.addPlnDfnActnRsnTxt(String.valueOf(plandefinitionactionreason.getText()));
		} else {
			p.addPlnDfnActnRsnTxt("NULL");
		}

		if(plandefinitionactionreasoni == plandefinitionactionreasonlist.size()-1) {p.addPlnDfnActnRsnTxt("]]");}


		/******************** plandefinitionactionreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactionreasoncodinglist = plandefinitionactionreason.getCoding();
		for(int plandefinitionactionreasoncodingi = 0; plandefinitionactionreasoncodingi<plandefinitionactionreasoncodinglist.size();plandefinitionactionreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactionreasoncoding = plandefinitionactionreasoncodinglist.get(plandefinitionactionreasoncodingi);

		/******************** PlnDfn_Actn_Rsn_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionreasoncodingi == 0) {p.addPlnDfnActnRsnCdgDsply("[[[");}
		if(plandefinitionactionreasoncoding.hasDisplay()) {

			p.addPlnDfnActnRsnCdgDsply(String.valueOf(plandefinitionactionreasoncoding.getDisplay()));
		} else {
			p.addPlnDfnActnRsnCdgDsply("NULL");
		}

		if(plandefinitionactionreasoncodingi == plandefinitionactionreasoncodinglist.size()-1) {p.addPlnDfnActnRsnCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionreasoncodingi == 0) {p.addPlnDfnActnRsnCdgVrsn("[[[");}
		if(plandefinitionactionreasoncoding.hasVersion()) {

			p.addPlnDfnActnRsnCdgVrsn(String.valueOf(plandefinitionactionreasoncoding.getVersion()));
		} else {
			p.addPlnDfnActnRsnCdgVrsn("NULL");
		}

		if(plandefinitionactionreasoncodingi == plandefinitionactionreasoncodinglist.size()-1) {p.addPlnDfnActnRsnCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Rsn_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionreasoncodingi == 0) {p.addPlnDfnActnRsnCdgCd("[[[");}
		if(plandefinitionactionreasoncoding.hasCode()) {

			p.addPlnDfnActnRsnCdgCd(String.valueOf(plandefinitionactionreasoncoding.getCode()));
		} else {
			p.addPlnDfnActnRsnCdgCd("NULL");
		}

		if(plandefinitionactionreasoncodingi == plandefinitionactionreasoncodinglist.size()-1) {p.addPlnDfnActnRsnCdgCd("]]]");}


		/******************** PlnDfn_Actn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionreasoncodingi == 0) {p.addPlnDfnActnRsnCdgUsrSltd("[[[");}
		if(plandefinitionactionreasoncoding.hasUserSelected()) {

			p.addPlnDfnActnRsnCdgUsrSltd(String.valueOf(plandefinitionactionreasoncoding.getUserSelected()));
		} else {
			p.addPlnDfnActnRsnCdgUsrSltd("NULL");
		}

		if(plandefinitionactionreasoncodingi == plandefinitionactionreasoncodinglist.size()-1) {p.addPlnDfnActnRsnCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Rsn_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionreasoncodingi == 0) {p.addPlnDfnActnRsnCdgSys("[[[");}
		if(plandefinitionactionreasoncoding.hasSystem()) {

			p.addPlnDfnActnRsnCdgSys(String.valueOf(plandefinitionactionreasoncoding.getSystem()));
		} else {
			p.addPlnDfnActnRsnCdgSys("NULL");
		}

		if(plandefinitionactionreasoncodingi == plandefinitionactionreasoncodinglist.size()-1) {p.addPlnDfnActnRsnCdgSys("]]]");}


		 };
		 };
		/******************** plandefinitionactioninput ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> plandefinitionactioninputlist = plandefinitionaction.getInput();
		for(int plandefinitionactioninputi = 0; plandefinitionactioninputi<plandefinitionactioninputlist.size();plandefinitionactioninputi++ ) {
		org.hl7.fhir.r4.model.DataRequirement  plandefinitionactioninput = plandefinitionactioninputlist.get(plandefinitionactioninputi);

		/******************** PlnDfn_Actn_Input_Typ ********************************************************************************/
		if(plandefinitionactioninputi == 0) {p.addPlnDfnActnInputTyp("[[");}
		if(plandefinitionactioninput.hasType()) {

			p.addPlnDfnActnInputTyp(String.valueOf(plandefinitionactioninput.getType()));
		} else {
			p.addPlnDfnActnInputTyp("NULL");
		}

		if(plandefinitionactioninputi == plandefinitionactioninputlist.size()-1) {p.addPlnDfnActnInputTyp("]]");}


		/******************** plandefinitionactioninputsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> plandefinitionactioninputsortlist = plandefinitionactioninput.getSort();
		for(int plandefinitionactioninputsorti = 0; plandefinitionactioninputsorti<plandefinitionactioninputsortlist.size();plandefinitionactioninputsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  plandefinitionactioninputsort = plandefinitionactioninputsortlist.get(plandefinitionactioninputsorti);

		/******************** PlnDfn_Actn_Input_Sort_Path ********************************************************************************/
		if(plandefinitionactioninputsorti == 0) {p.addPlnDfnActnInputSortPath("[[[");}
		if(plandefinitionactioninputsort.hasPath()) {

			p.addPlnDfnActnInputSortPath(String.valueOf(plandefinitionactioninputsort.getPath()));
		} else {
			p.addPlnDfnActnInputSortPath("NULL");
		}

		if(plandefinitionactioninputsorti == plandefinitionactioninputsortlist.size()-1) {p.addPlnDfnActnInputSortPath("]]]");}


		/******************** plandefinitionactioninputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactioninputsortdirection = plandefinitionactioninputsort.getDirection();
		if(plandefinitionactioninputsortdirection!=null) {
		if(plandefinitionactioninputsorti == 0) {

		p.addPlnDfnActnInputSortDirection("[[[");		}
			p.addPlnDfnActnInputSortDirection(plandefinitionactioninputsortdirection.toCode());
		if(plandefinitionactioninputsorti == plandefinitionactioninputsortlist.size()-1) {

		p.addPlnDfnActnInputSortDirection("]]]");		}

		} else {
			p.addPlnDfnActnInputSortDirection("NULL");
		}

		 };
		/******************** PlnDfn_Actn_Input_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactioninput.hasSubjectReference()) {

			if(plandefinitionactioninput.getSubjectReference().getReference() != null) {
			p.addPlnDfnActnInputSbjctRfrnc(plandefinitionactioninput.getSubjectReference().getReference());
			}
		} else {
			p.addPlnDfnActnInputSbjctRfrnc("NULL");
		}


		/******************** plandefinitionactioninputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactioninputsubjectcodeableconcept = plandefinitionactioninput.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconcept.hasText()) {

			p.addPlnDfnActnInputSbjctCdbleCncptTxt(String.valueOf(plandefinitionactioninputsubjectcodeableconcept.getText()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptTxt("NULL");
		}


		/******************** plandefinitionactioninputsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactioninputsubjectcodeableconceptcodinglist = plandefinitionactioninputsubjectcodeableconcept.getCoding();
		for(int plandefinitionactioninputsubjectcodeableconceptcodingi = 0; plandefinitionactioninputsubjectcodeableconceptcodingi<plandefinitionactioninputsubjectcodeableconceptcodinglist.size();plandefinitionactioninputsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactioninputsubjectcodeableconceptcoding = plandefinitionactioninputsubjectcodeableconceptcodinglist.get(plandefinitionactioninputsubjectcodeableconceptcodingi);

		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnInputSbjctCdbleCncptCdgDsply("[[[");}
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnActnInputSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionactioninputsubjectcodeableconceptcodingi == plandefinitionactioninputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnInputSbjctCdbleCncptCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnInputSbjctCdbleCncptCdgVrsn("[[[");}
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasVersion()) {

			p.addPlnDfnActnInputSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionactioninputsubjectcodeableconceptcodingi == plandefinitionactioninputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnInputSbjctCdbleCncptCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnInputSbjctCdbleCncptCdgCd("[[[");}
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasCode()) {

			p.addPlnDfnActnInputSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionactioninputsubjectcodeableconceptcodingi == plandefinitionactioninputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnInputSbjctCdbleCncptCdgCd("]]]");}


		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd("[[[");}
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionactioninputsubjectcodeableconceptcodingi == plandefinitionactioninputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnInputSbjctCdbleCncptCdgSys("[[[");}
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasSystem()) {

			p.addPlnDfnActnInputSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnActnInputSbjctCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionactioninputsubjectcodeableconceptcodingi == plandefinitionactioninputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnInputSbjctCdbleCncptCdgSys("]]]");}


		 };
		/******************** PlnDfn_Actn_Input_Profile ********************************************************************************/
		if(plandefinitionactioninput.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactioninput.getProfile().size(); incr++) {
				array = array + plandefinitionactioninput.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnInputProfile(array);

		} else {
			p.addPlnDfnActnInputProfile("NULL");
		}


		/******************** PlnDfn_Actn_Input_MustSupport ********************************************************************************/
		if(plandefinitionactioninput.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactioninput.getMustSupport().size(); incr++) {
				array = array + plandefinitionactioninput.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnInputMustSupport(array);

		} else {
			p.addPlnDfnActnInputMustSupport("NULL");
		}


		/******************** plandefinitionactioninputcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> plandefinitionactioninputcodefilterlist = plandefinitionactioninput.getCodeFilter();
		for(int plandefinitionactioninputcodefilteri = 0; plandefinitionactioninputcodefilteri<plandefinitionactioninputcodefilterlist.size();plandefinitionactioninputcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  plandefinitionactioninputcodefilter = plandefinitionactioninputcodefilterlist.get(plandefinitionactioninputcodefilteri);

		/******************** PlnDfn_Actn_Input_CdFltr_Path ********************************************************************************/
		if(plandefinitionactioninputcodefilteri == 0) {p.addPlnDfnActnInputCdFltrPath("[[[");}
		if(plandefinitionactioninputcodefilter.hasPath()) {

			p.addPlnDfnActnInputCdFltrPath(String.valueOf(plandefinitionactioninputcodefilter.getPath()));
		} else {
			p.addPlnDfnActnInputCdFltrPath("NULL");
		}

		if(plandefinitionactioninputcodefilteri == plandefinitionactioninputcodefilterlist.size()-1) {p.addPlnDfnActnInputCdFltrPath("]]]");}


		/******************** plandefinitionactioninputcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactioninputcodefiltercodelist = plandefinitionactioninputcodefilter.getCode();
		for(int plandefinitionactioninputcodefiltercodei = 0; plandefinitionactioninputcodefiltercodei<plandefinitionactioninputcodefiltercodelist.size();plandefinitionactioninputcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactioninputcodefiltercode = plandefinitionactioninputcodefiltercodelist.get(plandefinitionactioninputcodefiltercodei);

		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactioninputcodefiltercodei == 0) {p.addPlnDfnActnInputCdFltrCdDsply("[[[[");}
		if(plandefinitionactioninputcodefiltercode.hasDisplay()) {

			p.addPlnDfnActnInputCdFltrCdDsply(String.valueOf(plandefinitionactioninputcodefiltercode.getDisplay()));
		} else {
			p.addPlnDfnActnInputCdFltrCdDsply("NULL");
		}

		if(plandefinitionactioninputcodefiltercodei == plandefinitionactioninputcodefiltercodelist.size()-1) {p.addPlnDfnActnInputCdFltrCdDsply("]]]]");}


		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactioninputcodefiltercodei == 0) {p.addPlnDfnActnInputCdFltrCdVrsn("[[[[");}
		if(plandefinitionactioninputcodefiltercode.hasVersion()) {

			p.addPlnDfnActnInputCdFltrCdVrsn(String.valueOf(plandefinitionactioninputcodefiltercode.getVersion()));
		} else {
			p.addPlnDfnActnInputCdFltrCdVrsn("NULL");
		}

		if(plandefinitionactioninputcodefiltercodei == plandefinitionactioninputcodefiltercodelist.size()-1) {p.addPlnDfnActnInputCdFltrCdVrsn("]]]]");}


		/******************** PlnDfn_Actn_Input_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactioninputcodefiltercodei == 0) {p.addPlnDfnActnInputCdFltrCdUsrSltd("[[[[");}
		if(plandefinitionactioninputcodefiltercode.hasUserSelected()) {

			p.addPlnDfnActnInputCdFltrCdUsrSltd(String.valueOf(plandefinitionactioninputcodefiltercode.getUserSelected()));
		} else {
			p.addPlnDfnActnInputCdFltrCdUsrSltd("NULL");
		}

		if(plandefinitionactioninputcodefiltercodei == plandefinitionactioninputcodefiltercodelist.size()-1) {p.addPlnDfnActnInputCdFltrCdUsrSltd("]]]]");}


		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactioninputcodefiltercodei == 0) {p.addPlnDfnActnInputCdFltrCdSys("[[[[");}
		if(plandefinitionactioninputcodefiltercode.hasSystem()) {

			p.addPlnDfnActnInputCdFltrCdSys(String.valueOf(plandefinitionactioninputcodefiltercode.getSystem()));
		} else {
			p.addPlnDfnActnInputCdFltrCdSys("NULL");
		}

		if(plandefinitionactioninputcodefiltercodei == plandefinitionactioninputcodefiltercodelist.size()-1) {p.addPlnDfnActnInputCdFltrCdSys("]]]]");}


		 };
		/******************** PlnDfn_Actn_Input_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactioninputcodefilter.hasSearchParam()) {

			p.addPlnDfnActnInputCdFltrSrchParam(String.valueOf(plandefinitionactioninputcodefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnInputCdFltrSrchParam("NULL");
		}


		/******************** PlnDfn_Actn_Input_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactioninputcodefilter.hasValueSet()) {

			p.addPlnDfnActnInputCdFltrVlSt(String.valueOf(plandefinitionactioninputcodefilter.getValueSet()));
		} else {
			p.addPlnDfnActnInputCdFltrVlSt("NULL");
		}


		 };
		/******************** PlnDfn_Actn_Input_Lmt ********************************************************************************/
		if(plandefinitionactioninput.hasLimit()) {

			p.addPlnDfnActnInputLmt(String.valueOf(plandefinitionactioninput.getLimit()));
		} else {
			p.addPlnDfnActnInputLmt("NULL");
		}


		/******************** plandefinitionactioninputdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> plandefinitionactioninputdatefilterlist = plandefinitionactioninput.getDateFilter();
		for(int plandefinitionactioninputdatefilteri = 0; plandefinitionactioninputdatefilteri<plandefinitionactioninputdatefilterlist.size();plandefinitionactioninputdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  plandefinitionactioninputdatefilter = plandefinitionactioninputdatefilterlist.get(plandefinitionactioninputdatefilteri);

		/******************** PlnDfn_Actn_Input_DtFltr_Path ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrPath("[[[");}
		if(plandefinitionactioninputdatefilter.hasPath()) {

			p.addPlnDfnActnInputDtFltrPath(String.valueOf(plandefinitionactioninputdatefilter.getPath()));
		} else {
			p.addPlnDfnActnInputDtFltrPath("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrPath("]]]");}


		/******************** PlnDfn_Actn_Input_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrSrchParam("[[[");}
		if(plandefinitionactioninputdatefilter.hasSearchParam()) {

			p.addPlnDfnActnInputDtFltrSrchParam(String.valueOf(plandefinitionactioninputdatefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnInputDtFltrSrchParam("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrSrchParam("]]]");}


		/******************** plandefinitionactioninputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactioninputdatefiltervalueduration = plandefinitionactioninputdatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlDurationVl("[[[");}
		if(plandefinitionactioninputdatefiltervalueduration.hasValue()) {

			p.addPlnDfnActnInputDtFltrVlDurationVl(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getValue()));
		} else {
			p.addPlnDfnActnInputDtFltrVlDurationVl("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlDurationVl("]]]");}


		/******************** plandefinitionactioninputdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactioninputdatefiltervaluedurationcomparator = plandefinitionactioninputdatefiltervalueduration.getComparator();
		if(plandefinitionactioninputdatefiltervaluedurationcomparator!=null) {
		if(plandefinitionactioninputdatefilteri == 0) {

		p.addPlnDfnActnInputDtFltrVlDurationCmprtr("[[[");		}
			p.addPlnDfnActnInputDtFltrVlDurationCmprtr(plandefinitionactioninputdatefiltervaluedurationcomparator.toCode());
		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {

		p.addPlnDfnActnInputDtFltrVlDurationCmprtr("]]]");		}

		} else {
			p.addPlnDfnActnInputDtFltrVlDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlDurationCd("[[[");}
		if(plandefinitionactioninputdatefiltervalueduration.hasCode()) {

			p.addPlnDfnActnInputDtFltrVlDurationCd(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getCode()));
		} else {
			p.addPlnDfnActnInputDtFltrVlDurationCd("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlDurationCd("]]]");}


		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlDurationUnt("[[[");}
		if(plandefinitionactioninputdatefiltervalueduration.hasUnit()) {

			p.addPlnDfnActnInputDtFltrVlDurationUnt(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getUnit()));
		} else {
			p.addPlnDfnActnInputDtFltrVlDurationUnt("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlDurationUnt("]]]");}


		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlDurationSys("[[[");}
		if(plandefinitionactioninputdatefiltervalueduration.hasSystem()) {

			p.addPlnDfnActnInputDtFltrVlDurationSys(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getSystem()));
		} else {
			p.addPlnDfnActnInputDtFltrVlDurationSys("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlDurationSys("]]]");}


		/******************** PlnDfn_Actn_Input_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlDtTimeTyp("[[[");}
		if(plandefinitionactioninputdatefilter.hasValueDateTimeType()) {

			p.addPlnDfnActnInputDtFltrVlDtTimeTyp("\""+plandefinitionactioninputdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnInputDtFltrVlDtTimeTyp("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlDtTimeTyp("]]]");}


		/******************** plandefinitionactioninputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactioninputdatefiltervalueperiod = plandefinitionactioninputdatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlPrdStrt("[[[");}
		if(plandefinitionactioninputdatefiltervalueperiod.hasStart()) {

			p.addPlnDfnActnInputDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactioninputdatefiltervalueperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnInputDtFltrVlPrdStrt("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlPrdStrt("]]]");}


		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactioninputdatefilteri == 0) {p.addPlnDfnActnInputDtFltrVlPrdEnd("[[[");}
		if(plandefinitionactioninputdatefiltervalueperiod.hasEnd()) {

			p.addPlnDfnActnInputDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactioninputdatefiltervalueperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnInputDtFltrVlPrdEnd("NULL");
		}

		if(plandefinitionactioninputdatefilteri == plandefinitionactioninputdatefilterlist.size()-1) {p.addPlnDfnActnInputDtFltrVlPrdEnd("]]]");}


		 };
		 };
		/******************** plandefinitionactioncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> plandefinitionactioncodelist = plandefinitionaction.getCode();
		for(int plandefinitionactioncodei = 0; plandefinitionactioncodei<plandefinitionactioncodelist.size();plandefinitionactioncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  plandefinitionactioncode = plandefinitionactioncodelist.get(plandefinitionactioncodei);

		/******************** PlnDfn_Actn_Cd_Txt ********************************************************************************/
		if(plandefinitionactioncodei == 0) {p.addPlnDfnActnCdTxt("[[");}
		if(plandefinitionactioncode.hasText()) {

			p.addPlnDfnActnCdTxt(String.valueOf(plandefinitionactioncode.getText()));
		} else {
			p.addPlnDfnActnCdTxt("NULL");
		}

		if(plandefinitionactioncodei == plandefinitionactioncodelist.size()-1) {p.addPlnDfnActnCdTxt("]]");}


		/******************** plandefinitionactioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactioncodecodinglist = plandefinitionactioncode.getCoding();
		for(int plandefinitionactioncodecodingi = 0; plandefinitionactioncodecodingi<plandefinitionactioncodecodinglist.size();plandefinitionactioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactioncodecoding = plandefinitionactioncodecodinglist.get(plandefinitionactioncodecodingi);

		/******************** PlnDfn_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactioncodecodingi == 0) {p.addPlnDfnActnCdCdgDsply("[[[");}
		if(plandefinitionactioncodecoding.hasDisplay()) {

			p.addPlnDfnActnCdCdgDsply(String.valueOf(plandefinitionactioncodecoding.getDisplay()));
		} else {
			p.addPlnDfnActnCdCdgDsply("NULL");
		}

		if(plandefinitionactioncodecodingi == plandefinitionactioncodecodinglist.size()-1) {p.addPlnDfnActnCdCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactioncodecodingi == 0) {p.addPlnDfnActnCdCdgVrsn("[[[");}
		if(plandefinitionactioncodecoding.hasVersion()) {

			p.addPlnDfnActnCdCdgVrsn(String.valueOf(plandefinitionactioncodecoding.getVersion()));
		} else {
			p.addPlnDfnActnCdCdgVrsn("NULL");
		}

		if(plandefinitionactioncodecodingi == plandefinitionactioncodecodinglist.size()-1) {p.addPlnDfnActnCdCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactioncodecodingi == 0) {p.addPlnDfnActnCdCdgCd("[[[");}
		if(plandefinitionactioncodecoding.hasCode()) {

			p.addPlnDfnActnCdCdgCd(String.valueOf(plandefinitionactioncodecoding.getCode()));
		} else {
			p.addPlnDfnActnCdCdgCd("NULL");
		}

		if(plandefinitionactioncodecodingi == plandefinitionactioncodecodinglist.size()-1) {p.addPlnDfnActnCdCdgCd("]]]");}


		/******************** PlnDfn_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactioncodecodingi == 0) {p.addPlnDfnActnCdCdgUsrSltd("[[[");}
		if(plandefinitionactioncodecoding.hasUserSelected()) {

			p.addPlnDfnActnCdCdgUsrSltd(String.valueOf(plandefinitionactioncodecoding.getUserSelected()));
		} else {
			p.addPlnDfnActnCdCdgUsrSltd("NULL");
		}

		if(plandefinitionactioncodecodingi == plandefinitionactioncodecodinglist.size()-1) {p.addPlnDfnActnCdCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactioncodecodingi == 0) {p.addPlnDfnActnCdCdgSys("[[[");}
		if(plandefinitionactioncodecoding.hasSystem()) {

			p.addPlnDfnActnCdCdgSys(String.valueOf(plandefinitionactioncodecoding.getSystem()));
		} else {
			p.addPlnDfnActnCdCdgSys("NULL");
		}

		if(plandefinitionactioncodecodingi == plandefinitionactioncodecodinglist.size()-1) {p.addPlnDfnActnCdCdgSys("]]]");}


		 };
		 };
		/******************** PlnDfn_Actn_Dscrptn ********************************************************************************/
		if(plandefinitionaction.hasDescription()) {

			p.addPlnDfnActnDscrptn(String.valueOf(plandefinitionaction.getDescription()));
		} else {
			p.addPlnDfnActnDscrptn("NULL");
		}


		/******************** PlnDfn_Actn_Transform ********************************************************************************/
		if(plandefinitionaction.hasTransform()) {

			p.addPlnDfnActnTransform(String.valueOf(plandefinitionaction.getTransform()));
		} else {
			p.addPlnDfnActnTransform("NULL");
		}


		/******************** plandefinitionactionoutput ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> plandefinitionactionoutputlist = plandefinitionaction.getOutput();
		for(int plandefinitionactionoutputi = 0; plandefinitionactionoutputi<plandefinitionactionoutputlist.size();plandefinitionactionoutputi++ ) {
		org.hl7.fhir.r4.model.DataRequirement  plandefinitionactionoutput = plandefinitionactionoutputlist.get(plandefinitionactionoutputi);

		/******************** PlnDfn_Actn_Output_Typ ********************************************************************************/
		if(plandefinitionactionoutputi == 0) {p.addPlnDfnActnOutputTyp("[[");}
		if(plandefinitionactionoutput.hasType()) {

			p.addPlnDfnActnOutputTyp(String.valueOf(plandefinitionactionoutput.getType()));
		} else {
			p.addPlnDfnActnOutputTyp("NULL");
		}

		if(plandefinitionactionoutputi == plandefinitionactionoutputlist.size()-1) {p.addPlnDfnActnOutputTyp("]]");}


		/******************** plandefinitionactionoutputsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> plandefinitionactionoutputsortlist = plandefinitionactionoutput.getSort();
		for(int plandefinitionactionoutputsorti = 0; plandefinitionactionoutputsorti<plandefinitionactionoutputsortlist.size();plandefinitionactionoutputsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  plandefinitionactionoutputsort = plandefinitionactionoutputsortlist.get(plandefinitionactionoutputsorti);

		/******************** PlnDfn_Actn_Output_Sort_Path ********************************************************************************/
		if(plandefinitionactionoutputsorti == 0) {p.addPlnDfnActnOutputSortPath("[[[");}
		if(plandefinitionactionoutputsort.hasPath()) {

			p.addPlnDfnActnOutputSortPath(String.valueOf(plandefinitionactionoutputsort.getPath()));
		} else {
			p.addPlnDfnActnOutputSortPath("NULL");
		}

		if(plandefinitionactionoutputsorti == plandefinitionactionoutputsortlist.size()-1) {p.addPlnDfnActnOutputSortPath("]]]");}


		/******************** plandefinitionactionoutputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactionoutputsortdirection = plandefinitionactionoutputsort.getDirection();
		if(plandefinitionactionoutputsortdirection!=null) {
		if(plandefinitionactionoutputsorti == 0) {

		p.addPlnDfnActnOutputSortDirection("[[[");		}
			p.addPlnDfnActnOutputSortDirection(plandefinitionactionoutputsortdirection.toCode());
		if(plandefinitionactionoutputsorti == plandefinitionactionoutputsortlist.size()-1) {

		p.addPlnDfnActnOutputSortDirection("]]]");		}

		} else {
			p.addPlnDfnActnOutputSortDirection("NULL");
		}

		 };
		/******************** PlnDfn_Actn_Output_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactionoutput.hasSubjectReference()) {

			if(plandefinitionactionoutput.getSubjectReference().getReference() != null) {
			p.addPlnDfnActnOutputSbjctRfrnc(plandefinitionactionoutput.getSubjectReference().getReference());
			}
		} else {
			p.addPlnDfnActnOutputSbjctRfrnc("NULL");
		}


		/******************** plandefinitionactionoutputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionoutputsubjectcodeableconcept = plandefinitionactionoutput.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconcept.hasText()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptTxt(String.valueOf(plandefinitionactionoutputsubjectcodeableconcept.getText()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptTxt("NULL");
		}


		/******************** plandefinitionactionoutputsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactionoutputsubjectcodeableconceptcodinglist = plandefinitionactionoutputsubjectcodeableconcept.getCoding();
		for(int plandefinitionactionoutputsubjectcodeableconceptcodingi = 0; plandefinitionactionoutputsubjectcodeableconceptcodingi<plandefinitionactionoutputsubjectcodeableconceptcodinglist.size();plandefinitionactionoutputsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactionoutputsubjectcodeableconceptcoding = plandefinitionactionoutputsubjectcodeableconceptcodinglist.get(plandefinitionactionoutputsubjectcodeableconceptcodingi);

		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgDsply("[[[");}
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == plandefinitionactionoutputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgVrsn("[[[");}
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasVersion()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == plandefinitionactionoutputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgCd("[[[");}
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasCode()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == plandefinitionactionoutputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgCd("]]]");}


		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd("[[[");}
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == plandefinitionactionoutputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgSys("[[[");}
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasSystem()) {

			p.addPlnDfnActnOutputSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnActnOutputSbjctCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionactionoutputsubjectcodeableconceptcodingi == plandefinitionactionoutputsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnOutputSbjctCdbleCncptCdgSys("]]]");}


		 };
		/******************** PlnDfn_Actn_Output_Profile ********************************************************************************/
		if(plandefinitionactionoutput.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactionoutput.getProfile().size(); incr++) {
				array = array + plandefinitionactionoutput.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnOutputProfile(array);

		} else {
			p.addPlnDfnActnOutputProfile("NULL");
		}


		/******************** PlnDfn_Actn_Output_MustSupport ********************************************************************************/
		if(plandefinitionactionoutput.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactionoutput.getMustSupport().size(); incr++) {
				array = array + plandefinitionactionoutput.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnOutputMustSupport(array);

		} else {
			p.addPlnDfnActnOutputMustSupport("NULL");
		}


		/******************** plandefinitionactionoutputcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> plandefinitionactionoutputcodefilterlist = plandefinitionactionoutput.getCodeFilter();
		for(int plandefinitionactionoutputcodefilteri = 0; plandefinitionactionoutputcodefilteri<plandefinitionactionoutputcodefilterlist.size();plandefinitionactionoutputcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  plandefinitionactionoutputcodefilter = plandefinitionactionoutputcodefilterlist.get(plandefinitionactionoutputcodefilteri);

		/******************** PlnDfn_Actn_Output_CdFltr_Path ********************************************************************************/
		if(plandefinitionactionoutputcodefilteri == 0) {p.addPlnDfnActnOutputCdFltrPath("[[[");}
		if(plandefinitionactionoutputcodefilter.hasPath()) {

			p.addPlnDfnActnOutputCdFltrPath(String.valueOf(plandefinitionactionoutputcodefilter.getPath()));
		} else {
			p.addPlnDfnActnOutputCdFltrPath("NULL");
		}

		if(plandefinitionactionoutputcodefilteri == plandefinitionactionoutputcodefilterlist.size()-1) {p.addPlnDfnActnOutputCdFltrPath("]]]");}


		/******************** plandefinitionactionoutputcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactionoutputcodefiltercodelist = plandefinitionactionoutputcodefilter.getCode();
		for(int plandefinitionactionoutputcodefiltercodei = 0; plandefinitionactionoutputcodefiltercodei<plandefinitionactionoutputcodefiltercodelist.size();plandefinitionactionoutputcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactionoutputcodefiltercode = plandefinitionactionoutputcodefiltercodelist.get(plandefinitionactionoutputcodefiltercodei);

		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercodei == 0) {p.addPlnDfnActnOutputCdFltrCdDsply("[[[[");}
		if(plandefinitionactionoutputcodefiltercode.hasDisplay()) {

			p.addPlnDfnActnOutputCdFltrCdDsply(String.valueOf(plandefinitionactionoutputcodefiltercode.getDisplay()));
		} else {
			p.addPlnDfnActnOutputCdFltrCdDsply("NULL");
		}

		if(plandefinitionactionoutputcodefiltercodei == plandefinitionactionoutputcodefiltercodelist.size()-1) {p.addPlnDfnActnOutputCdFltrCdDsply("]]]]");}


		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercodei == 0) {p.addPlnDfnActnOutputCdFltrCdVrsn("[[[[");}
		if(plandefinitionactionoutputcodefiltercode.hasVersion()) {

			p.addPlnDfnActnOutputCdFltrCdVrsn(String.valueOf(plandefinitionactionoutputcodefiltercode.getVersion()));
		} else {
			p.addPlnDfnActnOutputCdFltrCdVrsn("NULL");
		}

		if(plandefinitionactionoutputcodefiltercodei == plandefinitionactionoutputcodefiltercodelist.size()-1) {p.addPlnDfnActnOutputCdFltrCdVrsn("]]]]");}


		/******************** PlnDfn_Actn_Output_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercodei == 0) {p.addPlnDfnActnOutputCdFltrCdUsrSltd("[[[[");}
		if(plandefinitionactionoutputcodefiltercode.hasUserSelected()) {

			p.addPlnDfnActnOutputCdFltrCdUsrSltd(String.valueOf(plandefinitionactionoutputcodefiltercode.getUserSelected()));
		} else {
			p.addPlnDfnActnOutputCdFltrCdUsrSltd("NULL");
		}

		if(plandefinitionactionoutputcodefiltercodei == plandefinitionactionoutputcodefiltercodelist.size()-1) {p.addPlnDfnActnOutputCdFltrCdUsrSltd("]]]]");}


		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercodei == 0) {p.addPlnDfnActnOutputCdFltrCdSys("[[[[");}
		if(plandefinitionactionoutputcodefiltercode.hasSystem()) {

			p.addPlnDfnActnOutputCdFltrCdSys(String.valueOf(plandefinitionactionoutputcodefiltercode.getSystem()));
		} else {
			p.addPlnDfnActnOutputCdFltrCdSys("NULL");
		}

		if(plandefinitionactionoutputcodefiltercodei == plandefinitionactionoutputcodefiltercodelist.size()-1) {p.addPlnDfnActnOutputCdFltrCdSys("]]]]");}


		 };
		/******************** PlnDfn_Actn_Output_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactionoutputcodefilter.hasSearchParam()) {

			p.addPlnDfnActnOutputCdFltrSrchParam(String.valueOf(plandefinitionactionoutputcodefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnOutputCdFltrSrchParam("NULL");
		}


		/******************** PlnDfn_Actn_Output_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactionoutputcodefilter.hasValueSet()) {

			p.addPlnDfnActnOutputCdFltrVlSt(String.valueOf(plandefinitionactionoutputcodefilter.getValueSet()));
		} else {
			p.addPlnDfnActnOutputCdFltrVlSt("NULL");
		}


		 };
		/******************** PlnDfn_Actn_Output_Lmt ********************************************************************************/
		if(plandefinitionactionoutput.hasLimit()) {

			p.addPlnDfnActnOutputLmt(String.valueOf(plandefinitionactionoutput.getLimit()));
		} else {
			p.addPlnDfnActnOutputLmt("NULL");
		}


		/******************** plandefinitionactionoutputdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> plandefinitionactionoutputdatefilterlist = plandefinitionactionoutput.getDateFilter();
		for(int plandefinitionactionoutputdatefilteri = 0; plandefinitionactionoutputdatefilteri<plandefinitionactionoutputdatefilterlist.size();plandefinitionactionoutputdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  plandefinitionactionoutputdatefilter = plandefinitionactionoutputdatefilterlist.get(plandefinitionactionoutputdatefilteri);

		/******************** PlnDfn_Actn_Output_DtFltr_Path ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrPath("[[[");}
		if(plandefinitionactionoutputdatefilter.hasPath()) {

			p.addPlnDfnActnOutputDtFltrPath(String.valueOf(plandefinitionactionoutputdatefilter.getPath()));
		} else {
			p.addPlnDfnActnOutputDtFltrPath("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrPath("]]]");}


		/******************** PlnDfn_Actn_Output_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrSrchParam("[[[");}
		if(plandefinitionactionoutputdatefilter.hasSearchParam()) {

			p.addPlnDfnActnOutputDtFltrSrchParam(String.valueOf(plandefinitionactionoutputdatefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnOutputDtFltrSrchParam("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrSrchParam("]]]");}


		/******************** plandefinitionactionoutputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionoutputdatefiltervalueduration = plandefinitionactionoutputdatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlDurationVl("[[[");}
		if(plandefinitionactionoutputdatefiltervalueduration.hasValue()) {

			p.addPlnDfnActnOutputDtFltrVlDurationVl(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getValue()));
		} else {
			p.addPlnDfnActnOutputDtFltrVlDurationVl("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlDurationVl("]]]");}


		/******************** plandefinitionactionoutputdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionoutputdatefiltervaluedurationcomparator = plandefinitionactionoutputdatefiltervalueduration.getComparator();
		if(plandefinitionactionoutputdatefiltervaluedurationcomparator!=null) {
		if(plandefinitionactionoutputdatefilteri == 0) {

		p.addPlnDfnActnOutputDtFltrVlDurationCmprtr("[[[");		}
			p.addPlnDfnActnOutputDtFltrVlDurationCmprtr(plandefinitionactionoutputdatefiltervaluedurationcomparator.toCode());
		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {

		p.addPlnDfnActnOutputDtFltrVlDurationCmprtr("]]]");		}

		} else {
			p.addPlnDfnActnOutputDtFltrVlDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlDurationCd("[[[");}
		if(plandefinitionactionoutputdatefiltervalueduration.hasCode()) {

			p.addPlnDfnActnOutputDtFltrVlDurationCd(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getCode()));
		} else {
			p.addPlnDfnActnOutputDtFltrVlDurationCd("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlDurationCd("]]]");}


		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlDurationUnt("[[[");}
		if(plandefinitionactionoutputdatefiltervalueduration.hasUnit()) {

			p.addPlnDfnActnOutputDtFltrVlDurationUnt(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getUnit()));
		} else {
			p.addPlnDfnActnOutputDtFltrVlDurationUnt("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlDurationUnt("]]]");}


		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlDurationSys("[[[");}
		if(plandefinitionactionoutputdatefiltervalueduration.hasSystem()) {

			p.addPlnDfnActnOutputDtFltrVlDurationSys(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getSystem()));
		} else {
			p.addPlnDfnActnOutputDtFltrVlDurationSys("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlDurationSys("]]]");}


		/******************** PlnDfn_Actn_Output_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlDtTimeTyp("[[[");}
		if(plandefinitionactionoutputdatefilter.hasValueDateTimeType()) {

			p.addPlnDfnActnOutputDtFltrVlDtTimeTyp("\""+plandefinitionactionoutputdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnOutputDtFltrVlDtTimeTyp("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlDtTimeTyp("]]]");}


		/******************** plandefinitionactionoutputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactionoutputdatefiltervalueperiod = plandefinitionactionoutputdatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlPrdStrt("[[[");}
		if(plandefinitionactionoutputdatefiltervalueperiod.hasStart()) {

			p.addPlnDfnActnOutputDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactionoutputdatefiltervalueperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnOutputDtFltrVlPrdStrt("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlPrdStrt("]]]");}


		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactionoutputdatefilteri == 0) {p.addPlnDfnActnOutputDtFltrVlPrdEnd("[[[");}
		if(plandefinitionactionoutputdatefiltervalueperiod.hasEnd()) {

			p.addPlnDfnActnOutputDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactionoutputdatefiltervalueperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnOutputDtFltrVlPrdEnd("NULL");
		}

		if(plandefinitionactionoutputdatefilteri == plandefinitionactionoutputdatefilterlist.size()-1) {p.addPlnDfnActnOutputDtFltrVlPrdEnd("]]]");}


		 };
		 };
		/******************** PlnDfn_Actn_TmgDtTimeTyp ********************************************************************************/
		if(plandefinitionaction.hasTimingDateTimeType()) {

			p.addPlnDfnActnTmgDtTimeTyp("\""+plandefinitionaction.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnTmgDtTimeTyp("NULL");
		}


		/******************** plandefinitionactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age plandefinitionactiontimingage = plandefinitionaction.getTimingAge();

		/******************** PlnDfn_Actn_TmgAge_Vl ********************************************************************************/
		if(plandefinitionactiontimingage.hasValue()) {

			p.addPlnDfnActnTmgAgeVl(String.valueOf(plandefinitionactiontimingage.getValue()));
		} else {
			p.addPlnDfnActnTmgAgeVl("NULL");
		}


		/******************** plandefinitionactiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingagecomparator = plandefinitionactiontimingage.getComparator();
		if(plandefinitionactiontimingagecomparator!=null) {
			p.addPlnDfnActnTmgAgeCmprtr(plandefinitionactiontimingagecomparator.toCode());
		} else {
			p.addPlnDfnActnTmgAgeCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgAge_Cd ********************************************************************************/
		if(plandefinitionactiontimingage.hasCode()) {

			p.addPlnDfnActnTmgAgeCd(String.valueOf(plandefinitionactiontimingage.getCode()));
		} else {
			p.addPlnDfnActnTmgAgeCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgAge_Unt ********************************************************************************/
		if(plandefinitionactiontimingage.hasUnit()) {

			p.addPlnDfnActnTmgAgeUnt(String.valueOf(plandefinitionactiontimingage.getUnit()));
		} else {
			p.addPlnDfnActnTmgAgeUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgAge_Sys ********************************************************************************/
		if(plandefinitionactiontimingage.hasSystem()) {

			p.addPlnDfnActnTmgAgeSys(String.valueOf(plandefinitionactiontimingage.getSystem()));
		} else {
			p.addPlnDfnActnTmgAgeSys("NULL");
		}


		/******************** plandefinitionactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingduration = plandefinitionaction.getTimingDuration();

		/******************** PlnDfn_Actn_TmgDuration_Vl ********************************************************************************/
		if(plandefinitionactiontimingduration.hasValue()) {

			p.addPlnDfnActnTmgDurationVl(String.valueOf(plandefinitionactiontimingduration.getValue()));
		} else {
			p.addPlnDfnActnTmgDurationVl("NULL");
		}


		/******************** plandefinitionactiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingdurationcomparator = plandefinitionactiontimingduration.getComparator();
		if(plandefinitionactiontimingdurationcomparator!=null) {
			p.addPlnDfnActnTmgDurationCmprtr(plandefinitionactiontimingdurationcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgDuration_Cd ********************************************************************************/
		if(plandefinitionactiontimingduration.hasCode()) {

			p.addPlnDfnActnTmgDurationCd(String.valueOf(plandefinitionactiontimingduration.getCode()));
		} else {
			p.addPlnDfnActnTmgDurationCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgDuration_Unt ********************************************************************************/
		if(plandefinitionactiontimingduration.hasUnit()) {

			p.addPlnDfnActnTmgDurationUnt(String.valueOf(plandefinitionactiontimingduration.getUnit()));
		} else {
			p.addPlnDfnActnTmgDurationUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgDuration_Sys ********************************************************************************/
		if(plandefinitionactiontimingduration.hasSystem()) {

			p.addPlnDfnActnTmgDurationSys(String.valueOf(plandefinitionactiontimingduration.getSystem()));
		} else {
			p.addPlnDfnActnTmgDurationSys("NULL");
		}


		/******************** plandefinitionactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingrange = plandefinitionaction.getTimingRange();

		/******************** plandefinitionactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangelow = plandefinitionactiontimingrange.getLow();

		/******************** PlnDfn_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasValue()) {

			p.addPlnDfnActnTmgRngLwVl(String.valueOf(plandefinitionactiontimingrangelow.getValue()));
		} else {
			p.addPlnDfnActnTmgRngLwVl("NULL");
		}


		/******************** plandefinitionactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingrangelowcomparator = plandefinitionactiontimingrangelow.getComparator();
		if(plandefinitionactiontimingrangelowcomparator!=null) {
			p.addPlnDfnActnTmgRngLwCmprtr(plandefinitionactiontimingrangelowcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgRngLwCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasCode()) {

			p.addPlnDfnActnTmgRngLwCd(String.valueOf(plandefinitionactiontimingrangelow.getCode()));
		} else {
			p.addPlnDfnActnTmgRngLwCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasUnit()) {

			p.addPlnDfnActnTmgRngLwUnt(String.valueOf(plandefinitionactiontimingrangelow.getUnit()));
		} else {
			p.addPlnDfnActnTmgRngLwUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasSystem()) {

			p.addPlnDfnActnTmgRngLwSys(String.valueOf(plandefinitionactiontimingrangelow.getSystem()));
		} else {
			p.addPlnDfnActnTmgRngLwSys("NULL");
		}


		/******************** plandefinitionactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangehigh = plandefinitionactiontimingrange.getHigh();

		/******************** PlnDfn_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasValue()) {

			p.addPlnDfnActnTmgRngHiVl(String.valueOf(plandefinitionactiontimingrangehigh.getValue()));
		} else {
			p.addPlnDfnActnTmgRngHiVl("NULL");
		}


		/******************** plandefinitionactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingrangehighcomparator = plandefinitionactiontimingrangehigh.getComparator();
		if(plandefinitionactiontimingrangehighcomparator!=null) {
			p.addPlnDfnActnTmgRngHiCmprtr(plandefinitionactiontimingrangehighcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgRngHiCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasCode()) {

			p.addPlnDfnActnTmgRngHiCd(String.valueOf(plandefinitionactiontimingrangehigh.getCode()));
		} else {
			p.addPlnDfnActnTmgRngHiCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasUnit()) {

			p.addPlnDfnActnTmgRngHiUnt(String.valueOf(plandefinitionactiontimingrangehigh.getUnit()));
		} else {
			p.addPlnDfnActnTmgRngHiUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasSystem()) {

			p.addPlnDfnActnTmgRngHiSys(String.valueOf(plandefinitionactiontimingrangehigh.getSystem()));
		} else {
			p.addPlnDfnActnTmgRngHiSys("NULL");
		}


		/******************** PlnDfn_Actn_SbjctRfrnc ********************************************************************************/
		if(plandefinitionaction.hasSubjectReference()) {

			if(plandefinitionaction.getSubjectReference().getReference() != null) {
			p.addPlnDfnActnSbjctRfrnc(plandefinitionaction.getSubjectReference().getReference());
			}
		} else {
			p.addPlnDfnActnSbjctRfrnc("NULL");
		}


		/******************** plandefinitionactionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionsubjectcodeableconcept = plandefinitionaction.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconcept.hasText()) {

			p.addPlnDfnActnSbjctCdbleCncptTxt(String.valueOf(plandefinitionactionsubjectcodeableconcept.getText()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptTxt("NULL");
		}


		/******************** plandefinitionactionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactionsubjectcodeableconceptcodinglist = plandefinitionactionsubjectcodeableconcept.getCoding();
		for(int plandefinitionactionsubjectcodeableconceptcodingi = 0; plandefinitionactionsubjectcodeableconceptcodingi<plandefinitionactionsubjectcodeableconceptcodinglist.size();plandefinitionactionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactionsubjectcodeableconceptcoding = plandefinitionactionsubjectcodeableconceptcodinglist.get(plandefinitionactionsubjectcodeableconceptcodingi);

		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnSbjctCdbleCncptCdgDsply("[[");}
		if(plandefinitionactionsubjectcodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnActnSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionactionsubjectcodeableconceptcodingi == plandefinitionactionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnSbjctCdbleCncptCdgDsply("]]");}


		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnSbjctCdbleCncptCdgVrsn("[[");}
		if(plandefinitionactionsubjectcodeableconceptcoding.hasVersion()) {

			p.addPlnDfnActnSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionactionsubjectcodeableconceptcodingi == plandefinitionactionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnSbjctCdbleCncptCdgVrsn("]]");}


		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnSbjctCdbleCncptCdgCd("[[");}
		if(plandefinitionactionsubjectcodeableconceptcoding.hasCode()) {

			p.addPlnDfnActnSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionactionsubjectcodeableconceptcodingi == plandefinitionactionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnSbjctCdbleCncptCdgCd("]]");}


		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnSbjctCdbleCncptCdgUsrSltd("[[");}
		if(plandefinitionactionsubjectcodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnActnSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionactionsubjectcodeableconceptcodingi == plandefinitionactionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnSbjctCdbleCncptCdgUsrSltd("]]");}


		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnSbjctCdbleCncptCdgSys("[[");}
		if(plandefinitionactionsubjectcodeableconceptcoding.hasSystem()) {

			p.addPlnDfnActnSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnActnSbjctCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionactionsubjectcodeableconceptcodingi == plandefinitionactionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnSbjctCdbleCncptCdgSys("]]");}


		 };
		/******************** PlnDfn_Actn_GoalId ********************************************************************************/
		if(plandefinitionaction.hasGoalId()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionaction.getGoalId().size(); incr++) {
				array = array + plandefinitionaction.getGoalId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnGoalId(array);

		} else {
			p.addPlnDfnActnGoalId("NULL");
		}


		/******************** PlnDfn_Actn_Ttl ********************************************************************************/
		if(plandefinitionaction.hasTitle()) {

			p.addPlnDfnActnTtl(String.valueOf(plandefinitionaction.getTitle()));
		} else {
			p.addPlnDfnActnTtl("NULL");
		}


		/******************** plandefinitionactioncondition ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent> plandefinitionactionconditionlist = plandefinitionaction.getCondition();
		for(int plandefinitionactionconditioni = 0; plandefinitionactionconditioni<plandefinitionactionconditionlist.size();plandefinitionactionconditioni++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent  plandefinitionactioncondition = plandefinitionactionconditionlist.get(plandefinitionactionconditioni);

		/******************** plandefinitionactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactionconditionexpression = plandefinitionactioncondition.getExpression();

		/******************** PlnDfn_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(plandefinitionactionconditioni == 0) {p.addPlnDfnActnCndtnExprsnNm("[[");}
		if(plandefinitionactionconditionexpression.hasName()) {

			p.addPlnDfnActnCndtnExprsnNm(String.valueOf(plandefinitionactionconditionexpression.getName()));
		} else {
			p.addPlnDfnActnCndtnExprsnNm("NULL");
		}

		if(plandefinitionactionconditioni == plandefinitionactionconditionlist.size()-1) {p.addPlnDfnActnCndtnExprsnNm("]]");}


		/******************** PlnDfn_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(plandefinitionactionconditioni == 0) {p.addPlnDfnActnCndtnExprsnRfrnc("[[");}
		if(plandefinitionactionconditionexpression.hasReference()) {

			p.addPlnDfnActnCndtnExprsnRfrnc(String.valueOf(plandefinitionactionconditionexpression.getReference()));
		} else {
			p.addPlnDfnActnCndtnExprsnRfrnc("NULL");
		}

		if(plandefinitionactionconditioni == plandefinitionactionconditionlist.size()-1) {p.addPlnDfnActnCndtnExprsnRfrnc("]]");}


		/******************** PlnDfn_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(plandefinitionactionconditioni == 0) {p.addPlnDfnActnCndtnExprsnLnguage("[[");}
		if(plandefinitionactionconditionexpression.hasLanguage()) {

			p.addPlnDfnActnCndtnExprsnLnguage(String.valueOf(plandefinitionactionconditionexpression.getLanguage()));
		} else {
			p.addPlnDfnActnCndtnExprsnLnguage("NULL");
		}

		if(plandefinitionactionconditioni == plandefinitionactionconditionlist.size()-1) {p.addPlnDfnActnCndtnExprsnLnguage("]]");}


		/******************** PlnDfn_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(plandefinitionactionconditioni == 0) {p.addPlnDfnActnCndtnExprsnDscrptn("[[");}
		if(plandefinitionactionconditionexpression.hasDescription()) {

			p.addPlnDfnActnCndtnExprsnDscrptn(String.valueOf(plandefinitionactionconditionexpression.getDescription()));
		} else {
			p.addPlnDfnActnCndtnExprsnDscrptn("NULL");
		}

		if(plandefinitionactionconditioni == plandefinitionactionconditionlist.size()-1) {p.addPlnDfnActnCndtnExprsnDscrptn("]]");}


		/******************** plandefinitionactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKind plandefinitionactionconditionkind = plandefinitionactioncondition.getKind();
		if(plandefinitionactionconditionkind!=null) {
		if(plandefinitionactionconditioni == 0) {

		p.addPlnDfnActnCndtnKind("[[");		}
			p.addPlnDfnActnCndtnKind(plandefinitionactionconditionkind.toCode());
		if(plandefinitionactionconditioni == plandefinitionactionconditionlist.size()-1) {

		p.addPlnDfnActnCndtnKind("]]");		}

		} else {
			p.addPlnDfnActnCndtnKind("NULL");
		}

		 };
		/******************** plandefinitionactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontimingtiming = plandefinitionaction.getTimingTiming();

		/******************** plandefinitionactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontimingtimingcode = plandefinitionactiontimingtiming.getCode();

		/******************** PlnDfn_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(plandefinitionactiontimingtimingcode.hasText()) {

			p.addPlnDfnActnTmgTmgCdTxt(String.valueOf(plandefinitionactiontimingtimingcode.getText()));
		} else {
			p.addPlnDfnActnTmgTmgCdTxt("NULL");
		}


		/******************** plandefinitionactiontimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactiontimingtimingcodecodinglist = plandefinitionactiontimingtimingcode.getCoding();
		for(int plandefinitionactiontimingtimingcodecodingi = 0; plandefinitionactiontimingtimingcodecodingi<plandefinitionactiontimingtimingcodecodinglist.size();plandefinitionactiontimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactiontimingtimingcodecoding = plandefinitionactiontimingtimingcodecodinglist.get(plandefinitionactiontimingtimingcodecodingi);

		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecodingi == 0) {p.addPlnDfnActnTmgTmgCdCdgDsply("[[");}
		if(plandefinitionactiontimingtimingcodecoding.hasDisplay()) {

			p.addPlnDfnActnTmgTmgCdCdgDsply(String.valueOf(plandefinitionactiontimingtimingcodecoding.getDisplay()));
		} else {
			p.addPlnDfnActnTmgTmgCdCdgDsply("NULL");
		}

		if(plandefinitionactiontimingtimingcodecodingi == plandefinitionactiontimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTmgTmgCdCdgDsply("]]");}


		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecodingi == 0) {p.addPlnDfnActnTmgTmgCdCdgVrsn("[[");}
		if(plandefinitionactiontimingtimingcodecoding.hasVersion()) {

			p.addPlnDfnActnTmgTmgCdCdgVrsn(String.valueOf(plandefinitionactiontimingtimingcodecoding.getVersion()));
		} else {
			p.addPlnDfnActnTmgTmgCdCdgVrsn("NULL");
		}

		if(plandefinitionactiontimingtimingcodecodingi == plandefinitionactiontimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTmgTmgCdCdgVrsn("]]");}


		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecodingi == 0) {p.addPlnDfnActnTmgTmgCdCdgCd("[[");}
		if(plandefinitionactiontimingtimingcodecoding.hasCode()) {

			p.addPlnDfnActnTmgTmgCdCdgCd(String.valueOf(plandefinitionactiontimingtimingcodecoding.getCode()));
		} else {
			p.addPlnDfnActnTmgTmgCdCdgCd("NULL");
		}

		if(plandefinitionactiontimingtimingcodecodingi == plandefinitionactiontimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTmgTmgCdCdgCd("]]");}


		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecodingi == 0) {p.addPlnDfnActnTmgTmgCdCdgUsrSltd("[[");}
		if(plandefinitionactiontimingtimingcodecoding.hasUserSelected()) {

			p.addPlnDfnActnTmgTmgCdCdgUsrSltd(String.valueOf(plandefinitionactiontimingtimingcodecoding.getUserSelected()));
		} else {
			p.addPlnDfnActnTmgTmgCdCdgUsrSltd("NULL");
		}

		if(plandefinitionactiontimingtimingcodecodingi == plandefinitionactiontimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTmgTmgCdCdgUsrSltd("]]");}


		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecodingi == 0) {p.addPlnDfnActnTmgTmgCdCdgSys("[[");}
		if(plandefinitionactiontimingtimingcodecoding.hasSystem()) {

			p.addPlnDfnActnTmgTmgCdCdgSys(String.valueOf(plandefinitionactiontimingtimingcodecoding.getSystem()));
		} else {
			p.addPlnDfnActnTmgTmgCdCdgSys("NULL");
		}

		if(plandefinitionactiontimingtimingcodecodingi == plandefinitionactiontimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTmgTmgCdCdgSys("]]");}


		 };
		/******************** PlnDfn_Actn_TmgTmg_Evnt ********************************************************************************/
		if(plandefinitionactiontimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontimingtiming.getEvent().size(); incr++) {
				array = array + plandefinitionactiontimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTmgTmgEvnt(array);

		} else {
			p.addPlnDfnActnTmgTmgEvnt("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontimingtimingrepeat = plandefinitionactiontimingtiming.getRepeat();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasOffset()) {

			p.addPlnDfnActnTmgTmgRptOff(String.valueOf(plandefinitionactiontimingtimingrepeat.getOffset()));
		} else {
			p.addPlnDfnActnTmgTmgRptOff("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasCount()) {

			p.addPlnDfnActnTmgTmgRptCnt(String.valueOf(plandefinitionactiontimingtimingrepeat.getCount()));
		} else {
			p.addPlnDfnActnTmgTmgRptCnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasPeriod()) {

			p.addPlnDfnActnTmgTmgRptPrd(String.valueOf(plandefinitionactiontimingtimingrepeat.getPeriod()));
		} else {
			p.addPlnDfnActnTmgTmgRptPrd("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasCountMax()) {

			p.addPlnDfnActnTmgTmgRptCntMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getCountMax()));
		} else {
			p.addPlnDfnActnTmgTmgRptCntMx("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasDurationMax()) {

			p.addPlnDfnActnTmgTmgRptDurationMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getDurationMax()));
		} else {
			p.addPlnDfnActnTmgTmgRptDurationMx("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingtimingrepeatboundsperiod = plandefinitionactiontimingtimingrepeat.getBoundsPeriod();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsperiod.hasStart()) {

			p.addPlnDfnActnTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsperiod.hasEnd()) {

			p.addPlnDfnActnTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontimingtimingrepeatdurationunit = plandefinitionactiontimingtimingrepeat.getDurationUnit();
		if(plandefinitionactiontimingtimingrepeatdurationunit!=null) {
			p.addPlnDfnActnTmgTmgRptDurationUnt(plandefinitionactiontimingtimingrepeatdurationunit.toCode());
		} else {
			p.addPlnDfnActnTmgTmgRptDurationUnt("NULL");
		}

		/******************** plandefinitionactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingtimingrepeatboundsduration = plandefinitionactiontimingtimingrepeat.getBoundsDuration();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasValue()) {

			p.addPlnDfnActnTmgTmgRptBndsDurationVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getValue()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsdurationcomparator = plandefinitionactiontimingtimingrepeatboundsduration.getComparator();
		if(plandefinitionactiontimingtimingrepeatboundsdurationcomparator!=null) {
			p.addPlnDfnActnTmgTmgRptBndsDurationCmprtr(plandefinitionactiontimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasCode()) {

			p.addPlnDfnActnTmgTmgRptBndsDurationCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getCode()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasUnit()) {

			p.addPlnDfnActnTmgTmgRptBndsDurationUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getUnit()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasSystem()) {

			p.addPlnDfnActnTmgTmgRptBndsDurationSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getSystem()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingtimingrepeatboundsrange = plandefinitionactiontimingtimingrepeat.getBoundsRange();

		/******************** plandefinitionactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangelow = plandefinitionactiontimingtimingrepeatboundsrange.getLow();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasValue()) {

			p.addPlnDfnActnTmgTmgRptBndsRngLwVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getValue()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsrangelowcomparator = plandefinitionactiontimingtimingrepeatboundsrangelow.getComparator();
		if(plandefinitionactiontimingtimingrepeatboundsrangelowcomparator!=null) {
			p.addPlnDfnActnTmgTmgRptBndsRngLwCmprtr(plandefinitionactiontimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasCode()) {

			p.addPlnDfnActnTmgTmgRptBndsRngLwCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getCode()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasUnit()) {

			p.addPlnDfnActnTmgTmgRptBndsRngLwUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasSystem()) {

			p.addPlnDfnActnTmgTmgRptBndsRngLwSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangehigh = plandefinitionactiontimingtimingrepeatboundsrange.getHigh();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasValue()) {

			p.addPlnDfnActnTmgTmgRptBndsRngHiVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsrangehighcomparator = plandefinitionactiontimingtimingrepeatboundsrangehigh.getComparator();
		if(plandefinitionactiontimingtimingrepeatboundsrangehighcomparator!=null) {
			p.addPlnDfnActnTmgTmgRptBndsRngHiCmprtr(plandefinitionactiontimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasCode()) {

			p.addPlnDfnActnTmgTmgRptBndsRngHiCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasUnit()) {

			p.addPlnDfnActnTmgTmgRptBndsRngHiUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasSystem()) {

			p.addPlnDfnActnTmgTmgRptBndsRngHiSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			p.addPlnDfnActnTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasFrequencyMax()) {

			p.addPlnDfnActnTmgTmgRptFrqncyMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getFrequencyMax()));
		} else {
			p.addPlnDfnActnTmgTmgRptFrqncyMx("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> plandefinitionactiontimingtimingrepeatwhenlist = plandefinitionactiontimingtimingrepeat.getWhen();
		for(int plandefinitionactiontimingtimingrepeatwheni = 0; plandefinitionactiontimingtimingrepeatwheni<plandefinitionactiontimingtimingrepeatwhenlist.size();plandefinitionactiontimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  plandefinitionactiontimingtimingrepeatwhen = plandefinitionactiontimingtimingrepeatwhenlist.get(plandefinitionactiontimingtimingrepeatwheni);
		if(plandefinitionactiontimingtimingrepeatwhen!=null) {
			p.addPlnDfnActnTmgTmgRptWhen(plandefinitionactiontimingtimingrepeatwhen.getCode());
		} else {
			p.addPlnDfnActnTmgTmgRptWhen("NULL");
		}
		 };

		/******************** plandefinitionactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontimingtimingrepeatperiodunit = plandefinitionactiontimingtimingrepeat.getPeriodUnit();
		if(plandefinitionactiontimingtimingrepeatperiodunit!=null) {
			p.addPlnDfnActnTmgTmgRptPrdUnt(plandefinitionactiontimingtimingrepeatperiodunit.toCode());
		} else {
			p.addPlnDfnActnTmgTmgRptPrdUnt("NULL");
		}

		/******************** PlnDfn_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasPeriodMax()) {

			p.addPlnDfnActnTmgTmgRptPrdMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getPeriodMax()));
		} else {
			p.addPlnDfnActnTmgTmgRptPrdMx("NULL");
		}


		/******************** plandefinitionactiontimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> plandefinitionactiontimingtimingrepeatdayofweeklist = plandefinitionactiontimingtimingrepeat.getDayOfWeek();
		for(int plandefinitionactiontimingtimingrepeatdayofweeki = 0; plandefinitionactiontimingtimingrepeatdayofweeki<plandefinitionactiontimingtimingrepeatdayofweeklist.size();plandefinitionactiontimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  plandefinitionactiontimingtimingrepeatdayofweek = plandefinitionactiontimingtimingrepeatdayofweeklist.get(plandefinitionactiontimingtimingrepeatdayofweeki);
		if(plandefinitionactiontimingtimingrepeatdayofweek!=null) {
			p.addPlnDfnActnTmgTmgRptDayOfWeek(plandefinitionactiontimingtimingrepeatdayofweek.getCode());
		} else {
			p.addPlnDfnActnTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** PlnDfn_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + plandefinitionactiontimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTmgTmgRptTimeOfDay(array);

		} else {
			p.addPlnDfnActnTmgTmgRptTimeOfDay("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasDuration()) {

			p.addPlnDfnActnTmgTmgRptDuration(String.valueOf(plandefinitionactiontimingtimingrepeat.getDuration()));
		} else {
			p.addPlnDfnActnTmgTmgRptDuration("NULL");
		}


		/******************** PlnDfn_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasFrequency()) {

			p.addPlnDfnActnTmgTmgRptFrqncy(String.valueOf(plandefinitionactiontimingtimingrepeat.getFrequency()));
		} else {
			p.addPlnDfnActnTmgTmgRptFrqncy("NULL");
		}


		/******************** plandefinitionactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingperiod = plandefinitionaction.getTimingPeriod();

		/******************** PlnDfn_Actn_TmgPrd_Strt ********************************************************************************/
		if(plandefinitionactiontimingperiod.hasStart()) {

			p.addPlnDfnActnTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontimingperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnTmgPrdStrt("NULL");
		}


		/******************** PlnDfn_Actn_TmgPrd_End ********************************************************************************/
		if(plandefinitionactiontimingperiod.hasEnd()) {

			p.addPlnDfnActnTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontimingperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnTmgPrdEnd("NULL");
		}


		/******************** plandefinitionactiondocumentation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> plandefinitionactiondocumentationlist = plandefinitionaction.getDocumentation();
		for(int plandefinitionactiondocumentationi = 0; plandefinitionactiondocumentationi<plandefinitionactiondocumentationlist.size();plandefinitionactiondocumentationi++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  plandefinitionactiondocumentation = plandefinitionactiondocumentationlist.get(plandefinitionactiondocumentationi);

		/******************** PlnDfn_Actn_Docation_Rsrc ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationRsrc("[[");}
		if(plandefinitionactiondocumentation.hasResource()) {

			p.addPlnDfnActnDocationRsrc(String.valueOf(plandefinitionactiondocumentation.getResource()));
		} else {
			p.addPlnDfnActnDocationRsrc("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationRsrc("]]");}


		/******************** plandefinitionactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitionactiondocumentationtype = plandefinitionactiondocumentation.getType();
		if(plandefinitionactiondocumentationtype!=null) {
		if(plandefinitionactiondocumentationi == 0) {

		p.addPlnDfnActnDocationTyp("[[");		}
			p.addPlnDfnActnDocationTyp(plandefinitionactiondocumentationtype.toCode());
		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {

		p.addPlnDfnActnDocationTyp("]]");		}

		} else {
			p.addPlnDfnActnDocationTyp("NULL");
		}

		/******************** PlnDfn_Actn_Docation_Url ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationUrl("[[");}
		if(plandefinitionactiondocumentation.hasUrl()) {

			p.addPlnDfnActnDocationUrl(String.valueOf(plandefinitionactiondocumentation.getUrl()));
		} else {
			p.addPlnDfnActnDocationUrl("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationUrl("]]");}


		/******************** PlnDfn_Actn_Docation_Citation ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationCitation("[[");}
		if(plandefinitionactiondocumentation.hasCitation()) {

			p.addPlnDfnActnDocationCitation(String.valueOf(plandefinitionactiondocumentation.getCitation()));
		} else {
			p.addPlnDfnActnDocationCitation("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationCitation("]]");}


		/******************** PlnDfn_Actn_Docation_Lbl ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationLbl("[[");}
		if(plandefinitionactiondocumentation.hasLabel()) {

			p.addPlnDfnActnDocationLbl(String.valueOf(plandefinitionactiondocumentation.getLabel()));
		} else {
			p.addPlnDfnActnDocationLbl("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationLbl("]]");}


		/******************** plandefinitionactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionactiondocumentationdocument = plandefinitionactiondocumentation.getDocument();

		/******************** PlnDfn_Actn_Docation_Doc_Sz ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocSz("[[");}
		if(plandefinitionactiondocumentationdocument.hasSize()) {

			p.addPlnDfnActnDocationDocSz(String.valueOf(plandefinitionactiondocumentationdocument.getSize()));
		} else {
			p.addPlnDfnActnDocationDocSz("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocSz("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocLnguage("[[");}
		if(plandefinitionactiondocumentationdocument.hasLanguage()) {

			p.addPlnDfnActnDocationDocLnguage(String.valueOf(plandefinitionactiondocumentationdocument.getLanguage()));
		} else {
			p.addPlnDfnActnDocationDocLnguage("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocLnguage("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocCntntTyp("[[");}
		if(plandefinitionactiondocumentationdocument.hasContentType()) {

			p.addPlnDfnActnDocationDocCntntTyp(String.valueOf(plandefinitionactiondocumentationdocument.getContentType()));
		} else {
			p.addPlnDfnActnDocationDocCntntTyp("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocCntntTyp("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Hash ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocHash("[[");}
		if(plandefinitionactiondocumentationdocument.hasHash()) {

			p.addPlnDfnActnDocationDocHash(new String(plandefinitionactiondocumentationdocument.getHash()));
		} else {
			p.addPlnDfnActnDocationDocHash("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocHash("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Data ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocData("[[");}
		if(plandefinitionactiondocumentationdocument.hasData()) {

			p.addPlnDfnActnDocationDocData(new String(plandefinitionactiondocumentationdocument.getData()));
		} else {
			p.addPlnDfnActnDocationDocData("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocData("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Creation ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocCreation("[[");}
		if(plandefinitionactiondocumentationdocument.hasCreation()) {

			p.addPlnDfnActnDocationDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiondocumentationdocument.getCreation())+"\"");
		} else {
			p.addPlnDfnActnDocationDocCreation("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocCreation("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocTtl("[[");}
		if(plandefinitionactiondocumentationdocument.hasTitle()) {

			p.addPlnDfnActnDocationDocTtl(String.valueOf(plandefinitionactiondocumentationdocument.getTitle()));
		} else {
			p.addPlnDfnActnDocationDocTtl("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocTtl("]]");}


		/******************** PlnDfn_Actn_Docation_Doc_Url ********************************************************************************/
		if(plandefinitionactiondocumentationi == 0) {p.addPlnDfnActnDocationDocUrl("[[");}
		if(plandefinitionactiondocumentationdocument.hasUrl()) {

			p.addPlnDfnActnDocationDocUrl(String.valueOf(plandefinitionactiondocumentationdocument.getUrl()));
		} else {
			p.addPlnDfnActnDocationDocUrl("NULL");
		}

		if(plandefinitionactiondocumentationi == plandefinitionactiondocumentationlist.size()-1) {p.addPlnDfnActnDocationDocUrl("]]");}


		 };
		/******************** plandefinitionactionrelatedaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent> plandefinitionactionrelatedactionlist = plandefinitionaction.getRelatedAction();
		for(int plandefinitionactionrelatedactioni = 0; plandefinitionactionrelatedactioni<plandefinitionactionrelatedactionlist.size();plandefinitionactionrelatedactioni++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent  plandefinitionactionrelatedaction = plandefinitionactionrelatedactionlist.get(plandefinitionactionrelatedactioni);

		/******************** plandefinitionactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipType plandefinitionactionrelatedactionrelationship = plandefinitionactionrelatedaction.getRelationship();
		if(plandefinitionactionrelatedactionrelationship!=null) {
		if(plandefinitionactionrelatedactioni == 0) {

		p.addPlnDfnActnRltedActnRltnship("[[");		}
			p.addPlnDfnActnRltedActnRltnship(plandefinitionactionrelatedactionrelationship.toCode());
		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {

		p.addPlnDfnActnRltedActnRltnship("]]");		}

		} else {
			p.addPlnDfnActnRltedActnRltnship("NULL");
		}

		/******************** PlnDfn_Actn_RltedActn_ActnId ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnActnId("[[");}
		if(plandefinitionactionrelatedaction.hasActionId()) {

			p.addPlnDfnActnRltedActnActnId(String.valueOf(plandefinitionactionrelatedaction.getActionId()));
		} else {
			p.addPlnDfnActnRltedActnActnId("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnActnId("]]");}


		/******************** plandefinitionactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionrelatedactionoffduration = plandefinitionactionrelatedaction.getOffsetDuration();

		/******************** PlnDfn_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffDurationVl("[[");}
		if(plandefinitionactionrelatedactionoffduration.hasValue()) {

			p.addPlnDfnActnRltedActnOffDurationVl(String.valueOf(plandefinitionactionrelatedactionoffduration.getValue()));
		} else {
			p.addPlnDfnActnRltedActnOffDurationVl("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffDurationVl("]]");}


		/******************** plandefinitionactionrelatedactionoffdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffdurationcomparator = plandefinitionactionrelatedactionoffduration.getComparator();
		if(plandefinitionactionrelatedactionoffdurationcomparator!=null) {
		if(plandefinitionactionrelatedactioni == 0) {

		p.addPlnDfnActnRltedActnOffDurationCmprtr("[[");		}
			p.addPlnDfnActnRltedActnOffDurationCmprtr(plandefinitionactionrelatedactionoffdurationcomparator.toCode());
		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {

		p.addPlnDfnActnRltedActnOffDurationCmprtr("]]");		}

		} else {
			p.addPlnDfnActnRltedActnOffDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffDurationCd("[[");}
		if(plandefinitionactionrelatedactionoffduration.hasCode()) {

			p.addPlnDfnActnRltedActnOffDurationCd(String.valueOf(plandefinitionactionrelatedactionoffduration.getCode()));
		} else {
			p.addPlnDfnActnRltedActnOffDurationCd("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffDurationCd("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffDurationUnt("[[");}
		if(plandefinitionactionrelatedactionoffduration.hasUnit()) {

			p.addPlnDfnActnRltedActnOffDurationUnt(String.valueOf(plandefinitionactionrelatedactionoffduration.getUnit()));
		} else {
			p.addPlnDfnActnRltedActnOffDurationUnt("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffDurationUnt("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffDurationSys("[[");}
		if(plandefinitionactionrelatedactionoffduration.hasSystem()) {

			p.addPlnDfnActnRltedActnOffDurationSys(String.valueOf(plandefinitionactionrelatedactionoffduration.getSystem()));
		} else {
			p.addPlnDfnActnRltedActnOffDurationSys("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffDurationSys("]]");}


		/******************** plandefinitionactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactionrelatedactionoffrange = plandefinitionactionrelatedaction.getOffsetRange();

		/******************** plandefinitionactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangelow = plandefinitionactionrelatedactionoffrange.getLow();

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngLwVl("[[");}
		if(plandefinitionactionrelatedactionoffrangelow.hasValue()) {

			p.addPlnDfnActnRltedActnOffRngLwVl(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getValue()));
		} else {
			p.addPlnDfnActnRltedActnOffRngLwVl("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngLwVl("]]");}


		/******************** plandefinitionactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffrangelowcomparator = plandefinitionactionrelatedactionoffrangelow.getComparator();
		if(plandefinitionactionrelatedactionoffrangelowcomparator!=null) {
		if(plandefinitionactionrelatedactioni == 0) {

		p.addPlnDfnActnRltedActnOffRngLwCmprtr("[[");		}
			p.addPlnDfnActnRltedActnOffRngLwCmprtr(plandefinitionactionrelatedactionoffrangelowcomparator.toCode());
		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {

		p.addPlnDfnActnRltedActnOffRngLwCmprtr("]]");		}

		} else {
			p.addPlnDfnActnRltedActnOffRngLwCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngLwCd("[[");}
		if(plandefinitionactionrelatedactionoffrangelow.hasCode()) {

			p.addPlnDfnActnRltedActnOffRngLwCd(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getCode()));
		} else {
			p.addPlnDfnActnRltedActnOffRngLwCd("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngLwCd("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngLwUnt("[[");}
		if(plandefinitionactionrelatedactionoffrangelow.hasUnit()) {

			p.addPlnDfnActnRltedActnOffRngLwUnt(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getUnit()));
		} else {
			p.addPlnDfnActnRltedActnOffRngLwUnt("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngLwUnt("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngLwSys("[[");}
		if(plandefinitionactionrelatedactionoffrangelow.hasSystem()) {

			p.addPlnDfnActnRltedActnOffRngLwSys(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getSystem()));
		} else {
			p.addPlnDfnActnRltedActnOffRngLwSys("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngLwSys("]]");}


		/******************** plandefinitionactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangehigh = plandefinitionactionrelatedactionoffrange.getHigh();

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngHiVl("[[");}
		if(plandefinitionactionrelatedactionoffrangehigh.hasValue()) {

			p.addPlnDfnActnRltedActnOffRngHiVl(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getValue()));
		} else {
			p.addPlnDfnActnRltedActnOffRngHiVl("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngHiVl("]]");}


		/******************** plandefinitionactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffrangehighcomparator = plandefinitionactionrelatedactionoffrangehigh.getComparator();
		if(plandefinitionactionrelatedactionoffrangehighcomparator!=null) {
		if(plandefinitionactionrelatedactioni == 0) {

		p.addPlnDfnActnRltedActnOffRngHiCmprtr("[[");		}
			p.addPlnDfnActnRltedActnOffRngHiCmprtr(plandefinitionactionrelatedactionoffrangehighcomparator.toCode());
		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {

		p.addPlnDfnActnRltedActnOffRngHiCmprtr("]]");		}

		} else {
			p.addPlnDfnActnRltedActnOffRngHiCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngHiCd("[[");}
		if(plandefinitionactionrelatedactionoffrangehigh.hasCode()) {

			p.addPlnDfnActnRltedActnOffRngHiCd(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getCode()));
		} else {
			p.addPlnDfnActnRltedActnOffRngHiCd("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngHiCd("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngHiUnt("[[");}
		if(plandefinitionactionrelatedactionoffrangehigh.hasUnit()) {

			p.addPlnDfnActnRltedActnOffRngHiUnt(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getUnit()));
		} else {
			p.addPlnDfnActnRltedActnOffRngHiUnt("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngHiUnt("]]");}


		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactioni == 0) {p.addPlnDfnActnRltedActnOffRngHiSys("[[");}
		if(plandefinitionactionrelatedactionoffrangehigh.hasSystem()) {

			p.addPlnDfnActnRltedActnOffRngHiSys(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getSystem()));
		} else {
			p.addPlnDfnActnRltedActnOffRngHiSys("NULL");
		}

		if(plandefinitionactionrelatedactioni == plandefinitionactionrelatedactionlist.size()-1) {p.addPlnDfnActnRltedActnOffRngHiSys("]]");}


		 };
		/******************** PlnDfn_Actn_Prefix ********************************************************************************/
		if(plandefinitionaction.hasPrefix()) {

			p.addPlnDfnActnPrefix(String.valueOf(plandefinitionaction.getPrefix()));
		} else {
			p.addPlnDfnActnPrefix("NULL");
		}


		/******************** PlnDfn_Actn_TxtEquivalent ********************************************************************************/
		if(plandefinitionaction.hasTextEquivalent()) {

			p.addPlnDfnActnTxtEquivalent(String.valueOf(plandefinitionaction.getTextEquivalent()));
		} else {
			p.addPlnDfnActnTxtEquivalent("NULL");
		}


		/******************** plandefinitionactiontrigger ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TriggerDefinition> plandefinitionactiontriggerlist = plandefinitionaction.getTrigger();
		for(int plandefinitionactiontriggeri = 0; plandefinitionactiontriggeri<plandefinitionactiontriggerlist.size();plandefinitionactiontriggeri++ ) {
		org.hl7.fhir.r4.model.TriggerDefinition  plandefinitionactiontrigger = plandefinitionactiontriggerlist.get(plandefinitionactiontriggeri);

		/******************** PlnDfn_Actn_Trgr_Nm ********************************************************************************/
		if(plandefinitionactiontriggeri == 0) {p.addPlnDfnActnTrgrNm("[[");}
		if(plandefinitionactiontrigger.hasName()) {

			p.addPlnDfnActnTrgrNm(String.valueOf(plandefinitionactiontrigger.getName()));
		} else {
			p.addPlnDfnActnTrgrNm("NULL");
		}

		if(plandefinitionactiontriggeri == plandefinitionactiontriggerlist.size()-1) {p.addPlnDfnActnTrgrNm("]]");}


		/******************** plandefinitionactiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType plandefinitionactiontriggertype = plandefinitionactiontrigger.getType();
		if(plandefinitionactiontriggertype!=null) {
		if(plandefinitionactiontriggeri == 0) {

		p.addPlnDfnActnTrgrTyp("[[");		}
			p.addPlnDfnActnTrgrTyp(plandefinitionactiontriggertype.toCode());
		if(plandefinitionactiontriggeri == plandefinitionactiontriggerlist.size()-1) {

		p.addPlnDfnActnTrgrTyp("]]");		}

		} else {
			p.addPlnDfnActnTrgrTyp("NULL");
		}

		/******************** plandefinitionactiontriggerdata ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> plandefinitionactiontriggerdatalist = plandefinitionactiontrigger.getData();
		for(int plandefinitionactiontriggerdatai = 0; plandefinitionactiontriggerdatai<plandefinitionactiontriggerdatalist.size();plandefinitionactiontriggerdatai++ ) {
		org.hl7.fhir.r4.model.DataRequirement  plandefinitionactiontriggerdata = plandefinitionactiontriggerdatalist.get(plandefinitionactiontriggerdatai);

		/******************** PlnDfn_Actn_Trgr_Data_Typ ********************************************************************************/
		if(plandefinitionactiontriggerdatai == 0) {p.addPlnDfnActnTrgrDataTyp("[[[");}
		if(plandefinitionactiontriggerdata.hasType()) {

			p.addPlnDfnActnTrgrDataTyp(String.valueOf(plandefinitionactiontriggerdata.getType()));
		} else {
			p.addPlnDfnActnTrgrDataTyp("NULL");
		}

		if(plandefinitionactiontriggerdatai == plandefinitionactiontriggerdatalist.size()-1) {p.addPlnDfnActnTrgrDataTyp("]]]");}


		/******************** plandefinitionactiontriggerdatasort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> plandefinitionactiontriggerdatasortlist = plandefinitionactiontriggerdata.getSort();
		for(int plandefinitionactiontriggerdatasorti = 0; plandefinitionactiontriggerdatasorti<plandefinitionactiontriggerdatasortlist.size();plandefinitionactiontriggerdatasorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  plandefinitionactiontriggerdatasort = plandefinitionactiontriggerdatasortlist.get(plandefinitionactiontriggerdatasorti);

		/******************** PlnDfn_Actn_Trgr_Data_Sort_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatasorti == 0) {p.addPlnDfnActnTrgrDataSortPath("[[[[");}
		if(plandefinitionactiontriggerdatasort.hasPath()) {

			p.addPlnDfnActnTrgrDataSortPath(String.valueOf(plandefinitionactiontriggerdatasort.getPath()));
		} else {
			p.addPlnDfnActnTrgrDataSortPath("NULL");
		}

		if(plandefinitionactiontriggerdatasorti == plandefinitionactiontriggerdatasortlist.size()-1) {p.addPlnDfnActnTrgrDataSortPath("]]]]");}


		/******************** plandefinitionactiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactiontriggerdatasortdirection = plandefinitionactiontriggerdatasort.getDirection();
		if(plandefinitionactiontriggerdatasortdirection!=null) {
		if(plandefinitionactiontriggerdatasorti == 0) {

		p.addPlnDfnActnTrgrDataSortDirection("[[[[");		}
			p.addPlnDfnActnTrgrDataSortDirection(plandefinitionactiontriggerdatasortdirection.toCode());
		if(plandefinitionactiontriggerdatasorti == plandefinitionactiontriggerdatasortlist.size()-1) {

		p.addPlnDfnActnTrgrDataSortDirection("]]]]");		}

		} else {
			p.addPlnDfnActnTrgrDataSortDirection("NULL");
		}

		 };
		/******************** PlnDfn_Actn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasSubjectReference()) {

			if(plandefinitionactiontriggerdata.getSubjectReference().getReference() != null) {
			p.addPlnDfnActnTrgrDataSbjctRfrnc(plandefinitionactiontriggerdata.getSubjectReference().getReference());
			}
		} else {
			p.addPlnDfnActnTrgrDataSbjctRfrnc("NULL");
		}


		/******************** plandefinitionactiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggerdatasubjectcodeableconcept = plandefinitionactiontriggerdata.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconcept.hasText()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptTxt(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconcept.getText()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptTxt("NULL");
		}


		/******************** plandefinitionactiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist = plandefinitionactiontriggerdatasubjectcodeableconcept.getCoding();
		for(int plandefinitionactiontriggerdatasubjectcodeableconceptcodingi = 0; plandefinitionactiontriggerdatasubjectcodeableconceptcodingi<plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size();plandefinitionactiontriggerdatasubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactiontriggerdatasubjectcodeableconceptcoding = plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.get(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi);

		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply("[[[[");}
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn("[[[[");}
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasVersion()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd("[[[[");}
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasCode()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd("[[[[");}
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == 0) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys("[[[[");}
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasSystem()) {

			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionactiontriggerdatasubjectcodeableconceptcodingi == plandefinitionactiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys("]]]]");}


		 };
		/******************** PlnDfn_Actn_Trgr_Data_Profile ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontriggerdata.getProfile().size(); incr++) {
				array = array + plandefinitionactiontriggerdata.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTrgrDataProfile(array);

		} else {
			p.addPlnDfnActnTrgrDataProfile("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Data_MustSupport ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontriggerdata.getMustSupport().size(); incr++) {
				array = array + plandefinitionactiontriggerdata.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTrgrDataMustSupport(array);

		} else {
			p.addPlnDfnActnTrgrDataMustSupport("NULL");
		}


		/******************** plandefinitionactiontriggerdatacodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> plandefinitionactiontriggerdatacodefilterlist = plandefinitionactiontriggerdata.getCodeFilter();
		for(int plandefinitionactiontriggerdatacodefilteri = 0; plandefinitionactiontriggerdatacodefilteri<plandefinitionactiontriggerdatacodefilterlist.size();plandefinitionactiontriggerdatacodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  plandefinitionactiontriggerdatacodefilter = plandefinitionactiontriggerdatacodefilterlist.get(plandefinitionactiontriggerdatacodefilteri);

		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilteri == 0) {p.addPlnDfnActnTrgrDataCdFltrPath("[[[[");}
		if(plandefinitionactiontriggerdatacodefilter.hasPath()) {

			p.addPlnDfnActnTrgrDataCdFltrPath(String.valueOf(plandefinitionactiontriggerdatacodefilter.getPath()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrPath("NULL");
		}

		if(plandefinitionactiontriggerdatacodefilteri == plandefinitionactiontriggerdatacodefilterlist.size()-1) {p.addPlnDfnActnTrgrDataCdFltrPath("]]]]");}


		/******************** plandefinitionactiontriggerdatacodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactiontriggerdatacodefiltercodelist = plandefinitionactiontriggerdatacodefilter.getCode();
		for(int plandefinitionactiontriggerdatacodefiltercodei = 0; plandefinitionactiontriggerdatacodefiltercodei<plandefinitionactiontriggerdatacodefiltercodelist.size();plandefinitionactiontriggerdatacodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactiontriggerdatacodefiltercode = plandefinitionactiontriggerdatacodefiltercodelist.get(plandefinitionactiontriggerdatacodefiltercodei);

		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercodei == 0) {p.addPlnDfnActnTrgrDataCdFltrCdDsply("[[[[[");}
		if(plandefinitionactiontriggerdatacodefiltercode.hasDisplay()) {

			p.addPlnDfnActnTrgrDataCdFltrCdDsply(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getDisplay()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrCdDsply("NULL");
		}

		if(plandefinitionactiontriggerdatacodefiltercodei == plandefinitionactiontriggerdatacodefiltercodelist.size()-1) {p.addPlnDfnActnTrgrDataCdFltrCdDsply("]]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercodei == 0) {p.addPlnDfnActnTrgrDataCdFltrCdVrsn("[[[[[");}
		if(plandefinitionactiontriggerdatacodefiltercode.hasVersion()) {

			p.addPlnDfnActnTrgrDataCdFltrCdVrsn(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getVersion()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrCdVrsn("NULL");
		}

		if(plandefinitionactiontriggerdatacodefiltercodei == plandefinitionactiontriggerdatacodefiltercodelist.size()-1) {p.addPlnDfnActnTrgrDataCdFltrCdVrsn("]]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercodei == 0) {p.addPlnDfnActnTrgrDataCdFltrCdUsrSltd("[[[[[");}
		if(plandefinitionactiontriggerdatacodefiltercode.hasUserSelected()) {

			p.addPlnDfnActnTrgrDataCdFltrCdUsrSltd(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getUserSelected()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrCdUsrSltd("NULL");
		}

		if(plandefinitionactiontriggerdatacodefiltercodei == plandefinitionactiontriggerdatacodefiltercodelist.size()-1) {p.addPlnDfnActnTrgrDataCdFltrCdUsrSltd("]]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercodei == 0) {p.addPlnDfnActnTrgrDataCdFltrCdSys("[[[[[");}
		if(plandefinitionactiontriggerdatacodefiltercode.hasSystem()) {

			p.addPlnDfnActnTrgrDataCdFltrCdSys(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getSystem()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrCdSys("NULL");
		}

		if(plandefinitionactiontriggerdatacodefiltercodei == plandefinitionactiontriggerdatacodefiltercodelist.size()-1) {p.addPlnDfnActnTrgrDataCdFltrCdSys("]]]]]");}


		 };
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilter.hasSearchParam()) {

			p.addPlnDfnActnTrgrDataCdFltrSrchParam(String.valueOf(plandefinitionactiontriggerdatacodefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrSrchParam("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilter.hasValueSet()) {

			p.addPlnDfnActnTrgrDataCdFltrVlSt(String.valueOf(plandefinitionactiontriggerdatacodefilter.getValueSet()));
		} else {
			p.addPlnDfnActnTrgrDataCdFltrVlSt("NULL");
		}


		 };
		/******************** PlnDfn_Actn_Trgr_Data_Lmt ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasLimit()) {

			p.addPlnDfnActnTrgrDataLmt(String.valueOf(plandefinitionactiontriggerdata.getLimit()));
		} else {
			p.addPlnDfnActnTrgrDataLmt("NULL");
		}


		/******************** plandefinitionactiontriggerdatadatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> plandefinitionactiontriggerdatadatefilterlist = plandefinitionactiontriggerdata.getDateFilter();
		for(int plandefinitionactiontriggerdatadatefilteri = 0; plandefinitionactiontriggerdatadatefilteri<plandefinitionactiontriggerdatadatefilterlist.size();plandefinitionactiontriggerdatadatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  plandefinitionactiontriggerdatadatefilter = plandefinitionactiontriggerdatadatefilterlist.get(plandefinitionactiontriggerdatadatefilteri);

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrPath("[[[[");}
		if(plandefinitionactiontriggerdatadatefilter.hasPath()) {

			p.addPlnDfnActnTrgrDataDtFltrPath(String.valueOf(plandefinitionactiontriggerdatadatefilter.getPath()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrPath("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrPath("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrSrchParam("[[[[");}
		if(plandefinitionactiontriggerdatadatefilter.hasSearchParam()) {

			p.addPlnDfnActnTrgrDataDtFltrSrchParam(String.valueOf(plandefinitionactiontriggerdatadatefilter.getSearchParam()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrSrchParam("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrSrchParam("]]]]");}


		/******************** plandefinitionactiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggerdatadatefiltervalueduration = plandefinitionactiontriggerdatadatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlDurationVl("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasValue()) {

			p.addPlnDfnActnTrgrDataDtFltrVlDurationVl(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getValue()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDurationVl("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlDurationVl("]]]]");}


		/******************** plandefinitionactiontriggerdatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggerdatadatefiltervaluedurationcomparator = plandefinitionactiontriggerdatadatefiltervalueduration.getComparator();
		if(plandefinitionactiontriggerdatadatefiltervaluedurationcomparator!=null) {
		if(plandefinitionactiontriggerdatadatefilteri == 0) {

		p.addPlnDfnActnTrgrDataDtFltrVlDurationCmprtr("[[[[");		}
			p.addPlnDfnActnTrgrDataDtFltrVlDurationCmprtr(plandefinitionactiontriggerdatadatefiltervaluedurationcomparator.toCode());
		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {

		p.addPlnDfnActnTrgrDataDtFltrVlDurationCmprtr("]]]]");		}

		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlDurationCd("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasCode()) {

			p.addPlnDfnActnTrgrDataDtFltrVlDurationCd(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getCode()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDurationCd("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlDurationCd("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlDurationUnt("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasUnit()) {

			p.addPlnDfnActnTrgrDataDtFltrVlDurationUnt(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getUnit()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDurationUnt("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlDurationUnt("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlDurationSys("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasSystem()) {

			p.addPlnDfnActnTrgrDataDtFltrVlDurationSys(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getSystem()));
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDurationSys("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlDurationSys("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlDtTimeTyp("[[[[");}
		if(plandefinitionactiontriggerdatadatefilter.hasValueDateTimeType()) {

			p.addPlnDfnActnTrgrDataDtFltrVlDtTimeTyp("\""+plandefinitionactiontriggerdatadatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlDtTimeTyp("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlDtTimeTyp("]]]]");}


		/******************** plandefinitionactiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggerdatadatefiltervalueperiod = plandefinitionactiontriggerdatadatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlPrdStrt("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueperiod.hasStart()) {

			p.addPlnDfnActnTrgrDataDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontriggerdatadatefiltervalueperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlPrdStrt("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlPrdStrt("]]]]");}


		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilteri == 0) {p.addPlnDfnActnTrgrDataDtFltrVlPrdEnd("[[[[");}
		if(plandefinitionactiontriggerdatadatefiltervalueperiod.hasEnd()) {

			p.addPlnDfnActnTrgrDataDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontriggerdatadatefiltervalueperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnTrgrDataDtFltrVlPrdEnd("NULL");
		}

		if(plandefinitionactiontriggerdatadatefilteri == plandefinitionactiontriggerdatadatefilterlist.size()-1) {p.addPlnDfnActnTrgrDataDtFltrVlPrdEnd("]]]]");}


		 };
		 };
		/******************** PlnDfn_Actn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingDateTimeType()) {

			p.addPlnDfnActnTrgrTmgDtTimeTyp("\""+plandefinitionactiontrigger.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnTrgrTmgDtTimeTyp("NULL");
		}


		/******************** plandefinitionactiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiontriggercondition = plandefinitionactiontrigger.getCondition();

		/******************** PlnDfn_Actn_Trgr_Cndtn_Nm ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasName()) {

			p.addPlnDfnActnTrgrCndtnNm(String.valueOf(plandefinitionactiontriggercondition.getName()));
		} else {
			p.addPlnDfnActnTrgrCndtnNm("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasReference()) {

			p.addPlnDfnActnTrgrCndtnRfrnc(String.valueOf(plandefinitionactiontriggercondition.getReference()));
		} else {
			p.addPlnDfnActnTrgrCndtnRfrnc("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasLanguage()) {

			p.addPlnDfnActnTrgrCndtnLnguage(String.valueOf(plandefinitionactiontriggercondition.getLanguage()));
		} else {
			p.addPlnDfnActnTrgrCndtnLnguage("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasDescription()) {

			p.addPlnDfnActnTrgrCndtnDscrptn(String.valueOf(plandefinitionactiontriggercondition.getDescription()));
		} else {
			p.addPlnDfnActnTrgrCndtnDscrptn("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasExpression()) {

			p.addPlnDfnActnTrgrCndtnExprsn(String.valueOf(plandefinitionactiontriggercondition.getExpression()));
		} else {
			p.addPlnDfnActnTrgrCndtnExprsn("NULL");
		}


		/******************** plandefinitionactiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontriggertimingtiming = plandefinitionactiontrigger.getTimingTiming();

		/******************** plandefinitionactiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggertimingtimingcode = plandefinitionactiontriggertimingtiming.getCode();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcode.hasText()) {

			p.addPlnDfnActnTrgrTmgTmgCdTxt(String.valueOf(plandefinitionactiontriggertimingtimingcode.getText()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdTxt("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactiontriggertimingtimingcodecodinglist = plandefinitionactiontriggertimingtimingcode.getCoding();
		for(int plandefinitionactiontriggertimingtimingcodecodingi = 0; plandefinitionactiontriggertimingtimingcodecodingi<plandefinitionactiontriggertimingtimingcodecodinglist.size();plandefinitionactiontriggertimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactiontriggertimingtimingcodecoding = plandefinitionactiontriggertimingtimingcodecodinglist.get(plandefinitionactiontriggertimingtimingcodecodingi);

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecodingi == 0) {p.addPlnDfnActnTrgrTmgTmgCdCdgDsply("[[[");}
		if(plandefinitionactiontriggertimingtimingcodecoding.hasDisplay()) {

			p.addPlnDfnActnTrgrTmgTmgCdCdgDsply(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getDisplay()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdCdgDsply("NULL");
		}

		if(plandefinitionactiontriggertimingtimingcodecodingi == plandefinitionactiontriggertimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTrgrTmgTmgCdCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecodingi == 0) {p.addPlnDfnActnTrgrTmgTmgCdCdgVrsn("[[[");}
		if(plandefinitionactiontriggertimingtimingcodecoding.hasVersion()) {

			p.addPlnDfnActnTrgrTmgTmgCdCdgVrsn(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getVersion()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdCdgVrsn("NULL");
		}

		if(plandefinitionactiontriggertimingtimingcodecodingi == plandefinitionactiontriggertimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTrgrTmgTmgCdCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecodingi == 0) {p.addPlnDfnActnTrgrTmgTmgCdCdgCd("[[[");}
		if(plandefinitionactiontriggertimingtimingcodecoding.hasCode()) {

			p.addPlnDfnActnTrgrTmgTmgCdCdgCd(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getCode()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdCdgCd("NULL");
		}

		if(plandefinitionactiontriggertimingtimingcodecodingi == plandefinitionactiontriggertimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTrgrTmgTmgCdCdgCd("]]]");}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecodingi == 0) {p.addPlnDfnActnTrgrTmgTmgCdCdgUsrSltd("[[[");}
		if(plandefinitionactiontriggertimingtimingcodecoding.hasUserSelected()) {

			p.addPlnDfnActnTrgrTmgTmgCdCdgUsrSltd(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getUserSelected()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdCdgUsrSltd("NULL");
		}

		if(plandefinitionactiontriggertimingtimingcodecodingi == plandefinitionactiontriggertimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTrgrTmgTmgCdCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecodingi == 0) {p.addPlnDfnActnTrgrTmgTmgCdCdgSys("[[[");}
		if(plandefinitionactiontriggertimingtimingcodecoding.hasSystem()) {

			p.addPlnDfnActnTrgrTmgTmgCdCdgSys(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getSystem()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgCdCdgSys("NULL");
		}

		if(plandefinitionactiontriggertimingtimingcodecodingi == plandefinitionactiontriggertimingtimingcodecodinglist.size()-1) {p.addPlnDfnActnTrgrTmgTmgCdCdgSys("]]]");}


		 };
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(plandefinitionactiontriggertimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontriggertimingtiming.getEvent().size(); incr++) {
				array = array + plandefinitionactiontriggertimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTrgrTmgTmgEvnt(array);

		} else {
			p.addPlnDfnActnTrgrTmgTmgEvnt("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontriggertimingtimingrepeat = plandefinitionactiontriggertimingtiming.getRepeat();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasOffset()) {

			p.addPlnDfnActnTrgrTmgTmgRptOff(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getOffset()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptOff("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasCount()) {

			p.addPlnDfnActnTrgrTmgTmgRptCnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getCount()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptCnt("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasPeriod()) {

			p.addPlnDfnActnTrgrTmgTmgRptPrd(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getPeriod()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptPrd("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasCountMax()) {

			p.addPlnDfnActnTrgrTmgTmgRptCntMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getCountMax()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptCntMx("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasDurationMax()) {

			p.addPlnDfnActnTrgrTmgTmgRptDurationMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getDurationMax()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptDurationMx("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggertimingtimingrepeatboundsperiod = plandefinitionactiontriggertimingtimingrepeat.getBoundsPeriod();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsperiod.hasStart()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontriggertimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsperiod.hasEnd()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionactiontriggertimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontriggertimingtimingrepeatdurationunit = plandefinitionactiontriggertimingtimingrepeat.getDurationUnit();
		if(plandefinitionactiontriggertimingtimingrepeatdurationunit!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptDurationUnt(plandefinitionactiontriggertimingtimingrepeatdurationunit.toCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptDurationUnt("NULL");
		}

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggertimingtimingrepeatboundsduration = plandefinitionactiontriggertimingtimingrepeat.getBoundsDuration();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasValue()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getValue()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator = plandefinitionactiontriggertimingtimingrepeatboundsduration.getComparator();
		if(plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasCode()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getCode()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasUnit()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getUnit()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasSystem()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getSystem()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontriggertimingtimingrepeatboundsrange = plandefinitionactiontriggertimingtimingrepeat.getBoundsRange();

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangelow = plandefinitionactiontriggertimingtimingrepeatboundsrange.getLow();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasValue()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getValue()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator = plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getComparator();
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasCode()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getCode()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasUnit()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasSystem()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangehigh = plandefinitionactiontriggertimingtimingrepeatboundsrange.getHigh();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasValue()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator = plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getComparator();
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasCode()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasUnit()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasSystem()) {

			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasFrequencyMax()) {

			p.addPlnDfnActnTrgrTmgTmgRptFrqncyMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getFrequencyMax()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptFrqncyMx("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> plandefinitionactiontriggertimingtimingrepeatwhenlist = plandefinitionactiontriggertimingtimingrepeat.getWhen();
		for(int plandefinitionactiontriggertimingtimingrepeatwheni = 0; plandefinitionactiontriggertimingtimingrepeatwheni<plandefinitionactiontriggertimingtimingrepeatwhenlist.size();plandefinitionactiontriggertimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  plandefinitionactiontriggertimingtimingrepeatwhen = plandefinitionactiontriggertimingtimingrepeatwhenlist.get(plandefinitionactiontriggertimingtimingrepeatwheni);
		if(plandefinitionactiontriggertimingtimingrepeatwhen!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptWhen(plandefinitionactiontriggertimingtimingrepeatwhen.getCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptWhen("NULL");
		}
		 };

		/******************** plandefinitionactiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontriggertimingtimingrepeatperiodunit = plandefinitionactiontriggertimingtimingrepeat.getPeriodUnit();
		if(plandefinitionactiontriggertimingtimingrepeatperiodunit!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptPrdUnt(plandefinitionactiontriggertimingtimingrepeatperiodunit.toCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptPrdUnt("NULL");
		}

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasPeriodMax()) {

			p.addPlnDfnActnTrgrTmgTmgRptPrdMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getPeriodMax()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptPrdMx("NULL");
		}


		/******************** plandefinitionactiontriggertimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> plandefinitionactiontriggertimingtimingrepeatdayofweeklist = plandefinitionactiontriggertimingtimingrepeat.getDayOfWeek();
		for(int plandefinitionactiontriggertimingtimingrepeatdayofweeki = 0; plandefinitionactiontriggertimingtimingrepeatdayofweeki<plandefinitionactiontriggertimingtimingrepeatdayofweeklist.size();plandefinitionactiontriggertimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  plandefinitionactiontriggertimingtimingrepeatdayofweek = plandefinitionactiontriggertimingtimingrepeatdayofweeklist.get(plandefinitionactiontriggertimingtimingrepeatdayofweeki);
		if(plandefinitionactiontriggertimingtimingrepeatdayofweek!=null) {
			p.addPlnDfnActnTrgrTmgTmgRptDayOfWeek(plandefinitionactiontriggertimingtimingrepeatdayofweek.getCode());
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<plandefinitionactiontriggertimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + plandefinitionactiontriggertimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnActnTrgrTmgTmgRptTimeOfDay(array);

		} else {
			p.addPlnDfnActnTrgrTmgTmgRptTimeOfDay("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasDuration()) {

			p.addPlnDfnActnTrgrTmgTmgRptDuration(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getDuration()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptDuration("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasFrequency()) {

			p.addPlnDfnActnTrgrTmgTmgRptFrqncy(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getFrequency()));
		} else {
			p.addPlnDfnActnTrgrTmgTmgRptFrqncy("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgRfrnc ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingReference()) {

			if(plandefinitionactiontrigger.getTimingReference().getReference() != null) {
			p.addPlnDfnActnTrgrTmgRfrnc(plandefinitionactiontrigger.getTimingReference().getReference());
			}
		} else {
			p.addPlnDfnActnTrgrTmgRfrnc("NULL");
		}


		/******************** PlnDfn_Actn_Trgr_TmgDtTyp ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingDateType()) {

			p.addPlnDfnActnTrgrTmgDtTyp("\""+plandefinitionactiontrigger.getTimingDateType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnTrgrTmgDtTyp("NULL");
		}


		 };
		/******************** plandefinitionactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehavior plandefinitionactiongroupingbehavior = plandefinitionaction.getGroupingBehavior();
		if(plandefinitionactiongroupingbehavior!=null) {
			p.addPlnDfnActnGrpingBehavior(plandefinitionactiongroupingbehavior.toCode());
		} else {
			p.addPlnDfnActnGrpingBehavior("NULL");
		}

		/******************** plandefinitionactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehavior plandefinitionactionselectionbehavior = plandefinitionaction.getSelectionBehavior();
		if(plandefinitionactionselectionbehavior!=null) {
			p.addPlnDfnActnSelectionBehavior(plandefinitionactionselectionbehavior.toCode());
		} else {
			p.addPlnDfnActnSelectionBehavior("NULL");
		}

		/******************** plandefinitionactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehavior plandefinitionactionprecheckbehavior = plandefinitionaction.getPrecheckBehavior();
		if(plandefinitionactionprecheckbehavior!=null) {
			p.addPlnDfnActnPrecheckBehavior(plandefinitionactionprecheckbehavior.toCode());
		} else {
			p.addPlnDfnActnPrecheckBehavior("NULL");
		}

		/******************** plandefinitionactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehavior plandefinitionactionrequiredbehavior = plandefinitionaction.getRequiredBehavior();
		if(plandefinitionactionrequiredbehavior!=null) {
			p.addPlnDfnActnRequiredBehavior(plandefinitionactionrequiredbehavior.toCode());
		} else {
			p.addPlnDfnActnRequiredBehavior("NULL");
		}

		/******************** plandefinitionactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehavior plandefinitionactioncardinalitybehavior = plandefinitionaction.getCardinalityBehavior();
		if(plandefinitionactioncardinalitybehavior!=null) {
			p.addPlnDfnActnCardinalityBehavior(plandefinitionactioncardinalitybehavior.toCode());
		} else {
			p.addPlnDfnActnCardinalityBehavior("NULL");
		}

		/******************** plandefinitionactiondynamicvalue ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent> plandefinitionactiondynamicvaluelist = plandefinitionaction.getDynamicValue();
		for(int plandefinitionactiondynamicvaluei = 0; plandefinitionactiondynamicvaluei<plandefinitionactiondynamicvaluelist.size();plandefinitionactiondynamicvaluei++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent  plandefinitionactiondynamicvalue = plandefinitionactiondynamicvaluelist.get(plandefinitionactiondynamicvaluei);

		/******************** PlnDfn_Actn_DynamicVl_Path ********************************************************************************/
		if(plandefinitionactiondynamicvaluei == 0) {p.addPlnDfnActnDynamicVlPath("[[");}
		if(plandefinitionactiondynamicvalue.hasPath()) {

			p.addPlnDfnActnDynamicVlPath(String.valueOf(plandefinitionactiondynamicvalue.getPath()));
		} else {
			p.addPlnDfnActnDynamicVlPath("NULL");
		}

		if(plandefinitionactiondynamicvaluei == plandefinitionactiondynamicvaluelist.size()-1) {p.addPlnDfnActnDynamicVlPath("]]");}


		/******************** plandefinitionactiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiondynamicvalueexpression = plandefinitionactiondynamicvalue.getExpression();

		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(plandefinitionactiondynamicvaluei == 0) {p.addPlnDfnActnDynamicVlExprsnNm("[[");}
		if(plandefinitionactiondynamicvalueexpression.hasName()) {

			p.addPlnDfnActnDynamicVlExprsnNm(String.valueOf(plandefinitionactiondynamicvalueexpression.getName()));
		} else {
			p.addPlnDfnActnDynamicVlExprsnNm("NULL");
		}

		if(plandefinitionactiondynamicvaluei == plandefinitionactiondynamicvaluelist.size()-1) {p.addPlnDfnActnDynamicVlExprsnNm("]]");}


		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(plandefinitionactiondynamicvaluei == 0) {p.addPlnDfnActnDynamicVlExprsnRfrnc("[[");}
		if(plandefinitionactiondynamicvalueexpression.hasReference()) {

			p.addPlnDfnActnDynamicVlExprsnRfrnc(String.valueOf(plandefinitionactiondynamicvalueexpression.getReference()));
		} else {
			p.addPlnDfnActnDynamicVlExprsnRfrnc("NULL");
		}

		if(plandefinitionactiondynamicvaluei == plandefinitionactiondynamicvaluelist.size()-1) {p.addPlnDfnActnDynamicVlExprsnRfrnc("]]");}


		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(plandefinitionactiondynamicvaluei == 0) {p.addPlnDfnActnDynamicVlExprsnLnguage("[[");}
		if(plandefinitionactiondynamicvalueexpression.hasLanguage()) {

			p.addPlnDfnActnDynamicVlExprsnLnguage(String.valueOf(plandefinitionactiondynamicvalueexpression.getLanguage()));
		} else {
			p.addPlnDfnActnDynamicVlExprsnLnguage("NULL");
		}

		if(plandefinitionactiondynamicvaluei == plandefinitionactiondynamicvaluelist.size()-1) {p.addPlnDfnActnDynamicVlExprsnLnguage("]]");}


		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(plandefinitionactiondynamicvaluei == 0) {p.addPlnDfnActnDynamicVlExprsnDscrptn("[[");}
		if(plandefinitionactiondynamicvalueexpression.hasDescription()) {

			p.addPlnDfnActnDynamicVlExprsnDscrptn(String.valueOf(plandefinitionactiondynamicvalueexpression.getDescription()));
		} else {
			p.addPlnDfnActnDynamicVlExprsnDscrptn("NULL");
		}

		if(plandefinitionactiondynamicvaluei == plandefinitionactiondynamicvaluelist.size()-1) {p.addPlnDfnActnDynamicVlExprsnDscrptn("]]");}


		 };
		/******************** plandefinitionactionparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent> plandefinitionactionparticipantlist = plandefinitionaction.getParticipant();
		for(int plandefinitionactionparticipanti = 0; plandefinitionactionparticipanti<plandefinitionactionparticipantlist.size();plandefinitionactionparticipanti++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent  plandefinitionactionparticipant = plandefinitionactionparticipantlist.get(plandefinitionactionparticipanti);

		/******************** plandefinitionactionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantType plandefinitionactionparticipanttype = plandefinitionactionparticipant.getType();
		if(plandefinitionactionparticipanttype!=null) {
		if(plandefinitionactionparticipanti == 0) {

		p.addPlnDfnActnPrtcpntTyp("[[");		}
			p.addPlnDfnActnPrtcpntTyp(plandefinitionactionparticipanttype.toCode());
		if(plandefinitionactionparticipanti == plandefinitionactionparticipantlist.size()-1) {

		p.addPlnDfnActnPrtcpntTyp("]]");		}

		} else {
			p.addPlnDfnActnPrtcpntTyp("NULL");
		}

		/******************** plandefinitionactionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionparticipantrole = plandefinitionactionparticipant.getRole();

		/******************** PlnDfn_Actn_Prtcpnt_Role_Txt ********************************************************************************/
		if(plandefinitionactionparticipanti == 0) {p.addPlnDfnActnPrtcpntRoleTxt("[[");}
		if(plandefinitionactionparticipantrole.hasText()) {

			p.addPlnDfnActnPrtcpntRoleTxt(String.valueOf(plandefinitionactionparticipantrole.getText()));
		} else {
			p.addPlnDfnActnPrtcpntRoleTxt("NULL");
		}

		if(plandefinitionactionparticipanti == plandefinitionactionparticipantlist.size()-1) {p.addPlnDfnActnPrtcpntRoleTxt("]]");}


		/******************** plandefinitionactionparticipantrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionactionparticipantrolecodinglist = plandefinitionactionparticipantrole.getCoding();
		for(int plandefinitionactionparticipantrolecodingi = 0; plandefinitionactionparticipantrolecodingi<plandefinitionactionparticipantrolecodinglist.size();plandefinitionactionparticipantrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionactionparticipantrolecoding = plandefinitionactionparticipantrolecodinglist.get(plandefinitionactionparticipantrolecodingi);

		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionparticipantrolecodingi == 0) {p.addPlnDfnActnPrtcpntRoleCdgDsply("[[[");}
		if(plandefinitionactionparticipantrolecoding.hasDisplay()) {

			p.addPlnDfnActnPrtcpntRoleCdgDsply(String.valueOf(plandefinitionactionparticipantrolecoding.getDisplay()));
		} else {
			p.addPlnDfnActnPrtcpntRoleCdgDsply("NULL");
		}

		if(plandefinitionactionparticipantrolecodingi == plandefinitionactionparticipantrolecodinglist.size()-1) {p.addPlnDfnActnPrtcpntRoleCdgDsply("]]]");}


		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionparticipantrolecodingi == 0) {p.addPlnDfnActnPrtcpntRoleCdgVrsn("[[[");}
		if(plandefinitionactionparticipantrolecoding.hasVersion()) {

			p.addPlnDfnActnPrtcpntRoleCdgVrsn(String.valueOf(plandefinitionactionparticipantrolecoding.getVersion()));
		} else {
			p.addPlnDfnActnPrtcpntRoleCdgVrsn("NULL");
		}

		if(plandefinitionactionparticipantrolecodingi == plandefinitionactionparticipantrolecodinglist.size()-1) {p.addPlnDfnActnPrtcpntRoleCdgVrsn("]]]");}


		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionparticipantrolecodingi == 0) {p.addPlnDfnActnPrtcpntRoleCdgCd("[[[");}
		if(plandefinitionactionparticipantrolecoding.hasCode()) {

			p.addPlnDfnActnPrtcpntRoleCdgCd(String.valueOf(plandefinitionactionparticipantrolecoding.getCode()));
		} else {
			p.addPlnDfnActnPrtcpntRoleCdgCd("NULL");
		}

		if(plandefinitionactionparticipantrolecodingi == plandefinitionactionparticipantrolecodinglist.size()-1) {p.addPlnDfnActnPrtcpntRoleCdgCd("]]]");}


		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionparticipantrolecodingi == 0) {p.addPlnDfnActnPrtcpntRoleCdgUsrSltd("[[[");}
		if(plandefinitionactionparticipantrolecoding.hasUserSelected()) {

			p.addPlnDfnActnPrtcpntRoleCdgUsrSltd(String.valueOf(plandefinitionactionparticipantrolecoding.getUserSelected()));
		} else {
			p.addPlnDfnActnPrtcpntRoleCdgUsrSltd("NULL");
		}

		if(plandefinitionactionparticipantrolecodingi == plandefinitionactionparticipantrolecodinglist.size()-1) {p.addPlnDfnActnPrtcpntRoleCdgUsrSltd("]]]");}


		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionparticipantrolecodingi == 0) {p.addPlnDfnActnPrtcpntRoleCdgSys("[[[");}
		if(plandefinitionactionparticipantrolecoding.hasSystem()) {

			p.addPlnDfnActnPrtcpntRoleCdgSys(String.valueOf(plandefinitionactionparticipantrolecoding.getSystem()));
		} else {
			p.addPlnDfnActnPrtcpntRoleCdgSys("NULL");
		}

		if(plandefinitionactionparticipantrolecodingi == plandefinitionactionparticipantrolecodinglist.size()-1) {p.addPlnDfnActnPrtcpntRoleCdgSys("]]]");}


		 };
		 };
		/******************** PlnDfn_Actn_DfnUriTyp ********************************************************************************/
		if(plandefinitionaction.hasDefinitionUriType()) {

			p.addPlnDfnActnDfnUriTyp("\""+plandefinitionaction.getDefinitionUriType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnDfnUriTyp("NULL");
		}


		/******************** PlnDfn_Actn_DfnCanonicalTyp ********************************************************************************/
		if(plandefinitionaction.hasDefinitionCanonicalType()) {

			p.addPlnDfnActnDfnCanonicalTyp("\""+plandefinitionaction.getDefinitionCanonicalType().getValueAsString()+"\"");
		} else {
			p.addPlnDfnActnDfnCanonicalTyp("NULL");
		}


		 };
		/******************** PlnDfn_Dt ********************************************************************************/
		if(plandefinition.hasDate()) {

			p.addPlnDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinition.getDate())+"\"");
		} else {
			p.addPlnDfnDt("NULL");
		}


		/******************** plandefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus plandefinitionstatus = plandefinition.getStatus();
		if(plandefinitionstatus!=null) {
			p.addPlnDfnSts(plandefinitionstatus.toCode());
		} else {
			p.addPlnDfnSts("NULL");
		}

		/******************** PlnDfn_Dscrptn ********************************************************************************/
		if(plandefinition.hasDescription()) {

			p.addPlnDfnDscrptn(String.valueOf(plandefinition.getDescription()));
		} else {
			p.addPlnDfnDscrptn("NULL");
		}


		/******************** plandefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> plandefinitionidentifierlist = plandefinition.getIdentifier();
		for(int plandefinitionidentifieri = 0; plandefinitionidentifieri<plandefinitionidentifierlist.size();plandefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  plandefinitionidentifier = plandefinitionidentifierlist.get(plandefinitionidentifieri);

		/******************** PlnDfn_Id_Vl ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdVl("[");}
		if(plandefinitionidentifier.hasValue()) {

			p.addPlnDfnIdVl(String.valueOf(plandefinitionidentifier.getValue()));
		} else {
			p.addPlnDfnIdVl("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdVl("]");}


		/******************** plandefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionidentifiertype = plandefinitionidentifier.getType();

		/******************** PlnDfn_Id_Typ_Txt ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdTypTxt("[");}
		if(plandefinitionidentifiertype.hasText()) {

			p.addPlnDfnIdTypTxt(String.valueOf(plandefinitionidentifiertype.getText()));
		} else {
			p.addPlnDfnIdTypTxt("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdTypTxt("]");}


		/******************** plandefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionidentifiertypecodinglist = plandefinitionidentifiertype.getCoding();
		for(int plandefinitionidentifiertypecodingi = 0; plandefinitionidentifiertypecodingi<plandefinitionidentifiertypecodinglist.size();plandefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionidentifiertypecoding = plandefinitionidentifiertypecodinglist.get(plandefinitionidentifiertypecodingi);

		/******************** PlnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitionidentifiertypecodingi == 0) {p.addPlnDfnIdTypCdgDsply("[[");}
		if(plandefinitionidentifiertypecoding.hasDisplay()) {

			p.addPlnDfnIdTypCdgDsply(String.valueOf(plandefinitionidentifiertypecoding.getDisplay()));
		} else {
			p.addPlnDfnIdTypCdgDsply("NULL");
		}

		if(plandefinitionidentifiertypecodingi == plandefinitionidentifiertypecodinglist.size()-1) {p.addPlnDfnIdTypCdgDsply("]]");}


		/******************** PlnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionidentifiertypecodingi == 0) {p.addPlnDfnIdTypCdgVrsn("[[");}
		if(plandefinitionidentifiertypecoding.hasVersion()) {

			p.addPlnDfnIdTypCdgVrsn(String.valueOf(plandefinitionidentifiertypecoding.getVersion()));
		} else {
			p.addPlnDfnIdTypCdgVrsn("NULL");
		}

		if(plandefinitionidentifiertypecodingi == plandefinitionidentifiertypecodinglist.size()-1) {p.addPlnDfnIdTypCdgVrsn("]]");}


		/******************** PlnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitionidentifiertypecodingi == 0) {p.addPlnDfnIdTypCdgCd("[[");}
		if(plandefinitionidentifiertypecoding.hasCode()) {

			p.addPlnDfnIdTypCdgCd(String.valueOf(plandefinitionidentifiertypecoding.getCode()));
		} else {
			p.addPlnDfnIdTypCdgCd("NULL");
		}

		if(plandefinitionidentifiertypecodingi == plandefinitionidentifiertypecodinglist.size()-1) {p.addPlnDfnIdTypCdgCd("]]");}


		/******************** PlnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionidentifiertypecodingi == 0) {p.addPlnDfnIdTypCdgUsrSltd("[[");}
		if(plandefinitionidentifiertypecoding.hasUserSelected()) {

			p.addPlnDfnIdTypCdgUsrSltd(String.valueOf(plandefinitionidentifiertypecoding.getUserSelected()));
		} else {
			p.addPlnDfnIdTypCdgUsrSltd("NULL");
		}

		if(plandefinitionidentifiertypecodingi == plandefinitionidentifiertypecodinglist.size()-1) {p.addPlnDfnIdTypCdgUsrSltd("]]");}


		/******************** PlnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitionidentifiertypecodingi == 0) {p.addPlnDfnIdTypCdgSys("[[");}
		if(plandefinitionidentifiertypecoding.hasSystem()) {

			p.addPlnDfnIdTypCdgSys(String.valueOf(plandefinitionidentifiertypecoding.getSystem()));
		} else {
			p.addPlnDfnIdTypCdgSys("NULL");
		}

		if(plandefinitionidentifiertypecodingi == plandefinitionidentifiertypecodinglist.size()-1) {p.addPlnDfnIdTypCdgSys("]]");}


		 };
		/******************** plandefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionidentifierperiod = plandefinitionidentifier.getPeriod();

		/******************** PlnDfn_Id_Prd_Strt ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdPrdStrt("[");}
		if(plandefinitionidentifierperiod.hasStart()) {

			p.addPlnDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionidentifierperiod.getStart())+"\"");
		} else {
			p.addPlnDfnIdPrdStrt("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdPrdStrt("]");}


		/******************** PlnDfn_Id_Prd_End ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdPrdEnd("[");}
		if(plandefinitionidentifierperiod.hasEnd()) {

			p.addPlnDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionidentifierperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnIdPrdEnd("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdPrdEnd("]");}


		/******************** plandefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse plandefinitionidentifieruse = plandefinitionidentifier.getUse();
		if(plandefinitionidentifieruse!=null) {
		if(plandefinitionidentifieri == 0) {

		p.addPlnDfnIdUse("[");		}
			p.addPlnDfnIdUse(plandefinitionidentifieruse.toCode());
		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {

		p.addPlnDfnIdUse("]");		}

		} else {
			p.addPlnDfnIdUse("NULL");
		}

		/******************** PlnDfn_Id_Assigner ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdAssigner("[");}
		if(plandefinitionidentifier.hasAssigner()) {

			if(plandefinitionidentifier.getAssigner().getReference() != null) {
			p.addPlnDfnIdAssigner(plandefinitionidentifier.getAssigner().getReference());
			}
		} else {
			p.addPlnDfnIdAssigner("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdAssigner("]");}


		/******************** PlnDfn_Id_Sys ********************************************************************************/
		if(plandefinitionidentifieri == 0) {p.addPlnDfnIdSys("[");}
		if(plandefinitionidentifier.hasSystem()) {

			p.addPlnDfnIdSys(String.valueOf(plandefinitionidentifier.getSystem()));
		} else {
			p.addPlnDfnIdSys("NULL");
		}

		if(plandefinitionidentifieri == plandefinitionidentifierlist.size()-1) {p.addPlnDfnIdSys("]");}


		 };
		/******************** plandefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> plandefinitioncontactlist = plandefinition.getContact();
		for(int plandefinitioncontacti = 0; plandefinitioncontacti<plandefinitioncontactlist.size();plandefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  plandefinitioncontact = plandefinitioncontactlist.get(plandefinitioncontacti);

		/******************** PlnDfn_Cntct_Nm ********************************************************************************/
		if(plandefinitioncontacti == 0) {p.addPlnDfnCntctNm("[");}
		if(plandefinitioncontact.hasName()) {

			p.addPlnDfnCntctNm(String.valueOf(plandefinitioncontact.getName()));
		} else {
			p.addPlnDfnCntctNm("NULL");
		}

		if(plandefinitioncontacti == plandefinitioncontactlist.size()-1) {p.addPlnDfnCntctNm("]");}


		/******************** plandefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> plandefinitioncontacttelecomlist = plandefinitioncontact.getTelecom();
		for(int plandefinitioncontacttelecomi = 0; plandefinitioncontacttelecomi<plandefinitioncontacttelecomlist.size();plandefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  plandefinitioncontacttelecom = plandefinitioncontacttelecomlist.get(plandefinitioncontacttelecomi);

		/******************** PlnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(plandefinitioncontacttelecomi == 0) {p.addPlnDfnCntctTlcmVl("[[");}
		if(plandefinitioncontacttelecom.hasValue()) {

			p.addPlnDfnCntctTlcmVl(String.valueOf(plandefinitioncontacttelecom.getValue()));
		} else {
			p.addPlnDfnCntctTlcmVl("NULL");
		}

		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {p.addPlnDfnCntctTlcmVl("]]");}


		/******************** plandefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioncontacttelecomperiod = plandefinitioncontacttelecom.getPeriod();

		/******************** PlnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitioncontacttelecomi == 0) {p.addPlnDfnCntctTlcmPrdStrt("[[");}
		if(plandefinitioncontacttelecomperiod.hasStart()) {

			p.addPlnDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			p.addPlnDfnCntctTlcmPrdStrt("NULL");
		}

		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {p.addPlnDfnCntctTlcmPrdStrt("]]");}


		/******************** PlnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitioncontacttelecomi == 0) {p.addPlnDfnCntctTlcmPrdEnd("[[");}
		if(plandefinitioncontacttelecomperiod.hasEnd()) {

			p.addPlnDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnCntctTlcmPrdEnd("NULL");
		}

		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {p.addPlnDfnCntctTlcmPrdEnd("]]");}


		/******************** plandefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitioncontacttelecomuse = plandefinitioncontacttelecom.getUse();
		if(plandefinitioncontacttelecomuse!=null) {
		if(plandefinitioncontacttelecomi == 0) {

		p.addPlnDfnCntctTlcmUse("[[");		}
			p.addPlnDfnCntctTlcmUse(plandefinitioncontacttelecomuse.toCode());
		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {

		p.addPlnDfnCntctTlcmUse("]]");		}

		} else {
			p.addPlnDfnCntctTlcmUse("NULL");
		}

		/******************** plandefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitioncontacttelecomsystem = plandefinitioncontacttelecom.getSystem();
		if(plandefinitioncontacttelecomsystem!=null) {
		if(plandefinitioncontacttelecomi == 0) {

		p.addPlnDfnCntctTlcmSys("[[");		}
			p.addPlnDfnCntctTlcmSys(plandefinitioncontacttelecomsystem.toCode());
		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {

		p.addPlnDfnCntctTlcmSys("]]");		}

		} else {
			p.addPlnDfnCntctTlcmSys("NULL");
		}

		/******************** PlnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(plandefinitioncontacttelecomi == 0) {p.addPlnDfnCntctTlcmRnk("[[");}
		if(plandefinitioncontacttelecom.hasRank()) {

			p.addPlnDfnCntctTlcmRnk(String.valueOf(plandefinitioncontacttelecom.getRank()));
		} else {
			p.addPlnDfnCntctTlcmRnk("NULL");
		}

		if(plandefinitioncontacttelecomi == plandefinitioncontacttelecomlist.size()-1) {p.addPlnDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** PlnDfn_Copyright ********************************************************************************/
		if(plandefinition.hasCopyright()) {

			p.addPlnDfnCopyright(String.valueOf(plandefinition.getCopyright()));
		} else {
			p.addPlnDfnCopyright("NULL");
		}


		/******************** PlnDfn_ApprovalDt ********************************************************************************/
		if(plandefinition.hasApprovalDate()) {

			p.addPlnDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinition.getApprovalDate())+"\"");
		} else {
			p.addPlnDfnApprovalDt("NULL");
		}


		/******************** plandefinitionendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> plandefinitionendorserlist = plandefinition.getEndorser();
		for(int plandefinitionendorseri = 0; plandefinitionendorseri<plandefinitionendorserlist.size();plandefinitionendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  plandefinitionendorser = plandefinitionendorserlist.get(plandefinitionendorseri);

		/******************** PlnDfn_Endsr_Nm ********************************************************************************/
		if(plandefinitionendorseri == 0) {p.addPlnDfnEndsrNm("[");}
		if(plandefinitionendorser.hasName()) {

			p.addPlnDfnEndsrNm(String.valueOf(plandefinitionendorser.getName()));
		} else {
			p.addPlnDfnEndsrNm("NULL");
		}

		if(plandefinitionendorseri == plandefinitionendorserlist.size()-1) {p.addPlnDfnEndsrNm("]");}


		/******************** plandefinitionendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> plandefinitionendorsertelecomlist = plandefinitionendorser.getTelecom();
		for(int plandefinitionendorsertelecomi = 0; plandefinitionendorsertelecomi<plandefinitionendorsertelecomlist.size();plandefinitionendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  plandefinitionendorsertelecom = plandefinitionendorsertelecomlist.get(plandefinitionendorsertelecomi);

		/******************** PlnDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionendorsertelecomi == 0) {p.addPlnDfnEndsrTlcmVl("[[");}
		if(plandefinitionendorsertelecom.hasValue()) {

			p.addPlnDfnEndsrTlcmVl(String.valueOf(plandefinitionendorsertelecom.getValue()));
		} else {
			p.addPlnDfnEndsrTlcmVl("NULL");
		}

		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {p.addPlnDfnEndsrTlcmVl("]]");}


		/******************** plandefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionendorsertelecomperiod = plandefinitionendorsertelecom.getPeriod();

		/******************** PlnDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionendorsertelecomi == 0) {p.addPlnDfnEndsrTlcmPrdStrt("[[");}
		if(plandefinitionendorsertelecomperiod.hasStart()) {

			p.addPlnDfnEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionendorsertelecomperiod.getStart())+"\"");
		} else {
			p.addPlnDfnEndsrTlcmPrdStrt("NULL");
		}

		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {p.addPlnDfnEndsrTlcmPrdStrt("]]");}


		/******************** PlnDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionendorsertelecomi == 0) {p.addPlnDfnEndsrTlcmPrdEnd("[[");}
		if(plandefinitionendorsertelecomperiod.hasEnd()) {

			p.addPlnDfnEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionendorsertelecomperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnEndsrTlcmPrdEnd("NULL");
		}

		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {p.addPlnDfnEndsrTlcmPrdEnd("]]");}


		/******************** plandefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionendorsertelecomuse = plandefinitionendorsertelecom.getUse();
		if(plandefinitionendorsertelecomuse!=null) {
		if(plandefinitionendorsertelecomi == 0) {

		p.addPlnDfnEndsrTlcmUse("[[");		}
			p.addPlnDfnEndsrTlcmUse(plandefinitionendorsertelecomuse.toCode());
		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {

		p.addPlnDfnEndsrTlcmUse("]]");		}

		} else {
			p.addPlnDfnEndsrTlcmUse("NULL");
		}

		/******************** plandefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionendorsertelecomsystem = plandefinitionendorsertelecom.getSystem();
		if(plandefinitionendorsertelecomsystem!=null) {
		if(plandefinitionendorsertelecomi == 0) {

		p.addPlnDfnEndsrTlcmSys("[[");		}
			p.addPlnDfnEndsrTlcmSys(plandefinitionendorsertelecomsystem.toCode());
		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {

		p.addPlnDfnEndsrTlcmSys("]]");		}

		} else {
			p.addPlnDfnEndsrTlcmSys("NULL");
		}

		/******************** PlnDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionendorsertelecomi == 0) {p.addPlnDfnEndsrTlcmRnk("[[");}
		if(plandefinitionendorsertelecom.hasRank()) {

			p.addPlnDfnEndsrTlcmRnk(String.valueOf(plandefinitionendorsertelecom.getRank()));
		} else {
			p.addPlnDfnEndsrTlcmRnk("NULL");
		}

		if(plandefinitionendorsertelecomi == plandefinitionendorsertelecomlist.size()-1) {p.addPlnDfnEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** PlnDfn_LastReviewDt ********************************************************************************/
		if(plandefinition.hasLastReviewDate()) {

			p.addPlnDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinition.getLastReviewDate())+"\"");
		} else {
			p.addPlnDfnLastReviewDt("NULL");
		}


		/******************** plandefinitioneditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> plandefinitioneditorlist = plandefinition.getEditor();
		for(int plandefinitioneditori = 0; plandefinitioneditori<plandefinitioneditorlist.size();plandefinitioneditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  plandefinitioneditor = plandefinitioneditorlist.get(plandefinitioneditori);

		/******************** PlnDfn_Editor_Nm ********************************************************************************/
		if(plandefinitioneditori == 0) {p.addPlnDfnEditorNm("[");}
		if(plandefinitioneditor.hasName()) {

			p.addPlnDfnEditorNm(String.valueOf(plandefinitioneditor.getName()));
		} else {
			p.addPlnDfnEditorNm("NULL");
		}

		if(plandefinitioneditori == plandefinitioneditorlist.size()-1) {p.addPlnDfnEditorNm("]");}


		/******************** plandefinitioneditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> plandefinitioneditortelecomlist = plandefinitioneditor.getTelecom();
		for(int plandefinitioneditortelecomi = 0; plandefinitioneditortelecomi<plandefinitioneditortelecomlist.size();plandefinitioneditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  plandefinitioneditortelecom = plandefinitioneditortelecomlist.get(plandefinitioneditortelecomi);

		/******************** PlnDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(plandefinitioneditortelecomi == 0) {p.addPlnDfnEditorTlcmVl("[[");}
		if(plandefinitioneditortelecom.hasValue()) {

			p.addPlnDfnEditorTlcmVl(String.valueOf(plandefinitioneditortelecom.getValue()));
		} else {
			p.addPlnDfnEditorTlcmVl("NULL");
		}

		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {p.addPlnDfnEditorTlcmVl("]]");}


		/******************** plandefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneditortelecomperiod = plandefinitioneditortelecom.getPeriod();

		/******************** PlnDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitioneditortelecomi == 0) {p.addPlnDfnEditorTlcmPrdStrt("[[");}
		if(plandefinitioneditortelecomperiod.hasStart()) {

			p.addPlnDfnEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioneditortelecomperiod.getStart())+"\"");
		} else {
			p.addPlnDfnEditorTlcmPrdStrt("NULL");
		}

		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {p.addPlnDfnEditorTlcmPrdStrt("]]");}


		/******************** PlnDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitioneditortelecomi == 0) {p.addPlnDfnEditorTlcmPrdEnd("[[");}
		if(plandefinitioneditortelecomperiod.hasEnd()) {

			p.addPlnDfnEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioneditortelecomperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnEditorTlcmPrdEnd("NULL");
		}

		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {p.addPlnDfnEditorTlcmPrdEnd("]]");}


		/******************** plandefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitioneditortelecomuse = plandefinitioneditortelecom.getUse();
		if(plandefinitioneditortelecomuse!=null) {
		if(plandefinitioneditortelecomi == 0) {

		p.addPlnDfnEditorTlcmUse("[[");		}
			p.addPlnDfnEditorTlcmUse(plandefinitioneditortelecomuse.toCode());
		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {

		p.addPlnDfnEditorTlcmUse("]]");		}

		} else {
			p.addPlnDfnEditorTlcmUse("NULL");
		}

		/******************** plandefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitioneditortelecomsystem = plandefinitioneditortelecom.getSystem();
		if(plandefinitioneditortelecomsystem!=null) {
		if(plandefinitioneditortelecomi == 0) {

		p.addPlnDfnEditorTlcmSys("[[");		}
			p.addPlnDfnEditorTlcmSys(plandefinitioneditortelecomsystem.toCode());
		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {

		p.addPlnDfnEditorTlcmSys("]]");		}

		} else {
			p.addPlnDfnEditorTlcmSys("NULL");
		}

		/******************** PlnDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(plandefinitioneditortelecomi == 0) {p.addPlnDfnEditorTlcmRnk("[[");}
		if(plandefinitioneditortelecom.hasRank()) {

			p.addPlnDfnEditorTlcmRnk(String.valueOf(plandefinitioneditortelecom.getRank()));
		} else {
			p.addPlnDfnEditorTlcmRnk("NULL");
		}

		if(plandefinitioneditortelecomi == plandefinitioneditortelecomlist.size()-1) {p.addPlnDfnEditorTlcmRnk("]]");}


		 };
		 };
		/******************** plandefinitionreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> plandefinitionreviewerlist = plandefinition.getReviewer();
		for(int plandefinitionrevieweri = 0; plandefinitionrevieweri<plandefinitionreviewerlist.size();plandefinitionrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  plandefinitionreviewer = plandefinitionreviewerlist.get(plandefinitionrevieweri);

		/******************** PlnDfn_Rviewr_Nm ********************************************************************************/
		if(plandefinitionrevieweri == 0) {p.addPlnDfnRviewrNm("[");}
		if(plandefinitionreviewer.hasName()) {

			p.addPlnDfnRviewrNm(String.valueOf(plandefinitionreviewer.getName()));
		} else {
			p.addPlnDfnRviewrNm("NULL");
		}

		if(plandefinitionrevieweri == plandefinitionreviewerlist.size()-1) {p.addPlnDfnRviewrNm("]");}


		/******************** plandefinitionreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> plandefinitionreviewertelecomlist = plandefinitionreviewer.getTelecom();
		for(int plandefinitionreviewertelecomi = 0; plandefinitionreviewertelecomi<plandefinitionreviewertelecomlist.size();plandefinitionreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  plandefinitionreviewertelecom = plandefinitionreviewertelecomlist.get(plandefinitionreviewertelecomi);

		/******************** PlnDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionreviewertelecomi == 0) {p.addPlnDfnRviewrTlcmVl("[[");}
		if(plandefinitionreviewertelecom.hasValue()) {

			p.addPlnDfnRviewrTlcmVl(String.valueOf(plandefinitionreviewertelecom.getValue()));
		} else {
			p.addPlnDfnRviewrTlcmVl("NULL");
		}

		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {p.addPlnDfnRviewrTlcmVl("]]");}


		/******************** plandefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionreviewertelecomperiod = plandefinitionreviewertelecom.getPeriod();

		/******************** PlnDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionreviewertelecomi == 0) {p.addPlnDfnRviewrTlcmPrdStrt("[[");}
		if(plandefinitionreviewertelecomperiod.hasStart()) {

			p.addPlnDfnRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionreviewertelecomperiod.getStart())+"\"");
		} else {
			p.addPlnDfnRviewrTlcmPrdStrt("NULL");
		}

		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {p.addPlnDfnRviewrTlcmPrdStrt("]]");}


		/******************** PlnDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionreviewertelecomi == 0) {p.addPlnDfnRviewrTlcmPrdEnd("[[");}
		if(plandefinitionreviewertelecomperiod.hasEnd()) {

			p.addPlnDfnRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionreviewertelecomperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnRviewrTlcmPrdEnd("NULL");
		}

		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {p.addPlnDfnRviewrTlcmPrdEnd("]]");}


		/******************** plandefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionreviewertelecomuse = plandefinitionreviewertelecom.getUse();
		if(plandefinitionreviewertelecomuse!=null) {
		if(plandefinitionreviewertelecomi == 0) {

		p.addPlnDfnRviewrTlcmUse("[[");		}
			p.addPlnDfnRviewrTlcmUse(plandefinitionreviewertelecomuse.toCode());
		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {

		p.addPlnDfnRviewrTlcmUse("]]");		}

		} else {
			p.addPlnDfnRviewrTlcmUse("NULL");
		}

		/******************** plandefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionreviewertelecomsystem = plandefinitionreviewertelecom.getSystem();
		if(plandefinitionreviewertelecomsystem!=null) {
		if(plandefinitionreviewertelecomi == 0) {

		p.addPlnDfnRviewrTlcmSys("[[");		}
			p.addPlnDfnRviewrTlcmSys(plandefinitionreviewertelecomsystem.toCode());
		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {

		p.addPlnDfnRviewrTlcmSys("]]");		}

		} else {
			p.addPlnDfnRviewrTlcmSys("NULL");
		}

		/******************** PlnDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionreviewertelecomi == 0) {p.addPlnDfnRviewrTlcmRnk("[[");}
		if(plandefinitionreviewertelecom.hasRank()) {

			p.addPlnDfnRviewrTlcmRnk(String.valueOf(plandefinitionreviewertelecom.getRank()));
		} else {
			p.addPlnDfnRviewrTlcmRnk("NULL");
		}

		if(plandefinitionreviewertelecomi == plandefinitionreviewertelecomlist.size()-1) {p.addPlnDfnRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** PlnDfn_Usg ********************************************************************************/
		if(plandefinition.hasUsage()) {

			p.addPlnDfnUsg(String.valueOf(plandefinition.getUsage()));
		} else {
			p.addPlnDfnUsg("NULL");
		}


		/******************** PlnDfn_Library ********************************************************************************/
		if(plandefinition.hasLibrary()) {

			String  array = "[";
			for(int incr=0; incr<plandefinition.getLibrary().size(); incr++) {
				array = array + plandefinition.getLibrary().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPlnDfnLibrary(array);

		} else {
			p.addPlnDfnLibrary("NULL");
		}


		/******************** PlnDfn_SbjctRfrnc ********************************************************************************/
		if(plandefinition.hasSubjectReference()) {

			if(plandefinition.getSubjectReference().getReference() != null) {
			p.addPlnDfnSbjctRfrnc(plandefinition.getSubjectReference().getReference());
			}
		} else {
			p.addPlnDfnSbjctRfrnc("NULL");
		}


		/******************** plandefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionsubjectcodeableconcept = plandefinition.getSubjectCodeableConcept();

		/******************** PlnDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionsubjectcodeableconcept.hasText()) {

			p.addPlnDfnSbjctCdbleCncptTxt(String.valueOf(plandefinitionsubjectcodeableconcept.getText()));
		} else {
			p.addPlnDfnSbjctCdbleCncptTxt("NULL");
		}


		/******************** plandefinitionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionsubjectcodeableconceptcodinglist = plandefinitionsubjectcodeableconcept.getCoding();
		for(int plandefinitionsubjectcodeableconceptcodingi = 0; plandefinitionsubjectcodeableconceptcodingi<plandefinitionsubjectcodeableconceptcodinglist.size();plandefinitionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionsubjectcodeableconceptcoding = plandefinitionsubjectcodeableconceptcodinglist.get(plandefinitionsubjectcodeableconceptcodingi);

		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnSbjctCdbleCncptCdgDsply("[");}
		if(plandefinitionsubjectcodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionsubjectcodeableconceptcodingi == plandefinitionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnSbjctCdbleCncptCdgDsply("]");}


		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnSbjctCdbleCncptCdgVrsn("[");}
		if(plandefinitionsubjectcodeableconceptcoding.hasVersion()) {

			p.addPlnDfnSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionsubjectcodeableconceptcodingi == plandefinitionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnSbjctCdbleCncptCdgVrsn("]");}


		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnSbjctCdbleCncptCdgCd("[");}
		if(plandefinitionsubjectcodeableconceptcoding.hasCode()) {

			p.addPlnDfnSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnSbjctCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionsubjectcodeableconceptcodingi == plandefinitionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnSbjctCdbleCncptCdgCd("]");}


		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnSbjctCdbleCncptCdgUsrSltd("[");}
		if(plandefinitionsubjectcodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionsubjectcodeableconceptcodingi == plandefinitionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcodingi == 0) {p.addPlnDfnSbjctCdbleCncptCdgSys("[");}
		if(plandefinitionsubjectcodeableconceptcoding.hasSystem()) {

			p.addPlnDfnSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnSbjctCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionsubjectcodeableconceptcodingi == plandefinitionsubjectcodeableconceptcodinglist.size()-1) {p.addPlnDfnSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** plandefinitiongoal ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent> plandefinitiongoallist = plandefinition.getGoal();
		for(int plandefinitiongoali = 0; plandefinitiongoali<plandefinitiongoallist.size();plandefinitiongoali++ ) {
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent  plandefinitiongoal = plandefinitiongoallist.get(plandefinitiongoali);

		/******************** plandefinitiongoalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalpriority = plandefinitiongoal.getPriority();

		/******************** PlnDfn_Goal_Priority_Txt ********************************************************************************/
		if(plandefinitiongoali == 0) {p.addPlnDfnGoalPriorityTxt("[");}
		if(plandefinitiongoalpriority.hasText()) {

			p.addPlnDfnGoalPriorityTxt(String.valueOf(plandefinitiongoalpriority.getText()));
		} else {
			p.addPlnDfnGoalPriorityTxt("NULL");
		}

		if(plandefinitiongoali == plandefinitiongoallist.size()-1) {p.addPlnDfnGoalPriorityTxt("]");}


		/******************** plandefinitiongoalprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiongoalprioritycodinglist = plandefinitiongoalpriority.getCoding();
		for(int plandefinitiongoalprioritycodingi = 0; plandefinitiongoalprioritycodingi<plandefinitiongoalprioritycodinglist.size();plandefinitiongoalprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiongoalprioritycoding = plandefinitiongoalprioritycodinglist.get(plandefinitiongoalprioritycodingi);

		/******************** PlnDfn_Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalprioritycodingi == 0) {p.addPlnDfnGoalPriorityCdgDsply("[[");}
		if(plandefinitiongoalprioritycoding.hasDisplay()) {

			p.addPlnDfnGoalPriorityCdgDsply(String.valueOf(plandefinitiongoalprioritycoding.getDisplay()));
		} else {
			p.addPlnDfnGoalPriorityCdgDsply("NULL");
		}

		if(plandefinitiongoalprioritycodingi == plandefinitiongoalprioritycodinglist.size()-1) {p.addPlnDfnGoalPriorityCdgDsply("]]");}


		/******************** PlnDfn_Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalprioritycodingi == 0) {p.addPlnDfnGoalPriorityCdgVrsn("[[");}
		if(plandefinitiongoalprioritycoding.hasVersion()) {

			p.addPlnDfnGoalPriorityCdgVrsn(String.valueOf(plandefinitiongoalprioritycoding.getVersion()));
		} else {
			p.addPlnDfnGoalPriorityCdgVrsn("NULL");
		}

		if(plandefinitiongoalprioritycodingi == plandefinitiongoalprioritycodinglist.size()-1) {p.addPlnDfnGoalPriorityCdgVrsn("]]");}


		/******************** PlnDfn_Goal_Priority_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalprioritycodingi == 0) {p.addPlnDfnGoalPriorityCdgCd("[[");}
		if(plandefinitiongoalprioritycoding.hasCode()) {

			p.addPlnDfnGoalPriorityCdgCd(String.valueOf(plandefinitiongoalprioritycoding.getCode()));
		} else {
			p.addPlnDfnGoalPriorityCdgCd("NULL");
		}

		if(plandefinitiongoalprioritycodingi == plandefinitiongoalprioritycodinglist.size()-1) {p.addPlnDfnGoalPriorityCdgCd("]]");}


		/******************** PlnDfn_Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalprioritycodingi == 0) {p.addPlnDfnGoalPriorityCdgUsrSltd("[[");}
		if(plandefinitiongoalprioritycoding.hasUserSelected()) {

			p.addPlnDfnGoalPriorityCdgUsrSltd(String.valueOf(plandefinitiongoalprioritycoding.getUserSelected()));
		} else {
			p.addPlnDfnGoalPriorityCdgUsrSltd("NULL");
		}

		if(plandefinitiongoalprioritycodingi == plandefinitiongoalprioritycodinglist.size()-1) {p.addPlnDfnGoalPriorityCdgUsrSltd("]]");}


		/******************** PlnDfn_Goal_Priority_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalprioritycodingi == 0) {p.addPlnDfnGoalPriorityCdgSys("[[");}
		if(plandefinitiongoalprioritycoding.hasSystem()) {

			p.addPlnDfnGoalPriorityCdgSys(String.valueOf(plandefinitiongoalprioritycoding.getSystem()));
		} else {
			p.addPlnDfnGoalPriorityCdgSys("NULL");
		}

		if(plandefinitiongoalprioritycodingi == plandefinitiongoalprioritycodinglist.size()-1) {p.addPlnDfnGoalPriorityCdgSys("]]");}


		 };
		/******************** plandefinitiongoaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaldescription = plandefinitiongoal.getDescription();

		/******************** PlnDfn_Goal_Dscrptn_Txt ********************************************************************************/
		if(plandefinitiongoali == 0) {p.addPlnDfnGoalDscrptnTxt("[");}
		if(plandefinitiongoaldescription.hasText()) {

			p.addPlnDfnGoalDscrptnTxt(String.valueOf(plandefinitiongoaldescription.getText()));
		} else {
			p.addPlnDfnGoalDscrptnTxt("NULL");
		}

		if(plandefinitiongoali == plandefinitiongoallist.size()-1) {p.addPlnDfnGoalDscrptnTxt("]");}


		/******************** plandefinitiongoaldescriptioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiongoaldescriptioncodinglist = plandefinitiongoaldescription.getCoding();
		for(int plandefinitiongoaldescriptioncodingi = 0; plandefinitiongoaldescriptioncodingi<plandefinitiongoaldescriptioncodinglist.size();plandefinitiongoaldescriptioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiongoaldescriptioncoding = plandefinitiongoaldescriptioncodinglist.get(plandefinitiongoaldescriptioncodingi);

		/******************** PlnDfn_Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaldescriptioncodingi == 0) {p.addPlnDfnGoalDscrptnCdgDsply("[[");}
		if(plandefinitiongoaldescriptioncoding.hasDisplay()) {

			p.addPlnDfnGoalDscrptnCdgDsply(String.valueOf(plandefinitiongoaldescriptioncoding.getDisplay()));
		} else {
			p.addPlnDfnGoalDscrptnCdgDsply("NULL");
		}

		if(plandefinitiongoaldescriptioncodingi == plandefinitiongoaldescriptioncodinglist.size()-1) {p.addPlnDfnGoalDscrptnCdgDsply("]]");}


		/******************** PlnDfn_Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaldescriptioncodingi == 0) {p.addPlnDfnGoalDscrptnCdgVrsn("[[");}
		if(plandefinitiongoaldescriptioncoding.hasVersion()) {

			p.addPlnDfnGoalDscrptnCdgVrsn(String.valueOf(plandefinitiongoaldescriptioncoding.getVersion()));
		} else {
			p.addPlnDfnGoalDscrptnCdgVrsn("NULL");
		}

		if(plandefinitiongoaldescriptioncodingi == plandefinitiongoaldescriptioncodinglist.size()-1) {p.addPlnDfnGoalDscrptnCdgVrsn("]]");}


		/******************** PlnDfn_Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaldescriptioncodingi == 0) {p.addPlnDfnGoalDscrptnCdgCd("[[");}
		if(plandefinitiongoaldescriptioncoding.hasCode()) {

			p.addPlnDfnGoalDscrptnCdgCd(String.valueOf(plandefinitiongoaldescriptioncoding.getCode()));
		} else {
			p.addPlnDfnGoalDscrptnCdgCd("NULL");
		}

		if(plandefinitiongoaldescriptioncodingi == plandefinitiongoaldescriptioncodinglist.size()-1) {p.addPlnDfnGoalDscrptnCdgCd("]]");}


		/******************** PlnDfn_Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaldescriptioncodingi == 0) {p.addPlnDfnGoalDscrptnCdgUsrSltd("[[");}
		if(plandefinitiongoaldescriptioncoding.hasUserSelected()) {

			p.addPlnDfnGoalDscrptnCdgUsrSltd(String.valueOf(plandefinitiongoaldescriptioncoding.getUserSelected()));
		} else {
			p.addPlnDfnGoalDscrptnCdgUsrSltd("NULL");
		}

		if(plandefinitiongoaldescriptioncodingi == plandefinitiongoaldescriptioncodinglist.size()-1) {p.addPlnDfnGoalDscrptnCdgUsrSltd("]]");}


		/******************** PlnDfn_Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaldescriptioncodingi == 0) {p.addPlnDfnGoalDscrptnCdgSys("[[");}
		if(plandefinitiongoaldescriptioncoding.hasSystem()) {

			p.addPlnDfnGoalDscrptnCdgSys(String.valueOf(plandefinitiongoaldescriptioncoding.getSystem()));
		} else {
			p.addPlnDfnGoalDscrptnCdgSys("NULL");
		}

		if(plandefinitiongoaldescriptioncodingi == plandefinitiongoaldescriptioncodinglist.size()-1) {p.addPlnDfnGoalDscrptnCdgSys("]]");}


		 };
		/******************** plandefinitiongoalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalcategory = plandefinitiongoal.getCategory();

		/******************** PlnDfn_Goal_Ctgry_Txt ********************************************************************************/
		if(plandefinitiongoali == 0) {p.addPlnDfnGoalCtgryTxt("[");}
		if(plandefinitiongoalcategory.hasText()) {

			p.addPlnDfnGoalCtgryTxt(String.valueOf(plandefinitiongoalcategory.getText()));
		} else {
			p.addPlnDfnGoalCtgryTxt("NULL");
		}

		if(plandefinitiongoali == plandefinitiongoallist.size()-1) {p.addPlnDfnGoalCtgryTxt("]");}


		/******************** plandefinitiongoalcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiongoalcategorycodinglist = plandefinitiongoalcategory.getCoding();
		for(int plandefinitiongoalcategorycodingi = 0; plandefinitiongoalcategorycodingi<plandefinitiongoalcategorycodinglist.size();plandefinitiongoalcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiongoalcategorycoding = plandefinitiongoalcategorycodinglist.get(plandefinitiongoalcategorycodingi);

		/******************** PlnDfn_Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalcategorycodingi == 0) {p.addPlnDfnGoalCtgryCdgDsply("[[");}
		if(plandefinitiongoalcategorycoding.hasDisplay()) {

			p.addPlnDfnGoalCtgryCdgDsply(String.valueOf(plandefinitiongoalcategorycoding.getDisplay()));
		} else {
			p.addPlnDfnGoalCtgryCdgDsply("NULL");
		}

		if(plandefinitiongoalcategorycodingi == plandefinitiongoalcategorycodinglist.size()-1) {p.addPlnDfnGoalCtgryCdgDsply("]]");}


		/******************** PlnDfn_Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalcategorycodingi == 0) {p.addPlnDfnGoalCtgryCdgVrsn("[[");}
		if(plandefinitiongoalcategorycoding.hasVersion()) {

			p.addPlnDfnGoalCtgryCdgVrsn(String.valueOf(plandefinitiongoalcategorycoding.getVersion()));
		} else {
			p.addPlnDfnGoalCtgryCdgVrsn("NULL");
		}

		if(plandefinitiongoalcategorycodingi == plandefinitiongoalcategorycodinglist.size()-1) {p.addPlnDfnGoalCtgryCdgVrsn("]]");}


		/******************** PlnDfn_Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalcategorycodingi == 0) {p.addPlnDfnGoalCtgryCdgCd("[[");}
		if(plandefinitiongoalcategorycoding.hasCode()) {

			p.addPlnDfnGoalCtgryCdgCd(String.valueOf(plandefinitiongoalcategorycoding.getCode()));
		} else {
			p.addPlnDfnGoalCtgryCdgCd("NULL");
		}

		if(plandefinitiongoalcategorycodingi == plandefinitiongoalcategorycodinglist.size()-1) {p.addPlnDfnGoalCtgryCdgCd("]]");}


		/******************** PlnDfn_Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalcategorycodingi == 0) {p.addPlnDfnGoalCtgryCdgUsrSltd("[[");}
		if(plandefinitiongoalcategorycoding.hasUserSelected()) {

			p.addPlnDfnGoalCtgryCdgUsrSltd(String.valueOf(plandefinitiongoalcategorycoding.getUserSelected()));
		} else {
			p.addPlnDfnGoalCtgryCdgUsrSltd("NULL");
		}

		if(plandefinitiongoalcategorycodingi == plandefinitiongoalcategorycodinglist.size()-1) {p.addPlnDfnGoalCtgryCdgUsrSltd("]]");}


		/******************** PlnDfn_Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalcategorycodingi == 0) {p.addPlnDfnGoalCtgryCdgSys("[[");}
		if(plandefinitiongoalcategorycoding.hasSystem()) {

			p.addPlnDfnGoalCtgryCdgSys(String.valueOf(plandefinitiongoalcategorycoding.getSystem()));
		} else {
			p.addPlnDfnGoalCtgryCdgSys("NULL");
		}

		if(plandefinitiongoalcategorycodingi == plandefinitiongoalcategorycodinglist.size()-1) {p.addPlnDfnGoalCtgryCdgSys("]]");}


		 };
		/******************** plandefinitiongoaladdresses ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> plandefinitiongoaladdresseslist = plandefinitiongoal.getAddresses();
		for(int plandefinitiongoaladdressesi = 0; plandefinitiongoaladdressesi<plandefinitiongoaladdresseslist.size();plandefinitiongoaladdressesi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  plandefinitiongoaladdresses = plandefinitiongoaladdresseslist.get(plandefinitiongoaladdressesi);

		/******************** PlnDfn_Goal_Addres_Txt ********************************************************************************/
		if(plandefinitiongoaladdressesi == 0) {p.addPlnDfnGoalAddresTxt("[[");}
		if(plandefinitiongoaladdresses.hasText()) {

			p.addPlnDfnGoalAddresTxt(String.valueOf(plandefinitiongoaladdresses.getText()));
		} else {
			p.addPlnDfnGoalAddresTxt("NULL");
		}

		if(plandefinitiongoaladdressesi == plandefinitiongoaladdresseslist.size()-1) {p.addPlnDfnGoalAddresTxt("]]");}


		/******************** plandefinitiongoaladdressescoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiongoaladdressescodinglist = plandefinitiongoaladdresses.getCoding();
		for(int plandefinitiongoaladdressescodingi = 0; plandefinitiongoaladdressescodingi<plandefinitiongoaladdressescodinglist.size();plandefinitiongoaladdressescodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiongoaladdressescoding = plandefinitiongoaladdressescodinglist.get(plandefinitiongoaladdressescodingi);

		/******************** PlnDfn_Goal_Addres_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaladdressescodingi == 0) {p.addPlnDfnGoalAddresCdgDsply("[[[");}
		if(plandefinitiongoaladdressescoding.hasDisplay()) {

			p.addPlnDfnGoalAddresCdgDsply(String.valueOf(plandefinitiongoaladdressescoding.getDisplay()));
		} else {
			p.addPlnDfnGoalAddresCdgDsply("NULL");
		}

		if(plandefinitiongoaladdressescodingi == plandefinitiongoaladdressescodinglist.size()-1) {p.addPlnDfnGoalAddresCdgDsply("]]]");}


		/******************** PlnDfn_Goal_Addres_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaladdressescodingi == 0) {p.addPlnDfnGoalAddresCdgVrsn("[[[");}
		if(plandefinitiongoaladdressescoding.hasVersion()) {

			p.addPlnDfnGoalAddresCdgVrsn(String.valueOf(plandefinitiongoaladdressescoding.getVersion()));
		} else {
			p.addPlnDfnGoalAddresCdgVrsn("NULL");
		}

		if(plandefinitiongoaladdressescodingi == plandefinitiongoaladdressescodinglist.size()-1) {p.addPlnDfnGoalAddresCdgVrsn("]]]");}


		/******************** PlnDfn_Goal_Addres_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaladdressescodingi == 0) {p.addPlnDfnGoalAddresCdgCd("[[[");}
		if(plandefinitiongoaladdressescoding.hasCode()) {

			p.addPlnDfnGoalAddresCdgCd(String.valueOf(plandefinitiongoaladdressescoding.getCode()));
		} else {
			p.addPlnDfnGoalAddresCdgCd("NULL");
		}

		if(plandefinitiongoaladdressescodingi == plandefinitiongoaladdressescodinglist.size()-1) {p.addPlnDfnGoalAddresCdgCd("]]]");}


		/******************** PlnDfn_Goal_Addres_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaladdressescodingi == 0) {p.addPlnDfnGoalAddresCdgUsrSltd("[[[");}
		if(plandefinitiongoaladdressescoding.hasUserSelected()) {

			p.addPlnDfnGoalAddresCdgUsrSltd(String.valueOf(plandefinitiongoaladdressescoding.getUserSelected()));
		} else {
			p.addPlnDfnGoalAddresCdgUsrSltd("NULL");
		}

		if(plandefinitiongoaladdressescodingi == plandefinitiongoaladdressescodinglist.size()-1) {p.addPlnDfnGoalAddresCdgUsrSltd("]]]");}


		/******************** PlnDfn_Goal_Addres_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaladdressescodingi == 0) {p.addPlnDfnGoalAddresCdgSys("[[[");}
		if(plandefinitiongoaladdressescoding.hasSystem()) {

			p.addPlnDfnGoalAddresCdgSys(String.valueOf(plandefinitiongoaladdressescoding.getSystem()));
		} else {
			p.addPlnDfnGoalAddresCdgSys("NULL");
		}

		if(plandefinitiongoaladdressescodingi == plandefinitiongoaladdressescodinglist.size()-1) {p.addPlnDfnGoalAddresCdgSys("]]]");}


		 };
		 };
		/******************** plandefinitiongoalstart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalstart = plandefinitiongoal.getStart();

		/******************** PlnDfn_Goal_Strt_Txt ********************************************************************************/
		if(plandefinitiongoalstart.hasText()) {

			p.addPlnDfnGoalStrtTxt(String.valueOf(plandefinitiongoalstart.getText()));
		} else {
			p.addPlnDfnGoalStrtTxt("NULL");
		}


		/******************** plandefinitiongoalstartcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiongoalstartcodinglist = plandefinitiongoalstart.getCoding();
		for(int plandefinitiongoalstartcodingi = 0; plandefinitiongoalstartcodingi<plandefinitiongoalstartcodinglist.size();plandefinitiongoalstartcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiongoalstartcoding = plandefinitiongoalstartcodinglist.get(plandefinitiongoalstartcodingi);

		/******************** PlnDfn_Goal_Strt_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalstartcodingi == 0) {p.addPlnDfnGoalStrtCdgDsply("[[");}
		if(plandefinitiongoalstartcoding.hasDisplay()) {

			p.addPlnDfnGoalStrtCdgDsply(String.valueOf(plandefinitiongoalstartcoding.getDisplay()));
		} else {
			p.addPlnDfnGoalStrtCdgDsply("NULL");
		}

		if(plandefinitiongoalstartcodingi == plandefinitiongoalstartcodinglist.size()-1) {p.addPlnDfnGoalStrtCdgDsply("]]");}


		/******************** PlnDfn_Goal_Strt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalstartcodingi == 0) {p.addPlnDfnGoalStrtCdgVrsn("[[");}
		if(plandefinitiongoalstartcoding.hasVersion()) {

			p.addPlnDfnGoalStrtCdgVrsn(String.valueOf(plandefinitiongoalstartcoding.getVersion()));
		} else {
			p.addPlnDfnGoalStrtCdgVrsn("NULL");
		}

		if(plandefinitiongoalstartcodingi == plandefinitiongoalstartcodinglist.size()-1) {p.addPlnDfnGoalStrtCdgVrsn("]]");}


		/******************** PlnDfn_Goal_Strt_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalstartcodingi == 0) {p.addPlnDfnGoalStrtCdgCd("[[");}
		if(plandefinitiongoalstartcoding.hasCode()) {

			p.addPlnDfnGoalStrtCdgCd(String.valueOf(plandefinitiongoalstartcoding.getCode()));
		} else {
			p.addPlnDfnGoalStrtCdgCd("NULL");
		}

		if(plandefinitiongoalstartcodingi == plandefinitiongoalstartcodinglist.size()-1) {p.addPlnDfnGoalStrtCdgCd("]]");}


		/******************** PlnDfn_Goal_Strt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalstartcodingi == 0) {p.addPlnDfnGoalStrtCdgUsrSltd("[[");}
		if(plandefinitiongoalstartcoding.hasUserSelected()) {

			p.addPlnDfnGoalStrtCdgUsrSltd(String.valueOf(plandefinitiongoalstartcoding.getUserSelected()));
		} else {
			p.addPlnDfnGoalStrtCdgUsrSltd("NULL");
		}

		if(plandefinitiongoalstartcodingi == plandefinitiongoalstartcodinglist.size()-1) {p.addPlnDfnGoalStrtCdgUsrSltd("]]");}


		/******************** PlnDfn_Goal_Strt_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalstartcodingi == 0) {p.addPlnDfnGoalStrtCdgSys("[[");}
		if(plandefinitiongoalstartcoding.hasSystem()) {

			p.addPlnDfnGoalStrtCdgSys(String.valueOf(plandefinitiongoalstartcoding.getSystem()));
		} else {
			p.addPlnDfnGoalStrtCdgSys("NULL");
		}

		if(plandefinitiongoalstartcodingi == plandefinitiongoalstartcodinglist.size()-1) {p.addPlnDfnGoalStrtCdgSys("]]");}


		 };
		/******************** plandefinitiongoaldocumentation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> plandefinitiongoaldocumentationlist = plandefinitiongoal.getDocumentation();
		for(int plandefinitiongoaldocumentationi = 0; plandefinitiongoaldocumentationi<plandefinitiongoaldocumentationlist.size();plandefinitiongoaldocumentationi++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  plandefinitiongoaldocumentation = plandefinitiongoaldocumentationlist.get(plandefinitiongoaldocumentationi);

		/******************** PlnDfn_Goal_Docation_Rsrc ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationRsrc("[[");}
		if(plandefinitiongoaldocumentation.hasResource()) {

			p.addPlnDfnGoalDocationRsrc(String.valueOf(plandefinitiongoaldocumentation.getResource()));
		} else {
			p.addPlnDfnGoalDocationRsrc("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationRsrc("]]");}


		/******************** plandefinitiongoaldocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitiongoaldocumentationtype = plandefinitiongoaldocumentation.getType();
		if(plandefinitiongoaldocumentationtype!=null) {
		if(plandefinitiongoaldocumentationi == 0) {

		p.addPlnDfnGoalDocationTyp("[[");		}
			p.addPlnDfnGoalDocationTyp(plandefinitiongoaldocumentationtype.toCode());
		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {

		p.addPlnDfnGoalDocationTyp("]]");		}

		} else {
			p.addPlnDfnGoalDocationTyp("NULL");
		}

		/******************** PlnDfn_Goal_Docation_Url ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationUrl("[[");}
		if(plandefinitiongoaldocumentation.hasUrl()) {

			p.addPlnDfnGoalDocationUrl(String.valueOf(plandefinitiongoaldocumentation.getUrl()));
		} else {
			p.addPlnDfnGoalDocationUrl("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationUrl("]]");}


		/******************** PlnDfn_Goal_Docation_Citation ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationCitation("[[");}
		if(plandefinitiongoaldocumentation.hasCitation()) {

			p.addPlnDfnGoalDocationCitation(String.valueOf(plandefinitiongoaldocumentation.getCitation()));
		} else {
			p.addPlnDfnGoalDocationCitation("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationCitation("]]");}


		/******************** PlnDfn_Goal_Docation_Lbl ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationLbl("[[");}
		if(plandefinitiongoaldocumentation.hasLabel()) {

			p.addPlnDfnGoalDocationLbl(String.valueOf(plandefinitiongoaldocumentation.getLabel()));
		} else {
			p.addPlnDfnGoalDocationLbl("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationLbl("]]");}


		/******************** plandefinitiongoaldocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitiongoaldocumentationdocument = plandefinitiongoaldocumentation.getDocument();

		/******************** PlnDfn_Goal_Docation_Doc_Sz ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocSz("[[");}
		if(plandefinitiongoaldocumentationdocument.hasSize()) {

			p.addPlnDfnGoalDocationDocSz(String.valueOf(plandefinitiongoaldocumentationdocument.getSize()));
		} else {
			p.addPlnDfnGoalDocationDocSz("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocSz("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Lnguage ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocLnguage("[[");}
		if(plandefinitiongoaldocumentationdocument.hasLanguage()) {

			p.addPlnDfnGoalDocationDocLnguage(String.valueOf(plandefinitiongoaldocumentationdocument.getLanguage()));
		} else {
			p.addPlnDfnGoalDocationDocLnguage("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocLnguage("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_CntntTyp ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocCntntTyp("[[");}
		if(plandefinitiongoaldocumentationdocument.hasContentType()) {

			p.addPlnDfnGoalDocationDocCntntTyp(String.valueOf(plandefinitiongoaldocumentationdocument.getContentType()));
		} else {
			p.addPlnDfnGoalDocationDocCntntTyp("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocCntntTyp("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Hash ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocHash("[[");}
		if(plandefinitiongoaldocumentationdocument.hasHash()) {

			p.addPlnDfnGoalDocationDocHash(new String(plandefinitiongoaldocumentationdocument.getHash()));
		} else {
			p.addPlnDfnGoalDocationDocHash("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocHash("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Data ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocData("[[");}
		if(plandefinitiongoaldocumentationdocument.hasData()) {

			p.addPlnDfnGoalDocationDocData(new String(plandefinitiongoaldocumentationdocument.getData()));
		} else {
			p.addPlnDfnGoalDocationDocData("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocData("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Creation ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocCreation("[[");}
		if(plandefinitiongoaldocumentationdocument.hasCreation()) {

			p.addPlnDfnGoalDocationDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitiongoaldocumentationdocument.getCreation())+"\"");
		} else {
			p.addPlnDfnGoalDocationDocCreation("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocCreation("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Ttl ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocTtl("[[");}
		if(plandefinitiongoaldocumentationdocument.hasTitle()) {

			p.addPlnDfnGoalDocationDocTtl(String.valueOf(plandefinitiongoaldocumentationdocument.getTitle()));
		} else {
			p.addPlnDfnGoalDocationDocTtl("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocTtl("]]");}


		/******************** PlnDfn_Goal_Docation_Doc_Url ********************************************************************************/
		if(plandefinitiongoaldocumentationi == 0) {p.addPlnDfnGoalDocationDocUrl("[[");}
		if(plandefinitiongoaldocumentationdocument.hasUrl()) {

			p.addPlnDfnGoalDocationDocUrl(String.valueOf(plandefinitiongoaldocumentationdocument.getUrl()));
		} else {
			p.addPlnDfnGoalDocationDocUrl("NULL");
		}

		if(plandefinitiongoaldocumentationi == plandefinitiongoaldocumentationlist.size()-1) {p.addPlnDfnGoalDocationDocUrl("]]");}


		 };
		 };
		/******************** PlnDfn_Ttl ********************************************************************************/
		if(plandefinition.hasTitle()) {

			p.addPlnDfnTtl(String.valueOf(plandefinition.getTitle()));
		} else {
			p.addPlnDfnTtl("NULL");
		}


		/******************** plandefinitionrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> plandefinitionrelatedartifactlist = plandefinition.getRelatedArtifact();
		for(int plandefinitionrelatedartifacti = 0; plandefinitionrelatedartifacti<plandefinitionrelatedartifactlist.size();plandefinitionrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  plandefinitionrelatedartifact = plandefinitionrelatedartifactlist.get(plandefinitionrelatedartifacti);

		/******************** PlnDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctRsrc("[");}
		if(plandefinitionrelatedartifact.hasResource()) {

			p.addPlnDfnRltedArtfctRsrc(String.valueOf(plandefinitionrelatedartifact.getResource()));
		} else {
			p.addPlnDfnRltedArtfctRsrc("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctRsrc("]");}


		/******************** plandefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitionrelatedartifacttype = plandefinitionrelatedartifact.getType();
		if(plandefinitionrelatedartifacttype!=null) {
		if(plandefinitionrelatedartifacti == 0) {

		p.addPlnDfnRltedArtfctTyp("[");		}
			p.addPlnDfnRltedArtfctTyp(plandefinitionrelatedartifacttype.toCode());
		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {

		p.addPlnDfnRltedArtfctTyp("]");		}

		} else {
			p.addPlnDfnRltedArtfctTyp("NULL");
		}

		/******************** PlnDfn_RltedArtfct_Url ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctUrl("[");}
		if(plandefinitionrelatedartifact.hasUrl()) {

			p.addPlnDfnRltedArtfctUrl(String.valueOf(plandefinitionrelatedartifact.getUrl()));
		} else {
			p.addPlnDfnRltedArtfctUrl("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctUrl("]");}


		/******************** PlnDfn_RltedArtfct_Citation ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctCitation("[");}
		if(plandefinitionrelatedartifact.hasCitation()) {

			p.addPlnDfnRltedArtfctCitation(String.valueOf(plandefinitionrelatedartifact.getCitation()));
		} else {
			p.addPlnDfnRltedArtfctCitation("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctCitation("]");}


		/******************** PlnDfn_RltedArtfct_Lbl ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctLbl("[");}
		if(plandefinitionrelatedartifact.hasLabel()) {

			p.addPlnDfnRltedArtfctLbl(String.valueOf(plandefinitionrelatedartifact.getLabel()));
		} else {
			p.addPlnDfnRltedArtfctLbl("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctLbl("]");}


		/******************** plandefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionrelatedartifactdocument = plandefinitionrelatedartifact.getDocument();

		/******************** PlnDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocSz("[");}
		if(plandefinitionrelatedartifactdocument.hasSize()) {

			p.addPlnDfnRltedArtfctDocSz(String.valueOf(plandefinitionrelatedartifactdocument.getSize()));
		} else {
			p.addPlnDfnRltedArtfctDocSz("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocSz("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocLnguage("[");}
		if(plandefinitionrelatedartifactdocument.hasLanguage()) {

			p.addPlnDfnRltedArtfctDocLnguage(String.valueOf(plandefinitionrelatedartifactdocument.getLanguage()));
		} else {
			p.addPlnDfnRltedArtfctDocLnguage("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocLnguage("]");}


		/******************** PlnDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocCntntTyp("[");}
		if(plandefinitionrelatedartifactdocument.hasContentType()) {

			p.addPlnDfnRltedArtfctDocCntntTyp(String.valueOf(plandefinitionrelatedartifactdocument.getContentType()));
		} else {
			p.addPlnDfnRltedArtfctDocCntntTyp("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocCntntTyp("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocHash("[");}
		if(plandefinitionrelatedartifactdocument.hasHash()) {

			p.addPlnDfnRltedArtfctDocHash(new String(plandefinitionrelatedartifactdocument.getHash()));
		} else {
			p.addPlnDfnRltedArtfctDocHash("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocHash("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocData("[");}
		if(plandefinitionrelatedartifactdocument.hasData()) {

			p.addPlnDfnRltedArtfctDocData(new String(plandefinitionrelatedartifactdocument.getData()));
		} else {
			p.addPlnDfnRltedArtfctDocData("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocData("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocCreation("[");}
		if(plandefinitionrelatedartifactdocument.hasCreation()) {

			p.addPlnDfnRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionrelatedartifactdocument.getCreation())+"\"");
		} else {
			p.addPlnDfnRltedArtfctDocCreation("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocCreation("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocTtl("[");}
		if(plandefinitionrelatedartifactdocument.hasTitle()) {

			p.addPlnDfnRltedArtfctDocTtl(String.valueOf(plandefinitionrelatedartifactdocument.getTitle()));
		} else {
			p.addPlnDfnRltedArtfctDocTtl("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocTtl("]");}


		/******************** PlnDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(plandefinitionrelatedartifacti == 0) {p.addPlnDfnRltedArtfctDocUrl("[");}
		if(plandefinitionrelatedartifactdocument.hasUrl()) {

			p.addPlnDfnRltedArtfctDocUrl(String.valueOf(plandefinitionrelatedartifactdocument.getUrl()));
		} else {
			p.addPlnDfnRltedArtfctDocUrl("NULL");
		}

		if(plandefinitionrelatedartifacti == plandefinitionrelatedartifactlist.size()-1) {p.addPlnDfnRltedArtfctDocUrl("]");}


		 };
		/******************** PlnDfn_Prpse ********************************************************************************/
		if(plandefinition.hasPurpose()) {

			p.addPlnDfnPrpse(String.valueOf(plandefinition.getPurpose()));
		} else {
			p.addPlnDfnPrpse("NULL");
		}


		/******************** PlnDfn_Url ********************************************************************************/
		if(plandefinition.hasUrl()) {

			p.addPlnDfnUrl(String.valueOf(plandefinition.getUrl()));
		} else {
			p.addPlnDfnUrl("NULL");
		}


		/******************** PlnDfn_Subtitle ********************************************************************************/
		if(plandefinition.hasSubtitle()) {

			p.addPlnDfnSubtitle(String.valueOf(plandefinition.getSubtitle()));
		} else {
			p.addPlnDfnSubtitle("NULL");
		}


		/******************** plandefinitiontopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> plandefinitiontopiclist = plandefinition.getTopic();
		for(int plandefinitiontopici = 0; plandefinitiontopici<plandefinitiontopiclist.size();plandefinitiontopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  plandefinitiontopic = plandefinitiontopiclist.get(plandefinitiontopici);

		/******************** PlnDfn_Topic_Txt ********************************************************************************/
		if(plandefinitiontopici == 0) {p.addPlnDfnTopicTxt("[");}
		if(plandefinitiontopic.hasText()) {

			p.addPlnDfnTopicTxt(String.valueOf(plandefinitiontopic.getText()));
		} else {
			p.addPlnDfnTopicTxt("NULL");
		}

		if(plandefinitiontopici == plandefinitiontopiclist.size()-1) {p.addPlnDfnTopicTxt("]");}


		/******************** plandefinitiontopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitiontopiccodinglist = plandefinitiontopic.getCoding();
		for(int plandefinitiontopiccodingi = 0; plandefinitiontopiccodingi<plandefinitiontopiccodinglist.size();plandefinitiontopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitiontopiccoding = plandefinitiontopiccodinglist.get(plandefinitiontopiccodingi);

		/******************** PlnDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(plandefinitiontopiccodingi == 0) {p.addPlnDfnTopicCdgDsply("[[");}
		if(plandefinitiontopiccoding.hasDisplay()) {

			p.addPlnDfnTopicCdgDsply(String.valueOf(plandefinitiontopiccoding.getDisplay()));
		} else {
			p.addPlnDfnTopicCdgDsply("NULL");
		}

		if(plandefinitiontopiccodingi == plandefinitiontopiccodinglist.size()-1) {p.addPlnDfnTopicCdgDsply("]]");}


		/******************** PlnDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiontopiccodingi == 0) {p.addPlnDfnTopicCdgVrsn("[[");}
		if(plandefinitiontopiccoding.hasVersion()) {

			p.addPlnDfnTopicCdgVrsn(String.valueOf(plandefinitiontopiccoding.getVersion()));
		} else {
			p.addPlnDfnTopicCdgVrsn("NULL");
		}

		if(plandefinitiontopiccodingi == plandefinitiontopiccodinglist.size()-1) {p.addPlnDfnTopicCdgVrsn("]]");}


		/******************** PlnDfn_Topic_Cdg_Cd ********************************************************************************/
		if(plandefinitiontopiccodingi == 0) {p.addPlnDfnTopicCdgCd("[[");}
		if(plandefinitiontopiccoding.hasCode()) {

			p.addPlnDfnTopicCdgCd(String.valueOf(plandefinitiontopiccoding.getCode()));
		} else {
			p.addPlnDfnTopicCdgCd("NULL");
		}

		if(plandefinitiontopiccodingi == plandefinitiontopiccodinglist.size()-1) {p.addPlnDfnTopicCdgCd("]]");}


		/******************** PlnDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiontopiccodingi == 0) {p.addPlnDfnTopicCdgUsrSltd("[[");}
		if(plandefinitiontopiccoding.hasUserSelected()) {

			p.addPlnDfnTopicCdgUsrSltd(String.valueOf(plandefinitiontopiccoding.getUserSelected()));
		} else {
			p.addPlnDfnTopicCdgUsrSltd("NULL");
		}

		if(plandefinitiontopiccodingi == plandefinitiontopiccodinglist.size()-1) {p.addPlnDfnTopicCdgUsrSltd("]]");}


		/******************** PlnDfn_Topic_Cdg_Sys ********************************************************************************/
		if(plandefinitiontopiccodingi == 0) {p.addPlnDfnTopicCdgSys("[[");}
		if(plandefinitiontopiccoding.hasSystem()) {

			p.addPlnDfnTopicCdgSys(String.valueOf(plandefinitiontopiccoding.getSystem()));
		} else {
			p.addPlnDfnTopicCdgSys("NULL");
		}

		if(plandefinitiontopiccodingi == plandefinitiontopiccodinglist.size()-1) {p.addPlnDfnTopicCdgSys("]]");}


		 };
		 };
		/******************** plandefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> plandefinitionjurisdictionlist = plandefinition.getJurisdiction();
		for(int plandefinitionjurisdictioni = 0; plandefinitionjurisdictioni<plandefinitionjurisdictionlist.size();plandefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  plandefinitionjurisdiction = plandefinitionjurisdictionlist.get(plandefinitionjurisdictioni);

		/******************** PlnDfn_Jrsdctn_Txt ********************************************************************************/
		if(plandefinitionjurisdictioni == 0) {p.addPlnDfnJrsdctnTxt("[");}
		if(plandefinitionjurisdiction.hasText()) {

			p.addPlnDfnJrsdctnTxt(String.valueOf(plandefinitionjurisdiction.getText()));
		} else {
			p.addPlnDfnJrsdctnTxt("NULL");
		}

		if(plandefinitionjurisdictioni == plandefinitionjurisdictionlist.size()-1) {p.addPlnDfnJrsdctnTxt("]");}


		/******************** plandefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionjurisdictioncodinglist = plandefinitionjurisdiction.getCoding();
		for(int plandefinitionjurisdictioncodingi = 0; plandefinitionjurisdictioncodingi<plandefinitionjurisdictioncodinglist.size();plandefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionjurisdictioncoding = plandefinitionjurisdictioncodinglist.get(plandefinitionjurisdictioncodingi);

		/******************** PlnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(plandefinitionjurisdictioncodingi == 0) {p.addPlnDfnJrsdctnCdgDsply("[[");}
		if(plandefinitionjurisdictioncoding.hasDisplay()) {

			p.addPlnDfnJrsdctnCdgDsply(String.valueOf(plandefinitionjurisdictioncoding.getDisplay()));
		} else {
			p.addPlnDfnJrsdctnCdgDsply("NULL");
		}

		if(plandefinitionjurisdictioncodingi == plandefinitionjurisdictioncodinglist.size()-1) {p.addPlnDfnJrsdctnCdgDsply("]]");}


		/******************** PlnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionjurisdictioncodingi == 0) {p.addPlnDfnJrsdctnCdgVrsn("[[");}
		if(plandefinitionjurisdictioncoding.hasVersion()) {

			p.addPlnDfnJrsdctnCdgVrsn(String.valueOf(plandefinitionjurisdictioncoding.getVersion()));
		} else {
			p.addPlnDfnJrsdctnCdgVrsn("NULL");
		}

		if(plandefinitionjurisdictioncodingi == plandefinitionjurisdictioncodinglist.size()-1) {p.addPlnDfnJrsdctnCdgVrsn("]]");}


		/******************** PlnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(plandefinitionjurisdictioncodingi == 0) {p.addPlnDfnJrsdctnCdgCd("[[");}
		if(plandefinitionjurisdictioncoding.hasCode()) {

			p.addPlnDfnJrsdctnCdgCd(String.valueOf(plandefinitionjurisdictioncoding.getCode()));
		} else {
			p.addPlnDfnJrsdctnCdgCd("NULL");
		}

		if(plandefinitionjurisdictioncodingi == plandefinitionjurisdictioncodinglist.size()-1) {p.addPlnDfnJrsdctnCdgCd("]]");}


		/******************** PlnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionjurisdictioncodingi == 0) {p.addPlnDfnJrsdctnCdgUsrSltd("[[");}
		if(plandefinitionjurisdictioncoding.hasUserSelected()) {

			p.addPlnDfnJrsdctnCdgUsrSltd(String.valueOf(plandefinitionjurisdictioncoding.getUserSelected()));
		} else {
			p.addPlnDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(plandefinitionjurisdictioncodingi == plandefinitionjurisdictioncodinglist.size()-1) {p.addPlnDfnJrsdctnCdgUsrSltd("]]");}


		/******************** PlnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(plandefinitionjurisdictioncodingi == 0) {p.addPlnDfnJrsdctnCdgSys("[[");}
		if(plandefinitionjurisdictioncoding.hasSystem()) {

			p.addPlnDfnJrsdctnCdgSys(String.valueOf(plandefinitionjurisdictioncoding.getSystem()));
		} else {
			p.addPlnDfnJrsdctnCdgSys("NULL");
		}

		if(plandefinitionjurisdictioncodingi == plandefinitionjurisdictioncodinglist.size()-1) {p.addPlnDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** plandefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> plandefinitionusecontextlist = plandefinition.getUseContext();
		for(int plandefinitionusecontexti = 0; plandefinitionusecontexti<plandefinitionusecontextlist.size();plandefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  plandefinitionusecontext = plandefinitionusecontextlist.get(plandefinitionusecontexti);

		/******************** plandefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionusecontextcode = plandefinitionusecontext.getCode();

		/******************** PlnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtCdDsply("[");}
		if(plandefinitionusecontextcode.hasDisplay()) {

			p.addPlnDfnUseCntxtCdDsply(String.valueOf(plandefinitionusecontextcode.getDisplay()));
		} else {
			p.addPlnDfnUseCntxtCdDsply("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtCdDsply("]");}


		/******************** PlnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtCdVrsn("[");}
		if(plandefinitionusecontextcode.hasVersion()) {

			p.addPlnDfnUseCntxtCdVrsn(String.valueOf(plandefinitionusecontextcode.getVersion()));
		} else {
			p.addPlnDfnUseCntxtCdVrsn("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtCdVrsn("]");}


		/******************** PlnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtCdUsrSltd("[");}
		if(plandefinitionusecontextcode.hasUserSelected()) {

			p.addPlnDfnUseCntxtCdUsrSltd(String.valueOf(plandefinitionusecontextcode.getUserSelected()));
		} else {
			p.addPlnDfnUseCntxtCdUsrSltd("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtCdUsrSltd("]");}


		/******************** PlnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtCdSys("[");}
		if(plandefinitionusecontextcode.hasSystem()) {

			p.addPlnDfnUseCntxtCdSys(String.valueOf(plandefinitionusecontextcode.getSystem()));
		} else {
			p.addPlnDfnUseCntxtCdSys("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtCdSys("]");}


		/******************** PlnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRfrnc("[");}
		if(plandefinitionusecontext.hasValueReference()) {

			if(plandefinitionusecontext.getValueReference().getReference() != null) {
			p.addPlnDfnUseCntxtVlRfrnc(plandefinitionusecontext.getValueReference().getReference());
			}
		} else {
			p.addPlnDfnUseCntxtVlRfrnc("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRfrnc("]");}


		/******************** plandefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionusecontextvaluecodeableconcept = plandefinitionusecontext.getValueCodeableConcept();

		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlCdbleCncptTxt("[");}
		if(plandefinitionusecontextvaluecodeableconcept.hasText()) {

			p.addPlnDfnUseCntxtVlCdbleCncptTxt(String.valueOf(plandefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** plandefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> plandefinitionusecontextvaluecodeableconceptcodinglist = plandefinitionusecontextvaluecodeableconcept.getCoding();
		for(int plandefinitionusecontextvaluecodeableconceptcodingi = 0; plandefinitionusecontextvaluecodeableconceptcodingi<plandefinitionusecontextvaluecodeableconceptcodinglist.size();plandefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  plandefinitionusecontextvaluecodeableconceptcoding = plandefinitionusecontextvaluecodeableconceptcodinglist.get(plandefinitionusecontextvaluecodeableconceptcodingi);

		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcodingi == 0) {p.addPlnDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			p.addPlnDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(plandefinitionusecontextvaluecodeableconceptcodingi == plandefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcodingi == 0) {p.addPlnDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			p.addPlnDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(plandefinitionusecontextvaluecodeableconceptcodingi == plandefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcodingi == 0) {p.addPlnDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			p.addPlnDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(plandefinitionusecontextvaluecodeableconceptcodingi == plandefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcodingi == 0) {p.addPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			p.addPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(plandefinitionusecontextvaluecodeableconceptcodingi == plandefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcodingi == 0) {p.addPlnDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			p.addPlnDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			p.addPlnDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(plandefinitionusecontextvaluecodeableconceptcodingi == plandefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {p.addPlnDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** plandefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionusecontextvaluerange = plandefinitionusecontext.getValueRange();

		/******************** plandefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangelow = plandefinitionusecontextvaluerange.getLow();

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngLwVl("[");}
		if(plandefinitionusecontextvaluerangelow.hasValue()) {

			p.addPlnDfnUseCntxtVlRngLwVl(String.valueOf(plandefinitionusecontextvaluerangelow.getValue()));
		} else {
			p.addPlnDfnUseCntxtVlRngLwVl("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngLwVl("]");}


		/******************** plandefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluerangelowcomparator = plandefinitionusecontextvaluerangelow.getComparator();
		if(plandefinitionusecontextvaluerangelowcomparator!=null) {
		if(plandefinitionusecontexti == 0) {

		p.addPlnDfnUseCntxtVlRngLwCmprtr("[");		}
			p.addPlnDfnUseCntxtVlRngLwCmprtr(plandefinitionusecontextvaluerangelowcomparator.toCode());
		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {

		p.addPlnDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			p.addPlnDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngLwCd("[");}
		if(plandefinitionusecontextvaluerangelow.hasCode()) {

			p.addPlnDfnUseCntxtVlRngLwCd(String.valueOf(plandefinitionusecontextvaluerangelow.getCode()));
		} else {
			p.addPlnDfnUseCntxtVlRngLwCd("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngLwCd("]");}


		/******************** PlnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngLwUnt("[");}
		if(plandefinitionusecontextvaluerangelow.hasUnit()) {

			p.addPlnDfnUseCntxtVlRngLwUnt(String.valueOf(plandefinitionusecontextvaluerangelow.getUnit()));
		} else {
			p.addPlnDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngLwUnt("]");}


		/******************** PlnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngLwSys("[");}
		if(plandefinitionusecontextvaluerangelow.hasSystem()) {

			p.addPlnDfnUseCntxtVlRngLwSys(String.valueOf(plandefinitionusecontextvaluerangelow.getSystem()));
		} else {
			p.addPlnDfnUseCntxtVlRngLwSys("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngLwSys("]");}


		/******************** plandefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangehigh = plandefinitionusecontextvaluerange.getHigh();

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngHiVl("[");}
		if(plandefinitionusecontextvaluerangehigh.hasValue()) {

			p.addPlnDfnUseCntxtVlRngHiVl(String.valueOf(plandefinitionusecontextvaluerangehigh.getValue()));
		} else {
			p.addPlnDfnUseCntxtVlRngHiVl("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngHiVl("]");}


		/******************** plandefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluerangehighcomparator = plandefinitionusecontextvaluerangehigh.getComparator();
		if(plandefinitionusecontextvaluerangehighcomparator!=null) {
		if(plandefinitionusecontexti == 0) {

		p.addPlnDfnUseCntxtVlRngHiCmprtr("[");		}
			p.addPlnDfnUseCntxtVlRngHiCmprtr(plandefinitionusecontextvaluerangehighcomparator.toCode());
		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {

		p.addPlnDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			p.addPlnDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngHiCd("[");}
		if(plandefinitionusecontextvaluerangehigh.hasCode()) {

			p.addPlnDfnUseCntxtVlRngHiCd(String.valueOf(plandefinitionusecontextvaluerangehigh.getCode()));
		} else {
			p.addPlnDfnUseCntxtVlRngHiCd("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngHiCd("]");}


		/******************** PlnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngHiUnt("[");}
		if(plandefinitionusecontextvaluerangehigh.hasUnit()) {

			p.addPlnDfnUseCntxtVlRngHiUnt(String.valueOf(plandefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			p.addPlnDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngHiUnt("]");}


		/******************** PlnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlRngHiSys("[");}
		if(plandefinitionusecontextvaluerangehigh.hasSystem()) {

			p.addPlnDfnUseCntxtVlRngHiSys(String.valueOf(plandefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			p.addPlnDfnUseCntxtVlRngHiSys("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlRngHiSys("]");}


		/******************** plandefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluequantity = plandefinitionusecontext.getValueQuantity();

		/******************** PlnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlQntyVl("[");}
		if(plandefinitionusecontextvaluequantity.hasValue()) {

			p.addPlnDfnUseCntxtVlQntyVl(String.valueOf(plandefinitionusecontextvaluequantity.getValue()));
		} else {
			p.addPlnDfnUseCntxtVlQntyVl("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlQntyVl("]");}


		/******************** plandefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluequantitycomparator = plandefinitionusecontextvaluequantity.getComparator();
		if(plandefinitionusecontextvaluequantitycomparator!=null) {
		if(plandefinitionusecontexti == 0) {

		p.addPlnDfnUseCntxtVlQntyCmprtr("[");		}
			p.addPlnDfnUseCntxtVlQntyCmprtr(plandefinitionusecontextvaluequantitycomparator.toCode());
		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {

		p.addPlnDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			p.addPlnDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** PlnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlQntyCd("[");}
		if(plandefinitionusecontextvaluequantity.hasCode()) {

			p.addPlnDfnUseCntxtVlQntyCd(String.valueOf(plandefinitionusecontextvaluequantity.getCode()));
		} else {
			p.addPlnDfnUseCntxtVlQntyCd("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlQntyCd("]");}


		/******************** PlnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlQntyUnt("[");}
		if(plandefinitionusecontextvaluequantity.hasUnit()) {

			p.addPlnDfnUseCntxtVlQntyUnt(String.valueOf(plandefinitionusecontextvaluequantity.getUnit()));
		} else {
			p.addPlnDfnUseCntxtVlQntyUnt("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlQntyUnt("]");}


		/******************** PlnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(plandefinitionusecontexti == 0) {p.addPlnDfnUseCntxtVlQntySys("[");}
		if(plandefinitionusecontextvaluequantity.hasSystem()) {

			p.addPlnDfnUseCntxtVlQntySys(String.valueOf(plandefinitionusecontextvaluequantity.getSystem()));
		} else {
			p.addPlnDfnUseCntxtVlQntySys("NULL");
		}

		if(plandefinitionusecontexti == plandefinitionusecontextlist.size()-1) {p.addPlnDfnUseCntxtVlQntySys("]");}


		 };
		/******************** PlnDfn_Exprmtl ********************************************************************************/
		if(plandefinition.hasExperimental()) {

			p.addPlnDfnExprmtl(String.valueOf(plandefinition.getExperimental()));
		} else {
			p.addPlnDfnExprmtl("NULL");
		}


		/******************** PlnDfn_Pblshr ********************************************************************************/
		if(plandefinition.hasPublisher()) {

			p.addPlnDfnPblshr(String.valueOf(plandefinition.getPublisher()));
		} else {
			p.addPlnDfnPblshr("NULL");
		}


		/******************** plandefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneffectiveperiod = plandefinition.getEffectivePeriod();

		/******************** PlnDfn_EfctivePrd_Strt ********************************************************************************/
		if(plandefinitioneffectiveperiod.hasStart()) {

			p.addPlnDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioneffectiveperiod.getStart())+"\"");
		} else {
			p.addPlnDfnEfctivePrdStrt("NULL");
		}


		/******************** PlnDfn_EfctivePrd_End ********************************************************************************/
		if(plandefinitioneffectiveperiod.hasEnd()) {

			p.addPlnDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnEfctivePrdEnd("NULL");
		}


		/******************** plandefinitionauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> plandefinitionauthorlist = plandefinition.getAuthor();
		for(int plandefinitionauthori = 0; plandefinitionauthori<plandefinitionauthorlist.size();plandefinitionauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  plandefinitionauthor = plandefinitionauthorlist.get(plandefinitionauthori);

		/******************** PlnDfn_Athr_Nm ********************************************************************************/
		if(plandefinitionauthori == 0) {p.addPlnDfnAthrNm("[");}
		if(plandefinitionauthor.hasName()) {

			p.addPlnDfnAthrNm(String.valueOf(plandefinitionauthor.getName()));
		} else {
			p.addPlnDfnAthrNm("NULL");
		}

		if(plandefinitionauthori == plandefinitionauthorlist.size()-1) {p.addPlnDfnAthrNm("]");}


		/******************** plandefinitionauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> plandefinitionauthortelecomlist = plandefinitionauthor.getTelecom();
		for(int plandefinitionauthortelecomi = 0; plandefinitionauthortelecomi<plandefinitionauthortelecomlist.size();plandefinitionauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  plandefinitionauthortelecom = plandefinitionauthortelecomlist.get(plandefinitionauthortelecomi);

		/******************** PlnDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionauthortelecomi == 0) {p.addPlnDfnAthrTlcmVl("[[");}
		if(plandefinitionauthortelecom.hasValue()) {

			p.addPlnDfnAthrTlcmVl(String.valueOf(plandefinitionauthortelecom.getValue()));
		} else {
			p.addPlnDfnAthrTlcmVl("NULL");
		}

		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {p.addPlnDfnAthrTlcmVl("]]");}


		/******************** plandefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionauthortelecomperiod = plandefinitionauthortelecom.getPeriod();

		/******************** PlnDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionauthortelecomi == 0) {p.addPlnDfnAthrTlcmPrdStrt("[[");}
		if(plandefinitionauthortelecomperiod.hasStart()) {

			p.addPlnDfnAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionauthortelecomperiod.getStart())+"\"");
		} else {
			p.addPlnDfnAthrTlcmPrdStrt("NULL");
		}

		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {p.addPlnDfnAthrTlcmPrdStrt("]]");}


		/******************** PlnDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionauthortelecomi == 0) {p.addPlnDfnAthrTlcmPrdEnd("[[");}
		if(plandefinitionauthortelecomperiod.hasEnd()) {

			p.addPlnDfnAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(plandefinitionauthortelecomperiod.getEnd())+"\"");
		} else {
			p.addPlnDfnAthrTlcmPrdEnd("NULL");
		}

		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {p.addPlnDfnAthrTlcmPrdEnd("]]");}


		/******************** plandefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionauthortelecomuse = plandefinitionauthortelecom.getUse();
		if(plandefinitionauthortelecomuse!=null) {
		if(plandefinitionauthortelecomi == 0) {

		p.addPlnDfnAthrTlcmUse("[[");		}
			p.addPlnDfnAthrTlcmUse(plandefinitionauthortelecomuse.toCode());
		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {

		p.addPlnDfnAthrTlcmUse("]]");		}

		} else {
			p.addPlnDfnAthrTlcmUse("NULL");
		}

		/******************** plandefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionauthortelecomsystem = plandefinitionauthortelecom.getSystem();
		if(plandefinitionauthortelecomsystem!=null) {
		if(plandefinitionauthortelecomi == 0) {

		p.addPlnDfnAthrTlcmSys("[[");		}
			p.addPlnDfnAthrTlcmSys(plandefinitionauthortelecomsystem.toCode());
		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {

		p.addPlnDfnAthrTlcmSys("]]");		}

		} else {
			p.addPlnDfnAthrTlcmSys("NULL");
		}

		/******************** PlnDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionauthortelecomi == 0) {p.addPlnDfnAthrTlcmRnk("[[");}
		if(plandefinitionauthortelecom.hasRank()) {

			p.addPlnDfnAthrTlcmRnk(String.valueOf(plandefinitionauthortelecom.getRank()));
		} else {
			p.addPlnDfnAthrTlcmRnk("NULL");
		}

		if(plandefinitionauthortelecomi == plandefinitionauthortelecomlist.size()-1) {p.addPlnDfnAthrTlcmRnk("]]");}


		 };
		 };
		return p;
	}
}
