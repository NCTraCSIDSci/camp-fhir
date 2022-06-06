package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentManifest;
public class DocumentManifestConversion 
{
	public org.hl7.fhir.r4.model.DocumentManifest DocumentManifests(DocumentManifest d) throws ParseException
	{
		org.hl7.fhir.r4.model.DocumentManifest documentmanifest = new org.hl7.fhir.r4.model.DocumentManifest();

		/******************** id ********************************************************************************/
		documentmanifest.setId(d.getId());

		/******************** DocManifest_Athr ********************************************************************************/
		if(d.getDocManifestAthr() != null) {
			documentmanifest.addAuthor( new org.hl7.fhir.r4.model.Reference(d.getDocManifestAthr()));
		}
		/******************** DocManifest_Cntnt ********************************************************************************/
		if(d.getDocManifestCntnt() != null) {
			documentmanifest.addContent( new org.hl7.fhir.r4.model.Reference(d.getDocManifestCntnt()));
		}
		/******************** DocManifest_Created ********************************************************************************/
		if(d.getDocManifestCreated() != null) {
			java.text.SimpleDateFormat DocManifest_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_Createddate = DocManifest_Createdsdf.parse(d.getDocManifestCreated());
			documentmanifest.setCreated(DocManifest_Createddate);
		}
		/******************** DocManifest_Dscrptn ********************************************************************************/
		if(d.getDocManifestDscrptn() != null) {
			documentmanifest.setDescription(d.getDocManifestDscrptn());
		}
		/******************** documentmanifestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		documentmanifest.addIdentifier(documentmanifestidentifier);

		/******************** DocManifest_Id_Assigner ********************************************************************************/
		if(d.getDocManifestIdAssigner() != null) {
			documentmanifestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDocManifestIdAssigner()));
		}
		/******************** documentmanifestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		documentmanifestidentifier.setPeriod(documentmanifestidentifierperiod);

		/******************** DocManifest_Id_Prd_End ********************************************************************************/
		if(d.getDocManifestIdPrdEnd() != null) {
			java.text.SimpleDateFormat DocManifest_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_Id_Prd_Enddate = DocManifest_Id_Prd_Endsdf.parse(d.getDocManifestIdPrdEnd());
			documentmanifestidentifierperiod.setEnd(DocManifest_Id_Prd_Enddate);
		}
		/******************** DocManifest_Id_Prd_Strt ********************************************************************************/
		if(d.getDocManifestIdPrdStrt() != null) {
			java.text.SimpleDateFormat DocManifest_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_Id_Prd_Strtdate = DocManifest_Id_Prd_Strtsdf.parse(d.getDocManifestIdPrdStrt());
			documentmanifestidentifierperiod.setStart(DocManifest_Id_Prd_Strtdate);
		}
		/******************** DocManifest_Id_Sys ********************************************************************************/
		if(d.getDocManifestIdSys() != null) {
			documentmanifestidentifier.setSystem(d.getDocManifestIdSys());
		}
		/******************** documentmanifestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentmanifestidentifier.setType(documentmanifestidentifiertype);

		/******************** documentmanifestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentmanifestidentifiertype.addCoding(documentmanifestidentifiertypecoding);

		/******************** DocManifest_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestIdTypCdgCd() != null) {
			documentmanifestidentifiertypecoding.setCode(d.getDocManifestIdTypCdgCd());
		}
		/******************** DocManifest_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestIdTypCdgDsply() != null) {
			documentmanifestidentifiertypecoding.setDisplay(d.getDocManifestIdTypCdgDsply());
		}
		/******************** DocManifest_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestIdTypCdgSys() != null) {
			documentmanifestidentifiertypecoding.setSystem(d.getDocManifestIdTypCdgSys());
		}
		/******************** DocManifest_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestIdTypCdgUsrSltd() != null) {
			documentmanifestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDocManifestIdTypCdgUsrSltd()));
		}
		/******************** DocManifest_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestIdTypCdgVrsn() != null) {
			documentmanifestidentifiertypecoding.setVersion(d.getDocManifestIdTypCdgVrsn());
		}
		/******************** DocManifest_Id_Typ_Txt ********************************************************************************/
		if(d.getDocManifestIdTypTxt() != null) {
			documentmanifestidentifiertype.setText(d.getDocManifestIdTypTxt());
		}
		/******************** documentmanifestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentmanifestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		documentmanifestidentifier.setUse(documentmanifestidentifieruse.fromCode(d.getDocManifestIdUse()));

		/******************** DocManifest_Id_Vl ********************************************************************************/
		if(d.getDocManifestIdVl() != null) {
			documentmanifestidentifier.setValue(d.getDocManifestIdVl());
		}
		/******************** documentmanifestmasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestmasteridentifier =  new org.hl7.fhir.r4.model.Identifier();
		documentmanifest.setMasterIdentifier(documentmanifestmasteridentifier);

		/******************** DocManifest_MasterId_Assigner ********************************************************************************/
		if(d.getDocManifestMasterIdAssigner() != null) {
			documentmanifestmasteridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDocManifestMasterIdAssigner()));
		}
		/******************** documentmanifestmasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestmasteridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		documentmanifestmasteridentifier.setPeriod(documentmanifestmasteridentifierperiod);

		/******************** DocManifest_MasterId_Prd_End ********************************************************************************/
		if(d.getDocManifestMasterIdPrdEnd() != null) {
			java.text.SimpleDateFormat DocManifest_MasterId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_MasterId_Prd_Enddate = DocManifest_MasterId_Prd_Endsdf.parse(d.getDocManifestMasterIdPrdEnd());
			documentmanifestmasteridentifierperiod.setEnd(DocManifest_MasterId_Prd_Enddate);
		}
		/******************** DocManifest_MasterId_Prd_Strt ********************************************************************************/
		if(d.getDocManifestMasterIdPrdStrt() != null) {
			java.text.SimpleDateFormat DocManifest_MasterId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_MasterId_Prd_Strtdate = DocManifest_MasterId_Prd_Strtsdf.parse(d.getDocManifestMasterIdPrdStrt());
			documentmanifestmasteridentifierperiod.setStart(DocManifest_MasterId_Prd_Strtdate);
		}
		/******************** DocManifest_MasterId_Sys ********************************************************************************/
		if(d.getDocManifestMasterIdSys() != null) {
			documentmanifestmasteridentifier.setSystem(d.getDocManifestMasterIdSys());
		}
		/******************** documentmanifestmasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestmasteridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentmanifestmasteridentifier.setType(documentmanifestmasteridentifiertype);

		/******************** documentmanifestmasteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestmasteridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentmanifestmasteridentifiertype.addCoding(documentmanifestmasteridentifiertypecoding);

		/******************** DocManifest_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgCd() != null) {
			documentmanifestmasteridentifiertypecoding.setCode(d.getDocManifestMasterIdTypCdgCd());
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgDsply() != null) {
			documentmanifestmasteridentifiertypecoding.setDisplay(d.getDocManifestMasterIdTypCdgDsply());
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgSys() != null) {
			documentmanifestmasteridentifiertypecoding.setSystem(d.getDocManifestMasterIdTypCdgSys());
		}
		/******************** DocManifest_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgUsrSltd() != null) {
			documentmanifestmasteridentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDocManifestMasterIdTypCdgUsrSltd()));
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgVrsn() != null) {
			documentmanifestmasteridentifiertypecoding.setVersion(d.getDocManifestMasterIdTypCdgVrsn());
		}
		/******************** DocManifest_MasterId_Typ_Txt ********************************************************************************/
		if(d.getDocManifestMasterIdTypTxt() != null) {
			documentmanifestmasteridentifiertype.setText(d.getDocManifestMasterIdTypTxt());
		}
		/******************** documentmanifestmasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentmanifestmasteridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		documentmanifestmasteridentifier.setUse(documentmanifestmasteridentifieruse.fromCode(d.getDocManifestMasterIdUse()));

		/******************** DocManifest_MasterId_Vl ********************************************************************************/
		if(d.getDocManifestMasterIdVl() != null) {
			documentmanifestmasteridentifier.setValue(d.getDocManifestMasterIdVl());
		}
		/******************** DocManifest_Recipient ********************************************************************************/
		if(d.getDocManifestRecipient() != null) {
			documentmanifest.addRecipient( new org.hl7.fhir.r4.model.Reference(d.getDocManifestRecipient()));
		}
		/******************** documentmanifestrelated ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent documentmanifestrelated =  new org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent();
		documentmanifest.addRelated(documentmanifestrelated);

		/******************** documentmanifestrelatedidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestrelatedidentifier =  new org.hl7.fhir.r4.model.Identifier();
		documentmanifestrelated.setIdentifier(documentmanifestrelatedidentifier);

		/******************** DocManifest_Rlted_Id_Assigner ********************************************************************************/
		if(d.getDocManifestRltedIdAssigner() != null) {
			documentmanifestrelatedidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDocManifestRltedIdAssigner()));
		}
		/******************** documentmanifestrelatedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestrelatedidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		documentmanifestrelatedidentifier.setPeriod(documentmanifestrelatedidentifierperiod);

		/******************** DocManifest_Rlted_Id_Prd_End ********************************************************************************/
		if(d.getDocManifestRltedIdPrdEnd() != null) {
			java.text.SimpleDateFormat DocManifest_Rlted_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_Rlted_Id_Prd_Enddate = DocManifest_Rlted_Id_Prd_Endsdf.parse(d.getDocManifestRltedIdPrdEnd());
			documentmanifestrelatedidentifierperiod.setEnd(DocManifest_Rlted_Id_Prd_Enddate);
		}
		/******************** DocManifest_Rlted_Id_Prd_Strt ********************************************************************************/
		if(d.getDocManifestRltedIdPrdStrt() != null) {
			java.text.SimpleDateFormat DocManifest_Rlted_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocManifest_Rlted_Id_Prd_Strtdate = DocManifest_Rlted_Id_Prd_Strtsdf.parse(d.getDocManifestRltedIdPrdStrt());
			documentmanifestrelatedidentifierperiod.setStart(DocManifest_Rlted_Id_Prd_Strtdate);
		}
		/******************** DocManifest_Rlted_Id_Sys ********************************************************************************/
		if(d.getDocManifestRltedIdSys() != null) {
			documentmanifestrelatedidentifier.setSystem(d.getDocManifestRltedIdSys());
		}
		/******************** documentmanifestrelatedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestrelatedidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentmanifestrelatedidentifier.setType(documentmanifestrelatedidentifiertype);

		/******************** documentmanifestrelatedidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestrelatedidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentmanifestrelatedidentifiertype.addCoding(documentmanifestrelatedidentifiertypecoding);

		/******************** DocManifest_Rlted_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgCd() != null) {
			documentmanifestrelatedidentifiertypecoding.setCode(d.getDocManifestRltedIdTypCdgCd());
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgDsply() != null) {
			documentmanifestrelatedidentifiertypecoding.setDisplay(d.getDocManifestRltedIdTypCdgDsply());
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgSys() != null) {
			documentmanifestrelatedidentifiertypecoding.setSystem(d.getDocManifestRltedIdTypCdgSys());
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgUsrSltd() != null) {
			documentmanifestrelatedidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDocManifestRltedIdTypCdgUsrSltd()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgVrsn() != null) {
			documentmanifestrelatedidentifiertypecoding.setVersion(d.getDocManifestRltedIdTypCdgVrsn());
		}
		/******************** DocManifest_Rlted_Id_Typ_Txt ********************************************************************************/
		if(d.getDocManifestRltedIdTypTxt() != null) {
			documentmanifestrelatedidentifiertype.setText(d.getDocManifestRltedIdTypTxt());
		}
		/******************** documentmanifestrelatedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentmanifestrelatedidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		documentmanifestrelatedidentifier.setUse(documentmanifestrelatedidentifieruse.fromCode(d.getDocManifestRltedIdUse()));

		/******************** DocManifest_Rlted_Id_Vl ********************************************************************************/
		if(d.getDocManifestRltedIdVl() != null) {
			documentmanifestrelatedidentifier.setValue(d.getDocManifestRltedIdVl());
		}
		/******************** DocManifest_Rlted_Ref ********************************************************************************/
		if(d.getDocManifestRltedRef() != null) {
			documentmanifestrelated.setRef( new org.hl7.fhir.r4.model.Reference(d.getDocManifestRltedRef()));
		}
		/******************** DocManifest_Src ********************************************************************************/
		if(d.getDocManifestSrc() != null) {
			documentmanifest.setSource(d.getDocManifestSrc());
		}
		/******************** documentmanifeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory documentmanifeststatus =  new org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory();
		documentmanifest.setStatus(documentmanifeststatus.fromCode(d.getDocManifestSts()));

		/******************** DocManifest_Sbjct ********************************************************************************/
		if(d.getDocManifestSbjct() != null) {
			documentmanifest.setSubject( new org.hl7.fhir.r4.model.Reference(d.getDocManifestSbjct()));
		}
		/******************** documentmanifesttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifesttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentmanifest.setType(documentmanifesttype);

		/******************** documentmanifesttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifesttypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentmanifesttype.addCoding(documentmanifesttypecoding);

		/******************** DocManifest_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestTypCdgCd() != null) {
			documentmanifesttypecoding.setCode(d.getDocManifestTypCdgCd());
		}
		/******************** DocManifest_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestTypCdgDsply() != null) {
			documentmanifesttypecoding.setDisplay(d.getDocManifestTypCdgDsply());
		}
		/******************** DocManifest_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestTypCdgSys() != null) {
			documentmanifesttypecoding.setSystem(d.getDocManifestTypCdgSys());
		}
		/******************** DocManifest_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestTypCdgUsrSltd() != null) {
			documentmanifesttypecoding.setUserSelected(Boolean.parseBoolean(d.getDocManifestTypCdgUsrSltd()));
		}
		/******************** DocManifest_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestTypCdgVrsn() != null) {
			documentmanifesttypecoding.setVersion(d.getDocManifestTypCdgVrsn());
		}
		/******************** DocManifest_Typ_Txt ********************************************************************************/
		if(d.getDocManifestTypTxt() != null) {
			documentmanifesttype.setText(d.getDocManifestTypTxt());
		}
		return documentmanifest;
	}
}
