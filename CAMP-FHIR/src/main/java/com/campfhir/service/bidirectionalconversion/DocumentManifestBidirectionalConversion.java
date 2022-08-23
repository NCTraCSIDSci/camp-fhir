package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentManifest;
public class DocumentManifestBidirectionalConversion 
{
	public DocumentManifest DocumentManifests(org.hl7.fhir.r4.model.DocumentManifest documentmanifest) throws ParseException
	{
		 main.java.com.campfhir.model.DocumentManifest d = new  main.java.com.campfhir.model.DocumentManifest();

		/******************** id ********************************************************************************/
		d.setId(documentmanifest.getIdElement().getIdPart());

		/******************** documentmanifesttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifesttype = documentmanifest.getType();

		/******************** DocManifest_Typ_Txt ********************************************************************************/
		if(documentmanifesttype.hasText()) {

			d.addDocManifestTypTxt(String.valueOf(documentmanifesttype.getText()));
		} else {
			d.addDocManifestTypTxt("NULL");
		}


		/******************** documentmanifesttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentmanifesttypecodinglist = documentmanifesttype.getCoding();
		for(int documentmanifesttypecodingi = 0; documentmanifesttypecodingi<documentmanifesttypecodinglist.size();documentmanifesttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentmanifesttypecoding = documentmanifesttypecodinglist.get(documentmanifesttypecodingi);

		/******************** DocManifest_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifesttypecodingi == 0) {d.addDocManifestTypCdgDsply("[");}
		if(documentmanifesttypecoding.hasDisplay()) {

			d.addDocManifestTypCdgDsply(String.valueOf(documentmanifesttypecoding.getDisplay()));
		} else {
			d.addDocManifestTypCdgDsply("NULL");
		}

		if(documentmanifesttypecodingi == documentmanifesttypecodinglist.size()-1) {d.addDocManifestTypCdgDsply("]");}


		/******************** DocManifest_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifesttypecodingi == 0) {d.addDocManifestTypCdgVrsn("[");}
		if(documentmanifesttypecoding.hasVersion()) {

			d.addDocManifestTypCdgVrsn(String.valueOf(documentmanifesttypecoding.getVersion()));
		} else {
			d.addDocManifestTypCdgVrsn("NULL");
		}

		if(documentmanifesttypecodingi == documentmanifesttypecodinglist.size()-1) {d.addDocManifestTypCdgVrsn("]");}


		/******************** DocManifest_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifesttypecodingi == 0) {d.addDocManifestTypCdgCd("[");}
		if(documentmanifesttypecoding.hasCode()) {

			d.addDocManifestTypCdgCd(String.valueOf(documentmanifesttypecoding.getCode()));
		} else {
			d.addDocManifestTypCdgCd("NULL");
		}

		if(documentmanifesttypecodingi == documentmanifesttypecodinglist.size()-1) {d.addDocManifestTypCdgCd("]");}


		/******************** DocManifest_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifesttypecodingi == 0) {d.addDocManifestTypCdgUsrSltd("[");}
		if(documentmanifesttypecoding.hasUserSelected()) {

			d.addDocManifestTypCdgUsrSltd(String.valueOf(documentmanifesttypecoding.getUserSelected()));
		} else {
			d.addDocManifestTypCdgUsrSltd("NULL");
		}

		if(documentmanifesttypecodingi == documentmanifesttypecodinglist.size()-1) {d.addDocManifestTypCdgUsrSltd("]");}


		/******************** DocManifest_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifesttypecodingi == 0) {d.addDocManifestTypCdgSys("[");}
		if(documentmanifesttypecoding.hasSystem()) {

			d.addDocManifestTypCdgSys(String.valueOf(documentmanifesttypecoding.getSystem()));
		} else {
			d.addDocManifestTypCdgSys("NULL");
		}

		if(documentmanifesttypecodingi == documentmanifesttypecodinglist.size()-1) {d.addDocManifestTypCdgSys("]");}


		 };
		/******************** DocManifest_Cntnt ********************************************************************************/
		if(documentmanifest.hasContent()) {

			String  array = "[";
			for(int incr=0; incr<documentmanifest.getContent().size(); incr++) {
				array = array + documentmanifest.getContent().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocManifestCntnt(array);

		} else {
			d.addDocManifestCntnt("NULL");
		}


		/******************** DocManifest_Src ********************************************************************************/
		if(documentmanifest.hasSource()) {

			d.addDocManifestSrc(String.valueOf(documentmanifest.getSource()));
		} else {
			d.addDocManifestSrc("NULL");
		}


		/******************** DocManifest_Sbjct ********************************************************************************/
		if(documentmanifest.hasSubject()) {

			if(documentmanifest.getSubject().getReference() != null) {
			d.addDocManifestSbjct(documentmanifest.getSubject().getReference());
			}
		} else {
			d.addDocManifestSbjct("NULL");
		}


		/******************** documentmanifeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus documentmanifeststatus = documentmanifest.getStatus();
		if(documentmanifeststatus!=null) {
			d.addDocManifestSts(documentmanifeststatus.toCode());
		} else {
			d.addDocManifestSts("NULL");
		}

		/******************** DocManifest_Dscrptn ********************************************************************************/
		if(documentmanifest.hasDescription()) {

			d.addDocManifestDscrptn(String.valueOf(documentmanifest.getDescription()));
		} else {
			d.addDocManifestDscrptn("NULL");
		}


		/******************** DocManifest_Created ********************************************************************************/
		if(documentmanifest.hasCreated()) {

			d.addDocManifestCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifest.getCreated())+"\"");
		} else {
			d.addDocManifestCreated("NULL");
		}


		/******************** documentmanifestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> documentmanifestidentifierlist = documentmanifest.getIdentifier();
		for(int documentmanifestidentifieri = 0; documentmanifestidentifieri<documentmanifestidentifierlist.size();documentmanifestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  documentmanifestidentifier = documentmanifestidentifierlist.get(documentmanifestidentifieri);

		/******************** DocManifest_Id_Vl ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdVl("[");}
		if(documentmanifestidentifier.hasValue()) {

			d.addDocManifestIdVl(String.valueOf(documentmanifestidentifier.getValue()));
		} else {
			d.addDocManifestIdVl("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdVl("]");}


		/******************** documentmanifestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestidentifiertype = documentmanifestidentifier.getType();

		/******************** DocManifest_Id_Typ_Txt ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdTypTxt("[");}
		if(documentmanifestidentifiertype.hasText()) {

			d.addDocManifestIdTypTxt(String.valueOf(documentmanifestidentifiertype.getText()));
		} else {
			d.addDocManifestIdTypTxt("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdTypTxt("]");}


		/******************** documentmanifestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentmanifestidentifiertypecodinglist = documentmanifestidentifiertype.getCoding();
		for(int documentmanifestidentifiertypecodingi = 0; documentmanifestidentifiertypecodingi<documentmanifestidentifiertypecodinglist.size();documentmanifestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentmanifestidentifiertypecoding = documentmanifestidentifiertypecodinglist.get(documentmanifestidentifiertypecodingi);

		/******************** DocManifest_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestidentifiertypecodingi == 0) {d.addDocManifestIdTypCdgDsply("[[");}
		if(documentmanifestidentifiertypecoding.hasDisplay()) {

			d.addDocManifestIdTypCdgDsply(String.valueOf(documentmanifestidentifiertypecoding.getDisplay()));
		} else {
			d.addDocManifestIdTypCdgDsply("NULL");
		}

		if(documentmanifestidentifiertypecodingi == documentmanifestidentifiertypecodinglist.size()-1) {d.addDocManifestIdTypCdgDsply("]]");}


		/******************** DocManifest_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestidentifiertypecodingi == 0) {d.addDocManifestIdTypCdgVrsn("[[");}
		if(documentmanifestidentifiertypecoding.hasVersion()) {

			d.addDocManifestIdTypCdgVrsn(String.valueOf(documentmanifestidentifiertypecoding.getVersion()));
		} else {
			d.addDocManifestIdTypCdgVrsn("NULL");
		}

		if(documentmanifestidentifiertypecodingi == documentmanifestidentifiertypecodinglist.size()-1) {d.addDocManifestIdTypCdgVrsn("]]");}


		/******************** DocManifest_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestidentifiertypecodingi == 0) {d.addDocManifestIdTypCdgCd("[[");}
		if(documentmanifestidentifiertypecoding.hasCode()) {

			d.addDocManifestIdTypCdgCd(String.valueOf(documentmanifestidentifiertypecoding.getCode()));
		} else {
			d.addDocManifestIdTypCdgCd("NULL");
		}

		if(documentmanifestidentifiertypecodingi == documentmanifestidentifiertypecodinglist.size()-1) {d.addDocManifestIdTypCdgCd("]]");}


		/******************** DocManifest_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestidentifiertypecodingi == 0) {d.addDocManifestIdTypCdgUsrSltd("[[");}
		if(documentmanifestidentifiertypecoding.hasUserSelected()) {

			d.addDocManifestIdTypCdgUsrSltd(String.valueOf(documentmanifestidentifiertypecoding.getUserSelected()));
		} else {
			d.addDocManifestIdTypCdgUsrSltd("NULL");
		}

		if(documentmanifestidentifiertypecodingi == documentmanifestidentifiertypecodinglist.size()-1) {d.addDocManifestIdTypCdgUsrSltd("]]");}


		/******************** DocManifest_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestidentifiertypecodingi == 0) {d.addDocManifestIdTypCdgSys("[[");}
		if(documentmanifestidentifiertypecoding.hasSystem()) {

			d.addDocManifestIdTypCdgSys(String.valueOf(documentmanifestidentifiertypecoding.getSystem()));
		} else {
			d.addDocManifestIdTypCdgSys("NULL");
		}

		if(documentmanifestidentifiertypecodingi == documentmanifestidentifiertypecodinglist.size()-1) {d.addDocManifestIdTypCdgSys("]]");}


		 };
		/******************** documentmanifestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestidentifierperiod = documentmanifestidentifier.getPeriod();

		/******************** DocManifest_Id_Prd_Strt ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdPrdStrt("[");}
		if(documentmanifestidentifierperiod.hasStart()) {

			d.addDocManifestIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestidentifierperiod.getStart())+"\"");
		} else {
			d.addDocManifestIdPrdStrt("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdPrdStrt("]");}


		/******************** DocManifest_Id_Prd_End ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdPrdEnd("[");}
		if(documentmanifestidentifierperiod.hasEnd()) {

			d.addDocManifestIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestidentifierperiod.getEnd())+"\"");
		} else {
			d.addDocManifestIdPrdEnd("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdPrdEnd("]");}


		/******************** documentmanifestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestidentifieruse = documentmanifestidentifier.getUse();
		if(documentmanifestidentifieruse!=null) {
		if(documentmanifestidentifieri == 0) {

		d.addDocManifestIdUse("[");		}
			d.addDocManifestIdUse(documentmanifestidentifieruse.toCode());
		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {

		d.addDocManifestIdUse("]");		}

		} else {
			d.addDocManifestIdUse("NULL");
		}

		/******************** DocManifest_Id_Assigner ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdAssigner("[");}
		if(documentmanifestidentifier.hasAssigner()) {

			if(documentmanifestidentifier.getAssigner().getReference() != null) {
			d.addDocManifestIdAssigner(documentmanifestidentifier.getAssigner().getReference());
			}
		} else {
			d.addDocManifestIdAssigner("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdAssigner("]");}


		/******************** DocManifest_Id_Sys ********************************************************************************/
		if(documentmanifestidentifieri == 0) {d.addDocManifestIdSys("[");}
		if(documentmanifestidentifier.hasSystem()) {

			d.addDocManifestIdSys(String.valueOf(documentmanifestidentifier.getSystem()));
		} else {
			d.addDocManifestIdSys("NULL");
		}

		if(documentmanifestidentifieri == documentmanifestidentifierlist.size()-1) {d.addDocManifestIdSys("]");}


		 };
		/******************** documentmanifestmasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestmasteridentifier = documentmanifest.getMasterIdentifier();

		/******************** DocManifest_MasterId_Vl ********************************************************************************/
		if(documentmanifestmasteridentifier.hasValue()) {

			d.addDocManifestMasterIdVl(String.valueOf(documentmanifestmasteridentifier.getValue()));
		} else {
			d.addDocManifestMasterIdVl("NULL");
		}


		/******************** documentmanifestmasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestmasteridentifiertype = documentmanifestmasteridentifier.getType();

		/******************** DocManifest_MasterId_Typ_Txt ********************************************************************************/
		if(documentmanifestmasteridentifiertype.hasText()) {

			d.addDocManifestMasterIdTypTxt(String.valueOf(documentmanifestmasteridentifiertype.getText()));
		} else {
			d.addDocManifestMasterIdTypTxt("NULL");
		}


		/******************** documentmanifestmasteridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentmanifestmasteridentifiertypecodinglist = documentmanifestmasteridentifiertype.getCoding();
		for(int documentmanifestmasteridentifiertypecodingi = 0; documentmanifestmasteridentifiertypecodingi<documentmanifestmasteridentifiertypecodinglist.size();documentmanifestmasteridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentmanifestmasteridentifiertypecoding = documentmanifestmasteridentifiertypecodinglist.get(documentmanifestmasteridentifiertypecodingi);

		/******************** DocManifest_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestmasteridentifiertypecodingi == 0) {d.addDocManifestMasterIdTypCdgDsply("[");}
		if(documentmanifestmasteridentifiertypecoding.hasDisplay()) {

			d.addDocManifestMasterIdTypCdgDsply(String.valueOf(documentmanifestmasteridentifiertypecoding.getDisplay()));
		} else {
			d.addDocManifestMasterIdTypCdgDsply("NULL");
		}

		if(documentmanifestmasteridentifiertypecodingi == documentmanifestmasteridentifiertypecodinglist.size()-1) {d.addDocManifestMasterIdTypCdgDsply("]");}


		/******************** DocManifest_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestmasteridentifiertypecodingi == 0) {d.addDocManifestMasterIdTypCdgVrsn("[");}
		if(documentmanifestmasteridentifiertypecoding.hasVersion()) {

			d.addDocManifestMasterIdTypCdgVrsn(String.valueOf(documentmanifestmasteridentifiertypecoding.getVersion()));
		} else {
			d.addDocManifestMasterIdTypCdgVrsn("NULL");
		}

		if(documentmanifestmasteridentifiertypecodingi == documentmanifestmasteridentifiertypecodinglist.size()-1) {d.addDocManifestMasterIdTypCdgVrsn("]");}


		/******************** DocManifest_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestmasteridentifiertypecodingi == 0) {d.addDocManifestMasterIdTypCdgCd("[");}
		if(documentmanifestmasteridentifiertypecoding.hasCode()) {

			d.addDocManifestMasterIdTypCdgCd(String.valueOf(documentmanifestmasteridentifiertypecoding.getCode()));
		} else {
			d.addDocManifestMasterIdTypCdgCd("NULL");
		}

		if(documentmanifestmasteridentifiertypecodingi == documentmanifestmasteridentifiertypecodinglist.size()-1) {d.addDocManifestMasterIdTypCdgCd("]");}


		/******************** DocManifest_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestmasteridentifiertypecodingi == 0) {d.addDocManifestMasterIdTypCdgUsrSltd("[");}
		if(documentmanifestmasteridentifiertypecoding.hasUserSelected()) {

			d.addDocManifestMasterIdTypCdgUsrSltd(String.valueOf(documentmanifestmasteridentifiertypecoding.getUserSelected()));
		} else {
			d.addDocManifestMasterIdTypCdgUsrSltd("NULL");
		}

		if(documentmanifestmasteridentifiertypecodingi == documentmanifestmasteridentifiertypecodinglist.size()-1) {d.addDocManifestMasterIdTypCdgUsrSltd("]");}


		/******************** DocManifest_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestmasteridentifiertypecodingi == 0) {d.addDocManifestMasterIdTypCdgSys("[");}
		if(documentmanifestmasteridentifiertypecoding.hasSystem()) {

			d.addDocManifestMasterIdTypCdgSys(String.valueOf(documentmanifestmasteridentifiertypecoding.getSystem()));
		} else {
			d.addDocManifestMasterIdTypCdgSys("NULL");
		}

		if(documentmanifestmasteridentifiertypecodingi == documentmanifestmasteridentifiertypecodinglist.size()-1) {d.addDocManifestMasterIdTypCdgSys("]");}


		 };
		/******************** documentmanifestmasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestmasteridentifierperiod = documentmanifestmasteridentifier.getPeriod();

		/******************** DocManifest_MasterId_Prd_Strt ********************************************************************************/
		if(documentmanifestmasteridentifierperiod.hasStart()) {

			d.addDocManifestMasterIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestmasteridentifierperiod.getStart())+"\"");
		} else {
			d.addDocManifestMasterIdPrdStrt("NULL");
		}


		/******************** DocManifest_MasterId_Prd_End ********************************************************************************/
		if(documentmanifestmasteridentifierperiod.hasEnd()) {

			d.addDocManifestMasterIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestmasteridentifierperiod.getEnd())+"\"");
		} else {
			d.addDocManifestMasterIdPrdEnd("NULL");
		}


		/******************** documentmanifestmasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestmasteridentifieruse = documentmanifestmasteridentifier.getUse();
		if(documentmanifestmasteridentifieruse!=null) {
			d.addDocManifestMasterIdUse(documentmanifestmasteridentifieruse.toCode());
		} else {
			d.addDocManifestMasterIdUse("NULL");
		}

		/******************** DocManifest_MasterId_Assigner ********************************************************************************/
		if(documentmanifestmasteridentifier.hasAssigner()) {

			if(documentmanifestmasteridentifier.getAssigner().getReference() != null) {
			d.addDocManifestMasterIdAssigner(documentmanifestmasteridentifier.getAssigner().getReference());
			}
		} else {
			d.addDocManifestMasterIdAssigner("NULL");
		}


		/******************** DocManifest_MasterId_Sys ********************************************************************************/
		if(documentmanifestmasteridentifier.hasSystem()) {

			d.addDocManifestMasterIdSys(String.valueOf(documentmanifestmasteridentifier.getSystem()));
		} else {
			d.addDocManifestMasterIdSys("NULL");
		}


		/******************** documentmanifestrelated ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent> documentmanifestrelatedlist = documentmanifest.getRelated();
		for(int documentmanifestrelatedi = 0; documentmanifestrelatedi<documentmanifestrelatedlist.size();documentmanifestrelatedi++ ) {
		org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent  documentmanifestrelated = documentmanifestrelatedlist.get(documentmanifestrelatedi);

		/******************** DocManifest_Rlted_Ref ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedRef("[");}
		if(documentmanifestrelated.hasRef()) {

			if(documentmanifestrelated.getRef().getReference() != null) {
			d.addDocManifestRltedRef(documentmanifestrelated.getRef().getReference());
			}
		} else {
			d.addDocManifestRltedRef("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedRef("]");}


		/******************** documentmanifestrelatedidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentmanifestrelatedidentifier = documentmanifestrelated.getIdentifier();

		/******************** DocManifest_Rlted_Id_Vl ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdVl("[");}
		if(documentmanifestrelatedidentifier.hasValue()) {

			d.addDocManifestRltedIdVl(String.valueOf(documentmanifestrelatedidentifier.getValue()));
		} else {
			d.addDocManifestRltedIdVl("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdVl("]");}


		/******************** documentmanifestrelatedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentmanifestrelatedidentifiertype = documentmanifestrelatedidentifier.getType();

		/******************** DocManifest_Rlted_Id_Typ_Txt ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdTypTxt("[");}
		if(documentmanifestrelatedidentifiertype.hasText()) {

			d.addDocManifestRltedIdTypTxt(String.valueOf(documentmanifestrelatedidentifiertype.getText()));
		} else {
			d.addDocManifestRltedIdTypTxt("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdTypTxt("]");}


		/******************** documentmanifestrelatedidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentmanifestrelatedidentifiertypecodinglist = documentmanifestrelatedidentifiertype.getCoding();
		for(int documentmanifestrelatedidentifiertypecodingi = 0; documentmanifestrelatedidentifiertypecodingi<documentmanifestrelatedidentifiertypecodinglist.size();documentmanifestrelatedidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentmanifestrelatedidentifiertypecoding = documentmanifestrelatedidentifiertypecodinglist.get(documentmanifestrelatedidentifiertypecodingi);

		/******************** DocManifest_Rlted_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecodingi == 0) {d.addDocManifestRltedIdTypCdgDsply("[[");}
		if(documentmanifestrelatedidentifiertypecoding.hasDisplay()) {

			d.addDocManifestRltedIdTypCdgDsply(String.valueOf(documentmanifestrelatedidentifiertypecoding.getDisplay()));
		} else {
			d.addDocManifestRltedIdTypCdgDsply("NULL");
		}

		if(documentmanifestrelatedidentifiertypecodingi == documentmanifestrelatedidentifiertypecodinglist.size()-1) {d.addDocManifestRltedIdTypCdgDsply("]]");}


		/******************** DocManifest_Rlted_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecodingi == 0) {d.addDocManifestRltedIdTypCdgVrsn("[[");}
		if(documentmanifestrelatedidentifiertypecoding.hasVersion()) {

			d.addDocManifestRltedIdTypCdgVrsn(String.valueOf(documentmanifestrelatedidentifiertypecoding.getVersion()));
		} else {
			d.addDocManifestRltedIdTypCdgVrsn("NULL");
		}

		if(documentmanifestrelatedidentifiertypecodingi == documentmanifestrelatedidentifiertypecodinglist.size()-1) {d.addDocManifestRltedIdTypCdgVrsn("]]");}


		/******************** DocManifest_Rlted_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecodingi == 0) {d.addDocManifestRltedIdTypCdgCd("[[");}
		if(documentmanifestrelatedidentifiertypecoding.hasCode()) {

			d.addDocManifestRltedIdTypCdgCd(String.valueOf(documentmanifestrelatedidentifiertypecoding.getCode()));
		} else {
			d.addDocManifestRltedIdTypCdgCd("NULL");
		}

		if(documentmanifestrelatedidentifiertypecodingi == documentmanifestrelatedidentifiertypecodinglist.size()-1) {d.addDocManifestRltedIdTypCdgCd("]]");}


		/******************** DocManifest_Rlted_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecodingi == 0) {d.addDocManifestRltedIdTypCdgUsrSltd("[[");}
		if(documentmanifestrelatedidentifiertypecoding.hasUserSelected()) {

			d.addDocManifestRltedIdTypCdgUsrSltd(String.valueOf(documentmanifestrelatedidentifiertypecoding.getUserSelected()));
		} else {
			d.addDocManifestRltedIdTypCdgUsrSltd("NULL");
		}

		if(documentmanifestrelatedidentifiertypecodingi == documentmanifestrelatedidentifiertypecodinglist.size()-1) {d.addDocManifestRltedIdTypCdgUsrSltd("]]");}


		/******************** DocManifest_Rlted_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentmanifestrelatedidentifiertypecodingi == 0) {d.addDocManifestRltedIdTypCdgSys("[[");}
		if(documentmanifestrelatedidentifiertypecoding.hasSystem()) {

			d.addDocManifestRltedIdTypCdgSys(String.valueOf(documentmanifestrelatedidentifiertypecoding.getSystem()));
		} else {
			d.addDocManifestRltedIdTypCdgSys("NULL");
		}

		if(documentmanifestrelatedidentifiertypecodingi == documentmanifestrelatedidentifiertypecodinglist.size()-1) {d.addDocManifestRltedIdTypCdgSys("]]");}


		 };
		/******************** documentmanifestrelatedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentmanifestrelatedidentifierperiod = documentmanifestrelatedidentifier.getPeriod();

		/******************** DocManifest_Rlted_Id_Prd_Strt ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdPrdStrt("[");}
		if(documentmanifestrelatedidentifierperiod.hasStart()) {

			d.addDocManifestRltedIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestrelatedidentifierperiod.getStart())+"\"");
		} else {
			d.addDocManifestRltedIdPrdStrt("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdPrdStrt("]");}


		/******************** DocManifest_Rlted_Id_Prd_End ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdPrdEnd("[");}
		if(documentmanifestrelatedidentifierperiod.hasEnd()) {

			d.addDocManifestRltedIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentmanifestrelatedidentifierperiod.getEnd())+"\"");
		} else {
			d.addDocManifestRltedIdPrdEnd("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdPrdEnd("]");}


		/******************** documentmanifestrelatedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentmanifestrelatedidentifieruse = documentmanifestrelatedidentifier.getUse();
		if(documentmanifestrelatedidentifieruse!=null) {
		if(documentmanifestrelatedi == 0) {

		d.addDocManifestRltedIdUse("[");		}
			d.addDocManifestRltedIdUse(documentmanifestrelatedidentifieruse.toCode());
		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {

		d.addDocManifestRltedIdUse("]");		}

		} else {
			d.addDocManifestRltedIdUse("NULL");
		}

		/******************** DocManifest_Rlted_Id_Assigner ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdAssigner("[");}
		if(documentmanifestrelatedidentifier.hasAssigner()) {

			if(documentmanifestrelatedidentifier.getAssigner().getReference() != null) {
			d.addDocManifestRltedIdAssigner(documentmanifestrelatedidentifier.getAssigner().getReference());
			}
		} else {
			d.addDocManifestRltedIdAssigner("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdAssigner("]");}


		/******************** DocManifest_Rlted_Id_Sys ********************************************************************************/
		if(documentmanifestrelatedi == 0) {d.addDocManifestRltedIdSys("[");}
		if(documentmanifestrelatedidentifier.hasSystem()) {

			d.addDocManifestRltedIdSys(String.valueOf(documentmanifestrelatedidentifier.getSystem()));
		} else {
			d.addDocManifestRltedIdSys("NULL");
		}

		if(documentmanifestrelatedi == documentmanifestrelatedlist.size()-1) {d.addDocManifestRltedIdSys("]");}


		 };
		/******************** DocManifest_Recipient ********************************************************************************/
		if(documentmanifest.hasRecipient()) {

			String  array = "[";
			for(int incr=0; incr<documentmanifest.getRecipient().size(); incr++) {
				array = array + documentmanifest.getRecipient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocManifestRecipient(array);

		} else {
			d.addDocManifestRecipient("NULL");
		}


		/******************** DocManifest_Athr ********************************************************************************/
		if(documentmanifest.hasAuthor()) {

			String  array = "[";
			for(int incr=0; incr<documentmanifest.getAuthor().size(); incr++) {
				array = array + documentmanifest.getAuthor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocManifestAthr(array);

		} else {
			d.addDocManifestAthr("NULL");
		}


		return d;
	}
}
