package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductAuthorization;
public class MedicinalProductAuthorizationBidirectionalConversion 
{
	public MedicinalProductAuthorization MedicinalProductAuthorizations(org.hl7.fhir.r4.model.MedicinalProductAuthorization medicinalproductauthorization) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductAuthorization m = new  main.java.com.campfhir.model.MedicinalProductAuthorization();

		/******************** id ********************************************************************************/
		medicinalproductauthorization.setId(m.getId());

		/******************** MdcnlPrdctAthztn_DtOfFirstAthztn ********************************************************************************/
		if(medicinalproductauthorization.hasDateOfFirstAuthorization()) {
			m.setMdcnlPrdctAthztnDtOfFirstAthztn(String.valueOf(medicinalproductauthorization.getDateOfFirstAuthorization()));
		}
		/******************** MdcnlPrdctAthztn_InternationalBirthDt ********************************************************************************/
		if(medicinalproductauthorization.hasInternationalBirthDate()) {
			m.setMdcnlPrdctAthztnInternationalBirthDt(String.valueOf(medicinalproductauthorization.getInternationalBirthDate()));
		}
		/******************** medicinalproductauthorizationdataexclusivityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationdataexclusivityperiod = medicinalproductauthorization.getDataExclusivityPeriod();

		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationdataexclusivityperiod.hasStart()) {
			m.setMdcnlPrdctAthztnDataExclusivityPrdStrt(String.valueOf(medicinalproductauthorizationdataexclusivityperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationdataexclusivityperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnDataExclusivityPrdEnd(String.valueOf(medicinalproductauthorizationdataexclusivityperiod.getEnd()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorization ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent medicinalproductauthorizationjurisdictionalauthorization = medicinalproductauthorization.getJurisdictionalAuthorizationFirstRep();

		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationcountry = medicinalproductauthorizationjurisdictionalauthorization.getCountry();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountry.hasText()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountry.getText()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationcountrycoding = medicinalproductauthorizationjurisdictionalauthorizationcountry.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasVersion()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasCode()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getSystem()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod = medicinalproductauthorizationjurisdictionalauthorization.getValidityPeriod();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.hasStart()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.getEnd()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationjurisdictionalauthorizationidentifier = medicinalproductauthorizationjurisdictionalauthorization.getIdentifierFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasValue()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdVl(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getValue()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationidentifiertype = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getType();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.hasText()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.getText()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding = medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getSystem()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.hasStart()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasAssigner()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getAssigner()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnIdSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getSystem()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationjurisdictionalauthorizationidentifieruse = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getUse();
		m.setMdcnlPrdctAthztnJrsdctnalAthztnIdUse(medicinalproductauthorizationjurisdictionalauthorizationidentifieruse.toCode());

		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply = medicinalproductauthorizationjurisdictionalauthorization.getLegalStatusOfSupply();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.hasText()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.getText()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding = medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasVersion()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasCode()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getSystem()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationjurisdiction = medicinalproductauthorizationjurisdictionalauthorization.getJurisdictionFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.hasText()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.getText()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding = medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasVersion()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasCode()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getSystem()));
		}
		/******************** medicinalproductauthorizationcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationcountry = medicinalproductauthorization.getCountryFirstRep();

		/******************** MdcnlPrdctAthztn_Cntry_Txt ********************************************************************************/
		if(medicinalproductauthorizationcountry.hasText()) {
			m.setMdcnlPrdctAthztnCntryTxt(String.valueOf(medicinalproductauthorizationcountry.getText()));
		}
		/******************** medicinalproductauthorizationcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationcountrycoding = medicinalproductauthorizationcountry.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationcountrycoding.hasVersion()) {
			m.setMdcnlPrdctAthztnCntryCdgVrsn(String.valueOf(medicinalproductauthorizationcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnCntryCdgDsply(String.valueOf(medicinalproductauthorizationcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationcountrycoding.hasCode()) {
			m.setMdcnlPrdctAthztnCntryCdgCd(String.valueOf(medicinalproductauthorizationcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnCntryCdgUsrSltd(String.valueOf(medicinalproductauthorizationcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationcountrycoding.hasSystem()) {
			m.setMdcnlPrdctAthztnCntryCdgSys(String.valueOf(medicinalproductauthorizationcountrycoding.getSystem()));
		}
		/******************** medicinalproductauthorizationlegalbasis ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationlegalbasis = medicinalproductauthorization.getLegalBasis();

		/******************** MdcnlPrdctAthztn_LegalBasis_Txt ********************************************************************************/
		if(medicinalproductauthorizationlegalbasis.hasText()) {
			m.setMdcnlPrdctAthztnLegalBasisTxt(String.valueOf(medicinalproductauthorizationlegalbasis.getText()));
		}
		/******************** medicinalproductauthorizationlegalbasiscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationlegalbasiscoding = medicinalproductauthorizationlegalbasis.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscoding.hasVersion()) {
			m.setMdcnlPrdctAthztnLegalBasisCdgVrsn(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnLegalBasisCdgDsply(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscoding.hasCode()) {
			m.setMdcnlPrdctAthztnLegalBasisCdgCd(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnLegalBasisCdgUsrSltd(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscoding.hasSystem()) {
			m.setMdcnlPrdctAthztnLegalBasisCdgSys(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getSystem()));
		}
		/******************** MdcnlPrdctAthztn_RestoreDt ********************************************************************************/
		if(medicinalproductauthorization.hasRestoreDate()) {
			m.setMdcnlPrdctAthztnRestoreDt(String.valueOf(medicinalproductauthorization.getRestoreDate()));
		}
		/******************** MdcnlPrdctAthztn_Holder ********************************************************************************/
		if(medicinalproductauthorization.hasHolder()) {
			m.setMdcnlPrdctAthztnHolder(String.valueOf(medicinalproductauthorization.getHolder()));
		}
		/******************** MdcnlPrdctAthztn_Regulator ********************************************************************************/
		if(medicinalproductauthorization.hasRegulator()) {
			m.setMdcnlPrdctAthztnRegulator(String.valueOf(medicinalproductauthorization.getRegulator()));
		}
		/******************** MdcnlPrdctAthztn_Sbjct ********************************************************************************/
		if(medicinalproductauthorization.hasSubject()) {
			m.setMdcnlPrdctAthztnSbjct(String.valueOf(medicinalproductauthorization.getSubject()));
		}
		/******************** medicinalproductauthorizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationstatus = medicinalproductauthorization.getStatus();

		/******************** MdcnlPrdctAthztn_Sts_Txt ********************************************************************************/
		if(medicinalproductauthorizationstatus.hasText()) {
			m.setMdcnlPrdctAthztnStsTxt(String.valueOf(medicinalproductauthorizationstatus.getText()));
		}
		/******************** medicinalproductauthorizationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationstatuscoding = medicinalproductauthorizationstatus.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationstatuscoding.hasVersion()) {
			m.setMdcnlPrdctAthztnStsCdgVrsn(String.valueOf(medicinalproductauthorizationstatuscoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationstatuscoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnStsCdgDsply(String.valueOf(medicinalproductauthorizationstatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationstatuscoding.hasCode()) {
			m.setMdcnlPrdctAthztnStsCdgCd(String.valueOf(medicinalproductauthorizationstatuscoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationstatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnStsCdgUsrSltd(String.valueOf(medicinalproductauthorizationstatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationstatuscoding.hasSystem()) {
			m.setMdcnlPrdctAthztnStsCdgSys(String.valueOf(medicinalproductauthorizationstatuscoding.getSystem()));
		}
		/******************** medicinalproductauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationvalidityperiod = medicinalproductauthorization.getValidityPeriod();

		/******************** MdcnlPrdctAthztn_ValidityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationvalidityperiod.hasStart()) {
			m.setMdcnlPrdctAthztnValidityPrdStrt(String.valueOf(medicinalproductauthorizationvalidityperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_ValidityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationvalidityperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnValidityPrdEnd(String.valueOf(medicinalproductauthorizationvalidityperiod.getEnd()));
		}
		/******************** medicinalproductauthorizationprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent medicinalproductauthorizationprocedure = medicinalproductauthorization.getProcedure();

		/******************** medicinalproductauthorizationproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationproceduretype = medicinalproductauthorizationprocedure.getType();

		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationproceduretype.hasText()) {
			m.setMdcnlPrdctAthztnPrcdrTypTxt(String.valueOf(medicinalproductauthorizationproceduretype.getText()));
		}
		/******************** medicinalproductauthorizationproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationproceduretypecoding = medicinalproductauthorizationproceduretype.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecoding.hasVersion()) {
			m.setMdcnlPrdctAthztnPrcdrTypCdgVrsn(String.valueOf(medicinalproductauthorizationproceduretypecoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnPrcdrTypCdgDsply(String.valueOf(medicinalproductauthorizationproceduretypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecoding.hasCode()) {
			m.setMdcnlPrdctAthztnPrcdrTypCdgCd(String.valueOf(medicinalproductauthorizationproceduretypecoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnPrcdrTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationproceduretypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecoding.hasSystem()) {
			m.setMdcnlPrdctAthztnPrcdrTypCdgSys(String.valueOf(medicinalproductauthorizationproceduretypecoding.getSystem()));
		}
		/******************** medicinalproductauthorizationproceduredateperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationproceduredateperiod = medicinalproductauthorizationprocedure.getDatePeriod();

		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationproceduredateperiod.hasStart()) {
			m.setMdcnlPrdctAthztnPrcdrDtPrdStrt(String.valueOf(medicinalproductauthorizationproceduredateperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_End ********************************************************************************/
		if(medicinalproductauthorizationproceduredateperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnPrcdrDtPrdEnd(String.valueOf(medicinalproductauthorizationproceduredateperiod.getEnd()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtDtTimeTyp ********************************************************************************/
		if(medicinalproductauthorizationprocedure.hasDateDateTimeType()) {
			m.setMdcnlPrdctAthztnPrcdrDtDtTimeTyp(String.valueOf(medicinalproductauthorizationprocedure.getDateDateTimeType()));
		}
		/******************** medicinalproductauthorizationprocedureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationprocedureidentifier = medicinalproductauthorizationprocedure.getIdentifier();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasValue()) {
			m.setMdcnlPrdctAthztnPrcdrIdVl(String.valueOf(medicinalproductauthorizationprocedureidentifier.getValue()));
		}
		/******************** medicinalproductauthorizationprocedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationprocedureidentifiertype = medicinalproductauthorizationprocedureidentifier.getType();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertype.hasText()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypTxt(String.valueOf(medicinalproductauthorizationprocedureidentifiertype.getText()));
		}
		/******************** medicinalproductauthorizationprocedureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationprocedureidentifiertypecoding = medicinalproductauthorizationprocedureidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypCdgDsply(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypCdgCd(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctAthztnPrcdrIdTypCdgSys(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getSystem()));
		}
		/******************** medicinalproductauthorizationprocedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationprocedureidentifierperiod = medicinalproductauthorizationprocedureidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifierperiod.hasStart()) {
			m.setMdcnlPrdctAthztnPrcdrIdPrdStrt(String.valueOf(medicinalproductauthorizationprocedureidentifierperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnPrcdrIdPrdEnd(String.valueOf(medicinalproductauthorizationprocedureidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasAssigner()) {
			m.setMdcnlPrdctAthztnPrcdrIdAssigner(String.valueOf(medicinalproductauthorizationprocedureidentifier.getAssigner()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasSystem()) {
			m.setMdcnlPrdctAthztnPrcdrIdSys(String.valueOf(medicinalproductauthorizationprocedureidentifier.getSystem()));
		}
		/******************** medicinalproductauthorizationprocedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationprocedureidentifieruse = medicinalproductauthorizationprocedureidentifier.getUse();
		m.setMdcnlPrdctAthztnPrcdrIdUse(medicinalproductauthorizationprocedureidentifieruse.toCode());

		/******************** MdcnlPrdctAthztn_StsDt ********************************************************************************/
		if(medicinalproductauthorization.hasStatusDate()) {
			m.setMdcnlPrdctAthztnStsDt(String.valueOf(medicinalproductauthorization.getStatusDate()));
		}
		/******************** medicinalproductauthorizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationidentifier = medicinalproductauthorization.getIdentifierFirstRep();

		/******************** MdcnlPrdctAthztn_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationidentifier.hasValue()) {
			m.setMdcnlPrdctAthztnIdVl(String.valueOf(medicinalproductauthorizationidentifier.getValue()));
		}
		/******************** medicinalproductauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationidentifiertype = medicinalproductauthorizationidentifier.getType();

		/******************** MdcnlPrdctAthztn_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationidentifiertype.hasText()) {
			m.setMdcnlPrdctAthztnIdTypTxt(String.valueOf(medicinalproductauthorizationidentifiertype.getText()));
		}
		/******************** medicinalproductauthorizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationidentifiertypecoding = medicinalproductauthorizationidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctAthztnIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnIdTypCdgDsply(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctAthztnIdTypCdgCd(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctAthztnIdTypCdgSys(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getSystem()));
		}
		/******************** medicinalproductauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationidentifierperiod = medicinalproductauthorizationidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationidentifierperiod.hasStart()) {
			m.setMdcnlPrdctAthztnIdPrdStrt(String.valueOf(medicinalproductauthorizationidentifierperiod.getStart()));
		}
		/******************** MdcnlPrdctAthztn_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctAthztnIdPrdEnd(String.valueOf(medicinalproductauthorizationidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctAthztn_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationidentifier.hasAssigner()) {
			m.setMdcnlPrdctAthztnIdAssigner(String.valueOf(medicinalproductauthorizationidentifier.getAssigner()));
		}
		/******************** MdcnlPrdctAthztn_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationidentifier.hasSystem()) {
			m.setMdcnlPrdctAthztnIdSys(String.valueOf(medicinalproductauthorizationidentifier.getSystem()));
		}
		/******************** medicinalproductauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationidentifieruse = medicinalproductauthorizationidentifier.getUse();
		m.setMdcnlPrdctAthztnIdUse(medicinalproductauthorizationidentifieruse.toCode());

		/******************** medicinalproductauthorizationjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdiction = medicinalproductauthorization.getJurisdictionFirstRep();

		/******************** MdcnlPrdctAthztn_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdiction.hasText()) {
			m.setMdcnlPrdctAthztnJrsdctnTxt(String.valueOf(medicinalproductauthorizationjurisdiction.getText()));
		}
		/******************** medicinalproductauthorizationjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictioncoding = medicinalproductauthorizationjurisdiction.getCodingFirstRep();

		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncoding.hasVersion()) {
			m.setMdcnlPrdctAthztnJrsdctnCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getVersion()));
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncoding.hasDisplay()) {
			m.setMdcnlPrdctAthztnJrsdctnCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncoding.hasCode()) {
			m.setMdcnlPrdctAthztnJrsdctnCdgCd(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getCode()));
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncoding.hasUserSelected()) {
			m.setMdcnlPrdctAthztnJrsdctnCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncoding.hasSystem()) {
			m.setMdcnlPrdctAthztnJrsdctnCdgSys(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getSystem()));
		}
		return m;
	}
}
