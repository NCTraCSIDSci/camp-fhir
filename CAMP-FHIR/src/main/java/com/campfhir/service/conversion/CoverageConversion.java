package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Coverage;
public class CoverageConversion 
{
	public org.hl7.fhir.r4.model.Coverage Coverages(Coverage c) throws ParseException
	{
		org.hl7.fhir.r4.model.Coverage coverage = new org.hl7.fhir.r4.model.Coverage();

		/******************** id ********************************************************************************/
		coverage.setId(c.getId());

		/******************** Cvg_Beneficiary ********************************************************************************/
		if(c.getCvgBeneficiary() != null) {
			coverage.setBeneficiary( new org.hl7.fhir.r4.model.Reference(c.getCvgBeneficiary()));
		}
		/******************** coverageclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.ClassComponent coverageclass =  new org.hl7.fhir.r4.model.Coverage.ClassComponent();
		coverage.addClass_(coverageclass);

		/******************** Cvg_Cls__Nm ********************************************************************************/
		if(c.getCvgClsNm() != null) {
			coverageclass.setName(c.getCvgClsNm());
		}
		/******************** coverageclasstype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageclasstype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageclass.setType(coverageclasstype);

		/******************** coverageclasstypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageclasstypecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageclasstype.addCoding(coverageclasstypecoding);

		/******************** Cvg_Cls__Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgClsTypCdgCd() != null) {
			coverageclasstypecoding.setCode(c.getCvgClsTypCdgCd());
		}
		/******************** Cvg_Cls__Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgClsTypCdgDsply() != null) {
			coverageclasstypecoding.setDisplay(c.getCvgClsTypCdgDsply());
		}
		/******************** Cvg_Cls__Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgClsTypCdgSys() != null) {
			coverageclasstypecoding.setSystem(c.getCvgClsTypCdgSys());
		}
		/******************** Cvg_Cls__Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgClsTypCdgUsrSltd() != null) {
			coverageclasstypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgClsTypCdgUsrSltd()));
		}
		/******************** Cvg_Cls__Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgClsTypCdgVrsn() != null) {
			coverageclasstypecoding.setVersion(c.getCvgClsTypCdgVrsn());
		}
		/******************** Cvg_Cls__Typ_Txt ********************************************************************************/
		if(c.getCvgClsTypTxt() != null) {
			coverageclasstype.setText(c.getCvgClsTypTxt());
		}
		/******************** Cvg_Cls__Vl ********************************************************************************/
		if(c.getCvgClsVl() != null) {
			coverageclass.setValue(c.getCvgClsVl());
		}
		/******************** Cvg_Cnct ********************************************************************************/
		if(c.getCvgCnct() != null) {
			coverage.addContract( new org.hl7.fhir.r4.model.Reference(c.getCvgCnct()));
		}
		/******************** coveragecosttobeneficiary ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent coveragecosttobeneficiary =  new org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent();
		coverage.addCostToBeneficiary(coveragecosttobeneficiary);

		/******************** coveragecosttobeneficiaryexception ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.ExemptionComponent coveragecosttobeneficiaryexception =  new org.hl7.fhir.r4.model.Coverage.ExemptionComponent();
		coveragecosttobeneficiary.addException(coveragecosttobeneficiaryexception);

		/******************** coveragecosttobeneficiaryexceptionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coveragecosttobeneficiaryexceptionperiod =  new org.hl7.fhir.r4.model.Period();
		coveragecosttobeneficiaryexception.setPeriod(coveragecosttobeneficiaryexceptionperiod);

		/******************** Cvg_CstToBeneficiary_Exception_Prd_End ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionPrdEnd() != null) {
			java.text.SimpleDateFormat Cvg_CstToBeneficiary_Exception_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_CstToBeneficiary_Exception_Prd_Enddate = Cvg_CstToBeneficiary_Exception_Prd_Endsdf.parse(c.getCvgCstToBeneficiaryExceptionPrdEnd());
			coveragecosttobeneficiaryexceptionperiod.setEnd(Cvg_CstToBeneficiary_Exception_Prd_Enddate);
		}
		/******************** Cvg_CstToBeneficiary_Exception_Prd_Strt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionPrdStrt() != null) {
			java.text.SimpleDateFormat Cvg_CstToBeneficiary_Exception_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_CstToBeneficiary_Exception_Prd_Strtdate = Cvg_CstToBeneficiary_Exception_Prd_Strtsdf.parse(c.getCvgCstToBeneficiaryExceptionPrdStrt());
			coveragecosttobeneficiaryexceptionperiod.setStart(Cvg_CstToBeneficiary_Exception_Prd_Strtdate);
		}
		/******************** coveragecosttobeneficiaryexceptiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiaryexceptiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coveragecosttobeneficiaryexception.setType(coveragecosttobeneficiaryexceptiontype);

		/******************** coveragecosttobeneficiaryexceptiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragecosttobeneficiaryexceptiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		coveragecosttobeneficiaryexceptiontype.addCoding(coveragecosttobeneficiaryexceptiontypecoding);

		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgCd() != null) {
			coveragecosttobeneficiaryexceptiontypecoding.setCode(c.getCvgCstToBeneficiaryExceptionTypCdgCd());
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgDsply() != null) {
			coveragecosttobeneficiaryexceptiontypecoding.setDisplay(c.getCvgCstToBeneficiaryExceptionTypCdgDsply());
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgSys() != null) {
			coveragecosttobeneficiaryexceptiontypecoding.setSystem(c.getCvgCstToBeneficiaryExceptionTypCdgSys());
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd() != null) {
			coveragecosttobeneficiaryexceptiontypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd()));
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgVrsn() != null) {
			coveragecosttobeneficiaryexceptiontypecoding.setVersion(c.getCvgCstToBeneficiaryExceptionTypCdgVrsn());
		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Txt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypTxt() != null) {
			coveragecosttobeneficiaryexceptiontype.setText(c.getCvgCstToBeneficiaryExceptionTypTxt());
		}
		/******************** coveragecosttobeneficiarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiarytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coveragecosttobeneficiary.setType(coveragecosttobeneficiarytype);

		/******************** coveragecosttobeneficiarytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragecosttobeneficiarytypecoding =  new org.hl7.fhir.r4.model.Coding();
		coveragecosttobeneficiarytype.addCoding(coveragecosttobeneficiarytypecoding);

		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgCd() != null) {
			coveragecosttobeneficiarytypecoding.setCode(c.getCvgCstToBeneficiaryTypCdgCd());
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgDsply() != null) {
			coveragecosttobeneficiarytypecoding.setDisplay(c.getCvgCstToBeneficiaryTypCdgDsply());
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgSys() != null) {
			coveragecosttobeneficiarytypecoding.setSystem(c.getCvgCstToBeneficiaryTypCdgSys());
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgUsrSltd() != null) {
			coveragecosttobeneficiarytypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgCstToBeneficiaryTypCdgUsrSltd()));
		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgVrsn() != null) {
			coveragecosttobeneficiarytypecoding.setVersion(c.getCvgCstToBeneficiaryTypCdgVrsn());
		}
		/******************** Cvg_CstToBeneficiary_Typ_Txt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypTxt() != null) {
			coveragecosttobeneficiarytype.setText(c.getCvgCstToBeneficiaryTypTxt());
		}
		/******************** coveragecosttobeneficiaryvaluemoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coveragecosttobeneficiaryvaluemoney =  new org.hl7.fhir.r4.model.Money();
		coveragecosttobeneficiary.setValue(coveragecosttobeneficiaryvaluemoney);

		/******************** Cvg_CstToBeneficiary_VlMoney_Crncy ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlMoneyCrncy() != null) {
			coveragecosttobeneficiaryvaluemoney.setCurrency(c.getCvgCstToBeneficiaryVlMoneyCrncy());
		}
		/******************** Cvg_CstToBeneficiary_VlMoney_Vl ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlMoneyVl() != null) {
			coveragecosttobeneficiaryvaluemoney.setValue(Double.parseDouble((c.getCvgCstToBeneficiaryVlMoneyVl())));
		}
		/******************** coveragecosttobeneficiaryvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coveragecosttobeneficiaryvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		coveragecosttobeneficiary.setValue(coveragecosttobeneficiaryvaluequantity);

		/******************** Cvg_CstToBeneficiary_VlQnty_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyCd() != null) {
			coveragecosttobeneficiaryvaluequantity.setCode(c.getCvgCstToBeneficiaryVlQntyCd());
		}
		/******************** coveragecosttobeneficiaryvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory coveragecosttobeneficiaryvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		coveragecosttobeneficiaryvaluequantity.setComparator(coveragecosttobeneficiaryvaluequantitycomparator.fromCode(c.getCvgCstToBeneficiaryVlQntyCmprtr()));

		/******************** Cvg_CstToBeneficiary_VlQnty_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntySys() != null) {
			coveragecosttobeneficiaryvaluequantity.setSystem(c.getCvgCstToBeneficiaryVlQntySys());
		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Unt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyUnt() != null) {
			coveragecosttobeneficiaryvaluequantity.setUnit(c.getCvgCstToBeneficiaryVlQntyUnt());
		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Vl ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyVl() != null) {
			coveragecosttobeneficiaryvaluequantity.setValue(Double.parseDouble((c.getCvgCstToBeneficiaryVlQntyVl())));
		}
		/******************** Cvg_Dependent ********************************************************************************/
		if(c.getCvgDependent() != null) {
			coverage.setDependent(c.getCvgDependent());
		}
		/******************** coverageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageidentifier =  new org.hl7.fhir.r4.model.Identifier();
		coverage.addIdentifier(coverageidentifier);

		/******************** Cvg_Id_Assigner ********************************************************************************/
		if(c.getCvgIdAssigner() != null) {
			coverageidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCvgIdAssigner()));
		}
		/******************** coverageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		coverageidentifier.setPeriod(coverageidentifierperiod);

		/******************** Cvg_Id_Prd_End ********************************************************************************/
		if(c.getCvgIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cvg_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_Id_Prd_Enddate = Cvg_Id_Prd_Endsdf.parse(c.getCvgIdPrdEnd());
			coverageidentifierperiod.setEnd(Cvg_Id_Prd_Enddate);
		}
		/******************** Cvg_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cvg_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_Id_Prd_Strtdate = Cvg_Id_Prd_Strtsdf.parse(c.getCvgIdPrdStrt());
			coverageidentifierperiod.setStart(Cvg_Id_Prd_Strtdate);
		}
		/******************** Cvg_Id_Sys ********************************************************************************/
		if(c.getCvgIdSys() != null) {
			coverageidentifier.setSystem(c.getCvgIdSys());
		}
		/******************** coverageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageidentifier.setType(coverageidentifiertype);

		/******************** coverageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageidentifiertype.addCoding(coverageidentifiertypecoding);

		/******************** Cvg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgIdTypCdgCd() != null) {
			coverageidentifiertypecoding.setCode(c.getCvgIdTypCdgCd());
		}
		/******************** Cvg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgIdTypCdgDsply() != null) {
			coverageidentifiertypecoding.setDisplay(c.getCvgIdTypCdgDsply());
		}
		/******************** Cvg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgIdTypCdgSys() != null) {
			coverageidentifiertypecoding.setSystem(c.getCvgIdTypCdgSys());
		}
		/******************** Cvg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgIdTypCdgUsrSltd() != null) {
			coverageidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgIdTypCdgUsrSltd()));
		}
		/******************** Cvg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgIdTypCdgVrsn() != null) {
			coverageidentifiertypecoding.setVersion(c.getCvgIdTypCdgVrsn());
		}
		/******************** Cvg_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgIdTypTxt() != null) {
			coverageidentifiertype.setText(c.getCvgIdTypTxt());
		}
		/******************** coverageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory coverageidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		coverageidentifier.setUse(coverageidentifieruse.fromCode(c.getCvgIdUse()));

		/******************** Cvg_Id_Vl ********************************************************************************/
		if(c.getCvgIdVl() != null) {
			coverageidentifier.setValue(c.getCvgIdVl());
		}
		/******************** Cvg_Network ********************************************************************************/
		if(c.getCvgNetwork() != null) {
			coverage.setNetwork(c.getCvgNetwork());
		}
		/******************** Cvg_Ordr ********************************************************************************/
		if(c.getCvgOrdr() != null) {
			coverage.setOrder(Integer.parseInt(c.getCvgOrdr()));
		}
		/******************** Cvg_Payor ********************************************************************************/
		if(c.getCvgPayor() != null) {
			coverage.addPayor( new org.hl7.fhir.r4.model.Reference(c.getCvgPayor()));
		}
		/******************** coverageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageperiod =  new org.hl7.fhir.r4.model.Period();
		coverage.setPeriod(coverageperiod);

		/******************** Cvg_Prd_End ********************************************************************************/
		if(c.getCvgPrdEnd() != null) {
			java.text.SimpleDateFormat Cvg_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_Prd_Enddate = Cvg_Prd_Endsdf.parse(c.getCvgPrdEnd());
			coverageperiod.setEnd(Cvg_Prd_Enddate);
		}
		/******************** Cvg_Prd_Strt ********************************************************************************/
		if(c.getCvgPrdStrt() != null) {
			java.text.SimpleDateFormat Cvg_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cvg_Prd_Strtdate = Cvg_Prd_Strtsdf.parse(c.getCvgPrdStrt());
			coverageperiod.setStart(Cvg_Prd_Strtdate);
		}
		/******************** Cvg_PolicyHolder ********************************************************************************/
		if(c.getCvgPolicyHolder() != null) {
			coverage.setPolicyHolder( new org.hl7.fhir.r4.model.Reference(c.getCvgPolicyHolder()));
		}
		/******************** coveragerelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragerelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverage.setRelationship(coveragerelationship);

		/******************** coveragerelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragerelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		coveragerelationship.addCoding(coveragerelationshipcoding);

		/******************** Cvg_Rltnship_Cdg_Cd ********************************************************************************/
		if(c.getCvgRltnshipCdgCd() != null) {
			coveragerelationshipcoding.setCode(c.getCvgRltnshipCdgCd());
		}
		/******************** Cvg_Rltnship_Cdg_Dsply ********************************************************************************/
		if(c.getCvgRltnshipCdgDsply() != null) {
			coveragerelationshipcoding.setDisplay(c.getCvgRltnshipCdgDsply());
		}
		/******************** Cvg_Rltnship_Cdg_Sys ********************************************************************************/
		if(c.getCvgRltnshipCdgSys() != null) {
			coveragerelationshipcoding.setSystem(c.getCvgRltnshipCdgSys());
		}
		/******************** Cvg_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgRltnshipCdgUsrSltd() != null) {
			coveragerelationshipcoding.setUserSelected(Boolean.parseBoolean(c.getCvgRltnshipCdgUsrSltd()));
		}
		/******************** Cvg_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgRltnshipCdgVrsn() != null) {
			coveragerelationshipcoding.setVersion(c.getCvgRltnshipCdgVrsn());
		}
		/******************** Cvg_Rltnship_Txt ********************************************************************************/
		if(c.getCvgRltnshipTxt() != null) {
			coveragerelationship.setText(c.getCvgRltnshipTxt());
		}
		/******************** coveragestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.CoverageStatusEnumFactory coveragestatus =  new org.hl7.fhir.r4.model.Coverage.CoverageStatusEnumFactory();
		coverage.setStatus(coveragestatus.fromCode(c.getCvgSts()));

		/******************** Cvg_Subrogation ********************************************************************************/
		if(c.getCvgSubrogation() != null) {
			coverage.setSubrogation(Boolean.parseBoolean(c.getCvgSubrogation()));
		}
		/******************** Cvg_Subscriber ********************************************************************************/
		if(c.getCvgSubscriber() != null) {
			coverage.setSubscriber( new org.hl7.fhir.r4.model.Reference(c.getCvgSubscriber()));
		}
		/******************** Cvg_SubscriberId ********************************************************************************/
		if(c.getCvgSubscriberId() != null) {
			coverage.setSubscriberId(c.getCvgSubscriberId());
		}
		/******************** coveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverage.setType(coveragetype);

		/******************** coveragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coveragetypecoding =  new org.hl7.fhir.r4.model.Coding();
		coveragetype.addCoding(coveragetypecoding);

		/******************** Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgTypCdgCd() != null) {
			coveragetypecoding.setCode(c.getCvgTypCdgCd());
		}
		/******************** Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgTypCdgDsply() != null) {
			coveragetypecoding.setDisplay(c.getCvgTypCdgDsply());
		}
		/******************** Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgTypCdgSys() != null) {
			coveragetypecoding.setSystem(c.getCvgTypCdgSys());
		}
		/******************** Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgTypCdgUsrSltd() != null) {
			coveragetypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgTypCdgUsrSltd()));
		}
		/******************** Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgTypCdgVrsn() != null) {
			coveragetypecoding.setVersion(c.getCvgTypCdgVrsn());
		}
		/******************** Cvg_Typ_Txt ********************************************************************************/
		if(c.getCvgTypTxt() != null) {
			coveragetype.setText(c.getCvgTypTxt());
		}
		return coverage;
	}
}
