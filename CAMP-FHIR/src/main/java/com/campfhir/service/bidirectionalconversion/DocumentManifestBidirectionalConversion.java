package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentManifest;
public class DocumentManifestBidirectionalConversion 
{
	public DocumentManifest DocumentManifests(org.hl7.fhir.r4.model.DocumentManifest documentmanifest) throws ParseException
	{
		 main.java.com.campfhir.model.DocumentManifest d = new  main.java.com.campfhir.model.DocumentManifest();

		/******************** id ********************************************************************************/
		documentmanifest.setId(d.getId());

		/******************** documentmanifesttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifesttype = documentmanifest.getType();

		/******************** documentmanifesttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifesttypecoding = documentmanifesttype.getCodingFirstRep();

		/******************** DocManifest_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifesttypecoding.hasDisplay()) {
			d.setDocManifestTypCdgDsply(String.valueOf(documentmanifesttypecoding.getDisplay()));
		}
		/******************** DocManifest_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifesttypecoding.hasVersion()) {
			d.setDocManifestTypCdgVrsn(String.valueOf(documentmanifesttypecoding.getVersion()));
		}
		/******************** DocManifest_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifesttypecoding.hasCode()) {
			d.setDocManifestTypCdgCd(String.valueOf(documentmanifesttypecoding.getCode()));
		}
		/******************** DocManifest_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifesttypecoding.hasSystem()) {
			d.setDocManifestTypCdgSys(String.valueOf(documentmanifesttypecoding.getSystem()));
		}
		/******************** DocManifest_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifesttypecoding.hasUserSelected()) {
			d.setDocManifestTypCdgUsrSltd(String.valueOf(documentmanifesttypecoding.getUserSelected()));
		}
		/******************** DocManifest_Typ_Txt ********************************************************************************/
		if(documentmanifesttype.hasText()) {
			d.setDocManifestTypTxt(String.valueOf(documentmanifesttype.getText()));
		}
		/******************** DocManifest_Src ********************************************************************************/
		if(documentmanifest.hasSource()) {
			d.setDocManifestSrc(String.valueOf(documentmanifest.getSource()));
		}
		/******************** DocManifest_Recipient ********************************************************************************/
		if(documentmanifest.hasRecipient()) {
			d.setDocManifestRecipient(String.valueOf(documentmanifest.getRecipientFirstRep()));
		}
		/******************** DocManifest_Sbjct ********************************************************************************/
		if(documentmanifest.hasSubject()) {
			d.setDocManifestSbjct(String.valueOf(documentmanifest.getSubject()));
		}
		/******************** documentmanifeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus documentmanifeststatus = documentmanifest.getStatus();
		d.setDocManifestSts(documentmanifeststatus.toCode());

		/******************** DocManifest_Dscrptn ********************************************************************************/
		if(documentmanifest.hasDescription()) {
			d.setDocManifestDscrptn(String.valueOf(documentmanifest.getDescription()));
		}
		/******************** DocManifest_Created ********************************************************************************/
		if(documentmanifest.hasCreated()) {
			d.setDocManifestCreated(String.valueOf(documentmanifest.getCreated()));
		}
		/******************** documentmanifestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestidentifier = documentmanifest.getIdentifierFirstRep();

		/******************** DocManifest_Id_Vl ********************************************************************************/
		if(documentmanifestidentifier.hasValue()) {
			d.setDocManifestIdVl(String.valueOf(documentmanifestidentifier.getValue()));
		}
		/******************** documentmanifestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestidentifiertype = documentmanifestidentifier.getType();

		/******************** documentmanifestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestidentifiertypecoding = documentmanifestidentifiertype.getCodingFirstRep();

		/******************** DocManifest_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestidentifiertypecoding.hasDisplay()) {
			d.setDocManifestIdTypCdgDsply(String.valueOf(documentmanifestidentifiertypecoding.getDisplay()));
		}
		/******************** DocManifest_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestidentifiertypecoding.hasVersion()) {
			d.setDocManifestIdTypCdgVrsn(String.valueOf(documentmanifestidentifiertypecoding.getVersion()));
		}
		/******************** DocManifest_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestidentifiertypecoding.hasCode()) {
			d.setDocManifestIdTypCdgCd(String.valueOf(documentmanifestidentifiertypecoding.getCode()));
		}
		/******************** DocManifest_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestidentifiertypecoding.hasSystem()) {
			d.setDocManifestIdTypCdgSys(String.valueOf(documentmanifestidentifiertypecoding.getSystem()));
		}
		/******************** DocManifest_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestidentifiertypecoding.hasUserSelected()) {
			d.setDocManifestIdTypCdgUsrSltd(String.valueOf(documentmanifestidentifiertypecoding.getUserSelected()));
		}
		/******************** DocManifest_Id_Typ_Txt ********************************************************************************/
		if(documentmanifestidentifiertype.hasText()) {
			d.setDocManifestIdTypTxt(String.valueOf(documentmanifestidentifiertype.getText()));
		}
		/******************** DocManifest_Id_Sys ********************************************************************************/
		if(documentmanifestidentifier.hasSystem()) {
			d.setDocManifestIdSys(String.valueOf(documentmanifestidentifier.getSystem()));
		}
		/******************** DocManifest_Id_Assigner ********************************************************************************/
		if(documentmanifestidentifier.hasAssigner()) {
			d.setDocManifestIdAssigner(String.valueOf(documentmanifestidentifier.getAssigner()));
		}
		/******************** documentmanifestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestidentifierperiod = documentmanifestidentifier.getPeriod();

		/******************** DocManifest_Id_Prd_End ********************************************************************************/
		if(documentmanifestidentifierperiod.hasEnd()) {
			d.setDocManifestIdPrdEnd(String.valueOf(documentmanifestidentifierperiod.getEnd()));
		}
		/******************** DocManifest_Id_Prd_Strt ********************************************************************************/
		if(documentmanifestidentifierperiod.hasStart()) {
			d.setDocManifestIdPrdStrt(String.valueOf(documentmanifestidentifierperiod.getStart()));
		}
		/******************** documentmanifestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestidentifieruse = documentmanifestidentifier.getUse();
		d.setDocManifestIdUse(documentmanifestidentifieruse.toCode());

		/******************** DocManifest_Athr ********************************************************************************/
		if(documentmanifest.hasAuthor()) {
			d.setDocManifestAthr(String.valueOf(documentmanifest.getAuthorFirstRep()));
		}
		/******************** DocManifest_Cntnt ********************************************************************************/
		if(documentmanifest.hasContent()) {
			d.setDocManifestCntnt(String.valueOf(documentmanifest.getContentFirstRep()));
		}
		/******************** documentmanifestrelated ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent documentmanifestrelated = documentmanifest.getRelatedFirstRep();

		/******************** DocManifest_Rlted_Ref ********************************************************************************/
		if(documentmanifestrelated.hasRef()) {
			d.setDocManifestRltedRef(String.valueOf(documentmanifestrelated.getRef()));
		}
		/******************** documentmanifestrelatedidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestrelatedidentifier = documentmanifestrelated.getIdentifier();

		/******************** DocManifest_Rlted_Id_Vl ********************************************************************************/
		if(documentmanifestrelatedidentifier.hasValue()) {
			d.setDocManifestRltedIdVl(String.valueOf(documentmanifestrelatedidentifier.getValue()));
		}
		/******************** documentmanifestrelatedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestrelatedidentifiertype = documentmanifestrelatedidentifier.getType();

		/******************** documentmanifestrelatedidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestrelatedidentifiertypecoding = documentmanifestrelatedidentifiertype.getCodingFirstRep();

		/******************** DocManifest_Rlted_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecoding.hasDisplay()) {
			d.setDocManifestRltedIdTypCdgDsply(String.valueOf(documentmanifestrelatedidentifiertypecoding.getDisplay()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecoding.hasVersion()) {
			d.setDocManifestRltedIdTypCdgVrsn(String.valueOf(documentmanifestrelatedidentifiertypecoding.getVersion()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecoding.hasCode()) {
			d.setDocManifestRltedIdTypCdgCd(String.valueOf(documentmanifestrelatedidentifiertypecoding.getCode()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecoding.hasSystem()) {
			d.setDocManifestRltedIdTypCdgSys(String.valueOf(documentmanifestrelatedidentifiertypecoding.getSystem()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecoding.hasUserSelected()) {
			d.setDocManifestRltedIdTypCdgUsrSltd(String.valueOf(documentmanifestrelatedidentifiertypecoding.getUserSelected()));
		}
		/******************** DocManifest_Rlted_Id_Typ_Txt ********************************************************************************/
		if(documentmanifestrelatedidentifiertype.hasText()) {
			d.setDocManifestRltedIdTypTxt(String.valueOf(documentmanifestrelatedidentifiertype.getText()));
		}
		/******************** DocManifest_Rlted_Id_Sys ********************************************************************************/
		if(documentmanifestrelatedidentifier.hasSystem()) {
			d.setDocManifestRltedIdSys(String.valueOf(documentmanifestrelatedidentifier.getSystem()));
		}
		/******************** DocManifest_Rlted_Id_Assigner ********************************************************************************/
		if(documentmanifestrelatedidentifier.hasAssigner()) {
			d.setDocManifestRltedIdAssigner(String.valueOf(documentmanifestrelatedidentifier.getAssigner()));
		}
		/******************** documentmanifestrelatedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestrelatedidentifierperiod = documentmanifestrelatedidentifier.getPeriod();

		/******************** DocManifest_Rlted_Id_Prd_End ********************************************************************************/
		if(documentmanifestrelatedidentifierperiod.hasEnd()) {
			d.setDocManifestRltedIdPrdEnd(String.valueOf(documentmanifestrelatedidentifierperiod.getEnd()));
		}
		/******************** DocManifest_Rlted_Id_Prd_Strt ********************************************************************************/
		if(documentmanifestrelatedidentifierperiod.hasStart()) {
			d.setDocManifestRltedIdPrdStrt(String.valueOf(documentmanifestrelatedidentifierperiod.getStart()));
		}
		/******************** documentmanifestrelatedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestrelatedidentifieruse = documentmanifestrelatedidentifier.getUse();
		d.setDocManifestRltedIdUse(documentmanifestrelatedidentifieruse.toCode());

		/******************** documentmanifestmasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestmasteridentifier = documentmanifest.getMasterIdentifier();

		/******************** DocManifest_MasterId_Vl ********************************************************************************/
		if(documentmanifestmasteridentifier.hasValue()) {
			d.setDocManifestMasterIdVl(String.valueOf(documentmanifestmasteridentifier.getValue()));
		}
		/******************** documentmanifestmasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestmasteridentifiertype = documentmanifestmasteridentifier.getType();

		/******************** documentmanifestmasteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentmanifestmasteridentifiertypecoding = documentmanifestmasteridentifiertype.getCodingFirstRep();

		/******************** DocManifest_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestmasteridentifiertypecoding.hasDisplay()) {
			d.setDocManifestMasterIdTypCdgDsply(String.valueOf(documentmanifestmasteridentifiertypecoding.getDisplay()));
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestmasteridentifiertypecoding.hasVersion()) {
			d.setDocManifestMasterIdTypCdgVrsn(String.valueOf(documentmanifestmasteridentifiertypecoding.getVersion()));
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestmasteridentifiertypecoding.hasCode()) {
			d.setDocManifestMasterIdTypCdgCd(String.valueOf(documentmanifestmasteridentifiertypecoding.getCode()));
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestmasteridentifiertypecoding.hasSystem()) {
			d.setDocManifestMasterIdTypCdgSys(String.valueOf(documentmanifestmasteridentifiertypecoding.getSystem()));
		}
		/******************** DocManifest_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestmasteridentifiertypecoding.hasUserSelected()) {
			d.setDocManifestMasterIdTypCdgUsrSltd(String.valueOf(documentmanifestmasteridentifiertypecoding.getUserSelected()));
		}
		/******************** DocManifest_MasterId_Typ_Txt ********************************************************************************/
		if(documentmanifestmasteridentifiertype.hasText()) {
			d.setDocManifestMasterIdTypTxt(String.valueOf(documentmanifestmasteridentifiertype.getText()));
		}
		/******************** DocManifest_MasterId_Sys ********************************************************************************/
		if(documentmanifestmasteridentifier.hasSystem()) {
			d.setDocManifestMasterIdSys(String.valueOf(documentmanifestmasteridentifier.getSystem()));
		}
		/******************** DocManifest_MasterId_Assigner ********************************************************************************/
		if(documentmanifestmasteridentifier.hasAssigner()) {
			d.setDocManifestMasterIdAssigner(String.valueOf(documentmanifestmasteridentifier.getAssigner()));
		}
		/******************** documentmanifestmasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestmasteridentifierperiod = documentmanifestmasteridentifier.getPeriod();

		/******************** DocManifest_MasterId_Prd_End ********************************************************************************/
		if(documentmanifestmasteridentifierperiod.hasEnd()) {
			d.setDocManifestMasterIdPrdEnd(String.valueOf(documentmanifestmasteridentifierperiod.getEnd()));
		}
		/******************** DocManifest_MasterId_Prd_Strt ********************************************************************************/
		if(documentmanifestmasteridentifierperiod.hasStart()) {
			d.setDocManifestMasterIdPrdStrt(String.valueOf(documentmanifestmasteridentifierperiod.getStart()));
		}
		/******************** documentmanifestmasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestmasteridentifieruse = documentmanifestmasteridentifier.getUse();
		d.setDocManifestMasterIdUse(documentmanifestmasteridentifieruse.toCode());

		return d;
	}
}
