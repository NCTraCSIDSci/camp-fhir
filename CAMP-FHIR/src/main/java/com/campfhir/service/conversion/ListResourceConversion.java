package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ListResource;
public class ListResourceConversion 
{
	public org.hl7.fhir.r4.model.ListResource ListResources(ListResource l) throws ParseException
	{
		org.hl7.fhir.r4.model.ListResource listresource = new org.hl7.fhir.r4.model.ListResource();

		/******************** id ********************************************************************************/
		listresource.setId(l.getId());

		/******************** listresourcecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourcecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		listresource.setCode(listresourcecode);

		/******************** listresourcecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourcecodecoding =  new org.hl7.fhir.r4.model.Coding();
		listresourcecode.addCoding(listresourcecodecoding);

		/******************** ListRsrc_Cd_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcCdCdgCd() != null) {
			listresourcecodecoding.setCode(l.getListRsrcCdCdgCd());
		}
		/******************** ListRsrc_Cd_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcCdCdgDsply() != null) {
			listresourcecodecoding.setDisplay(l.getListRsrcCdCdgDsply());
		}
		/******************** ListRsrc_Cd_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcCdCdgSys() != null) {
			listresourcecodecoding.setSystem(l.getListRsrcCdCdgSys());
		}
		/******************** ListRsrc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcCdCdgUsrSltd() != null) {
			listresourcecodecoding.setUserSelected(Boolean.parseBoolean(l.getListRsrcCdCdgUsrSltd()));
		}
		/******************** ListRsrc_Cd_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcCdCdgVrsn() != null) {
			listresourcecodecoding.setVersion(l.getListRsrcCdCdgVrsn());
		}
		/******************** ListRsrc_Cd_Txt ********************************************************************************/
		if(l.getListRsrcCdTxt() != null) {
			listresourcecode.setText(l.getListRsrcCdTxt());
		}
		/******************** ListRsrc_Dt ********************************************************************************/
		if(l.getListRsrcDt() != null) {
			java.text.SimpleDateFormat ListRsrc_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ListRsrc_Dtdate = ListRsrc_Dtsdf.parse(l.getListRsrcDt());
			listresource.setDate(ListRsrc_Dtdate);
		}
		/******************** listresourceemptyreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceemptyreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		listresource.setEmptyReason(listresourceemptyreason);

		/******************** listresourceemptyreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceemptyreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		listresourceemptyreason.addCoding(listresourceemptyreasoncoding);

		/******************** ListRsrc_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgCd() != null) {
			listresourceemptyreasoncoding.setCode(l.getListRsrcEmptyRsnCdgCd());
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgDsply() != null) {
			listresourceemptyreasoncoding.setDisplay(l.getListRsrcEmptyRsnCdgDsply());
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgSys() != null) {
			listresourceemptyreasoncoding.setSystem(l.getListRsrcEmptyRsnCdgSys());
		}
		/******************** ListRsrc_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgUsrSltd() != null) {
			listresourceemptyreasoncoding.setUserSelected(Boolean.parseBoolean(l.getListRsrcEmptyRsnCdgUsrSltd()));
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgVrsn() != null) {
			listresourceemptyreasoncoding.setVersion(l.getListRsrcEmptyRsnCdgVrsn());
		}
		/******************** ListRsrc_EmptyRsn_Txt ********************************************************************************/
		if(l.getListRsrcEmptyRsnTxt() != null) {
			listresourceemptyreason.setText(l.getListRsrcEmptyRsnTxt());
		}
		/******************** ListRsrc_Enc ********************************************************************************/
		if(l.getListRsrcEnc() != null) {
			listresource.setEncounter( new org.hl7.fhir.r4.model.Reference(l.getListRsrcEnc()));
		}
		/******************** listresourceentry ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListEntryComponent listresourceentry =  new org.hl7.fhir.r4.model.ListResource.ListEntryComponent();
		listresource.addEntry(listresourceentry);

		/******************** ListRsrc_Entry_Dt ********************************************************************************/
		if(l.getListRsrcEntryDt() != null) {
			java.text.SimpleDateFormat ListRsrc_Entry_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ListRsrc_Entry_Dtdate = ListRsrc_Entry_Dtsdf.parse(l.getListRsrcEntryDt());
			listresourceentry.setDate(ListRsrc_Entry_Dtdate);
		}
		/******************** ListRsrc_Entry_Deleted ********************************************************************************/
		if(l.getListRsrcEntryDeleted() != null) {
			listresourceentry.setDeleted(Boolean.parseBoolean(l.getListRsrcEntryDeleted()));
		}
		/******************** listresourceentryflag ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceentryflag =  new org.hl7.fhir.r4.model.CodeableConcept();
		listresourceentry.setFlag(listresourceentryflag);

		/******************** listresourceentryflagcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceentryflagcoding =  new org.hl7.fhir.r4.model.Coding();
		listresourceentryflag.addCoding(listresourceentryflagcoding);

		/******************** ListRsrc_Entry_Flag_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgCd() != null) {
			listresourceentryflagcoding.setCode(l.getListRsrcEntryFlagCdgCd());
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgDsply() != null) {
			listresourceentryflagcoding.setDisplay(l.getListRsrcEntryFlagCdgDsply());
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgSys() != null) {
			listresourceentryflagcoding.setSystem(l.getListRsrcEntryFlagCdgSys());
		}
		/******************** ListRsrc_Entry_Flag_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgUsrSltd() != null) {
			listresourceentryflagcoding.setUserSelected(Boolean.parseBoolean(l.getListRsrcEntryFlagCdgUsrSltd()));
		}
		/******************** ListRsrc_Entry_Flag_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgVrsn() != null) {
			listresourceentryflagcoding.setVersion(l.getListRsrcEntryFlagCdgVrsn());
		}
		/******************** ListRsrc_Entry_Flag_Txt ********************************************************************************/
		if(l.getListRsrcEntryFlagTxt() != null) {
			listresourceentryflag.setText(l.getListRsrcEntryFlagTxt());
		}
		/******************** ListRsrc_Entry_Itm ********************************************************************************/
		if(l.getListRsrcEntryItm() != null) {
			listresourceentry.setItem( new org.hl7.fhir.r4.model.Reference(l.getListRsrcEntryItm()));
		}
		/******************** listresourceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier listresourceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		listresource.addIdentifier(listresourceidentifier);

		/******************** ListRsrc_Id_Assigner ********************************************************************************/
		if(l.getListRsrcIdAssigner() != null) {
			listresourceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(l.getListRsrcIdAssigner()));
		}
		/******************** listresourceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period listresourceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		listresourceidentifier.setPeriod(listresourceidentifierperiod);

		/******************** ListRsrc_Id_Prd_End ********************************************************************************/
		if(l.getListRsrcIdPrdEnd() != null) {
			java.text.SimpleDateFormat ListRsrc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ListRsrc_Id_Prd_Enddate = ListRsrc_Id_Prd_Endsdf.parse(l.getListRsrcIdPrdEnd());
			listresourceidentifierperiod.setEnd(ListRsrc_Id_Prd_Enddate);
		}
		/******************** ListRsrc_Id_Prd_Strt ********************************************************************************/
		if(l.getListRsrcIdPrdStrt() != null) {
			java.text.SimpleDateFormat ListRsrc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ListRsrc_Id_Prd_Strtdate = ListRsrc_Id_Prd_Strtsdf.parse(l.getListRsrcIdPrdStrt());
			listresourceidentifierperiod.setStart(ListRsrc_Id_Prd_Strtdate);
		}
		/******************** ListRsrc_Id_Sys ********************************************************************************/
		if(l.getListRsrcIdSys() != null) {
			listresourceidentifier.setSystem(l.getListRsrcIdSys());
		}
		/******************** listresourceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		listresourceidentifier.setType(listresourceidentifiertype);

		/******************** listresourceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		listresourceidentifiertype.addCoding(listresourceidentifiertypecoding);

		/******************** ListRsrc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcIdTypCdgCd() != null) {
			listresourceidentifiertypecoding.setCode(l.getListRsrcIdTypCdgCd());
		}
		/******************** ListRsrc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcIdTypCdgDsply() != null) {
			listresourceidentifiertypecoding.setDisplay(l.getListRsrcIdTypCdgDsply());
		}
		/******************** ListRsrc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcIdTypCdgSys() != null) {
			listresourceidentifiertypecoding.setSystem(l.getListRsrcIdTypCdgSys());
		}
		/******************** ListRsrc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcIdTypCdgUsrSltd() != null) {
			listresourceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(l.getListRsrcIdTypCdgUsrSltd()));
		}
		/******************** ListRsrc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcIdTypCdgVrsn() != null) {
			listresourceidentifiertypecoding.setVersion(l.getListRsrcIdTypCdgVrsn());
		}
		/******************** ListRsrc_Id_Typ_Txt ********************************************************************************/
		if(l.getListRsrcIdTypTxt() != null) {
			listresourceidentifiertype.setText(l.getListRsrcIdTypTxt());
		}
		/******************** listresourceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory listresourceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		listresourceidentifier.setUse(listresourceidentifieruse.fromCode(l.getListRsrcIdUse()));

		/******************** ListRsrc_Id_Vl ********************************************************************************/
		if(l.getListRsrcIdVl() != null) {
			listresourceidentifier.setValue(l.getListRsrcIdVl());
		}
		/******************** listresourcemode ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListModeEnumFactory listresourcemode =  new org.hl7.fhir.r4.model.ListResource.ListModeEnumFactory();
		listresource.setMode(listresourcemode.fromCode(l.getListRsrcMode()));

		/******************** listresourcenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation listresourcenote =  new org.hl7.fhir.r4.model.Annotation();
		listresource.addNote(listresourcenote);

		/******************** ListRsrc_Nt_AthrRfrnc ********************************************************************************/
		if(l.getListRsrcNtAthrRfrnc() != null) {
			listresourcenote.setAuthor( new org.hl7.fhir.r4.model.Reference(l.getListRsrcNtAthrRfrnc()));
		}
		/******************** ListRsrc_Nt_AthrStrgTyp ********************************************************************************/
		if(l.getListRsrcNtAthrStrgTyp() != null) {
			listresourcenote.setAuthor( new org.hl7.fhir.r4.model.StringType(l.getListRsrcNtAthrStrgTyp()));
		}
		/******************** ListRsrc_Nt_Txt ********************************************************************************/
		if(l.getListRsrcNtTxt() != null) {
			listresourcenote.setText(l.getListRsrcNtTxt());
		}
		/******************** ListRsrc_Nt_Time ********************************************************************************/
		if(l.getListRsrcNtTime() != null) {
			java.text.SimpleDateFormat ListRsrc_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ListRsrc_Nt_Timedate = ListRsrc_Nt_Timesdf.parse(l.getListRsrcNtTime());
			listresourcenote.setTime(ListRsrc_Nt_Timedate);
		}
		/******************** listresourceorderedby ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept listresourceorderedby =  new org.hl7.fhir.r4.model.CodeableConcept();
		listresource.setOrderedBy(listresourceorderedby);

		/******************** listresourceorderedbycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding listresourceorderedbycoding =  new org.hl7.fhir.r4.model.Coding();
		listresourceorderedby.addCoding(listresourceorderedbycoding);

		/******************** ListRsrc_OrdredBy_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcOrdredByCdgCd() != null) {
			listresourceorderedbycoding.setCode(l.getListRsrcOrdredByCdgCd());
		}
		/******************** ListRsrc_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcOrdredByCdgDsply() != null) {
			listresourceorderedbycoding.setDisplay(l.getListRsrcOrdredByCdgDsply());
		}
		/******************** ListRsrc_OrdredBy_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcOrdredByCdgSys() != null) {
			listresourceorderedbycoding.setSystem(l.getListRsrcOrdredByCdgSys());
		}
		/******************** ListRsrc_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcOrdredByCdgUsrSltd() != null) {
			listresourceorderedbycoding.setUserSelected(Boolean.parseBoolean(l.getListRsrcOrdredByCdgUsrSltd()));
		}
		/******************** ListRsrc_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcOrdredByCdgVrsn() != null) {
			listresourceorderedbycoding.setVersion(l.getListRsrcOrdredByCdgVrsn());
		}
		/******************** ListRsrc_OrdredBy_Txt ********************************************************************************/
		if(l.getListRsrcOrdredByTxt() != null) {
			listresourceorderedby.setText(l.getListRsrcOrdredByTxt());
		}
		/******************** ListRsrc_Src ********************************************************************************/
		if(l.getListRsrcSrc() != null) {
			listresource.setSource( new org.hl7.fhir.r4.model.Reference(l.getListRsrcSrc()));
		}
		/******************** listresourcestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ListResource.ListStatusEnumFactory listresourcestatus =  new org.hl7.fhir.r4.model.ListResource.ListStatusEnumFactory();
		listresource.setStatus(listresourcestatus.fromCode(l.getListRsrcSts()));

		/******************** ListRsrc_Sbjct ********************************************************************************/
		if(l.getListRsrcSbjct() != null) {
			listresource.setSubject( new org.hl7.fhir.r4.model.Reference(l.getListRsrcSbjct()));
		}
		/******************** ListRsrc_Ttl ********************************************************************************/
		if(l.getListRsrcTtl() != null) {
			listresource.setTitle(l.getListRsrcTtl());
		}
		return listresource;
	}
}
