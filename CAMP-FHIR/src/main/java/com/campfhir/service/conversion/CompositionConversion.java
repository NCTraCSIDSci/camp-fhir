package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Composition;
public class CompositionConversion 
{
	public org.hl7.fhir.r4.model.Composition Compositions(Composition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Composition composition = new org.hl7.fhir.r4.model.Composition();

		/******************** id ********************************************************************************/
		composition.setId(c.getId());

		/******************** compositionattester ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent compositionattester =  new org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent();
		composition.addAttester(compositionattester);

		/******************** compositionattestermode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionAttestationModeEnumFactory compositionattestermode =  new org.hl7.fhir.r4.model.Composition.CompositionAttestationModeEnumFactory();
		compositionattester.setMode(compositionattestermode.fromCode(c.getCmpsitionAttesterMode()));

		/******************** Cmpsition_Attester_Party ********************************************************************************/
		if(c.getCmpsitionAttesterParty() != null) {
			compositionattester.setParty( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionAttesterParty()));
		}
		/******************** Cmpsition_Attester_Time ********************************************************************************/
		if(c.getCmpsitionAttesterTime() != null) {
			java.text.SimpleDateFormat Cmpsition_Attester_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Attester_Timedate = Cmpsition_Attester_Timesdf.parse(c.getCmpsitionAttesterTime());
			compositionattester.setTime(Cmpsition_Attester_Timedate);
		}
		/******************** Cmpsition_Athr ********************************************************************************/
		if(c.getCmpsitionAthr() != null) {
			composition.addAuthor( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionAthr()));
		}
		/******************** compositioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositioncategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		composition.addCategory(compositioncategory);

		/******************** compositioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositioncategorycoding =  new org.hl7.fhir.r4.model.Coding();
		compositioncategory.addCoding(compositioncategorycoding);

		/******************** Cmpsition_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionCtgryCdgCd() != null) {
			compositioncategorycoding.setCode(c.getCmpsitionCtgryCdgCd());
		}
		/******************** Cmpsition_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionCtgryCdgDsply() != null) {
			compositioncategorycoding.setDisplay(c.getCmpsitionCtgryCdgDsply());
		}
		/******************** Cmpsition_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionCtgryCdgSys() != null) {
			compositioncategorycoding.setSystem(c.getCmpsitionCtgryCdgSys());
		}
		/******************** Cmpsition_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionCtgryCdgUsrSltd() != null) {
			compositioncategorycoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionCtgryCdgUsrSltd()));
		}
		/******************** Cmpsition_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionCtgryCdgVrsn() != null) {
			compositioncategorycoding.setVersion(c.getCmpsitionCtgryCdgVrsn());
		}
		/******************** Cmpsition_Ctgry_Txt ********************************************************************************/
		if(c.getCmpsitionCtgryTxt() != null) {
			compositioncategory.setText(c.getCmpsitionCtgryTxt());
		}
		/******************** compositionconfidentiality ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.DocumentConfidentialityEnumFactory compositionconfidentiality =  new org.hl7.fhir.r4.model.Composition.DocumentConfidentialityEnumFactory();
		composition.setConfidentiality(compositionconfidentiality.fromCode(c.getCmpsitionConfidentiality()));

		/******************** Cmpsition_Custodian ********************************************************************************/
		if(c.getCmpsitionCustodian() != null) {
			composition.setCustodian( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionCustodian()));
		}
		/******************** Cmpsition_Dt ********************************************************************************/
		if(c.getCmpsitionDt() != null) {
			java.text.SimpleDateFormat Cmpsition_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Dtdate = Cmpsition_Dtsdf.parse(c.getCmpsitionDt());
			composition.setDate(Cmpsition_Dtdate);
		}
		/******************** Cmpsition_Enc ********************************************************************************/
		if(c.getCmpsitionEnc() != null) {
			composition.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionEnc()));
		}
		/******************** compositionevent ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionEventComponent compositionevent =  new org.hl7.fhir.r4.model.Composition.CompositionEventComponent();
		composition.addEvent(compositionevent);

		/******************** compositioneventcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositioneventcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionevent.addCode(compositioneventcode);

		/******************** compositioneventcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositioneventcodecoding =  new org.hl7.fhir.r4.model.Coding();
		compositioneventcode.addCoding(compositioneventcodecoding);

		/******************** Cmpsition_Evnt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgCd() != null) {
			compositioneventcodecoding.setCode(c.getCmpsitionEvntCdCdgCd());
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgDsply() != null) {
			compositioneventcodecoding.setDisplay(c.getCmpsitionEvntCdCdgDsply());
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgSys() != null) {
			compositioneventcodecoding.setSystem(c.getCmpsitionEvntCdCdgSys());
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgUsrSltd() != null) {
			compositioneventcodecoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionEvntCdCdgUsrSltd()));
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgVrsn() != null) {
			compositioneventcodecoding.setVersion(c.getCmpsitionEvntCdCdgVrsn());
		}
		/******************** Cmpsition_Evnt_Cd_Txt ********************************************************************************/
		if(c.getCmpsitionEvntCdTxt() != null) {
			compositioneventcode.setText(c.getCmpsitionEvntCdTxt());
		}
		/******************** Cmpsition_Evnt_Dtl ********************************************************************************/
		if(c.getCmpsitionEvntDtl() != null) {
			compositionevent.addDetail( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionEvntDtl()));
		}
		/******************** compositioneventperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositioneventperiod =  new org.hl7.fhir.r4.model.Period();
		compositionevent.setPeriod(compositioneventperiod);

		/******************** Cmpsition_Evnt_Prd_End ********************************************************************************/
		if(c.getCmpsitionEvntPrdEnd() != null) {
			java.text.SimpleDateFormat Cmpsition_Evnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Evnt_Prd_Enddate = Cmpsition_Evnt_Prd_Endsdf.parse(c.getCmpsitionEvntPrdEnd());
			compositioneventperiod.setEnd(Cmpsition_Evnt_Prd_Enddate);
		}
		/******************** Cmpsition_Evnt_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionEvntPrdStrt() != null) {
			java.text.SimpleDateFormat Cmpsition_Evnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Evnt_Prd_Strtdate = Cmpsition_Evnt_Prd_Strtsdf.parse(c.getCmpsitionEvntPrdStrt());
			compositioneventperiod.setStart(Cmpsition_Evnt_Prd_Strtdate);
		}
		/******************** compositionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier compositionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		composition.setIdentifier(compositionidentifier);

		/******************** Cmpsition_Id_Assigner ********************************************************************************/
		if(c.getCmpsitionIdAssigner() != null) {
			compositionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionIdAssigner()));
		}
		/******************** compositionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		compositionidentifier.setPeriod(compositionidentifierperiod);

		/******************** Cmpsition_Id_Prd_End ********************************************************************************/
		if(c.getCmpsitionIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cmpsition_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Id_Prd_Enddate = Cmpsition_Id_Prd_Endsdf.parse(c.getCmpsitionIdPrdEnd());
			compositionidentifierperiod.setEnd(Cmpsition_Id_Prd_Enddate);
		}
		/******************** Cmpsition_Id_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cmpsition_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_Id_Prd_Strtdate = Cmpsition_Id_Prd_Strtsdf.parse(c.getCmpsitionIdPrdStrt());
			compositionidentifierperiod.setStart(Cmpsition_Id_Prd_Strtdate);
		}
		/******************** Cmpsition_Id_Sys ********************************************************************************/
		if(c.getCmpsitionIdSys() != null) {
			compositionidentifier.setSystem(c.getCmpsitionIdSys());
		}
		/******************** compositionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionidentifier.setType(compositionidentifiertype);

		/******************** compositionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		compositionidentifiertype.addCoding(compositionidentifiertypecoding);

		/******************** Cmpsition_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionIdTypCdgCd() != null) {
			compositionidentifiertypecoding.setCode(c.getCmpsitionIdTypCdgCd());
		}
		/******************** Cmpsition_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionIdTypCdgDsply() != null) {
			compositionidentifiertypecoding.setDisplay(c.getCmpsitionIdTypCdgDsply());
		}
		/******************** Cmpsition_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionIdTypCdgSys() != null) {
			compositionidentifiertypecoding.setSystem(c.getCmpsitionIdTypCdgSys());
		}
		/******************** Cmpsition_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionIdTypCdgUsrSltd() != null) {
			compositionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionIdTypCdgUsrSltd()));
		}
		/******************** Cmpsition_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionIdTypCdgVrsn() != null) {
			compositionidentifiertypecoding.setVersion(c.getCmpsitionIdTypCdgVrsn());
		}
		/******************** Cmpsition_Id_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionIdTypTxt() != null) {
			compositionidentifiertype.setText(c.getCmpsitionIdTypTxt());
		}
		/******************** compositionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory compositionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		compositionidentifier.setUse(compositionidentifieruse.fromCode(c.getCmpsitionIdUse()));

		/******************** Cmpsition_Id_Vl ********************************************************************************/
		if(c.getCmpsitionIdVl() != null) {
			compositionidentifier.setValue(c.getCmpsitionIdVl());
		}
		/******************** compositionrelatesto ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent compositionrelatesto =  new org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent();
		composition.addRelatesTo(compositionrelatesto);

		/******************** compositionrelatestocode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.DocumentRelationshipTypeEnumFactory compositionrelatestocode =  new org.hl7.fhir.r4.model.Composition.DocumentRelationshipTypeEnumFactory();
		compositionrelatesto.setCode(compositionrelatestocode.fromCode(c.getCmpsitionRelatesToCd()));

		/******************** compositionrelatestotargetidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier compositionrelatestotargetidentifier =  new org.hl7.fhir.r4.model.Identifier();
		compositionrelatesto.setTarget(compositionrelatestotargetidentifier);

		/******************** Cmpsition_RelatesTo_TargetId_Assigner ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdAssigner() != null) {
			compositionrelatestotargetidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionRelatesToTargetIdAssigner()));
		}
		/******************** compositionrelatestotargetidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositionrelatestotargetidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		compositionrelatestotargetidentifier.setPeriod(compositionrelatestotargetidentifierperiod);

		/******************** Cmpsition_RelatesTo_TargetId_Prd_End ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cmpsition_RelatesTo_TargetId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_RelatesTo_TargetId_Prd_Enddate = Cmpsition_RelatesTo_TargetId_Prd_Endsdf.parse(c.getCmpsitionRelatesToTargetIdPrdEnd());
			compositionrelatestotargetidentifierperiod.setEnd(Cmpsition_RelatesTo_TargetId_Prd_Enddate);
		}
		/******************** Cmpsition_RelatesTo_TargetId_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cmpsition_RelatesTo_TargetId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmpsition_RelatesTo_TargetId_Prd_Strtdate = Cmpsition_RelatesTo_TargetId_Prd_Strtsdf.parse(c.getCmpsitionRelatesToTargetIdPrdStrt());
			compositionrelatestotargetidentifierperiod.setStart(Cmpsition_RelatesTo_TargetId_Prd_Strtdate);
		}
		/******************** Cmpsition_RelatesTo_TargetId_Sys ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdSys() != null) {
			compositionrelatestotargetidentifier.setSystem(c.getCmpsitionRelatesToTargetIdSys());
		}
		/******************** compositionrelatestotargetidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionrelatestotargetidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionrelatestotargetidentifier.setType(compositionrelatestotargetidentifiertype);

		/******************** compositionrelatestotargetidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionrelatestotargetidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		compositionrelatestotargetidentifiertype.addCoding(compositionrelatestotargetidentifiertypecoding);

		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgCd() != null) {
			compositionrelatestotargetidentifiertypecoding.setCode(c.getCmpsitionRelatesToTargetIdTypCdgCd());
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgDsply() != null) {
			compositionrelatestotargetidentifiertypecoding.setDisplay(c.getCmpsitionRelatesToTargetIdTypCdgDsply());
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgSys() != null) {
			compositionrelatestotargetidentifiertypecoding.setSystem(c.getCmpsitionRelatesToTargetIdTypCdgSys());
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgUsrSltd() != null) {
			compositionrelatestotargetidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionRelatesToTargetIdTypCdgUsrSltd()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgVrsn() != null) {
			compositionrelatestotargetidentifiertypecoding.setVersion(c.getCmpsitionRelatesToTargetIdTypCdgVrsn());
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypTxt() != null) {
			compositionrelatestotargetidentifiertype.setText(c.getCmpsitionRelatesToTargetIdTypTxt());
		}
		/******************** compositionrelatestotargetidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory compositionrelatestotargetidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		compositionrelatestotargetidentifier.setUse(compositionrelatestotargetidentifieruse.fromCode(c.getCmpsitionRelatesToTargetIdUse()));

		/******************** Cmpsition_RelatesTo_TargetId_Vl ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdVl() != null) {
			compositionrelatestotargetidentifier.setValue(c.getCmpsitionRelatesToTargetIdVl());
		}
		/******************** Cmpsition_RelatesTo_TarRfrnc ********************************************************************************/
		if(c.getCmpsitionRelatesToTarRfrnc() != null) {
			compositionrelatesto.setTarget( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionRelatesToTarRfrnc()));
		}
		/******************** compositionsection ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.SectionComponent compositionsection =  new org.hl7.fhir.r4.model.Composition.SectionComponent();
		composition.addSection(compositionsection);

		/******************** Cmpsition_Section_Athr ********************************************************************************/
		if(c.getCmpsitionSectionAthr() != null) {
			compositionsection.addAuthor( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionSectionAthr()));
		}
		/******************** compositionsectioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionsection.setCode(compositionsectioncode);

		/******************** compositionsectioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		compositionsectioncode.addCoding(compositionsectioncodecoding);

		/******************** Cmpsition_Section_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgCd() != null) {
			compositionsectioncodecoding.setCode(c.getCmpsitionSectionCdCdgCd());
		}
		/******************** Cmpsition_Section_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgDsply() != null) {
			compositionsectioncodecoding.setDisplay(c.getCmpsitionSectionCdCdgDsply());
		}
		/******************** Cmpsition_Section_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgSys() != null) {
			compositionsectioncodecoding.setSystem(c.getCmpsitionSectionCdCdgSys());
		}
		/******************** Cmpsition_Section_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgUsrSltd() != null) {
			compositionsectioncodecoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionSectionCdCdgUsrSltd()));
		}
		/******************** Cmpsition_Section_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgVrsn() != null) {
			compositionsectioncodecoding.setVersion(c.getCmpsitionSectionCdCdgVrsn());
		}
		/******************** Cmpsition_Section_Cd_Txt ********************************************************************************/
		if(c.getCmpsitionSectionCdTxt() != null) {
			compositionsectioncode.setText(c.getCmpsitionSectionCdTxt());
		}
		/******************** compositionsectionemptyreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectionemptyreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionsection.setEmptyReason(compositionsectionemptyreason);

		/******************** compositionsectionemptyreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectionemptyreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		compositionsectionemptyreason.addCoding(compositionsectionemptyreasoncoding);

		/******************** Cmpsition_Section_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgCd() != null) {
			compositionsectionemptyreasoncoding.setCode(c.getCmpsitionSectionEmptyRsnCdgCd());
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgDsply() != null) {
			compositionsectionemptyreasoncoding.setDisplay(c.getCmpsitionSectionEmptyRsnCdgDsply());
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgSys() != null) {
			compositionsectionemptyreasoncoding.setSystem(c.getCmpsitionSectionEmptyRsnCdgSys());
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgUsrSltd() != null) {
			compositionsectionemptyreasoncoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionSectionEmptyRsnCdgUsrSltd()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgVrsn() != null) {
			compositionsectionemptyreasoncoding.setVersion(c.getCmpsitionSectionEmptyRsnCdgVrsn());
		}
		/******************** Cmpsition_Section_EmptyRsn_Txt ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnTxt() != null) {
			compositionsectionemptyreason.setText(c.getCmpsitionSectionEmptyRsnTxt());
		}
		/******************** Cmpsition_Section_Entry ********************************************************************************/
		if(c.getCmpsitionSectionEntry() != null) {
			compositionsection.addEntry( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionSectionEntry()));
		}
		/******************** Cmpsition_Section_Focus ********************************************************************************/
		if(c.getCmpsitionSectionFocus() != null) {
			compositionsection.setFocus( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionSectionFocus()));
		}
		/******************** compositionsectionmode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.SectionModeEnumFactory compositionsectionmode =  new org.hl7.fhir.r4.model.Composition.SectionModeEnumFactory();
		compositionsection.setMode(compositionsectionmode.fromCode(c.getCmpsitionSectionMode()));

		/******************** compositionsectionorderedby ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectionorderedby =  new org.hl7.fhir.r4.model.CodeableConcept();
		compositionsection.setOrderedBy(compositionsectionorderedby);

		/******************** compositionsectionorderedbycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectionorderedbycoding =  new org.hl7.fhir.r4.model.Coding();
		compositionsectionorderedby.addCoding(compositionsectionorderedbycoding);

		/******************** Cmpsition_Section_OrdredBy_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgCd() != null) {
			compositionsectionorderedbycoding.setCode(c.getCmpsitionSectionOrdredByCdgCd());
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgDsply() != null) {
			compositionsectionorderedbycoding.setDisplay(c.getCmpsitionSectionOrdredByCdgDsply());
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgSys() != null) {
			compositionsectionorderedbycoding.setSystem(c.getCmpsitionSectionOrdredByCdgSys());
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgUsrSltd() != null) {
			compositionsectionorderedbycoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionSectionOrdredByCdgUsrSltd()));
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgVrsn() != null) {
			compositionsectionorderedbycoding.setVersion(c.getCmpsitionSectionOrdredByCdgVrsn());
		}
		/******************** Cmpsition_Section_OrdredBy_Txt ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByTxt() != null) {
			compositionsectionorderedby.setText(c.getCmpsitionSectionOrdredByTxt());
		}
		/******************** compositionsectiontext ********************************************************************************/
		org.hl7.fhir.r4.model.Narrative compositionsectiontext =  new org.hl7.fhir.r4.model.Narrative();
		compositionsection.setText(compositionsectiontext);

		/******************** Cmpsition_Section_Txt_Div ********************************************************************************/
		if(c.getCmpsitionSectionTxtDiv() != null) {
			compositionsectiontext.setDivAsString(c.getCmpsitionSectionTxtDiv());
		}
		/******************** compositionsectiontextstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Narrative.NarrativeStatusEnumFactory compositionsectiontextstatus =  new org.hl7.fhir.r4.model.Narrative.NarrativeStatusEnumFactory();
		compositionsectiontext.setStatus(compositionsectiontextstatus.fromCode(c.getCmpsitionSectionTxtSts()));

		/******************** Cmpsition_Section_Ttl ********************************************************************************/
		if(c.getCmpsitionSectionTtl() != null) {
			compositionsection.setTitle(c.getCmpsitionSectionTtl());
		}
		/******************** compositionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionStatusEnumFactory compositionstatus =  new org.hl7.fhir.r4.model.Composition.CompositionStatusEnumFactory();
		composition.setStatus(compositionstatus.fromCode(c.getCmpsitionSts()));

		/******************** Cmpsition_Sbjct ********************************************************************************/
		if(c.getCmpsitionSbjct() != null) {
			composition.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCmpsitionSbjct()));
		}
		/******************** Cmpsition_Ttl ********************************************************************************/
		if(c.getCmpsitionTtl() != null) {
			composition.setTitle(c.getCmpsitionTtl());
		}
		/******************** compositiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		composition.setType(compositiontype);

		/******************** compositiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		compositiontype.addCoding(compositiontypecoding);

		/******************** Cmpsition_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionTypCdgCd() != null) {
			compositiontypecoding.setCode(c.getCmpsitionTypCdgCd());
		}
		/******************** Cmpsition_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionTypCdgDsply() != null) {
			compositiontypecoding.setDisplay(c.getCmpsitionTypCdgDsply());
		}
		/******************** Cmpsition_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionTypCdgSys() != null) {
			compositiontypecoding.setSystem(c.getCmpsitionTypCdgSys());
		}
		/******************** Cmpsition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionTypCdgUsrSltd() != null) {
			compositiontypecoding.setUserSelected(Boolean.parseBoolean(c.getCmpsitionTypCdgUsrSltd()));
		}
		/******************** Cmpsition_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionTypCdgVrsn() != null) {
			compositiontypecoding.setVersion(c.getCmpsitionTypCdgVrsn());
		}
		/******************** Cmpsition_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionTypTxt() != null) {
			compositiontype.setText(c.getCmpsitionTypTxt());
		}
		return composition;
	}
}
