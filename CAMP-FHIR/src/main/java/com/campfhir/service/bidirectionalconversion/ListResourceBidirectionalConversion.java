package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ListResource;
public class ListResourceBidirectionalConversion 
{
	public ListResource ListResources(org.hl7.fhir.r4.model.ListResource listresource) throws ParseException
	{
		 main.java.com.campfhir.model.ListResource l = new  main.java.com.campfhir.model.ListResource();

		/******************** id ********************************************************************************/
		listresource.setId(l.getId());

		/******************** ListRsrc_Src ********************************************************************************/
		if(listresource.hasSource()) {
			l.setListRsrcSrc(String.valueOf(listresource.getSource()));
		}
		/******************** ListRsrc_Dt ********************************************************************************/
		if(listresource.hasDate()) {
			l.setListRsrcDt(String.valueOf(listresource.getDate()));
		}
		/******************** listresourcecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourcecode = listresource.getCode();

		/******************** listresourcecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourcecodecoding = listresourcecode.getCodingFirstRep();

		/******************** ListRsrc_Cd_Cdg_Dsply ********************************************************************************/
		if(listresourcecodecoding.hasDisplay()) {
			l.setListRsrcCdCdgDsply(String.valueOf(listresourcecodecoding.getDisplay()));
		}
		/******************** ListRsrc_Cd_Cdg_Vrsn ********************************************************************************/
		if(listresourcecodecoding.hasVersion()) {
			l.setListRsrcCdCdgVrsn(String.valueOf(listresourcecodecoding.getVersion()));
		}
		/******************** ListRsrc_Cd_Cdg_Cd ********************************************************************************/
		if(listresourcecodecoding.hasCode()) {
			l.setListRsrcCdCdgCd(String.valueOf(listresourcecodecoding.getCode()));
		}
		/******************** ListRsrc_Cd_Cdg_Sys ********************************************************************************/
		if(listresourcecodecoding.hasSystem()) {
			l.setListRsrcCdCdgSys(String.valueOf(listresourcecodecoding.getSystem()));
		}
		/******************** ListRsrc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(listresourcecodecoding.hasUserSelected()) {
			l.setListRsrcCdCdgUsrSltd(String.valueOf(listresourcecodecoding.getUserSelected()));
		}
		/******************** ListRsrc_Cd_Txt ********************************************************************************/
		if(listresourcecode.hasText()) {
			l.setListRsrcCdTxt(String.valueOf(listresourcecode.getText()));
		}
		/******************** ListRsrc_Sbjct ********************************************************************************/
		if(listresource.hasSubject()) {
			l.setListRsrcSbjct(String.valueOf(listresource.getSubject()));
		}
		/******************** listresourcestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListStatus listresourcestatus = listresource.getStatus();
		l.setListRsrcSts(listresourcestatus.toCode());

		/******************** ListRsrc_Enc ********************************************************************************/
		if(listresource.hasEncounter()) {
			l.setListRsrcEnc(String.valueOf(listresource.getEncounter()));
		}
		/******************** listresourcenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation listresourcenote = listresource.getNoteFirstRep();

		/******************** ListRsrc_Nt_Time ********************************************************************************/
		if(listresourcenote.hasTime()) {
			l.setListRsrcNtTime(String.valueOf(listresourcenote.getTime()));
		}
		/******************** ListRsrc_Nt_AthrRfrnc ********************************************************************************/
		if(listresourcenote.hasAuthorReference()) {
			l.setListRsrcNtAthrRfrnc(String.valueOf(listresourcenote.getAuthorReference()));
		}
		/******************** ListRsrc_Nt_Txt ********************************************************************************/
		if(listresourcenote.hasText()) {
			l.setListRsrcNtTxt(String.valueOf(listresourcenote.getText()));
		}
		/******************** ListRsrc_Nt_AthrStrgTyp ********************************************************************************/
		if(listresourcenote.hasAuthorStringType()) {
			l.setListRsrcNtAthrStrgTyp(String.valueOf(listresourcenote.getAuthorStringType()));
		}
		/******************** ListRsrc_Ttl ********************************************************************************/
		if(listresource.hasTitle()) {
			l.setListRsrcTtl(String.valueOf(listresource.getTitle()));
		}
		/******************** listresourceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier listresourceidentifier = listresource.getIdentifierFirstRep();

		/******************** ListRsrc_Id_Vl ********************************************************************************/
		if(listresourceidentifier.hasValue()) {
			l.setListRsrcIdVl(String.valueOf(listresourceidentifier.getValue()));
		}
		/******************** listresourceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceidentifiertype = listresourceidentifier.getType();

		/******************** listresourceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceidentifiertypecoding = listresourceidentifiertype.getCodingFirstRep();

		/******************** ListRsrc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(listresourceidentifiertypecoding.hasDisplay()) {
			l.setListRsrcIdTypCdgDsply(String.valueOf(listresourceidentifiertypecoding.getDisplay()));
		}
		/******************** ListRsrc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(listresourceidentifiertypecoding.hasVersion()) {
			l.setListRsrcIdTypCdgVrsn(String.valueOf(listresourceidentifiertypecoding.getVersion()));
		}
		/******************** ListRsrc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(listresourceidentifiertypecoding.hasCode()) {
			l.setListRsrcIdTypCdgCd(String.valueOf(listresourceidentifiertypecoding.getCode()));
		}
		/******************** ListRsrc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(listresourceidentifiertypecoding.hasSystem()) {
			l.setListRsrcIdTypCdgSys(String.valueOf(listresourceidentifiertypecoding.getSystem()));
		}
		/******************** ListRsrc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(listresourceidentifiertypecoding.hasUserSelected()) {
			l.setListRsrcIdTypCdgUsrSltd(String.valueOf(listresourceidentifiertypecoding.getUserSelected()));
		}
		/******************** ListRsrc_Id_Typ_Txt ********************************************************************************/
		if(listresourceidentifiertype.hasText()) {
			l.setListRsrcIdTypTxt(String.valueOf(listresourceidentifiertype.getText()));
		}
		/******************** ListRsrc_Id_Sys ********************************************************************************/
		if(listresourceidentifier.hasSystem()) {
			l.setListRsrcIdSys(String.valueOf(listresourceidentifier.getSystem()));
		}
		/******************** ListRsrc_Id_Assigner ********************************************************************************/
		if(listresourceidentifier.hasAssigner()) {
			l.setListRsrcIdAssigner(String.valueOf(listresourceidentifier.getAssigner()));
		}
		/******************** listresourceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period listresourceidentifierperiod = listresourceidentifier.getPeriod();

		/******************** ListRsrc_Id_Prd_End ********************************************************************************/
		if(listresourceidentifierperiod.hasEnd()) {
			l.setListRsrcIdPrdEnd(String.valueOf(listresourceidentifierperiod.getEnd()));
		}
		/******************** ListRsrc_Id_Prd_Strt ********************************************************************************/
		if(listresourceidentifierperiod.hasStart()) {
			l.setListRsrcIdPrdStrt(String.valueOf(listresourceidentifierperiod.getStart()));
		}
		/******************** listresourceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse listresourceidentifieruse = listresourceidentifier.getUse();
		l.setListRsrcIdUse(listresourceidentifieruse.toCode());

		/******************** listresourcemode ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListMode listresourcemode = listresource.getMode();
		l.setListRsrcMode(listresourcemode.toCode());

		/******************** listresourceentry ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListEntryComponent listresourceentry = listresource.getEntryFirstRep();

		/******************** ListRsrc_Entry_Itm ********************************************************************************/
		if(listresourceentry.hasItem()) {
			l.setListRsrcEntryItm(String.valueOf(listresourceentry.getItem()));
		}
		/******************** ListRsrc_Entry_Dt ********************************************************************************/
		if(listresourceentry.hasDate()) {
			l.setListRsrcEntryDt(String.valueOf(listresourceentry.getDate()));
		}
		/******************** ListRsrc_Entry_Deleted ********************************************************************************/
		if(listresourceentry.hasDeleted()) {
			l.setListRsrcEntryDeleted(String.valueOf(listresourceentry.getDeleted()));
		}
		/******************** listresourceentryflag ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceentryflag = listresourceentry.getFlag();

		/******************** listresourceentryflagcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceentryflagcoding = listresourceentryflag.getCodingFirstRep();

		/******************** ListRsrc_Entry_Flag_Cdg_Dsply ********************************************************************************/
		if(listresourceentryflagcoding.hasDisplay()) {
			l.setListRsrcEntryFlagCdgDsply(String.valueOf(listresourceentryflagcoding.getDisplay()));
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Vrsn ********************************************************************************/
		if(listresourceentryflagcoding.hasVersion()) {
			l.setListRsrcEntryFlagCdgVrsn(String.valueOf(listresourceentryflagcoding.getVersion()));
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Cd ********************************************************************************/
		if(listresourceentryflagcoding.hasCode()) {
			l.setListRsrcEntryFlagCdgCd(String.valueOf(listresourceentryflagcoding.getCode()));
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Sys ********************************************************************************/
		if(listresourceentryflagcoding.hasSystem()) {
			l.setListRsrcEntryFlagCdgSys(String.valueOf(listresourceentryflagcoding.getSystem()));
		}
		/******************** ListRsrc_Entry_Flag_Cdg_UsrSltd ********************************************************************************/
		if(listresourceentryflagcoding.hasUserSelected()) {
			l.setListRsrcEntryFlagCdgUsrSltd(String.valueOf(listresourceentryflagcoding.getUserSelected()));
		}
		/******************** ListRsrc_Entry_Flag_Txt ********************************************************************************/
		if(listresourceentryflag.hasText()) {
			l.setListRsrcEntryFlagTxt(String.valueOf(listresourceentryflag.getText()));
		}
		/******************** listresourceemptyreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceemptyreason = listresource.getEmptyReason();

		/******************** listresourceemptyreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceemptyreasoncoding = listresourceemptyreason.getCodingFirstRep();

		/******************** ListRsrc_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(listresourceemptyreasoncoding.hasDisplay()) {
			l.setListRsrcEmptyRsnCdgDsply(String.valueOf(listresourceemptyreasoncoding.getDisplay()));
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(listresourceemptyreasoncoding.hasVersion()) {
			l.setListRsrcEmptyRsnCdgVrsn(String.valueOf(listresourceemptyreasoncoding.getVersion()));
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(listresourceemptyreasoncoding.hasCode()) {
			l.setListRsrcEmptyRsnCdgCd(String.valueOf(listresourceemptyreasoncoding.getCode()));
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(listresourceemptyreasoncoding.hasSystem()) {
			l.setListRsrcEmptyRsnCdgSys(String.valueOf(listresourceemptyreasoncoding.getSystem()));
		}
		/******************** ListRsrc_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(listresourceemptyreasoncoding.hasUserSelected()) {
			l.setListRsrcEmptyRsnCdgUsrSltd(String.valueOf(listresourceemptyreasoncoding.getUserSelected()));
		}
		/******************** ListRsrc_EmptyRsn_Txt ********************************************************************************/
		if(listresourceemptyreason.hasText()) {
			l.setListRsrcEmptyRsnTxt(String.valueOf(listresourceemptyreason.getText()));
		}
		/******************** listresourceorderedby ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceorderedby = listresource.getOrderedBy();

		/******************** listresourceorderedbycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceorderedbycoding = listresourceorderedby.getCodingFirstRep();

		/******************** ListRsrc_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(listresourceorderedbycoding.hasDisplay()) {
			l.setListRsrcOrdredByCdgDsply(String.valueOf(listresourceorderedbycoding.getDisplay()));
		}
		/******************** ListRsrc_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(listresourceorderedbycoding.hasVersion()) {
			l.setListRsrcOrdredByCdgVrsn(String.valueOf(listresourceorderedbycoding.getVersion()));
		}
		/******************** ListRsrc_OrdredBy_Cdg_Cd ********************************************************************************/
		if(listresourceorderedbycoding.hasCode()) {
			l.setListRsrcOrdredByCdgCd(String.valueOf(listresourceorderedbycoding.getCode()));
		}
		/******************** ListRsrc_OrdredBy_Cdg_Sys ********************************************************************************/
		if(listresourceorderedbycoding.hasSystem()) {
			l.setListRsrcOrdredByCdgSys(String.valueOf(listresourceorderedbycoding.getSystem()));
		}
		/******************** ListRsrc_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(listresourceorderedbycoding.hasUserSelected()) {
			l.setListRsrcOrdredByCdgUsrSltd(String.valueOf(listresourceorderedbycoding.getUserSelected()));
		}
		/******************** ListRsrc_OrdredBy_Txt ********************************************************************************/
		if(listresourceorderedby.hasText()) {
			l.setListRsrcOrdredByTxt(String.valueOf(listresourceorderedby.getText()));
		}
		return l;
	}
}
