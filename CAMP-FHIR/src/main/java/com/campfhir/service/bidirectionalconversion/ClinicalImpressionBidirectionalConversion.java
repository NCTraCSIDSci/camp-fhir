package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClinicalImpression;
public class ClinicalImpressionBidirectionalConversion 
{
	public ClinicalImpression ClinicalImpressions(org.hl7.fhir.r4.model.ClinicalImpression clinicalimpression) throws ParseException
	{
		 main.java.com.campfhir.model.ClinicalImpression c = new  main.java.com.campfhir.model.ClinicalImpression();

		/******************** id ********************************************************************************/
		clinicalimpression.setId(c.getId());

		/******************** ClnclImprssn_Dt ********************************************************************************/
		if(clinicalimpression.hasDate()) {
			c.setClnclImprssnDt(String.valueOf(clinicalimpression.getDate()));
		}
		/******************** clinicalimpressioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioncode = clinicalimpression.getCode();

		/******************** clinicalimpressioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressioncodecoding = clinicalimpressioncode.getCodingFirstRep();

		/******************** ClnclImprssn_Cd_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressioncodecoding.hasDisplay()) {
			c.setClnclImprssnCdCdgDsply(String.valueOf(clinicalimpressioncodecoding.getDisplay()));
		}
		/******************** ClnclImprssn_Cd_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressioncodecoding.hasVersion()) {
			c.setClnclImprssnCdCdgVrsn(String.valueOf(clinicalimpressioncodecoding.getVersion()));
		}
		/******************** ClnclImprssn_Cd_Cdg_Cd ********************************************************************************/
		if(clinicalimpressioncodecoding.hasCode()) {
			c.setClnclImprssnCdCdgCd(String.valueOf(clinicalimpressioncodecoding.getCode()));
		}
		/******************** ClnclImprssn_Cd_Cdg_Sys ********************************************************************************/
		if(clinicalimpressioncodecoding.hasSystem()) {
			c.setClnclImprssnCdCdgSys(String.valueOf(clinicalimpressioncodecoding.getSystem()));
		}
		/******************** ClnclImprssn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressioncodecoding.hasUserSelected()) {
			c.setClnclImprssnCdCdgUsrSltd(String.valueOf(clinicalimpressioncodecoding.getUserSelected()));
		}
		/******************** ClnclImprssn_Cd_Txt ********************************************************************************/
		if(clinicalimpressioncode.hasText()) {
			c.setClnclImprssnCdTxt(String.valueOf(clinicalimpressioncode.getText()));
		}
		/******************** ClnclImprssn_PrognosisRfrnc ********************************************************************************/
		if(clinicalimpression.hasPrognosisReference()) {
			c.setClnclImprssnPrognosisRfrnc(String.valueOf(clinicalimpression.getPrognosisReferenceFirstRep()));
		}
		/******************** clinicalimpressioninvestigation ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent clinicalimpressioninvestigation = clinicalimpression.getInvestigationFirstRep();

		/******************** clinicalimpressioninvestigationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioninvestigationcode = clinicalimpressioninvestigation.getCode();

		/******************** clinicalimpressioninvestigationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressioninvestigationcodecoding = clinicalimpressioninvestigationcode.getCodingFirstRep();

		/******************** ClnclImprssn_Investigation_Cd_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressioninvestigationcodecoding.hasDisplay()) {
			c.setClnclImprssnInvestigationCdCdgDsply(String.valueOf(clinicalimpressioninvestigationcodecoding.getDisplay()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressioninvestigationcodecoding.hasVersion()) {
			c.setClnclImprssnInvestigationCdCdgVrsn(String.valueOf(clinicalimpressioninvestigationcodecoding.getVersion()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Cd ********************************************************************************/
		if(clinicalimpressioninvestigationcodecoding.hasCode()) {
			c.setClnclImprssnInvestigationCdCdgCd(String.valueOf(clinicalimpressioninvestigationcodecoding.getCode()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Sys ********************************************************************************/
		if(clinicalimpressioninvestigationcodecoding.hasSystem()) {
			c.setClnclImprssnInvestigationCdCdgSys(String.valueOf(clinicalimpressioninvestigationcodecoding.getSystem()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressioninvestigationcodecoding.hasUserSelected()) {
			c.setClnclImprssnInvestigationCdCdgUsrSltd(String.valueOf(clinicalimpressioninvestigationcodecoding.getUserSelected()));
		}
		/******************** ClnclImprssn_Investigation_Cd_Txt ********************************************************************************/
		if(clinicalimpressioninvestigationcode.hasText()) {
			c.setClnclImprssnInvestigationCdTxt(String.valueOf(clinicalimpressioninvestigationcode.getText()));
		}
		/******************** ClnclImprssn_Investigation_Itm ********************************************************************************/
		if(clinicalimpressioninvestigation.hasItem()) {
			c.setClnclImprssnInvestigationItm(String.valueOf(clinicalimpressioninvestigation.getItemFirstRep()));
		}
		/******************** ClnclImprssn_EfctiveDtTimeTyp ********************************************************************************/
		if(clinicalimpression.hasEffectiveDateTimeType()) {
			c.setClnclImprssnEfctiveDtTimeTyp(String.valueOf(clinicalimpression.getEffectiveDateTimeType()));
		}
		/******************** ClnclImprssn_Assessor ********************************************************************************/
		if(clinicalimpression.hasAssessor()) {
			c.setClnclImprssnAssessor(String.valueOf(clinicalimpression.getAssessor()));
		}
		/******************** ClnclImprssn_Problem ********************************************************************************/
		if(clinicalimpression.hasProblem()) {
			c.setClnclImprssnProblem(String.valueOf(clinicalimpression.getProblemFirstRep()));
		}
		/******************** ClnclImprssn_Previous ********************************************************************************/
		if(clinicalimpression.hasPrevious()) {
			c.setClnclImprssnPrevious(String.valueOf(clinicalimpression.getPrevious()));
		}
		/******************** ClnclImprssn_Summary ********************************************************************************/
		if(clinicalimpression.hasSummary()) {
			c.setClnclImprssnSummary(String.valueOf(clinicalimpression.getSummary()));
		}
		/******************** clinicalimpressionfinding ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent clinicalimpressionfinding = clinicalimpression.getFindingFirstRep();

		/******************** clinicalimpressionfindingitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionfindingitemcodeableconcept = clinicalimpressionfinding.getItemCodeableConcept();

		/******************** clinicalimpressionfindingitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionfindingitemcodeableconceptcoding = clinicalimpressionfindingitemcodeableconcept.getCodingFirstRep();

		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasDisplay()) {
			c.setClnclImprssnFindingItmCdbleCncptCdgDsply(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getDisplay()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasVersion()) {
			c.setClnclImprssnFindingItmCdbleCncptCdgVrsn(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getVersion()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasCode()) {
			c.setClnclImprssnFindingItmCdbleCncptCdgCd(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getCode()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasSystem()) {
			c.setClnclImprssnFindingItmCdbleCncptCdgSys(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getSystem()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasUserSelected()) {
			c.setClnclImprssnFindingItmCdbleCncptCdgUsrSltd(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Txt ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconcept.hasText()) {
			c.setClnclImprssnFindingItmCdbleCncptTxt(String.valueOf(clinicalimpressionfindingitemcodeableconcept.getText()));
		}
		/******************** ClnclImprssn_Finding_Basis ********************************************************************************/
		if(clinicalimpressionfinding.hasBasis()) {
			c.setClnclImprssnFindingBasis(String.valueOf(clinicalimpressionfinding.getBasis()));
		}
		/******************** ClnclImprssn_Finding_ItmRfrnc ********************************************************************************/
		if(clinicalimpressionfinding.hasItemReference()) {
			c.setClnclImprssnFindingItmRfrnc(String.valueOf(clinicalimpressionfinding.getItemReference()));
		}
		/******************** ClnclImprssn_Sbjct ********************************************************************************/
		if(clinicalimpression.hasSubject()) {
			c.setClnclImprssnSbjct(String.valueOf(clinicalimpression.getSubject()));
		}
		/******************** clinicalimpressionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatus clinicalimpressionstatus = clinicalimpression.getStatus();
		c.setClnclImprssnSts(clinicalimpressionstatus.toCode());

		/******************** ClnclImprssn_Enc ********************************************************************************/
		if(clinicalimpression.hasEncounter()) {
			c.setClnclImprssnEnc(String.valueOf(clinicalimpression.getEncounter()));
		}
		/******************** ClnclImprssn_Dscrptn ********************************************************************************/
		if(clinicalimpression.hasDescription()) {
			c.setClnclImprssnDscrptn(String.valueOf(clinicalimpression.getDescription()));
		}
		/******************** clinicalimpressionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation clinicalimpressionnote = clinicalimpression.getNoteFirstRep();

		/******************** ClnclImprssn_Nt_Time ********************************************************************************/
		if(clinicalimpressionnote.hasTime()) {
			c.setClnclImprssnNtTime(String.valueOf(clinicalimpressionnote.getTime()));
		}
		/******************** ClnclImprssn_Nt_AthrRfrnc ********************************************************************************/
		if(clinicalimpressionnote.hasAuthorReference()) {
			c.setClnclImprssnNtAthrRfrnc(String.valueOf(clinicalimpressionnote.getAuthorReference()));
		}
		/******************** ClnclImprssn_Nt_Txt ********************************************************************************/
		if(clinicalimpressionnote.hasText()) {
			c.setClnclImprssnNtTxt(String.valueOf(clinicalimpressionnote.getText()));
		}
		/******************** ClnclImprssn_Nt_AthrStrgTyp ********************************************************************************/
		if(clinicalimpressionnote.hasAuthorStringType()) {
			c.setClnclImprssnNtAthrStrgTyp(String.valueOf(clinicalimpressionnote.getAuthorStringType()));
		}
		/******************** clinicalimpressionstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionstatusreason = clinicalimpression.getStatusReason();

		/******************** clinicalimpressionstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionstatusreasoncoding = clinicalimpressionstatusreason.getCodingFirstRep();

		/******************** ClnclImprssn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionstatusreasoncoding.hasDisplay()) {
			c.setClnclImprssnStsRsnCdgDsply(String.valueOf(clinicalimpressionstatusreasoncoding.getDisplay()));
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionstatusreasoncoding.hasVersion()) {
			c.setClnclImprssnStsRsnCdgVrsn(String.valueOf(clinicalimpressionstatusreasoncoding.getVersion()));
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionstatusreasoncoding.hasCode()) {
			c.setClnclImprssnStsRsnCdgCd(String.valueOf(clinicalimpressionstatusreasoncoding.getCode()));
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionstatusreasoncoding.hasSystem()) {
			c.setClnclImprssnStsRsnCdgSys(String.valueOf(clinicalimpressionstatusreasoncoding.getSystem()));
		}
		/******************** ClnclImprssn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionstatusreasoncoding.hasUserSelected()) {
			c.setClnclImprssnStsRsnCdgUsrSltd(String.valueOf(clinicalimpressionstatusreasoncoding.getUserSelected()));
		}
		/******************** ClnclImprssn_StsRsn_Txt ********************************************************************************/
		if(clinicalimpressionstatusreason.hasText()) {
			c.setClnclImprssnStsRsnTxt(String.valueOf(clinicalimpressionstatusreason.getText()));
		}
		/******************** clinicalimpressionprognosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionprognosiscodeableconcept = clinicalimpression.getPrognosisCodeableConceptFirstRep();

		/******************** clinicalimpressionprognosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionprognosiscodeableconceptcoding = clinicalimpressionprognosiscodeableconcept.getCodingFirstRep();

		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcoding.hasDisplay()) {
			c.setClnclImprssnPrognosisCdbleCncptCdgDsply(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getDisplay()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcoding.hasVersion()) {
			c.setClnclImprssnPrognosisCdbleCncptCdgVrsn(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getVersion()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcoding.hasCode()) {
			c.setClnclImprssnPrognosisCdbleCncptCdgCd(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getCode()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcoding.hasSystem()) {
			c.setClnclImprssnPrognosisCdbleCncptCdgSys(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getSystem()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcoding.hasUserSelected()) {
			c.setClnclImprssnPrognosisCdbleCncptCdgUsrSltd(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getUserSelected()));
		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Txt ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconcept.hasText()) {
			c.setClnclImprssnPrognosisCdbleCncptTxt(String.valueOf(clinicalimpressionprognosiscodeableconcept.getText()));
		}
		/******************** clinicalimpressionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier clinicalimpressionidentifier = clinicalimpression.getIdentifierFirstRep();

		/******************** ClnclImprssn_Id_Vl ********************************************************************************/
		if(clinicalimpressionidentifier.hasValue()) {
			c.setClnclImprssnIdVl(String.valueOf(clinicalimpressionidentifier.getValue()));
		}
		/******************** clinicalimpressionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionidentifiertype = clinicalimpressionidentifier.getType();

		/******************** clinicalimpressionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding clinicalimpressionidentifiertypecoding = clinicalimpressionidentifiertype.getCodingFirstRep();

		/******************** ClnclImprssn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionidentifiertypecoding.hasDisplay()) {
			c.setClnclImprssnIdTypCdgDsply(String.valueOf(clinicalimpressionidentifiertypecoding.getDisplay()));
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionidentifiertypecoding.hasVersion()) {
			c.setClnclImprssnIdTypCdgVrsn(String.valueOf(clinicalimpressionidentifiertypecoding.getVersion()));
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionidentifiertypecoding.hasCode()) {
			c.setClnclImprssnIdTypCdgCd(String.valueOf(clinicalimpressionidentifiertypecoding.getCode()));
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionidentifiertypecoding.hasSystem()) {
			c.setClnclImprssnIdTypCdgSys(String.valueOf(clinicalimpressionidentifiertypecoding.getSystem()));
		}
		/******************** ClnclImprssn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionidentifiertypecoding.hasUserSelected()) {
			c.setClnclImprssnIdTypCdgUsrSltd(String.valueOf(clinicalimpressionidentifiertypecoding.getUserSelected()));
		}
		/******************** ClnclImprssn_Id_Typ_Txt ********************************************************************************/
		if(clinicalimpressionidentifiertype.hasText()) {
			c.setClnclImprssnIdTypTxt(String.valueOf(clinicalimpressionidentifiertype.getText()));
		}
		/******************** ClnclImprssn_Id_Sys ********************************************************************************/
		if(clinicalimpressionidentifier.hasSystem()) {
			c.setClnclImprssnIdSys(String.valueOf(clinicalimpressionidentifier.getSystem()));
		}
		/******************** ClnclImprssn_Id_Assigner ********************************************************************************/
		if(clinicalimpressionidentifier.hasAssigner()) {
			c.setClnclImprssnIdAssigner(String.valueOf(clinicalimpressionidentifier.getAssigner()));
		}
		/******************** clinicalimpressionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressionidentifierperiod = clinicalimpressionidentifier.getPeriod();

		/******************** ClnclImprssn_Id_Prd_End ********************************************************************************/
		if(clinicalimpressionidentifierperiod.hasEnd()) {
			c.setClnclImprssnIdPrdEnd(String.valueOf(clinicalimpressionidentifierperiod.getEnd()));
		}
		/******************** ClnclImprssn_Id_Prd_Strt ********************************************************************************/
		if(clinicalimpressionidentifierperiod.hasStart()) {
			c.setClnclImprssnIdPrdStrt(String.valueOf(clinicalimpressionidentifierperiod.getStart()));
		}
		/******************** clinicalimpressionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse clinicalimpressionidentifieruse = clinicalimpressionidentifier.getUse();
		c.setClnclImprssnIdUse(clinicalimpressionidentifieruse.toCode());

		/******************** clinicalimpressioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressioneffectiveperiod = clinicalimpression.getEffectivePeriod();

		/******************** ClnclImprssn_EfctivePrd_End ********************************************************************************/
		if(clinicalimpressioneffectiveperiod.hasEnd()) {
			c.setClnclImprssnEfctivePrdEnd(String.valueOf(clinicalimpressioneffectiveperiod.getEnd()));
		}
		/******************** ClnclImprssn_EfctivePrd_Strt ********************************************************************************/
		if(clinicalimpressioneffectiveperiod.hasStart()) {
			c.setClnclImprssnEfctivePrdStrt(String.valueOf(clinicalimpressioneffectiveperiod.getStart()));
		}
		/******************** ClnclImprssn_SprtingInfo ********************************************************************************/
		if(clinicalimpression.hasSupportingInfo()) {
			c.setClnclImprssnSprtingInfo(String.valueOf(clinicalimpression.getSupportingInfoFirstRep()));
		}
		return c;
	}
}
