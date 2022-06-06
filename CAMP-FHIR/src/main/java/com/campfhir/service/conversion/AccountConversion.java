package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Account;
public class AccountConversion 
{
	public org.hl7.fhir.r4.model.Account Accounts(Account a) throws ParseException
	{
		org.hl7.fhir.r4.model.Account account = new org.hl7.fhir.r4.model.Account();

		/******************** id ********************************************************************************/
		account.setId(a.getId());

		/******************** accountcoverage ********************************************************************************/
		org.hl7.fhir.r4.model.Account.CoverageComponent accountcoverage =  new org.hl7.fhir.r4.model.Account.CoverageComponent();
		account.addCoverage(accountcoverage);

		/******************** Account_Cvg_Cvg ********************************************************************************/
		if(a.getAccountCvgCvg() != null) {
			accountcoverage.setCoverage( new org.hl7.fhir.r4.model.Reference(a.getAccountCvgCvg()));
		}
		/******************** Account_Cvg_Priority ********************************************************************************/
		if(a.getAccountCvgPriority() != null) {
			accountcoverage.setPriority(Integer.parseInt(a.getAccountCvgPriority()));
		}
		/******************** Account_Dscrptn ********************************************************************************/
		if(a.getAccountDscrptn() != null) {
			account.setDescription(a.getAccountDscrptn());
		}
		/******************** accountguarantor ********************************************************************************/
		org.hl7.fhir.r4.model.Account.GuarantorComponent accountguarantor =  new org.hl7.fhir.r4.model.Account.GuarantorComponent();
		account.addGuarantor(accountguarantor);

		/******************** Account_Guarantor_OnHold ********************************************************************************/
		if(a.getAccountGuarantorOnHold() != null) {
			accountguarantor.setOnHold(Boolean.parseBoolean(a.getAccountGuarantorOnHold()));
		}
		/******************** Account_Guarantor_Party ********************************************************************************/
		if(a.getAccountGuarantorParty() != null) {
			accountguarantor.setParty( new org.hl7.fhir.r4.model.Reference(a.getAccountGuarantorParty()));
		}
		/******************** accountguarantorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountguarantorperiod =  new org.hl7.fhir.r4.model.Period();
		accountguarantor.setPeriod(accountguarantorperiod);

		/******************** Account_Guarantor_Prd_End ********************************************************************************/
		if(a.getAccountGuarantorPrdEnd() != null) {
			java.text.SimpleDateFormat Account_Guarantor_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_Guarantor_Prd_Enddate = Account_Guarantor_Prd_Endsdf.parse(a.getAccountGuarantorPrdEnd());
			accountguarantorperiod.setEnd(Account_Guarantor_Prd_Enddate);
		}
		/******************** Account_Guarantor_Prd_Strt ********************************************************************************/
		if(a.getAccountGuarantorPrdStrt() != null) {
			java.text.SimpleDateFormat Account_Guarantor_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_Guarantor_Prd_Strtdate = Account_Guarantor_Prd_Strtsdf.parse(a.getAccountGuarantorPrdStrt());
			accountguarantorperiod.setStart(Account_Guarantor_Prd_Strtdate);
		}
		/******************** accountidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier accountidentifier =  new org.hl7.fhir.r4.model.Identifier();
		account.addIdentifier(accountidentifier);

		/******************** Account_Id_Assigner ********************************************************************************/
		if(a.getAccountIdAssigner() != null) {
			accountidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getAccountIdAssigner()));
		}
		/******************** accountidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		accountidentifier.setPeriod(accountidentifierperiod);

		/******************** Account_Id_Prd_End ********************************************************************************/
		if(a.getAccountIdPrdEnd() != null) {
			java.text.SimpleDateFormat Account_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_Id_Prd_Enddate = Account_Id_Prd_Endsdf.parse(a.getAccountIdPrdEnd());
			accountidentifierperiod.setEnd(Account_Id_Prd_Enddate);
		}
		/******************** Account_Id_Prd_Strt ********************************************************************************/
		if(a.getAccountIdPrdStrt() != null) {
			java.text.SimpleDateFormat Account_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_Id_Prd_Strtdate = Account_Id_Prd_Strtsdf.parse(a.getAccountIdPrdStrt());
			accountidentifierperiod.setStart(Account_Id_Prd_Strtdate);
		}
		/******************** Account_Id_Sys ********************************************************************************/
		if(a.getAccountIdSys() != null) {
			accountidentifier.setSystem(a.getAccountIdSys());
		}
		/******************** accountidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accountidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		accountidentifier.setType(accountidentifiertype);

		/******************** accountidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding accountidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		accountidentifiertype.addCoding(accountidentifiertypecoding);

		/******************** Account_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAccountIdTypCdgCd() != null) {
			accountidentifiertypecoding.setCode(a.getAccountIdTypCdgCd());
		}
		/******************** Account_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAccountIdTypCdgDsply() != null) {
			accountidentifiertypecoding.setDisplay(a.getAccountIdTypCdgDsply());
		}
		/******************** Account_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAccountIdTypCdgSys() != null) {
			accountidentifiertypecoding.setSystem(a.getAccountIdTypCdgSys());
		}
		/******************** Account_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAccountIdTypCdgUsrSltd() != null) {
			accountidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getAccountIdTypCdgUsrSltd()));
		}
		/******************** Account_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAccountIdTypCdgVrsn() != null) {
			accountidentifiertypecoding.setVersion(a.getAccountIdTypCdgVrsn());
		}
		/******************** Account_Id_Typ_Txt ********************************************************************************/
		if(a.getAccountIdTypTxt() != null) {
			accountidentifiertype.setText(a.getAccountIdTypTxt());
		}
		/******************** accountidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory accountidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		accountidentifier.setUse(accountidentifieruse.fromCode(a.getAccountIdUse()));

		/******************** Account_Id_Vl ********************************************************************************/
		if(a.getAccountIdVl() != null) {
			accountidentifier.setValue(a.getAccountIdVl());
		}
		/******************** Account_Nm ********************************************************************************/
		if(a.getAccountNm() != null) {
			account.setName(a.getAccountNm());
		}
		/******************** Account_Owner ********************************************************************************/
		if(a.getAccountOwner() != null) {
			account.setOwner( new org.hl7.fhir.r4.model.Reference(a.getAccountOwner()));
		}
		/******************** Account_PartOf ********************************************************************************/
		if(a.getAccountPartOf() != null) {
			account.setPartOf( new org.hl7.fhir.r4.model.Reference(a.getAccountPartOf()));
		}
		/******************** accountserviceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountserviceperiod =  new org.hl7.fhir.r4.model.Period();
		account.setServicePeriod(accountserviceperiod);

		/******************** Account_SrvPrd_End ********************************************************************************/
		if(a.getAccountSrvPrdEnd() != null) {
			java.text.SimpleDateFormat Account_SrvPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_SrvPrd_Enddate = Account_SrvPrd_Endsdf.parse(a.getAccountSrvPrdEnd());
			accountserviceperiod.setEnd(Account_SrvPrd_Enddate);
		}
		/******************** Account_SrvPrd_Strt ********************************************************************************/
		if(a.getAccountSrvPrdStrt() != null) {
			java.text.SimpleDateFormat Account_SrvPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Account_SrvPrd_Strtdate = Account_SrvPrd_Strtsdf.parse(a.getAccountSrvPrdStrt());
			accountserviceperiod.setStart(Account_SrvPrd_Strtdate);
		}
		/******************** accountstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Account.AccountStatusEnumFactory accountstatus =  new org.hl7.fhir.r4.model.Account.AccountStatusEnumFactory();
		account.setStatus(accountstatus.fromCode(a.getAccountSts()));

		/******************** Account_Sbjct ********************************************************************************/
		if(a.getAccountSbjct() != null) {
			account.addSubject( new org.hl7.fhir.r4.model.Reference(a.getAccountSbjct()));
		}
		/******************** accounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		account.setType(accounttype);

		/******************** accounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding accounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		accounttype.addCoding(accounttypecoding);

		/******************** Account_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAccountTypCdgCd() != null) {
			accounttypecoding.setCode(a.getAccountTypCdgCd());
		}
		/******************** Account_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAccountTypCdgDsply() != null) {
			accounttypecoding.setDisplay(a.getAccountTypCdgDsply());
		}
		/******************** Account_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAccountTypCdgSys() != null) {
			accounttypecoding.setSystem(a.getAccountTypCdgSys());
		}
		/******************** Account_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAccountTypCdgUsrSltd() != null) {
			accounttypecoding.setUserSelected(Boolean.parseBoolean(a.getAccountTypCdgUsrSltd()));
		}
		/******************** Account_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAccountTypCdgVrsn() != null) {
			accounttypecoding.setVersion(a.getAccountTypCdgVrsn());
		}
		/******************** Account_Typ_Txt ********************************************************************************/
		if(a.getAccountTypTxt() != null) {
			accounttype.setText(a.getAccountTypTxt());
		}
		return account;
	}
}
