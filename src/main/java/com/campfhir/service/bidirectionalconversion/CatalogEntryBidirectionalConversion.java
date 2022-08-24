package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CatalogEntry;
public class CatalogEntryBidirectionalConversion 
{
	public CatalogEntry CatalogEntrys(org.hl7.fhir.r4.model.CatalogEntry catalogentry) throws ParseException
	{
		 main.java.com.campfhir.model.CatalogEntry c = new  main.java.com.campfhir.model.CatalogEntry();

		/******************** id ********************************************************************************/
		c.setId(catalogentry.getIdElement().getIdPart());

		/******************** catalogentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentrytype = catalogentry.getType();

		/******************** CatalogEntry_Typ_Txt ********************************************************************************/
		if(catalogentrytype.hasText()) {

			c.addCatalogEntryTypTxt(String.valueOf(catalogentrytype.getText()));
		} else {
			c.addCatalogEntryTypTxt("NULL");
		}


		/******************** catalogentrytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentrytypecodinglist = catalogentrytype.getCoding();
		for(int catalogentrytypecodingi = 0; catalogentrytypecodingi<catalogentrytypecodinglist.size();catalogentrytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentrytypecoding = catalogentrytypecodinglist.get(catalogentrytypecodingi);

		/******************** CatalogEntry_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentrytypecodingi == 0) {c.addCatalogEntryTypCdgDsply("[");}
		if(catalogentrytypecoding.hasDisplay()) {

			c.addCatalogEntryTypCdgDsply(String.valueOf(catalogentrytypecoding.getDisplay()));
		} else {
			c.addCatalogEntryTypCdgDsply("NULL");
		}

		if(catalogentrytypecodingi == catalogentrytypecodinglist.size()-1) {c.addCatalogEntryTypCdgDsply("]");}


		/******************** CatalogEntry_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentrytypecodingi == 0) {c.addCatalogEntryTypCdgVrsn("[");}
		if(catalogentrytypecoding.hasVersion()) {

			c.addCatalogEntryTypCdgVrsn(String.valueOf(catalogentrytypecoding.getVersion()));
		} else {
			c.addCatalogEntryTypCdgVrsn("NULL");
		}

		if(catalogentrytypecodingi == catalogentrytypecodinglist.size()-1) {c.addCatalogEntryTypCdgVrsn("]");}


		/******************** CatalogEntry_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentrytypecodingi == 0) {c.addCatalogEntryTypCdgCd("[");}
		if(catalogentrytypecoding.hasCode()) {

			c.addCatalogEntryTypCdgCd(String.valueOf(catalogentrytypecoding.getCode()));
		} else {
			c.addCatalogEntryTypCdgCd("NULL");
		}

		if(catalogentrytypecodingi == catalogentrytypecodinglist.size()-1) {c.addCatalogEntryTypCdgCd("]");}


		/******************** CatalogEntry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentrytypecodingi == 0) {c.addCatalogEntryTypCdgUsrSltd("[");}
		if(catalogentrytypecoding.hasUserSelected()) {

			c.addCatalogEntryTypCdgUsrSltd(String.valueOf(catalogentrytypecoding.getUserSelected()));
		} else {
			c.addCatalogEntryTypCdgUsrSltd("NULL");
		}

		if(catalogentrytypecodingi == catalogentrytypecodinglist.size()-1) {c.addCatalogEntryTypCdgUsrSltd("]");}


		/******************** CatalogEntry_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentrytypecodingi == 0) {c.addCatalogEntryTypCdgSys("[");}
		if(catalogentrytypecoding.hasSystem()) {

			c.addCatalogEntryTypCdgSys(String.valueOf(catalogentrytypecoding.getSystem()));
		} else {
			c.addCatalogEntryTypCdgSys("NULL");
		}

		if(catalogentrytypecodingi == catalogentrytypecodinglist.size()-1) {c.addCatalogEntryTypCdgSys("]");}


		 };
		/******************** catalogentrystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus catalogentrystatus = catalogentry.getStatus();
		if(catalogentrystatus!=null) {
			c.addCatalogEntrySts(catalogentrystatus.toCode());
		} else {
			c.addCatalogEntrySts("NULL");
		}

		/******************** catalogentryidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> catalogentryidentifierlist = catalogentry.getIdentifier();
		for(int catalogentryidentifieri = 0; catalogentryidentifieri<catalogentryidentifierlist.size();catalogentryidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  catalogentryidentifier = catalogentryidentifierlist.get(catalogentryidentifieri);

		/******************** CatalogEntry_Id_Vl ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdVl("[");}
		if(catalogentryidentifier.hasValue()) {

			c.addCatalogEntryIdVl(String.valueOf(catalogentryidentifier.getValue()));
		} else {
			c.addCatalogEntryIdVl("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdVl("]");}


		/******************** catalogentryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryidentifiertype = catalogentryidentifier.getType();

		/******************** CatalogEntry_Id_Typ_Txt ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdTypTxt("[");}
		if(catalogentryidentifiertype.hasText()) {

			c.addCatalogEntryIdTypTxt(String.valueOf(catalogentryidentifiertype.getText()));
		} else {
			c.addCatalogEntryIdTypTxt("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdTypTxt("]");}


		/******************** catalogentryidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentryidentifiertypecodinglist = catalogentryidentifiertype.getCoding();
		for(int catalogentryidentifiertypecodingi = 0; catalogentryidentifiertypecodingi<catalogentryidentifiertypecodinglist.size();catalogentryidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentryidentifiertypecoding = catalogentryidentifiertypecodinglist.get(catalogentryidentifiertypecodingi);

		/******************** CatalogEntry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentryidentifiertypecodingi == 0) {c.addCatalogEntryIdTypCdgDsply("[[");}
		if(catalogentryidentifiertypecoding.hasDisplay()) {

			c.addCatalogEntryIdTypCdgDsply(String.valueOf(catalogentryidentifiertypecoding.getDisplay()));
		} else {
			c.addCatalogEntryIdTypCdgDsply("NULL");
		}

		if(catalogentryidentifiertypecodingi == catalogentryidentifiertypecodinglist.size()-1) {c.addCatalogEntryIdTypCdgDsply("]]");}


		/******************** CatalogEntry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentryidentifiertypecodingi == 0) {c.addCatalogEntryIdTypCdgVrsn("[[");}
		if(catalogentryidentifiertypecoding.hasVersion()) {

			c.addCatalogEntryIdTypCdgVrsn(String.valueOf(catalogentryidentifiertypecoding.getVersion()));
		} else {
			c.addCatalogEntryIdTypCdgVrsn("NULL");
		}

		if(catalogentryidentifiertypecodingi == catalogentryidentifiertypecodinglist.size()-1) {c.addCatalogEntryIdTypCdgVrsn("]]");}


		/******************** CatalogEntry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentryidentifiertypecodingi == 0) {c.addCatalogEntryIdTypCdgCd("[[");}
		if(catalogentryidentifiertypecoding.hasCode()) {

			c.addCatalogEntryIdTypCdgCd(String.valueOf(catalogentryidentifiertypecoding.getCode()));
		} else {
			c.addCatalogEntryIdTypCdgCd("NULL");
		}

		if(catalogentryidentifiertypecodingi == catalogentryidentifiertypecodinglist.size()-1) {c.addCatalogEntryIdTypCdgCd("]]");}


		/******************** CatalogEntry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryidentifiertypecodingi == 0) {c.addCatalogEntryIdTypCdgUsrSltd("[[");}
		if(catalogentryidentifiertypecoding.hasUserSelected()) {

			c.addCatalogEntryIdTypCdgUsrSltd(String.valueOf(catalogentryidentifiertypecoding.getUserSelected()));
		} else {
			c.addCatalogEntryIdTypCdgUsrSltd("NULL");
		}

		if(catalogentryidentifiertypecodingi == catalogentryidentifiertypecodinglist.size()-1) {c.addCatalogEntryIdTypCdgUsrSltd("]]");}


		/******************** CatalogEntry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentryidentifiertypecodingi == 0) {c.addCatalogEntryIdTypCdgSys("[[");}
		if(catalogentryidentifiertypecoding.hasSystem()) {

			c.addCatalogEntryIdTypCdgSys(String.valueOf(catalogentryidentifiertypecoding.getSystem()));
		} else {
			c.addCatalogEntryIdTypCdgSys("NULL");
		}

		if(catalogentryidentifiertypecodingi == catalogentryidentifiertypecodinglist.size()-1) {c.addCatalogEntryIdTypCdgSys("]]");}


		 };
		/******************** catalogentryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryidentifierperiod = catalogentryidentifier.getPeriod();

		/******************** CatalogEntry_Id_Prd_Strt ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdPrdStrt("[");}
		if(catalogentryidentifierperiod.hasStart()) {

			c.addCatalogEntryIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryidentifierperiod.getStart())+"\"");
		} else {
			c.addCatalogEntryIdPrdStrt("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdPrdStrt("]");}


		/******************** CatalogEntry_Id_Prd_End ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdPrdEnd("[");}
		if(catalogentryidentifierperiod.hasEnd()) {

			c.addCatalogEntryIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryidentifierperiod.getEnd())+"\"");
		} else {
			c.addCatalogEntryIdPrdEnd("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdPrdEnd("]");}


		/******************** catalogentryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse catalogentryidentifieruse = catalogentryidentifier.getUse();
		if(catalogentryidentifieruse!=null) {
		if(catalogentryidentifieri == 0) {

		c.addCatalogEntryIdUse("[");		}
			c.addCatalogEntryIdUse(catalogentryidentifieruse.toCode());
		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {

		c.addCatalogEntryIdUse("]");		}

		} else {
			c.addCatalogEntryIdUse("NULL");
		}

		/******************** CatalogEntry_Id_Assigner ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdAssigner("[");}
		if(catalogentryidentifier.hasAssigner()) {

			if(catalogentryidentifier.getAssigner().getReference() != null) {
			c.addCatalogEntryIdAssigner(catalogentryidentifier.getAssigner().getReference());
			}
		} else {
			c.addCatalogEntryIdAssigner("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdAssigner("]");}


		/******************** CatalogEntry_Id_Sys ********************************************************************************/
		if(catalogentryidentifieri == 0) {c.addCatalogEntryIdSys("[");}
		if(catalogentryidentifier.hasSystem()) {

			c.addCatalogEntryIdSys(String.valueOf(catalogentryidentifier.getSystem()));
		} else {
			c.addCatalogEntryIdSys("NULL");
		}

		if(catalogentryidentifieri == catalogentryidentifierlist.size()-1) {c.addCatalogEntryIdSys("]");}


		 };
		/******************** CatalogEntry_Ordrable ********************************************************************************/
		if(catalogentry.hasOrderable()) {

			c.addCatalogEntryOrdrable(String.valueOf(catalogentry.getOrderable()));
		} else {
			c.addCatalogEntryOrdrable("NULL");
		}


		/******************** CatalogEntry_ValidTo ********************************************************************************/
		if(catalogentry.hasValidTo()) {

			c.addCatalogEntryValidTo("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentry.getValidTo())+"\"");
		} else {
			c.addCatalogEntryValidTo("NULL");
		}


		/******************** catalogentryvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryvalidityperiod = catalogentry.getValidityPeriod();

		/******************** CatalogEntry_ValidityPrd_Strt ********************************************************************************/
		if(catalogentryvalidityperiod.hasStart()) {

			c.addCatalogEntryValidityPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryvalidityperiod.getStart())+"\"");
		} else {
			c.addCatalogEntryValidityPrdStrt("NULL");
		}


		/******************** CatalogEntry_ValidityPrd_End ********************************************************************************/
		if(catalogentryvalidityperiod.hasEnd()) {

			c.addCatalogEntryValidityPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryvalidityperiod.getEnd())+"\"");
		} else {
			c.addCatalogEntryValidityPrdEnd("NULL");
		}


		/******************** CatalogEntry_RfrncdItm ********************************************************************************/
		if(catalogentry.hasReferencedItem()) {

			if(catalogentry.getReferencedItem().getReference() != null) {
			c.addCatalogEntryRfrncdItm(catalogentry.getReferencedItem().getReference());
			}
		} else {
			c.addCatalogEntryRfrncdItm("NULL");
		}


		/******************** catalogentryrelatedentry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent> catalogentryrelatedentrylist = catalogentry.getRelatedEntry();
		for(int catalogentryrelatedentryi = 0; catalogentryrelatedentryi<catalogentryrelatedentrylist.size();catalogentryrelatedentryi++ ) {
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent  catalogentryrelatedentry = catalogentryrelatedentrylist.get(catalogentryrelatedentryi);

		/******************** CatalogEntry_RltedEntry_Itm ********************************************************************************/
		if(catalogentryrelatedentryi == 0) {c.addCatalogEntryRltedEntryItm("[");}
		if(catalogentryrelatedentry.hasItem()) {

			if(catalogentryrelatedentry.getItem().getReference() != null) {
			c.addCatalogEntryRltedEntryItm(catalogentryrelatedentry.getItem().getReference());
			}
		} else {
			c.addCatalogEntryRltedEntryItm("NULL");
		}

		if(catalogentryrelatedentryi == catalogentryrelatedentrylist.size()-1) {c.addCatalogEntryRltedEntryItm("]");}


		/******************** catalogentryrelatedentryrelationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationType catalogentryrelatedentryrelationtype = catalogentryrelatedentry.getRelationtype();
		if(catalogentryrelatedentryrelationtype!=null) {
		if(catalogentryrelatedentryi == 0) {

		c.addCatalogEntryRltedEntryRelationtype("[");		}
			c.addCatalogEntryRltedEntryRelationtype(catalogentryrelatedentryrelationtype.toCode());
		if(catalogentryrelatedentryi == catalogentryrelatedentrylist.size()-1) {

		c.addCatalogEntryRltedEntryRelationtype("]");		}

		} else {
			c.addCatalogEntryRltedEntryRelationtype("NULL");
		}

		 };
		/******************** catalogentryadditionalidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> catalogentryadditionalidentifierlist = catalogentry.getAdditionalIdentifier();
		for(int catalogentryadditionalidentifieri = 0; catalogentryadditionalidentifieri<catalogentryadditionalidentifierlist.size();catalogentryadditionalidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  catalogentryadditionalidentifier = catalogentryadditionalidentifierlist.get(catalogentryadditionalidentifieri);

		/******************** CatalogEntry_AddtnlId_Vl ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdVl("[");}
		if(catalogentryadditionalidentifier.hasValue()) {

			c.addCatalogEntryAddtnlIdVl(String.valueOf(catalogentryadditionalidentifier.getValue()));
		} else {
			c.addCatalogEntryAddtnlIdVl("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdVl("]");}


		/******************** catalogentryadditionalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalidentifiertype = catalogentryadditionalidentifier.getType();

		/******************** CatalogEntry_AddtnlId_Typ_Txt ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdTypTxt("[");}
		if(catalogentryadditionalidentifiertype.hasText()) {

			c.addCatalogEntryAddtnlIdTypTxt(String.valueOf(catalogentryadditionalidentifiertype.getText()));
		} else {
			c.addCatalogEntryAddtnlIdTypTxt("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdTypTxt("]");}


		/******************** catalogentryadditionalidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentryadditionalidentifiertypecodinglist = catalogentryadditionalidentifiertype.getCoding();
		for(int catalogentryadditionalidentifiertypecodingi = 0; catalogentryadditionalidentifiertypecodingi<catalogentryadditionalidentifiertypecodinglist.size();catalogentryadditionalidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentryadditionalidentifiertypecoding = catalogentryadditionalidentifiertypecodinglist.get(catalogentryadditionalidentifiertypecodingi);

		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalidentifiertypecodingi == 0) {c.addCatalogEntryAddtnlIdTypCdgDsply("[[");}
		if(catalogentryadditionalidentifiertypecoding.hasDisplay()) {

			c.addCatalogEntryAddtnlIdTypCdgDsply(String.valueOf(catalogentryadditionalidentifiertypecoding.getDisplay()));
		} else {
			c.addCatalogEntryAddtnlIdTypCdgDsply("NULL");
		}

		if(catalogentryadditionalidentifiertypecodingi == catalogentryadditionalidentifiertypecodinglist.size()-1) {c.addCatalogEntryAddtnlIdTypCdgDsply("]]");}


		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalidentifiertypecodingi == 0) {c.addCatalogEntryAddtnlIdTypCdgVrsn("[[");}
		if(catalogentryadditionalidentifiertypecoding.hasVersion()) {

			c.addCatalogEntryAddtnlIdTypCdgVrsn(String.valueOf(catalogentryadditionalidentifiertypecoding.getVersion()));
		} else {
			c.addCatalogEntryAddtnlIdTypCdgVrsn("NULL");
		}

		if(catalogentryadditionalidentifiertypecodingi == catalogentryadditionalidentifiertypecodinglist.size()-1) {c.addCatalogEntryAddtnlIdTypCdgVrsn("]]");}


		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalidentifiertypecodingi == 0) {c.addCatalogEntryAddtnlIdTypCdgCd("[[");}
		if(catalogentryadditionalidentifiertypecoding.hasCode()) {

			c.addCatalogEntryAddtnlIdTypCdgCd(String.valueOf(catalogentryadditionalidentifiertypecoding.getCode()));
		} else {
			c.addCatalogEntryAddtnlIdTypCdgCd("NULL");
		}

		if(catalogentryadditionalidentifiertypecodingi == catalogentryadditionalidentifiertypecodinglist.size()-1) {c.addCatalogEntryAddtnlIdTypCdgCd("]]");}


		/******************** CatalogEntry_AddtnlId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalidentifiertypecodingi == 0) {c.addCatalogEntryAddtnlIdTypCdgUsrSltd("[[");}
		if(catalogentryadditionalidentifiertypecoding.hasUserSelected()) {

			c.addCatalogEntryAddtnlIdTypCdgUsrSltd(String.valueOf(catalogentryadditionalidentifiertypecoding.getUserSelected()));
		} else {
			c.addCatalogEntryAddtnlIdTypCdgUsrSltd("NULL");
		}

		if(catalogentryadditionalidentifiertypecodingi == catalogentryadditionalidentifiertypecodinglist.size()-1) {c.addCatalogEntryAddtnlIdTypCdgUsrSltd("]]");}


		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalidentifiertypecodingi == 0) {c.addCatalogEntryAddtnlIdTypCdgSys("[[");}
		if(catalogentryadditionalidentifiertypecoding.hasSystem()) {

			c.addCatalogEntryAddtnlIdTypCdgSys(String.valueOf(catalogentryadditionalidentifiertypecoding.getSystem()));
		} else {
			c.addCatalogEntryAddtnlIdTypCdgSys("NULL");
		}

		if(catalogentryadditionalidentifiertypecodingi == catalogentryadditionalidentifiertypecodinglist.size()-1) {c.addCatalogEntryAddtnlIdTypCdgSys("]]");}


		 };
		/******************** catalogentryadditionalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryadditionalidentifierperiod = catalogentryadditionalidentifier.getPeriod();

		/******************** CatalogEntry_AddtnlId_Prd_Strt ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdPrdStrt("[");}
		if(catalogentryadditionalidentifierperiod.hasStart()) {

			c.addCatalogEntryAddtnlIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryadditionalidentifierperiod.getStart())+"\"");
		} else {
			c.addCatalogEntryAddtnlIdPrdStrt("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdPrdStrt("]");}


		/******************** CatalogEntry_AddtnlId_Prd_End ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdPrdEnd("[");}
		if(catalogentryadditionalidentifierperiod.hasEnd()) {

			c.addCatalogEntryAddtnlIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentryadditionalidentifierperiod.getEnd())+"\"");
		} else {
			c.addCatalogEntryAddtnlIdPrdEnd("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdPrdEnd("]");}


		/******************** catalogentryadditionalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse catalogentryadditionalidentifieruse = catalogentryadditionalidentifier.getUse();
		if(catalogentryadditionalidentifieruse!=null) {
		if(catalogentryadditionalidentifieri == 0) {

		c.addCatalogEntryAddtnlIdUse("[");		}
			c.addCatalogEntryAddtnlIdUse(catalogentryadditionalidentifieruse.toCode());
		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {

		c.addCatalogEntryAddtnlIdUse("]");		}

		} else {
			c.addCatalogEntryAddtnlIdUse("NULL");
		}

		/******************** CatalogEntry_AddtnlId_Assigner ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdAssigner("[");}
		if(catalogentryadditionalidentifier.hasAssigner()) {

			if(catalogentryadditionalidentifier.getAssigner().getReference() != null) {
			c.addCatalogEntryAddtnlIdAssigner(catalogentryadditionalidentifier.getAssigner().getReference());
			}
		} else {
			c.addCatalogEntryAddtnlIdAssigner("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdAssigner("]");}


		/******************** CatalogEntry_AddtnlId_Sys ********************************************************************************/
		if(catalogentryadditionalidentifieri == 0) {c.addCatalogEntryAddtnlIdSys("[");}
		if(catalogentryadditionalidentifier.hasSystem()) {

			c.addCatalogEntryAddtnlIdSys(String.valueOf(catalogentryadditionalidentifier.getSystem()));
		} else {
			c.addCatalogEntryAddtnlIdSys("NULL");
		}

		if(catalogentryadditionalidentifieri == catalogentryadditionalidentifierlist.size()-1) {c.addCatalogEntryAddtnlIdSys("]");}


		 };
		/******************** catalogentryadditionalcharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> catalogentryadditionalcharacteristiclist = catalogentry.getAdditionalCharacteristic();
		for(int catalogentryadditionalcharacteristici = 0; catalogentryadditionalcharacteristici<catalogentryadditionalcharacteristiclist.size();catalogentryadditionalcharacteristici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  catalogentryadditionalcharacteristic = catalogentryadditionalcharacteristiclist.get(catalogentryadditionalcharacteristici);

		/******************** CatalogEntry_AddtnlCrctrstc_Txt ********************************************************************************/
		if(catalogentryadditionalcharacteristici == 0) {c.addCatalogEntryAddtnlCrctrstcTxt("[");}
		if(catalogentryadditionalcharacteristic.hasText()) {

			c.addCatalogEntryAddtnlCrctrstcTxt(String.valueOf(catalogentryadditionalcharacteristic.getText()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcTxt("NULL");
		}

		if(catalogentryadditionalcharacteristici == catalogentryadditionalcharacteristiclist.size()-1) {c.addCatalogEntryAddtnlCrctrstcTxt("]");}


		/******************** catalogentryadditionalcharacteristiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentryadditionalcharacteristiccodinglist = catalogentryadditionalcharacteristic.getCoding();
		for(int catalogentryadditionalcharacteristiccodingi = 0; catalogentryadditionalcharacteristiccodingi<catalogentryadditionalcharacteristiccodinglist.size();catalogentryadditionalcharacteristiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentryadditionalcharacteristiccoding = catalogentryadditionalcharacteristiccodinglist.get(catalogentryadditionalcharacteristiccodingi);

		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalcharacteristiccodingi == 0) {c.addCatalogEntryAddtnlCrctrstcCdgDsply("[[");}
		if(catalogentryadditionalcharacteristiccoding.hasDisplay()) {

			c.addCatalogEntryAddtnlCrctrstcCdgDsply(String.valueOf(catalogentryadditionalcharacteristiccoding.getDisplay()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcCdgDsply("NULL");
		}

		if(catalogentryadditionalcharacteristiccodingi == catalogentryadditionalcharacteristiccodinglist.size()-1) {c.addCatalogEntryAddtnlCrctrstcCdgDsply("]]");}


		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalcharacteristiccodingi == 0) {c.addCatalogEntryAddtnlCrctrstcCdgVrsn("[[");}
		if(catalogentryadditionalcharacteristiccoding.hasVersion()) {

			c.addCatalogEntryAddtnlCrctrstcCdgVrsn(String.valueOf(catalogentryadditionalcharacteristiccoding.getVersion()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcCdgVrsn("NULL");
		}

		if(catalogentryadditionalcharacteristiccodingi == catalogentryadditionalcharacteristiccodinglist.size()-1) {c.addCatalogEntryAddtnlCrctrstcCdgVrsn("]]");}


		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalcharacteristiccodingi == 0) {c.addCatalogEntryAddtnlCrctrstcCdgCd("[[");}
		if(catalogentryadditionalcharacteristiccoding.hasCode()) {

			c.addCatalogEntryAddtnlCrctrstcCdgCd(String.valueOf(catalogentryadditionalcharacteristiccoding.getCode()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcCdgCd("NULL");
		}

		if(catalogentryadditionalcharacteristiccodingi == catalogentryadditionalcharacteristiccodinglist.size()-1) {c.addCatalogEntryAddtnlCrctrstcCdgCd("]]");}


		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalcharacteristiccodingi == 0) {c.addCatalogEntryAddtnlCrctrstcCdgUsrSltd("[[");}
		if(catalogentryadditionalcharacteristiccoding.hasUserSelected()) {

			c.addCatalogEntryAddtnlCrctrstcCdgUsrSltd(String.valueOf(catalogentryadditionalcharacteristiccoding.getUserSelected()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcCdgUsrSltd("NULL");
		}

		if(catalogentryadditionalcharacteristiccodingi == catalogentryadditionalcharacteristiccodinglist.size()-1) {c.addCatalogEntryAddtnlCrctrstcCdgUsrSltd("]]");}


		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalcharacteristiccodingi == 0) {c.addCatalogEntryAddtnlCrctrstcCdgSys("[[");}
		if(catalogentryadditionalcharacteristiccoding.hasSystem()) {

			c.addCatalogEntryAddtnlCrctrstcCdgSys(String.valueOf(catalogentryadditionalcharacteristiccoding.getSystem()));
		} else {
			c.addCatalogEntryAddtnlCrctrstcCdgSys("NULL");
		}

		if(catalogentryadditionalcharacteristiccodingi == catalogentryadditionalcharacteristiccodinglist.size()-1) {c.addCatalogEntryAddtnlCrctrstcCdgSys("]]");}


		 };
		 };
		/******************** catalogentryadditionalclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> catalogentryadditionalclassificationlist = catalogentry.getAdditionalClassification();
		for(int catalogentryadditionalclassificationi = 0; catalogentryadditionalclassificationi<catalogentryadditionalclassificationlist.size();catalogentryadditionalclassificationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  catalogentryadditionalclassification = catalogentryadditionalclassificationlist.get(catalogentryadditionalclassificationi);

		/******************** CatalogEntry_AddtnlClsfctn_Txt ********************************************************************************/
		if(catalogentryadditionalclassificationi == 0) {c.addCatalogEntryAddtnlClsfctnTxt("[");}
		if(catalogentryadditionalclassification.hasText()) {

			c.addCatalogEntryAddtnlClsfctnTxt(String.valueOf(catalogentryadditionalclassification.getText()));
		} else {
			c.addCatalogEntryAddtnlClsfctnTxt("NULL");
		}

		if(catalogentryadditionalclassificationi == catalogentryadditionalclassificationlist.size()-1) {c.addCatalogEntryAddtnlClsfctnTxt("]");}


		/******************** catalogentryadditionalclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentryadditionalclassificationcodinglist = catalogentryadditionalclassification.getCoding();
		for(int catalogentryadditionalclassificationcodingi = 0; catalogentryadditionalclassificationcodingi<catalogentryadditionalclassificationcodinglist.size();catalogentryadditionalclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentryadditionalclassificationcoding = catalogentryadditionalclassificationcodinglist.get(catalogentryadditionalclassificationcodingi);

		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalclassificationcodingi == 0) {c.addCatalogEntryAddtnlClsfctnCdgDsply("[[");}
		if(catalogentryadditionalclassificationcoding.hasDisplay()) {

			c.addCatalogEntryAddtnlClsfctnCdgDsply(String.valueOf(catalogentryadditionalclassificationcoding.getDisplay()));
		} else {
			c.addCatalogEntryAddtnlClsfctnCdgDsply("NULL");
		}

		if(catalogentryadditionalclassificationcodingi == catalogentryadditionalclassificationcodinglist.size()-1) {c.addCatalogEntryAddtnlClsfctnCdgDsply("]]");}


		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalclassificationcodingi == 0) {c.addCatalogEntryAddtnlClsfctnCdgVrsn("[[");}
		if(catalogentryadditionalclassificationcoding.hasVersion()) {

			c.addCatalogEntryAddtnlClsfctnCdgVrsn(String.valueOf(catalogentryadditionalclassificationcoding.getVersion()));
		} else {
			c.addCatalogEntryAddtnlClsfctnCdgVrsn("NULL");
		}

		if(catalogentryadditionalclassificationcodingi == catalogentryadditionalclassificationcodinglist.size()-1) {c.addCatalogEntryAddtnlClsfctnCdgVrsn("]]");}


		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalclassificationcodingi == 0) {c.addCatalogEntryAddtnlClsfctnCdgCd("[[");}
		if(catalogentryadditionalclassificationcoding.hasCode()) {

			c.addCatalogEntryAddtnlClsfctnCdgCd(String.valueOf(catalogentryadditionalclassificationcoding.getCode()));
		} else {
			c.addCatalogEntryAddtnlClsfctnCdgCd("NULL");
		}

		if(catalogentryadditionalclassificationcodingi == catalogentryadditionalclassificationcodinglist.size()-1) {c.addCatalogEntryAddtnlClsfctnCdgCd("]]");}


		/******************** CatalogEntry_AddtnlClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalclassificationcodingi == 0) {c.addCatalogEntryAddtnlClsfctnCdgUsrSltd("[[");}
		if(catalogentryadditionalclassificationcoding.hasUserSelected()) {

			c.addCatalogEntryAddtnlClsfctnCdgUsrSltd(String.valueOf(catalogentryadditionalclassificationcoding.getUserSelected()));
		} else {
			c.addCatalogEntryAddtnlClsfctnCdgUsrSltd("NULL");
		}

		if(catalogentryadditionalclassificationcodingi == catalogentryadditionalclassificationcodinglist.size()-1) {c.addCatalogEntryAddtnlClsfctnCdgUsrSltd("]]");}


		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalclassificationcodingi == 0) {c.addCatalogEntryAddtnlClsfctnCdgSys("[[");}
		if(catalogentryadditionalclassificationcoding.hasSystem()) {

			c.addCatalogEntryAddtnlClsfctnCdgSys(String.valueOf(catalogentryadditionalclassificationcoding.getSystem()));
		} else {
			c.addCatalogEntryAddtnlClsfctnCdgSys("NULL");
		}

		if(catalogentryadditionalclassificationcodingi == catalogentryadditionalclassificationcodinglist.size()-1) {c.addCatalogEntryAddtnlClsfctnCdgSys("]]");}


		 };
		 };
		/******************** CatalogEntry_LastUpdated ********************************************************************************/
		if(catalogentry.hasLastUpdated()) {

			c.addCatalogEntryLastUpdated("\""+ca.uhn.fhir.util.DateUtils.formatDate(catalogentry.getLastUpdated())+"\"");
		} else {
			c.addCatalogEntryLastUpdated("NULL");
		}


		/******************** catalogentryclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> catalogentryclassificationlist = catalogentry.getClassification();
		for(int catalogentryclassificationi = 0; catalogentryclassificationi<catalogentryclassificationlist.size();catalogentryclassificationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  catalogentryclassification = catalogentryclassificationlist.get(catalogentryclassificationi);

		/******************** CatalogEntry_Clsfctn_Txt ********************************************************************************/
		if(catalogentryclassificationi == 0) {c.addCatalogEntryClsfctnTxt("[");}
		if(catalogentryclassification.hasText()) {

			c.addCatalogEntryClsfctnTxt(String.valueOf(catalogentryclassification.getText()));
		} else {
			c.addCatalogEntryClsfctnTxt("NULL");
		}

		if(catalogentryclassificationi == catalogentryclassificationlist.size()-1) {c.addCatalogEntryClsfctnTxt("]");}


		/******************** catalogentryclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> catalogentryclassificationcodinglist = catalogentryclassification.getCoding();
		for(int catalogentryclassificationcodingi = 0; catalogentryclassificationcodingi<catalogentryclassificationcodinglist.size();catalogentryclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  catalogentryclassificationcoding = catalogentryclassificationcodinglist.get(catalogentryclassificationcodingi);

		/******************** CatalogEntry_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(catalogentryclassificationcodingi == 0) {c.addCatalogEntryClsfctnCdgDsply("[[");}
		if(catalogentryclassificationcoding.hasDisplay()) {

			c.addCatalogEntryClsfctnCdgDsply(String.valueOf(catalogentryclassificationcoding.getDisplay()));
		} else {
			c.addCatalogEntryClsfctnCdgDsply("NULL");
		}

		if(catalogentryclassificationcodingi == catalogentryclassificationcodinglist.size()-1) {c.addCatalogEntryClsfctnCdgDsply("]]");}


		/******************** CatalogEntry_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(catalogentryclassificationcodingi == 0) {c.addCatalogEntryClsfctnCdgVrsn("[[");}
		if(catalogentryclassificationcoding.hasVersion()) {

			c.addCatalogEntryClsfctnCdgVrsn(String.valueOf(catalogentryclassificationcoding.getVersion()));
		} else {
			c.addCatalogEntryClsfctnCdgVrsn("NULL");
		}

		if(catalogentryclassificationcodingi == catalogentryclassificationcodinglist.size()-1) {c.addCatalogEntryClsfctnCdgVrsn("]]");}


		/******************** CatalogEntry_Clsfctn_Cdg_Cd ********************************************************************************/
		if(catalogentryclassificationcodingi == 0) {c.addCatalogEntryClsfctnCdgCd("[[");}
		if(catalogentryclassificationcoding.hasCode()) {

			c.addCatalogEntryClsfctnCdgCd(String.valueOf(catalogentryclassificationcoding.getCode()));
		} else {
			c.addCatalogEntryClsfctnCdgCd("NULL");
		}

		if(catalogentryclassificationcodingi == catalogentryclassificationcodinglist.size()-1) {c.addCatalogEntryClsfctnCdgCd("]]");}


		/******************** CatalogEntry_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryclassificationcodingi == 0) {c.addCatalogEntryClsfctnCdgUsrSltd("[[");}
		if(catalogentryclassificationcoding.hasUserSelected()) {

			c.addCatalogEntryClsfctnCdgUsrSltd(String.valueOf(catalogentryclassificationcoding.getUserSelected()));
		} else {
			c.addCatalogEntryClsfctnCdgUsrSltd("NULL");
		}

		if(catalogentryclassificationcodingi == catalogentryclassificationcodinglist.size()-1) {c.addCatalogEntryClsfctnCdgUsrSltd("]]");}


		/******************** CatalogEntry_Clsfctn_Cdg_Sys ********************************************************************************/
		if(catalogentryclassificationcodingi == 0) {c.addCatalogEntryClsfctnCdgSys("[[");}
		if(catalogentryclassificationcoding.hasSystem()) {

			c.addCatalogEntryClsfctnCdgSys(String.valueOf(catalogentryclassificationcoding.getSystem()));
		} else {
			c.addCatalogEntryClsfctnCdgSys("NULL");
		}

		if(catalogentryclassificationcodingi == catalogentryclassificationcodinglist.size()-1) {c.addCatalogEntryClsfctnCdgSys("]]");}


		 };
		 };
		return c;
	}
}
