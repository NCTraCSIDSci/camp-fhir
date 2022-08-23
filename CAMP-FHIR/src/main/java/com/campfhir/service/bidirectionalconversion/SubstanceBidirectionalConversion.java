package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Substance;
public class SubstanceBidirectionalConversion 
{
	public Substance Substances(org.hl7.fhir.r4.model.Substance substance) throws ParseException
	{
		 main.java.com.campfhir.model.Substance s = new  main.java.com.campfhir.model.Substance();

		/******************** id ********************************************************************************/
		s.setId(substance.getIdElement().getIdPart());

		/******************** substanceinstance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent> substanceinstancelist = substance.getInstance();
		for(int substanceinstancei = 0; substanceinstancei<substanceinstancelist.size();substanceinstancei++ ) {
		org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent  substanceinstance = substanceinstancelist.get(substanceinstancei);

		/******************** substanceinstanceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceinstanceidentifier = substanceinstance.getIdentifier();

		/******************** Sbstnc_Instance_Id_Vl ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdVl("[");}
		if(substanceinstanceidentifier.hasValue()) {

			s.addSbstncInstanceIdVl(String.valueOf(substanceinstanceidentifier.getValue()));
		} else {
			s.addSbstncInstanceIdVl("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdVl("]");}


		/******************** substanceinstanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceinstanceidentifiertype = substanceinstanceidentifier.getType();

		/******************** Sbstnc_Instance_Id_Typ_Txt ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdTypTxt("[");}
		if(substanceinstanceidentifiertype.hasText()) {

			s.addSbstncInstanceIdTypTxt(String.valueOf(substanceinstanceidentifiertype.getText()));
		} else {
			s.addSbstncInstanceIdTypTxt("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdTypTxt("]");}


		/******************** substanceinstanceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceinstanceidentifiertypecodinglist = substanceinstanceidentifiertype.getCoding();
		for(int substanceinstanceidentifiertypecodingi = 0; substanceinstanceidentifiertypecodingi<substanceinstanceidentifiertypecodinglist.size();substanceinstanceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceinstanceidentifiertypecoding = substanceinstanceidentifiertypecodinglist.get(substanceinstanceidentifiertypecodingi);

		/******************** Sbstnc_Instance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceinstanceidentifiertypecodingi == 0) {s.addSbstncInstanceIdTypCdgDsply("[[");}
		if(substanceinstanceidentifiertypecoding.hasDisplay()) {

			s.addSbstncInstanceIdTypCdgDsply(String.valueOf(substanceinstanceidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncInstanceIdTypCdgDsply("NULL");
		}

		if(substanceinstanceidentifiertypecodingi == substanceinstanceidentifiertypecodinglist.size()-1) {s.addSbstncInstanceIdTypCdgDsply("]]");}


		/******************** Sbstnc_Instance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceinstanceidentifiertypecodingi == 0) {s.addSbstncInstanceIdTypCdgVrsn("[[");}
		if(substanceinstanceidentifiertypecoding.hasVersion()) {

			s.addSbstncInstanceIdTypCdgVrsn(String.valueOf(substanceinstanceidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncInstanceIdTypCdgVrsn("NULL");
		}

		if(substanceinstanceidentifiertypecodingi == substanceinstanceidentifiertypecodinglist.size()-1) {s.addSbstncInstanceIdTypCdgVrsn("]]");}


		/******************** Sbstnc_Instance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substanceinstanceidentifiertypecodingi == 0) {s.addSbstncInstanceIdTypCdgCd("[[");}
		if(substanceinstanceidentifiertypecoding.hasCode()) {

			s.addSbstncInstanceIdTypCdgCd(String.valueOf(substanceinstanceidentifiertypecoding.getCode()));
		} else {
			s.addSbstncInstanceIdTypCdgCd("NULL");
		}

		if(substanceinstanceidentifiertypecodingi == substanceinstanceidentifiertypecodinglist.size()-1) {s.addSbstncInstanceIdTypCdgCd("]]");}


		/******************** Sbstnc_Instance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceinstanceidentifiertypecodingi == 0) {s.addSbstncInstanceIdTypCdgUsrSltd("[[");}
		if(substanceinstanceidentifiertypecoding.hasUserSelected()) {

			s.addSbstncInstanceIdTypCdgUsrSltd(String.valueOf(substanceinstanceidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncInstanceIdTypCdgUsrSltd("NULL");
		}

		if(substanceinstanceidentifiertypecodingi == substanceinstanceidentifiertypecodinglist.size()-1) {s.addSbstncInstanceIdTypCdgUsrSltd("]]");}


		/******************** Sbstnc_Instance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substanceinstanceidentifiertypecodingi == 0) {s.addSbstncInstanceIdTypCdgSys("[[");}
		if(substanceinstanceidentifiertypecoding.hasSystem()) {

			s.addSbstncInstanceIdTypCdgSys(String.valueOf(substanceinstanceidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncInstanceIdTypCdgSys("NULL");
		}

		if(substanceinstanceidentifiertypecodingi == substanceinstanceidentifiertypecodinglist.size()-1) {s.addSbstncInstanceIdTypCdgSys("]]");}


		 };
		/******************** substanceinstanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceinstanceidentifierperiod = substanceinstanceidentifier.getPeriod();

		/******************** Sbstnc_Instance_Id_Prd_Strt ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdPrdStrt("[");}
		if(substanceinstanceidentifierperiod.hasStart()) {

			s.addSbstncInstanceIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceinstanceidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncInstanceIdPrdStrt("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdPrdStrt("]");}


		/******************** Sbstnc_Instance_Id_Prd_End ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdPrdEnd("[");}
		if(substanceinstanceidentifierperiod.hasEnd()) {

			s.addSbstncInstanceIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceinstanceidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncInstanceIdPrdEnd("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdPrdEnd("]");}


		/******************** substanceinstanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceinstanceidentifieruse = substanceinstanceidentifier.getUse();
		if(substanceinstanceidentifieruse!=null) {
		if(substanceinstancei == 0) {

		s.addSbstncInstanceIdUse("[");		}
			s.addSbstncInstanceIdUse(substanceinstanceidentifieruse.toCode());
		if(substanceinstancei == substanceinstancelist.size()-1) {

		s.addSbstncInstanceIdUse("]");		}

		} else {
			s.addSbstncInstanceIdUse("NULL");
		}

		/******************** Sbstnc_Instance_Id_Assigner ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdAssigner("[");}
		if(substanceinstanceidentifier.hasAssigner()) {

			if(substanceinstanceidentifier.getAssigner().getReference() != null) {
			s.addSbstncInstanceIdAssigner(substanceinstanceidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncInstanceIdAssigner("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdAssigner("]");}


		/******************** Sbstnc_Instance_Id_Sys ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceIdSys("[");}
		if(substanceinstanceidentifier.hasSystem()) {

			s.addSbstncInstanceIdSys(String.valueOf(substanceinstanceidentifier.getSystem()));
		} else {
			s.addSbstncInstanceIdSys("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceIdSys("]");}


		/******************** Sbstnc_Instance_Expiry ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceExpiry("[");}
		if(substanceinstance.hasExpiry()) {

			s.addSbstncInstanceExpiry("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceinstance.getExpiry())+"\"");
		} else {
			s.addSbstncInstanceExpiry("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceExpiry("]");}


		/******************** substanceinstancequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceinstancequantity = substanceinstance.getQuantity();

		/******************** Sbstnc_Instance_Qnty_Vl ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceQntyVl("[");}
		if(substanceinstancequantity.hasValue()) {

			s.addSbstncInstanceQntyVl(String.valueOf(substanceinstancequantity.getValue()));
		} else {
			s.addSbstncInstanceQntyVl("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceQntyVl("]");}


		/******************** substanceinstancequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceinstancequantitycomparator = substanceinstancequantity.getComparator();
		if(substanceinstancequantitycomparator!=null) {
		if(substanceinstancei == 0) {

		s.addSbstncInstanceQntyCmprtr("[");		}
			s.addSbstncInstanceQntyCmprtr(substanceinstancequantitycomparator.toCode());
		if(substanceinstancei == substanceinstancelist.size()-1) {

		s.addSbstncInstanceQntyCmprtr("]");		}

		} else {
			s.addSbstncInstanceQntyCmprtr("NULL");
		}

		/******************** Sbstnc_Instance_Qnty_Cd ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceQntyCd("[");}
		if(substanceinstancequantity.hasCode()) {

			s.addSbstncInstanceQntyCd(String.valueOf(substanceinstancequantity.getCode()));
		} else {
			s.addSbstncInstanceQntyCd("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceQntyCd("]");}


		/******************** Sbstnc_Instance_Qnty_Unt ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceQntyUnt("[");}
		if(substanceinstancequantity.hasUnit()) {

			s.addSbstncInstanceQntyUnt(String.valueOf(substanceinstancequantity.getUnit()));
		} else {
			s.addSbstncInstanceQntyUnt("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceQntyUnt("]");}


		/******************** Sbstnc_Instance_Qnty_Sys ********************************************************************************/
		if(substanceinstancei == 0) {s.addSbstncInstanceQntySys("[");}
		if(substanceinstancequantity.hasSystem()) {

			s.addSbstncInstanceQntySys(String.valueOf(substanceinstancequantity.getSystem()));
		} else {
			s.addSbstncInstanceQntySys("NULL");
		}

		if(substanceinstancei == substanceinstancelist.size()-1) {s.addSbstncInstanceQntySys("]");}


		 };
		/******************** substancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancecode = substance.getCode();

		/******************** Sbstnc_Cd_Txt ********************************************************************************/
		if(substancecode.hasText()) {

			s.addSbstncCdTxt(String.valueOf(substancecode.getText()));
		} else {
			s.addSbstncCdTxt("NULL");
		}


		/******************** substancecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancecodecodinglist = substancecode.getCoding();
		for(int substancecodecodingi = 0; substancecodecodingi<substancecodecodinglist.size();substancecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancecodecoding = substancecodecodinglist.get(substancecodecodingi);

		/******************** Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(substancecodecodingi == 0) {s.addSbstncCdCdgDsply("[");}
		if(substancecodecoding.hasDisplay()) {

			s.addSbstncCdCdgDsply(String.valueOf(substancecodecoding.getDisplay()));
		} else {
			s.addSbstncCdCdgDsply("NULL");
		}

		if(substancecodecodingi == substancecodecodinglist.size()-1) {s.addSbstncCdCdgDsply("]");}


		/******************** Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancecodecodingi == 0) {s.addSbstncCdCdgVrsn("[");}
		if(substancecodecoding.hasVersion()) {

			s.addSbstncCdCdgVrsn(String.valueOf(substancecodecoding.getVersion()));
		} else {
			s.addSbstncCdCdgVrsn("NULL");
		}

		if(substancecodecodingi == substancecodecodinglist.size()-1) {s.addSbstncCdCdgVrsn("]");}


		/******************** Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(substancecodecodingi == 0) {s.addSbstncCdCdgCd("[");}
		if(substancecodecoding.hasCode()) {

			s.addSbstncCdCdgCd(String.valueOf(substancecodecoding.getCode()));
		} else {
			s.addSbstncCdCdgCd("NULL");
		}

		if(substancecodecodingi == substancecodecodinglist.size()-1) {s.addSbstncCdCdgCd("]");}


		/******************** Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancecodecodingi == 0) {s.addSbstncCdCdgUsrSltd("[");}
		if(substancecodecoding.hasUserSelected()) {

			s.addSbstncCdCdgUsrSltd(String.valueOf(substancecodecoding.getUserSelected()));
		} else {
			s.addSbstncCdCdgUsrSltd("NULL");
		}

		if(substancecodecodingi == substancecodecodinglist.size()-1) {s.addSbstncCdCdgUsrSltd("]");}


		/******************** Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(substancecodecodingi == 0) {s.addSbstncCdCdgSys("[");}
		if(substancecodecoding.hasSystem()) {

			s.addSbstncCdCdgSys(String.valueOf(substancecodecoding.getSystem()));
		} else {
			s.addSbstncCdCdgSys("NULL");
		}

		if(substancecodecodingi == substancecodecodinglist.size()-1) {s.addSbstncCdCdgSys("]");}


		 };
		/******************** substancestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatus substancestatus = substance.getStatus();
		if(substancestatus!=null) {
			s.addSbstncSts(substancestatus.toCode());
		} else {
			s.addSbstncSts("NULL");
		}

		/******************** Sbstnc_Dscrptn ********************************************************************************/
		if(substance.hasDescription()) {

			s.addSbstncDscrptn(String.valueOf(substance.getDescription()));
		} else {
			s.addSbstncDscrptn("NULL");
		}


		/******************** substanceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> substanceidentifierlist = substance.getIdentifier();
		for(int substanceidentifieri = 0; substanceidentifieri<substanceidentifierlist.size();substanceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  substanceidentifier = substanceidentifierlist.get(substanceidentifieri);

		/******************** Sbstnc_Id_Vl ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdVl("[");}
		if(substanceidentifier.hasValue()) {

			s.addSbstncIdVl(String.valueOf(substanceidentifier.getValue()));
		} else {
			s.addSbstncIdVl("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdVl("]");}


		/******************** substanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceidentifiertype = substanceidentifier.getType();

		/******************** Sbstnc_Id_Typ_Txt ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdTypTxt("[");}
		if(substanceidentifiertype.hasText()) {

			s.addSbstncIdTypTxt(String.valueOf(substanceidentifiertype.getText()));
		} else {
			s.addSbstncIdTypTxt("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdTypTxt("]");}


		/******************** substanceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceidentifiertypecodinglist = substanceidentifiertype.getCoding();
		for(int substanceidentifiertypecodingi = 0; substanceidentifiertypecodingi<substanceidentifiertypecodinglist.size();substanceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceidentifiertypecoding = substanceidentifiertypecodinglist.get(substanceidentifiertypecodingi);

		/******************** Sbstnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceidentifiertypecodingi == 0) {s.addSbstncIdTypCdgDsply("[[");}
		if(substanceidentifiertypecoding.hasDisplay()) {

			s.addSbstncIdTypCdgDsply(String.valueOf(substanceidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncIdTypCdgDsply("NULL");
		}

		if(substanceidentifiertypecodingi == substanceidentifiertypecodinglist.size()-1) {s.addSbstncIdTypCdgDsply("]]");}


		/******************** Sbstnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceidentifiertypecodingi == 0) {s.addSbstncIdTypCdgVrsn("[[");}
		if(substanceidentifiertypecoding.hasVersion()) {

			s.addSbstncIdTypCdgVrsn(String.valueOf(substanceidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncIdTypCdgVrsn("NULL");
		}

		if(substanceidentifiertypecodingi == substanceidentifiertypecodinglist.size()-1) {s.addSbstncIdTypCdgVrsn("]]");}


		/******************** Sbstnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substanceidentifiertypecodingi == 0) {s.addSbstncIdTypCdgCd("[[");}
		if(substanceidentifiertypecoding.hasCode()) {

			s.addSbstncIdTypCdgCd(String.valueOf(substanceidentifiertypecoding.getCode()));
		} else {
			s.addSbstncIdTypCdgCd("NULL");
		}

		if(substanceidentifiertypecodingi == substanceidentifiertypecodinglist.size()-1) {s.addSbstncIdTypCdgCd("]]");}


		/******************** Sbstnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceidentifiertypecodingi == 0) {s.addSbstncIdTypCdgUsrSltd("[[");}
		if(substanceidentifiertypecoding.hasUserSelected()) {

			s.addSbstncIdTypCdgUsrSltd(String.valueOf(substanceidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncIdTypCdgUsrSltd("NULL");
		}

		if(substanceidentifiertypecodingi == substanceidentifiertypecodinglist.size()-1) {s.addSbstncIdTypCdgUsrSltd("]]");}


		/******************** Sbstnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substanceidentifiertypecodingi == 0) {s.addSbstncIdTypCdgSys("[[");}
		if(substanceidentifiertypecoding.hasSystem()) {

			s.addSbstncIdTypCdgSys(String.valueOf(substanceidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncIdTypCdgSys("NULL");
		}

		if(substanceidentifiertypecodingi == substanceidentifiertypecodinglist.size()-1) {s.addSbstncIdTypCdgSys("]]");}


		 };
		/******************** substanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceidentifierperiod = substanceidentifier.getPeriod();

		/******************** Sbstnc_Id_Prd_Strt ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdPrdStrt("[");}
		if(substanceidentifierperiod.hasStart()) {

			s.addSbstncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncIdPrdStrt("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdPrdStrt("]");}


		/******************** Sbstnc_Id_Prd_End ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdPrdEnd("[");}
		if(substanceidentifierperiod.hasEnd()) {

			s.addSbstncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncIdPrdEnd("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdPrdEnd("]");}


		/******************** substanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceidentifieruse = substanceidentifier.getUse();
		if(substanceidentifieruse!=null) {
		if(substanceidentifieri == 0) {

		s.addSbstncIdUse("[");		}
			s.addSbstncIdUse(substanceidentifieruse.toCode());
		if(substanceidentifieri == substanceidentifierlist.size()-1) {

		s.addSbstncIdUse("]");		}

		} else {
			s.addSbstncIdUse("NULL");
		}

		/******************** Sbstnc_Id_Assigner ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdAssigner("[");}
		if(substanceidentifier.hasAssigner()) {

			if(substanceidentifier.getAssigner().getReference() != null) {
			s.addSbstncIdAssigner(substanceidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncIdAssigner("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdAssigner("]");}


		/******************** Sbstnc_Id_Sys ********************************************************************************/
		if(substanceidentifieri == 0) {s.addSbstncIdSys("[");}
		if(substanceidentifier.hasSystem()) {

			s.addSbstncIdSys(String.valueOf(substanceidentifier.getSystem()));
		} else {
			s.addSbstncIdSys("NULL");
		}

		if(substanceidentifieri == substanceidentifierlist.size()-1) {s.addSbstncIdSys("]");}


		 };
		/******************** substancecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancecategorylist = substance.getCategory();
		for(int substancecategoryi = 0; substancecategoryi<substancecategorylist.size();substancecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancecategory = substancecategorylist.get(substancecategoryi);

		/******************** Sbstnc_Ctgry_Txt ********************************************************************************/
		if(substancecategoryi == 0) {s.addSbstncCtgryTxt("[");}
		if(substancecategory.hasText()) {

			s.addSbstncCtgryTxt(String.valueOf(substancecategory.getText()));
		} else {
			s.addSbstncCtgryTxt("NULL");
		}

		if(substancecategoryi == substancecategorylist.size()-1) {s.addSbstncCtgryTxt("]");}


		/******************** substancecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancecategorycodinglist = substancecategory.getCoding();
		for(int substancecategorycodingi = 0; substancecategorycodingi<substancecategorycodinglist.size();substancecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancecategorycoding = substancecategorycodinglist.get(substancecategorycodingi);

		/******************** Sbstnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(substancecategorycodingi == 0) {s.addSbstncCtgryCdgDsply("[[");}
		if(substancecategorycoding.hasDisplay()) {

			s.addSbstncCtgryCdgDsply(String.valueOf(substancecategorycoding.getDisplay()));
		} else {
			s.addSbstncCtgryCdgDsply("NULL");
		}

		if(substancecategorycodingi == substancecategorycodinglist.size()-1) {s.addSbstncCtgryCdgDsply("]]");}


		/******************** Sbstnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(substancecategorycodingi == 0) {s.addSbstncCtgryCdgVrsn("[[");}
		if(substancecategorycoding.hasVersion()) {

			s.addSbstncCtgryCdgVrsn(String.valueOf(substancecategorycoding.getVersion()));
		} else {
			s.addSbstncCtgryCdgVrsn("NULL");
		}

		if(substancecategorycodingi == substancecategorycodinglist.size()-1) {s.addSbstncCtgryCdgVrsn("]]");}


		/******************** Sbstnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(substancecategorycodingi == 0) {s.addSbstncCtgryCdgCd("[[");}
		if(substancecategorycoding.hasCode()) {

			s.addSbstncCtgryCdgCd(String.valueOf(substancecategorycoding.getCode()));
		} else {
			s.addSbstncCtgryCdgCd("NULL");
		}

		if(substancecategorycodingi == substancecategorycodinglist.size()-1) {s.addSbstncCtgryCdgCd("]]");}


		/******************** Sbstnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(substancecategorycodingi == 0) {s.addSbstncCtgryCdgUsrSltd("[[");}
		if(substancecategorycoding.hasUserSelected()) {

			s.addSbstncCtgryCdgUsrSltd(String.valueOf(substancecategorycoding.getUserSelected()));
		} else {
			s.addSbstncCtgryCdgUsrSltd("NULL");
		}

		if(substancecategorycodingi == substancecategorycodinglist.size()-1) {s.addSbstncCtgryCdgUsrSltd("]]");}


		/******************** Sbstnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(substancecategorycodingi == 0) {s.addSbstncCtgryCdgSys("[[");}
		if(substancecategorycoding.hasSystem()) {

			s.addSbstncCtgryCdgSys(String.valueOf(substancecategorycoding.getSystem()));
		} else {
			s.addSbstncCtgryCdgSys("NULL");
		}

		if(substancecategorycodingi == substancecategorycodinglist.size()-1) {s.addSbstncCtgryCdgSys("]]");}


		 };
		 };
		/******************** substanceingredient ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent> substanceingredientlist = substance.getIngredient();
		for(int substanceingredienti = 0; substanceingredienti<substanceingredientlist.size();substanceingredienti++ ) {
		org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent  substanceingredient = substanceingredientlist.get(substanceingredienti);

		/******************** substanceingredientquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substanceingredientquantity = substanceingredient.getQuantity();

		/******************** substanceingredientquantitynumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitynumerator = substanceingredientquantity.getNumerator();

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Vl ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyNmrtrVl("[");}
		if(substanceingredientquantitynumerator.hasValue()) {

			s.addSbstncIgrdntQntyNmrtrVl(String.valueOf(substanceingredientquantitynumerator.getValue()));
		} else {
			s.addSbstncIgrdntQntyNmrtrVl("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyNmrtrVl("]");}


		/******************** substanceingredientquantitynumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceingredientquantitynumeratorcomparator = substanceingredientquantitynumerator.getComparator();
		if(substanceingredientquantitynumeratorcomparator!=null) {
		if(substanceingredienti == 0) {

		s.addSbstncIgrdntQntyNmrtrCmprtr("[");		}
			s.addSbstncIgrdntQntyNmrtrCmprtr(substanceingredientquantitynumeratorcomparator.toCode());
		if(substanceingredienti == substanceingredientlist.size()-1) {

		s.addSbstncIgrdntQntyNmrtrCmprtr("]");		}

		} else {
			s.addSbstncIgrdntQntyNmrtrCmprtr("NULL");
		}

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Cd ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyNmrtrCd("[");}
		if(substanceingredientquantitynumerator.hasCode()) {

			s.addSbstncIgrdntQntyNmrtrCd(String.valueOf(substanceingredientquantitynumerator.getCode()));
		} else {
			s.addSbstncIgrdntQntyNmrtrCd("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyNmrtrCd("]");}


		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Unt ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyNmrtrUnt("[");}
		if(substanceingredientquantitynumerator.hasUnit()) {

			s.addSbstncIgrdntQntyNmrtrUnt(String.valueOf(substanceingredientquantitynumerator.getUnit()));
		} else {
			s.addSbstncIgrdntQntyNmrtrUnt("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyNmrtrUnt("]");}


		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Sys ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyNmrtrSys("[");}
		if(substanceingredientquantitynumerator.hasSystem()) {

			s.addSbstncIgrdntQntyNmrtrSys(String.valueOf(substanceingredientquantitynumerator.getSystem()));
		} else {
			s.addSbstncIgrdntQntyNmrtrSys("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyNmrtrSys("]");}


		/******************** substanceingredientquantitydenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitydenominator = substanceingredientquantity.getDenominator();

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Vl ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyDnmntrVl("[");}
		if(substanceingredientquantitydenominator.hasValue()) {

			s.addSbstncIgrdntQntyDnmntrVl(String.valueOf(substanceingredientquantitydenominator.getValue()));
		} else {
			s.addSbstncIgrdntQntyDnmntrVl("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyDnmntrVl("]");}


		/******************** substanceingredientquantitydenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceingredientquantitydenominatorcomparator = substanceingredientquantitydenominator.getComparator();
		if(substanceingredientquantitydenominatorcomparator!=null) {
		if(substanceingredienti == 0) {

		s.addSbstncIgrdntQntyDnmntrCmprtr("[");		}
			s.addSbstncIgrdntQntyDnmntrCmprtr(substanceingredientquantitydenominatorcomparator.toCode());
		if(substanceingredienti == substanceingredientlist.size()-1) {

		s.addSbstncIgrdntQntyDnmntrCmprtr("]");		}

		} else {
			s.addSbstncIgrdntQntyDnmntrCmprtr("NULL");
		}

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Cd ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyDnmntrCd("[");}
		if(substanceingredientquantitydenominator.hasCode()) {

			s.addSbstncIgrdntQntyDnmntrCd(String.valueOf(substanceingredientquantitydenominator.getCode()));
		} else {
			s.addSbstncIgrdntQntyDnmntrCd("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyDnmntrCd("]");}


		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Unt ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyDnmntrUnt("[");}
		if(substanceingredientquantitydenominator.hasUnit()) {

			s.addSbstncIgrdntQntyDnmntrUnt(String.valueOf(substanceingredientquantitydenominator.getUnit()));
		} else {
			s.addSbstncIgrdntQntyDnmntrUnt("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyDnmntrUnt("]");}


		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Sys ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntQntyDnmntrSys("[");}
		if(substanceingredientquantitydenominator.hasSystem()) {

			s.addSbstncIgrdntQntyDnmntrSys(String.valueOf(substanceingredientquantitydenominator.getSystem()));
		} else {
			s.addSbstncIgrdntQntyDnmntrSys("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntQntyDnmntrSys("]");}


		/******************** substanceingredientsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceingredientsubstancecodeableconcept = substanceingredient.getSubstanceCodeableConcept();

		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntSbstncCdbleCncptTxt("[");}
		if(substanceingredientsubstancecodeableconcept.hasText()) {

			s.addSbstncIgrdntSbstncCdbleCncptTxt(String.valueOf(substanceingredientsubstancecodeableconcept.getText()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptTxt("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptTxt("]");}


		/******************** substanceingredientsubstancecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceingredientsubstancecodeableconceptcodinglist = substanceingredientsubstancecodeableconcept.getCoding();
		for(int substanceingredientsubstancecodeableconceptcodingi = 0; substanceingredientsubstancecodeableconceptcodingi<substanceingredientsubstancecodeableconceptcodinglist.size();substanceingredientsubstancecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceingredientsubstancecodeableconceptcoding = substanceingredientsubstancecodeableconceptcodinglist.get(substanceingredientsubstancecodeableconceptcodingi);

		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcodingi == 0) {s.addSbstncIgrdntSbstncCdbleCncptCdgDsply("[[");}
		if(substanceingredientsubstancecodeableconceptcoding.hasDisplay()) {

			s.addSbstncIgrdntSbstncCdbleCncptCdgDsply(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getDisplay()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptCdgDsply("NULL");
		}

		if(substanceingredientsubstancecodeableconceptcodingi == substanceingredientsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptCdgDsply("]]");}


		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcodingi == 0) {s.addSbstncIgrdntSbstncCdbleCncptCdgVrsn("[[");}
		if(substanceingredientsubstancecodeableconceptcoding.hasVersion()) {

			s.addSbstncIgrdntSbstncCdbleCncptCdgVrsn(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getVersion()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptCdgVrsn("NULL");
		}

		if(substanceingredientsubstancecodeableconceptcodingi == substanceingredientsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptCdgVrsn("]]");}


		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcodingi == 0) {s.addSbstncIgrdntSbstncCdbleCncptCdgCd("[[");}
		if(substanceingredientsubstancecodeableconceptcoding.hasCode()) {

			s.addSbstncIgrdntSbstncCdbleCncptCdgCd(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getCode()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptCdgCd("NULL");
		}

		if(substanceingredientsubstancecodeableconceptcodingi == substanceingredientsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptCdgCd("]]");}


		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcodingi == 0) {s.addSbstncIgrdntSbstncCdbleCncptCdgUsrSltd("[[");}
		if(substanceingredientsubstancecodeableconceptcoding.hasUserSelected()) {

			s.addSbstncIgrdntSbstncCdbleCncptCdgUsrSltd(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptCdgUsrSltd("NULL");
		}

		if(substanceingredientsubstancecodeableconceptcodingi == substanceingredientsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptCdgUsrSltd("]]");}


		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcodingi == 0) {s.addSbstncIgrdntSbstncCdbleCncptCdgSys("[[");}
		if(substanceingredientsubstancecodeableconceptcoding.hasSystem()) {

			s.addSbstncIgrdntSbstncCdbleCncptCdgSys(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getSystem()));
		} else {
			s.addSbstncIgrdntSbstncCdbleCncptCdgSys("NULL");
		}

		if(substanceingredientsubstancecodeableconceptcodingi == substanceingredientsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncIgrdntSbstncCdbleCncptCdgSys("]]");}


		 };
		/******************** Sbstnc_Igrdnt_SbstncRfrnc ********************************************************************************/
		if(substanceingredienti == 0) {s.addSbstncIgrdntSbstncRfrnc("[");}
		if(substanceingredient.hasSubstanceReference()) {

			if(substanceingredient.getSubstanceReference().getReference() != null) {
			s.addSbstncIgrdntSbstncRfrnc(substanceingredient.getSubstanceReference().getReference());
			}
		} else {
			s.addSbstncIgrdntSbstncRfrnc("NULL");
		}

		if(substanceingredienti == substanceingredientlist.size()-1) {s.addSbstncIgrdntSbstncRfrnc("]");}


		 };
		return s;
	}
}
