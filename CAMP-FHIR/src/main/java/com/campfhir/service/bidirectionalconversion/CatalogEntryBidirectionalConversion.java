package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CatalogEntry;
public class CatalogEntryBidirectionalConversion 
{
	public CatalogEntry CatalogEntrys(org.hl7.fhir.r4.model.CatalogEntry catalogentry) throws ParseException
	{
		 main.java.com.campfhir.model.CatalogEntry c = new  main.java.com.campfhir.model.CatalogEntry();

		/******************** id ********************************************************************************/
		catalogentry.setId(c.getId());

		/******************** catalogentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentrytype = catalogentry.getType();

		/******************** catalogentrytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentrytypecoding = catalogentrytype.getCodingFirstRep();

		/******************** CatalogEntry_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentrytypecoding.hasDisplay()) {
			c.setCatalogEntryTypCdgDsply(String.valueOf(catalogentrytypecoding.getDisplay()));
		}
		/******************** CatalogEntry_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentrytypecoding.hasVersion()) {
			c.setCatalogEntryTypCdgVrsn(String.valueOf(catalogentrytypecoding.getVersion()));
		}
		/******************** CatalogEntry_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentrytypecoding.hasCode()) {
			c.setCatalogEntryTypCdgCd(String.valueOf(catalogentrytypecoding.getCode()));
		}
		/******************** CatalogEntry_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentrytypecoding.hasSystem()) {
			c.setCatalogEntryTypCdgSys(String.valueOf(catalogentrytypecoding.getSystem()));
		}
		/******************** CatalogEntry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentrytypecoding.hasUserSelected()) {
			c.setCatalogEntryTypCdgUsrSltd(String.valueOf(catalogentrytypecoding.getUserSelected()));
		}
		/******************** CatalogEntry_Typ_Txt ********************************************************************************/
		if(catalogentrytype.hasText()) {
			c.setCatalogEntryTypTxt(String.valueOf(catalogentrytype.getText()));
		}
		/******************** catalogentryadditionalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier catalogentryadditionalidentifier = catalogentry.getAdditionalIdentifierFirstRep();

		/******************** CatalogEntry_AddtnlId_Vl ********************************************************************************/
		if(catalogentryadditionalidentifier.hasValue()) {
			c.setCatalogEntryAddtnlIdVl(String.valueOf(catalogentryadditionalidentifier.getValue()));
		}
		/******************** catalogentryadditionalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalidentifiertype = catalogentryadditionalidentifier.getType();

		/******************** catalogentryadditionalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalidentifiertypecoding = catalogentryadditionalidentifiertype.getCodingFirstRep();

		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalidentifiertypecoding.hasDisplay()) {
			c.setCatalogEntryAddtnlIdTypCdgDsply(String.valueOf(catalogentryadditionalidentifiertypecoding.getDisplay()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalidentifiertypecoding.hasVersion()) {
			c.setCatalogEntryAddtnlIdTypCdgVrsn(String.valueOf(catalogentryadditionalidentifiertypecoding.getVersion()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalidentifiertypecoding.hasCode()) {
			c.setCatalogEntryAddtnlIdTypCdgCd(String.valueOf(catalogentryadditionalidentifiertypecoding.getCode()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalidentifiertypecoding.hasSystem()) {
			c.setCatalogEntryAddtnlIdTypCdgSys(String.valueOf(catalogentryadditionalidentifiertypecoding.getSystem()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalidentifiertypecoding.hasUserSelected()) {
			c.setCatalogEntryAddtnlIdTypCdgUsrSltd(String.valueOf(catalogentryadditionalidentifiertypecoding.getUserSelected()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Txt ********************************************************************************/
		if(catalogentryadditionalidentifiertype.hasText()) {
			c.setCatalogEntryAddtnlIdTypTxt(String.valueOf(catalogentryadditionalidentifiertype.getText()));
		}
		/******************** CatalogEntry_AddtnlId_Sys ********************************************************************************/
		if(catalogentryadditionalidentifier.hasSystem()) {
			c.setCatalogEntryAddtnlIdSys(String.valueOf(catalogentryadditionalidentifier.getSystem()));
		}
		/******************** CatalogEntry_AddtnlId_Assigner ********************************************************************************/
		if(catalogentryadditionalidentifier.hasAssigner()) {
			c.setCatalogEntryAddtnlIdAssigner(String.valueOf(catalogentryadditionalidentifier.getAssigner()));
		}
		/******************** catalogentryadditionalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryadditionalidentifierperiod = catalogentryadditionalidentifier.getPeriod();

		/******************** CatalogEntry_AddtnlId_Prd_End ********************************************************************************/
		if(catalogentryadditionalidentifierperiod.hasEnd()) {
			c.setCatalogEntryAddtnlIdPrdEnd(String.valueOf(catalogentryadditionalidentifierperiod.getEnd()));
		}
		/******************** CatalogEntry_AddtnlId_Prd_Strt ********************************************************************************/
		if(catalogentryadditionalidentifierperiod.hasStart()) {
			c.setCatalogEntryAddtnlIdPrdStrt(String.valueOf(catalogentryadditionalidentifierperiod.getStart()));
		}
		/******************** catalogentryadditionalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse catalogentryadditionalidentifieruse = catalogentryadditionalidentifier.getUse();
		c.setCatalogEntryAddtnlIdUse(catalogentryadditionalidentifieruse.toCode());

		/******************** catalogentryrelatedentry ********************************************************************************/
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent catalogentryrelatedentry = catalogentry.getRelatedEntryFirstRep();

		/******************** CatalogEntry_RltedEntry_Itm ********************************************************************************/
		if(catalogentryrelatedentry.hasItem()) {
			c.setCatalogEntryRltedEntryItm(String.valueOf(catalogentryrelatedentry.getItem()));
		}
		/******************** catalogentryrelatedentryrelationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationType catalogentryrelatedentryrelationtype = catalogentryrelatedentry.getRelationtype();
		c.setCatalogEntryRltedEntryRelationtype(catalogentryrelatedentryrelationtype.toCode());

		/******************** CatalogEntry_LastUpdated ********************************************************************************/
		if(catalogentry.hasLastUpdated()) {
			c.setCatalogEntryLastUpdated(String.valueOf(catalogentry.getLastUpdated()));
		}
		/******************** catalogentrystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus catalogentrystatus = catalogentry.getStatus();
		c.setCatalogEntrySts(catalogentrystatus.toCode());

		/******************** catalogentryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier catalogentryidentifier = catalogentry.getIdentifierFirstRep();

		/******************** CatalogEntry_Id_Vl ********************************************************************************/
		if(catalogentryidentifier.hasValue()) {
			c.setCatalogEntryIdVl(String.valueOf(catalogentryidentifier.getValue()));
		}
		/******************** catalogentryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryidentifiertype = catalogentryidentifier.getType();

		/******************** catalogentryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryidentifiertypecoding = catalogentryidentifiertype.getCodingFirstRep();

		/******************** CatalogEntry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(catalogentryidentifiertypecoding.hasDisplay()) {
			c.setCatalogEntryIdTypCdgDsply(String.valueOf(catalogentryidentifiertypecoding.getDisplay()));
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(catalogentryidentifiertypecoding.hasVersion()) {
			c.setCatalogEntryIdTypCdgVrsn(String.valueOf(catalogentryidentifiertypecoding.getVersion()));
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(catalogentryidentifiertypecoding.hasCode()) {
			c.setCatalogEntryIdTypCdgCd(String.valueOf(catalogentryidentifiertypecoding.getCode()));
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(catalogentryidentifiertypecoding.hasSystem()) {
			c.setCatalogEntryIdTypCdgSys(String.valueOf(catalogentryidentifiertypecoding.getSystem()));
		}
		/******************** CatalogEntry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryidentifiertypecoding.hasUserSelected()) {
			c.setCatalogEntryIdTypCdgUsrSltd(String.valueOf(catalogentryidentifiertypecoding.getUserSelected()));
		}
		/******************** CatalogEntry_Id_Typ_Txt ********************************************************************************/
		if(catalogentryidentifiertype.hasText()) {
			c.setCatalogEntryIdTypTxt(String.valueOf(catalogentryidentifiertype.getText()));
		}
		/******************** CatalogEntry_Id_Sys ********************************************************************************/
		if(catalogentryidentifier.hasSystem()) {
			c.setCatalogEntryIdSys(String.valueOf(catalogentryidentifier.getSystem()));
		}
		/******************** CatalogEntry_Id_Assigner ********************************************************************************/
		if(catalogentryidentifier.hasAssigner()) {
			c.setCatalogEntryIdAssigner(String.valueOf(catalogentryidentifier.getAssigner()));
		}
		/******************** catalogentryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryidentifierperiod = catalogentryidentifier.getPeriod();

		/******************** CatalogEntry_Id_Prd_End ********************************************************************************/
		if(catalogentryidentifierperiod.hasEnd()) {
			c.setCatalogEntryIdPrdEnd(String.valueOf(catalogentryidentifierperiod.getEnd()));
		}
		/******************** CatalogEntry_Id_Prd_Strt ********************************************************************************/
		if(catalogentryidentifierperiod.hasStart()) {
			c.setCatalogEntryIdPrdStrt(String.valueOf(catalogentryidentifierperiod.getStart()));
		}
		/******************** catalogentryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse catalogentryidentifieruse = catalogentryidentifier.getUse();
		c.setCatalogEntryIdUse(catalogentryidentifieruse.toCode());

		/******************** catalogentryadditionalcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalcharacteristic = catalogentry.getAdditionalCharacteristicFirstRep();

		/******************** catalogentryadditionalcharacteristiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalcharacteristiccoding = catalogentryadditionalcharacteristic.getCodingFirstRep();

		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalcharacteristiccoding.hasDisplay()) {
			c.setCatalogEntryAddtnlCrctrstcCdgDsply(String.valueOf(catalogentryadditionalcharacteristiccoding.getDisplay()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalcharacteristiccoding.hasVersion()) {
			c.setCatalogEntryAddtnlCrctrstcCdgVrsn(String.valueOf(catalogentryadditionalcharacteristiccoding.getVersion()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalcharacteristiccoding.hasCode()) {
			c.setCatalogEntryAddtnlCrctrstcCdgCd(String.valueOf(catalogentryadditionalcharacteristiccoding.getCode()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalcharacteristiccoding.hasSystem()) {
			c.setCatalogEntryAddtnlCrctrstcCdgSys(String.valueOf(catalogentryadditionalcharacteristiccoding.getSystem()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalcharacteristiccoding.hasUserSelected()) {
			c.setCatalogEntryAddtnlCrctrstcCdgUsrSltd(String.valueOf(catalogentryadditionalcharacteristiccoding.getUserSelected()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Txt ********************************************************************************/
		if(catalogentryadditionalcharacteristic.hasText()) {
			c.setCatalogEntryAddtnlCrctrstcTxt(String.valueOf(catalogentryadditionalcharacteristic.getText()));
		}
		/******************** catalogentryadditionalclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalclassification = catalogentry.getAdditionalClassificationFirstRep();

		/******************** catalogentryadditionalclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalclassificationcoding = catalogentryadditionalclassification.getCodingFirstRep();

		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Dsply ********************************************************************************/
		if(catalogentryadditionalclassificationcoding.hasDisplay()) {
			c.setCatalogEntryAddtnlClsfctnCdgDsply(String.valueOf(catalogentryadditionalclassificationcoding.getDisplay()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Vrsn ********************************************************************************/
		if(catalogentryadditionalclassificationcoding.hasVersion()) {
			c.setCatalogEntryAddtnlClsfctnCdgVrsn(String.valueOf(catalogentryadditionalclassificationcoding.getVersion()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Cd ********************************************************************************/
		if(catalogentryadditionalclassificationcoding.hasCode()) {
			c.setCatalogEntryAddtnlClsfctnCdgCd(String.valueOf(catalogentryadditionalclassificationcoding.getCode()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Sys ********************************************************************************/
		if(catalogentryadditionalclassificationcoding.hasSystem()) {
			c.setCatalogEntryAddtnlClsfctnCdgSys(String.valueOf(catalogentryadditionalclassificationcoding.getSystem()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryadditionalclassificationcoding.hasUserSelected()) {
			c.setCatalogEntryAddtnlClsfctnCdgUsrSltd(String.valueOf(catalogentryadditionalclassificationcoding.getUserSelected()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Txt ********************************************************************************/
		if(catalogentryadditionalclassification.hasText()) {
			c.setCatalogEntryAddtnlClsfctnTxt(String.valueOf(catalogentryadditionalclassification.getText()));
		}
		/******************** CatalogEntry_RfrncdItm ********************************************************************************/
		if(catalogentry.hasReferencedItem()) {
			c.setCatalogEntryRfrncdItm(String.valueOf(catalogentry.getReferencedItem()));
		}
		/******************** CatalogEntry_Ordrable ********************************************************************************/
		if(catalogentry.hasOrderable()) {
			c.setCatalogEntryOrdrable(String.valueOf(catalogentry.getOrderable()));
		}
		/******************** CatalogEntry_ValidTo ********************************************************************************/
		if(catalogentry.hasValidTo()) {
			c.setCatalogEntryValidTo(String.valueOf(catalogentry.getValidTo()));
		}
		/******************** catalogentryvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryvalidityperiod = catalogentry.getValidityPeriod();

		/******************** CatalogEntry_ValidityPrd_End ********************************************************************************/
		if(catalogentryvalidityperiod.hasEnd()) {
			c.setCatalogEntryValidityPrdEnd(String.valueOf(catalogentryvalidityperiod.getEnd()));
		}
		/******************** CatalogEntry_ValidityPrd_Strt ********************************************************************************/
		if(catalogentryvalidityperiod.hasStart()) {
			c.setCatalogEntryValidityPrdStrt(String.valueOf(catalogentryvalidityperiod.getStart()));
		}
		/******************** catalogentryclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryclassification = catalogentry.getClassificationFirstRep();

		/******************** catalogentryclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryclassificationcoding = catalogentryclassification.getCodingFirstRep();

		/******************** CatalogEntry_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(catalogentryclassificationcoding.hasDisplay()) {
			c.setCatalogEntryClsfctnCdgDsply(String.valueOf(catalogentryclassificationcoding.getDisplay()));
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(catalogentryclassificationcoding.hasVersion()) {
			c.setCatalogEntryClsfctnCdgVrsn(String.valueOf(catalogentryclassificationcoding.getVersion()));
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Cd ********************************************************************************/
		if(catalogentryclassificationcoding.hasCode()) {
			c.setCatalogEntryClsfctnCdgCd(String.valueOf(catalogentryclassificationcoding.getCode()));
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Sys ********************************************************************************/
		if(catalogentryclassificationcoding.hasSystem()) {
			c.setCatalogEntryClsfctnCdgSys(String.valueOf(catalogentryclassificationcoding.getSystem()));
		}
		/******************** CatalogEntry_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(catalogentryclassificationcoding.hasUserSelected()) {
			c.setCatalogEntryClsfctnCdgUsrSltd(String.valueOf(catalogentryclassificationcoding.getUserSelected()));
		}
		/******************** CatalogEntry_Clsfctn_Txt ********************************************************************************/
		if(catalogentryclassification.hasText()) {
			c.setCatalogEntryClsfctnTxt(String.valueOf(catalogentryclassification.getText()));
		}
		return c;
	}
}
