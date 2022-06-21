package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Coverage;
public class CoverageBidirectionalConversion 
{
	public Coverage Coverages(org.hl7.fhir.r4.model.Coverage coverage) throws ParseException
	{
		 main.java.com.campfhir.model.Coverage c = new  main.java.com.campfhir.model.Coverage();

		/******************** id ********************************************************************************/
		coverage.setId(c.getId());

		/******************** coveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragetype = coverage.getType();

		/******************** coveragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragetypecoding = coveragetype.getCodingFirstRep();

		/******************** Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragetypecoding.hasDisplay()) {
			c.setCvgTypCdgDsply(String.valueOf(coveragetypecoding.getDisplay()));
		}
		/******************** Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragetypecoding.hasVersion()) {
			c.setCvgTypCdgVrsn(String.valueOf(coveragetypecoding.getVersion()));
		}
		/******************** Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(coveragetypecoding.hasCode()) {
			c.setCvgTypCdgCd(String.valueOf(coveragetypecoding.getCode()));
		}
		/******************** Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(coveragetypecoding.hasSystem()) {
			c.setCvgTypCdgSys(String.valueOf(coveragetypecoding.getSystem()));
		}
		/******************** Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragetypecoding.hasUserSelected()) {
			c.setCvgTypCdgUsrSltd(String.valueOf(coveragetypecoding.getUserSelected()));
		}
		/******************** Cvg_Typ_Txt ********************************************************************************/
		if(coveragetype.hasText()) {
			c.setCvgTypTxt(String.valueOf(coveragetype.getText()));
		}
		/******************** coveragestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.CoverageStatus coveragestatus = coverage.getStatus();
		c.setCvgSts(coveragestatus.toCode());

		/******************** coverageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageperiod = coverage.getPeriod();

		/******************** Cvg_Prd_End ********************************************************************************/
		if(coverageperiod.hasEnd()) {
			c.setCvgPrdEnd(String.valueOf(coverageperiod.getEnd()));
		}
		/******************** Cvg_Prd_Strt ********************************************************************************/
		if(coverageperiod.hasStart()) {
			c.setCvgPrdStrt(String.valueOf(coverageperiod.getStart()));
		}
		/******************** coverageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageidentifier = coverage.getIdentifierFirstRep();

		/******************** Cvg_Id_Vl ********************************************************************************/
		if(coverageidentifier.hasValue()) {
			c.setCvgIdVl(String.valueOf(coverageidentifier.getValue()));
		}
		/******************** coverageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageidentifiertype = coverageidentifier.getType();

		/******************** coverageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageidentifiertypecoding = coverageidentifiertype.getCodingFirstRep();

		/******************** Cvg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageidentifiertypecoding.hasDisplay()) {
			c.setCvgIdTypCdgDsply(String.valueOf(coverageidentifiertypecoding.getDisplay()));
		}
		/******************** Cvg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageidentifiertypecoding.hasVersion()) {
			c.setCvgIdTypCdgVrsn(String.valueOf(coverageidentifiertypecoding.getVersion()));
		}
		/******************** Cvg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageidentifiertypecoding.hasCode()) {
			c.setCvgIdTypCdgCd(String.valueOf(coverageidentifiertypecoding.getCode()));
		}
		/******************** Cvg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageidentifiertypecoding.hasSystem()) {
			c.setCvgIdTypCdgSys(String.valueOf(coverageidentifiertypecoding.getSystem()));
		}
		/******************** Cvg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageidentifiertypecoding.hasUserSelected()) {
			c.setCvgIdTypCdgUsrSltd(String.valueOf(coverageidentifiertypecoding.getUserSelected()));
		}
		/******************** Cvg_Id_Typ_Txt ********************************************************************************/
		if(coverageidentifiertype.hasText()) {
			c.setCvgIdTypTxt(String.valueOf(coverageidentifiertype.getText()));
		}
		/******************** Cvg_Id_Sys ********************************************************************************/
		if(coverageidentifier.hasSystem()) {
			c.setCvgIdSys(String.valueOf(coverageidentifier.getSystem()));
		}
		/******************** Cvg_Id_Assigner ********************************************************************************/
		if(coverageidentifier.hasAssigner()) {
			c.setCvgIdAssigner(String.valueOf(coverageidentifier.getAssigner()));
		}
		/******************** coverageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageidentifierperiod = coverageidentifier.getPeriod();

		/******************** Cvg_Id_Prd_End ********************************************************************************/
		if(coverageidentifierperiod.hasEnd()) {
			c.setCvgIdPrdEnd(String.valueOf(coverageidentifierperiod.getEnd()));
		}
		/******************** Cvg_Id_Prd_Strt ********************************************************************************/
		if(coverageidentifierperiod.hasStart()) {
			c.setCvgIdPrdStrt(String.valueOf(coverageidentifierperiod.getStart()));
		}
		/******************** coverageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageidentifieruse = coverageidentifier.getUse();
		c.setCvgIdUse(coverageidentifieruse.toCode());

		/******************** Cvg_Subscriber ********************************************************************************/
		if(coverage.hasSubscriber()) {
			c.setCvgSubscriber(String.valueOf(coverage.getSubscriber()));
		}
		/******************** Cvg_SubscriberId ********************************************************************************/
		if(coverage.hasSubscriberId()) {
			c.setCvgSubscriberId(String.valueOf(coverage.getSubscriberId()));
		}
		/******************** Cvg_PolicyHolder ********************************************************************************/
		if(coverage.hasPolicyHolder()) {
			c.setCvgPolicyHolder(String.valueOf(coverage.getPolicyHolder()));
		}
		/******************** coveragerelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragerelationship = coverage.getRelationship();

		/******************** coveragerelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragerelationshipcoding = coveragerelationship.getCodingFirstRep();

		/******************** Cvg_Rltnship_Cdg_Dsply ********************************************************************************/
		if(coveragerelationshipcoding.hasDisplay()) {
			c.setCvgRltnshipCdgDsply(String.valueOf(coveragerelationshipcoding.getDisplay()));
		}
		/******************** Cvg_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(coveragerelationshipcoding.hasVersion()) {
			c.setCvgRltnshipCdgVrsn(String.valueOf(coveragerelationshipcoding.getVersion()));
		}
		/******************** Cvg_Rltnship_Cdg_Cd ********************************************************************************/
		if(coveragerelationshipcoding.hasCode()) {
			c.setCvgRltnshipCdgCd(String.valueOf(coveragerelationshipcoding.getCode()));
		}
		/******************** Cvg_Rltnship_Cdg_Sys ********************************************************************************/
		if(coveragerelationshipcoding.hasSystem()) {
			c.setCvgRltnshipCdgSys(String.valueOf(coveragerelationshipcoding.getSystem()));
		}
		/******************** Cvg_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(coveragerelationshipcoding.hasUserSelected()) {
			c.setCvgRltnshipCdgUsrSltd(String.valueOf(coveragerelationshipcoding.getUserSelected()));
		}
		/******************** Cvg_Rltnship_Txt ********************************************************************************/
		if(coveragerelationship.hasText()) {
			c.setCvgRltnshipTxt(String.valueOf(coveragerelationship.getText()));
		}
		/******************** Cvg_Payor ********************************************************************************/
		if(coverage.hasPayor()) {
			c.setCvgPayor(String.valueOf(coverage.getPayorFirstRep()));
		}
		/******************** Cvg_Beneficiary ********************************************************************************/
		if(coverage.hasBeneficiary()) {
			c.setCvgBeneficiary(String.valueOf(coverage.getBeneficiary()));
		}
		/******************** coverageclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.ClassComponent coverageclass = coverage.getClass_FirstRep();

		/******************** Cvg_Cls__Nm ********************************************************************************/
		if(coverageclass.hasName()) {
			c.setCvgClsNm(String.valueOf(coverageclass.getName()));
		}
		/******************** Cvg_Cls__Vl ********************************************************************************/
		if(coverageclass.hasValue()) {
			c.setCvgClsVl(String.valueOf(coverageclass.getValue()));
		}
		/******************** coverageclasstype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageclasstype = coverageclass.getType();

		/******************** coverageclasstypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageclasstypecoding = coverageclasstype.getCodingFirstRep();

		/******************** Cvg_Cls__Typ_Cdg_Dsply ********************************************************************************/
		if(coverageclasstypecoding.hasDisplay()) {
			c.setCvgClsTypCdgDsply(String.valueOf(coverageclasstypecoding.getDisplay()));
		}
		/******************** Cvg_Cls__Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageclasstypecoding.hasVersion()) {
			c.setCvgClsTypCdgVrsn(String.valueOf(coverageclasstypecoding.getVersion()));
		}
		/******************** Cvg_Cls__Typ_Cdg_Cd ********************************************************************************/
		if(coverageclasstypecoding.hasCode()) {
			c.setCvgClsTypCdgCd(String.valueOf(coverageclasstypecoding.getCode()));
		}
		/******************** Cvg_Cls__Typ_Cdg_Sys ********************************************************************************/
		if(coverageclasstypecoding.hasSystem()) {
			c.setCvgClsTypCdgSys(String.valueOf(coverageclasstypecoding.getSystem()));
		}
		/******************** Cvg_Cls__Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageclasstypecoding.hasUserSelected()) {
			c.setCvgClsTypCdgUsrSltd(String.valueOf(coverageclasstypecoding.getUserSelected()));
		}
		/******************** Cvg_Cls__Typ_Txt ********************************************************************************/
		if(coverageclasstype.hasText()) {
			c.setCvgClsTypTxt(String.valueOf(coverageclasstype.getText()));
		}
		/******************** Cvg_Dependent ********************************************************************************/
		if(coverage.hasDependent()) {
			c.setCvgDependent(String.valueOf(coverage.getDependent()));
		}
		/******************** Cvg_Ordr ********************************************************************************/
		if(coverage.hasOrder()) {
			c.setCvgOrdr(String.valueOf(coverage.getOrder()));
		}
		/******************** Cvg_Subrogation ********************************************************************************/
		if(coverage.hasSubrogation()) {
			c.setCvgSubrogation(String.valueOf(coverage.getSubrogation()));
		}
		/******************** Cvg_Network ********************************************************************************/
		if(coverage.hasNetwork()) {
			c.setCvgNetwork(String.valueOf(coverage.getNetwork()));
		}
		/******************** Cvg_Cnct ********************************************************************************/
		if(coverage.hasContract()) {
			c.setCvgCnct(String.valueOf(coverage.getContractFirstRep()));
		}
		/******************** coveragecosttobeneficiary ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent coveragecosttobeneficiary = coverage.getCostToBeneficiaryFirstRep();

		/******************** coveragecosttobeneficiarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiarytype = coveragecosttobeneficiary.getType();

		/******************** coveragecosttobeneficiarytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragecosttobeneficiarytypecoding = coveragecosttobeneficiarytype.getCodingFirstRep();

		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragecosttobeneficiarytypecoding.hasDisplay()) {
			c.setCvgCstToBeneficiaryTypCdgDsply(String.valueOf(coveragecosttobeneficiarytypecoding.getDisplay()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragecosttobeneficiarytypecoding.hasVersion()) {
			c.setCvgCstToBeneficiaryTypCdgVrsn(String.valueOf(coveragecosttobeneficiarytypecoding.getVersion()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Cd ********************************************************************************/
		if(coveragecosttobeneficiarytypecoding.hasCode()) {
			c.setCvgCstToBeneficiaryTypCdgCd(String.valueOf(coveragecosttobeneficiarytypecoding.getCode()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Sys ********************************************************************************/
		if(coveragecosttobeneficiarytypecoding.hasSystem()) {
			c.setCvgCstToBeneficiaryTypCdgSys(String.valueOf(coveragecosttobeneficiarytypecoding.getSystem()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragecosttobeneficiarytypecoding.hasUserSelected()) {
			c.setCvgCstToBeneficiaryTypCdgUsrSltd(String.valueOf(coveragecosttobeneficiarytypecoding.getUserSelected()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Txt ********************************************************************************/
		if(coveragecosttobeneficiarytype.hasText()) {
			c.setCvgCstToBeneficiaryTypTxt(String.valueOf(coveragecosttobeneficiarytype.getText()));
		}
		/******************** coveragecosttobeneficiaryexception ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.ExemptionComponent coveragecosttobeneficiaryexception = coveragecosttobeneficiary.getExceptionFirstRep();

		/******************** coveragecosttobeneficiaryexceptiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiaryexceptiontype = coveragecosttobeneficiaryexception.getType();

		/******************** coveragecosttobeneficiaryexceptiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragecosttobeneficiaryexceptiontypecoding = coveragecosttobeneficiaryexceptiontype.getCodingFirstRep();

		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecoding.hasDisplay()) {
			c.setCvgCstToBeneficiaryExceptionTypCdgDsply(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getDisplay()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecoding.hasVersion()) {
			c.setCvgCstToBeneficiaryExceptionTypCdgVrsn(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getVersion()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Cd ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecoding.hasCode()) {
			c.setCvgCstToBeneficiaryExceptionTypCdgCd(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getCode()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Sys ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecoding.hasSystem()) {
			c.setCvgCstToBeneficiaryExceptionTypCdgSys(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getSystem()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecoding.hasUserSelected()) {
			c.setCvgCstToBeneficiaryExceptionTypCdgUsrSltd(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getUserSelected()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Txt ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontype.hasText()) {
			c.setCvgCstToBeneficiaryExceptionTypTxt(String.valueOf(coveragecosttobeneficiaryexceptiontype.getText()));
		}
		/******************** coveragecosttobeneficiaryexceptionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coveragecosttobeneficiaryexceptionperiod = coveragecosttobeneficiaryexception.getPeriod();

		/******************** Cvg_CstToBeneficiary_Exception_Prd_End ********************************************************************************/
		if(coveragecosttobeneficiaryexceptionperiod.hasEnd()) {
			c.setCvgCstToBeneficiaryExceptionPrdEnd(String.valueOf(coveragecosttobeneficiaryexceptionperiod.getEnd()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Prd_Strt ********************************************************************************/
		if(coveragecosttobeneficiaryexceptionperiod.hasStart()) {
			c.setCvgCstToBeneficiaryExceptionPrdStrt(String.valueOf(coveragecosttobeneficiaryexceptionperiod.getStart()));
		}
		/******************** coveragecosttobeneficiaryvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coveragecosttobeneficiaryvaluequantity = coveragecosttobeneficiary.getValueQuantity();

		/******************** Cvg_CstToBeneficiary_VlQnty_Vl ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasValue()) {
			c.setCvgCstToBeneficiaryVlQntyVl(String.valueOf(coveragecosttobeneficiaryvaluequantity.getValue()));
		}
		/******************** coveragecosttobeneficiaryvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator coveragecosttobeneficiaryvaluequantitycomparator = coveragecosttobeneficiaryvaluequantity.getComparator();
		c.setCvgCstToBeneficiaryVlQntyCmprtr(coveragecosttobeneficiaryvaluequantitycomparator.toCode());

		/******************** Cvg_CstToBeneficiary_VlQnty_Cd ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasCode()) {
			c.setCvgCstToBeneficiaryVlQntyCd(String.valueOf(coveragecosttobeneficiaryvaluequantity.getCode()));
		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Sys ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasSystem()) {
			c.setCvgCstToBeneficiaryVlQntySys(String.valueOf(coveragecosttobeneficiaryvaluequantity.getSystem()));
		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Unt ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasUnit()) {
			c.setCvgCstToBeneficiaryVlQntyUnt(String.valueOf(coveragecosttobeneficiaryvaluequantity.getUnit()));
		}
		/******************** coveragecosttobeneficiaryvaluemoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coveragecosttobeneficiaryvaluemoney = coveragecosttobeneficiary.getValueMoney();

		/******************** Cvg_CstToBeneficiary_VlMoney_Vl ********************************************************************************/
		if(coveragecosttobeneficiaryvaluemoney.hasValue()) {
			c.setCvgCstToBeneficiaryVlMoneyVl(String.valueOf(coveragecosttobeneficiaryvaluemoney.getValue()));
		}
		/******************** Cvg_CstToBeneficiary_VlMoney_Crncy ********************************************************************************/
		if(coveragecosttobeneficiaryvaluemoney.hasCurrency()) {
			c.setCvgCstToBeneficiaryVlMoneyCrncy(String.valueOf(coveragecosttobeneficiaryvaluemoney.getCurrency()));
		}
		return c;
	}
}
