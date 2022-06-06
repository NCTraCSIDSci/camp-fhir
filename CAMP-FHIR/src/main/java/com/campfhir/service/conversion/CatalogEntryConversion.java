package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CatalogEntry;
public class CatalogEntryConversion 
{
	public org.hl7.fhir.r4.model.CatalogEntry CatalogEntrys(CatalogEntry c) throws ParseException
	{
		org.hl7.fhir.r4.model.CatalogEntry catalogentry = new org.hl7.fhir.r4.model.CatalogEntry();

		/******************** id ********************************************************************************/
		catalogentry.setId(c.getId());

		/******************** catalogentryadditionalcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalcharacteristic =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentry.addAdditionalCharacteristic(catalogentryadditionalcharacteristic);

		/******************** catalogentryadditionalcharacteristiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalcharacteristiccoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentryadditionalcharacteristic.addCoding(catalogentryadditionalcharacteristiccoding);

		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgCd() != null) {
			catalogentryadditionalcharacteristiccoding.setCode(c.getCatalogEntryAddtnlCrctrstcCdgCd());
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgDsply() != null) {
			catalogentryadditionalcharacteristiccoding.setDisplay(c.getCatalogEntryAddtnlCrctrstcCdgDsply());
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgSys() != null) {
			catalogentryadditionalcharacteristiccoding.setSystem(c.getCatalogEntryAddtnlCrctrstcCdgSys());
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgUsrSltd() != null) {
			catalogentryadditionalcharacteristiccoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryAddtnlCrctrstcCdgUsrSltd()));
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgVrsn() != null) {
			catalogentryadditionalcharacteristiccoding.setVersion(c.getCatalogEntryAddtnlCrctrstcCdgVrsn());
		}
		/******************** CatalogEntry_AddtnlCrctrstc_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcTxt() != null) {
			catalogentryadditionalcharacteristic.setText(c.getCatalogEntryAddtnlCrctrstcTxt());
		}
		/******************** catalogentryadditionalclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentry.addAdditionalClassification(catalogentryadditionalclassification);

		/******************** catalogentryadditionalclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentryadditionalclassification.addCoding(catalogentryadditionalclassificationcoding);

		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgCd() != null) {
			catalogentryadditionalclassificationcoding.setCode(c.getCatalogEntryAddtnlClsfctnCdgCd());
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgDsply() != null) {
			catalogentryadditionalclassificationcoding.setDisplay(c.getCatalogEntryAddtnlClsfctnCdgDsply());
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgSys() != null) {
			catalogentryadditionalclassificationcoding.setSystem(c.getCatalogEntryAddtnlClsfctnCdgSys());
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgUsrSltd() != null) {
			catalogentryadditionalclassificationcoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryAddtnlClsfctnCdgUsrSltd()));
		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgVrsn() != null) {
			catalogentryadditionalclassificationcoding.setVersion(c.getCatalogEntryAddtnlClsfctnCdgVrsn());
		}
		/******************** CatalogEntry_AddtnlClsfctn_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnTxt() != null) {
			catalogentryadditionalclassification.setText(c.getCatalogEntryAddtnlClsfctnTxt());
		}
		/******************** catalogentryadditionalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier catalogentryadditionalidentifier =  new org.hl7.fhir.r4.model.Identifier();
		catalogentry.addAdditionalIdentifier(catalogentryadditionalidentifier);

		/******************** CatalogEntry_AddtnlId_Assigner ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdAssigner() != null) {
			catalogentryadditionalidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCatalogEntryAddtnlIdAssigner()));
		}
		/******************** catalogentryadditionalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryadditionalidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		catalogentryadditionalidentifier.setPeriod(catalogentryadditionalidentifierperiod);

		/******************** CatalogEntry_AddtnlId_Prd_End ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdPrdEnd() != null) {
			java.text.SimpleDateFormat CatalogEntry_AddtnlId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_AddtnlId_Prd_Enddate = CatalogEntry_AddtnlId_Prd_Endsdf.parse(c.getCatalogEntryAddtnlIdPrdEnd());
			catalogentryadditionalidentifierperiod.setEnd(CatalogEntry_AddtnlId_Prd_Enddate);
		}
		/******************** CatalogEntry_AddtnlId_Prd_Strt ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdPrdStrt() != null) {
			java.text.SimpleDateFormat CatalogEntry_AddtnlId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_AddtnlId_Prd_Strtdate = CatalogEntry_AddtnlId_Prd_Strtsdf.parse(c.getCatalogEntryAddtnlIdPrdStrt());
			catalogentryadditionalidentifierperiod.setStart(CatalogEntry_AddtnlId_Prd_Strtdate);
		}
		/******************** CatalogEntry_AddtnlId_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdSys() != null) {
			catalogentryadditionalidentifier.setSystem(c.getCatalogEntryAddtnlIdSys());
		}
		/******************** catalogentryadditionalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryadditionalidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentryadditionalidentifier.setType(catalogentryadditionalidentifiertype);

		/******************** catalogentryadditionalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryadditionalidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentryadditionalidentifiertype.addCoding(catalogentryadditionalidentifiertypecoding);

		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgCd() != null) {
			catalogentryadditionalidentifiertypecoding.setCode(c.getCatalogEntryAddtnlIdTypCdgCd());
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgDsply() != null) {
			catalogentryadditionalidentifiertypecoding.setDisplay(c.getCatalogEntryAddtnlIdTypCdgDsply());
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgSys() != null) {
			catalogentryadditionalidentifiertypecoding.setSystem(c.getCatalogEntryAddtnlIdTypCdgSys());
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgUsrSltd() != null) {
			catalogentryadditionalidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryAddtnlIdTypCdgUsrSltd()));
		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgVrsn() != null) {
			catalogentryadditionalidentifiertypecoding.setVersion(c.getCatalogEntryAddtnlIdTypCdgVrsn());
		}
		/******************** CatalogEntry_AddtnlId_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypTxt() != null) {
			catalogentryadditionalidentifiertype.setText(c.getCatalogEntryAddtnlIdTypTxt());
		}
		/******************** catalogentryadditionalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory catalogentryadditionalidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		catalogentryadditionalidentifier.setUse(catalogentryadditionalidentifieruse.fromCode(c.getCatalogEntryAddtnlIdUse()));

		/******************** CatalogEntry_AddtnlId_Vl ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdVl() != null) {
			catalogentryadditionalidentifier.setValue(c.getCatalogEntryAddtnlIdVl());
		}
		/******************** catalogentryclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentry.addClassification(catalogentryclassification);

		/******************** catalogentryclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentryclassification.addCoding(catalogentryclassificationcoding);

		/******************** CatalogEntry_Clsfctn_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgCd() != null) {
			catalogentryclassificationcoding.setCode(c.getCatalogEntryClsfctnCdgCd());
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgDsply() != null) {
			catalogentryclassificationcoding.setDisplay(c.getCatalogEntryClsfctnCdgDsply());
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgSys() != null) {
			catalogentryclassificationcoding.setSystem(c.getCatalogEntryClsfctnCdgSys());
		}
		/******************** CatalogEntry_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgUsrSltd() != null) {
			catalogentryclassificationcoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryClsfctnCdgUsrSltd()));
		}
		/******************** CatalogEntry_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgVrsn() != null) {
			catalogentryclassificationcoding.setVersion(c.getCatalogEntryClsfctnCdgVrsn());
		}
		/******************** CatalogEntry_Clsfctn_Txt ********************************************************************************/
		if(c.getCatalogEntryClsfctnTxt() != null) {
			catalogentryclassification.setText(c.getCatalogEntryClsfctnTxt());
		}
		/******************** catalogentryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier catalogentryidentifier =  new org.hl7.fhir.r4.model.Identifier();
		catalogentry.addIdentifier(catalogentryidentifier);

		/******************** CatalogEntry_Id_Assigner ********************************************************************************/
		if(c.getCatalogEntryIdAssigner() != null) {
			catalogentryidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCatalogEntryIdAssigner()));
		}
		/******************** catalogentryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		catalogentryidentifier.setPeriod(catalogentryidentifierperiod);

		/******************** CatalogEntry_Id_Prd_End ********************************************************************************/
		if(c.getCatalogEntryIdPrdEnd() != null) {
			java.text.SimpleDateFormat CatalogEntry_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_Id_Prd_Enddate = CatalogEntry_Id_Prd_Endsdf.parse(c.getCatalogEntryIdPrdEnd());
			catalogentryidentifierperiod.setEnd(CatalogEntry_Id_Prd_Enddate);
		}
		/******************** CatalogEntry_Id_Prd_Strt ********************************************************************************/
		if(c.getCatalogEntryIdPrdStrt() != null) {
			java.text.SimpleDateFormat CatalogEntry_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_Id_Prd_Strtdate = CatalogEntry_Id_Prd_Strtsdf.parse(c.getCatalogEntryIdPrdStrt());
			catalogentryidentifierperiod.setStart(CatalogEntry_Id_Prd_Strtdate);
		}
		/******************** CatalogEntry_Id_Sys ********************************************************************************/
		if(c.getCatalogEntryIdSys() != null) {
			catalogentryidentifier.setSystem(c.getCatalogEntryIdSys());
		}
		/******************** catalogentryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentryidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentryidentifier.setType(catalogentryidentifiertype);

		/******************** catalogentryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentryidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentryidentifiertype.addCoding(catalogentryidentifiertypecoding);

		/******************** CatalogEntry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgCd() != null) {
			catalogentryidentifiertypecoding.setCode(c.getCatalogEntryIdTypCdgCd());
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgDsply() != null) {
			catalogentryidentifiertypecoding.setDisplay(c.getCatalogEntryIdTypCdgDsply());
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgSys() != null) {
			catalogentryidentifiertypecoding.setSystem(c.getCatalogEntryIdTypCdgSys());
		}
		/******************** CatalogEntry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgUsrSltd() != null) {
			catalogentryidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryIdTypCdgUsrSltd()));
		}
		/******************** CatalogEntry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgVrsn() != null) {
			catalogentryidentifiertypecoding.setVersion(c.getCatalogEntryIdTypCdgVrsn());
		}
		/******************** CatalogEntry_Id_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryIdTypTxt() != null) {
			catalogentryidentifiertype.setText(c.getCatalogEntryIdTypTxt());
		}
		/******************** catalogentryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory catalogentryidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		catalogentryidentifier.setUse(catalogentryidentifieruse.fromCode(c.getCatalogEntryIdUse()));

		/******************** CatalogEntry_Id_Vl ********************************************************************************/
		if(c.getCatalogEntryIdVl() != null) {
			catalogentryidentifier.setValue(c.getCatalogEntryIdVl());
		}
		/******************** CatalogEntry_LastUpdated ********************************************************************************/
		if(c.getCatalogEntryLastUpdated() != null) {
			java.text.SimpleDateFormat CatalogEntry_LastUpdatedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_LastUpdateddate = CatalogEntry_LastUpdatedsdf.parse(c.getCatalogEntryLastUpdated());
			catalogentry.setLastUpdated(CatalogEntry_LastUpdateddate);
		}
		/******************** CatalogEntry_Ordrable ********************************************************************************/
		if(c.getCatalogEntryOrdrable() != null) {
			catalogentry.setOrderable(Boolean.parseBoolean(c.getCatalogEntryOrdrable()));
		}
		/******************** CatalogEntry_RfrncdItm ********************************************************************************/
		if(c.getCatalogEntryRfrncdItm() != null) {
			catalogentry.setReferencedItem( new org.hl7.fhir.r4.model.Reference(c.getCatalogEntryRfrncdItm()));
		}
		/******************** catalogentryrelatedentry ********************************************************************************/
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent catalogentryrelatedentry =  new org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent();
		catalogentry.addRelatedEntry(catalogentryrelatedentry);

		/******************** CatalogEntry_RltedEntry_Itm ********************************************************************************/
		if(c.getCatalogEntryRltedEntryItm() != null) {
			catalogentryrelatedentry.setItem( new org.hl7.fhir.r4.model.Reference(c.getCatalogEntryRltedEntryItm()));
		}
		/******************** catalogentryrelatedentryrelationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationTypeEnumFactory catalogentryrelatedentryrelationtype =  new org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationTypeEnumFactory();
		catalogentryrelatedentry.setRelationtype(catalogentryrelatedentryrelationtype.fromCode(c.getCatalogEntryRltedEntryRelationtype()));

		/******************** catalogentrystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory catalogentrystatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		catalogentry.setStatus(catalogentrystatus.fromCode(c.getCatalogEntrySts()));

		/******************** catalogentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept catalogentrytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		catalogentry.setType(catalogentrytype);

		/******************** catalogentrytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding catalogentrytypecoding =  new org.hl7.fhir.r4.model.Coding();
		catalogentrytype.addCoding(catalogentrytypecoding);

		/******************** CatalogEntry_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryTypCdgCd() != null) {
			catalogentrytypecoding.setCode(c.getCatalogEntryTypCdgCd());
		}
		/******************** CatalogEntry_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryTypCdgDsply() != null) {
			catalogentrytypecoding.setDisplay(c.getCatalogEntryTypCdgDsply());
		}
		/******************** CatalogEntry_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryTypCdgSys() != null) {
			catalogentrytypecoding.setSystem(c.getCatalogEntryTypCdgSys());
		}
		/******************** CatalogEntry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryTypCdgUsrSltd() != null) {
			catalogentrytypecoding.setUserSelected(Boolean.parseBoolean(c.getCatalogEntryTypCdgUsrSltd()));
		}
		/******************** CatalogEntry_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryTypCdgVrsn() != null) {
			catalogentrytypecoding.setVersion(c.getCatalogEntryTypCdgVrsn());
		}
		/******************** CatalogEntry_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryTypTxt() != null) {
			catalogentrytype.setText(c.getCatalogEntryTypTxt());
		}
		/******************** CatalogEntry_ValidTo ********************************************************************************/
		if(c.getCatalogEntryValidTo() != null) {
			java.text.SimpleDateFormat CatalogEntry_ValidTosdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_ValidTodate = CatalogEntry_ValidTosdf.parse(c.getCatalogEntryValidTo());
			catalogentry.setValidTo(CatalogEntry_ValidTodate);
		}
		/******************** catalogentryvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period catalogentryvalidityperiod =  new org.hl7.fhir.r4.model.Period();
		catalogentry.setValidityPeriod(catalogentryvalidityperiod);

		/******************** CatalogEntry_ValidityPrd_End ********************************************************************************/
		if(c.getCatalogEntryValidityPrdEnd() != null) {
			java.text.SimpleDateFormat CatalogEntry_ValidityPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_ValidityPrd_Enddate = CatalogEntry_ValidityPrd_Endsdf.parse(c.getCatalogEntryValidityPrdEnd());
			catalogentryvalidityperiod.setEnd(CatalogEntry_ValidityPrd_Enddate);
		}
		/******************** CatalogEntry_ValidityPrd_Strt ********************************************************************************/
		if(c.getCatalogEntryValidityPrdStrt() != null) {
			java.text.SimpleDateFormat CatalogEntry_ValidityPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CatalogEntry_ValidityPrd_Strtdate = CatalogEntry_ValidityPrd_Strtsdf.parse(c.getCatalogEntryValidityPrdStrt());
			catalogentryvalidityperiod.setStart(CatalogEntry_ValidityPrd_Strtdate);
		}
		return catalogentry;
	}
}
