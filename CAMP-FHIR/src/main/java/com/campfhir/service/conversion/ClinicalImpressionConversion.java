package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClinicalImpression;
public class ClinicalImpressionConversion 
{
	public org.hl7.fhir.r4.model.ClinicalImpression ClinicalImpressions(ClinicalImpression c) throws ParseException
	{
		org.hl7.fhir.r4.model.ClinicalImpression clinicalimpression = new org.hl7.fhir.r4.model.ClinicalImpression();

		/******************** id ********************************************************************************/
		clinicalimpression.setId(c.getId());

		/******************** ClnclImprssn_Assessor ********************************************************************************/
		if(c.getClnclImprssnAssessor() != null) {
			clinicalimpression.setAssessor( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnAssessor()));
		}
		/******************** clinicalimpressioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpression.setCode(clinicalimpressioncode);

		/******************** clinicalimpressioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressioncode.addCoding(clinicalimpressioncodecoding);

		/******************** ClnclImprssn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnCdCdgCd() != null) {
			clinicalimpressioncodecoding.setCode(c.getClnclImprssnCdCdgCd());
		}
		/******************** ClnclImprssn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnCdCdgDsply() != null) {
			clinicalimpressioncodecoding.setDisplay(c.getClnclImprssnCdCdgDsply());
		}
		/******************** ClnclImprssn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnCdCdgSys() != null) {
			clinicalimpressioncodecoding.setSystem(c.getClnclImprssnCdCdgSys());
		}
		/******************** ClnclImprssn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnCdCdgUsrSltd() != null) {
			clinicalimpressioncodecoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnCdCdgUsrSltd()));
		}
		/******************** ClnclImprssn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnCdCdgVrsn() != null) {
			clinicalimpressioncodecoding.setVersion(c.getClnclImprssnCdCdgVrsn());
		}
		/******************** ClnclImprssn_Cd_Txt ********************************************************************************/
		if(c.getClnclImprssnCdTxt() != null) {
			clinicalimpressioncode.setText(c.getClnclImprssnCdTxt());
		}
		/******************** ClnclImprssn_Dt ********************************************************************************/
		if(c.getClnclImprssnDt() != null) {
			java.text.SimpleDateFormat ClnclImprssn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_Dtdate = ClnclImprssn_Dtsdf.parse(c.getClnclImprssnDt());
			clinicalimpression.setDate(ClnclImprssn_Dtdate);
		}
		/******************** ClnclImprssn_Dscrptn ********************************************************************************/
		if(c.getClnclImprssnDscrptn() != null) {
			clinicalimpression.setDescription(c.getClnclImprssnDscrptn());
		}
		/******************** ClnclImprssn_EfctiveDtTimeTyp ********************************************************************************/
		if(c.getClnclImprssnEfctiveDtTimeTyp() != null) {
			clinicalimpression.setEffective( new org.hl7.fhir.r4.model.DateTimeType(c.getClnclImprssnEfctiveDtTimeTyp()));
		}
		/******************** clinicalimpressioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		clinicalimpression.setEffective(clinicalimpressioneffectiveperiod);

		/******************** ClnclImprssn_EfctivePrd_End ********************************************************************************/
		if(c.getClnclImprssnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat ClnclImprssn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_EfctivePrd_Enddate = ClnclImprssn_EfctivePrd_Endsdf.parse(c.getClnclImprssnEfctivePrdEnd());
			clinicalimpressioneffectiveperiod.setEnd(ClnclImprssn_EfctivePrd_Enddate);
		}
		/******************** ClnclImprssn_EfctivePrd_Strt ********************************************************************************/
		if(c.getClnclImprssnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat ClnclImprssn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_EfctivePrd_Strtdate = ClnclImprssn_EfctivePrd_Strtsdf.parse(c.getClnclImprssnEfctivePrdStrt());
			clinicalimpressioneffectiveperiod.setStart(ClnclImprssn_EfctivePrd_Strtdate);
		}
		/******************** ClnclImprssn_Enc ********************************************************************************/
		if(c.getClnclImprssnEnc() != null) {
			clinicalimpression.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnEnc()));
		}
		/******************** clinicalimpressionfinding ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent clinicalimpressionfinding =  new org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent();
		clinicalimpression.addFinding(clinicalimpressionfinding);

		/******************** ClnclImprssn_Finding_Basis ********************************************************************************/
		if(c.getClnclImprssnFindingBasis() != null) {
			clinicalimpressionfinding.setBasis(c.getClnclImprssnFindingBasis());
		}
		/******************** clinicalimpressionfindingitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionfindingitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpressionfinding.setItemCodeableConcept(clinicalimpressionfindingitemcodeableconcept);

		/******************** clinicalimpressionfindingitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionfindingitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressionfindingitemcodeableconcept.addCoding(clinicalimpressionfindingitemcodeableconceptcoding);

		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgCd() != null) {
			clinicalimpressionfindingitemcodeableconceptcoding.setCode(c.getClnclImprssnFindingItmCdbleCncptCdgCd());
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgDsply() != null) {
			clinicalimpressionfindingitemcodeableconceptcoding.setDisplay(c.getClnclImprssnFindingItmCdbleCncptCdgDsply());
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgSys() != null) {
			clinicalimpressionfindingitemcodeableconceptcoding.setSystem(c.getClnclImprssnFindingItmCdbleCncptCdgSys());
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgUsrSltd() != null) {
			clinicalimpressionfindingitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnFindingItmCdbleCncptCdgUsrSltd()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgVrsn() != null) {
			clinicalimpressionfindingitemcodeableconceptcoding.setVersion(c.getClnclImprssnFindingItmCdbleCncptCdgVrsn());
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Txt ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptTxt() != null) {
			clinicalimpressionfindingitemcodeableconcept.setText(c.getClnclImprssnFindingItmCdbleCncptTxt());
		}
		/******************** ClnclImprssn_Finding_ItmRfrnc ********************************************************************************/
		if(c.getClnclImprssnFindingItmRfrnc() != null) {
			clinicalimpressionfinding.setItemReference( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnFindingItmRfrnc()));
		}
		/******************** clinicalimpressionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier clinicalimpressionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		clinicalimpression.addIdentifier(clinicalimpressionidentifier);

		/******************** ClnclImprssn_Id_Assigner ********************************************************************************/
		if(c.getClnclImprssnIdAssigner() != null) {
			clinicalimpressionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnIdAssigner()));
		}
		/******************** clinicalimpressionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		clinicalimpressionidentifier.setPeriod(clinicalimpressionidentifierperiod);

		/******************** ClnclImprssn_Id_Prd_End ********************************************************************************/
		if(c.getClnclImprssnIdPrdEnd() != null) {
			java.text.SimpleDateFormat ClnclImprssn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_Id_Prd_Enddate = ClnclImprssn_Id_Prd_Endsdf.parse(c.getClnclImprssnIdPrdEnd());
			clinicalimpressionidentifierperiod.setEnd(ClnclImprssn_Id_Prd_Enddate);
		}
		/******************** ClnclImprssn_Id_Prd_Strt ********************************************************************************/
		if(c.getClnclImprssnIdPrdStrt() != null) {
			java.text.SimpleDateFormat ClnclImprssn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_Id_Prd_Strtdate = ClnclImprssn_Id_Prd_Strtsdf.parse(c.getClnclImprssnIdPrdStrt());
			clinicalimpressionidentifierperiod.setStart(ClnclImprssn_Id_Prd_Strtdate);
		}
		/******************** ClnclImprssn_Id_Sys ********************************************************************************/
		if(c.getClnclImprssnIdSys() != null) {
			clinicalimpressionidentifier.setSystem(c.getClnclImprssnIdSys());
		}
		/******************** clinicalimpressionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpressionidentifier.setType(clinicalimpressionidentifiertype);

		/******************** clinicalimpressionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressionidentifiertype.addCoding(clinicalimpressionidentifiertypecoding);

		/******************** ClnclImprssn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgCd() != null) {
			clinicalimpressionidentifiertypecoding.setCode(c.getClnclImprssnIdTypCdgCd());
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgDsply() != null) {
			clinicalimpressionidentifiertypecoding.setDisplay(c.getClnclImprssnIdTypCdgDsply());
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgSys() != null) {
			clinicalimpressionidentifiertypecoding.setSystem(c.getClnclImprssnIdTypCdgSys());
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgUsrSltd() != null) {
			clinicalimpressionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnIdTypCdgUsrSltd()));
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgVrsn() != null) {
			clinicalimpressionidentifiertypecoding.setVersion(c.getClnclImprssnIdTypCdgVrsn());
		}
		/******************** ClnclImprssn_Id_Typ_Txt ********************************************************************************/
		if(c.getClnclImprssnIdTypTxt() != null) {
			clinicalimpressionidentifiertype.setText(c.getClnclImprssnIdTypTxt());
		}
		/******************** clinicalimpressionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory clinicalimpressionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		clinicalimpressionidentifier.setUse(clinicalimpressionidentifieruse.fromCode(c.getClnclImprssnIdUse()));

		/******************** ClnclImprssn_Id_Vl ********************************************************************************/
		if(c.getClnclImprssnIdVl() != null) {
			clinicalimpressionidentifier.setValue(c.getClnclImprssnIdVl());
		}
		/******************** clinicalimpressioninvestigation ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent clinicalimpressioninvestigation =  new org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent();
		clinicalimpression.addInvestigation(clinicalimpressioninvestigation);

		/******************** clinicalimpressioninvestigationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioninvestigationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpressioninvestigation.setCode(clinicalimpressioninvestigationcode);

		/******************** clinicalimpressioninvestigationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressioninvestigationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressioninvestigationcode.addCoding(clinicalimpressioninvestigationcodecoding);

		/******************** ClnclImprssn_Investigation_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgCd() != null) {
			clinicalimpressioninvestigationcodecoding.setCode(c.getClnclImprssnInvestigationCdCdgCd());
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgDsply() != null) {
			clinicalimpressioninvestigationcodecoding.setDisplay(c.getClnclImprssnInvestigationCdCdgDsply());
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgSys() != null) {
			clinicalimpressioninvestigationcodecoding.setSystem(c.getClnclImprssnInvestigationCdCdgSys());
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgUsrSltd() != null) {
			clinicalimpressioninvestigationcodecoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnInvestigationCdCdgUsrSltd()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgVrsn() != null) {
			clinicalimpressioninvestigationcodecoding.setVersion(c.getClnclImprssnInvestigationCdCdgVrsn());
		}
		/******************** ClnclImprssn_Investigation_Cd_Txt ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdTxt() != null) {
			clinicalimpressioninvestigationcode.setText(c.getClnclImprssnInvestigationCdTxt());
		}
		/******************** ClnclImprssn_Investigation_Itm ********************************************************************************/
		if(c.getClnclImprssnInvestigationItm() != null) {
			clinicalimpressioninvestigation.addItem( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnInvestigationItm()));
		}
		/******************** clinicalimpressionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation clinicalimpressionnote =  new org.hl7.fhir.r4.model.Annotation();
		clinicalimpression.addNote(clinicalimpressionnote);

		/******************** ClnclImprssn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getClnclImprssnNtAthrRfrnc() != null) {
			clinicalimpressionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnNtAthrRfrnc()));
		}
		/******************** ClnclImprssn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getClnclImprssnNtAthrStrgTyp() != null) {
			clinicalimpressionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getClnclImprssnNtAthrStrgTyp()));
		}
		/******************** ClnclImprssn_Nt_Txt ********************************************************************************/
		if(c.getClnclImprssnNtTxt() != null) {
			clinicalimpressionnote.setText(c.getClnclImprssnNtTxt());
		}
		/******************** ClnclImprssn_Nt_Time ********************************************************************************/
		if(c.getClnclImprssnNtTime() != null) {
			java.text.SimpleDateFormat ClnclImprssn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClnclImprssn_Nt_Timedate = ClnclImprssn_Nt_Timesdf.parse(c.getClnclImprssnNtTime());
			clinicalimpressionnote.setTime(ClnclImprssn_Nt_Timedate);
		}
		/******************** ClnclImprssn_Previous ********************************************************************************/
		if(c.getClnclImprssnPrevious() != null) {
			clinicalimpression.setPrevious( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnPrevious()));
		}
		/******************** ClnclImprssn_Problem ********************************************************************************/
		if(c.getClnclImprssnProblem() != null) {
			clinicalimpression.addProblem( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnProblem()));
		}
		/******************** clinicalimpressionprognosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionprognosiscodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpression.addPrognosisCodeableConcept(clinicalimpressionprognosiscodeableconcept);

		/******************** clinicalimpressionprognosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionprognosiscodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressionprognosiscodeableconcept.addCoding(clinicalimpressionprognosiscodeableconceptcoding);

		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgCd() != null) {
			clinicalimpressionprognosiscodeableconceptcoding.setCode(c.getClnclImprssnPrognosisCdbleCncptCdgCd());
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgDsply() != null) {
			clinicalimpressionprognosiscodeableconceptcoding.setDisplay(c.getClnclImprssnPrognosisCdbleCncptCdgDsply());
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgSys() != null) {
			clinicalimpressionprognosiscodeableconceptcoding.setSystem(c.getClnclImprssnPrognosisCdbleCncptCdgSys());
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgUsrSltd() != null) {
			clinicalimpressionprognosiscodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnPrognosisCdbleCncptCdgUsrSltd()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgVrsn() != null) {
			clinicalimpressionprognosiscodeableconceptcoding.setVersion(c.getClnclImprssnPrognosisCdbleCncptCdgVrsn());
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Txt ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptTxt() != null) {
			clinicalimpressionprognosiscodeableconcept.setText(c.getClnclImprssnPrognosisCdbleCncptTxt());
		}
		/******************** ClnclImprssn_PrognosisRfrnc ********************************************************************************/
		if(c.getClnclImprssnPrognosisRfrnc() != null) {
			clinicalimpression.addPrognosisReference( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnPrognosisRfrnc()));
		}
		/******************** ClnclImprssn_Protocol ********************************************************************************/
		if(c.getClnclImprssnProtocol() != null) {
			clinicalimpression.addProtocol(c.getClnclImprssnProtocol());
		}
		/******************** clinicalimpressionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatusEnumFactory clinicalimpressionstatus =  new org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatusEnumFactory();
		clinicalimpression.setStatus(clinicalimpressionstatus.fromCode(c.getClnclImprssnSts()));

		/******************** clinicalimpressionstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		clinicalimpression.setStatusReason(clinicalimpressionstatusreason);

		/******************** clinicalimpressionstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		clinicalimpressionstatusreason.addCoding(clinicalimpressionstatusreasoncoding);

		/******************** ClnclImprssn_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgCd() != null) {
			clinicalimpressionstatusreasoncoding.setCode(c.getClnclImprssnStsRsnCdgCd());
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgDsply() != null) {
			clinicalimpressionstatusreasoncoding.setDisplay(c.getClnclImprssnStsRsnCdgDsply());
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgSys() != null) {
			clinicalimpressionstatusreasoncoding.setSystem(c.getClnclImprssnStsRsnCdgSys());
		}
		/******************** ClnclImprssn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgUsrSltd() != null) {
			clinicalimpressionstatusreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClnclImprssnStsRsnCdgUsrSltd()));
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgVrsn() != null) {
			clinicalimpressionstatusreasoncoding.setVersion(c.getClnclImprssnStsRsnCdgVrsn());
		}
		/******************** ClnclImprssn_StsRsn_Txt ********************************************************************************/
		if(c.getClnclImprssnStsRsnTxt() != null) {
			clinicalimpressionstatusreason.setText(c.getClnclImprssnStsRsnTxt());
		}
		/******************** ClnclImprssn_Sbjct ********************************************************************************/
		if(c.getClnclImprssnSbjct() != null) {
			clinicalimpression.setSubject( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnSbjct()));
		}
		/******************** ClnclImprssn_Summary ********************************************************************************/
		if(c.getClnclImprssnSummary() != null) {
			clinicalimpression.setSummary(c.getClnclImprssnSummary());
		}
		/******************** ClnclImprssn_SprtingInfo ********************************************************************************/
		if(c.getClnclImprssnSprtingInfo() != null) {
			clinicalimpression.addSupportingInfo( new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnSprtingInfo()));
		}
		return clinicalimpression;
	}
}
