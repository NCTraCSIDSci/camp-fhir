package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Account;
public class AccountBidirectionalConversion 
{
	public Account Accounts(org.hl7.fhir.r4.model.Account account) throws ParseException
	{
		 main.java.com.campfhir.model.Account a = new  main.java.com.campfhir.model.Account();

		/******************** id ********************************************************************************/
		account.setId(a.getId());

		/******************** Account_Owner ********************************************************************************/
		if(account.hasOwner()) {
			a.setAccountOwner(String.valueOf(account.getOwner()));
		}
		/******************** Account_Nm ********************************************************************************/
		if(account.hasName()) {
			a.setAccountNm(String.valueOf(account.getName()));
		}
		/******************** accounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accounttype = account.getType();

		/******************** accounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding accounttypecoding = accounttype.getCodingFirstRep();

		/******************** Account_Typ_Cdg_Dsply ********************************************************************************/
		if(accounttypecoding.hasDisplay()) {
			a.setAccountTypCdgDsply(String.valueOf(accounttypecoding.getDisplay()));
		}
		/******************** Account_Typ_Cdg_Vrsn ********************************************************************************/
		if(accounttypecoding.hasVersion()) {
			a.setAccountTypCdgVrsn(String.valueOf(accounttypecoding.getVersion()));
		}
		/******************** Account_Typ_Cdg_Cd ********************************************************************************/
		if(accounttypecoding.hasCode()) {
			a.setAccountTypCdgCd(String.valueOf(accounttypecoding.getCode()));
		}
		/******************** Account_Typ_Cdg_Sys ********************************************************************************/
		if(accounttypecoding.hasSystem()) {
			a.setAccountTypCdgSys(String.valueOf(accounttypecoding.getSystem()));
		}
		/******************** Account_Typ_Cdg_UsrSltd ********************************************************************************/
		if(accounttypecoding.hasUserSelected()) {
			a.setAccountTypCdgUsrSltd(String.valueOf(accounttypecoding.getUserSelected()));
		}
		/******************** Account_Typ_Txt ********************************************************************************/
		if(accounttype.hasText()) {
			a.setAccountTypTxt(String.valueOf(accounttype.getText()));
		}
		/******************** accountguarantor ********************************************************************************/
		org.hl7.fhir.r4.model.Account.GuarantorComponent accountguarantor = account.getGuarantorFirstRep();

		/******************** accountguarantorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountguarantorperiod = accountguarantor.getPeriod();

		/******************** Account_Guarantor_Prd_End ********************************************************************************/
		if(accountguarantorperiod.hasEnd()) {
			a.setAccountGuarantorPrdEnd(String.valueOf(accountguarantorperiod.getEnd()));
		}
		/******************** Account_Guarantor_Prd_Strt ********************************************************************************/
		if(accountguarantorperiod.hasStart()) {
			a.setAccountGuarantorPrdStrt(String.valueOf(accountguarantorperiod.getStart()));
		}
		/******************** Account_Guarantor_Party ********************************************************************************/
		if(accountguarantor.hasParty()) {
			a.setAccountGuarantorParty(String.valueOf(accountguarantor.getParty()));
		}
		/******************** Account_Guarantor_OnHold ********************************************************************************/
		if(accountguarantor.hasOnHold()) {
			a.setAccountGuarantorOnHold(String.valueOf(accountguarantor.getOnHold()));
		}
		/******************** accountcoverage ********************************************************************************/
		org.hl7.fhir.r4.model.Account.CoverageComponent accountcoverage = account.getCoverageFirstRep();

		/******************** Account_Cvg_Priority ********************************************************************************/
		if(accountcoverage.hasPriority()) {
			a.setAccountCvgPriority(String.valueOf(accountcoverage.getPriority()));
		}
		/******************** accountserviceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountserviceperiod = account.getServicePeriod();

		/******************** Account_SrvPrd_End ********************************************************************************/
		if(accountserviceperiod.hasEnd()) {
			a.setAccountSrvPrdEnd(String.valueOf(accountserviceperiod.getEnd()));
		}
		/******************** Account_SrvPrd_Strt ********************************************************************************/
		if(accountserviceperiod.hasStart()) {
			a.setAccountSrvPrdStrt(String.valueOf(accountserviceperiod.getStart()));
		}
		/******************** accountstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Account.AccountStatus accountstatus = account.getStatus();
		a.setAccountSts(accountstatus.toCode());

		/******************** Account_Dscrptn ********************************************************************************/
		if(account.hasDescription()) {
			a.setAccountDscrptn(String.valueOf(account.getDescription()));
		}
		/******************** Account_PartOf ********************************************************************************/
		if(account.hasPartOf()) {
			a.setAccountPartOf(String.valueOf(account.getPartOf()));
		}
		/******************** Account_Sbjct ********************************************************************************/
		if(account.hasSubject()) {
			a.setAccountSbjct(String.valueOf(account.getSubjectFirstRep()));
		}
		/******************** accountidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier accountidentifier = account.getIdentifierFirstRep();

		/******************** Account_Id_Vl ********************************************************************************/
		if(accountidentifier.hasValue()) {
			a.setAccountIdVl(String.valueOf(accountidentifier.getValue()));
		}
		/******************** accountidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accountidentifiertype = accountidentifier.getType();

		/******************** accountidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding accountidentifiertypecoding = accountidentifiertype.getCodingFirstRep();

		/******************** Account_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(accountidentifiertypecoding.hasDisplay()) {
			a.setAccountIdTypCdgDsply(String.valueOf(accountidentifiertypecoding.getDisplay()));
		}
		/******************** Account_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(accountidentifiertypecoding.hasVersion()) {
			a.setAccountIdTypCdgVrsn(String.valueOf(accountidentifiertypecoding.getVersion()));
		}
		/******************** Account_Id_Typ_Cdg_Cd ********************************************************************************/
		if(accountidentifiertypecoding.hasCode()) {
			a.setAccountIdTypCdgCd(String.valueOf(accountidentifiertypecoding.getCode()));
		}
		/******************** Account_Id_Typ_Cdg_Sys ********************************************************************************/
		if(accountidentifiertypecoding.hasSystem()) {
			a.setAccountIdTypCdgSys(String.valueOf(accountidentifiertypecoding.getSystem()));
		}
		/******************** Account_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(accountidentifiertypecoding.hasUserSelected()) {
			a.setAccountIdTypCdgUsrSltd(String.valueOf(accountidentifiertypecoding.getUserSelected()));
		}
		/******************** Account_Id_Typ_Txt ********************************************************************************/
		if(accountidentifiertype.hasText()) {
			a.setAccountIdTypTxt(String.valueOf(accountidentifiertype.getText()));
		}
		/******************** Account_Id_Sys ********************************************************************************/
		if(accountidentifier.hasSystem()) {
			a.setAccountIdSys(String.valueOf(accountidentifier.getSystem()));
		}
		/******************** Account_Id_Assigner ********************************************************************************/
		if(accountidentifier.hasAssigner()) {
			a.setAccountIdAssigner(String.valueOf(accountidentifier.getAssigner()));
		}
		/******************** accountidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountidentifierperiod = accountidentifier.getPeriod();

		/******************** Account_Id_Prd_End ********************************************************************************/
		if(accountidentifierperiod.hasEnd()) {
			a.setAccountIdPrdEnd(String.valueOf(accountidentifierperiod.getEnd()));
		}
		/******************** Account_Id_Prd_Strt ********************************************************************************/
		if(accountidentifierperiod.hasStart()) {
			a.setAccountIdPrdStrt(String.valueOf(accountidentifierperiod.getStart()));
		}
		/******************** accountidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse accountidentifieruse = accountidentifier.getUse();
		a.setAccountIdUse(accountidentifieruse.toCode());

		return a;
	}
}
