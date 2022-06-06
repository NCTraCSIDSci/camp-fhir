package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ObservationDefinition;
public class ObservationDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ObservationDefinition ObservationDefinitions(ObservationDefinition o) throws ParseException
	{
		org.hl7.fhir.r4.model.ObservationDefinition observationdefinition = new org.hl7.fhir.r4.model.ObservationDefinition();

		/******************** id ********************************************************************************/
		observationdefinition.setId(o.getId());

		/******************** ObsrvtnDfn_AbnormalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnAbnormalCddVlSt() != null) {
			observationdefinition.setAbnormalCodedValueSet( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnAbnormalCddVlSt()));
		}
		/******************** observationdefinitioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitioncategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinition.addCategory(observationdefinitioncategory);

		/******************** observationdefinitioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitioncategorycoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitioncategory.addCoding(observationdefinitioncategorycoding);

		/******************** ObsrvtnDfn_Ctgry_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgCd() != null) {
			observationdefinitioncategorycoding.setCode(o.getObsrvtnDfnCtgryCdgCd());
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgDsply() != null) {
			observationdefinitioncategorycoding.setDisplay(o.getObsrvtnDfnCtgryCdgDsply());
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgSys() != null) {
			observationdefinitioncategorycoding.setSystem(o.getObsrvtnDfnCtgryCdgSys());
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgUsrSltd() != null) {
			observationdefinitioncategorycoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnCtgryCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgVrsn() != null) {
			observationdefinitioncategorycoding.setVersion(o.getObsrvtnDfnCtgryCdgVrsn());
		}
		/******************** ObsrvtnDfn_Ctgry_Txt ********************************************************************************/
		if(o.getObsrvtnDfnCtgryTxt() != null) {
			observationdefinitioncategory.setText(o.getObsrvtnDfnCtgryTxt());
		}
		/******************** observationdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinition.setCode(observationdefinitioncode);

		/******************** observationdefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitioncode.addCoding(observationdefinitioncodecoding);

		/******************** ObsrvtnDfn_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgCd() != null) {
			observationdefinitioncodecoding.setCode(o.getObsrvtnDfnCdCdgCd());
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgDsply() != null) {
			observationdefinitioncodecoding.setDisplay(o.getObsrvtnDfnCdCdgDsply());
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgSys() != null) {
			observationdefinitioncodecoding.setSystem(o.getObsrvtnDfnCdCdgSys());
		}
		/******************** ObsrvtnDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgUsrSltd() != null) {
			observationdefinitioncodecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnCdCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgVrsn() != null) {
			observationdefinitioncodecoding.setVersion(o.getObsrvtnDfnCdCdgVrsn());
		}
		/******************** ObsrvtnDfn_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnDfnCdTxt() != null) {
			observationdefinitioncode.setText(o.getObsrvtnDfnCdTxt());
		}
		/******************** ObsrvtnDfn_CriticalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnCriticalCddVlSt() != null) {
			observationdefinition.setCriticalCodedValueSet( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnCriticalCddVlSt()));
		}
		/******************** observationdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier observationdefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		observationdefinition.addIdentifier(observationdefinitionidentifier);

		/******************** ObsrvtnDfn_Id_Assigner ********************************************************************************/
		if(o.getObsrvtnDfnIdAssigner() != null) {
			observationdefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnIdAssigner()));
		}
		/******************** observationdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationdefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		observationdefinitionidentifier.setPeriod(observationdefinitionidentifierperiod);

		/******************** ObsrvtnDfn_Id_Prd_End ********************************************************************************/
		if(o.getObsrvtnDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat ObsrvtnDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsrvtnDfn_Id_Prd_Enddate = ObsrvtnDfn_Id_Prd_Endsdf.parse(o.getObsrvtnDfnIdPrdEnd());
			observationdefinitionidentifierperiod.setEnd(ObsrvtnDfn_Id_Prd_Enddate);
		}
		/******************** ObsrvtnDfn_Id_Prd_Strt ********************************************************************************/
		if(o.getObsrvtnDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat ObsrvtnDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsrvtnDfn_Id_Prd_Strtdate = ObsrvtnDfn_Id_Prd_Strtsdf.parse(o.getObsrvtnDfnIdPrdStrt());
			observationdefinitionidentifierperiod.setStart(ObsrvtnDfn_Id_Prd_Strtdate);
		}
		/******************** ObsrvtnDfn_Id_Sys ********************************************************************************/
		if(o.getObsrvtnDfnIdSys() != null) {
			observationdefinitionidentifier.setSystem(o.getObsrvtnDfnIdSys());
		}
		/******************** observationdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinitionidentifier.setType(observationdefinitionidentifiertype);

		/******************** observationdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionidentifiertype.addCoding(observationdefinitionidentifiertypecoding);

		/******************** ObsrvtnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgCd() != null) {
			observationdefinitionidentifiertypecoding.setCode(o.getObsrvtnDfnIdTypCdgCd());
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgDsply() != null) {
			observationdefinitionidentifiertypecoding.setDisplay(o.getObsrvtnDfnIdTypCdgDsply());
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgSys() != null) {
			observationdefinitionidentifiertypecoding.setSystem(o.getObsrvtnDfnIdTypCdgSys());
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgUsrSltd() != null) {
			observationdefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnIdTypCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgVrsn() != null) {
			observationdefinitionidentifiertypecoding.setVersion(o.getObsrvtnDfnIdTypCdgVrsn());
		}
		/******************** ObsrvtnDfn_Id_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnDfnIdTypTxt() != null) {
			observationdefinitionidentifiertype.setText(o.getObsrvtnDfnIdTypTxt());
		}
		/******************** observationdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory observationdefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		observationdefinitionidentifier.setUse(observationdefinitionidentifieruse.fromCode(o.getObsrvtnDfnIdUse()));

		/******************** ObsrvtnDfn_Id_Vl ********************************************************************************/
		if(o.getObsrvtnDfnIdVl() != null) {
			observationdefinitionidentifier.setValue(o.getObsrvtnDfnIdVl());
		}
		/******************** observationdefinitionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinition.setMethod(observationdefinitionmethod);

		/******************** observationdefinitionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionmethod.addCoding(observationdefinitionmethodcoding);

		/******************** ObsrvtnDfn_Mthd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgCd() != null) {
			observationdefinitionmethodcoding.setCode(o.getObsrvtnDfnMthdCdgCd());
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgDsply() != null) {
			observationdefinitionmethodcoding.setDisplay(o.getObsrvtnDfnMthdCdgDsply());
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgSys() != null) {
			observationdefinitionmethodcoding.setSystem(o.getObsrvtnDfnMthdCdgSys());
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgUsrSltd() != null) {
			observationdefinitionmethodcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnMthdCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgVrsn() != null) {
			observationdefinitionmethodcoding.setVersion(o.getObsrvtnDfnMthdCdgVrsn());
		}
		/******************** ObsrvtnDfn_Mthd_Txt ********************************************************************************/
		if(o.getObsrvtnDfnMthdTxt() != null) {
			observationdefinitionmethod.setText(o.getObsrvtnDfnMthdTxt());
		}
		/******************** ObsrvtnDfn_MultipleRsltsAllowed ********************************************************************************/
		if(o.getObsrvtnDfnMultipleRsltsAllowed() != null) {
			observationdefinition.setMultipleResultsAllowed(Boolean.parseBoolean(o.getObsrvtnDfnMultipleRsltsAllowed()));
		}
		/******************** ObsrvtnDfn_NormalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnNormalCddVlSt() != null) {
			observationdefinition.setNormalCodedValueSet( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnNormalCddVlSt()));
		}
		/******************** observationdefinitionpermitteddatatype ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataTypeEnumFactory observationdefinitionpermitteddatatype =  new org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataTypeEnumFactory();
		observationdefinition.addPermittedDataType(observationdefinitionpermitteddatatype.fromCode(o.getObsrvtnDfnPermittedDataTyp()));

		/******************** ObsrvtnDfn_PreferredRptNm ********************************************************************************/
		if(o.getObsrvtnDfnPreferredRptNm() != null) {
			observationdefinition.setPreferredReportName(o.getObsrvtnDfnPreferredRptNm());
		}
		/******************** observationdefinitionqualifiedinterval ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent observationdefinitionqualifiedinterval =  new org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent();
		observationdefinition.addQualifiedInterval(observationdefinitionqualifiedinterval);

		/******************** observationdefinitionqualifiedintervalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalage =  new org.hl7.fhir.r4.model.Range();
		observationdefinitionqualifiedinterval.setAge(observationdefinitionqualifiedintervalage);

		/******************** observationdefinitionqualifiedintervalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalage.setHigh(observationdefinitionqualifiedintervalagehigh);

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiCd() != null) {
			observationdefinitionqualifiedintervalagehigh.setCode(o.getObsrvtnDfnQualifiedIntervalAgeHiCd());
		}
		/******************** observationdefinitionqualifiedintervalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalagehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalagehigh.setComparator(observationdefinitionqualifiedintervalagehighcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalAgeHiCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiSys() != null) {
			observationdefinitionqualifiedintervalagehigh.setSystem(o.getObsrvtnDfnQualifiedIntervalAgeHiSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiUnt() != null) {
			observationdefinitionqualifiedintervalagehigh.setUnit(o.getObsrvtnDfnQualifiedIntervalAgeHiUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiVl() != null) {
			observationdefinitionqualifiedintervalagehigh.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalAgeHiVl())));
		}
		/******************** observationdefinitionqualifiedintervalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagelow =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalage.setLow(observationdefinitionqualifiedintervalagelow);

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwCd() != null) {
			observationdefinitionqualifiedintervalagelow.setCode(o.getObsrvtnDfnQualifiedIntervalAgeLwCd());
		}
		/******************** observationdefinitionqualifiedintervalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalagelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalagelow.setComparator(observationdefinitionqualifiedintervalagelowcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalAgeLwCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwSys() != null) {
			observationdefinitionqualifiedintervalagelow.setSystem(o.getObsrvtnDfnQualifiedIntervalAgeLwSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwUnt() != null) {
			observationdefinitionqualifiedintervalagelow.setUnit(o.getObsrvtnDfnQualifiedIntervalAgeLwUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwVl() != null) {
			observationdefinitionqualifiedintervalagelow.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalAgeLwVl())));
		}
		/******************** observationdefinitionqualifiedintervalappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionqualifiedintervalappliesto =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinitionqualifiedinterval.addAppliesTo(observationdefinitionqualifiedintervalappliesto);

		/******************** observationdefinitionqualifiedintervalappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionqualifiedintervalappliestocoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionqualifiedintervalappliesto.addCoding(observationdefinitionqualifiedintervalappliestocoding);

		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd() != null) {
			observationdefinitionqualifiedintervalappliestocoding.setCode(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply() != null) {
			observationdefinitionqualifiedintervalappliestocoding.setDisplay(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys() != null) {
			observationdefinitionqualifiedintervalappliestocoding.setSystem(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd() != null) {
			observationdefinitionqualifiedintervalappliestocoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn() != null) {
			observationdefinitionqualifiedintervalappliestocoding.setVersion(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToTxt() != null) {
			observationdefinitionqualifiedintervalappliesto.setText(o.getObsrvtnDfnQualifiedIntervalAppliesToTxt());
		}
		/******************** observationdefinitionqualifiedintervalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategoryEnumFactory observationdefinitionqualifiedintervalcategory =  new org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategoryEnumFactory();
		observationdefinitionqualifiedinterval.setCategory(observationdefinitionqualifiedintervalcategory.fromCode(o.getObsrvtnDfnQualifiedIntervalCtgry()));

		/******************** ObsrvtnDfn_QualifiedInterval_Cndtn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCndtn() != null) {
			observationdefinitionqualifiedinterval.setCondition(o.getObsrvtnDfnQualifiedIntervalCndtn());
		}
		/******************** observationdefinitionqualifiedintervalcontext ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionqualifiedintervalcontext =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinitionqualifiedinterval.setContext(observationdefinitionqualifiedintervalcontext);

		/******************** observationdefinitionqualifiedintervalcontextcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionqualifiedintervalcontextcoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionqualifiedintervalcontext.addCoding(observationdefinitionqualifiedintervalcontextcoding);

		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgCd() != null) {
			observationdefinitionqualifiedintervalcontextcoding.setCode(o.getObsrvtnDfnQualifiedIntervalCntxtCdgCd());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgDsply() != null) {
			observationdefinitionqualifiedintervalcontextcoding.setDisplay(o.getObsrvtnDfnQualifiedIntervalCntxtCdgDsply());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgSys() != null) {
			observationdefinitionqualifiedintervalcontextcoding.setSystem(o.getObsrvtnDfnQualifiedIntervalCntxtCdgSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd() != null) {
			observationdefinitionqualifiedintervalcontextcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgVrsn() != null) {
			observationdefinitionqualifiedintervalcontextcoding.setVersion(o.getObsrvtnDfnQualifiedIntervalCntxtCdgVrsn());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtTxt() != null) {
			observationdefinitionqualifiedintervalcontext.setText(o.getObsrvtnDfnQualifiedIntervalCntxtTxt());
		}
		/******************** observationdefinitionqualifiedintervalgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory observationdefinitionqualifiedintervalgender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		observationdefinitionqualifiedinterval.setGender(observationdefinitionqualifiedintervalgender.fromCode(o.getObsrvtnDfnQualifiedIntervalGender()));

		/******************** observationdefinitionqualifiedintervalgestationalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalgestationalage =  new org.hl7.fhir.r4.model.Range();
		observationdefinitionqualifiedinterval.setGestationalAge(observationdefinitionqualifiedintervalgestationalage);

		/******************** observationdefinitionqualifiedintervalgestationalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalgestationalage.setHigh(observationdefinitionqualifiedintervalgestationalagehigh);

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCd() != null) {
			observationdefinitionqualifiedintervalgestationalagehigh.setCode(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCd());
		}
		/******************** observationdefinitionqualifiedintervalgestationalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalgestationalagehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalgestationalagehigh.setComparator(observationdefinitionqualifiedintervalgestationalagehighcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiSys() != null) {
			observationdefinitionqualifiedintervalgestationalagehigh.setSystem(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt() != null) {
			observationdefinitionqualifiedintervalgestationalagehigh.setUnit(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiVl() != null) {
			observationdefinitionqualifiedintervalgestationalagehigh.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiVl())));
		}
		/******************** observationdefinitionqualifiedintervalgestationalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagelow =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalgestationalage.setLow(observationdefinitionqualifiedintervalgestationalagelow);

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCd() != null) {
			observationdefinitionqualifiedintervalgestationalagelow.setCode(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCd());
		}
		/******************** observationdefinitionqualifiedintervalgestationalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalgestationalagelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalgestationalagelow.setComparator(observationdefinitionqualifiedintervalgestationalagelowcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwSys() != null) {
			observationdefinitionqualifiedintervalgestationalagelow.setSystem(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt() != null) {
			observationdefinitionqualifiedintervalgestationalagelow.setUnit(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwVl() != null) {
			observationdefinitionqualifiedintervalgestationalagelow.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwVl())));
		}
		/******************** observationdefinitionqualifiedintervalrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalrange =  new org.hl7.fhir.r4.model.Range();
		observationdefinitionqualifiedinterval.setRange(observationdefinitionqualifiedintervalrange);

		/******************** observationdefinitionqualifiedintervalrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalrange.setHigh(observationdefinitionqualifiedintervalrangehigh);

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiCd() != null) {
			observationdefinitionqualifiedintervalrangehigh.setCode(o.getObsrvtnDfnQualifiedIntervalRngHiCd());
		}
		/******************** observationdefinitionqualifiedintervalrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalrangehigh.setComparator(observationdefinitionqualifiedintervalrangehighcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalRngHiCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiSys() != null) {
			observationdefinitionqualifiedintervalrangehigh.setSystem(o.getObsrvtnDfnQualifiedIntervalRngHiSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiUnt() != null) {
			observationdefinitionqualifiedintervalrangehigh.setUnit(o.getObsrvtnDfnQualifiedIntervalRngHiUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiVl() != null) {
			observationdefinitionqualifiedintervalrangehigh.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalRngHiVl())));
		}
		/******************** observationdefinitionqualifiedintervalrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationdefinitionqualifiedintervalrange.setLow(observationdefinitionqualifiedintervalrangelow);

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwCd() != null) {
			observationdefinitionqualifiedintervalrangelow.setCode(o.getObsrvtnDfnQualifiedIntervalRngLwCd());
		}
		/******************** observationdefinitionqualifiedintervalrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationdefinitionqualifiedintervalrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationdefinitionqualifiedintervalrangelow.setComparator(observationdefinitionqualifiedintervalrangelowcomparator.fromCode(o.getObsrvtnDfnQualifiedIntervalRngLwCmprtr()));

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwSys() != null) {
			observationdefinitionqualifiedintervalrangelow.setSystem(o.getObsrvtnDfnQualifiedIntervalRngLwSys());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwUnt() != null) {
			observationdefinitionqualifiedintervalrangelow.setUnit(o.getObsrvtnDfnQualifiedIntervalRngLwUnt());
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwVl() != null) {
			observationdefinitionqualifiedintervalrangelow.setValue(Double.parseDouble((o.getObsrvtnDfnQualifiedIntervalRngLwVl())));
		}
		/******************** observationdefinitionquantitativedetails ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent observationdefinitionquantitativedetails =  new org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent();
		observationdefinition.setQuantitativeDetails(observationdefinitionquantitativedetails);

		/******************** ObsrvtnDfn_QuantitativeDtls_ConversionFactor ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsConversionFactor() != null) {
			observationdefinitionquantitativedetails.setConversionFactor(Double.parseDouble((o.getObsrvtnDfnQuantitativeDtlsConversionFactor())));
		}
		/******************** observationdefinitionquantitativedetailscustomaryunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailscustomaryunit =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinitionquantitativedetails.setCustomaryUnit(observationdefinitionquantitativedetailscustomaryunit);

		/******************** observationdefinitionquantitativedetailscustomaryunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionquantitativedetailscustomaryunitcoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionquantitativedetailscustomaryunit.addCoding(observationdefinitionquantitativedetailscustomaryunitcoding);

		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd() != null) {
			observationdefinitionquantitativedetailscustomaryunitcoding.setCode(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply() != null) {
			observationdefinitionquantitativedetailscustomaryunitcoding.setDisplay(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys() != null) {
			observationdefinitionquantitativedetailscustomaryunitcoding.setSystem(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd() != null) {
			observationdefinitionquantitativedetailscustomaryunitcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn() != null) {
			observationdefinitionquantitativedetailscustomaryunitcoding.setVersion(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt() != null) {
			observationdefinitionquantitativedetailscustomaryunit.setText(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_DecimalPrecision ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision() != null) {
			observationdefinitionquantitativedetails.setDecimalPrecision(Integer.parseInt(o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision()));
		}
		/******************** observationdefinitionquantitativedetailsunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailsunit =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationdefinitionquantitativedetails.setUnit(observationdefinitionquantitativedetailsunit);

		/******************** observationdefinitionquantitativedetailsunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionquantitativedetailsunitcoding =  new org.hl7.fhir.r4.model.Coding();
		observationdefinitionquantitativedetailsunit.addCoding(observationdefinitionquantitativedetailsunitcoding);

		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgCd() != null) {
			observationdefinitionquantitativedetailsunitcoding.setCode(o.getObsrvtnDfnQuantitativeDtlsUntCdgCd());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgDsply() != null) {
			observationdefinitionquantitativedetailsunitcoding.setDisplay(o.getObsrvtnDfnQuantitativeDtlsUntCdgDsply());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgSys() != null) {
			observationdefinitionquantitativedetailsunitcoding.setSystem(o.getObsrvtnDfnQuantitativeDtlsUntCdgSys());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd() != null) {
			observationdefinitionquantitativedetailsunitcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgVrsn() != null) {
			observationdefinitionquantitativedetailsunitcoding.setVersion(o.getObsrvtnDfnQuantitativeDtlsUntCdgVrsn());
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntTxt() != null) {
			observationdefinitionquantitativedetailsunit.setText(o.getObsrvtnDfnQuantitativeDtlsUntTxt());
		}
		/******************** ObsrvtnDfn_ValidCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnValidCddVlSt() != null) {
			observationdefinition.setValidCodedValueSet( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnValidCddVlSt()));
		}
		return observationdefinition;
	}
}
