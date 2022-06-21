package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.FamilyMemberHistory;
public class FamilyMemberHistoryBidirectionalConversion 
{
	public FamilyMemberHistory FamilyMemberHistorys(org.hl7.fhir.r4.model.FamilyMemberHistory familymemberhistory) throws ParseException
	{
		 main.java.com.campfhir.model.FamilyMemberHistory f = new  main.java.com.campfhir.model.FamilyMemberHistory();

		/******************** id ********************************************************************************/
		familymemberhistory.setId(f.getId());

		/******************** FmlyMmbrHis_Nm ********************************************************************************/
		if(familymemberhistory.hasName()) {
			f.setFmlyMmbrHisNm(String.valueOf(familymemberhistory.getName()));
		}
		/******************** FmlyMmbrHis_Dt ********************************************************************************/
		if(familymemberhistory.hasDate()) {
			f.setFmlyMmbrHisDt(String.valueOf(familymemberhistory.getDate()));
		}
		/******************** familymemberhistorydataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorydataabsentreason = familymemberhistory.getDataAbsentReason();

		/******************** familymemberhistorydataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistorydataabsentreasoncoding = familymemberhistorydataabsentreason.getCodingFirstRep();

		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(familymemberhistorydataabsentreasoncoding.hasDisplay()) {
			f.setFmlyMmbrHisDataAbsentRsnCdgDsply(String.valueOf(familymemberhistorydataabsentreasoncoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistorydataabsentreasoncoding.hasVersion()) {
			f.setFmlyMmbrHisDataAbsentRsnCdgVrsn(String.valueOf(familymemberhistorydataabsentreasoncoding.getVersion()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(familymemberhistorydataabsentreasoncoding.hasCode()) {
			f.setFmlyMmbrHisDataAbsentRsnCdgCd(String.valueOf(familymemberhistorydataabsentreasoncoding.getCode()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(familymemberhistorydataabsentreasoncoding.hasSystem()) {
			f.setFmlyMmbrHisDataAbsentRsnCdgSys(String.valueOf(familymemberhistorydataabsentreasoncoding.getSystem()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistorydataabsentreasoncoding.hasUserSelected()) {
			f.setFmlyMmbrHisDataAbsentRsnCdgUsrSltd(String.valueOf(familymemberhistorydataabsentreasoncoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Txt ********************************************************************************/
		if(familymemberhistorydataabsentreason.hasText()) {
			f.setFmlyMmbrHisDataAbsentRsnTxt(String.valueOf(familymemberhistorydataabsentreason.getText()));
		}
		/******************** FmlyMmbrHis_DeceasedStrgTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedStringType()) {
			f.setFmlyMmbrHisDeceasedStrgTyp(String.valueOf(familymemberhistory.getDeceasedStringType()));
		}
		/******************** FmlyMmbrHis_DeceasedDtTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedDateType()) {
			f.setFmlyMmbrHisDeceasedDtTyp(String.valueOf(familymemberhistory.getDeceasedDateType()));
		}
		/******************** FmlyMmbrHis_BornStrgTyp ********************************************************************************/
		if(familymemberhistory.hasBornStringType()) {
			f.setFmlyMmbrHisBornStrgTyp(String.valueOf(familymemberhistory.getBornStringType()));
		}
		/******************** familymemberhistoryagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryagerange = familymemberhistory.getAgeRange();

		/******************** familymemberhistoryagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangelow = familymemberhistoryagerange.getLow();

		/******************** FmlyMmbrHis_AgeRng_Lw_Vl ********************************************************************************/
		if(familymemberhistoryagerangelow.hasValue()) {
			f.setFmlyMmbrHisAgeRngLwVl(String.valueOf(familymemberhistoryagerangelow.getValue()));
		}
		/******************** familymemberhistoryagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryagerangelowcomparator = familymemberhistoryagerangelow.getComparator();
		f.setFmlyMmbrHisAgeRngLwCmprtr(familymemberhistoryagerangelowcomparator.toCode());

		/******************** FmlyMmbrHis_AgeRng_Lw_Cd ********************************************************************************/
		if(familymemberhistoryagerangelow.hasCode()) {
			f.setFmlyMmbrHisAgeRngLwCd(String.valueOf(familymemberhistoryagerangelow.getCode()));
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Sys ********************************************************************************/
		if(familymemberhistoryagerangelow.hasSystem()) {
			f.setFmlyMmbrHisAgeRngLwSys(String.valueOf(familymemberhistoryagerangelow.getSystem()));
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Unt ********************************************************************************/
		if(familymemberhistoryagerangelow.hasUnit()) {
			f.setFmlyMmbrHisAgeRngLwUnt(String.valueOf(familymemberhistoryagerangelow.getUnit()));
		}
		/******************** familymemberhistoryagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangehigh = familymemberhistoryagerange.getHigh();

		/******************** FmlyMmbrHis_AgeRng_Hi_Vl ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasValue()) {
			f.setFmlyMmbrHisAgeRngHiVl(String.valueOf(familymemberhistoryagerangehigh.getValue()));
		}
		/******************** familymemberhistoryagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryagerangehighcomparator = familymemberhistoryagerangehigh.getComparator();
		f.setFmlyMmbrHisAgeRngHiCmprtr(familymemberhistoryagerangehighcomparator.toCode());

		/******************** FmlyMmbrHis_AgeRng_Hi_Cd ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasCode()) {
			f.setFmlyMmbrHisAgeRngHiCd(String.valueOf(familymemberhistoryagerangehigh.getCode()));
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Sys ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasSystem()) {
			f.setFmlyMmbrHisAgeRngHiSys(String.valueOf(familymemberhistoryagerangehigh.getSystem()));
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Unt ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasUnit()) {
			f.setFmlyMmbrHisAgeRngHiUnt(String.valueOf(familymemberhistoryagerangehigh.getUnit()));
		}
		/******************** familymemberhistorysex ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorysex = familymemberhistory.getSex();

		/******************** familymemberhistorysexcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistorysexcoding = familymemberhistorysex.getCodingFirstRep();

		/******************** FmlyMmbrHis_Sex_Cdg_Dsply ********************************************************************************/
		if(familymemberhistorysexcoding.hasDisplay()) {
			f.setFmlyMmbrHisSexCdgDsply(String.valueOf(familymemberhistorysexcoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistorysexcoding.hasVersion()) {
			f.setFmlyMmbrHisSexCdgVrsn(String.valueOf(familymemberhistorysexcoding.getVersion()));
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Cd ********************************************************************************/
		if(familymemberhistorysexcoding.hasCode()) {
			f.setFmlyMmbrHisSexCdgCd(String.valueOf(familymemberhistorysexcoding.getCode()));
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Sys ********************************************************************************/
		if(familymemberhistorysexcoding.hasSystem()) {
			f.setFmlyMmbrHisSexCdgSys(String.valueOf(familymemberhistorysexcoding.getSystem()));
		}
		/******************** FmlyMmbrHis_Sex_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistorysexcoding.hasUserSelected()) {
			f.setFmlyMmbrHisSexCdgUsrSltd(String.valueOf(familymemberhistorysexcoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_Sex_Txt ********************************************************************************/
		if(familymemberhistorysex.hasText()) {
			f.setFmlyMmbrHisSexTxt(String.valueOf(familymemberhistorysex.getText()));
		}
		/******************** familymemberhistorybornperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistorybornperiod = familymemberhistory.getBornPeriod();

		/******************** FmlyMmbrHis_BornPrd_End ********************************************************************************/
		if(familymemberhistorybornperiod.hasEnd()) {
			f.setFmlyMmbrHisBornPrdEnd(String.valueOf(familymemberhistorybornperiod.getEnd()));
		}
		/******************** FmlyMmbrHis_BornPrd_Strt ********************************************************************************/
		if(familymemberhistorybornperiod.hasStart()) {
			f.setFmlyMmbrHisBornPrdStrt(String.valueOf(familymemberhistorybornperiod.getStart()));
		}
		/******************** familymemberhistoryageage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryageage = familymemberhistory.getAgeAge();

		/******************** FmlyMmbrHis_BornDtTyp ********************************************************************************/
		if(familymemberhistory.hasBornDateType()) {
			f.setFmlyMmbrHisBornDtTyp(String.valueOf(familymemberhistory.getBornDateType()));
		}
		/******************** FmlyMmbrHis_AgeStrgTyp ********************************************************************************/
		if(familymemberhistory.hasAgeStringType()) {
			f.setFmlyMmbrHisAgeStrgTyp(String.valueOf(familymemberhistory.getAgeStringType()));
		}
		/******************** FmlyMmbrHis_EstmtdAge ********************************************************************************/
		if(familymemberhistory.hasEstimatedAge()) {
			f.setFmlyMmbrHisEstmtdAge(String.valueOf(familymemberhistory.getEstimatedAge()));
		}
		/******************** familymemberhistorydeceasedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistorydeceasedage = familymemberhistory.getDeceasedAge();

		/******************** familymemberhistorydeceasedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistorydeceasedrange = familymemberhistory.getDeceasedRange();

		/******************** familymemberhistorydeceasedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangelow = familymemberhistorydeceasedrange.getLow();

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Vl ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasValue()) {
			f.setFmlyMmbrHisDeceasedRngLwVl(String.valueOf(familymemberhistorydeceasedrangelow.getValue()));
		}
		/******************** familymemberhistorydeceasedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistorydeceasedrangelowcomparator = familymemberhistorydeceasedrangelow.getComparator();
		f.setFmlyMmbrHisDeceasedRngLwCmprtr(familymemberhistorydeceasedrangelowcomparator.toCode());

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Cd ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasCode()) {
			f.setFmlyMmbrHisDeceasedRngLwCd(String.valueOf(familymemberhistorydeceasedrangelow.getCode()));
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Sys ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasSystem()) {
			f.setFmlyMmbrHisDeceasedRngLwSys(String.valueOf(familymemberhistorydeceasedrangelow.getSystem()));
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Unt ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasUnit()) {
			f.setFmlyMmbrHisDeceasedRngLwUnt(String.valueOf(familymemberhistorydeceasedrangelow.getUnit()));
		}
		/******************** familymemberhistorydeceasedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangehigh = familymemberhistorydeceasedrange.getHigh();

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Vl ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasValue()) {
			f.setFmlyMmbrHisDeceasedRngHiVl(String.valueOf(familymemberhistorydeceasedrangehigh.getValue()));
		}
		/******************** familymemberhistorydeceasedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistorydeceasedrangehighcomparator = familymemberhistorydeceasedrangehigh.getComparator();
		f.setFmlyMmbrHisDeceasedRngHiCmprtr(familymemberhistorydeceasedrangehighcomparator.toCode());

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Cd ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasCode()) {
			f.setFmlyMmbrHisDeceasedRngHiCd(String.valueOf(familymemberhistorydeceasedrangehigh.getCode()));
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Sys ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasSystem()) {
			f.setFmlyMmbrHisDeceasedRngHiSys(String.valueOf(familymemberhistorydeceasedrangehigh.getSystem()));
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Unt ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasUnit()) {
			f.setFmlyMmbrHisDeceasedRngHiUnt(String.valueOf(familymemberhistorydeceasedrangehigh.getUnit()));
		}
		/******************** familymemberhistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatus familymemberhistorystatus = familymemberhistory.getStatus();
		f.setFmlyMmbrHisSts(familymemberhistorystatus.toCode());

		/******************** familymemberhistorynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation familymemberhistorynote = familymemberhistory.getNoteFirstRep();

		/******************** FmlyMmbrHis_Nt_Time ********************************************************************************/
		if(familymemberhistorynote.hasTime()) {
			f.setFmlyMmbrHisNtTime(String.valueOf(familymemberhistorynote.getTime()));
		}
		/******************** FmlyMmbrHis_Nt_AthrRfrnc ********************************************************************************/
		if(familymemberhistorynote.hasAuthorReference()) {
			f.setFmlyMmbrHisNtAthrRfrnc(String.valueOf(familymemberhistorynote.getAuthorReference()));
		}
		/******************** FmlyMmbrHis_Nt_Txt ********************************************************************************/
		if(familymemberhistorynote.hasText()) {
			f.setFmlyMmbrHisNtTxt(String.valueOf(familymemberhistorynote.getText()));
		}
		/******************** FmlyMmbrHis_Nt_AthrStrgTyp ********************************************************************************/
		if(familymemberhistorynote.hasAuthorStringType()) {
			f.setFmlyMmbrHisNtAthrStrgTyp(String.valueOf(familymemberhistorynote.getAuthorStringType()));
		}
		/******************** FmlyMmbrHis_DeceasedBooleanTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedBooleanType()) {
			f.setFmlyMmbrHisDeceasedBooleanTyp(String.valueOf(familymemberhistory.getDeceasedBooleanType()));
		}
		/******************** FmlyMmbrHis_Pnt ********************************************************************************/
		if(familymemberhistory.hasPatient()) {
			f.setFmlyMmbrHisPnt(String.valueOf(familymemberhistory.getPatient()));
		}
		/******************** FmlyMmbrHis_RsnRfrnc ********************************************************************************/
		if(familymemberhistory.hasReasonReference()) {
			f.setFmlyMmbrHisRsnRfrnc(String.valueOf(familymemberhistory.getReasonReferenceFirstRep()));
		}
		/******************** familymemberhistoryreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryreasoncode = familymemberhistory.getReasonCodeFirstRep();

		/******************** familymemberhistoryreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryreasoncodecoding = familymemberhistoryreasoncode.getCodingFirstRep();

		/******************** FmlyMmbrHis_RsnCd_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryreasoncodecoding.hasDisplay()) {
			f.setFmlyMmbrHisRsnCdCdgDsply(String.valueOf(familymemberhistoryreasoncodecoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryreasoncodecoding.hasVersion()) {
			f.setFmlyMmbrHisRsnCdCdgVrsn(String.valueOf(familymemberhistoryreasoncodecoding.getVersion()));
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryreasoncodecoding.hasCode()) {
			f.setFmlyMmbrHisRsnCdCdgCd(String.valueOf(familymemberhistoryreasoncodecoding.getCode()));
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryreasoncodecoding.hasSystem()) {
			f.setFmlyMmbrHisRsnCdCdgSys(String.valueOf(familymemberhistoryreasoncodecoding.getSystem()));
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryreasoncodecoding.hasUserSelected()) {
			f.setFmlyMmbrHisRsnCdCdgUsrSltd(String.valueOf(familymemberhistoryreasoncodecoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_RsnCd_Txt ********************************************************************************/
		if(familymemberhistoryreasoncode.hasText()) {
			f.setFmlyMmbrHisRsnCdTxt(String.valueOf(familymemberhistoryreasoncode.getText()));
		}
		/******************** familymemberhistoryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier familymemberhistoryidentifier = familymemberhistory.getIdentifierFirstRep();

		/******************** FmlyMmbrHis_Id_Vl ********************************************************************************/
		if(familymemberhistoryidentifier.hasValue()) {
			f.setFmlyMmbrHisIdVl(String.valueOf(familymemberhistoryidentifier.getValue()));
		}
		/******************** familymemberhistoryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryidentifiertype = familymemberhistoryidentifier.getType();

		/******************** familymemberhistoryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryidentifiertypecoding = familymemberhistoryidentifiertype.getCodingFirstRep();

		/******************** FmlyMmbrHis_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryidentifiertypecoding.hasDisplay()) {
			f.setFmlyMmbrHisIdTypCdgDsply(String.valueOf(familymemberhistoryidentifiertypecoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryidentifiertypecoding.hasVersion()) {
			f.setFmlyMmbrHisIdTypCdgVrsn(String.valueOf(familymemberhistoryidentifiertypecoding.getVersion()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryidentifiertypecoding.hasCode()) {
			f.setFmlyMmbrHisIdTypCdgCd(String.valueOf(familymemberhistoryidentifiertypecoding.getCode()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryidentifiertypecoding.hasSystem()) {
			f.setFmlyMmbrHisIdTypCdgSys(String.valueOf(familymemberhistoryidentifiertypecoding.getSystem()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryidentifiertypecoding.hasUserSelected()) {
			f.setFmlyMmbrHisIdTypCdgUsrSltd(String.valueOf(familymemberhistoryidentifiertypecoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Txt ********************************************************************************/
		if(familymemberhistoryidentifiertype.hasText()) {
			f.setFmlyMmbrHisIdTypTxt(String.valueOf(familymemberhistoryidentifiertype.getText()));
		}
		/******************** FmlyMmbrHis_Id_Sys ********************************************************************************/
		if(familymemberhistoryidentifier.hasSystem()) {
			f.setFmlyMmbrHisIdSys(String.valueOf(familymemberhistoryidentifier.getSystem()));
		}
		/******************** FmlyMmbrHis_Id_Assigner ********************************************************************************/
		if(familymemberhistoryidentifier.hasAssigner()) {
			f.setFmlyMmbrHisIdAssigner(String.valueOf(familymemberhistoryidentifier.getAssigner()));
		}
		/******************** familymemberhistoryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryidentifierperiod = familymemberhistoryidentifier.getPeriod();

		/******************** FmlyMmbrHis_Id_Prd_End ********************************************************************************/
		if(familymemberhistoryidentifierperiod.hasEnd()) {
			f.setFmlyMmbrHisIdPrdEnd(String.valueOf(familymemberhistoryidentifierperiod.getEnd()));
		}
		/******************** FmlyMmbrHis_Id_Prd_Strt ********************************************************************************/
		if(familymemberhistoryidentifierperiod.hasStart()) {
			f.setFmlyMmbrHisIdPrdStrt(String.valueOf(familymemberhistoryidentifierperiod.getStart()));
		}
		/******************** familymemberhistoryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse familymemberhistoryidentifieruse = familymemberhistoryidentifier.getUse();
		f.setFmlyMmbrHisIdUse(familymemberhistoryidentifieruse.toCode());

		/******************** familymemberhistoryrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryrelationship = familymemberhistory.getRelationship();

		/******************** familymemberhistoryrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryrelationshipcoding = familymemberhistoryrelationship.getCodingFirstRep();

		/******************** FmlyMmbrHis_Rltnship_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryrelationshipcoding.hasDisplay()) {
			f.setFmlyMmbrHisRltnshipCdgDsply(String.valueOf(familymemberhistoryrelationshipcoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryrelationshipcoding.hasVersion()) {
			f.setFmlyMmbrHisRltnshipCdgVrsn(String.valueOf(familymemberhistoryrelationshipcoding.getVersion()));
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryrelationshipcoding.hasCode()) {
			f.setFmlyMmbrHisRltnshipCdgCd(String.valueOf(familymemberhistoryrelationshipcoding.getCode()));
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryrelationshipcoding.hasSystem()) {
			f.setFmlyMmbrHisRltnshipCdgSys(String.valueOf(familymemberhistoryrelationshipcoding.getSystem()));
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryrelationshipcoding.hasUserSelected()) {
			f.setFmlyMmbrHisRltnshipCdgUsrSltd(String.valueOf(familymemberhistoryrelationshipcoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_Rltnship_Txt ********************************************************************************/
		if(familymemberhistoryrelationship.hasText()) {
			f.setFmlyMmbrHisRltnshipTxt(String.valueOf(familymemberhistoryrelationship.getText()));
		}
		/******************** familymemberhistorycondition ********************************************************************************/
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent familymemberhistorycondition = familymemberhistory.getConditionFirstRep();

		/******************** familymemberhistoryconditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditioncode = familymemberhistorycondition.getCode();

		/******************** familymemberhistoryconditioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryconditioncodecoding = familymemberhistoryconditioncode.getCodingFirstRep();

		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryconditioncodecoding.hasDisplay()) {
			f.setFmlyMmbrHisCndtnCdCdgDsply(String.valueOf(familymemberhistoryconditioncodecoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryconditioncodecoding.hasVersion()) {
			f.setFmlyMmbrHisCndtnCdCdgVrsn(String.valueOf(familymemberhistoryconditioncodecoding.getVersion()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryconditioncodecoding.hasCode()) {
			f.setFmlyMmbrHisCndtnCdCdgCd(String.valueOf(familymemberhistoryconditioncodecoding.getCode()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryconditioncodecoding.hasSystem()) {
			f.setFmlyMmbrHisCndtnCdCdgSys(String.valueOf(familymemberhistoryconditioncodecoding.getSystem()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryconditioncodecoding.hasUserSelected()) {
			f.setFmlyMmbrHisCndtnCdCdgUsrSltd(String.valueOf(familymemberhistoryconditioncodecoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Txt ********************************************************************************/
		if(familymemberhistoryconditioncode.hasText()) {
			f.setFmlyMmbrHisCndtnCdTxt(String.valueOf(familymemberhistoryconditioncode.getText()));
		}
		/******************** familymemberhistoryconditionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation familymemberhistoryconditionnote = familymemberhistorycondition.getNoteFirstRep();

		/******************** FmlyMmbrHis_Cndtn_Nt_Time ********************************************************************************/
		if(familymemberhistoryconditionnote.hasTime()) {
			f.setFmlyMmbrHisCndtnNtTime(String.valueOf(familymemberhistoryconditionnote.getTime()));
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(familymemberhistoryconditionnote.hasAuthorReference()) {
			f.setFmlyMmbrHisCndtnNtAthrRfrnc(String.valueOf(familymemberhistoryconditionnote.getAuthorReference()));
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_Txt ********************************************************************************/
		if(familymemberhistoryconditionnote.hasText()) {
			f.setFmlyMmbrHisCndtnNtTxt(String.valueOf(familymemberhistoryconditionnote.getText()));
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(familymemberhistoryconditionnote.hasAuthorStringType()) {
			f.setFmlyMmbrHisCndtnNtAthrStrgTyp(String.valueOf(familymemberhistoryconditionnote.getAuthorStringType()));
		}
		/******************** familymemberhistoryconditionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditionoutcome = familymemberhistorycondition.getOutcome();

		/******************** familymemberhistoryconditionoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryconditionoutcomecoding = familymemberhistoryconditionoutcome.getCodingFirstRep();

		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryconditionoutcomecoding.hasDisplay()) {
			f.setFmlyMmbrHisCndtnOutcomeCdgDsply(String.valueOf(familymemberhistoryconditionoutcomecoding.getDisplay()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryconditionoutcomecoding.hasVersion()) {
			f.setFmlyMmbrHisCndtnOutcomeCdgVrsn(String.valueOf(familymemberhistoryconditionoutcomecoding.getVersion()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryconditionoutcomecoding.hasCode()) {
			f.setFmlyMmbrHisCndtnOutcomeCdgCd(String.valueOf(familymemberhistoryconditionoutcomecoding.getCode()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryconditionoutcomecoding.hasSystem()) {
			f.setFmlyMmbrHisCndtnOutcomeCdgSys(String.valueOf(familymemberhistoryconditionoutcomecoding.getSystem()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryconditionoutcomecoding.hasUserSelected()) {
			f.setFmlyMmbrHisCndtnOutcomeCdgUsrSltd(String.valueOf(familymemberhistoryconditionoutcomecoding.getUserSelected()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Txt ********************************************************************************/
		if(familymemberhistoryconditionoutcome.hasText()) {
			f.setFmlyMmbrHisCndtnOutcomeTxt(String.valueOf(familymemberhistoryconditionoutcome.getText()));
		}
		/******************** familymemberhistoryconditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryconditiononrange = familymemberhistorycondition.getOnsetRange();

		/******************** familymemberhistoryconditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangelow = familymemberhistoryconditiononrange.getLow();

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasValue()) {
			f.setFmlyMmbrHisCndtnOnRngLwVl(String.valueOf(familymemberhistoryconditiononrangelow.getValue()));
		}
		/******************** familymemberhistoryconditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryconditiononrangelowcomparator = familymemberhistoryconditiononrangelow.getComparator();
		f.setFmlyMmbrHisCndtnOnRngLwCmprtr(familymemberhistoryconditiononrangelowcomparator.toCode());

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasCode()) {
			f.setFmlyMmbrHisCndtnOnRngLwCd(String.valueOf(familymemberhistoryconditiononrangelow.getCode()));
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasSystem()) {
			f.setFmlyMmbrHisCndtnOnRngLwSys(String.valueOf(familymemberhistoryconditiononrangelow.getSystem()));
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasUnit()) {
			f.setFmlyMmbrHisCndtnOnRngLwUnt(String.valueOf(familymemberhistoryconditiononrangelow.getUnit()));
		}
		/******************** familymemberhistoryconditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangehigh = familymemberhistoryconditiononrange.getHigh();

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasValue()) {
			f.setFmlyMmbrHisCndtnOnRngHiVl(String.valueOf(familymemberhistoryconditiononrangehigh.getValue()));
		}
		/******************** familymemberhistoryconditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryconditiononrangehighcomparator = familymemberhistoryconditiononrangehigh.getComparator();
		f.setFmlyMmbrHisCndtnOnRngHiCmprtr(familymemberhistoryconditiononrangehighcomparator.toCode());

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasCode()) {
			f.setFmlyMmbrHisCndtnOnRngHiCd(String.valueOf(familymemberhistoryconditiononrangehigh.getCode()));
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasSystem()) {
			f.setFmlyMmbrHisCndtnOnRngHiSys(String.valueOf(familymemberhistoryconditiononrangehigh.getSystem()));
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasUnit()) {
			f.setFmlyMmbrHisCndtnOnRngHiUnt(String.valueOf(familymemberhistoryconditiononrangehigh.getUnit()));
		}
		/******************** familymemberhistoryconditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryconditiononperiod = familymemberhistorycondition.getOnsetPeriod();

		/******************** FmlyMmbrHis_Cndtn_OnPrd_End ********************************************************************************/
		if(familymemberhistoryconditiononperiod.hasEnd()) {
			f.setFmlyMmbrHisCndtnOnPrdEnd(String.valueOf(familymemberhistoryconditiononperiod.getEnd()));
		}
		/******************** FmlyMmbrHis_Cndtn_OnPrd_Strt ********************************************************************************/
		if(familymemberhistoryconditiononperiod.hasStart()) {
			f.setFmlyMmbrHisCndtnOnPrdStrt(String.valueOf(familymemberhistoryconditiononperiod.getStart()));
		}
		/******************** familymemberhistoryconditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryconditiononage = familymemberhistorycondition.getOnsetAge();

		/******************** FmlyMmbrHis_Cndtn_OnStrgTyp ********************************************************************************/
		if(familymemberhistorycondition.hasOnsetStringType()) {
			f.setFmlyMmbrHisCndtnOnStrgTyp(String.valueOf(familymemberhistorycondition.getOnsetStringType()));
		}
		/******************** FmlyMmbrHis_Cndtn_ContributedToDeath ********************************************************************************/
		if(familymemberhistorycondition.hasContributedToDeath()) {
			f.setFmlyMmbrHisCndtnContributedToDeath(String.valueOf(familymemberhistorycondition.getContributedToDeath()));
		}
		return f;
	}
}
