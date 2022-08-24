package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ListResource;
public class ListResourceBidirectionalConversion 
{
	public ListResource ListResources(org.hl7.fhir.r4.model.ListResource listresource) throws ParseException
	{
		 main.java.com.campfhir.model.ListResource l = new  main.java.com.campfhir.model.ListResource();

		/******************** id ********************************************************************************/
		l.setId(listresource.getIdElement().getIdPart());

		/******************** listresourceentry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ListResource.ListEntryComponent> listresourceentrylist = listresource.getEntry();
		for(int listresourceentryi = 0; listresourceentryi<listresourceentrylist.size();listresourceentryi++ ) {
		org.hl7.fhir.r4.model.ListResource.ListEntryComponent  listresourceentry = listresourceentrylist.get(listresourceentryi);

		/******************** ListRsrc_Entry_Itm ********************************************************************************/
		if(listresourceentryi == 0) {l.addListRsrcEntryItm("[");}
		if(listresourceentry.hasItem()) {

			if(listresourceentry.getItem().getReference() != null) {
			l.addListRsrcEntryItm(listresourceentry.getItem().getReference());
			}
		} else {
			l.addListRsrcEntryItm("NULL");
		}

		if(listresourceentryi == listresourceentrylist.size()-1) {l.addListRsrcEntryItm("]");}


		/******************** ListRsrc_Entry_Dt ********************************************************************************/
		if(listresourceentryi == 0) {l.addListRsrcEntryDt("[");}
		if(listresourceentry.hasDate()) {

			l.addListRsrcEntryDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(listresourceentry.getDate())+"\"");
		} else {
			l.addListRsrcEntryDt("NULL");
		}

		if(listresourceentryi == listresourceentrylist.size()-1) {l.addListRsrcEntryDt("]");}


		/******************** ListRsrc_Entry_Deleted ********************************************************************************/
		if(listresourceentryi == 0) {l.addListRsrcEntryDeleted("[");}
		if(listresourceentry.hasDeleted()) {

			l.addListRsrcEntryDeleted(String.valueOf(listresourceentry.getDeleted()));
		} else {
			l.addListRsrcEntryDeleted("NULL");
		}

		if(listresourceentryi == listresourceentrylist.size()-1) {l.addListRsrcEntryDeleted("]");}


		/******************** listresourceentryflag ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceentryflag = listresourceentry.getFlag();

		/******************** ListRsrc_Entry_Flag_Txt ********************************************************************************/
		if(listresourceentryi == 0) {l.addListRsrcEntryFlagTxt("[");}
		if(listresourceentryflag.hasText()) {

			l.addListRsrcEntryFlagTxt(String.valueOf(listresourceentryflag.getText()));
		} else {
			l.addListRsrcEntryFlagTxt("NULL");
		}

		if(listresourceentryi == listresourceentrylist.size()-1) {l.addListRsrcEntryFlagTxt("]");}


		/******************** listresourceentryflagcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> listresourceentryflagcodinglist = listresourceentryflag.getCoding();
		for(int listresourceentryflagcodingi = 0; listresourceentryflagcodingi<listresourceentryflagcodinglist.size();listresourceentryflagcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  listresourceentryflagcoding = listresourceentryflagcodinglist.get(listresourceentryflagcodingi);

		/******************** ListRsrc_Entry_Flag_Cdg_Dsply ********************************************************************************/
		if(listresourceentryflagcodingi == 0) {l.addListRsrcEntryFlagCdgDsply("[[");}
		if(listresourceentryflagcoding.hasDisplay()) {

			l.addListRsrcEntryFlagCdgDsply(String.valueOf(listresourceentryflagcoding.getDisplay()));
		} else {
			l.addListRsrcEntryFlagCdgDsply("NULL");
		}

		if(listresourceentryflagcodingi == listresourceentryflagcodinglist.size()-1) {l.addListRsrcEntryFlagCdgDsply("]]");}


		/******************** ListRsrc_Entry_Flag_Cdg_Vrsn ********************************************************************************/
		if(listresourceentryflagcodingi == 0) {l.addListRsrcEntryFlagCdgVrsn("[[");}
		if(listresourceentryflagcoding.hasVersion()) {

			l.addListRsrcEntryFlagCdgVrsn(String.valueOf(listresourceentryflagcoding.getVersion()));
		} else {
			l.addListRsrcEntryFlagCdgVrsn("NULL");
		}

		if(listresourceentryflagcodingi == listresourceentryflagcodinglist.size()-1) {l.addListRsrcEntryFlagCdgVrsn("]]");}


		/******************** ListRsrc_Entry_Flag_Cdg_Cd ********************************************************************************/
		if(listresourceentryflagcodingi == 0) {l.addListRsrcEntryFlagCdgCd("[[");}
		if(listresourceentryflagcoding.hasCode()) {

			l.addListRsrcEntryFlagCdgCd(String.valueOf(listresourceentryflagcoding.getCode()));
		} else {
			l.addListRsrcEntryFlagCdgCd("NULL");
		}

		if(listresourceentryflagcodingi == listresourceentryflagcodinglist.size()-1) {l.addListRsrcEntryFlagCdgCd("]]");}


		/******************** ListRsrc_Entry_Flag_Cdg_UsrSltd ********************************************************************************/
		if(listresourceentryflagcodingi == 0) {l.addListRsrcEntryFlagCdgUsrSltd("[[");}
		if(listresourceentryflagcoding.hasUserSelected()) {

			l.addListRsrcEntryFlagCdgUsrSltd(String.valueOf(listresourceentryflagcoding.getUserSelected()));
		} else {
			l.addListRsrcEntryFlagCdgUsrSltd("NULL");
		}

		if(listresourceentryflagcodingi == listresourceentryflagcodinglist.size()-1) {l.addListRsrcEntryFlagCdgUsrSltd("]]");}


		/******************** ListRsrc_Entry_Flag_Cdg_Sys ********************************************************************************/
		if(listresourceentryflagcodingi == 0) {l.addListRsrcEntryFlagCdgSys("[[");}
		if(listresourceentryflagcoding.hasSystem()) {

			l.addListRsrcEntryFlagCdgSys(String.valueOf(listresourceentryflagcoding.getSystem()));
		} else {
			l.addListRsrcEntryFlagCdgSys("NULL");
		}

		if(listresourceentryflagcodingi == listresourceentryflagcodinglist.size()-1) {l.addListRsrcEntryFlagCdgSys("]]");}


		 };
		 };
		/******************** ListRsrc_Src ********************************************************************************/
		if(listresource.hasSource()) {

			if(listresource.getSource().getReference() != null) {
			l.addListRsrcSrc(listresource.getSource().getReference());
			}
		} else {
			l.addListRsrcSrc("NULL");
		}


		/******************** ListRsrc_Dt ********************************************************************************/
		if(listresource.hasDate()) {

			l.addListRsrcDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(listresource.getDate())+"\"");
		} else {
			l.addListRsrcDt("NULL");
		}


		/******************** listresourcecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourcecode = listresource.getCode();

		/******************** ListRsrc_Cd_Txt ********************************************************************************/
		if(listresourcecode.hasText()) {

			l.addListRsrcCdTxt(String.valueOf(listresourcecode.getText()));
		} else {
			l.addListRsrcCdTxt("NULL");
		}


		/******************** listresourcecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> listresourcecodecodinglist = listresourcecode.getCoding();
		for(int listresourcecodecodingi = 0; listresourcecodecodingi<listresourcecodecodinglist.size();listresourcecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  listresourcecodecoding = listresourcecodecodinglist.get(listresourcecodecodingi);

		/******************** ListRsrc_Cd_Cdg_Dsply ********************************************************************************/
		if(listresourcecodecodingi == 0) {l.addListRsrcCdCdgDsply("[");}
		if(listresourcecodecoding.hasDisplay()) {

			l.addListRsrcCdCdgDsply(String.valueOf(listresourcecodecoding.getDisplay()));
		} else {
			l.addListRsrcCdCdgDsply("NULL");
		}

		if(listresourcecodecodingi == listresourcecodecodinglist.size()-1) {l.addListRsrcCdCdgDsply("]");}


		/******************** ListRsrc_Cd_Cdg_Vrsn ********************************************************************************/
		if(listresourcecodecodingi == 0) {l.addListRsrcCdCdgVrsn("[");}
		if(listresourcecodecoding.hasVersion()) {

			l.addListRsrcCdCdgVrsn(String.valueOf(listresourcecodecoding.getVersion()));
		} else {
			l.addListRsrcCdCdgVrsn("NULL");
		}

		if(listresourcecodecodingi == listresourcecodecodinglist.size()-1) {l.addListRsrcCdCdgVrsn("]");}


		/******************** ListRsrc_Cd_Cdg_Cd ********************************************************************************/
		if(listresourcecodecodingi == 0) {l.addListRsrcCdCdgCd("[");}
		if(listresourcecodecoding.hasCode()) {

			l.addListRsrcCdCdgCd(String.valueOf(listresourcecodecoding.getCode()));
		} else {
			l.addListRsrcCdCdgCd("NULL");
		}

		if(listresourcecodecodingi == listresourcecodecodinglist.size()-1) {l.addListRsrcCdCdgCd("]");}


		/******************** ListRsrc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(listresourcecodecodingi == 0) {l.addListRsrcCdCdgUsrSltd("[");}
		if(listresourcecodecoding.hasUserSelected()) {

			l.addListRsrcCdCdgUsrSltd(String.valueOf(listresourcecodecoding.getUserSelected()));
		} else {
			l.addListRsrcCdCdgUsrSltd("NULL");
		}

		if(listresourcecodecodingi == listresourcecodecodinglist.size()-1) {l.addListRsrcCdCdgUsrSltd("]");}


		/******************** ListRsrc_Cd_Cdg_Sys ********************************************************************************/
		if(listresourcecodecodingi == 0) {l.addListRsrcCdCdgSys("[");}
		if(listresourcecodecoding.hasSystem()) {

			l.addListRsrcCdCdgSys(String.valueOf(listresourcecodecoding.getSystem()));
		} else {
			l.addListRsrcCdCdgSys("NULL");
		}

		if(listresourcecodecodingi == listresourcecodecodinglist.size()-1) {l.addListRsrcCdCdgSys("]");}


		 };
		/******************** ListRsrc_Sbjct ********************************************************************************/
		if(listresource.hasSubject()) {

			if(listresource.getSubject().getReference() != null) {
			l.addListRsrcSbjct(listresource.getSubject().getReference());
			}
		} else {
			l.addListRsrcSbjct("NULL");
		}


		/******************** listresourcestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListStatus listresourcestatus = listresource.getStatus();
		if(listresourcestatus!=null) {
			l.addListRsrcSts(listresourcestatus.toCode());
		} else {
			l.addListRsrcSts("NULL");
		}

		/******************** ListRsrc_Enc ********************************************************************************/
		if(listresource.hasEncounter()) {

			if(listresource.getEncounter().getReference() != null) {
			l.addListRsrcEnc(listresource.getEncounter().getReference());
			}
		} else {
			l.addListRsrcEnc("NULL");
		}


		/******************** listresourcenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> listresourcenotelist = listresource.getNote();
		for(int listresourcenotei = 0; listresourcenotei<listresourcenotelist.size();listresourcenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  listresourcenote = listresourcenotelist.get(listresourcenotei);

		/******************** ListRsrc_Nt_Time ********************************************************************************/
		if(listresourcenotei == 0) {l.addListRsrcNtTime("[");}
		if(listresourcenote.hasTime()) {

			l.addListRsrcNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(listresourcenote.getTime())+"\"");
		} else {
			l.addListRsrcNtTime("NULL");
		}

		if(listresourcenotei == listresourcenotelist.size()-1) {l.addListRsrcNtTime("]");}


		/******************** ListRsrc_Nt_AthrRfrnc ********************************************************************************/
		if(listresourcenotei == 0) {l.addListRsrcNtAthrRfrnc("[");}
		if(listresourcenote.hasAuthorReference()) {

			if(listresourcenote.getAuthorReference().getReference() != null) {
			l.addListRsrcNtAthrRfrnc(listresourcenote.getAuthorReference().getReference());
			}
		} else {
			l.addListRsrcNtAthrRfrnc("NULL");
		}

		if(listresourcenotei == listresourcenotelist.size()-1) {l.addListRsrcNtAthrRfrnc("]");}


		/******************** ListRsrc_Nt_Txt ********************************************************************************/
		if(listresourcenotei == 0) {l.addListRsrcNtTxt("[");}
		if(listresourcenote.hasText()) {

			l.addListRsrcNtTxt(String.valueOf(listresourcenote.getText()));
		} else {
			l.addListRsrcNtTxt("NULL");
		}

		if(listresourcenotei == listresourcenotelist.size()-1) {l.addListRsrcNtTxt("]");}


		/******************** ListRsrc_Nt_AthrStrgTyp ********************************************************************************/
		if(listresourcenotei == 0) {l.addListRsrcNtAthrStrgTyp("[");}
		if(listresourcenote.hasAuthorStringType()) {

			l.addListRsrcNtAthrStrgTyp("\""+listresourcenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			l.addListRsrcNtAthrStrgTyp("NULL");
		}

		if(listresourcenotei == listresourcenotelist.size()-1) {l.addListRsrcNtAthrStrgTyp("]");}


		 };
		/******************** listresourceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> listresourceidentifierlist = listresource.getIdentifier();
		for(int listresourceidentifieri = 0; listresourceidentifieri<listresourceidentifierlist.size();listresourceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  listresourceidentifier = listresourceidentifierlist.get(listresourceidentifieri);

		/******************** ListRsrc_Id_Vl ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdVl("[");}
		if(listresourceidentifier.hasValue()) {

			l.addListRsrcIdVl(String.valueOf(listresourceidentifier.getValue()));
		} else {
			l.addListRsrcIdVl("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdVl("]");}


		/******************** listresourceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceidentifiertype = listresourceidentifier.getType();

		/******************** ListRsrc_Id_Typ_Txt ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdTypTxt("[");}
		if(listresourceidentifiertype.hasText()) {

			l.addListRsrcIdTypTxt(String.valueOf(listresourceidentifiertype.getText()));
		} else {
			l.addListRsrcIdTypTxt("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdTypTxt("]");}


		/******************** listresourceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> listresourceidentifiertypecodinglist = listresourceidentifiertype.getCoding();
		for(int listresourceidentifiertypecodingi = 0; listresourceidentifiertypecodingi<listresourceidentifiertypecodinglist.size();listresourceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  listresourceidentifiertypecoding = listresourceidentifiertypecodinglist.get(listresourceidentifiertypecodingi);

		/******************** ListRsrc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(listresourceidentifiertypecodingi == 0) {l.addListRsrcIdTypCdgDsply("[[");}
		if(listresourceidentifiertypecoding.hasDisplay()) {

			l.addListRsrcIdTypCdgDsply(String.valueOf(listresourceidentifiertypecoding.getDisplay()));
		} else {
			l.addListRsrcIdTypCdgDsply("NULL");
		}

		if(listresourceidentifiertypecodingi == listresourceidentifiertypecodinglist.size()-1) {l.addListRsrcIdTypCdgDsply("]]");}


		/******************** ListRsrc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(listresourceidentifiertypecodingi == 0) {l.addListRsrcIdTypCdgVrsn("[[");}
		if(listresourceidentifiertypecoding.hasVersion()) {

			l.addListRsrcIdTypCdgVrsn(String.valueOf(listresourceidentifiertypecoding.getVersion()));
		} else {
			l.addListRsrcIdTypCdgVrsn("NULL");
		}

		if(listresourceidentifiertypecodingi == listresourceidentifiertypecodinglist.size()-1) {l.addListRsrcIdTypCdgVrsn("]]");}


		/******************** ListRsrc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(listresourceidentifiertypecodingi == 0) {l.addListRsrcIdTypCdgCd("[[");}
		if(listresourceidentifiertypecoding.hasCode()) {

			l.addListRsrcIdTypCdgCd(String.valueOf(listresourceidentifiertypecoding.getCode()));
		} else {
			l.addListRsrcIdTypCdgCd("NULL");
		}

		if(listresourceidentifiertypecodingi == listresourceidentifiertypecodinglist.size()-1) {l.addListRsrcIdTypCdgCd("]]");}


		/******************** ListRsrc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(listresourceidentifiertypecodingi == 0) {l.addListRsrcIdTypCdgUsrSltd("[[");}
		if(listresourceidentifiertypecoding.hasUserSelected()) {

			l.addListRsrcIdTypCdgUsrSltd(String.valueOf(listresourceidentifiertypecoding.getUserSelected()));
		} else {
			l.addListRsrcIdTypCdgUsrSltd("NULL");
		}

		if(listresourceidentifiertypecodingi == listresourceidentifiertypecodinglist.size()-1) {l.addListRsrcIdTypCdgUsrSltd("]]");}


		/******************** ListRsrc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(listresourceidentifiertypecodingi == 0) {l.addListRsrcIdTypCdgSys("[[");}
		if(listresourceidentifiertypecoding.hasSystem()) {

			l.addListRsrcIdTypCdgSys(String.valueOf(listresourceidentifiertypecoding.getSystem()));
		} else {
			l.addListRsrcIdTypCdgSys("NULL");
		}

		if(listresourceidentifiertypecodingi == listresourceidentifiertypecodinglist.size()-1) {l.addListRsrcIdTypCdgSys("]]");}


		 };
		/******************** listresourceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period listresourceidentifierperiod = listresourceidentifier.getPeriod();

		/******************** ListRsrc_Id_Prd_Strt ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdPrdStrt("[");}
		if(listresourceidentifierperiod.hasStart()) {

			l.addListRsrcIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(listresourceidentifierperiod.getStart())+"\"");
		} else {
			l.addListRsrcIdPrdStrt("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdPrdStrt("]");}


		/******************** ListRsrc_Id_Prd_End ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdPrdEnd("[");}
		if(listresourceidentifierperiod.hasEnd()) {

			l.addListRsrcIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(listresourceidentifierperiod.getEnd())+"\"");
		} else {
			l.addListRsrcIdPrdEnd("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdPrdEnd("]");}


		/******************** listresourceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse listresourceidentifieruse = listresourceidentifier.getUse();
		if(listresourceidentifieruse!=null) {
		if(listresourceidentifieri == 0) {

		l.addListRsrcIdUse("[");		}
			l.addListRsrcIdUse(listresourceidentifieruse.toCode());
		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {

		l.addListRsrcIdUse("]");		}

		} else {
			l.addListRsrcIdUse("NULL");
		}

		/******************** ListRsrc_Id_Assigner ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdAssigner("[");}
		if(listresourceidentifier.hasAssigner()) {

			if(listresourceidentifier.getAssigner().getReference() != null) {
			l.addListRsrcIdAssigner(listresourceidentifier.getAssigner().getReference());
			}
		} else {
			l.addListRsrcIdAssigner("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdAssigner("]");}


		/******************** ListRsrc_Id_Sys ********************************************************************************/
		if(listresourceidentifieri == 0) {l.addListRsrcIdSys("[");}
		if(listresourceidentifier.hasSystem()) {

			l.addListRsrcIdSys(String.valueOf(listresourceidentifier.getSystem()));
		} else {
			l.addListRsrcIdSys("NULL");
		}

		if(listresourceidentifieri == listresourceidentifierlist.size()-1) {l.addListRsrcIdSys("]");}


		 };
		/******************** listresourcemode ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListMode listresourcemode = listresource.getMode();
		if(listresourcemode!=null) {
			l.addListRsrcMode(listresourcemode.toCode());
		} else {
			l.addListRsrcMode("NULL");
		}

		/******************** listresourceemptyreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceemptyreason = listresource.getEmptyReason();

		/******************** ListRsrc_EmptyRsn_Txt ********************************************************************************/
		if(listresourceemptyreason.hasText()) {

			l.addListRsrcEmptyRsnTxt(String.valueOf(listresourceemptyreason.getText()));
		} else {
			l.addListRsrcEmptyRsnTxt("NULL");
		}


		/******************** listresourceemptyreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> listresourceemptyreasoncodinglist = listresourceemptyreason.getCoding();
		for(int listresourceemptyreasoncodingi = 0; listresourceemptyreasoncodingi<listresourceemptyreasoncodinglist.size();listresourceemptyreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  listresourceemptyreasoncoding = listresourceemptyreasoncodinglist.get(listresourceemptyreasoncodingi);

		/******************** ListRsrc_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(listresourceemptyreasoncodingi == 0) {l.addListRsrcEmptyRsnCdgDsply("[");}
		if(listresourceemptyreasoncoding.hasDisplay()) {

			l.addListRsrcEmptyRsnCdgDsply(String.valueOf(listresourceemptyreasoncoding.getDisplay()));
		} else {
			l.addListRsrcEmptyRsnCdgDsply("NULL");
		}

		if(listresourceemptyreasoncodingi == listresourceemptyreasoncodinglist.size()-1) {l.addListRsrcEmptyRsnCdgDsply("]");}


		/******************** ListRsrc_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(listresourceemptyreasoncodingi == 0) {l.addListRsrcEmptyRsnCdgVrsn("[");}
		if(listresourceemptyreasoncoding.hasVersion()) {

			l.addListRsrcEmptyRsnCdgVrsn(String.valueOf(listresourceemptyreasoncoding.getVersion()));
		} else {
			l.addListRsrcEmptyRsnCdgVrsn("NULL");
		}

		if(listresourceemptyreasoncodingi == listresourceemptyreasoncodinglist.size()-1) {l.addListRsrcEmptyRsnCdgVrsn("]");}


		/******************** ListRsrc_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(listresourceemptyreasoncodingi == 0) {l.addListRsrcEmptyRsnCdgCd("[");}
		if(listresourceemptyreasoncoding.hasCode()) {

			l.addListRsrcEmptyRsnCdgCd(String.valueOf(listresourceemptyreasoncoding.getCode()));
		} else {
			l.addListRsrcEmptyRsnCdgCd("NULL");
		}

		if(listresourceemptyreasoncodingi == listresourceemptyreasoncodinglist.size()-1) {l.addListRsrcEmptyRsnCdgCd("]");}


		/******************** ListRsrc_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(listresourceemptyreasoncodingi == 0) {l.addListRsrcEmptyRsnCdgUsrSltd("[");}
		if(listresourceemptyreasoncoding.hasUserSelected()) {

			l.addListRsrcEmptyRsnCdgUsrSltd(String.valueOf(listresourceemptyreasoncoding.getUserSelected()));
		} else {
			l.addListRsrcEmptyRsnCdgUsrSltd("NULL");
		}

		if(listresourceemptyreasoncodingi == listresourceemptyreasoncodinglist.size()-1) {l.addListRsrcEmptyRsnCdgUsrSltd("]");}


		/******************** ListRsrc_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(listresourceemptyreasoncodingi == 0) {l.addListRsrcEmptyRsnCdgSys("[");}
		if(listresourceemptyreasoncoding.hasSystem()) {

			l.addListRsrcEmptyRsnCdgSys(String.valueOf(listresourceemptyreasoncoding.getSystem()));
		} else {
			l.addListRsrcEmptyRsnCdgSys("NULL");
		}

		if(listresourceemptyreasoncodingi == listresourceemptyreasoncodinglist.size()-1) {l.addListRsrcEmptyRsnCdgSys("]");}


		 };
		/******************** listresourceorderedby ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceorderedby = listresource.getOrderedBy();

		/******************** ListRsrc_OrdredBy_Txt ********************************************************************************/
		if(listresourceorderedby.hasText()) {

			l.addListRsrcOrdredByTxt(String.valueOf(listresourceorderedby.getText()));
		} else {
			l.addListRsrcOrdredByTxt("NULL");
		}


		/******************** listresourceorderedbycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> listresourceorderedbycodinglist = listresourceorderedby.getCoding();
		for(int listresourceorderedbycodingi = 0; listresourceorderedbycodingi<listresourceorderedbycodinglist.size();listresourceorderedbycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  listresourceorderedbycoding = listresourceorderedbycodinglist.get(listresourceorderedbycodingi);

		/******************** ListRsrc_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(listresourceorderedbycodingi == 0) {l.addListRsrcOrdredByCdgDsply("[");}
		if(listresourceorderedbycoding.hasDisplay()) {

			l.addListRsrcOrdredByCdgDsply(String.valueOf(listresourceorderedbycoding.getDisplay()));
		} else {
			l.addListRsrcOrdredByCdgDsply("NULL");
		}

		if(listresourceorderedbycodingi == listresourceorderedbycodinglist.size()-1) {l.addListRsrcOrdredByCdgDsply("]");}


		/******************** ListRsrc_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(listresourceorderedbycodingi == 0) {l.addListRsrcOrdredByCdgVrsn("[");}
		if(listresourceorderedbycoding.hasVersion()) {

			l.addListRsrcOrdredByCdgVrsn(String.valueOf(listresourceorderedbycoding.getVersion()));
		} else {
			l.addListRsrcOrdredByCdgVrsn("NULL");
		}

		if(listresourceorderedbycodingi == listresourceorderedbycodinglist.size()-1) {l.addListRsrcOrdredByCdgVrsn("]");}


		/******************** ListRsrc_OrdredBy_Cdg_Cd ********************************************************************************/
		if(listresourceorderedbycodingi == 0) {l.addListRsrcOrdredByCdgCd("[");}
		if(listresourceorderedbycoding.hasCode()) {

			l.addListRsrcOrdredByCdgCd(String.valueOf(listresourceorderedbycoding.getCode()));
		} else {
			l.addListRsrcOrdredByCdgCd("NULL");
		}

		if(listresourceorderedbycodingi == listresourceorderedbycodinglist.size()-1) {l.addListRsrcOrdredByCdgCd("]");}


		/******************** ListRsrc_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(listresourceorderedbycodingi == 0) {l.addListRsrcOrdredByCdgUsrSltd("[");}
		if(listresourceorderedbycoding.hasUserSelected()) {

			l.addListRsrcOrdredByCdgUsrSltd(String.valueOf(listresourceorderedbycoding.getUserSelected()));
		} else {
			l.addListRsrcOrdredByCdgUsrSltd("NULL");
		}

		if(listresourceorderedbycodingi == listresourceorderedbycodinglist.size()-1) {l.addListRsrcOrdredByCdgUsrSltd("]");}


		/******************** ListRsrc_OrdredBy_Cdg_Sys ********************************************************************************/
		if(listresourceorderedbycodingi == 0) {l.addListRsrcOrdredByCdgSys("[");}
		if(listresourceorderedbycoding.hasSystem()) {

			l.addListRsrcOrdredByCdgSys(String.valueOf(listresourceorderedbycoding.getSystem()));
		} else {
			l.addListRsrcOrdredByCdgSys("NULL");
		}

		if(listresourceorderedbycodingi == listresourceorderedbycodinglist.size()-1) {l.addListRsrcOrdredByCdgSys("]");}


		 };
		/******************** ListRsrc_Ttl ********************************************************************************/
		if(listresource.hasTitle()) {

			l.addListRsrcTtl(String.valueOf(listresource.getTitle()));
		} else {
			l.addListRsrcTtl("NULL");
		}


		return l;
	}
}
