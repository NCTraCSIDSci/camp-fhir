package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureConversion 
{
	public org.hl7.fhir.r4.model.Procedure Procedures(Procedure p) throws ParseException
	{
		org.hl7.fhir.r4.model.Procedure procedure = new org.hl7.fhir.r4.model.Procedure();

		/******************** id ********************************************************************************/
		procedure.setId(p.getId());

		/******************** Prcdr_Asserter ********************************************************************************/
		if(p.getPrcdrAsserter() != null) {
			procedure.setAsserter( new org.hl7.fhir.r4.model.Reference(p.getPrcdrAsserter()));
		}
		/******************** Prcdr_BasedOn ********************************************************************************/
		if(p.getPrcdrBasedOn() != null) {
			procedure.addBasedOn( new org.hl7.fhir.r4.model.Reference(p.getPrcdrBasedOn()));
		}
		/******************** procedurebodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurebodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.addBodySite(procedurebodysite);

		/******************** procedurebodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurebodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		procedurebodysite.addCoding(procedurebodysitecoding);

		/******************** Prcdr_BodySite_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrBodySiteCdgCd() != null) {
			procedurebodysitecoding.setCode(p.getPrcdrBodySiteCdgCd());
		}
		/******************** Prcdr_BodySite_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrBodySiteCdgDsply() != null) {
			procedurebodysitecoding.setDisplay(p.getPrcdrBodySiteCdgDsply());
		}
		/******************** Prcdr_BodySite_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrBodySiteCdgSys() != null) {
			procedurebodysitecoding.setSystem(p.getPrcdrBodySiteCdgSys());
		}
		/******************** Prcdr_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrBodySiteCdgUsrSltd() != null) {
			procedurebodysitecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrBodySiteCdgUsrSltd()));
		}
		/******************** Prcdr_BodySite_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrBodySiteCdgVrsn() != null) {
			procedurebodysitecoding.setVersion(p.getPrcdrBodySiteCdgVrsn());
		}
		/******************** Prcdr_BodySite_Txt ********************************************************************************/
		if(p.getPrcdrBodySiteTxt() != null) {
			procedurebodysite.setText(p.getPrcdrBodySiteTxt());
		}
		/******************** procedurecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setCategory(procedurecategory);

		/******************** procedurecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		procedurecategory.addCoding(procedurecategorycoding);

		/******************** Prcdr_Ctgry_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrCtgryCdgCd() != null) {
			procedurecategorycoding.setCode(p.getPrcdrCtgryCdgCd());
		}
		/******************** Prcdr_Ctgry_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrCtgryCdgDsply() != null) {
			procedurecategorycoding.setDisplay(p.getPrcdrCtgryCdgDsply());
		}
		/******************** Prcdr_Ctgry_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrCtgryCdgSys() != null) {
			procedurecategorycoding.setSystem(p.getPrcdrCtgryCdgSys());
		}
		/******************** Prcdr_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrCtgryCdgUsrSltd() != null) {
			procedurecategorycoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrCtgryCdgUsrSltd()));
		}
		/******************** Prcdr_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrCtgryCdgVrsn() != null) {
			procedurecategorycoding.setVersion(p.getPrcdrCtgryCdgVrsn());
		}
		/******************** Prcdr_Ctgry_Txt ********************************************************************************/
		if(p.getPrcdrCtgryTxt() != null) {
			procedurecategory.setText(p.getPrcdrCtgryTxt());
		}
		/******************** procedurecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setCode(procedurecode);

		/******************** procedurecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecodecoding =  new org.hl7.fhir.r4.model.Coding();
		procedurecode.addCoding(procedurecodecoding);

		/******************** Prcdr_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrCdCdgCd() != null) {
			procedurecodecoding.setCode(p.getPrcdrCdCdgCd());
		}
		/******************** Prcdr_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrCdCdgDsply() != null) {
			procedurecodecoding.setDisplay(p.getPrcdrCdCdgDsply());
		}
		/******************** Prcdr_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrCdCdgSys() != null) {
			procedurecodecoding.setSystem(p.getPrcdrCdCdgSys());
		}
		/******************** Prcdr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrCdCdgUsrSltd() != null) {
			procedurecodecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrCdCdgUsrSltd()));
		}
		/******************** Prcdr_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrCdCdgVrsn() != null) {
			procedurecodecoding.setVersion(p.getPrcdrCdCdgVrsn());
		}
		/******************** Prcdr_Cd_Txt ********************************************************************************/
		if(p.getPrcdrCdTxt() != null) {
			procedurecode.setText(p.getPrcdrCdTxt());
		}
		/******************** procedurecomplication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecomplication =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.addComplication(procedurecomplication);

		/******************** procedurecomplicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecomplicationcoding =  new org.hl7.fhir.r4.model.Coding();
		procedurecomplication.addCoding(procedurecomplicationcoding);

		/******************** Prcdr_Complication_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrComplicationCdgCd() != null) {
			procedurecomplicationcoding.setCode(p.getPrcdrComplicationCdgCd());
		}
		/******************** Prcdr_Complication_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrComplicationCdgDsply() != null) {
			procedurecomplicationcoding.setDisplay(p.getPrcdrComplicationCdgDsply());
		}
		/******************** Prcdr_Complication_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrComplicationCdgSys() != null) {
			procedurecomplicationcoding.setSystem(p.getPrcdrComplicationCdgSys());
		}
		/******************** Prcdr_Complication_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrComplicationCdgUsrSltd() != null) {
			procedurecomplicationcoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrComplicationCdgUsrSltd()));
		}
		/******************** Prcdr_Complication_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrComplicationCdgVrsn() != null) {
			procedurecomplicationcoding.setVersion(p.getPrcdrComplicationCdgVrsn());
		}
		/******************** Prcdr_Complication_Txt ********************************************************************************/
		if(p.getPrcdrComplicationTxt() != null) {
			procedurecomplication.setText(p.getPrcdrComplicationTxt());
		}
		/******************** Prcdr_ComplicationDtl ********************************************************************************/
		if(p.getPrcdrComplicationDtl() != null) {
			procedure.addComplicationDetail( new org.hl7.fhir.r4.model.Reference(p.getPrcdrComplicationDtl()));
		}
		/******************** Prcdr_Enc ********************************************************************************/
		if(p.getPrcdrEnc() != null) {
			procedure.setEncounter( new org.hl7.fhir.r4.model.Reference(p.getPrcdrEnc()));
		}
		/******************** procedurefocaldevice ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent procedurefocaldevice =  new org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent();
		procedure.addFocalDevice(procedurefocaldevice);

		/******************** procedurefocaldeviceaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurefocaldeviceaction =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedurefocaldevice.setAction(procedurefocaldeviceaction);

		/******************** procedurefocaldeviceactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurefocaldeviceactioncoding =  new org.hl7.fhir.r4.model.Coding();
		procedurefocaldeviceaction.addCoding(procedurefocaldeviceactioncoding);

		/******************** Prcdr_FocalDvc_Actn_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgCd() != null) {
			procedurefocaldeviceactioncoding.setCode(p.getPrcdrFocalDvcActnCdgCd());
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgDsply() != null) {
			procedurefocaldeviceactioncoding.setDisplay(p.getPrcdrFocalDvcActnCdgDsply());
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgSys() != null) {
			procedurefocaldeviceactioncoding.setSystem(p.getPrcdrFocalDvcActnCdgSys());
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgUsrSltd() != null) {
			procedurefocaldeviceactioncoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrFocalDvcActnCdgUsrSltd()));
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgVrsn() != null) {
			procedurefocaldeviceactioncoding.setVersion(p.getPrcdrFocalDvcActnCdgVrsn());
		}
		/******************** Prcdr_FocalDvc_Actn_Txt ********************************************************************************/
		if(p.getPrcdrFocalDvcActnTxt() != null) {
			procedurefocaldeviceaction.setText(p.getPrcdrFocalDvcActnTxt());
		}
		/******************** Prcdr_FocalDvc_Manipulated ********************************************************************************/
		if(p.getPrcdrFocalDvcManipulated() != null) {
			procedurefocaldevice.setManipulated( new org.hl7.fhir.r4.model.Reference(p.getPrcdrFocalDvcManipulated()));
		}
		/******************** procedurefollowup ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurefollowup =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.addFollowUp(procedurefollowup);

		/******************** procedurefollowupcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurefollowupcoding =  new org.hl7.fhir.r4.model.Coding();
		procedurefollowup.addCoding(procedurefollowupcoding);

		/******************** Prcdr_FollowUp_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrFollowUpCdgCd() != null) {
			procedurefollowupcoding.setCode(p.getPrcdrFollowUpCdgCd());
		}
		/******************** Prcdr_FollowUp_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrFollowUpCdgDsply() != null) {
			procedurefollowupcoding.setDisplay(p.getPrcdrFollowUpCdgDsply());
		}
		/******************** Prcdr_FollowUp_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrFollowUpCdgSys() != null) {
			procedurefollowupcoding.setSystem(p.getPrcdrFollowUpCdgSys());
		}
		/******************** Prcdr_FollowUp_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrFollowUpCdgUsrSltd() != null) {
			procedurefollowupcoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrFollowUpCdgUsrSltd()));
		}
		/******************** Prcdr_FollowUp_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrFollowUpCdgVrsn() != null) {
			procedurefollowupcoding.setVersion(p.getPrcdrFollowUpCdgVrsn());
		}
		/******************** Prcdr_FollowUp_Txt ********************************************************************************/
		if(p.getPrcdrFollowUpTxt() != null) {
			procedurefollowup.setText(p.getPrcdrFollowUpTxt());
		}
		/******************** procedureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier procedureidentifier =  new org.hl7.fhir.r4.model.Identifier();
		procedure.addIdentifier(procedureidentifier);

		/******************** Prcdr_Id_Assigner ********************************************************************************/
		if(p.getPrcdrIdAssigner() != null) {
			procedureidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPrcdrIdAssigner()));
		}
		/******************** procedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		procedureidentifier.setPeriod(procedureidentifierperiod);

		/******************** Prcdr_Id_Prd_End ********************************************************************************/
		if(p.getPrcdrIdPrdEnd() != null) {
			java.text.SimpleDateFormat Prcdr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prcdr_Id_Prd_Enddate = Prcdr_Id_Prd_Endsdf.parse(p.getPrcdrIdPrdEnd());
			procedureidentifierperiod.setEnd(Prcdr_Id_Prd_Enddate);
		}
		/******************** Prcdr_Id_Prd_Strt ********************************************************************************/
		if(p.getPrcdrIdPrdStrt() != null) {
			java.text.SimpleDateFormat Prcdr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prcdr_Id_Prd_Strtdate = Prcdr_Id_Prd_Strtsdf.parse(p.getPrcdrIdPrdStrt());
			procedureidentifierperiod.setStart(Prcdr_Id_Prd_Strtdate);
		}
		/******************** Prcdr_Id_Sys ********************************************************************************/
		if(p.getPrcdrIdSys() != null) {
			procedureidentifier.setSystem(p.getPrcdrIdSys());
		}
		/******************** procedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedureidentifier.setType(procedureidentifiertype);

		/******************** procedureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		procedureidentifiertype.addCoding(procedureidentifiertypecoding);

		/******************** Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrIdTypCdgCd() != null) {
			procedureidentifiertypecoding.setCode(p.getPrcdrIdTypCdgCd());
		}
		/******************** Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrIdTypCdgDsply() != null) {
			procedureidentifiertypecoding.setDisplay(p.getPrcdrIdTypCdgDsply());
		}
		/******************** Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrIdTypCdgSys() != null) {
			procedureidentifiertypecoding.setSystem(p.getPrcdrIdTypCdgSys());
		}
		/******************** Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrIdTypCdgUsrSltd() != null) {
			procedureidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrIdTypCdgUsrSltd()));
		}
		/******************** Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrIdTypCdgVrsn() != null) {
			procedureidentifiertypecoding.setVersion(p.getPrcdrIdTypCdgVrsn());
		}
		/******************** Prcdr_Id_Typ_Txt ********************************************************************************/
		if(p.getPrcdrIdTypTxt() != null) {
			procedureidentifiertype.setText(p.getPrcdrIdTypTxt());
		}
		/******************** procedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory procedureidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		procedureidentifier.setUse(procedureidentifieruse.fromCode(p.getPrcdrIdUse()));

		/******************** Prcdr_Id_Vl ********************************************************************************/
		if(p.getPrcdrIdVl() != null) {
			procedureidentifier.setValue(p.getPrcdrIdVl());
		}
		/******************** Prcdr_InstantiatesCanonical ********************************************************************************/
		if(p.getPrcdrInstantiatesCanonical() != null) {
			procedure.addInstantiatesCanonical(p.getPrcdrInstantiatesCanonical());
		}
		/******************** Prcdr_InstantiatesUri ********************************************************************************/
		if(p.getPrcdrInstantiatesUri() != null) {
			procedure.addInstantiatesUri(p.getPrcdrInstantiatesUri());
		}
		/******************** Prcdr_Lctn ********************************************************************************/
		if(p.getPrcdrLctn() != null) {
			procedure.setLocation( new org.hl7.fhir.r4.model.Reference(p.getPrcdrLctn()));
		}
		/******************** procedurenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation procedurenote =  new org.hl7.fhir.r4.model.Annotation();
		procedure.addNote(procedurenote);

		/******************** Prcdr_Nt_AthrRfrnc ********************************************************************************/
		if(p.getPrcdrNtAthrRfrnc() != null) {
			procedurenote.setAuthor( new org.hl7.fhir.r4.model.Reference(p.getPrcdrNtAthrRfrnc()));
		}
		/******************** Prcdr_Nt_AthrStrgTyp ********************************************************************************/
		if(p.getPrcdrNtAthrStrgTyp() != null) {
			procedurenote.setAuthor( new org.hl7.fhir.r4.model.StringType(p.getPrcdrNtAthrStrgTyp()));
		}
		/******************** Prcdr_Nt_Txt ********************************************************************************/
		if(p.getPrcdrNtTxt() != null) {
			procedurenote.setText(p.getPrcdrNtTxt());
		}
		/******************** Prcdr_Nt_Time ********************************************************************************/
		if(p.getPrcdrNtTime() != null) {
			java.text.SimpleDateFormat Prcdr_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prcdr_Nt_Timedate = Prcdr_Nt_Timesdf.parse(p.getPrcdrNtTime());
			procedurenote.setTime(Prcdr_Nt_Timedate);
		}
		/******************** procedureoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureoutcome =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setOutcome(procedureoutcome);

		/******************** procedureoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureoutcomecoding =  new org.hl7.fhir.r4.model.Coding();
		procedureoutcome.addCoding(procedureoutcomecoding);

		/******************** Prcdr_Outcome_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrOutcomeCdgCd() != null) {
			procedureoutcomecoding.setCode(p.getPrcdrOutcomeCdgCd());
		}
		/******************** Prcdr_Outcome_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrOutcomeCdgDsply() != null) {
			procedureoutcomecoding.setDisplay(p.getPrcdrOutcomeCdgDsply());
		}
		/******************** Prcdr_Outcome_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrOutcomeCdgSys() != null) {
			procedureoutcomecoding.setSystem(p.getPrcdrOutcomeCdgSys());
		}
		/******************** Prcdr_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrOutcomeCdgUsrSltd() != null) {
			procedureoutcomecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrOutcomeCdgUsrSltd()));
		}
		/******************** Prcdr_Outcome_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrOutcomeCdgVrsn() != null) {
			procedureoutcomecoding.setVersion(p.getPrcdrOutcomeCdgVrsn());
		}
		/******************** Prcdr_Outcome_Txt ********************************************************************************/
		if(p.getPrcdrOutcomeTxt() != null) {
			procedureoutcome.setText(p.getPrcdrOutcomeTxt());
		}
		/******************** Prcdr_PartOf ********************************************************************************/
		if(p.getPrcdrPartOf() != null) {
			procedure.addPartOf( new org.hl7.fhir.r4.model.Reference(p.getPrcdrPartOf()));
		}
		/******************** procedureperformedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age procedureperformedage =  new org.hl7.fhir.r4.model.Age();
		procedure.setPerformed(procedureperformedage);

		/******************** Prcdr_PerformedDtTimeTyp ********************************************************************************/
		if(p.getPrcdrPerformedDtTimeTyp() != null) {
			procedure.setPerformed( new org.hl7.fhir.r4.model.DateTimeType(p.getPrcdrPerformedDtTimeTyp()));
		}
		/******************** procedureperformedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureperformedperiod =  new org.hl7.fhir.r4.model.Period();
		procedure.setPerformed(procedureperformedperiod);

		/******************** Prcdr_PerformedPrd_End ********************************************************************************/
		if(p.getPrcdrPerformedPrdEnd() != null) {
			java.text.SimpleDateFormat Prcdr_PerformedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prcdr_PerformedPrd_Enddate = Prcdr_PerformedPrd_Endsdf.parse(p.getPrcdrPerformedPrdEnd());
			procedureperformedperiod.setEnd(Prcdr_PerformedPrd_Enddate);
		}
		/******************** Prcdr_PerformedPrd_Strt ********************************************************************************/
		if(p.getPrcdrPerformedPrdStrt() != null) {
			java.text.SimpleDateFormat Prcdr_PerformedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prcdr_PerformedPrd_Strtdate = Prcdr_PerformedPrd_Strtsdf.parse(p.getPrcdrPerformedPrdStrt());
			procedureperformedperiod.setStart(Prcdr_PerformedPrd_Strtdate);
		}
		/******************** procedureperformedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range procedureperformedrange =  new org.hl7.fhir.r4.model.Range();
		procedure.setPerformed(procedureperformedrange);

		/******************** procedureperformedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		procedureperformedrange.setHigh(procedureperformedrangehigh);

		/******************** Prcdr_PerformedRng_Hi_Cd ********************************************************************************/
		if(p.getPrcdrPerformedRngHiCd() != null) {
			procedureperformedrangehigh.setCode(p.getPrcdrPerformedRngHiCd());
		}
		/******************** procedureperformedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory procedureperformedrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		procedureperformedrangehigh.setComparator(procedureperformedrangehighcomparator.fromCode(p.getPrcdrPerformedRngHiCmprtr()));

		/******************** Prcdr_PerformedRng_Hi_Sys ********************************************************************************/
		if(p.getPrcdrPerformedRngHiSys() != null) {
			procedureperformedrangehigh.setSystem(p.getPrcdrPerformedRngHiSys());
		}
		/******************** Prcdr_PerformedRng_Hi_Unt ********************************************************************************/
		if(p.getPrcdrPerformedRngHiUnt() != null) {
			procedureperformedrangehigh.setUnit(p.getPrcdrPerformedRngHiUnt());
		}
		/******************** Prcdr_PerformedRng_Hi_Vl ********************************************************************************/
		if(p.getPrcdrPerformedRngHiVl() != null) {
			procedureperformedrangehigh.setValue(Double.parseDouble((p.getPrcdrPerformedRngHiVl())));
		}
		/******************** procedureperformedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangelow =  new org.hl7.fhir.r4.model.Quantity();
		procedureperformedrange.setLow(procedureperformedrangelow);

		/******************** Prcdr_PerformedRng_Lw_Cd ********************************************************************************/
		if(p.getPrcdrPerformedRngLwCd() != null) {
			procedureperformedrangelow.setCode(p.getPrcdrPerformedRngLwCd());
		}
		/******************** procedureperformedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory procedureperformedrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		procedureperformedrangelow.setComparator(procedureperformedrangelowcomparator.fromCode(p.getPrcdrPerformedRngLwCmprtr()));

		/******************** Prcdr_PerformedRng_Lw_Sys ********************************************************************************/
		if(p.getPrcdrPerformedRngLwSys() != null) {
			procedureperformedrangelow.setSystem(p.getPrcdrPerformedRngLwSys());
		}
		/******************** Prcdr_PerformedRng_Lw_Unt ********************************************************************************/
		if(p.getPrcdrPerformedRngLwUnt() != null) {
			procedureperformedrangelow.setUnit(p.getPrcdrPerformedRngLwUnt());
		}
		/******************** Prcdr_PerformedRng_Lw_Vl ********************************************************************************/
		if(p.getPrcdrPerformedRngLwVl() != null) {
			procedureperformedrangelow.setValue(Double.parseDouble((p.getPrcdrPerformedRngLwVl())));
		}
		/******************** Prcdr_PerformedStrgTyp ********************************************************************************/
		if(p.getPrcdrPerformedStrgTyp() != null) {
			procedure.setPerformed( new org.hl7.fhir.r4.model.StringType(p.getPrcdrPerformedStrgTyp()));
		}
		/******************** procedureperformer ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent procedureperformer =  new org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent();
		procedure.addPerformer(procedureperformer);

		/******************** Prcdr_Prfrmr_Actor ********************************************************************************/
		if(p.getPrcdrPrfrmrActor() != null) {
			procedureperformer.setActor( new org.hl7.fhir.r4.model.Reference(p.getPrcdrPrfrmrActor()));
		}
		/******************** procedureperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedureperformer.setFunction(procedureperformerfunction);

		/******************** procedureperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		procedureperformerfunction.addCoding(procedureperformerfunctioncoding);

		/******************** Prcdr_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgCd() != null) {
			procedureperformerfunctioncoding.setCode(p.getPrcdrPrfrmrFunctionCdgCd());
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgDsply() != null) {
			procedureperformerfunctioncoding.setDisplay(p.getPrcdrPrfrmrFunctionCdgDsply());
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgSys() != null) {
			procedureperformerfunctioncoding.setSystem(p.getPrcdrPrfrmrFunctionCdgSys());
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgUsrSltd() != null) {
			procedureperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgVrsn() != null) {
			procedureperformerfunctioncoding.setVersion(p.getPrcdrPrfrmrFunctionCdgVrsn());
		}
		/******************** Prcdr_Prfrmr_Function_Txt ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionTxt() != null) {
			procedureperformerfunction.setText(p.getPrcdrPrfrmrFunctionTxt());
		}
		/******************** Prcdr_Prfrmr_OnBehalfOf ********************************************************************************/
		if(p.getPrcdrPrfrmrOnBehalfOf() != null) {
			procedureperformer.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(p.getPrcdrPrfrmrOnBehalfOf()));
		}
		/******************** procedurereasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurereasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.addReasonCode(procedurereasoncode);

		/******************** procedurereasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurereasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		procedurereasoncode.addCoding(procedurereasoncodecoding);

		/******************** Prcdr_RsnCd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrRsnCdCdgCd() != null) {
			procedurereasoncodecoding.setCode(p.getPrcdrRsnCdCdgCd());
		}
		/******************** Prcdr_RsnCd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrRsnCdCdgDsply() != null) {
			procedurereasoncodecoding.setDisplay(p.getPrcdrRsnCdCdgDsply());
		}
		/******************** Prcdr_RsnCd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrRsnCdCdgSys() != null) {
			procedurereasoncodecoding.setSystem(p.getPrcdrRsnCdCdgSys());
		}
		/******************** Prcdr_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrRsnCdCdgUsrSltd() != null) {
			procedurereasoncodecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrRsnCdCdgUsrSltd()));
		}
		/******************** Prcdr_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrRsnCdCdgVrsn() != null) {
			procedurereasoncodecoding.setVersion(p.getPrcdrRsnCdCdgVrsn());
		}
		/******************** Prcdr_RsnCd_Txt ********************************************************************************/
		if(p.getPrcdrRsnCdTxt() != null) {
			procedurereasoncode.setText(p.getPrcdrRsnCdTxt());
		}
		/******************** Prcdr_RsnRfrnc ********************************************************************************/
		if(p.getPrcdrRsnRfrnc() != null) {
			procedure.addReasonReference( new org.hl7.fhir.r4.model.Reference(p.getPrcdrRsnRfrnc()));
		}
		/******************** Prcdr_Recorder ********************************************************************************/
		if(p.getPrcdrRecorder() != null) {
			procedure.setRecorder( new org.hl7.fhir.r4.model.Reference(p.getPrcdrRecorder()));
		}
		/******************** Prcdr_Rpt ********************************************************************************/
		if(p.getPrcdrRpt() != null) {
			procedure.addReport( new org.hl7.fhir.r4.model.Reference(p.getPrcdrRpt()));
		}
		/******************** procedurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedureStatusEnumFactory procedurestatus =  new org.hl7.fhir.r4.model.Procedure.ProcedureStatusEnumFactory();
		procedure.setStatus(procedurestatus.fromCode(p.getPrcdrSts()));

		/******************** procedurestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurestatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setStatusReason(procedurestatusreason);

		/******************** procedurestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurestatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		procedurestatusreason.addCoding(procedurestatusreasoncoding);

		/******************** Prcdr_StsRsn_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrStsRsnCdgCd() != null) {
			procedurestatusreasoncoding.setCode(p.getPrcdrStsRsnCdgCd());
		}
		/******************** Prcdr_StsRsn_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrStsRsnCdgDsply() != null) {
			procedurestatusreasoncoding.setDisplay(p.getPrcdrStsRsnCdgDsply());
		}
		/******************** Prcdr_StsRsn_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrStsRsnCdgSys() != null) {
			procedurestatusreasoncoding.setSystem(p.getPrcdrStsRsnCdgSys());
		}
		/******************** Prcdr_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrStsRsnCdgUsrSltd() != null) {
			procedurestatusreasoncoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrStsRsnCdgUsrSltd()));
		}
		/******************** Prcdr_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrStsRsnCdgVrsn() != null) {
			procedurestatusreasoncoding.setVersion(p.getPrcdrStsRsnCdgVrsn());
		}
		/******************** Prcdr_StsRsn_Txt ********************************************************************************/
		if(p.getPrcdrStsRsnTxt() != null) {
			procedurestatusreason.setText(p.getPrcdrStsRsnTxt());
		}
		/******************** Prcdr_Sbjct ********************************************************************************/
		if(p.getPrcdrSbjct() != null) {
			procedure.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPrcdrSbjct()));
		}
		/******************** procedureusedcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureusedcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.addUsedCode(procedureusedcode);

		/******************** procedureusedcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureusedcodecoding =  new org.hl7.fhir.r4.model.Coding();
		procedureusedcode.addCoding(procedureusedcodecoding);

		/******************** Prcdr_UsedCd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrUsedCdCdgCd() != null) {
			procedureusedcodecoding.setCode(p.getPrcdrUsedCdCdgCd());
		}
		/******************** Prcdr_UsedCd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrUsedCdCdgDsply() != null) {
			procedureusedcodecoding.setDisplay(p.getPrcdrUsedCdCdgDsply());
		}
		/******************** Prcdr_UsedCd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrUsedCdCdgSys() != null) {
			procedureusedcodecoding.setSystem(p.getPrcdrUsedCdCdgSys());
		}
		/******************** Prcdr_UsedCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrUsedCdCdgUsrSltd() != null) {
			procedureusedcodecoding.setUserSelected(Boolean.parseBoolean(p.getPrcdrUsedCdCdgUsrSltd()));
		}
		/******************** Prcdr_UsedCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrUsedCdCdgVrsn() != null) {
			procedureusedcodecoding.setVersion(p.getPrcdrUsedCdCdgVrsn());
		}
		/******************** Prcdr_UsedCd_Txt ********************************************************************************/
		if(p.getPrcdrUsedCdTxt() != null) {
			procedureusedcode.setText(p.getPrcdrUsedCdTxt());
		}
		/******************** Prcdr_UsedRfrnc ********************************************************************************/
		if(p.getPrcdrUsedRfrnc() != null) {
			procedure.addUsedReference( new org.hl7.fhir.r4.model.Reference(p.getPrcdrUsedRfrnc()));
		}
		return procedure;
	}
}
