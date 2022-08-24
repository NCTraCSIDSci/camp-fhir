package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSourceMaterial;
public class SubstanceSourceMaterialBidirectionalConversion 
{
	public SubstanceSourceMaterial SubstanceSourceMaterials(org.hl7.fhir.r4.model.SubstanceSourceMaterial substancesourcematerial) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceSourceMaterial s = new  main.java.com.campfhir.model.SubstanceSourceMaterial();

		/******************** id ********************************************************************************/
		s.setId(substancesourcematerial.getIdElement().getIdPart());

		/******************** SbstncSrcMtrl_OrgnsmNm ********************************************************************************/
		if(substancesourcematerial.hasOrganismName()) {

			s.addSbstncSrcMtrlOrgnsmNm(String.valueOf(substancesourcematerial.getOrganismName()));
		} else {
			s.addSbstncSrcMtrlOrgnsmNm("NULL");
		}


		/******************** substancesourcematerialorganismid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancesourcematerialorganismid = substancesourcematerial.getOrganismId();

		/******************** SbstncSrcMtrl_OrgnsmId_Vl ********************************************************************************/
		if(substancesourcematerialorganismid.hasValue()) {

			s.addSbstncSrcMtrlOrgnsmIdVl(String.valueOf(substancesourcematerialorganismid.getValue()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdVl("NULL");
		}


		/******************** substancesourcematerialorganismidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismidtype = substancesourcematerialorganismid.getType();

		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Txt ********************************************************************************/
		if(substancesourcematerialorganismidtype.hasText()) {

			s.addSbstncSrcMtrlOrgnsmIdTypTxt(String.valueOf(substancesourcematerialorganismidtype.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypTxt("NULL");
		}


		/******************** substancesourcematerialorganismidtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismidtypecodinglist = substancesourcematerialorganismidtype.getCoding();
		for(int substancesourcematerialorganismidtypecodingi = 0; substancesourcematerialorganismidtypecodingi<substancesourcematerialorganismidtypecodinglist.size();substancesourcematerialorganismidtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismidtypecoding = substancesourcematerialorganismidtypecodinglist.get(substancesourcematerialorganismidtypecodingi);

		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismidtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIdTypCdgDsply("[");}
		if(substancesourcematerialorganismidtypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmIdTypCdgDsply(String.valueOf(substancesourcematerialorganismidtypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypCdgDsply("NULL");
		}

		if(substancesourcematerialorganismidtypecodingi == substancesourcematerialorganismidtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIdTypCdgDsply("]");}


		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismidtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIdTypCdgVrsn("[");}
		if(substancesourcematerialorganismidtypecoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmIdTypCdgVrsn(String.valueOf(substancesourcematerialorganismidtypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismidtypecodingi == substancesourcematerialorganismidtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIdTypCdgVrsn("]");}


		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismidtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIdTypCdgCd("[");}
		if(substancesourcematerialorganismidtypecoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmIdTypCdgCd(String.valueOf(substancesourcematerialorganismidtypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypCdgCd("NULL");
		}

		if(substancesourcematerialorganismidtypecodingi == substancesourcematerialorganismidtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIdTypCdgCd("]");}


		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismidtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd("[");}
		if(substancesourcematerialorganismidtypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismidtypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismidtypecodingi == substancesourcematerialorganismidtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismidtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIdTypCdgSys("[");}
		if(substancesourcematerialorganismidtypecoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmIdTypCdgSys(String.valueOf(substancesourcematerialorganismidtypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdTypCdgSys("NULL");
		}

		if(substancesourcematerialorganismidtypecodingi == substancesourcematerialorganismidtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIdTypCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialorganismidperiod = substancesourcematerialorganismid.getPeriod();

		/******************** SbstncSrcMtrl_OrgnsmId_Prd_Strt ********************************************************************************/
		if(substancesourcematerialorganismidperiod.hasStart()) {

			s.addSbstncSrcMtrlOrgnsmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancesourcematerialorganismidperiod.getStart())+"\"");
		} else {
			s.addSbstncSrcMtrlOrgnsmIdPrdStrt("NULL");
		}


		/******************** SbstncSrcMtrl_OrgnsmId_Prd_End ********************************************************************************/
		if(substancesourcematerialorganismidperiod.hasEnd()) {

			s.addSbstncSrcMtrlOrgnsmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancesourcematerialorganismidperiod.getEnd())+"\"");
		} else {
			s.addSbstncSrcMtrlOrgnsmIdPrdEnd("NULL");
		}


		/******************** substancesourcematerialorganismiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancesourcematerialorganismiduse = substancesourcematerialorganismid.getUse();
		if(substancesourcematerialorganismiduse!=null) {
			s.addSbstncSrcMtrlOrgnsmIdUse(substancesourcematerialorganismiduse.toCode());
		} else {
			s.addSbstncSrcMtrlOrgnsmIdUse("NULL");
		}

		/******************** SbstncSrcMtrl_OrgnsmId_Assigner ********************************************************************************/
		if(substancesourcematerialorganismid.hasAssigner()) {

			if(substancesourcematerialorganismid.getAssigner().getReference() != null) {
			s.addSbstncSrcMtrlOrgnsmIdAssigner(substancesourcematerialorganismid.getAssigner().getReference());
			}
		} else {
			s.addSbstncSrcMtrlOrgnsmIdAssigner("NULL");
		}


		/******************** SbstncSrcMtrl_OrgnsmId_Sys ********************************************************************************/
		if(substancesourcematerialorganismid.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmIdSys(String.valueOf(substancesourcematerialorganismid.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIdSys("NULL");
		}


		/******************** substancesourcematerialpartdescription ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent> substancesourcematerialpartdescriptionlist = substancesourcematerial.getPartDescription();
		for(int substancesourcematerialpartdescriptioni = 0; substancesourcematerialpartdescriptioni<substancesourcematerialpartdescriptionlist.size();substancesourcematerialpartdescriptioni++ ) {
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent  substancesourcematerialpartdescription = substancesourcematerialpartdescriptionlist.get(substancesourcematerialpartdescriptioni);

		/******************** substancesourcematerialpartdescriptionpart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpart = substancesourcematerialpartdescription.getPart();

		/******************** SbstncSrcMtrl_PartDscrptn_Part_Txt ********************************************************************************/
		if(substancesourcematerialpartdescriptioni == 0) {s.addSbstncSrcMtrlPartDscrptnPartTxt("[");}
		if(substancesourcematerialpartdescriptionpart.hasText()) {

			s.addSbstncSrcMtrlPartDscrptnPartTxt(String.valueOf(substancesourcematerialpartdescriptionpart.getText()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartTxt("NULL");
		}

		if(substancesourcematerialpartdescriptioni == substancesourcematerialpartdescriptionlist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartTxt("]");}


		/******************** substancesourcematerialpartdescriptionpartcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialpartdescriptionpartcodinglist = substancesourcematerialpartdescriptionpart.getCoding();
		for(int substancesourcematerialpartdescriptionpartcodingi = 0; substancesourcematerialpartdescriptionpartcodingi<substancesourcematerialpartdescriptionpartcodinglist.size();substancesourcematerialpartdescriptionpartcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialpartdescriptionpartcoding = substancesourcematerialpartdescriptionpartcodinglist.get(substancesourcematerialpartdescriptionpartcodingi);

		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartCdgDsply("[[");}
		if(substancesourcematerialpartdescriptionpartcoding.hasDisplay()) {

			s.addSbstncSrcMtrlPartDscrptnPartCdgDsply(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartCdgDsply("NULL");
		}

		if(substancesourcematerialpartdescriptionpartcodingi == substancesourcematerialpartdescriptionpartcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartCdgDsply("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartCdgVrsn("[[");}
		if(substancesourcematerialpartdescriptionpartcoding.hasVersion()) {

			s.addSbstncSrcMtrlPartDscrptnPartCdgVrsn(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartCdgVrsn("NULL");
		}

		if(substancesourcematerialpartdescriptionpartcodingi == substancesourcematerialpartdescriptionpartcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartCdgCd("[[");}
		if(substancesourcematerialpartdescriptionpartcoding.hasCode()) {

			s.addSbstncSrcMtrlPartDscrptnPartCdgCd(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getCode()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartCdgCd("NULL");
		}

		if(substancesourcematerialpartdescriptionpartcodingi == substancesourcematerialpartdescriptionpartcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartCdgCd("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartCdgUsrSltd("[[");}
		if(substancesourcematerialpartdescriptionpartcoding.hasUserSelected()) {

			s.addSbstncSrcMtrlPartDscrptnPartCdgUsrSltd(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartCdgUsrSltd("NULL");
		}

		if(substancesourcematerialpartdescriptionpartcodingi == substancesourcematerialpartdescriptionpartcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartCdgSys("[[");}
		if(substancesourcematerialpartdescriptionpartcoding.hasSystem()) {

			s.addSbstncSrcMtrlPartDscrptnPartCdgSys(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartCdgSys("NULL");
		}

		if(substancesourcematerialpartdescriptionpartcodingi == substancesourcematerialpartdescriptionpartcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartCdgSys("]]");}


		 };
		/******************** substancesourcematerialpartdescriptionpartlocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpartlocation = substancesourcematerialpartdescription.getPartLocation();

		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Txt ********************************************************************************/
		if(substancesourcematerialpartdescriptioni == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnTxt("[");}
		if(substancesourcematerialpartdescriptionpartlocation.hasText()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnTxt(String.valueOf(substancesourcematerialpartdescriptionpartlocation.getText()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnTxt("NULL");
		}

		if(substancesourcematerialpartdescriptioni == substancesourcematerialpartdescriptionlist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnTxt("]");}


		/******************** substancesourcematerialpartdescriptionpartlocationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialpartdescriptionpartlocationcodinglist = substancesourcematerialpartdescriptionpartlocation.getCoding();
		for(int substancesourcematerialpartdescriptionpartlocationcodingi = 0; substancesourcematerialpartdescriptionpartlocationcodingi<substancesourcematerialpartdescriptionpartlocationcodinglist.size();substancesourcematerialpartdescriptionpartlocationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialpartdescriptionpartlocationcoding = substancesourcematerialpartdescriptionpartlocationcodinglist.get(substancesourcematerialpartdescriptionpartlocationcodingi);

		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgDsply("[[");}
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasDisplay()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgDsply(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgDsply("NULL");
		}

		if(substancesourcematerialpartdescriptionpartlocationcodingi == substancesourcematerialpartdescriptionpartlocationcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgDsply("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn("[[");}
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasVersion()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn("NULL");
		}

		if(substancesourcematerialpartdescriptionpartlocationcodingi == substancesourcematerialpartdescriptionpartlocationcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgCd("[[");}
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasCode()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgCd(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getCode()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgCd("NULL");
		}

		if(substancesourcematerialpartdescriptionpartlocationcodingi == substancesourcematerialpartdescriptionpartlocationcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgCd("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd("[[");}
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasUserSelected()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd("NULL");
		}

		if(substancesourcematerialpartdescriptionpartlocationcodingi == substancesourcematerialpartdescriptionpartlocationcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcodingi == 0) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgSys("[[");}
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasSystem()) {

			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgSys(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlPartDscrptnPartLctnCdgSys("NULL");
		}

		if(substancesourcematerialpartdescriptionpartlocationcodingi == substancesourcematerialpartdescriptionpartlocationcodinglist.size()-1) {s.addSbstncSrcMtrlPartDscrptnPartLctnCdgSys("]]");}


		 };
		 };
		/******************** substancesourcematerialcountryoforigin ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancesourcematerialcountryoforiginlist = substancesourcematerial.getCountryOfOrigin();
		for(int substancesourcematerialcountryoforigini = 0; substancesourcematerialcountryoforigini<substancesourcematerialcountryoforiginlist.size();substancesourcematerialcountryoforigini++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancesourcematerialcountryoforigin = substancesourcematerialcountryoforiginlist.get(substancesourcematerialcountryoforigini);

		/******************** SbstncSrcMtrl_CntryOfOrigin_Txt ********************************************************************************/
		if(substancesourcematerialcountryoforigini == 0) {s.addSbstncSrcMtrlCntryOfOriginTxt("[");}
		if(substancesourcematerialcountryoforigin.hasText()) {

			s.addSbstncSrcMtrlCntryOfOriginTxt(String.valueOf(substancesourcematerialcountryoforigin.getText()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginTxt("NULL");
		}

		if(substancesourcematerialcountryoforigini == substancesourcematerialcountryoforiginlist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginTxt("]");}


		/******************** substancesourcematerialcountryoforigincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialcountryoforigincodinglist = substancesourcematerialcountryoforigin.getCoding();
		for(int substancesourcematerialcountryoforigincodingi = 0; substancesourcematerialcountryoforigincodingi<substancesourcematerialcountryoforigincodinglist.size();substancesourcematerialcountryoforigincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialcountryoforigincoding = substancesourcematerialcountryoforigincodinglist.get(substancesourcematerialcountryoforigincodingi);

		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialcountryoforigincodingi == 0) {s.addSbstncSrcMtrlCntryOfOriginCdgDsply("[[");}
		if(substancesourcematerialcountryoforigincoding.hasDisplay()) {

			s.addSbstncSrcMtrlCntryOfOriginCdgDsply(String.valueOf(substancesourcematerialcountryoforigincoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginCdgDsply("NULL");
		}

		if(substancesourcematerialcountryoforigincodingi == substancesourcematerialcountryoforigincodinglist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginCdgDsply("]]");}


		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialcountryoforigincodingi == 0) {s.addSbstncSrcMtrlCntryOfOriginCdgVrsn("[[");}
		if(substancesourcematerialcountryoforigincoding.hasVersion()) {

			s.addSbstncSrcMtrlCntryOfOriginCdgVrsn(String.valueOf(substancesourcematerialcountryoforigincoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginCdgVrsn("NULL");
		}

		if(substancesourcematerialcountryoforigincodingi == substancesourcematerialcountryoforigincodinglist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialcountryoforigincodingi == 0) {s.addSbstncSrcMtrlCntryOfOriginCdgCd("[[");}
		if(substancesourcematerialcountryoforigincoding.hasCode()) {

			s.addSbstncSrcMtrlCntryOfOriginCdgCd(String.valueOf(substancesourcematerialcountryoforigincoding.getCode()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginCdgCd("NULL");
		}

		if(substancesourcematerialcountryoforigincodingi == substancesourcematerialcountryoforigincodinglist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginCdgCd("]]");}


		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialcountryoforigincodingi == 0) {s.addSbstncSrcMtrlCntryOfOriginCdgUsrSltd("[[");}
		if(substancesourcematerialcountryoforigincoding.hasUserSelected()) {

			s.addSbstncSrcMtrlCntryOfOriginCdgUsrSltd(String.valueOf(substancesourcematerialcountryoforigincoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginCdgUsrSltd("NULL");
		}

		if(substancesourcematerialcountryoforigincodingi == substancesourcematerialcountryoforigincodinglist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialcountryoforigincodingi == 0) {s.addSbstncSrcMtrlCntryOfOriginCdgSys("[[");}
		if(substancesourcematerialcountryoforigincoding.hasSystem()) {

			s.addSbstncSrcMtrlCntryOfOriginCdgSys(String.valueOf(substancesourcematerialcountryoforigincoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlCntryOfOriginCdgSys("NULL");
		}

		if(substancesourcematerialcountryoforigincodingi == substancesourcematerialcountryoforigincodinglist.size()-1) {s.addSbstncSrcMtrlCntryOfOriginCdgSys("]]");}


		 };
		 };
		/******************** substancesourcematerialorganism ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent substancesourcematerialorganism = substancesourcematerial.getOrganism();

		/******************** substancesourcematerialorganismfamily ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismfamily = substancesourcematerialorganism.getFamily();

		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Txt ********************************************************************************/
		if(substancesourcematerialorganismfamily.hasText()) {

			s.addSbstncSrcMtrlOrgnsmFmlyTxt(String.valueOf(substancesourcematerialorganismfamily.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyTxt("NULL");
		}


		/******************** substancesourcematerialorganismfamilycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismfamilycodinglist = substancesourcematerialorganismfamily.getCoding();
		for(int substancesourcematerialorganismfamilycodingi = 0; substancesourcematerialorganismfamilycodingi<substancesourcematerialorganismfamilycodinglist.size();substancesourcematerialorganismfamilycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismfamilycoding = substancesourcematerialorganismfamilycodinglist.get(substancesourcematerialorganismfamilycodingi);

		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismfamilycodingi == 0) {s.addSbstncSrcMtrlOrgnsmFmlyCdgDsply("[");}
		if(substancesourcematerialorganismfamilycoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmFmlyCdgDsply(String.valueOf(substancesourcematerialorganismfamilycoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyCdgDsply("NULL");
		}

		if(substancesourcematerialorganismfamilycodingi == substancesourcematerialorganismfamilycodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmFmlyCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismfamilycodingi == 0) {s.addSbstncSrcMtrlOrgnsmFmlyCdgVrsn("[");}
		if(substancesourcematerialorganismfamilycoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmFmlyCdgVrsn(String.valueOf(substancesourcematerialorganismfamilycoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismfamilycodingi == substancesourcematerialorganismfamilycodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmFmlyCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismfamilycodingi == 0) {s.addSbstncSrcMtrlOrgnsmFmlyCdgCd("[");}
		if(substancesourcematerialorganismfamilycoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmFmlyCdgCd(String.valueOf(substancesourcematerialorganismfamilycoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyCdgCd("NULL");
		}

		if(substancesourcematerialorganismfamilycodingi == substancesourcematerialorganismfamilycodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmFmlyCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismfamilycodingi == 0) {s.addSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd("[");}
		if(substancesourcematerialorganismfamilycoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd(String.valueOf(substancesourcematerialorganismfamilycoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismfamilycodingi == substancesourcematerialorganismfamilycodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismfamilycodingi == 0) {s.addSbstncSrcMtrlOrgnsmFmlyCdgSys("[");}
		if(substancesourcematerialorganismfamilycoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmFmlyCdgSys(String.valueOf(substancesourcematerialorganismfamilycoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmFmlyCdgSys("NULL");
		}

		if(substancesourcematerialorganismfamilycodingi == substancesourcematerialorganismfamilycodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmFmlyCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismintraspecifictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismintraspecifictype = substancesourcematerialorganism.getIntraspecificType();

		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictype.hasText()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypTxt(String.valueOf(substancesourcematerialorganismintraspecifictype.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypTxt("NULL");
		}


		/******************** substancesourcematerialorganismintraspecifictypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismintraspecifictypecodinglist = substancesourcematerialorganismintraspecifictype.getCoding();
		for(int substancesourcematerialorganismintraspecifictypecodingi = 0; substancesourcematerialorganismintraspecifictypecodingi<substancesourcematerialorganismintraspecifictypecodinglist.size();substancesourcematerialorganismintraspecifictypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismintraspecifictypecoding = substancesourcematerialorganismintraspecifictypecodinglist.get(substancesourcematerialorganismintraspecifictypecodingi);

		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply("[");}
		if(substancesourcematerialorganismintraspecifictypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply("NULL");
		}

		if(substancesourcematerialorganismintraspecifictypecodingi == substancesourcematerialorganismintraspecifictypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn("[");}
		if(substancesourcematerialorganismintraspecifictypecoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismintraspecifictypecodingi == substancesourcematerialorganismintraspecifictypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd("[");}
		if(substancesourcematerialorganismintraspecifictypecoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd("NULL");
		}

		if(substancesourcematerialorganismintraspecifictypecodingi == substancesourcematerialorganismintraspecifictypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd("[");}
		if(substancesourcematerialorganismintraspecifictypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismintraspecifictypecodingi == substancesourcematerialorganismintraspecifictypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys("[");}
		if(substancesourcematerialorganismintraspecifictypecoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys("NULL");
		}

		if(substancesourcematerialorganismintraspecifictypecodingi == substancesourcematerialorganismintraspecifictypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys("]");}


		 };
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificDscrptn ********************************************************************************/
		if(substancesourcematerialorganism.hasIntraspecificDescription()) {

			s.addSbstncSrcMtrlOrgnsmIntraspecificDscrptn(String.valueOf(substancesourcematerialorganism.getIntraspecificDescription()));
		} else {
			s.addSbstncSrcMtrlOrgnsmIntraspecificDscrptn("NULL");
		}


		/******************** substancesourcematerialorganismhybrid ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent substancesourcematerialorganismhybrid = substancesourcematerialorganism.getHybrid();

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmId ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasMaternalOrganismId()) {

			s.addSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId(String.valueOf(substancesourcematerialorganismhybrid.getMaternalOrganismId()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId("NULL");
		}


		/******************** substancesourcematerialorganismhybridhybridtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismhybridhybridtype = substancesourcematerialorganismhybrid.getHybridType();

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtype.hasText()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypTxt(String.valueOf(substancesourcematerialorganismhybridhybridtype.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypTxt("NULL");
		}


		/******************** substancesourcematerialorganismhybridhybridtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismhybridhybridtypecodinglist = substancesourcematerialorganismhybridhybridtype.getCoding();
		for(int substancesourcematerialorganismhybridhybridtypecodingi = 0; substancesourcematerialorganismhybridhybridtypecodingi<substancesourcematerialorganismhybridhybridtypecodinglist.size();substancesourcematerialorganismhybridhybridtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismhybridhybridtypecoding = substancesourcematerialorganismhybridhybridtypecodinglist.get(substancesourcematerialorganismhybridhybridtypecodingi);

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply("[");}
		if(substancesourcematerialorganismhybridhybridtypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply("NULL");
		}

		if(substancesourcematerialorganismhybridhybridtypecodingi == substancesourcematerialorganismhybridhybridtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn("[");}
		if(substancesourcematerialorganismhybridhybridtypecoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismhybridhybridtypecodingi == substancesourcematerialorganismhybridhybridtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd("[");}
		if(substancesourcematerialorganismhybridhybridtypecoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd("NULL");
		}

		if(substancesourcematerialorganismhybridhybridtypecodingi == substancesourcematerialorganismhybridhybridtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd("[");}
		if(substancesourcematerialorganismhybridhybridtypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismhybridhybridtypecodingi == substancesourcematerialorganismhybridhybridtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys("[");}
		if(substancesourcematerialorganismhybridhybridtypecoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys("NULL");
		}

		if(substancesourcematerialorganismhybridhybridtypecodingi == substancesourcematerialorganismhybridhybridtypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys("]");}


		 };
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmNm ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasPaternalOrganismName()) {

			s.addSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm(String.valueOf(substancesourcematerialorganismhybrid.getPaternalOrganismName()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm("NULL");
		}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmId ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasPaternalOrganismId()) {

			s.addSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId(String.valueOf(substancesourcematerialorganismhybrid.getPaternalOrganismId()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId("NULL");
		}


		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmNm ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasMaternalOrganismName()) {

			s.addSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm(String.valueOf(substancesourcematerialorganismhybrid.getMaternalOrganismName()));
		} else {
			s.addSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm("NULL");
		}


		/******************** substancesourcematerialorganismorganismgeneral ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent substancesourcematerialorganismorganismgeneral = substancesourcematerialorganism.getOrganismGeneral();

		/******************** substancesourcematerialorganismorganismgeneralphylum ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralphylum = substancesourcematerialorganismorganismgeneral.getPhylum();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylum.hasText()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt(String.valueOf(substancesourcematerialorganismorganismgeneralphylum.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt("NULL");
		}


		/******************** substancesourcematerialorganismorganismgeneralphylumcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismorganismgeneralphylumcodinglist = substancesourcematerialorganismorganismgeneralphylum.getCoding();
		for(int substancesourcematerialorganismorganismgeneralphylumcodingi = 0; substancesourcematerialorganismorganismgeneralphylumcodingi<substancesourcematerialorganismorganismgeneralphylumcodinglist.size();substancesourcematerialorganismorganismgeneralphylumcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismorganismgeneralphylumcoding = substancesourcematerialorganismorganismgeneralphylumcodinglist.get(substancesourcematerialorganismorganismgeneralphylumcodingi);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply("[");}
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralphylumcodingi == substancesourcematerialorganismorganismgeneralphylumcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn("[");}
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralphylumcodingi == substancesourcematerialorganismorganismgeneralphylumcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd("[");}
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralphylumcodingi == substancesourcematerialorganismorganismgeneralphylumcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd("[");}
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralphylumcodingi == substancesourcematerialorganismorganismgeneralphylumcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys("[");}
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralphylumcodingi == substancesourcematerialorganismorganismgeneralphylumcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismorganismgeneralkingdom ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralkingdom = substancesourcematerialorganismorganismgeneral.getKingdom();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdom.hasText()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt(String.valueOf(substancesourcematerialorganismorganismgeneralkingdom.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt("NULL");
		}


		/******************** substancesourcematerialorganismorganismgeneralkingdomcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismorganismgeneralkingdomcodinglist = substancesourcematerialorganismorganismgeneralkingdom.getCoding();
		for(int substancesourcematerialorganismorganismgeneralkingdomcodingi = 0; substancesourcematerialorganismorganismgeneralkingdomcodingi<substancesourcematerialorganismorganismgeneralkingdomcodinglist.size();substancesourcematerialorganismorganismgeneralkingdomcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismorganismgeneralkingdomcoding = substancesourcematerialorganismorganismgeneralkingdomcodinglist.get(substancesourcematerialorganismorganismgeneralkingdomcodingi);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply("[");}
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == substancesourcematerialorganismorganismgeneralkingdomcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn("[");}
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == substancesourcematerialorganismorganismgeneralkingdomcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd("[");}
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == substancesourcematerialorganismorganismgeneralkingdomcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd("[");}
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == substancesourcematerialorganismorganismgeneralkingdomcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys("[");}
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralkingdomcodingi == substancesourcematerialorganismorganismgeneralkingdomcodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismorganismgeneralorder ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralorder = substancesourcematerialorganismorganismgeneral.getOrder();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralorder.hasText()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt(String.valueOf(substancesourcematerialorganismorganismgeneralorder.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt("NULL");
		}


		/******************** substancesourcematerialorganismorganismgeneralordercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismorganismgeneralordercodinglist = substancesourcematerialorganismorganismgeneralorder.getCoding();
		for(int substancesourcematerialorganismorganismgeneralordercodingi = 0; substancesourcematerialorganismorganismgeneralordercodingi<substancesourcematerialorganismorganismgeneralordercodinglist.size();substancesourcematerialorganismorganismgeneralordercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismorganismgeneralordercoding = substancesourcematerialorganismorganismgeneralordercodinglist.get(substancesourcematerialorganismorganismgeneralordercodingi);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply("[");}
		if(substancesourcematerialorganismorganismgeneralordercoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralordercodingi == substancesourcematerialorganismorganismgeneralordercodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn("[");}
		if(substancesourcematerialorganismorganismgeneralordercoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralordercodingi == substancesourcematerialorganismorganismgeneralordercodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd("[");}
		if(substancesourcematerialorganismorganismgeneralordercoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralordercodingi == substancesourcematerialorganismorganismgeneralordercodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd("[");}
		if(substancesourcematerialorganismorganismgeneralordercoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralordercodingi == substancesourcematerialorganismorganismgeneralordercodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys("[");}
		if(substancesourcematerialorganismorganismgeneralordercoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralordercodingi == substancesourcematerialorganismorganismgeneralordercodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismorganismgeneralclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralclass = substancesourcematerialorganismorganismgeneral.getClass_();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclass.hasText()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt(String.valueOf(substancesourcematerialorganismorganismgeneralclass.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt("NULL");
		}


		/******************** substancesourcematerialorganismorganismgeneralclasscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismorganismgeneralclasscodinglist = substancesourcematerialorganismorganismgeneralclass.getCoding();
		for(int substancesourcematerialorganismorganismgeneralclasscodingi = 0; substancesourcematerialorganismorganismgeneralclasscodingi<substancesourcematerialorganismorganismgeneralclasscodinglist.size();substancesourcematerialorganismorganismgeneralclasscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismorganismgeneralclasscoding = substancesourcematerialorganismorganismgeneralclasscodinglist.get(substancesourcematerialorganismorganismgeneralclasscodingi);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply("[");}
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralclasscodingi == substancesourcematerialorganismorganismgeneralclasscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn("[");}
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralclasscodingi == substancesourcematerialorganismorganismgeneralclasscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd("[");}
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralclasscodingi == substancesourcematerialorganismorganismgeneralclasscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd("[");}
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralclasscodingi == substancesourcematerialorganismorganismgeneralclasscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscodingi == 0) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys("[");}
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys("NULL");
		}

		if(substancesourcematerialorganismorganismgeneralclasscodingi == substancesourcematerialorganismorganismgeneralclasscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismspecies = substancesourcematerialorganism.getSpecies();

		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Txt ********************************************************************************/
		if(substancesourcematerialorganismspecies.hasText()) {

			s.addSbstncSrcMtrlOrgnsmSpcsTxt(String.valueOf(substancesourcematerialorganismspecies.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsTxt("NULL");
		}


		/******************** substancesourcematerialorganismspeciescoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismspeciescodinglist = substancesourcematerialorganismspecies.getCoding();
		for(int substancesourcematerialorganismspeciescodingi = 0; substancesourcematerialorganismspeciescodingi<substancesourcematerialorganismspeciescodinglist.size();substancesourcematerialorganismspeciescodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismspeciescoding = substancesourcematerialorganismspeciescodinglist.get(substancesourcematerialorganismspeciescodingi);

		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismspeciescodingi == 0) {s.addSbstncSrcMtrlOrgnsmSpcsCdgDsply("[");}
		if(substancesourcematerialorganismspeciescoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmSpcsCdgDsply(String.valueOf(substancesourcematerialorganismspeciescoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsCdgDsply("NULL");
		}

		if(substancesourcematerialorganismspeciescodingi == substancesourcematerialorganismspeciescodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmSpcsCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismspeciescodingi == 0) {s.addSbstncSrcMtrlOrgnsmSpcsCdgVrsn("[");}
		if(substancesourcematerialorganismspeciescoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmSpcsCdgVrsn(String.valueOf(substancesourcematerialorganismspeciescoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismspeciescodingi == substancesourcematerialorganismspeciescodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmSpcsCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismspeciescodingi == 0) {s.addSbstncSrcMtrlOrgnsmSpcsCdgCd("[");}
		if(substancesourcematerialorganismspeciescoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmSpcsCdgCd(String.valueOf(substancesourcematerialorganismspeciescoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsCdgCd("NULL");
		}

		if(substancesourcematerialorganismspeciescodingi == substancesourcematerialorganismspeciescodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmSpcsCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismspeciescodingi == 0) {s.addSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd("[");}
		if(substancesourcematerialorganismspeciescoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd(String.valueOf(substancesourcematerialorganismspeciescoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismspeciescodingi == substancesourcematerialorganismspeciescodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismspeciescodingi == 0) {s.addSbstncSrcMtrlOrgnsmSpcsCdgSys("[");}
		if(substancesourcematerialorganismspeciescoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmSpcsCdgSys(String.valueOf(substancesourcematerialorganismspeciescoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmSpcsCdgSys("NULL");
		}

		if(substancesourcematerialorganismspeciescodingi == substancesourcematerialorganismspeciescodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmSpcsCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismgenus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismgenus = substancesourcematerialorganism.getGenus();

		/******************** SbstncSrcMtrl_Orgnsm_Genus_Txt ********************************************************************************/
		if(substancesourcematerialorganismgenus.hasText()) {

			s.addSbstncSrcMtrlOrgnsmGenusTxt(String.valueOf(substancesourcematerialorganismgenus.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusTxt("NULL");
		}


		/******************** substancesourcematerialorganismgenuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismgenuscodinglist = substancesourcematerialorganismgenus.getCoding();
		for(int substancesourcematerialorganismgenuscodingi = 0; substancesourcematerialorganismgenuscodingi<substancesourcematerialorganismgenuscodinglist.size();substancesourcematerialorganismgenuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismgenuscoding = substancesourcematerialorganismgenuscodinglist.get(substancesourcematerialorganismgenuscodingi);

		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismgenuscodingi == 0) {s.addSbstncSrcMtrlOrgnsmGenusCdgDsply("[");}
		if(substancesourcematerialorganismgenuscoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmGenusCdgDsply(String.valueOf(substancesourcematerialorganismgenuscoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusCdgDsply("NULL");
		}

		if(substancesourcematerialorganismgenuscodingi == substancesourcematerialorganismgenuscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmGenusCdgDsply("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismgenuscodingi == 0) {s.addSbstncSrcMtrlOrgnsmGenusCdgVrsn("[");}
		if(substancesourcematerialorganismgenuscoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmGenusCdgVrsn(String.valueOf(substancesourcematerialorganismgenuscoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismgenuscodingi == substancesourcematerialorganismgenuscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmGenusCdgVrsn("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismgenuscodingi == 0) {s.addSbstncSrcMtrlOrgnsmGenusCdgCd("[");}
		if(substancesourcematerialorganismgenuscoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmGenusCdgCd(String.valueOf(substancesourcematerialorganismgenuscoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusCdgCd("NULL");
		}

		if(substancesourcematerialorganismgenuscodingi == substancesourcematerialorganismgenuscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmGenusCdgCd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismgenuscodingi == 0) {s.addSbstncSrcMtrlOrgnsmGenusCdgUsrSltd("[");}
		if(substancesourcematerialorganismgenuscoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmGenusCdgUsrSltd(String.valueOf(substancesourcematerialorganismgenuscoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismgenuscodingi == substancesourcematerialorganismgenuscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmGenusCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismgenuscodingi == 0) {s.addSbstncSrcMtrlOrgnsmGenusCdgSys("[");}
		if(substancesourcematerialorganismgenuscoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmGenusCdgSys(String.valueOf(substancesourcematerialorganismgenuscoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmGenusCdgSys("NULL");
		}

		if(substancesourcematerialorganismgenuscodingi == substancesourcematerialorganismgenuscodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmGenusCdgSys("]");}


		 };
		/******************** substancesourcematerialorganismauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent> substancesourcematerialorganismauthorlist = substancesourcematerialorganism.getAuthor();
		for(int substancesourcematerialorganismauthori = 0; substancesourcematerialorganismauthori<substancesourcematerialorganismauthorlist.size();substancesourcematerialorganismauthori++ ) {
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent  substancesourcematerialorganismauthor = substancesourcematerialorganismauthorlist.get(substancesourcematerialorganismauthori);

		/******************** substancesourcematerialorganismauthorauthortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismauthorauthortype = substancesourcematerialorganismauthor.getAuthorType();

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismauthori == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypTxt("[");}
		if(substancesourcematerialorganismauthorauthortype.hasText()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypTxt(String.valueOf(substancesourcematerialorganismauthorauthortype.getText()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypTxt("NULL");
		}

		if(substancesourcematerialorganismauthori == substancesourcematerialorganismauthorlist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypTxt("]");}


		/******************** substancesourcematerialorganismauthorauthortypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialorganismauthorauthortypecodinglist = substancesourcematerialorganismauthorauthortype.getCoding();
		for(int substancesourcematerialorganismauthorauthortypecodingi = 0; substancesourcematerialorganismauthorauthortypecodingi<substancesourcematerialorganismauthorauthortypecodinglist.size();substancesourcematerialorganismauthorauthortypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialorganismauthorauthortypecoding = substancesourcematerialorganismauthorauthortypecodinglist.get(substancesourcematerialorganismauthorauthortypecodingi);

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply("[[");}
		if(substancesourcematerialorganismauthorauthortypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply("NULL");
		}

		if(substancesourcematerialorganismauthorauthortypecodingi == substancesourcematerialorganismauthorauthortypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply("]]");}


		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn("[[");}
		if(substancesourcematerialorganismauthorauthortypecoding.hasVersion()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn("NULL");
		}

		if(substancesourcematerialorganismauthorauthortypecodingi == substancesourcematerialorganismauthorauthortypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd("[[");}
		if(substancesourcematerialorganismauthorauthortypecoding.hasCode()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd("NULL");
		}

		if(substancesourcematerialorganismauthorauthortypecodingi == substancesourcematerialorganismauthorauthortypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd("]]");}


		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd("[[");}
		if(substancesourcematerialorganismauthorauthortypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialorganismauthorauthortypecodingi == substancesourcematerialorganismauthorauthortypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecodingi == 0) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys("[[");}
		if(substancesourcematerialorganismauthorauthortypecoding.hasSystem()) {

			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys("NULL");
		}

		if(substancesourcematerialorganismauthorauthortypecodingi == substancesourcematerialorganismauthorauthortypecodinglist.size()-1) {s.addSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys("]]");}


		 };
		 };
		/******************** substancesourcematerialparentsubstanceid ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> substancesourcematerialparentsubstanceidlist = substancesourcematerial.getParentSubstanceId();
		for(int substancesourcematerialparentsubstanceidi = 0; substancesourcematerialparentsubstanceidi<substancesourcematerialparentsubstanceidlist.size();substancesourcematerialparentsubstanceidi++ ) {
		org.hl7.fhir.r4.model.Identifier  substancesourcematerialparentsubstanceid = substancesourcematerialparentsubstanceidlist.get(substancesourcematerialparentsubstanceidi);

		/******************** SbstncSrcMtrl_ParentSbstncId_Vl ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdVl("[");}
		if(substancesourcematerialparentsubstanceid.hasValue()) {

			s.addSbstncSrcMtrlParentSbstncIdVl(String.valueOf(substancesourcematerialparentsubstanceid.getValue()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdVl("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdVl("]");}


		/******************** substancesourcematerialparentsubstanceidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialparentsubstanceidtype = substancesourcematerialparentsubstanceid.getType();

		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Txt ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypTxt("[");}
		if(substancesourcematerialparentsubstanceidtype.hasText()) {

			s.addSbstncSrcMtrlParentSbstncIdTypTxt(String.valueOf(substancesourcematerialparentsubstanceidtype.getText()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypTxt("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypTxt("]");}


		/******************** substancesourcematerialparentsubstanceidtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialparentsubstanceidtypecodinglist = substancesourcematerialparentsubstanceidtype.getCoding();
		for(int substancesourcematerialparentsubstanceidtypecodingi = 0; substancesourcematerialparentsubstanceidtypecodingi<substancesourcematerialparentsubstanceidtypecodinglist.size();substancesourcematerialparentsubstanceidtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialparentsubstanceidtypecoding = substancesourcematerialparentsubstanceidtypecodinglist.get(substancesourcematerialparentsubstanceidtypecodingi);

		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecodingi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypCdgDsply("[[");}
		if(substancesourcematerialparentsubstanceidtypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlParentSbstncIdTypCdgDsply(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypCdgDsply("NULL");
		}

		if(substancesourcematerialparentsubstanceidtypecodingi == substancesourcematerialparentsubstanceidtypecodinglist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypCdgDsply("]]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecodingi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypCdgVrsn("[[");}
		if(substancesourcematerialparentsubstanceidtypecoding.hasVersion()) {

			s.addSbstncSrcMtrlParentSbstncIdTypCdgVrsn(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypCdgVrsn("NULL");
		}

		if(substancesourcematerialparentsubstanceidtypecodingi == substancesourcematerialparentsubstanceidtypecodinglist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecodingi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypCdgCd("[[");}
		if(substancesourcematerialparentsubstanceidtypecoding.hasCode()) {

			s.addSbstncSrcMtrlParentSbstncIdTypCdgCd(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypCdgCd("NULL");
		}

		if(substancesourcematerialparentsubstanceidtypecodingi == substancesourcematerialparentsubstanceidtypecodinglist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypCdgCd("]]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecodingi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd("[[");}
		if(substancesourcematerialparentsubstanceidtypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialparentsubstanceidtypecodingi == substancesourcematerialparentsubstanceidtypecodinglist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecodingi == 0) {s.addSbstncSrcMtrlParentSbstncIdTypCdgSys("[[");}
		if(substancesourcematerialparentsubstanceidtypecoding.hasSystem()) {

			s.addSbstncSrcMtrlParentSbstncIdTypCdgSys(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdTypCdgSys("NULL");
		}

		if(substancesourcematerialparentsubstanceidtypecodingi == substancesourcematerialparentsubstanceidtypecodinglist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdTypCdgSys("]]");}


		 };
		/******************** substancesourcematerialparentsubstanceidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialparentsubstanceidperiod = substancesourcematerialparentsubstanceid.getPeriod();

		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_Strt ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdPrdStrt("[");}
		if(substancesourcematerialparentsubstanceidperiod.hasStart()) {

			s.addSbstncSrcMtrlParentSbstncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancesourcematerialparentsubstanceidperiod.getStart())+"\"");
		} else {
			s.addSbstncSrcMtrlParentSbstncIdPrdStrt("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdPrdStrt("]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_End ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdPrdEnd("[");}
		if(substancesourcematerialparentsubstanceidperiod.hasEnd()) {

			s.addSbstncSrcMtrlParentSbstncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancesourcematerialparentsubstanceidperiod.getEnd())+"\"");
		} else {
			s.addSbstncSrcMtrlParentSbstncIdPrdEnd("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdPrdEnd("]");}


		/******************** substancesourcematerialparentsubstanceiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancesourcematerialparentsubstanceiduse = substancesourcematerialparentsubstanceid.getUse();
		if(substancesourcematerialparentsubstanceiduse!=null) {
		if(substancesourcematerialparentsubstanceidi == 0) {

		s.addSbstncSrcMtrlParentSbstncIdUse("[");		}
			s.addSbstncSrcMtrlParentSbstncIdUse(substancesourcematerialparentsubstanceiduse.toCode());
		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {

		s.addSbstncSrcMtrlParentSbstncIdUse("]");		}

		} else {
			s.addSbstncSrcMtrlParentSbstncIdUse("NULL");
		}

		/******************** SbstncSrcMtrl_ParentSbstncId_Assigner ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdAssigner("[");}
		if(substancesourcematerialparentsubstanceid.hasAssigner()) {

			if(substancesourcematerialparentsubstanceid.getAssigner().getReference() != null) {
			s.addSbstncSrcMtrlParentSbstncIdAssigner(substancesourcematerialparentsubstanceid.getAssigner().getReference());
			}
		} else {
			s.addSbstncSrcMtrlParentSbstncIdAssigner("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdAssigner("]");}


		/******************** SbstncSrcMtrl_ParentSbstncId_Sys ********************************************************************************/
		if(substancesourcematerialparentsubstanceidi == 0) {s.addSbstncSrcMtrlParentSbstncIdSys("[");}
		if(substancesourcematerialparentsubstanceid.hasSystem()) {

			s.addSbstncSrcMtrlParentSbstncIdSys(String.valueOf(substancesourcematerialparentsubstanceid.getSystem()));
		} else {
			s.addSbstncSrcMtrlParentSbstncIdSys("NULL");
		}

		if(substancesourcematerialparentsubstanceidi == substancesourcematerialparentsubstanceidlist.size()-1) {s.addSbstncSrcMtrlParentSbstncIdSys("]");}


		 };
		/******************** substancesourcematerialsourcematerialstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialstate = substancesourcematerial.getSourceMaterialState();

		/******************** SbstncSrcMtrl_SrcMtrlState_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialstate.hasText()) {

			s.addSbstncSrcMtrlSrcMtrlStateTxt(String.valueOf(substancesourcematerialsourcematerialstate.getText()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateTxt("NULL");
		}


		/******************** substancesourcematerialsourcematerialstatecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialsourcematerialstatecodinglist = substancesourcematerialsourcematerialstate.getCoding();
		for(int substancesourcematerialsourcematerialstatecodingi = 0; substancesourcematerialsourcematerialstatecodingi<substancesourcematerialsourcematerialstatecodinglist.size();substancesourcematerialsourcematerialstatecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialsourcematerialstatecoding = substancesourcematerialsourcematerialstatecodinglist.get(substancesourcematerialsourcematerialstatecodingi);

		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlStateCdgDsply("[");}
		if(substancesourcematerialsourcematerialstatecoding.hasDisplay()) {

			s.addSbstncSrcMtrlSrcMtrlStateCdgDsply(String.valueOf(substancesourcematerialsourcematerialstatecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateCdgDsply("NULL");
		}

		if(substancesourcematerialsourcematerialstatecodingi == substancesourcematerialsourcematerialstatecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlStateCdgDsply("]");}


		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlStateCdgVrsn("[");}
		if(substancesourcematerialsourcematerialstatecoding.hasVersion()) {

			s.addSbstncSrcMtrlSrcMtrlStateCdgVrsn(String.valueOf(substancesourcematerialsourcematerialstatecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateCdgVrsn("NULL");
		}

		if(substancesourcematerialsourcematerialstatecodingi == substancesourcematerialsourcematerialstatecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlStateCdgVrsn("]");}


		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlStateCdgCd("[");}
		if(substancesourcematerialsourcematerialstatecoding.hasCode()) {

			s.addSbstncSrcMtrlSrcMtrlStateCdgCd(String.valueOf(substancesourcematerialsourcematerialstatecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateCdgCd("NULL");
		}

		if(substancesourcematerialsourcematerialstatecodingi == substancesourcematerialsourcematerialstatecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlStateCdgCd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlStateCdgUsrSltd("[");}
		if(substancesourcematerialsourcematerialstatecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlSrcMtrlStateCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialstatecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateCdgUsrSltd("NULL");
		}

		if(substancesourcematerialsourcematerialstatecodingi == substancesourcematerialsourcematerialstatecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlStateCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlStateCdgSys("[");}
		if(substancesourcematerialsourcematerialstatecoding.hasSystem()) {

			s.addSbstncSrcMtrlSrcMtrlStateCdgSys(String.valueOf(substancesourcematerialsourcematerialstatecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlStateCdgSys("NULL");
		}

		if(substancesourcematerialsourcematerialstatecodingi == substancesourcematerialsourcematerialstatecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlStateCdgSys("]");}


		 };
		/******************** substancesourcematerialsourcematerialclass ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialclass = substancesourcematerial.getSourceMaterialClass();

		/******************** SbstncSrcMtrl_SrcMtrlCls_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialclass.hasText()) {

			s.addSbstncSrcMtrlSrcMtrlClsTxt(String.valueOf(substancesourcematerialsourcematerialclass.getText()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsTxt("NULL");
		}


		/******************** substancesourcematerialsourcematerialclasscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialsourcematerialclasscodinglist = substancesourcematerialsourcematerialclass.getCoding();
		for(int substancesourcematerialsourcematerialclasscodingi = 0; substancesourcematerialsourcematerialclasscodingi<substancesourcematerialsourcematerialclasscodinglist.size();substancesourcematerialsourcematerialclasscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialsourcematerialclasscoding = substancesourcematerialsourcematerialclasscodinglist.get(substancesourcematerialsourcematerialclasscodingi);

		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscodingi == 0) {s.addSbstncSrcMtrlSrcMtrlClsCdgDsply("[");}
		if(substancesourcematerialsourcematerialclasscoding.hasDisplay()) {

			s.addSbstncSrcMtrlSrcMtrlClsCdgDsply(String.valueOf(substancesourcematerialsourcematerialclasscoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsCdgDsply("NULL");
		}

		if(substancesourcematerialsourcematerialclasscodingi == substancesourcematerialsourcematerialclasscodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlClsCdgDsply("]");}


		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscodingi == 0) {s.addSbstncSrcMtrlSrcMtrlClsCdgVrsn("[");}
		if(substancesourcematerialsourcematerialclasscoding.hasVersion()) {

			s.addSbstncSrcMtrlSrcMtrlClsCdgVrsn(String.valueOf(substancesourcematerialsourcematerialclasscoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsCdgVrsn("NULL");
		}

		if(substancesourcematerialsourcematerialclasscodingi == substancesourcematerialsourcematerialclasscodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlClsCdgVrsn("]");}


		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscodingi == 0) {s.addSbstncSrcMtrlSrcMtrlClsCdgCd("[");}
		if(substancesourcematerialsourcematerialclasscoding.hasCode()) {

			s.addSbstncSrcMtrlSrcMtrlClsCdgCd(String.valueOf(substancesourcematerialsourcematerialclasscoding.getCode()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsCdgCd("NULL");
		}

		if(substancesourcematerialsourcematerialclasscodingi == substancesourcematerialsourcematerialclasscodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlClsCdgCd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscodingi == 0) {s.addSbstncSrcMtrlSrcMtrlClsCdgUsrSltd("[");}
		if(substancesourcematerialsourcematerialclasscoding.hasUserSelected()) {

			s.addSbstncSrcMtrlSrcMtrlClsCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialclasscoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsCdgUsrSltd("NULL");
		}

		if(substancesourcematerialsourcematerialclasscodingi == substancesourcematerialsourcematerialclasscodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlClsCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscodingi == 0) {s.addSbstncSrcMtrlSrcMtrlClsCdgSys("[");}
		if(substancesourcematerialsourcematerialclasscoding.hasSystem()) {

			s.addSbstncSrcMtrlSrcMtrlClsCdgSys(String.valueOf(substancesourcematerialsourcematerialclasscoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlClsCdgSys("NULL");
		}

		if(substancesourcematerialsourcematerialclasscodingi == substancesourcematerialsourcematerialclasscodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlClsCdgSys("]");}


		 };
		/******************** substancesourcematerialsourcematerialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialtype = substancesourcematerial.getSourceMaterialType();

		/******************** SbstncSrcMtrl_SrcMtrlTyp_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialtype.hasText()) {

			s.addSbstncSrcMtrlSrcMtrlTypTxt(String.valueOf(substancesourcematerialsourcematerialtype.getText()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypTxt("NULL");
		}


		/******************** substancesourcematerialsourcematerialtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialsourcematerialtypecodinglist = substancesourcematerialsourcematerialtype.getCoding();
		for(int substancesourcematerialsourcematerialtypecodingi = 0; substancesourcematerialsourcematerialtypecodingi<substancesourcematerialsourcematerialtypecodinglist.size();substancesourcematerialsourcematerialtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialsourcematerialtypecoding = substancesourcematerialsourcematerialtypecodinglist.get(substancesourcematerialsourcematerialtypecodingi);

		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlTypCdgDsply("[");}
		if(substancesourcematerialsourcematerialtypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlSrcMtrlTypCdgDsply(String.valueOf(substancesourcematerialsourcematerialtypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypCdgDsply("NULL");
		}

		if(substancesourcematerialsourcematerialtypecodingi == substancesourcematerialsourcematerialtypecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlTypCdgDsply("]");}


		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlTypCdgVrsn("[");}
		if(substancesourcematerialsourcematerialtypecoding.hasVersion()) {

			s.addSbstncSrcMtrlSrcMtrlTypCdgVrsn(String.valueOf(substancesourcematerialsourcematerialtypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypCdgVrsn("NULL");
		}

		if(substancesourcematerialsourcematerialtypecodingi == substancesourcematerialsourcematerialtypecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlTypCdgVrsn("]");}


		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlTypCdgCd("[");}
		if(substancesourcematerialsourcematerialtypecoding.hasCode()) {

			s.addSbstncSrcMtrlSrcMtrlTypCdgCd(String.valueOf(substancesourcematerialsourcematerialtypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypCdgCd("NULL");
		}

		if(substancesourcematerialsourcematerialtypecodingi == substancesourcematerialsourcematerialtypecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlTypCdgCd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlTypCdgUsrSltd("[");}
		if(substancesourcematerialsourcematerialtypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlSrcMtrlTypCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialtypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialsourcematerialtypecodingi == substancesourcematerialsourcematerialtypecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlTypCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecodingi == 0) {s.addSbstncSrcMtrlSrcMtrlTypCdgSys("[");}
		if(substancesourcematerialsourcematerialtypecoding.hasSystem()) {

			s.addSbstncSrcMtrlSrcMtrlTypCdgSys(String.valueOf(substancesourcematerialsourcematerialtypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlSrcMtrlTypCdgSys("NULL");
		}

		if(substancesourcematerialsourcematerialtypecodingi == substancesourcematerialsourcematerialtypecodinglist.size()-1) {s.addSbstncSrcMtrlSrcMtrlTypCdgSys("]");}


		 };
		/******************** SbstncSrcMtrl_GeographicalLctn ********************************************************************************/
		if(substancesourcematerial.hasGeographicalLocation()) {

			String  array = "[";
			for(int incr=0; incr<substancesourcematerial.getGeographicalLocation().size(); incr++) {
				array = array + substancesourcematerial.getGeographicalLocation().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSrcMtrlGeographicalLctn(array);

		} else {
			s.addSbstncSrcMtrlGeographicalLctn("NULL");
		}


		/******************** SbstncSrcMtrl_ParentSbstncNm ********************************************************************************/
		if(substancesourcematerial.hasParentSubstanceName()) {

			String  array = "[";
			for(int incr=0; incr<substancesourcematerial.getParentSubstanceName().size(); incr++) {
				array = array + substancesourcematerial.getParentSubstanceName().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSrcMtrlParentSbstncNm(array);

		} else {
			s.addSbstncSrcMtrlParentSbstncNm("NULL");
		}


		/******************** substancesourcematerialdevelopmentstage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialdevelopmentstage = substancesourcematerial.getDevelopmentStage();

		/******************** SbstncSrcMtrl_DevelopmentStage_Txt ********************************************************************************/
		if(substancesourcematerialdevelopmentstage.hasText()) {

			s.addSbstncSrcMtrlDevelopmentStageTxt(String.valueOf(substancesourcematerialdevelopmentstage.getText()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageTxt("NULL");
		}


		/******************** substancesourcematerialdevelopmentstagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialdevelopmentstagecodinglist = substancesourcematerialdevelopmentstage.getCoding();
		for(int substancesourcematerialdevelopmentstagecodingi = 0; substancesourcematerialdevelopmentstagecodingi<substancesourcematerialdevelopmentstagecodinglist.size();substancesourcematerialdevelopmentstagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialdevelopmentstagecoding = substancesourcematerialdevelopmentstagecodinglist.get(substancesourcematerialdevelopmentstagecodingi);

		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecodingi == 0) {s.addSbstncSrcMtrlDevelopmentStageCdgDsply("[");}
		if(substancesourcematerialdevelopmentstagecoding.hasDisplay()) {

			s.addSbstncSrcMtrlDevelopmentStageCdgDsply(String.valueOf(substancesourcematerialdevelopmentstagecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageCdgDsply("NULL");
		}

		if(substancesourcematerialdevelopmentstagecodingi == substancesourcematerialdevelopmentstagecodinglist.size()-1) {s.addSbstncSrcMtrlDevelopmentStageCdgDsply("]");}


		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecodingi == 0) {s.addSbstncSrcMtrlDevelopmentStageCdgVrsn("[");}
		if(substancesourcematerialdevelopmentstagecoding.hasVersion()) {

			s.addSbstncSrcMtrlDevelopmentStageCdgVrsn(String.valueOf(substancesourcematerialdevelopmentstagecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageCdgVrsn("NULL");
		}

		if(substancesourcematerialdevelopmentstagecodingi == substancesourcematerialdevelopmentstagecodinglist.size()-1) {s.addSbstncSrcMtrlDevelopmentStageCdgVrsn("]");}


		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecodingi == 0) {s.addSbstncSrcMtrlDevelopmentStageCdgCd("[");}
		if(substancesourcematerialdevelopmentstagecoding.hasCode()) {

			s.addSbstncSrcMtrlDevelopmentStageCdgCd(String.valueOf(substancesourcematerialdevelopmentstagecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageCdgCd("NULL");
		}

		if(substancesourcematerialdevelopmentstagecodingi == substancesourcematerialdevelopmentstagecodinglist.size()-1) {s.addSbstncSrcMtrlDevelopmentStageCdgCd("]");}


		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecodingi == 0) {s.addSbstncSrcMtrlDevelopmentStageCdgUsrSltd("[");}
		if(substancesourcematerialdevelopmentstagecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlDevelopmentStageCdgUsrSltd(String.valueOf(substancesourcematerialdevelopmentstagecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageCdgUsrSltd("NULL");
		}

		if(substancesourcematerialdevelopmentstagecodingi == substancesourcematerialdevelopmentstagecodinglist.size()-1) {s.addSbstncSrcMtrlDevelopmentStageCdgUsrSltd("]");}


		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecodingi == 0) {s.addSbstncSrcMtrlDevelopmentStageCdgSys("[");}
		if(substancesourcematerialdevelopmentstagecoding.hasSystem()) {

			s.addSbstncSrcMtrlDevelopmentStageCdgSys(String.valueOf(substancesourcematerialdevelopmentstagecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlDevelopmentStageCdgSys("NULL");
		}

		if(substancesourcematerialdevelopmentstagecodingi == substancesourcematerialdevelopmentstagecodinglist.size()-1) {s.addSbstncSrcMtrlDevelopmentStageCdgSys("]");}


		 };
		/******************** substancesourcematerialfractiondescription ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent> substancesourcematerialfractiondescriptionlist = substancesourcematerial.getFractionDescription();
		for(int substancesourcematerialfractiondescriptioni = 0; substancesourcematerialfractiondescriptioni<substancesourcematerialfractiondescriptionlist.size();substancesourcematerialfractiondescriptioni++ ) {
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent  substancesourcematerialfractiondescription = substancesourcematerialfractiondescriptionlist.get(substancesourcematerialfractiondescriptioni);

		/******************** substancesourcematerialfractiondescriptionmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialfractiondescriptionmaterialtype = substancesourcematerialfractiondescription.getMaterialType();

		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Txt ********************************************************************************/
		if(substancesourcematerialfractiondescriptioni == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypTxt("[");}
		if(substancesourcematerialfractiondescriptionmaterialtype.hasText()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypTxt(String.valueOf(substancesourcematerialfractiondescriptionmaterialtype.getText()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypTxt("NULL");
		}

		if(substancesourcematerialfractiondescriptioni == substancesourcematerialfractiondescriptionlist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypTxt("]");}


		/******************** substancesourcematerialfractiondescriptionmaterialtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancesourcematerialfractiondescriptionmaterialtypecodinglist = substancesourcematerialfractiondescriptionmaterialtype.getCoding();
		for(int substancesourcematerialfractiondescriptionmaterialtypecodingi = 0; substancesourcematerialfractiondescriptionmaterialtypecodingi<substancesourcematerialfractiondescriptionmaterialtypecodinglist.size();substancesourcematerialfractiondescriptionmaterialtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancesourcematerialfractiondescriptionmaterialtypecoding = substancesourcematerialfractiondescriptionmaterialtypecodinglist.get(substancesourcematerialfractiondescriptionmaterialtypecodingi);

		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply("[[");}
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasDisplay()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getDisplay()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply("NULL");
		}

		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == substancesourcematerialfractiondescriptionmaterialtypecodinglist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply("]]");}


		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn("[[");}
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasVersion()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getVersion()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn("NULL");
		}

		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == substancesourcematerialfractiondescriptionmaterialtypecodinglist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn("]]");}


		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd("[[");}
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasCode()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getCode()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd("NULL");
		}

		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == substancesourcematerialfractiondescriptionmaterialtypecodinglist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd("]]");}


		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd("[[");}
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasUserSelected()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getUserSelected()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd("NULL");
		}

		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == substancesourcematerialfractiondescriptionmaterialtypecodinglist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd("]]");}


		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == 0) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys("[[");}
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasSystem()) {

			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getSystem()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys("NULL");
		}

		if(substancesourcematerialfractiondescriptionmaterialtypecodingi == substancesourcematerialfractiondescriptionmaterialtypecodinglist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys("]]");}


		 };
		/******************** SbstncSrcMtrl_FractionDscrptn_Fraction ********************************************************************************/
		if(substancesourcematerialfractiondescriptioni == 0) {s.addSbstncSrcMtrlFractionDscrptnFraction("[");}
		if(substancesourcematerialfractiondescription.hasFraction()) {

			s.addSbstncSrcMtrlFractionDscrptnFraction(String.valueOf(substancesourcematerialfractiondescription.getFraction()));
		} else {
			s.addSbstncSrcMtrlFractionDscrptnFraction("NULL");
		}

		if(substancesourcematerialfractiondescriptioni == substancesourcematerialfractiondescriptionlist.size()-1) {s.addSbstncSrcMtrlFractionDscrptnFraction("]");}


		 };
		return s;
	}
}
