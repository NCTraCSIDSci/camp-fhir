package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPackaged;
public class MedicinalProductPackagedConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductPackaged MedicinalProductPackageds(MedicinalProductPackaged m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductPackaged medicinalproductpackaged = new org.hl7.fhir.r4.model.MedicinalProductPackaged();

		/******************** id ********************************************************************************/
		medicinalproductpackaged.setId(m.getId());

		/******************** medicinalproductpackagedbatchidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent medicinalproductpackagedbatchidentifier =  new org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent();
		medicinalproductpackaged.addBatchIdentifier(medicinalproductpackagedbatchidentifier);

		/******************** medicinalproductpackagedbatchidentifierimmediatepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierimmediatepackaging =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpackagedbatchidentifier.setImmediatePackaging(medicinalproductpackagedbatchidentifierimmediatepackaging);

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackaging.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner()));
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierimmediatepackagingperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedbatchidentifierimmediatepackaging.setPeriod(medicinalproductpackagedbatchidentifierimmediatepackagingperiod);

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Enddate = MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Endsdf.parse(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd());
			medicinalproductpackagedbatchidentifierimmediatepackagingperiod.setEnd(MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Enddate);
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strtdate = MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strtsdf.parse(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt());
			medicinalproductpackagedbatchidentifierimmediatepackagingperiod.setStart(MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingSys() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackaging.setSystem(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingSys());
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierimmediatepackagingtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedbatchidentifierimmediatepackaging.setType(medicinalproductpackagedbatchidentifierimmediatepackagingtype);

		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedbatchidentifierimmediatepackagingtype.addCoding(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding);

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.setCode(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.setDisplay(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.setSystem(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.setVersion(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackagingtype.setText(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt());
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpackagedbatchidentifierimmediatepackaginguse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpackagedbatchidentifierimmediatepackaging.setUse(medicinalproductpackagedbatchidentifierimmediatepackaginguse.fromCode(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingUse()));

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingVl() != null) {
			medicinalproductpackagedbatchidentifierimmediatepackaging.setValue(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingVl());
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierouterpackaging =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpackagedbatchidentifier.setOuterPackaging(medicinalproductpackagedbatchidentifierouterpackaging);

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingAssigner() != null) {
			medicinalproductpackagedbatchidentifierouterpackaging.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedBatchIdOuterPackagingAssigner()));
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierouterpackagingperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedbatchidentifierouterpackaging.setPeriod(medicinalproductpackagedbatchidentifierouterpackagingperiod);

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Enddate = MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Endsdf.parse(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd());
			medicinalproductpackagedbatchidentifierouterpackagingperiod.setEnd(MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Enddate);
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strtdate = MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strtsdf.parse(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt());
			medicinalproductpackagedbatchidentifierouterpackagingperiod.setStart(MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingSys() != null) {
			medicinalproductpackagedbatchidentifierouterpackaging.setSystem(m.getMdcnlPrdctPckgedBatchIdOuterPackagingSys());
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierouterpackagingtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedbatchidentifierouterpackaging.setType(medicinalproductpackagedbatchidentifierouterpackagingtype);

		/******************** medicinalproductpackagedbatchidentifierouterpackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedbatchidentifierouterpackagingtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedbatchidentifierouterpackagingtype.addCoding(medicinalproductpackagedbatchidentifierouterpackagingtypecoding);

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtypecoding.setCode(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtypecoding.setDisplay(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtypecoding.setSystem(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtypecoding.setVersion(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt() != null) {
			medicinalproductpackagedbatchidentifierouterpackagingtype.setText(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt());
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpackagedbatchidentifierouterpackaginguse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpackagedbatchidentifierouterpackaging.setUse(medicinalproductpackagedbatchidentifierouterpackaginguse.fromCode(m.getMdcnlPrdctPckgedBatchIdOuterPackagingUse()));

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingVl() != null) {
			medicinalproductpackagedbatchidentifierouterpackaging.setValue(m.getMdcnlPrdctPckgedBatchIdOuterPackagingVl());
		}
		/******************** MdcnlPrdctPckged_Dscrptn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedDscrptn() != null) {
			medicinalproductpackaged.setDescription(m.getMdcnlPrdctPckgedDscrptn());
		}
		/******************** medicinalproductpackagedidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpackaged.addIdentifier(medicinalproductpackagedidentifier);

		/******************** MdcnlPrdctPckged_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdAssigner() != null) {
			medicinalproductpackagedidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedIdAssigner()));
		}
		/******************** medicinalproductpackagedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedidentifier.setPeriod(medicinalproductpackagedidentifierperiod);

		/******************** MdcnlPrdctPckged_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_Id_Prd_Enddate = MdcnlPrdctPckged_Id_Prd_Endsdf.parse(m.getMdcnlPrdctPckgedIdPrdEnd());
			medicinalproductpackagedidentifierperiod.setEnd(MdcnlPrdctPckged_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctPckged_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_Id_Prd_Strtdate = MdcnlPrdctPckged_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctPckgedIdPrdStrt());
			medicinalproductpackagedidentifierperiod.setStart(MdcnlPrdctPckged_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPckged_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdSys() != null) {
			medicinalproductpackagedidentifier.setSystem(m.getMdcnlPrdctPckgedIdSys());
		}
		/******************** medicinalproductpackagedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedidentifier.setType(medicinalproductpackagedidentifiertype);

		/******************** medicinalproductpackagedidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedidentifiertype.addCoding(medicinalproductpackagedidentifiertypecoding);

		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgCd() != null) {
			medicinalproductpackagedidentifiertypecoding.setCode(m.getMdcnlPrdctPckgedIdTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgDsply() != null) {
			medicinalproductpackagedidentifiertypecoding.setDisplay(m.getMdcnlPrdctPckgedIdTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgSys() != null) {
			medicinalproductpackagedidentifiertypecoding.setSystem(m.getMdcnlPrdctPckgedIdTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgUsrSltd() != null) {
			medicinalproductpackagedidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgVrsn() != null) {
			medicinalproductpackagedidentifiertypecoding.setVersion(m.getMdcnlPrdctPckgedIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypTxt() != null) {
			medicinalproductpackagedidentifiertype.setText(m.getMdcnlPrdctPckgedIdTypTxt());
		}
		/******************** medicinalproductpackagedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpackagedidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpackagedidentifier.setUse(medicinalproductpackagedidentifieruse.fromCode(m.getMdcnlPrdctPckgedIdUse()));

		/******************** MdcnlPrdctPckged_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdVl() != null) {
			medicinalproductpackagedidentifier.setValue(m.getMdcnlPrdctPckgedIdVl());
		}
		/******************** medicinalproductpackagedlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedlegalstatusofsupply =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackaged.setLegalStatusOfSupply(medicinalproductpackagedlegalstatusofsupply);

		/******************** medicinalproductpackagedlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedlegalstatusofsupplycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedlegalstatusofsupply.addCoding(medicinalproductpackagedlegalstatusofsupplycoding);

		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgCd() != null) {
			medicinalproductpackagedlegalstatusofsupplycoding.setCode(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgCd());
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply() != null) {
			medicinalproductpackagedlegalstatusofsupplycoding.setDisplay(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply());
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgSys() != null) {
			medicinalproductpackagedlegalstatusofsupplycoding.setSystem(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgSys());
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd() != null) {
			medicinalproductpackagedlegalstatusofsupplycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn() != null) {
			medicinalproductpackagedlegalstatusofsupplycoding.setVersion(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt() != null) {
			medicinalproductpackagedlegalstatusofsupply.setText(m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt());
		}
		/******************** MdcnlPrdctPckged_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctPckgedManufacturer() != null) {
			medicinalproductpackaged.addManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedManufacturer()));
		}
		/******************** MdcnlPrdctPckged_MarketingAthztn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingAthztn() != null) {
			medicinalproductpackaged.setMarketingAuthorization( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedMarketingAthztn()));
		}
		/******************** medicinalproductpackagedmarketingstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MarketingStatus medicinalproductpackagedmarketingstatus =  new org.hl7.fhir.r4.model.MarketingStatus();
		medicinalproductpackaged.addMarketingStatus(medicinalproductpackagedmarketingstatus);

		/******************** medicinalproductpackagedmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatuscountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedmarketingstatus.setCountry(medicinalproductpackagedmarketingstatuscountry);

		/******************** medicinalproductpackagedmarketingstatuscountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatuscountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedmarketingstatuscountry.addCoding(medicinalproductpackagedmarketingstatuscountrycoding);

		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgCd() != null) {
			medicinalproductpackagedmarketingstatuscountrycoding.setCode(m.getMdcnlPrdctPckgedMarketingStsCntryCdgCd());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgDsply() != null) {
			medicinalproductpackagedmarketingstatuscountrycoding.setDisplay(m.getMdcnlPrdctPckgedMarketingStsCntryCdgDsply());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgSys() != null) {
			medicinalproductpackagedmarketingstatuscountrycoding.setSystem(m.getMdcnlPrdctPckgedMarketingStsCntryCdgSys());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd() != null) {
			medicinalproductpackagedmarketingstatuscountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgVrsn() != null) {
			medicinalproductpackagedmarketingstatuscountrycoding.setVersion(m.getMdcnlPrdctPckgedMarketingStsCntryCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryTxt() != null) {
			medicinalproductpackagedmarketingstatuscountry.setText(m.getMdcnlPrdctPckgedMarketingStsCntryTxt());
		}
		/******************** medicinalproductpackagedmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedmarketingstatusdaterange =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedmarketingstatus.setDateRange(medicinalproductpackagedmarketingstatusdaterange);

		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsDtRngEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_MarketingSts_DtRng_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_MarketingSts_DtRng_Enddate = MdcnlPrdctPckged_MarketingSts_DtRng_Endsdf.parse(m.getMdcnlPrdctPckgedMarketingStsDtRngEnd());
			medicinalproductpackagedmarketingstatusdaterange.setEnd(MdcnlPrdctPckged_MarketingSts_DtRng_Enddate);
		}
		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsDtRngStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_MarketingSts_DtRng_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_MarketingSts_DtRng_Strtdate = MdcnlPrdctPckged_MarketingSts_DtRng_Strtsdf.parse(m.getMdcnlPrdctPckgedMarketingStsDtRngStrt());
			medicinalproductpackagedmarketingstatusdaterange.setStart(MdcnlPrdctPckged_MarketingSts_DtRng_Strtdate);
		}
		/******************** medicinalproductpackagedmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedmarketingstatus.setJurisdiction(medicinalproductpackagedmarketingstatusjurisdiction);

		/******************** medicinalproductpackagedmarketingstatusjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatusjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedmarketingstatusjurisdiction.addCoding(medicinalproductpackagedmarketingstatusjurisdictioncoding);

		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd() != null) {
			medicinalproductpackagedmarketingstatusjurisdictioncoding.setCode(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply() != null) {
			medicinalproductpackagedmarketingstatusjurisdictioncoding.setDisplay(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys() != null) {
			medicinalproductpackagedmarketingstatusjurisdictioncoding.setSystem(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd() != null) {
			medicinalproductpackagedmarketingstatusjurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn() != null) {
			medicinalproductpackagedmarketingstatusjurisdictioncoding.setVersion(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnTxt() != null) {
			medicinalproductpackagedmarketingstatusjurisdiction.setText(m.getMdcnlPrdctPckgedMarketingStsJrsdctnTxt());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsRestoreDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_MarketingSts_RestoreDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_MarketingSts_RestoreDtdate = MdcnlPrdctPckged_MarketingSts_RestoreDtsdf.parse(m.getMdcnlPrdctPckgedMarketingStsRestoreDt());
			medicinalproductpackagedmarketingstatus.setRestoreDate(MdcnlPrdctPckged_MarketingSts_RestoreDtdate);
		}
		/******************** medicinalproductpackagedmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedmarketingstatus.setStatus(medicinalproductpackagedmarketingstatusstatus);

		/******************** medicinalproductpackagedmarketingstatusstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatusstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedmarketingstatusstatus.addCoding(medicinalproductpackagedmarketingstatusstatuscoding);

		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgCd() != null) {
			medicinalproductpackagedmarketingstatusstatuscoding.setCode(m.getMdcnlPrdctPckgedMarketingStsStsCdgCd());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgDsply() != null) {
			medicinalproductpackagedmarketingstatusstatuscoding.setDisplay(m.getMdcnlPrdctPckgedMarketingStsStsCdgDsply());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgSys() != null) {
			medicinalproductpackagedmarketingstatusstatuscoding.setSystem(m.getMdcnlPrdctPckgedMarketingStsStsCdgSys());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd() != null) {
			medicinalproductpackagedmarketingstatusstatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgVrsn() != null) {
			medicinalproductpackagedmarketingstatusstatuscoding.setVersion(m.getMdcnlPrdctPckgedMarketingStsStsCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsTxt() != null) {
			medicinalproductpackagedmarketingstatusstatus.setText(m.getMdcnlPrdctPckgedMarketingStsStsTxt());
		}
		/******************** medicinalproductpackagedpackageitem ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent medicinalproductpackagedpackageitem =  new org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent();
		medicinalproductpackaged.addPackageItem(medicinalproductpackagedpackageitem);

		/******************** medicinalproductpackagedpackageitemalternatematerial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemalternatematerial =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitem.addAlternateMaterial(medicinalproductpackagedpackageitemalternatematerial);

		/******************** medicinalproductpackagedpackageitemalternatematerialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemalternatematerialcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemalternatematerial.addCoding(medicinalproductpackagedpackageitemalternatematerialcoding);

		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd() != null) {
			medicinalproductpackagedpackageitemalternatematerialcoding.setCode(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply() != null) {
			medicinalproductpackagedpackageitemalternatematerialcoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys() != null) {
			medicinalproductpackagedpackageitemalternatematerialcoding.setSystem(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemalternatematerialcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn() != null) {
			medicinalproductpackagedpackageitemalternatematerialcoding.setVersion(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlTxt() != null) {
			medicinalproductpackagedpackageitemalternatematerial.setText(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlTxt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Dvc ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmDvc() != null) {
			medicinalproductpackagedpackageitem.addDevice( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedPckgItmDvc()));
		}
		/******************** medicinalproductpackagedpackageitemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedpackageitemidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpackagedpackageitem.addIdentifier(medicinalproductpackagedpackageitemidentifier);

		/******************** MdcnlPrdctPckged_PckgItm_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdAssigner() != null) {
			medicinalproductpackagedpackageitemidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedPckgItmIdAssigner()));
		}
		/******************** medicinalproductpackagedpackageitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedpackageitemidentifier.setPeriod(medicinalproductpackagedpackageitemidentifierperiod);

		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_PckgItm_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_PckgItm_Id_Prd_Enddate = MdcnlPrdctPckged_PckgItm_Id_Prd_Endsdf.parse(m.getMdcnlPrdctPckgedPckgItmIdPrdEnd());
			medicinalproductpackagedpackageitemidentifierperiod.setEnd(MdcnlPrdctPckged_PckgItm_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_PckgItm_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_PckgItm_Id_Prd_Strtdate = MdcnlPrdctPckged_PckgItm_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctPckgedPckgItmIdPrdStrt());
			medicinalproductpackagedpackageitemidentifierperiod.setStart(MdcnlPrdctPckged_PckgItm_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdSys() != null) {
			medicinalproductpackagedpackageitemidentifier.setSystem(m.getMdcnlPrdctPckgedPckgItmIdSys());
		}
		/******************** medicinalproductpackagedpackageitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitemidentifier.setType(medicinalproductpackagedpackageitemidentifiertype);

		/******************** medicinalproductpackagedpackageitemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemidentifiertype.addCoding(medicinalproductpackagedpackageitemidentifiertypecoding);

		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd() != null) {
			medicinalproductpackagedpackageitemidentifiertypecoding.setCode(m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply() != null) {
			medicinalproductpackagedpackageitemidentifiertypecoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys() != null) {
			medicinalproductpackagedpackageitemidentifiertypecoding.setSystem(m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn() != null) {
			medicinalproductpackagedpackageitemidentifiertypecoding.setVersion(m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypTxt() != null) {
			medicinalproductpackagedpackageitemidentifiertype.setText(m.getMdcnlPrdctPckgedPckgItmIdTypTxt());
		}
		/******************** medicinalproductpackagedpackageitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpackagedpackageitemidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpackagedpackageitemidentifier.setUse(medicinalproductpackagedpackageitemidentifieruse.fromCode(m.getMdcnlPrdctPckgedPckgItmIdUse()));

		/******************** MdcnlPrdctPckged_PckgItm_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdVl() != null) {
			medicinalproductpackagedpackageitemidentifier.setValue(m.getMdcnlPrdctPckgedPckgItmIdVl());
		}
		/******************** MdcnlPrdctPckged_PckgItm_MnfctredItm ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMnfctredItm() != null) {
			medicinalproductpackagedpackageitem.addManufacturedItem( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedPckgItmMnfctredItm()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmManufacturer() != null) {
			medicinalproductpackagedpackageitem.addManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedPckgItmManufacturer()));
		}
		/******************** medicinalproductpackagedpackageitemmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemmaterial =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitem.addMaterial(medicinalproductpackagedpackageitemmaterial);

		/******************** medicinalproductpackagedpackageitemmaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemmaterialcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemmaterial.addCoding(medicinalproductpackagedpackageitemmaterialcoding);

		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd() != null) {
			medicinalproductpackagedpackageitemmaterialcoding.setCode(m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply() != null) {
			medicinalproductpackagedpackageitemmaterialcoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys() != null) {
			medicinalproductpackagedpackageitemmaterialcoding.setSystem(m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemmaterialcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn() != null) {
			medicinalproductpackagedpackageitemmaterialcoding.setVersion(m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlTxt() != null) {
			medicinalproductpackagedpackageitemmaterial.setText(m.getMdcnlPrdctPckgedPckgItmMtrlTxt());
		}
		/******************** medicinalproductpackagedpackageitemothercharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemothercharacteristics =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitem.addOtherCharacteristics(medicinalproductpackagedpackageitemothercharacteristics);

		/******************** medicinalproductpackagedpackageitemothercharacteristicscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemothercharacteristicscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemothercharacteristics.addCoding(medicinalproductpackagedpackageitemothercharacteristicscoding);

		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd() != null) {
			medicinalproductpackagedpackageitemothercharacteristicscoding.setCode(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply() != null) {
			medicinalproductpackagedpackageitemothercharacteristicscoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys() != null) {
			medicinalproductpackagedpackageitemothercharacteristicscoding.setSystem(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemothercharacteristicscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn() != null) {
			medicinalproductpackagedpackageitemothercharacteristicscoding.setVersion(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt() != null) {
			medicinalproductpackagedpackageitemothercharacteristics.setText(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductpackagedpackageitemphysicalcharacteristics =  new org.hl7.fhir.r4.model.ProdCharacteristic();
		medicinalproductpackagedpackageitem.setPhysicalCharacteristics(medicinalproductpackagedpackageitemphysicalcharacteristics);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Color ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristics.addColor(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsdepth =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setDepth(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl())));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setExternalDiameter(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl())));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsheight =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setHeight(medicinalproductpackagedpackageitemphysicalcharacteristicsheight);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsheight.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicsheight.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsheight.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsheight.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsheight.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl())));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment medicinalproductpackagedpackageitemphysicalcharacteristicsimage =  new org.hl7.fhir.r4.model.Attachment();
		medicinalproductpackagedpackageitemphysicalcharacteristics.addImage(medicinalproductpackagedpackageitemphysicalcharacteristicsimage);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setContentType(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creationdate = MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creationsdf.parse(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation());
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setCreation(MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creationdate);
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setLanguage(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setSize(Integer.parseInt(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setTitle(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsimage.setUrl(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristics.addImprint(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setNominalVolume(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl())));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemphysicalcharacteristicsscoring =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setScoring(medicinalproductpackagedpackageitemphysicalcharacteristicsscoring);

		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.addCoding(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.setVersion(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.setText(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Shape ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristics.setShape(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsweight =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setWeight(medicinalproductpackagedpackageitemphysicalcharacteristicsweight);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsweight.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicsweight.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsweight.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsweight.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicsweight.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl())));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicswidth =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemphysicalcharacteristics.setWidth(medicinalproductpackagedpackageitemphysicalcharacteristicswidth);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicswidth.setCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd());
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemphysicalcharacteristicswidth.setComparator(medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicswidth.setSystem(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicswidth.setUnit(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl() != null) {
			medicinalproductpackagedpackageitemphysicalcharacteristicswidth.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl())));
		}
		/******************** medicinalproductpackagedpackageitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitem.setQuantity(medicinalproductpackagedpackageitemquantity);

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyCd() != null) {
			medicinalproductpackagedpackageitemquantity.setCode(m.getMdcnlPrdctPckgedPckgItmQntyCd());
		}
		/******************** medicinalproductpackagedpackageitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemquantity.setComparator(medicinalproductpackagedpackageitemquantitycomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmQntyCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntySys() != null) {
			medicinalproductpackagedpackageitemquantity.setSystem(m.getMdcnlPrdctPckgedPckgItmQntySys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyUnt() != null) {
			medicinalproductpackagedpackageitemquantity.setUnit(m.getMdcnlPrdctPckgedPckgItmQntyUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyVl() != null) {
			medicinalproductpackagedpackageitemquantity.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmQntyVl())));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorage ********************************************************************************/
		org.hl7.fhir.r4.model.ProductShelfLife medicinalproductpackagedpackageitemshelflifestorage =  new org.hl7.fhir.r4.model.ProductShelfLife();
		medicinalproductpackagedpackageitem.addShelfLifeStorage(medicinalproductpackagedpackageitemshelflifestorage);

		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedpackageitemshelflifestorageidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpackagedpackageitemshelflifestorage.setIdentifier(medicinalproductpackagedpackageitemshelflifestorageidentifier);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemshelflifestorageidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpackagedpackageitemshelflifestorageidentifier.setPeriod(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Enddate = MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Endsdf.parse(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd());
			medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.setEnd(MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strtdate = MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt());
			medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.setStart(MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifier.setSystem(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys());
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestorageidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitemshelflifestorageidentifier.setType(medicinalproductpackagedpackageitemshelflifestorageidentifiertype);

		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemshelflifestorageidentifiertype.addCoding(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.setCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.setSystem(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.setVersion(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifiertype.setText(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt());
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpackagedpackageitemshelflifestorageidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpackagedpackageitemshelflifestorageidentifier.setUse(medicinalproductpackagedpackageitemshelflifestorageidentifieruse.fromCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse()));

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl() != null) {
			medicinalproductpackagedpackageitemshelflifestorageidentifier.setValue(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl());
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemshelflifestorageperiod =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpackagedpackageitemshelflifestorage.setPeriod(medicinalproductpackagedpackageitemshelflifestorageperiod);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd() != null) {
			medicinalproductpackagedpackageitemshelflifestorageperiod.setCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd());
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpackagedpackageitemshelflifestorageperiodcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpackagedpackageitemshelflifestorageperiod.setComparator(medicinalproductpackagedpackageitemshelflifestorageperiodcomparator.fromCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr()));

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys() != null) {
			medicinalproductpackagedpackageitemshelflifestorageperiod.setSystem(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt() != null) {
			medicinalproductpackagedpackageitemshelflifestorageperiod.setUnit(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl() != null) {
			medicinalproductpackagedpackageitemshelflifestorageperiod.setValue(Double.parseDouble((m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl())));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitemshelflifestorage.addSpecialPrecautionsForStorage(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage);

		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.addCoding(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.setCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.setSystem(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.setVersion(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt() != null) {
			medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.setText(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt());
		}
		/******************** medicinalproductpackagedpackageitemshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestoragetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitemshelflifestorage.setType(medicinalproductpackagedpackageitemshelflifestoragetype);

		/******************** medicinalproductpackagedpackageitemshelflifestoragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestoragetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemshelflifestoragetype.addCoding(medicinalproductpackagedpackageitemshelflifestoragetypecoding);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetypecoding.setCode(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetypecoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetypecoding.setSystem(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetypecoding.setVersion(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt() != null) {
			medicinalproductpackagedpackageitemshelflifestoragetype.setText(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt());
		}
		/******************** medicinalproductpackagedpackageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpackagedpackageitem.setType(medicinalproductpackagedpackageitemtype);

		/******************** medicinalproductpackagedpackageitemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpackagedpackageitemtype.addCoding(medicinalproductpackagedpackageitemtypecoding);

		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgCd() != null) {
			medicinalproductpackagedpackageitemtypecoding.setCode(m.getMdcnlPrdctPckgedPckgItmTypCdgCd());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgDsply() != null) {
			medicinalproductpackagedpackageitemtypecoding.setDisplay(m.getMdcnlPrdctPckgedPckgItmTypCdgDsply());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgSys() != null) {
			medicinalproductpackagedpackageitemtypecoding.setSystem(m.getMdcnlPrdctPckgedPckgItmTypCdgSys());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgUsrSltd() != null) {
			medicinalproductpackagedpackageitemtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPckgedPckgItmTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgVrsn() != null) {
			medicinalproductpackagedpackageitemtypecoding.setVersion(m.getMdcnlPrdctPckgedPckgItmTypCdgVrsn());
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypTxt() != null) {
			medicinalproductpackagedpackageitemtype.setText(m.getMdcnlPrdctPckgedPckgItmTypTxt());
		}
		/******************** MdcnlPrdctPckged_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctPckgedSbjct() != null) {
			medicinalproductpackaged.addSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedSbjct()));
		}
		return medicinalproductpackaged;
	}
}
