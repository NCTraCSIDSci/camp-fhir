package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItem;
public class ChargeItemBidirectionalConversion 
{
	public ChargeItem ChargeItems(org.hl7.fhir.r4.model.ChargeItem chargeitem) throws ParseException
	{
		 main.java.com.campfhir.model.ChargeItem c = new  main.java.com.campfhir.model.ChargeItem();

		/******************** id ********************************************************************************/
		c.setId(chargeitem.getIdElement().getIdPart());

		/******************** ChrgItm_Cntxt ********************************************************************************/
		if(chargeitem.hasContext()) {

			if(chargeitem.getContext().getReference() != null) {
			c.addChrgItmCntxt(chargeitem.getContext().getReference());
			}
		} else {
			c.addChrgItmCntxt("NULL");
		}


		/******************** chargeitemreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> chargeitemreasonlist = chargeitem.getReason();
		for(int chargeitemreasoni = 0; chargeitemreasoni<chargeitemreasonlist.size();chargeitemreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  chargeitemreason = chargeitemreasonlist.get(chargeitemreasoni);

		/******************** ChrgItm_Rsn_Txt ********************************************************************************/
		if(chargeitemreasoni == 0) {c.addChrgItmRsnTxt("[");}
		if(chargeitemreason.hasText()) {

			c.addChrgItmRsnTxt(String.valueOf(chargeitemreason.getText()));
		} else {
			c.addChrgItmRsnTxt("NULL");
		}

		if(chargeitemreasoni == chargeitemreasonlist.size()-1) {c.addChrgItmRsnTxt("]");}


		/******************** chargeitemreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemreasoncodinglist = chargeitemreason.getCoding();
		for(int chargeitemreasoncodingi = 0; chargeitemreasoncodingi<chargeitemreasoncodinglist.size();chargeitemreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemreasoncoding = chargeitemreasoncodinglist.get(chargeitemreasoncodingi);

		/******************** ChrgItm_Rsn_Cdg_Dsply ********************************************************************************/
		if(chargeitemreasoncodingi == 0) {c.addChrgItmRsnCdgDsply("[[");}
		if(chargeitemreasoncoding.hasDisplay()) {

			c.addChrgItmRsnCdgDsply(String.valueOf(chargeitemreasoncoding.getDisplay()));
		} else {
			c.addChrgItmRsnCdgDsply("NULL");
		}

		if(chargeitemreasoncodingi == chargeitemreasoncodinglist.size()-1) {c.addChrgItmRsnCdgDsply("]]");}


		/******************** ChrgItm_Rsn_Cdg_Vrsn ********************************************************************************/
		if(chargeitemreasoncodingi == 0) {c.addChrgItmRsnCdgVrsn("[[");}
		if(chargeitemreasoncoding.hasVersion()) {

			c.addChrgItmRsnCdgVrsn(String.valueOf(chargeitemreasoncoding.getVersion()));
		} else {
			c.addChrgItmRsnCdgVrsn("NULL");
		}

		if(chargeitemreasoncodingi == chargeitemreasoncodinglist.size()-1) {c.addChrgItmRsnCdgVrsn("]]");}


		/******************** ChrgItm_Rsn_Cdg_Cd ********************************************************************************/
		if(chargeitemreasoncodingi == 0) {c.addChrgItmRsnCdgCd("[[");}
		if(chargeitemreasoncoding.hasCode()) {

			c.addChrgItmRsnCdgCd(String.valueOf(chargeitemreasoncoding.getCode()));
		} else {
			c.addChrgItmRsnCdgCd("NULL");
		}

		if(chargeitemreasoncodingi == chargeitemreasoncodinglist.size()-1) {c.addChrgItmRsnCdgCd("]]");}


		/******************** ChrgItm_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemreasoncodingi == 0) {c.addChrgItmRsnCdgUsrSltd("[[");}
		if(chargeitemreasoncoding.hasUserSelected()) {

			c.addChrgItmRsnCdgUsrSltd(String.valueOf(chargeitemreasoncoding.getUserSelected()));
		} else {
			c.addChrgItmRsnCdgUsrSltd("NULL");
		}

		if(chargeitemreasoncodingi == chargeitemreasoncodinglist.size()-1) {c.addChrgItmRsnCdgUsrSltd("]]");}


		/******************** ChrgItm_Rsn_Cdg_Sys ********************************************************************************/
		if(chargeitemreasoncodingi == 0) {c.addChrgItmRsnCdgSys("[[");}
		if(chargeitemreasoncoding.hasSystem()) {

			c.addChrgItmRsnCdgSys(String.valueOf(chargeitemreasoncoding.getSystem()));
		} else {
			c.addChrgItmRsnCdgSys("NULL");
		}

		if(chargeitemreasoncodingi == chargeitemreasoncodinglist.size()-1) {c.addChrgItmRsnCdgSys("]]");}


		 };
		 };
		/******************** chargeitemcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemcode = chargeitem.getCode();

		/******************** ChrgItm_Cd_Txt ********************************************************************************/
		if(chargeitemcode.hasText()) {

			c.addChrgItmCdTxt(String.valueOf(chargeitemcode.getText()));
		} else {
			c.addChrgItmCdTxt("NULL");
		}


		/******************** chargeitemcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemcodecodinglist = chargeitemcode.getCoding();
		for(int chargeitemcodecodingi = 0; chargeitemcodecodingi<chargeitemcodecodinglist.size();chargeitemcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemcodecoding = chargeitemcodecodinglist.get(chargeitemcodecodingi);

		/******************** ChrgItm_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemcodecodingi == 0) {c.addChrgItmCdCdgDsply("[");}
		if(chargeitemcodecoding.hasDisplay()) {

			c.addChrgItmCdCdgDsply(String.valueOf(chargeitemcodecoding.getDisplay()));
		} else {
			c.addChrgItmCdCdgDsply("NULL");
		}

		if(chargeitemcodecodingi == chargeitemcodecodinglist.size()-1) {c.addChrgItmCdCdgDsply("]");}


		/******************** ChrgItm_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemcodecodingi == 0) {c.addChrgItmCdCdgVrsn("[");}
		if(chargeitemcodecoding.hasVersion()) {

			c.addChrgItmCdCdgVrsn(String.valueOf(chargeitemcodecoding.getVersion()));
		} else {
			c.addChrgItmCdCdgVrsn("NULL");
		}

		if(chargeitemcodecodingi == chargeitemcodecodinglist.size()-1) {c.addChrgItmCdCdgVrsn("]");}


		/******************** ChrgItm_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemcodecodingi == 0) {c.addChrgItmCdCdgCd("[");}
		if(chargeitemcodecoding.hasCode()) {

			c.addChrgItmCdCdgCd(String.valueOf(chargeitemcodecoding.getCode()));
		} else {
			c.addChrgItmCdCdgCd("NULL");
		}

		if(chargeitemcodecodingi == chargeitemcodecodinglist.size()-1) {c.addChrgItmCdCdgCd("]");}


		/******************** ChrgItm_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemcodecodingi == 0) {c.addChrgItmCdCdgUsrSltd("[");}
		if(chargeitemcodecoding.hasUserSelected()) {

			c.addChrgItmCdCdgUsrSltd(String.valueOf(chargeitemcodecoding.getUserSelected()));
		} else {
			c.addChrgItmCdCdgUsrSltd("NULL");
		}

		if(chargeitemcodecodingi == chargeitemcodecodinglist.size()-1) {c.addChrgItmCdCdgUsrSltd("]");}


		/******************** ChrgItm_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemcodecodingi == 0) {c.addChrgItmCdCdgSys("[");}
		if(chargeitemcodecoding.hasSystem()) {

			c.addChrgItmCdCdgSys(String.valueOf(chargeitemcodecoding.getSystem()));
		} else {
			c.addChrgItmCdCdgSys("NULL");
		}

		if(chargeitemcodecodingi == chargeitemcodecodinglist.size()-1) {c.addChrgItmCdCdgSys("]");}


		 };
		/******************** ChrgItm_Sbjct ********************************************************************************/
		if(chargeitem.hasSubject()) {

			if(chargeitem.getSubject().getReference() != null) {
			c.addChrgItmSbjct(chargeitem.getSubject().getReference());
			}
		} else {
			c.addChrgItmSbjct("NULL");
		}


		/******************** chargeitemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatus chargeitemstatus = chargeitem.getStatus();
		if(chargeitemstatus!=null) {
			c.addChrgItmSts(chargeitemstatus.toCode());
		} else {
			c.addChrgItmSts("NULL");
		}

		/******************** chargeitemnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> chargeitemnotelist = chargeitem.getNote();
		for(int chargeitemnotei = 0; chargeitemnotei<chargeitemnotelist.size();chargeitemnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  chargeitemnote = chargeitemnotelist.get(chargeitemnotei);

		/******************** ChrgItm_Nt_Time ********************************************************************************/
		if(chargeitemnotei == 0) {c.addChrgItmNtTime("[");}
		if(chargeitemnote.hasTime()) {

			c.addChrgItmNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemnote.getTime())+"\"");
		} else {
			c.addChrgItmNtTime("NULL");
		}

		if(chargeitemnotei == chargeitemnotelist.size()-1) {c.addChrgItmNtTime("]");}


		/******************** ChrgItm_Nt_AthrRfrnc ********************************************************************************/
		if(chargeitemnotei == 0) {c.addChrgItmNtAthrRfrnc("[");}
		if(chargeitemnote.hasAuthorReference()) {

			if(chargeitemnote.getAuthorReference().getReference() != null) {
			c.addChrgItmNtAthrRfrnc(chargeitemnote.getAuthorReference().getReference());
			}
		} else {
			c.addChrgItmNtAthrRfrnc("NULL");
		}

		if(chargeitemnotei == chargeitemnotelist.size()-1) {c.addChrgItmNtAthrRfrnc("]");}


		/******************** ChrgItm_Nt_Txt ********************************************************************************/
		if(chargeitemnotei == 0) {c.addChrgItmNtTxt("[");}
		if(chargeitemnote.hasText()) {

			c.addChrgItmNtTxt(String.valueOf(chargeitemnote.getText()));
		} else {
			c.addChrgItmNtTxt("NULL");
		}

		if(chargeitemnotei == chargeitemnotelist.size()-1) {c.addChrgItmNtTxt("]");}


		/******************** ChrgItm_Nt_AthrStrgTyp ********************************************************************************/
		if(chargeitemnotei == 0) {c.addChrgItmNtAthrStrgTyp("[");}
		if(chargeitemnote.hasAuthorStringType()) {

			c.addChrgItmNtAthrStrgTyp("\""+chargeitemnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addChrgItmNtAthrStrgTyp("NULL");
		}

		if(chargeitemnotei == chargeitemnotelist.size()-1) {c.addChrgItmNtAthrStrgTyp("]");}


		 };
		/******************** chargeitemidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> chargeitemidentifierlist = chargeitem.getIdentifier();
		for(int chargeitemidentifieri = 0; chargeitemidentifieri<chargeitemidentifierlist.size();chargeitemidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  chargeitemidentifier = chargeitemidentifierlist.get(chargeitemidentifieri);

		/******************** ChrgItm_Id_Vl ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdVl("[");}
		if(chargeitemidentifier.hasValue()) {

			c.addChrgItmIdVl(String.valueOf(chargeitemidentifier.getValue()));
		} else {
			c.addChrgItmIdVl("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdVl("]");}


		/******************** chargeitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemidentifiertype = chargeitemidentifier.getType();

		/******************** ChrgItm_Id_Typ_Txt ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdTypTxt("[");}
		if(chargeitemidentifiertype.hasText()) {

			c.addChrgItmIdTypTxt(String.valueOf(chargeitemidentifiertype.getText()));
		} else {
			c.addChrgItmIdTypTxt("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdTypTxt("]");}


		/******************** chargeitemidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemidentifiertypecodinglist = chargeitemidentifiertype.getCoding();
		for(int chargeitemidentifiertypecodingi = 0; chargeitemidentifiertypecodingi<chargeitemidentifiertypecodinglist.size();chargeitemidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemidentifiertypecoding = chargeitemidentifiertypecodinglist.get(chargeitemidentifiertypecodingi);

		/******************** ChrgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(chargeitemidentifiertypecodingi == 0) {c.addChrgItmIdTypCdgDsply("[[");}
		if(chargeitemidentifiertypecoding.hasDisplay()) {

			c.addChrgItmIdTypCdgDsply(String.valueOf(chargeitemidentifiertypecoding.getDisplay()));
		} else {
			c.addChrgItmIdTypCdgDsply("NULL");
		}

		if(chargeitemidentifiertypecodingi == chargeitemidentifiertypecodinglist.size()-1) {c.addChrgItmIdTypCdgDsply("]]");}


		/******************** ChrgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(chargeitemidentifiertypecodingi == 0) {c.addChrgItmIdTypCdgVrsn("[[");}
		if(chargeitemidentifiertypecoding.hasVersion()) {

			c.addChrgItmIdTypCdgVrsn(String.valueOf(chargeitemidentifiertypecoding.getVersion()));
		} else {
			c.addChrgItmIdTypCdgVrsn("NULL");
		}

		if(chargeitemidentifiertypecodingi == chargeitemidentifiertypecodinglist.size()-1) {c.addChrgItmIdTypCdgVrsn("]]");}


		/******************** ChrgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(chargeitemidentifiertypecodingi == 0) {c.addChrgItmIdTypCdgCd("[[");}
		if(chargeitemidentifiertypecoding.hasCode()) {

			c.addChrgItmIdTypCdgCd(String.valueOf(chargeitemidentifiertypecoding.getCode()));
		} else {
			c.addChrgItmIdTypCdgCd("NULL");
		}

		if(chargeitemidentifiertypecodingi == chargeitemidentifiertypecodinglist.size()-1) {c.addChrgItmIdTypCdgCd("]]");}


		/******************** ChrgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemidentifiertypecodingi == 0) {c.addChrgItmIdTypCdgUsrSltd("[[");}
		if(chargeitemidentifiertypecoding.hasUserSelected()) {

			c.addChrgItmIdTypCdgUsrSltd(String.valueOf(chargeitemidentifiertypecoding.getUserSelected()));
		} else {
			c.addChrgItmIdTypCdgUsrSltd("NULL");
		}

		if(chargeitemidentifiertypecodingi == chargeitemidentifiertypecodinglist.size()-1) {c.addChrgItmIdTypCdgUsrSltd("]]");}


		/******************** ChrgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(chargeitemidentifiertypecodingi == 0) {c.addChrgItmIdTypCdgSys("[[");}
		if(chargeitemidentifiertypecoding.hasSystem()) {

			c.addChrgItmIdTypCdgSys(String.valueOf(chargeitemidentifiertypecoding.getSystem()));
		} else {
			c.addChrgItmIdTypCdgSys("NULL");
		}

		if(chargeitemidentifiertypecodingi == chargeitemidentifiertypecodinglist.size()-1) {c.addChrgItmIdTypCdgSys("]]");}


		 };
		/******************** chargeitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemidentifierperiod = chargeitemidentifier.getPeriod();

		/******************** ChrgItm_Id_Prd_Strt ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdPrdStrt("[");}
		if(chargeitemidentifierperiod.hasStart()) {

			c.addChrgItmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemidentifierperiod.getStart())+"\"");
		} else {
			c.addChrgItmIdPrdStrt("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdPrdStrt("]");}


		/******************** ChrgItm_Id_Prd_End ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdPrdEnd("[");}
		if(chargeitemidentifierperiod.hasEnd()) {

			c.addChrgItmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemidentifierperiod.getEnd())+"\"");
		} else {
			c.addChrgItmIdPrdEnd("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdPrdEnd("]");}


		/******************** chargeitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse chargeitemidentifieruse = chargeitemidentifier.getUse();
		if(chargeitemidentifieruse!=null) {
		if(chargeitemidentifieri == 0) {

		c.addChrgItmIdUse("[");		}
			c.addChrgItmIdUse(chargeitemidentifieruse.toCode());
		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {

		c.addChrgItmIdUse("]");		}

		} else {
			c.addChrgItmIdUse("NULL");
		}

		/******************** ChrgItm_Id_Assigner ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdAssigner("[");}
		if(chargeitemidentifier.hasAssigner()) {

			if(chargeitemidentifier.getAssigner().getReference() != null) {
			c.addChrgItmIdAssigner(chargeitemidentifier.getAssigner().getReference());
			}
		} else {
			c.addChrgItmIdAssigner("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdAssigner("]");}


		/******************** ChrgItm_Id_Sys ********************************************************************************/
		if(chargeitemidentifieri == 0) {c.addChrgItmIdSys("[");}
		if(chargeitemidentifier.hasSystem()) {

			c.addChrgItmIdSys(String.valueOf(chargeitemidentifier.getSystem()));
		} else {
			c.addChrgItmIdSys("NULL");
		}

		if(chargeitemidentifieri == chargeitemidentifierlist.size()-1) {c.addChrgItmIdSys("]");}


		 };
		/******************** ChrgItm_OccrnceDtTimeTyp ********************************************************************************/
		if(chargeitem.hasOccurrenceDateTimeType()) {

			c.addChrgItmOccrnceDtTimeTyp("\""+chargeitem.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			c.addChrgItmOccrnceDtTimeTyp("NULL");
		}


		/******************** chargeitemoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrenceperiod = chargeitem.getOccurrencePeriod();

		/******************** ChrgItm_OccrncePrd_Strt ********************************************************************************/
		if(chargeitemoccurrenceperiod.hasStart()) {

			c.addChrgItmOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemoccurrenceperiod.getStart())+"\"");
		} else {
			c.addChrgItmOccrncePrdStrt("NULL");
		}


		/******************** ChrgItm_OccrncePrd_End ********************************************************************************/
		if(chargeitemoccurrenceperiod.hasEnd()) {

			c.addChrgItmOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemoccurrenceperiod.getEnd())+"\"");
		} else {
			c.addChrgItmOccrncePrdEnd("NULL");
		}


		/******************** ChrgItm_DfnUri ********************************************************************************/
		if(chargeitem.hasDefinitionUri()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getDefinitionUri().size(); incr++) {
				array = array + chargeitem.getDefinitionUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnUri(array);

		} else {
			c.addChrgItmDfnUri("NULL");
		}


		/******************** ChrgItm_FactorOverride ********************************************************************************/
		if(chargeitem.hasFactorOverride()) {

			c.addChrgItmFactorOverride(String.valueOf(chargeitem.getFactorOverride()));
		} else {
			c.addChrgItmFactorOverride("NULL");
		}


		/******************** chargeitempriceoverride ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitempriceoverride = chargeitem.getPriceOverride();

		/******************** ChrgItm_PriceOverride_Vl ********************************************************************************/
		if(chargeitempriceoverride.hasValue()) {

			c.addChrgItmPriceOverrideVl(String.valueOf(chargeitempriceoverride.getValue()));
		} else {
			c.addChrgItmPriceOverrideVl("NULL");
		}


		/******************** ChrgItm_PriceOverride_Crncy ********************************************************************************/
		if(chargeitempriceoverride.hasCurrency()) {

			c.addChrgItmPriceOverrideCrncy(String.valueOf(chargeitempriceoverride.getCurrency()));
		} else {
			c.addChrgItmPriceOverrideCrncy("NULL");
		}


		/******************** ChrgItm_CstCenter ********************************************************************************/
		if(chargeitem.hasCostCenter()) {

			if(chargeitem.getCostCenter().getReference() != null) {
			c.addChrgItmCstCenter(chargeitem.getCostCenter().getReference());
			}
		} else {
			c.addChrgItmCstCenter("NULL");
		}


		/******************** chargeitembodysite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> chargeitembodysitelist = chargeitem.getBodysite();
		for(int chargeitembodysitei = 0; chargeitembodysitei<chargeitembodysitelist.size();chargeitembodysitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  chargeitembodysite = chargeitembodysitelist.get(chargeitembodysitei);

		/******************** ChrgItm_Bodysite_Txt ********************************************************************************/
		if(chargeitembodysitei == 0) {c.addChrgItmBodysiteTxt("[");}
		if(chargeitembodysite.hasText()) {

			c.addChrgItmBodysiteTxt(String.valueOf(chargeitembodysite.getText()));
		} else {
			c.addChrgItmBodysiteTxt("NULL");
		}

		if(chargeitembodysitei == chargeitembodysitelist.size()-1) {c.addChrgItmBodysiteTxt("]");}


		/******************** chargeitembodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitembodysitecodinglist = chargeitembodysite.getCoding();
		for(int chargeitembodysitecodingi = 0; chargeitembodysitecodingi<chargeitembodysitecodinglist.size();chargeitembodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitembodysitecoding = chargeitembodysitecodinglist.get(chargeitembodysitecodingi);

		/******************** ChrgItm_Bodysite_Cdg_Dsply ********************************************************************************/
		if(chargeitembodysitecodingi == 0) {c.addChrgItmBodysiteCdgDsply("[[");}
		if(chargeitembodysitecoding.hasDisplay()) {

			c.addChrgItmBodysiteCdgDsply(String.valueOf(chargeitembodysitecoding.getDisplay()));
		} else {
			c.addChrgItmBodysiteCdgDsply("NULL");
		}

		if(chargeitembodysitecodingi == chargeitembodysitecodinglist.size()-1) {c.addChrgItmBodysiteCdgDsply("]]");}


		/******************** ChrgItm_Bodysite_Cdg_Vrsn ********************************************************************************/
		if(chargeitembodysitecodingi == 0) {c.addChrgItmBodysiteCdgVrsn("[[");}
		if(chargeitembodysitecoding.hasVersion()) {

			c.addChrgItmBodysiteCdgVrsn(String.valueOf(chargeitembodysitecoding.getVersion()));
		} else {
			c.addChrgItmBodysiteCdgVrsn("NULL");
		}

		if(chargeitembodysitecodingi == chargeitembodysitecodinglist.size()-1) {c.addChrgItmBodysiteCdgVrsn("]]");}


		/******************** ChrgItm_Bodysite_Cdg_Cd ********************************************************************************/
		if(chargeitembodysitecodingi == 0) {c.addChrgItmBodysiteCdgCd("[[");}
		if(chargeitembodysitecoding.hasCode()) {

			c.addChrgItmBodysiteCdgCd(String.valueOf(chargeitembodysitecoding.getCode()));
		} else {
			c.addChrgItmBodysiteCdgCd("NULL");
		}

		if(chargeitembodysitecodingi == chargeitembodysitecodinglist.size()-1) {c.addChrgItmBodysiteCdgCd("]]");}


		/******************** ChrgItm_Bodysite_Cdg_UsrSltd ********************************************************************************/
		if(chargeitembodysitecodingi == 0) {c.addChrgItmBodysiteCdgUsrSltd("[[");}
		if(chargeitembodysitecoding.hasUserSelected()) {

			c.addChrgItmBodysiteCdgUsrSltd(String.valueOf(chargeitembodysitecoding.getUserSelected()));
		} else {
			c.addChrgItmBodysiteCdgUsrSltd("NULL");
		}

		if(chargeitembodysitecodingi == chargeitembodysitecodinglist.size()-1) {c.addChrgItmBodysiteCdgUsrSltd("]]");}


		/******************** ChrgItm_Bodysite_Cdg_Sys ********************************************************************************/
		if(chargeitembodysitecodingi == 0) {c.addChrgItmBodysiteCdgSys("[[");}
		if(chargeitembodysitecoding.hasSystem()) {

			c.addChrgItmBodysiteCdgSys(String.valueOf(chargeitembodysitecoding.getSystem()));
		} else {
			c.addChrgItmBodysiteCdgSys("NULL");
		}

		if(chargeitembodysitecodingi == chargeitembodysitecodinglist.size()-1) {c.addChrgItmBodysiteCdgSys("]]");}


		 };
		 };
		/******************** ChrgItm_OverrideRsn ********************************************************************************/
		if(chargeitem.hasOverrideReason()) {

			c.addChrgItmOverrideRsn(String.valueOf(chargeitem.getOverrideReason()));
		} else {
			c.addChrgItmOverrideRsn("NULL");
		}


		/******************** ChrgItm_EnteredDt ********************************************************************************/
		if(chargeitem.hasEnteredDate()) {

			c.addChrgItmEnteredDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitem.getEnteredDate())+"\"");
		} else {
			c.addChrgItmEnteredDt("NULL");
		}


		/******************** ChrgItm_Srv ********************************************************************************/
		if(chargeitem.hasService()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getService().size(); incr++) {
				array = array + chargeitem.getService().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmSrv(array);

		} else {
			c.addChrgItmSrv("NULL");
		}


		/******************** ChrgItm_RqstingOrgnztn ********************************************************************************/
		if(chargeitem.hasRequestingOrganization()) {

			if(chargeitem.getRequestingOrganization().getReference() != null) {
			c.addChrgItmRqstingOrgnztn(chargeitem.getRequestingOrganization().getReference());
			}
		} else {
			c.addChrgItmRqstingOrgnztn("NULL");
		}


		/******************** ChrgItm_PerformingOrgnztn ********************************************************************************/
		if(chargeitem.hasPerformingOrganization()) {

			if(chargeitem.getPerformingOrganization().getReference() != null) {
			c.addChrgItmPerformingOrgnztn(chargeitem.getPerformingOrganization().getReference());
			}
		} else {
			c.addChrgItmPerformingOrgnztn("NULL");
		}


		/******************** chargeitemoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing chargeitemoccurrencetiming = chargeitem.getOccurrenceTiming();

		/******************** chargeitemoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemoccurrencetimingcode = chargeitemoccurrencetiming.getCode();

		/******************** ChrgItm_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(chargeitemoccurrencetimingcode.hasText()) {

			c.addChrgItmOccrnceTmgCdTxt(String.valueOf(chargeitemoccurrencetimingcode.getText()));
		} else {
			c.addChrgItmOccrnceTmgCdTxt("NULL");
		}


		/******************** chargeitemoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemoccurrencetimingcodecodinglist = chargeitemoccurrencetimingcode.getCoding();
		for(int chargeitemoccurrencetimingcodecodingi = 0; chargeitemoccurrencetimingcodecodingi<chargeitemoccurrencetimingcodecodinglist.size();chargeitemoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemoccurrencetimingcodecoding = chargeitemoccurrencetimingcodecodinglist.get(chargeitemoccurrencetimingcodecodingi);

		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemoccurrencetimingcodecodingi == 0) {c.addChrgItmOccrnceTmgCdCdgDsply("[");}
		if(chargeitemoccurrencetimingcodecoding.hasDisplay()) {

			c.addChrgItmOccrnceTmgCdCdgDsply(String.valueOf(chargeitemoccurrencetimingcodecoding.getDisplay()));
		} else {
			c.addChrgItmOccrnceTmgCdCdgDsply("NULL");
		}

		if(chargeitemoccurrencetimingcodecodingi == chargeitemoccurrencetimingcodecodinglist.size()-1) {c.addChrgItmOccrnceTmgCdCdgDsply("]");}


		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemoccurrencetimingcodecodingi == 0) {c.addChrgItmOccrnceTmgCdCdgVrsn("[");}
		if(chargeitemoccurrencetimingcodecoding.hasVersion()) {

			c.addChrgItmOccrnceTmgCdCdgVrsn(String.valueOf(chargeitemoccurrencetimingcodecoding.getVersion()));
		} else {
			c.addChrgItmOccrnceTmgCdCdgVrsn("NULL");
		}

		if(chargeitemoccurrencetimingcodecodingi == chargeitemoccurrencetimingcodecodinglist.size()-1) {c.addChrgItmOccrnceTmgCdCdgVrsn("]");}


		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingcodecodingi == 0) {c.addChrgItmOccrnceTmgCdCdgCd("[");}
		if(chargeitemoccurrencetimingcodecoding.hasCode()) {

			c.addChrgItmOccrnceTmgCdCdgCd(String.valueOf(chargeitemoccurrencetimingcodecoding.getCode()));
		} else {
			c.addChrgItmOccrnceTmgCdCdgCd("NULL");
		}

		if(chargeitemoccurrencetimingcodecodingi == chargeitemoccurrencetimingcodecodinglist.size()-1) {c.addChrgItmOccrnceTmgCdCdgCd("]");}


		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemoccurrencetimingcodecodingi == 0) {c.addChrgItmOccrnceTmgCdCdgUsrSltd("[");}
		if(chargeitemoccurrencetimingcodecoding.hasUserSelected()) {

			c.addChrgItmOccrnceTmgCdCdgUsrSltd(String.valueOf(chargeitemoccurrencetimingcodecoding.getUserSelected()));
		} else {
			c.addChrgItmOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(chargeitemoccurrencetimingcodecodingi == chargeitemoccurrencetimingcodecodinglist.size()-1) {c.addChrgItmOccrnceTmgCdCdgUsrSltd("]");}


		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingcodecodingi == 0) {c.addChrgItmOccrnceTmgCdCdgSys("[");}
		if(chargeitemoccurrencetimingcodecoding.hasSystem()) {

			c.addChrgItmOccrnceTmgCdCdgSys(String.valueOf(chargeitemoccurrencetimingcodecoding.getSystem()));
		} else {
			c.addChrgItmOccrnceTmgCdCdgSys("NULL");
		}

		if(chargeitemoccurrencetimingcodecodingi == chargeitemoccurrencetimingcodecodinglist.size()-1) {c.addChrgItmOccrnceTmgCdCdgSys("]");}


		 };
		/******************** ChrgItm_OccrnceTmg_Evnt ********************************************************************************/
		if(chargeitemoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemoccurrencetiming.getEvent().size(); incr++) {
				array = array + chargeitemoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmOccrnceTmgEvnt(array);

		} else {
			c.addChrgItmOccrnceTmgEvnt("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent chargeitemoccurrencetimingrepeat = chargeitemoccurrencetiming.getRepeat();

		/******************** ChrgItm_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasOffset()) {

			c.addChrgItmOccrnceTmgRptOff(String.valueOf(chargeitemoccurrencetimingrepeat.getOffset()));
		} else {
			c.addChrgItmOccrnceTmgRptOff("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasCount()) {

			c.addChrgItmOccrnceTmgRptCnt(String.valueOf(chargeitemoccurrencetimingrepeat.getCount()));
		} else {
			c.addChrgItmOccrnceTmgRptCnt("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasPeriod()) {

			c.addChrgItmOccrnceTmgRptPrd(String.valueOf(chargeitemoccurrencetimingrepeat.getPeriod()));
		} else {
			c.addChrgItmOccrnceTmgRptPrd("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasCountMax()) {

			c.addChrgItmOccrnceTmgRptCntMx(String.valueOf(chargeitemoccurrencetimingrepeat.getCountMax()));
		} else {
			c.addChrgItmOccrnceTmgRptCntMx("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasDurationMax()) {

			c.addChrgItmOccrnceTmgRptDurationMx(String.valueOf(chargeitemoccurrencetimingrepeat.getDurationMax()));
		} else {
			c.addChrgItmOccrnceTmgRptDurationMx("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrencetimingrepeatboundsperiod = chargeitemoccurrencetimingrepeat.getBoundsPeriod();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsperiod.hasStart()) {

			c.addChrgItmOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			c.addChrgItmOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsperiod.hasEnd()) {

			c.addChrgItmOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			c.addChrgItmOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime chargeitemoccurrencetimingrepeatdurationunit = chargeitemoccurrencetimingrepeat.getDurationUnit();
		if(chargeitemoccurrencetimingrepeatdurationunit!=null) {
			c.addChrgItmOccrnceTmgRptDurationUnt(chargeitemoccurrencetimingrepeatdurationunit.toCode());
		} else {
			c.addChrgItmOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** chargeitemoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration chargeitemoccurrencetimingrepeatboundsduration = chargeitemoccurrencetimingrepeat.getBoundsDuration();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasValue()) {

			c.addChrgItmOccrnceTmgRptBndsDurationVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsdurationcomparator = chargeitemoccurrencetimingrepeatboundsduration.getComparator();
		if(chargeitemoccurrencetimingrepeatboundsdurationcomparator!=null) {
			c.addChrgItmOccrnceTmgRptBndsDurationCmprtr(chargeitemoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			c.addChrgItmOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasCode()) {

			c.addChrgItmOccrnceTmgRptBndsDurationCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasUnit()) {

			c.addChrgItmOccrnceTmgRptBndsDurationUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasSystem()) {

			c.addChrgItmOccrnceTmgRptBndsDurationSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemoccurrencetimingrepeatboundsrange = chargeitemoccurrencetimingrepeat.getBoundsRange();

		/******************** chargeitemoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangelow = chargeitemoccurrencetimingrepeatboundsrange.getLow();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasValue()) {

			c.addChrgItmOccrnceTmgRptBndsRngLwVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsrangelowcomparator = chargeitemoccurrencetimingrepeatboundsrangelow.getComparator();
		if(chargeitemoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			c.addChrgItmOccrnceTmgRptBndsRngLwCmprtr(chargeitemoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasCode()) {

			c.addChrgItmOccrnceTmgRptBndsRngLwCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			c.addChrgItmOccrnceTmgRptBndsRngLwUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			c.addChrgItmOccrnceTmgRptBndsRngLwSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangehigh = chargeitemoccurrencetimingrepeatboundsrange.getHigh();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			c.addChrgItmOccrnceTmgRptBndsRngHiVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsrangehighcomparator = chargeitemoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(chargeitemoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			c.addChrgItmOccrnceTmgRptBndsRngHiCmprtr(chargeitemoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			c.addChrgItmOccrnceTmgRptBndsRngHiCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			c.addChrgItmOccrnceTmgRptBndsRngHiUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			c.addChrgItmOccrnceTmgRptBndsRngHiSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			c.addChrgItmOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasFrequencyMax()) {

			c.addChrgItmOccrnceTmgRptFrqncyMx(String.valueOf(chargeitemoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			c.addChrgItmOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> chargeitemoccurrencetimingrepeatwhenlist = chargeitemoccurrencetimingrepeat.getWhen();
		for(int chargeitemoccurrencetimingrepeatwheni = 0; chargeitemoccurrencetimingrepeatwheni<chargeitemoccurrencetimingrepeatwhenlist.size();chargeitemoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  chargeitemoccurrencetimingrepeatwhen = chargeitemoccurrencetimingrepeatwhenlist.get(chargeitemoccurrencetimingrepeatwheni);
		if(chargeitemoccurrencetimingrepeatwhen!=null) {
			c.addChrgItmOccrnceTmgRptWhen(chargeitemoccurrencetimingrepeatwhen.getCode());
		} else {
			c.addChrgItmOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** chargeitemoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime chargeitemoccurrencetimingrepeatperiodunit = chargeitemoccurrencetimingrepeat.getPeriodUnit();
		if(chargeitemoccurrencetimingrepeatperiodunit!=null) {
			c.addChrgItmOccrnceTmgRptPrdUnt(chargeitemoccurrencetimingrepeatperiodunit.toCode());
		} else {
			c.addChrgItmOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** ChrgItm_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasPeriodMax()) {

			c.addChrgItmOccrnceTmgRptPrdMx(String.valueOf(chargeitemoccurrencetimingrepeat.getPeriodMax()));
		} else {
			c.addChrgItmOccrnceTmgRptPrdMx("NULL");
		}


		/******************** chargeitemoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> chargeitemoccurrencetimingrepeatdayofweeklist = chargeitemoccurrencetimingrepeat.getDayOfWeek();
		for(int chargeitemoccurrencetimingrepeatdayofweeki = 0; chargeitemoccurrencetimingrepeatdayofweeki<chargeitemoccurrencetimingrepeatdayofweeklist.size();chargeitemoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  chargeitemoccurrencetimingrepeatdayofweek = chargeitemoccurrencetimingrepeatdayofweeklist.get(chargeitemoccurrencetimingrepeatdayofweeki);
		if(chargeitemoccurrencetimingrepeatdayofweek!=null) {
			c.addChrgItmOccrnceTmgRptDayOfWeek(chargeitemoccurrencetimingrepeatdayofweek.getCode());
		} else {
			c.addChrgItmOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** ChrgItm_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + chargeitemoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmOccrnceTmgRptTimeOfDay(array);

		} else {
			c.addChrgItmOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasDuration()) {

			c.addChrgItmOccrnceTmgRptDuration(String.valueOf(chargeitemoccurrencetimingrepeat.getDuration()));
		} else {
			c.addChrgItmOccrnceTmgRptDuration("NULL");
		}


		/******************** ChrgItm_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasFrequency()) {

			c.addChrgItmOccrnceTmgRptFrqncy(String.valueOf(chargeitemoccurrencetimingrepeat.getFrequency()));
		} else {
			c.addChrgItmOccrnceTmgRptFrqncy("NULL");
		}


		/******************** chargeitemproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemproductcodeableconcept = chargeitem.getProductCodeableConcept();

		/******************** ChrgItm_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(chargeitemproductcodeableconcept.hasText()) {

			c.addChrgItmPrdctCdbleCncptTxt(String.valueOf(chargeitemproductcodeableconcept.getText()));
		} else {
			c.addChrgItmPrdctCdbleCncptTxt("NULL");
		}


		/******************** chargeitemproductcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemproductcodeableconceptcodinglist = chargeitemproductcodeableconcept.getCoding();
		for(int chargeitemproductcodeableconceptcodingi = 0; chargeitemproductcodeableconceptcodingi<chargeitemproductcodeableconceptcodinglist.size();chargeitemproductcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemproductcodeableconceptcoding = chargeitemproductcodeableconceptcodinglist.get(chargeitemproductcodeableconceptcodingi);

		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(chargeitemproductcodeableconceptcodingi == 0) {c.addChrgItmPrdctCdbleCncptCdgDsply("[");}
		if(chargeitemproductcodeableconceptcoding.hasDisplay()) {

			c.addChrgItmPrdctCdbleCncptCdgDsply(String.valueOf(chargeitemproductcodeableconceptcoding.getDisplay()));
		} else {
			c.addChrgItmPrdctCdbleCncptCdgDsply("NULL");
		}

		if(chargeitemproductcodeableconceptcodingi == chargeitemproductcodeableconceptcodinglist.size()-1) {c.addChrgItmPrdctCdbleCncptCdgDsply("]");}


		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(chargeitemproductcodeableconceptcodingi == 0) {c.addChrgItmPrdctCdbleCncptCdgVrsn("[");}
		if(chargeitemproductcodeableconceptcoding.hasVersion()) {

			c.addChrgItmPrdctCdbleCncptCdgVrsn(String.valueOf(chargeitemproductcodeableconceptcoding.getVersion()));
		} else {
			c.addChrgItmPrdctCdbleCncptCdgVrsn("NULL");
		}

		if(chargeitemproductcodeableconceptcodingi == chargeitemproductcodeableconceptcodinglist.size()-1) {c.addChrgItmPrdctCdbleCncptCdgVrsn("]");}


		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(chargeitemproductcodeableconceptcodingi == 0) {c.addChrgItmPrdctCdbleCncptCdgCd("[");}
		if(chargeitemproductcodeableconceptcoding.hasCode()) {

			c.addChrgItmPrdctCdbleCncptCdgCd(String.valueOf(chargeitemproductcodeableconceptcoding.getCode()));
		} else {
			c.addChrgItmPrdctCdbleCncptCdgCd("NULL");
		}

		if(chargeitemproductcodeableconceptcodingi == chargeitemproductcodeableconceptcodinglist.size()-1) {c.addChrgItmPrdctCdbleCncptCdgCd("]");}


		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemproductcodeableconceptcodingi == 0) {c.addChrgItmPrdctCdbleCncptCdgUsrSltd("[");}
		if(chargeitemproductcodeableconceptcoding.hasUserSelected()) {

			c.addChrgItmPrdctCdbleCncptCdgUsrSltd(String.valueOf(chargeitemproductcodeableconceptcoding.getUserSelected()));
		} else {
			c.addChrgItmPrdctCdbleCncptCdgUsrSltd("NULL");
		}

		if(chargeitemproductcodeableconceptcodingi == chargeitemproductcodeableconceptcodinglist.size()-1) {c.addChrgItmPrdctCdbleCncptCdgUsrSltd("]");}


		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(chargeitemproductcodeableconceptcodingi == 0) {c.addChrgItmPrdctCdbleCncptCdgSys("[");}
		if(chargeitemproductcodeableconceptcoding.hasSystem()) {

			c.addChrgItmPrdctCdbleCncptCdgSys(String.valueOf(chargeitemproductcodeableconceptcoding.getSystem()));
		} else {
			c.addChrgItmPrdctCdbleCncptCdgSys("NULL");
		}

		if(chargeitemproductcodeableconceptcodingi == chargeitemproductcodeableconceptcodinglist.size()-1) {c.addChrgItmPrdctCdbleCncptCdgSys("]");}


		 };
		/******************** ChrgItm_SprtingInfo ********************************************************************************/
		if(chargeitem.hasSupportingInformation()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getSupportingInformation().size(); incr++) {
				array = array + chargeitem.getSupportingInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmSprtingInfo(array);

		} else {
			c.addChrgItmSprtingInfo("NULL");
		}


		/******************** ChrgItm_DfnCanonical ********************************************************************************/
		if(chargeitem.hasDefinitionCanonical()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getDefinitionCanonical().size(); incr++) {
				array = array + chargeitem.getDefinitionCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnCanonical(array);

		} else {
			c.addChrgItmDfnCanonical("NULL");
		}


		/******************** ChrgItm_PrdctRfrnc ********************************************************************************/
		if(chargeitem.hasProductReference()) {

			if(chargeitem.getProductReference().getReference() != null) {
			c.addChrgItmPrdctRfrnc(chargeitem.getProductReference().getReference());
			}
		} else {
			c.addChrgItmPrdctRfrnc("NULL");
		}


		/******************** chargeitemperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent> chargeitemperformerlist = chargeitem.getPerformer();
		for(int chargeitemperformeri = 0; chargeitemperformeri<chargeitemperformerlist.size();chargeitemperformeri++ ) {
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent  chargeitemperformer = chargeitemperformerlist.get(chargeitemperformeri);

		/******************** chargeitemperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemperformerfunction = chargeitemperformer.getFunction();

		/******************** ChrgItm_Prfrmr_Function_Txt ********************************************************************************/
		if(chargeitemperformeri == 0) {c.addChrgItmPrfrmrFunctionTxt("[");}
		if(chargeitemperformerfunction.hasText()) {

			c.addChrgItmPrfrmrFunctionTxt(String.valueOf(chargeitemperformerfunction.getText()));
		} else {
			c.addChrgItmPrfrmrFunctionTxt("NULL");
		}

		if(chargeitemperformeri == chargeitemperformerlist.size()-1) {c.addChrgItmPrfrmrFunctionTxt("]");}


		/******************** chargeitemperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemperformerfunctioncodinglist = chargeitemperformerfunction.getCoding();
		for(int chargeitemperformerfunctioncodingi = 0; chargeitemperformerfunctioncodingi<chargeitemperformerfunctioncodinglist.size();chargeitemperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemperformerfunctioncoding = chargeitemperformerfunctioncodinglist.get(chargeitemperformerfunctioncodingi);

		/******************** ChrgItm_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(chargeitemperformerfunctioncodingi == 0) {c.addChrgItmPrfrmrFunctionCdgDsply("[[");}
		if(chargeitemperformerfunctioncoding.hasDisplay()) {

			c.addChrgItmPrfrmrFunctionCdgDsply(String.valueOf(chargeitemperformerfunctioncoding.getDisplay()));
		} else {
			c.addChrgItmPrfrmrFunctionCdgDsply("NULL");
		}

		if(chargeitemperformerfunctioncodingi == chargeitemperformerfunctioncodinglist.size()-1) {c.addChrgItmPrfrmrFunctionCdgDsply("]]");}


		/******************** ChrgItm_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(chargeitemperformerfunctioncodingi == 0) {c.addChrgItmPrfrmrFunctionCdgVrsn("[[");}
		if(chargeitemperformerfunctioncoding.hasVersion()) {

			c.addChrgItmPrfrmrFunctionCdgVrsn(String.valueOf(chargeitemperformerfunctioncoding.getVersion()));
		} else {
			c.addChrgItmPrfrmrFunctionCdgVrsn("NULL");
		}

		if(chargeitemperformerfunctioncodingi == chargeitemperformerfunctioncodinglist.size()-1) {c.addChrgItmPrfrmrFunctionCdgVrsn("]]");}


		/******************** ChrgItm_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(chargeitemperformerfunctioncodingi == 0) {c.addChrgItmPrfrmrFunctionCdgCd("[[");}
		if(chargeitemperformerfunctioncoding.hasCode()) {

			c.addChrgItmPrfrmrFunctionCdgCd(String.valueOf(chargeitemperformerfunctioncoding.getCode()));
		} else {
			c.addChrgItmPrfrmrFunctionCdgCd("NULL");
		}

		if(chargeitemperformerfunctioncodingi == chargeitemperformerfunctioncodinglist.size()-1) {c.addChrgItmPrfrmrFunctionCdgCd("]]");}


		/******************** ChrgItm_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemperformerfunctioncodingi == 0) {c.addChrgItmPrfrmrFunctionCdgUsrSltd("[[");}
		if(chargeitemperformerfunctioncoding.hasUserSelected()) {

			c.addChrgItmPrfrmrFunctionCdgUsrSltd(String.valueOf(chargeitemperformerfunctioncoding.getUserSelected()));
		} else {
			c.addChrgItmPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(chargeitemperformerfunctioncodingi == chargeitemperformerfunctioncodinglist.size()-1) {c.addChrgItmPrfrmrFunctionCdgUsrSltd("]]");}


		/******************** ChrgItm_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(chargeitemperformerfunctioncodingi == 0) {c.addChrgItmPrfrmrFunctionCdgSys("[[");}
		if(chargeitemperformerfunctioncoding.hasSystem()) {

			c.addChrgItmPrfrmrFunctionCdgSys(String.valueOf(chargeitemperformerfunctioncoding.getSystem()));
		} else {
			c.addChrgItmPrfrmrFunctionCdgSys("NULL");
		}

		if(chargeitemperformerfunctioncodingi == chargeitemperformerfunctioncodinglist.size()-1) {c.addChrgItmPrfrmrFunctionCdgSys("]]");}


		 };
		/******************** ChrgItm_Prfrmr_Actor ********************************************************************************/
		if(chargeitemperformeri == 0) {c.addChrgItmPrfrmrActor("[");}
		if(chargeitemperformer.hasActor()) {

			if(chargeitemperformer.getActor().getReference() != null) {
			c.addChrgItmPrfrmrActor(chargeitemperformer.getActor().getReference());
			}
		} else {
			c.addChrgItmPrfrmrActor("NULL");
		}

		if(chargeitemperformeri == chargeitemperformerlist.size()-1) {c.addChrgItmPrfrmrActor("]");}


		 };
		/******************** ChrgItm_Enterer ********************************************************************************/
		if(chargeitem.hasEnterer()) {

			if(chargeitem.getEnterer().getReference() != null) {
			c.addChrgItmEnterer(chargeitem.getEnterer().getReference());
			}
		} else {
			c.addChrgItmEnterer("NULL");
		}


		/******************** chargeitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemquantity = chargeitem.getQuantity();

		/******************** ChrgItm_Qnty_Vl ********************************************************************************/
		if(chargeitemquantity.hasValue()) {

			c.addChrgItmQntyVl(String.valueOf(chargeitemquantity.getValue()));
		} else {
			c.addChrgItmQntyVl("NULL");
		}


		/******************** chargeitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemquantitycomparator = chargeitemquantity.getComparator();
		if(chargeitemquantitycomparator!=null) {
			c.addChrgItmQntyCmprtr(chargeitemquantitycomparator.toCode());
		} else {
			c.addChrgItmQntyCmprtr("NULL");
		}

		/******************** ChrgItm_Qnty_Cd ********************************************************************************/
		if(chargeitemquantity.hasCode()) {

			c.addChrgItmQntyCd(String.valueOf(chargeitemquantity.getCode()));
		} else {
			c.addChrgItmQntyCd("NULL");
		}


		/******************** ChrgItm_Qnty_Unt ********************************************************************************/
		if(chargeitemquantity.hasUnit()) {

			c.addChrgItmQntyUnt(String.valueOf(chargeitemquantity.getUnit()));
		} else {
			c.addChrgItmQntyUnt("NULL");
		}


		/******************** ChrgItm_Qnty_Sys ********************************************************************************/
		if(chargeitemquantity.hasSystem()) {

			c.addChrgItmQntySys(String.valueOf(chargeitemquantity.getSystem()));
		} else {
			c.addChrgItmQntySys("NULL");
		}


		/******************** ChrgItm_Account ********************************************************************************/
		if(chargeitem.hasAccount()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getAccount().size(); incr++) {
				array = array + chargeitem.getAccount().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmAccount(array);

		} else {
			c.addChrgItmAccount("NULL");
		}


		/******************** ChrgItm_PartOf ********************************************************************************/
		if(chargeitem.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<chargeitem.getPartOf().size(); incr++) {
				array = array + chargeitem.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmPartOf(array);

		} else {
			c.addChrgItmPartOf("NULL");
		}


		return c;
	}
}
