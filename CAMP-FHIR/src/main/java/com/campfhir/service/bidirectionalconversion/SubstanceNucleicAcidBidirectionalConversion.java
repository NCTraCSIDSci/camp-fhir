package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceNucleicAcid;
public class SubstanceNucleicAcidBidirectionalConversion 
{
	public SubstanceNucleicAcid SubstanceNucleicAcids(org.hl7.fhir.r4.model.SubstanceNucleicAcid substancenucleicacid) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceNucleicAcid s = new  main.java.com.campfhir.model.SubstanceNucleicAcid();

		/******************** id ********************************************************************************/
		s.setId(substancenucleicacid.getIdElement().getIdPart());

		/******************** SbstncNclicAcid_NmbrOfSubunts ********************************************************************************/
		if(substancenucleicacid.hasNumberOfSubunits()) {

			s.addSbstncNclicAcidNmbrOfSubunts(String.valueOf(substancenucleicacid.getNumberOfSubunits()));
		} else {
			s.addSbstncNclicAcidNmbrOfSubunts("NULL");
		}


		/******************** substancenucleicacidoligonucleotidetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidoligonucleotidetype = substancenucleicacid.getOligoNucleotideType();

		/******************** SbstncNclicAcid_OligoNucleotideTyp_Txt ********************************************************************************/
		if(substancenucleicacidoligonucleotidetype.hasText()) {

			s.addSbstncNclicAcidOligoNucleotideTypTxt(String.valueOf(substancenucleicacidoligonucleotidetype.getText()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypTxt("NULL");
		}


		/******************** substancenucleicacidoligonucleotidetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidoligonucleotidetypecodinglist = substancenucleicacidoligonucleotidetype.getCoding();
		for(int substancenucleicacidoligonucleotidetypecodingi = 0; substancenucleicacidoligonucleotidetypecodingi<substancenucleicacidoligonucleotidetypecodinglist.size();substancenucleicacidoligonucleotidetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidoligonucleotidetypecoding = substancenucleicacidoligonucleotidetypecodinglist.get(substancenucleicacidoligonucleotidetypecodingi);

		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecodingi == 0) {s.addSbstncNclicAcidOligoNucleotideTypCdgDsply("[");}
		if(substancenucleicacidoligonucleotidetypecoding.hasDisplay()) {

			s.addSbstncNclicAcidOligoNucleotideTypCdgDsply(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypCdgDsply("NULL");
		}

		if(substancenucleicacidoligonucleotidetypecodingi == substancenucleicacidoligonucleotidetypecodinglist.size()-1) {s.addSbstncNclicAcidOligoNucleotideTypCdgDsply("]");}


		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecodingi == 0) {s.addSbstncNclicAcidOligoNucleotideTypCdgVrsn("[");}
		if(substancenucleicacidoligonucleotidetypecoding.hasVersion()) {

			s.addSbstncNclicAcidOligoNucleotideTypCdgVrsn(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypCdgVrsn("NULL");
		}

		if(substancenucleicacidoligonucleotidetypecodingi == substancenucleicacidoligonucleotidetypecodinglist.size()-1) {s.addSbstncNclicAcidOligoNucleotideTypCdgVrsn("]");}


		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecodingi == 0) {s.addSbstncNclicAcidOligoNucleotideTypCdgCd("[");}
		if(substancenucleicacidoligonucleotidetypecoding.hasCode()) {

			s.addSbstncNclicAcidOligoNucleotideTypCdgCd(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getCode()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypCdgCd("NULL");
		}

		if(substancenucleicacidoligonucleotidetypecodingi == substancenucleicacidoligonucleotidetypecodinglist.size()-1) {s.addSbstncNclicAcidOligoNucleotideTypCdgCd("]");}


		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecodingi == 0) {s.addSbstncNclicAcidOligoNucleotideTypCdgUsrSltd("[");}
		if(substancenucleicacidoligonucleotidetypecoding.hasUserSelected()) {

			s.addSbstncNclicAcidOligoNucleotideTypCdgUsrSltd(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypCdgUsrSltd("NULL");
		}

		if(substancenucleicacidoligonucleotidetypecodingi == substancenucleicacidoligonucleotidetypecodinglist.size()-1) {s.addSbstncNclicAcidOligoNucleotideTypCdgUsrSltd("]");}


		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecodingi == 0) {s.addSbstncNclicAcidOligoNucleotideTypCdgSys("[");}
		if(substancenucleicacidoligonucleotidetypecoding.hasSystem()) {

			s.addSbstncNclicAcidOligoNucleotideTypCdgSys(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidOligoNucleotideTypCdgSys("NULL");
		}

		if(substancenucleicacidoligonucleotidetypecodingi == substancenucleicacidoligonucleotidetypecodinglist.size()-1) {s.addSbstncNclicAcidOligoNucleotideTypCdgSys("]");}


		 };
		/******************** SbstncNclicAcid_AreaOfHybridisation ********************************************************************************/
		if(substancenucleicacid.hasAreaOfHybridisation()) {

			s.addSbstncNclicAcidAreaOfHybridisation(String.valueOf(substancenucleicacid.getAreaOfHybridisation()));
		} else {
			s.addSbstncNclicAcidAreaOfHybridisation("NULL");
		}


		/******************** substancenucleicacidsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsequencetype = substancenucleicacid.getSequenceType();

		/******************** SbstncNclicAcid_SqncTyp_Txt ********************************************************************************/
		if(substancenucleicacidsequencetype.hasText()) {

			s.addSbstncNclicAcidSqncTypTxt(String.valueOf(substancenucleicacidsequencetype.getText()));
		} else {
			s.addSbstncNclicAcidSqncTypTxt("NULL");
		}


		/******************** substancenucleicacidsequencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidsequencetypecodinglist = substancenucleicacidsequencetype.getCoding();
		for(int substancenucleicacidsequencetypecodingi = 0; substancenucleicacidsequencetypecodingi<substancenucleicacidsequencetypecodinglist.size();substancenucleicacidsequencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidsequencetypecoding = substancenucleicacidsequencetypecodinglist.get(substancenucleicacidsequencetypecodingi);

		/******************** SbstncNclicAcid_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsequencetypecodingi == 0) {s.addSbstncNclicAcidSqncTypCdgDsply("[");}
		if(substancenucleicacidsequencetypecoding.hasDisplay()) {

			s.addSbstncNclicAcidSqncTypCdgDsply(String.valueOf(substancenucleicacidsequencetypecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidSqncTypCdgDsply("NULL");
		}

		if(substancenucleicacidsequencetypecodingi == substancenucleicacidsequencetypecodinglist.size()-1) {s.addSbstncNclicAcidSqncTypCdgDsply("]");}


		/******************** SbstncNclicAcid_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsequencetypecodingi == 0) {s.addSbstncNclicAcidSqncTypCdgVrsn("[");}
		if(substancenucleicacidsequencetypecoding.hasVersion()) {

			s.addSbstncNclicAcidSqncTypCdgVrsn(String.valueOf(substancenucleicacidsequencetypecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidSqncTypCdgVrsn("NULL");
		}

		if(substancenucleicacidsequencetypecodingi == substancenucleicacidsequencetypecodinglist.size()-1) {s.addSbstncNclicAcidSqncTypCdgVrsn("]");}


		/******************** SbstncNclicAcid_SqncTyp_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsequencetypecodingi == 0) {s.addSbstncNclicAcidSqncTypCdgCd("[");}
		if(substancenucleicacidsequencetypecoding.hasCode()) {

			s.addSbstncNclicAcidSqncTypCdgCd(String.valueOf(substancenucleicacidsequencetypecoding.getCode()));
		} else {
			s.addSbstncNclicAcidSqncTypCdgCd("NULL");
		}

		if(substancenucleicacidsequencetypecodingi == substancenucleicacidsequencetypecodinglist.size()-1) {s.addSbstncNclicAcidSqncTypCdgCd("]");}


		/******************** SbstncNclicAcid_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsequencetypecodingi == 0) {s.addSbstncNclicAcidSqncTypCdgUsrSltd("[");}
		if(substancenucleicacidsequencetypecoding.hasUserSelected()) {

			s.addSbstncNclicAcidSqncTypCdgUsrSltd(String.valueOf(substancenucleicacidsequencetypecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidSqncTypCdgUsrSltd("NULL");
		}

		if(substancenucleicacidsequencetypecodingi == substancenucleicacidsequencetypecodinglist.size()-1) {s.addSbstncNclicAcidSqncTypCdgUsrSltd("]");}


		/******************** SbstncNclicAcid_SqncTyp_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsequencetypecodingi == 0) {s.addSbstncNclicAcidSqncTypCdgSys("[");}
		if(substancenucleicacidsequencetypecoding.hasSystem()) {

			s.addSbstncNclicAcidSqncTypCdgSys(String.valueOf(substancenucleicacidsequencetypecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidSqncTypCdgSys("NULL");
		}

		if(substancenucleicacidsequencetypecodingi == substancenucleicacidsequencetypecodinglist.size()-1) {s.addSbstncNclicAcidSqncTypCdgSys("]");}


		 };
		/******************** substancenucleicacidsubunit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent> substancenucleicacidsubunitlist = substancenucleicacid.getSubunit();
		for(int substancenucleicacidsubuniti = 0; substancenucleicacidsubuniti<substancenucleicacidsubunitlist.size();substancenucleicacidsubuniti++ ) {
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent  substancenucleicacidsubunit = substancenucleicacidsubunitlist.get(substancenucleicacidsubuniti);

		/******************** SbstncNclicAcid_Subunt_Length ********************************************************************************/
		if(substancenucleicacidsubuniti == 0) {s.addSbstncNclicAcidSubuntLength("[");}
		if(substancenucleicacidsubunit.hasLength()) {

			s.addSbstncNclicAcidSubuntLength(String.valueOf(substancenucleicacidsubunit.getLength()));
		} else {
			s.addSbstncNclicAcidSubuntLength("NULL");
		}

		if(substancenucleicacidsubuniti == substancenucleicacidsubunitlist.size()-1) {s.addSbstncNclicAcidSubuntLength("]");}


		/******************** SbstncNclicAcid_Subunt_Sqnc ********************************************************************************/
		if(substancenucleicacidsubuniti == 0) {s.addSbstncNclicAcidSubuntSqnc("[");}
		if(substancenucleicacidsubunit.hasSequence()) {

			s.addSbstncNclicAcidSubuntSqnc(String.valueOf(substancenucleicacidsubunit.getSequence()));
		} else {
			s.addSbstncNclicAcidSubuntSqnc("NULL");
		}

		if(substancenucleicacidsubuniti == substancenucleicacidsubunitlist.size()-1) {s.addSbstncNclicAcidSubuntSqnc("]");}


		/******************** substancenucleicacidsubunitlinkage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent> substancenucleicacidsubunitlinkagelist = substancenucleicacidsubunit.getLinkage();
		for(int substancenucleicacidsubunitlinkagei = 0; substancenucleicacidsubunitlinkagei<substancenucleicacidsubunitlinkagelist.size();substancenucleicacidsubunitlinkagei++ ) {
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent  substancenucleicacidsubunitlinkage = substancenucleicacidsubunitlinkagelist.get(substancenucleicacidsubunitlinkagei);

		/******************** SbstncNclicAcid_Subunt_Linkage_Nm ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageNm("[[");}
		if(substancenucleicacidsubunitlinkage.hasName()) {

			s.addSbstncNclicAcidSubuntLinkageNm(String.valueOf(substancenucleicacidsubunitlinkage.getName()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageNm("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageNm("]]");}


		/******************** substancenucleicacidsubunitlinkageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitlinkageidentifier = substancenucleicacidsubunitlinkage.getIdentifier();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Vl ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdVl("[[");}
		if(substancenucleicacidsubunitlinkageidentifier.hasValue()) {

			s.addSbstncNclicAcidSubuntLinkageIdVl(String.valueOf(substancenucleicacidsubunitlinkageidentifier.getValue()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdVl("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdVl("]]");}


		/******************** substancenucleicacidsubunitlinkageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitlinkageidentifiertype = substancenucleicacidsubunitlinkageidentifier.getType();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Txt ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypTxt("[[");}
		if(substancenucleicacidsubunitlinkageidentifiertype.hasText()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypTxt(String.valueOf(substancenucleicacidsubunitlinkageidentifiertype.getText()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypTxt("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypTxt("]]");}


		/******************** substancenucleicacidsubunitlinkageidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidsubunitlinkageidentifiertypecodinglist = substancenucleicacidsubunitlinkageidentifiertype.getCoding();
		for(int substancenucleicacidsubunitlinkageidentifiertypecodingi = 0; substancenucleicacidsubunitlinkageidentifiertypecodingi<substancenucleicacidsubunitlinkageidentifiertypecodinglist.size();substancenucleicacidsubunitlinkageidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidsubunitlinkageidentifiertypecoding = substancenucleicacidsubunitlinkageidentifiertypecodinglist.get(substancenucleicacidsubunitlinkageidentifiertypecodingi);

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgDsply("[[[");}
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasDisplay()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypCdgDsply(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypCdgDsply("NULL");
		}

		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == substancenucleicacidsubunitlinkageidentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgDsply("]]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgVrsn("[[[");}
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasVersion()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypCdgVrsn(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypCdgVrsn("NULL");
		}

		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == substancenucleicacidsubunitlinkageidentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgVrsn("]]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgCd("[[[");}
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasCode()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypCdgCd(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getCode()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypCdgCd("NULL");
		}

		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == substancenucleicacidsubunitlinkageidentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgCd("]]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd("[[[");}
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasUserSelected()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd("NULL");
		}

		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == substancenucleicacidsubunitlinkageidentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd("]]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgSys("[[[");}
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasSystem()) {

			s.addSbstncNclicAcidSubuntLinkageIdTypCdgSys(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdTypCdgSys("NULL");
		}

		if(substancenucleicacidsubunitlinkageidentifiertypecodingi == substancenucleicacidsubunitlinkageidentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdTypCdgSys("]]]");}


		 };
		/******************** substancenucleicacidsubunitlinkageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitlinkageidentifierperiod = substancenucleicacidsubunitlinkageidentifier.getPeriod();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strt ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdPrdStrt("[[");}
		if(substancenucleicacidsubunitlinkageidentifierperiod.hasStart()) {

			s.addSbstncNclicAcidSubuntLinkageIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancenucleicacidsubunitlinkageidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdPrdStrt("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdPrdStrt("]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_End ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdPrdEnd("[[");}
		if(substancenucleicacidsubunitlinkageidentifierperiod.hasEnd()) {

			s.addSbstncNclicAcidSubuntLinkageIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancenucleicacidsubunitlinkageidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdPrdEnd("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdPrdEnd("]]");}


		/******************** substancenucleicacidsubunitlinkageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancenucleicacidsubunitlinkageidentifieruse = substancenucleicacidsubunitlinkageidentifier.getUse();
		if(substancenucleicacidsubunitlinkageidentifieruse!=null) {
		if(substancenucleicacidsubunitlinkagei == 0) {

		s.addSbstncNclicAcidSubuntLinkageIdUse("[[");		}
			s.addSbstncNclicAcidSubuntLinkageIdUse(substancenucleicacidsubunitlinkageidentifieruse.toCode());
		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {

		s.addSbstncNclicAcidSubuntLinkageIdUse("]]");		}

		} else {
			s.addSbstncNclicAcidSubuntLinkageIdUse("NULL");
		}

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Assigner ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdAssigner("[[");}
		if(substancenucleicacidsubunitlinkageidentifier.hasAssigner()) {

			if(substancenucleicacidsubunitlinkageidentifier.getAssigner().getReference() != null) {
			s.addSbstncNclicAcidSubuntLinkageIdAssigner(substancenucleicacidsubunitlinkageidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdAssigner("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdAssigner("]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Sys ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageIdSys("[[");}
		if(substancenucleicacidsubunitlinkageidentifier.hasSystem()) {

			s.addSbstncNclicAcidSubuntLinkageIdSys(String.valueOf(substancenucleicacidsubunitlinkageidentifier.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageIdSys("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageIdSys("]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_Connectivity ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageConnectivity("[[");}
		if(substancenucleicacidsubunitlinkage.hasConnectivity()) {

			s.addSbstncNclicAcidSubuntLinkageConnectivity(String.valueOf(substancenucleicacidsubunitlinkage.getConnectivity()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageConnectivity("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageConnectivity("]]");}


		/******************** SbstncNclicAcid_Subunt_Linkage_ResidueSite ********************************************************************************/
		if(substancenucleicacidsubunitlinkagei == 0) {s.addSbstncNclicAcidSubuntLinkageResidueSite("[[");}
		if(substancenucleicacidsubunitlinkage.hasResidueSite()) {

			s.addSbstncNclicAcidSubuntLinkageResidueSite(String.valueOf(substancenucleicacidsubunitlinkage.getResidueSite()));
		} else {
			s.addSbstncNclicAcidSubuntLinkageResidueSite("NULL");
		}

		if(substancenucleicacidsubunitlinkagei == substancenucleicacidsubunitlinkagelist.size()-1) {s.addSbstncNclicAcidSubuntLinkageResidueSite("]]");}


		 };
		/******************** substancenucleicacidsubunitfiveprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitfiveprime = substancenucleicacidsubunit.getFivePrime();

		/******************** SbstncNclicAcid_Subunt_FivePrime_Txt ********************************************************************************/
		if(substancenucleicacidsubunitfiveprime.hasText()) {

			s.addSbstncNclicAcidSubuntFivePrimeTxt(String.valueOf(substancenucleicacidsubunitfiveprime.getText()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeTxt("NULL");
		}


		/******************** substancenucleicacidsubunitfiveprimecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidsubunitfiveprimecodinglist = substancenucleicacidsubunitfiveprime.getCoding();
		for(int substancenucleicacidsubunitfiveprimecodingi = 0; substancenucleicacidsubunitfiveprimecodingi<substancenucleicacidsubunitfiveprimecodinglist.size();substancenucleicacidsubunitfiveprimecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidsubunitfiveprimecoding = substancenucleicacidsubunitfiveprimecodinglist.get(substancenucleicacidsubunitfiveprimecodingi);

		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecodingi == 0) {s.addSbstncNclicAcidSubuntFivePrimeCdgDsply("[[");}
		if(substancenucleicacidsubunitfiveprimecoding.hasDisplay()) {

			s.addSbstncNclicAcidSubuntFivePrimeCdgDsply(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeCdgDsply("NULL");
		}

		if(substancenucleicacidsubunitfiveprimecodingi == substancenucleicacidsubunitfiveprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntFivePrimeCdgDsply("]]");}


		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecodingi == 0) {s.addSbstncNclicAcidSubuntFivePrimeCdgVrsn("[[");}
		if(substancenucleicacidsubunitfiveprimecoding.hasVersion()) {

			s.addSbstncNclicAcidSubuntFivePrimeCdgVrsn(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeCdgVrsn("NULL");
		}

		if(substancenucleicacidsubunitfiveprimecodingi == substancenucleicacidsubunitfiveprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntFivePrimeCdgVrsn("]]");}


		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecodingi == 0) {s.addSbstncNclicAcidSubuntFivePrimeCdgCd("[[");}
		if(substancenucleicacidsubunitfiveprimecoding.hasCode()) {

			s.addSbstncNclicAcidSubuntFivePrimeCdgCd(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getCode()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeCdgCd("NULL");
		}

		if(substancenucleicacidsubunitfiveprimecodingi == substancenucleicacidsubunitfiveprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntFivePrimeCdgCd("]]");}


		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecodingi == 0) {s.addSbstncNclicAcidSubuntFivePrimeCdgUsrSltd("[[");}
		if(substancenucleicacidsubunitfiveprimecoding.hasUserSelected()) {

			s.addSbstncNclicAcidSubuntFivePrimeCdgUsrSltd(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeCdgUsrSltd("NULL");
		}

		if(substancenucleicacidsubunitfiveprimecodingi == substancenucleicacidsubunitfiveprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntFivePrimeCdgUsrSltd("]]");}


		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecodingi == 0) {s.addSbstncNclicAcidSubuntFivePrimeCdgSys("[[");}
		if(substancenucleicacidsubunitfiveprimecoding.hasSystem()) {

			s.addSbstncNclicAcidSubuntFivePrimeCdgSys(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntFivePrimeCdgSys("NULL");
		}

		if(substancenucleicacidsubunitfiveprimecodingi == substancenucleicacidsubunitfiveprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntFivePrimeCdgSys("]]");}


		 };
		/******************** substancenucleicacidsubunitthreeprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitthreeprime = substancenucleicacidsubunit.getThreePrime();

		/******************** SbstncNclicAcid_Subunt_ThreePrime_Txt ********************************************************************************/
		if(substancenucleicacidsubunitthreeprime.hasText()) {

			s.addSbstncNclicAcidSubuntThreePrimeTxt(String.valueOf(substancenucleicacidsubunitthreeprime.getText()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeTxt("NULL");
		}


		/******************** substancenucleicacidsubunitthreeprimecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidsubunitthreeprimecodinglist = substancenucleicacidsubunitthreeprime.getCoding();
		for(int substancenucleicacidsubunitthreeprimecodingi = 0; substancenucleicacidsubunitthreeprimecodingi<substancenucleicacidsubunitthreeprimecodinglist.size();substancenucleicacidsubunitthreeprimecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidsubunitthreeprimecoding = substancenucleicacidsubunitthreeprimecodinglist.get(substancenucleicacidsubunitthreeprimecodingi);

		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecodingi == 0) {s.addSbstncNclicAcidSubuntThreePrimeCdgDsply("[[");}
		if(substancenucleicacidsubunitthreeprimecoding.hasDisplay()) {

			s.addSbstncNclicAcidSubuntThreePrimeCdgDsply(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeCdgDsply("NULL");
		}

		if(substancenucleicacidsubunitthreeprimecodingi == substancenucleicacidsubunitthreeprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntThreePrimeCdgDsply("]]");}


		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecodingi == 0) {s.addSbstncNclicAcidSubuntThreePrimeCdgVrsn("[[");}
		if(substancenucleicacidsubunitthreeprimecoding.hasVersion()) {

			s.addSbstncNclicAcidSubuntThreePrimeCdgVrsn(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeCdgVrsn("NULL");
		}

		if(substancenucleicacidsubunitthreeprimecodingi == substancenucleicacidsubunitthreeprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntThreePrimeCdgVrsn("]]");}


		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecodingi == 0) {s.addSbstncNclicAcidSubuntThreePrimeCdgCd("[[");}
		if(substancenucleicacidsubunitthreeprimecoding.hasCode()) {

			s.addSbstncNclicAcidSubuntThreePrimeCdgCd(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getCode()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeCdgCd("NULL");
		}

		if(substancenucleicacidsubunitthreeprimecodingi == substancenucleicacidsubunitthreeprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntThreePrimeCdgCd("]]");}


		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecodingi == 0) {s.addSbstncNclicAcidSubuntThreePrimeCdgUsrSltd("[[");}
		if(substancenucleicacidsubunitthreeprimecoding.hasUserSelected()) {

			s.addSbstncNclicAcidSubuntThreePrimeCdgUsrSltd(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeCdgUsrSltd("NULL");
		}

		if(substancenucleicacidsubunitthreeprimecodingi == substancenucleicacidsubunitthreeprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntThreePrimeCdgUsrSltd("]]");}


		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecodingi == 0) {s.addSbstncNclicAcidSubuntThreePrimeCdgSys("[[");}
		if(substancenucleicacidsubunitthreeprimecoding.hasSystem()) {

			s.addSbstncNclicAcidSubuntThreePrimeCdgSys(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntThreePrimeCdgSys("NULL");
		}

		if(substancenucleicacidsubunitthreeprimecodingi == substancenucleicacidsubunitthreeprimecodinglist.size()-1) {s.addSbstncNclicAcidSubuntThreePrimeCdgSys("]]");}


		 };
		/******************** substancenucleicacidsubunitsugar ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent> substancenucleicacidsubunitsugarlist = substancenucleicacidsubunit.getSugar();
		for(int substancenucleicacidsubunitsugari = 0; substancenucleicacidsubunitsugari<substancenucleicacidsubunitsugarlist.size();substancenucleicacidsubunitsugari++ ) {
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent  substancenucleicacidsubunitsugar = substancenucleicacidsubunitsugarlist.get(substancenucleicacidsubunitsugari);

		/******************** SbstncNclicAcid_Subunt_Sugar_Nm ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarNm("[[");}
		if(substancenucleicacidsubunitsugar.hasName()) {

			s.addSbstncNclicAcidSubuntSugarNm(String.valueOf(substancenucleicacidsubunitsugar.getName()));
		} else {
			s.addSbstncNclicAcidSubuntSugarNm("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarNm("]]");}


		/******************** substancenucleicacidsubunitsugaridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitsugaridentifier = substancenucleicacidsubunitsugar.getIdentifier();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Vl ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdVl("[[");}
		if(substancenucleicacidsubunitsugaridentifier.hasValue()) {

			s.addSbstncNclicAcidSubuntSugarIdVl(String.valueOf(substancenucleicacidsubunitsugaridentifier.getValue()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdVl("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdVl("]]");}


		/******************** substancenucleicacidsubunitsugaridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitsugaridentifiertype = substancenucleicacidsubunitsugaridentifier.getType();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Txt ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdTypTxt("[[");}
		if(substancenucleicacidsubunitsugaridentifiertype.hasText()) {

			s.addSbstncNclicAcidSubuntSugarIdTypTxt(String.valueOf(substancenucleicacidsubunitsugaridentifiertype.getText()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypTxt("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypTxt("]]");}


		/******************** substancenucleicacidsubunitsugaridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancenucleicacidsubunitsugaridentifiertypecodinglist = substancenucleicacidsubunitsugaridentifiertype.getCoding();
		for(int substancenucleicacidsubunitsugaridentifiertypecodingi = 0; substancenucleicacidsubunitsugaridentifiertypecodingi<substancenucleicacidsubunitsugaridentifiertypecodinglist.size();substancenucleicacidsubunitsugaridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancenucleicacidsubunitsugaridentifiertypecoding = substancenucleicacidsubunitsugaridentifiertypecodinglist.get(substancenucleicacidsubunitsugaridentifiertypecodingi);

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntSugarIdTypCdgDsply("[[[");}
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasDisplay()) {

			s.addSbstncNclicAcidSubuntSugarIdTypCdgDsply(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypCdgDsply("NULL");
		}

		if(substancenucleicacidsubunitsugaridentifiertypecodingi == substancenucleicacidsubunitsugaridentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypCdgDsply("]]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntSugarIdTypCdgVrsn("[[[");}
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasVersion()) {

			s.addSbstncNclicAcidSubuntSugarIdTypCdgVrsn(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getVersion()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypCdgVrsn("NULL");
		}

		if(substancenucleicacidsubunitsugaridentifiertypecodingi == substancenucleicacidsubunitsugaridentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypCdgVrsn("]]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntSugarIdTypCdgCd("[[[");}
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasCode()) {

			s.addSbstncNclicAcidSubuntSugarIdTypCdgCd(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getCode()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypCdgCd("NULL");
		}

		if(substancenucleicacidsubunitsugaridentifiertypecodingi == substancenucleicacidsubunitsugaridentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypCdgCd("]]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd("[[[");}
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasUserSelected()) {

			s.addSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd("NULL");
		}

		if(substancenucleicacidsubunitsugaridentifiertypecodingi == substancenucleicacidsubunitsugaridentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd("]]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecodingi == 0) {s.addSbstncNclicAcidSubuntSugarIdTypCdgSys("[[[");}
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasSystem()) {

			s.addSbstncNclicAcidSubuntSugarIdTypCdgSys(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdTypCdgSys("NULL");
		}

		if(substancenucleicacidsubunitsugaridentifiertypecodingi == substancenucleicacidsubunitsugaridentifiertypecodinglist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdTypCdgSys("]]]");}


		 };
		/******************** substancenucleicacidsubunitsugaridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitsugaridentifierperiod = substancenucleicacidsubunitsugaridentifier.getPeriod();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strt ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdPrdStrt("[[");}
		if(substancenucleicacidsubunitsugaridentifierperiod.hasStart()) {

			s.addSbstncNclicAcidSubuntSugarIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancenucleicacidsubunitsugaridentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncNclicAcidSubuntSugarIdPrdStrt("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdPrdStrt("]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_End ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdPrdEnd("[[");}
		if(substancenucleicacidsubunitsugaridentifierperiod.hasEnd()) {

			s.addSbstncNclicAcidSubuntSugarIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancenucleicacidsubunitsugaridentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncNclicAcidSubuntSugarIdPrdEnd("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdPrdEnd("]]");}


		/******************** substancenucleicacidsubunitsugaridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancenucleicacidsubunitsugaridentifieruse = substancenucleicacidsubunitsugaridentifier.getUse();
		if(substancenucleicacidsubunitsugaridentifieruse!=null) {
		if(substancenucleicacidsubunitsugari == 0) {

		s.addSbstncNclicAcidSubuntSugarIdUse("[[");		}
			s.addSbstncNclicAcidSubuntSugarIdUse(substancenucleicacidsubunitsugaridentifieruse.toCode());
		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {

		s.addSbstncNclicAcidSubuntSugarIdUse("]]");		}

		} else {
			s.addSbstncNclicAcidSubuntSugarIdUse("NULL");
		}

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Assigner ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdAssigner("[[");}
		if(substancenucleicacidsubunitsugaridentifier.hasAssigner()) {

			if(substancenucleicacidsubunitsugaridentifier.getAssigner().getReference() != null) {
			s.addSbstncNclicAcidSubuntSugarIdAssigner(substancenucleicacidsubunitsugaridentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncNclicAcidSubuntSugarIdAssigner("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdAssigner("]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Sys ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarIdSys("[[");}
		if(substancenucleicacidsubunitsugaridentifier.hasSystem()) {

			s.addSbstncNclicAcidSubuntSugarIdSys(String.valueOf(substancenucleicacidsubunitsugaridentifier.getSystem()));
		} else {
			s.addSbstncNclicAcidSubuntSugarIdSys("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarIdSys("]]");}


		/******************** SbstncNclicAcid_Subunt_Sugar_ResidueSite ********************************************************************************/
		if(substancenucleicacidsubunitsugari == 0) {s.addSbstncNclicAcidSubuntSugarResidueSite("[[");}
		if(substancenucleicacidsubunitsugar.hasResidueSite()) {

			s.addSbstncNclicAcidSubuntSugarResidueSite(String.valueOf(substancenucleicacidsubunitsugar.getResidueSite()));
		} else {
			s.addSbstncNclicAcidSubuntSugarResidueSite("NULL");
		}

		if(substancenucleicacidsubunitsugari == substancenucleicacidsubunitsugarlist.size()-1) {s.addSbstncNclicAcidSubuntSugarResidueSite("]]");}


		 };
		/******************** substancenucleicacidsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancenucleicacidsubunitsequenceattachment = substancenucleicacidsubunit.getSequenceAttachment();

		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasSize()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntSz(String.valueOf(substancenucleicacidsubunitsequenceattachment.getSize()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntSz("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasLanguage()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntLnguage(String.valueOf(substancenucleicacidsubunitsequenceattachment.getLanguage()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntLnguage("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasContentType()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntCntntTyp(String.valueOf(substancenucleicacidsubunitsequenceattachment.getContentType()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntCntntTyp("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasHash()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntHash(new String(substancenucleicacidsubunitsequenceattachment.getHash()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntHash("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasData()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntData(new String(substancenucleicacidsubunitsequenceattachment.getData()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntData("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasCreation()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancenucleicacidsubunitsequenceattachment.getCreation())+"\"");
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntCreation("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasTitle()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntTtl(String.valueOf(substancenucleicacidsubunitsequenceattachment.getTitle()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntTtl("NULL");
		}


		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasUrl()) {

			s.addSbstncNclicAcidSubuntSqncAttchmntUrl(String.valueOf(substancenucleicacidsubunitsequenceattachment.getUrl()));
		} else {
			s.addSbstncNclicAcidSubuntSqncAttchmntUrl("NULL");
		}


		 };
		return s;
	}
}
