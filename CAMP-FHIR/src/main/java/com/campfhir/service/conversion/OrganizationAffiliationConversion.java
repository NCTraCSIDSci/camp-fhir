package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OrganizationAffiliation;
public class OrganizationAffiliationConversion 
{
	public org.hl7.fhir.r4.model.OrganizationAffiliation OrganizationAffiliations(OrganizationAffiliation o) throws ParseException
	{
		org.hl7.fhir.r4.model.OrganizationAffiliation organizationaffiliation = new org.hl7.fhir.r4.model.OrganizationAffiliation();

		/******************** id ********************************************************************************/
		organizationaffiliation.setId(o.getId());

		/******************** OrgnztnAffiliation_Active ********************************************************************************/
		if(o.getOrgnztnAffiliationActive() != null) {
			organizationaffiliation.setActive(Boolean.parseBoolean(o.getOrgnztnAffiliationActive()));
		}
		/******************** organizationaffiliationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		organizationaffiliation.addCode(organizationaffiliationcode);

		/******************** organizationaffiliationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		organizationaffiliationcode.addCoding(organizationaffiliationcodecoding);

		/******************** OrgnztnAffiliation_Cd_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgCd() != null) {
			organizationaffiliationcodecoding.setCode(o.getOrgnztnAffiliationCdCdgCd());
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgDsply() != null) {
			organizationaffiliationcodecoding.setDisplay(o.getOrgnztnAffiliationCdCdgDsply());
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgSys() != null) {
			organizationaffiliationcodecoding.setSystem(o.getOrgnztnAffiliationCdCdgSys());
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgUsrSltd() != null) {
			organizationaffiliationcodecoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnAffiliationCdCdgUsrSltd()));
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgVrsn() != null) {
			organizationaffiliationcodecoding.setVersion(o.getOrgnztnAffiliationCdCdgVrsn());
		}
		/******************** OrgnztnAffiliation_Cd_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationCdTxt() != null) {
			organizationaffiliationcode.setText(o.getOrgnztnAffiliationCdTxt());
		}
		/******************** OrgnztnAffiliation_Endpoint ********************************************************************************/
		if(o.getOrgnztnAffiliationEndpoint() != null) {
			organizationaffiliation.addEndpoint( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationEndpoint()));
		}
		/******************** OrgnztnAffiliation_HlthcrSrv ********************************************************************************/
		if(o.getOrgnztnAffiliationHlthcrSrv() != null) {
			organizationaffiliation.addHealthcareService( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationHlthcrSrv()));
		}
		/******************** organizationaffiliationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier organizationaffiliationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		organizationaffiliation.addIdentifier(organizationaffiliationidentifier);

		/******************** OrgnztnAffiliation_Id_Assigner ********************************************************************************/
		if(o.getOrgnztnAffiliationIdAssigner() != null) {
			organizationaffiliationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationIdAssigner()));
		}
		/******************** organizationaffiliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		organizationaffiliationidentifier.setPeriod(organizationaffiliationidentifierperiod);

		/******************** OrgnztnAffiliation_Id_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationIdPrdEnd() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Id_Prd_Enddate = OrgnztnAffiliation_Id_Prd_Endsdf.parse(o.getOrgnztnAffiliationIdPrdEnd());
			organizationaffiliationidentifierperiod.setEnd(OrgnztnAffiliation_Id_Prd_Enddate);
		}
		/******************** OrgnztnAffiliation_Id_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationIdPrdStrt() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Id_Prd_Strtdate = OrgnztnAffiliation_Id_Prd_Strtsdf.parse(o.getOrgnztnAffiliationIdPrdStrt());
			organizationaffiliationidentifierperiod.setStart(OrgnztnAffiliation_Id_Prd_Strtdate);
		}
		/******************** OrgnztnAffiliation_Id_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationIdSys() != null) {
			organizationaffiliationidentifier.setSystem(o.getOrgnztnAffiliationIdSys());
		}
		/******************** organizationaffiliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		organizationaffiliationidentifier.setType(organizationaffiliationidentifiertype);

		/******************** organizationaffiliationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		organizationaffiliationidentifiertype.addCoding(organizationaffiliationidentifiertypecoding);

		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgCd() != null) {
			organizationaffiliationidentifiertypecoding.setCode(o.getOrgnztnAffiliationIdTypCdgCd());
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgDsply() != null) {
			organizationaffiliationidentifiertypecoding.setDisplay(o.getOrgnztnAffiliationIdTypCdgDsply());
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgSys() != null) {
			organizationaffiliationidentifiertypecoding.setSystem(o.getOrgnztnAffiliationIdTypCdgSys());
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgUsrSltd() != null) {
			organizationaffiliationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnAffiliationIdTypCdgUsrSltd()));
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgVrsn() != null) {
			organizationaffiliationidentifiertypecoding.setVersion(o.getOrgnztnAffiliationIdTypCdgVrsn());
		}
		/******************** OrgnztnAffiliation_Id_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypTxt() != null) {
			organizationaffiliationidentifiertype.setText(o.getOrgnztnAffiliationIdTypTxt());
		}
		/******************** organizationaffiliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory organizationaffiliationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		organizationaffiliationidentifier.setUse(organizationaffiliationidentifieruse.fromCode(o.getOrgnztnAffiliationIdUse()));

		/******************** OrgnztnAffiliation_Id_Vl ********************************************************************************/
		if(o.getOrgnztnAffiliationIdVl() != null) {
			organizationaffiliationidentifier.setValue(o.getOrgnztnAffiliationIdVl());
		}
		/******************** OrgnztnAffiliation_Lctn ********************************************************************************/
		if(o.getOrgnztnAffiliationLctn() != null) {
			organizationaffiliation.addLocation( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationLctn()));
		}
		/******************** OrgnztnAffiliation_Network ********************************************************************************/
		if(o.getOrgnztnAffiliationNetwork() != null) {
			organizationaffiliation.addNetwork( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationNetwork()));
		}
		/******************** OrgnztnAffiliation_Orgnztn ********************************************************************************/
		if(o.getOrgnztnAffiliationOrgnztn() != null) {
			organizationaffiliation.setOrganization( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationOrgnztn()));
		}
		/******************** OrgnztnAffiliation_ParticipatingOrgnztn ********************************************************************************/
		if(o.getOrgnztnAffiliationParticipatingOrgnztn() != null) {
			organizationaffiliation.setParticipatingOrganization( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationParticipatingOrgnztn()));
		}
		/******************** organizationaffiliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationperiod =  new org.hl7.fhir.r4.model.Period();
		organizationaffiliation.setPeriod(organizationaffiliationperiod);

		/******************** OrgnztnAffiliation_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationPrdEnd() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Prd_Enddate = OrgnztnAffiliation_Prd_Endsdf.parse(o.getOrgnztnAffiliationPrdEnd());
			organizationaffiliationperiod.setEnd(OrgnztnAffiliation_Prd_Enddate);
		}
		/******************** OrgnztnAffiliation_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationPrdStrt() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Prd_Strtdate = OrgnztnAffiliation_Prd_Strtsdf.parse(o.getOrgnztnAffiliationPrdStrt());
			organizationaffiliationperiod.setStart(OrgnztnAffiliation_Prd_Strtdate);
		}
		/******************** organizationaffiliationspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationspecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		organizationaffiliation.addSpecialty(organizationaffiliationspecialty);

		/******************** organizationaffiliationspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationspecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		organizationaffiliationspecialty.addCoding(organizationaffiliationspecialtycoding);

		/******************** OrgnztnAffiliation_Spclty_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgCd() != null) {
			organizationaffiliationspecialtycoding.setCode(o.getOrgnztnAffiliationSpcltyCdgCd());
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgDsply() != null) {
			organizationaffiliationspecialtycoding.setDisplay(o.getOrgnztnAffiliationSpcltyCdgDsply());
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgSys() != null) {
			organizationaffiliationspecialtycoding.setSystem(o.getOrgnztnAffiliationSpcltyCdgSys());
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgUsrSltd() != null) {
			organizationaffiliationspecialtycoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnAffiliationSpcltyCdgUsrSltd()));
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgVrsn() != null) {
			organizationaffiliationspecialtycoding.setVersion(o.getOrgnztnAffiliationSpcltyCdgVrsn());
		}
		/******************** OrgnztnAffiliation_Spclty_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyTxt() != null) {
			organizationaffiliationspecialty.setText(o.getOrgnztnAffiliationSpcltyTxt());
		}
		/******************** organizationaffiliationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationaffiliationtelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		organizationaffiliation.addTelecom(organizationaffiliationtelecom);

		/******************** organizationaffiliationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationtelecomperiod =  new org.hl7.fhir.r4.model.Period();
		organizationaffiliationtelecom.setPeriod(organizationaffiliationtelecomperiod);

		/******************** OrgnztnAffiliation_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Tlcm_Prd_Enddate = OrgnztnAffiliation_Tlcm_Prd_Endsdf.parse(o.getOrgnztnAffiliationTlcmPrdEnd());
			organizationaffiliationtelecomperiod.setEnd(OrgnztnAffiliation_Tlcm_Prd_Enddate);
		}
		/******************** OrgnztnAffiliation_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat OrgnztnAffiliation_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OrgnztnAffiliation_Tlcm_Prd_Strtdate = OrgnztnAffiliation_Tlcm_Prd_Strtsdf.parse(o.getOrgnztnAffiliationTlcmPrdStrt());
			organizationaffiliationtelecomperiod.setStart(OrgnztnAffiliation_Tlcm_Prd_Strtdate);
		}
		/******************** OrgnztnAffiliation_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmRnk() != null) {
			organizationaffiliationtelecom.setRank(Integer.parseInt(o.getOrgnztnAffiliationTlcmRnk()));
		}
		/******************** organizationaffiliationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory organizationaffiliationtelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		organizationaffiliationtelecom.setSystem(organizationaffiliationtelecomsystem.fromCode(o.getOrgnztnAffiliationTlcmSys()));

		/******************** organizationaffiliationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory organizationaffiliationtelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		organizationaffiliationtelecom.setUse(organizationaffiliationtelecomuse.fromCode(o.getOrgnztnAffiliationTlcmUse()));

		/******************** OrgnztnAffiliation_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmVl() != null) {
			organizationaffiliationtelecom.setValue(o.getOrgnztnAffiliationTlcmVl());
		}
		return organizationaffiliation;
	}
}
