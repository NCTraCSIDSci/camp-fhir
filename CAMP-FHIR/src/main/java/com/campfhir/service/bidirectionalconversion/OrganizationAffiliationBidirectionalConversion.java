package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OrganizationAffiliation;
public class OrganizationAffiliationBidirectionalConversion 
{
	public OrganizationAffiliation OrganizationAffiliations(org.hl7.fhir.r4.model.OrganizationAffiliation organizationaffiliation) throws ParseException
	{
		 main.java.com.campfhir.model.OrganizationAffiliation o = new  main.java.com.campfhir.model.OrganizationAffiliation();

		/******************** id ********************************************************************************/
		organizationaffiliation.setId(o.getId());

		/******************** OrgnztnAffiliation_ParticipatingOrgnztn ********************************************************************************/
		if(organizationaffiliation.hasParticipatingOrganization()) {
			o.setOrgnztnAffiliationParticipatingOrgnztn(String.valueOf(organizationaffiliation.getParticipatingOrganization()));
		}
		/******************** OrgnztnAffiliation_Orgnztn ********************************************************************************/
		if(organizationaffiliation.hasOrganization()) {
			o.setOrgnztnAffiliationOrgnztn(String.valueOf(organizationaffiliation.getOrganization()));
		}
		/******************** organizationaffiliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationperiod = organizationaffiliation.getPeriod();

		/******************** OrgnztnAffiliation_Prd_Strt ********************************************************************************/
		if(organizationaffiliationperiod.hasStart()) {
			o.setOrgnztnAffiliationPrdStrt(String.valueOf(organizationaffiliationperiod.getStart()));
		}
		/******************** OrgnztnAffiliation_Prd_End ********************************************************************************/
		if(organizationaffiliationperiod.hasEnd()) {
			o.setOrgnztnAffiliationPrdEnd(String.valueOf(organizationaffiliationperiod.getEnd()));
		}
		/******************** OrgnztnAffiliation_Network ********************************************************************************/
		if(organizationaffiliation.hasNetwork()) {
			o.setOrgnztnAffiliationNetwork(String.valueOf(organizationaffiliation.getNetworkFirstRep()));
		}
		/******************** OrgnztnAffiliation_Active ********************************************************************************/
		if(organizationaffiliation.hasActive()) {
			o.setOrgnztnAffiliationActive(String.valueOf(organizationaffiliation.getActive()));
		}
		/******************** organizationaffiliationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationaffiliationtelecom = organizationaffiliation.getTelecomFirstRep();

		/******************** OrgnztnAffiliation_Tlcm_Vl ********************************************************************************/
		if(organizationaffiliationtelecom.hasValue()) {
			o.setOrgnztnAffiliationTlcmVl(String.valueOf(organizationaffiliationtelecom.getValue()));
		}
		/******************** organizationaffiliationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationtelecomperiod = organizationaffiliationtelecom.getPeriod();

		/******************** OrgnztnAffiliation_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationaffiliationtelecomperiod.hasStart()) {
			o.setOrgnztnAffiliationTlcmPrdStrt(String.valueOf(organizationaffiliationtelecomperiod.getStart()));
		}
		/******************** OrgnztnAffiliation_Tlcm_Prd_End ********************************************************************************/
		if(organizationaffiliationtelecomperiod.hasEnd()) {
			o.setOrgnztnAffiliationTlcmPrdEnd(String.valueOf(organizationaffiliationtelecomperiod.getEnd()));
		}
		/******************** organizationaffiliationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationaffiliationtelecomsystem = organizationaffiliationtelecom.getSystem();
		o.setOrgnztnAffiliationTlcmSys(organizationaffiliationtelecomsystem.toCode());

		/******************** organizationaffiliationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationaffiliationtelecomuse = organizationaffiliationtelecom.getUse();
		o.setOrgnztnAffiliationTlcmUse(organizationaffiliationtelecomuse.toCode());

		/******************** OrgnztnAffiliation_Tlcm_Rnk ********************************************************************************/
		if(organizationaffiliationtelecom.hasRank()) {
			o.setOrgnztnAffiliationTlcmRnk(String.valueOf(organizationaffiliationtelecom.getRank()));
		}
		/******************** organizationaffiliationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationcode = organizationaffiliation.getCodeFirstRep();

		/******************** OrgnztnAffiliation_Cd_Txt ********************************************************************************/
		if(organizationaffiliationcode.hasText()) {
			o.setOrgnztnAffiliationCdTxt(String.valueOf(organizationaffiliationcode.getText()));
		}
		/******************** organizationaffiliationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationcodecoding = organizationaffiliationcode.getCodingFirstRep();

		/******************** OrgnztnAffiliation_Cd_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationcodecoding.hasVersion()) {
			o.setOrgnztnAffiliationCdCdgVrsn(String.valueOf(organizationaffiliationcodecoding.getVersion()));
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationcodecoding.hasDisplay()) {
			o.setOrgnztnAffiliationCdCdgDsply(String.valueOf(organizationaffiliationcodecoding.getDisplay()));
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationcodecoding.hasCode()) {
			o.setOrgnztnAffiliationCdCdgCd(String.valueOf(organizationaffiliationcodecoding.getCode()));
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationcodecoding.hasUserSelected()) {
			o.setOrgnztnAffiliationCdCdgUsrSltd(String.valueOf(organizationaffiliationcodecoding.getUserSelected()));
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationcodecoding.hasSystem()) {
			o.setOrgnztnAffiliationCdCdgSys(String.valueOf(organizationaffiliationcodecoding.getSystem()));
		}
		/******************** OrgnztnAffiliation_Lctn ********************************************************************************/
		if(organizationaffiliation.hasLocation()) {
			o.setOrgnztnAffiliationLctn(String.valueOf(organizationaffiliation.getLocationFirstRep()));
		}
		/******************** organizationaffiliationspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationspecialty = organizationaffiliation.getSpecialtyFirstRep();

		/******************** OrgnztnAffiliation_Spclty_Txt ********************************************************************************/
		if(organizationaffiliationspecialty.hasText()) {
			o.setOrgnztnAffiliationSpcltyTxt(String.valueOf(organizationaffiliationspecialty.getText()));
		}
		/******************** organizationaffiliationspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationspecialtycoding = organizationaffiliationspecialty.getCodingFirstRep();

		/******************** OrgnztnAffiliation_Spclty_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationspecialtycoding.hasVersion()) {
			o.setOrgnztnAffiliationSpcltyCdgVrsn(String.valueOf(organizationaffiliationspecialtycoding.getVersion()));
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationspecialtycoding.hasDisplay()) {
			o.setOrgnztnAffiliationSpcltyCdgDsply(String.valueOf(organizationaffiliationspecialtycoding.getDisplay()));
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationspecialtycoding.hasCode()) {
			o.setOrgnztnAffiliationSpcltyCdgCd(String.valueOf(organizationaffiliationspecialtycoding.getCode()));
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationspecialtycoding.hasUserSelected()) {
			o.setOrgnztnAffiliationSpcltyCdgUsrSltd(String.valueOf(organizationaffiliationspecialtycoding.getUserSelected()));
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationspecialtycoding.hasSystem()) {
			o.setOrgnztnAffiliationSpcltyCdgSys(String.valueOf(organizationaffiliationspecialtycoding.getSystem()));
		}
		/******************** organizationaffiliationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier organizationaffiliationidentifier = organizationaffiliation.getIdentifierFirstRep();

		/******************** OrgnztnAffiliation_Id_Vl ********************************************************************************/
		if(organizationaffiliationidentifier.hasValue()) {
			o.setOrgnztnAffiliationIdVl(String.valueOf(organizationaffiliationidentifier.getValue()));
		}
		/******************** organizationaffiliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationidentifiertype = organizationaffiliationidentifier.getType();

		/******************** OrgnztnAffiliation_Id_Typ_Txt ********************************************************************************/
		if(organizationaffiliationidentifiertype.hasText()) {
			o.setOrgnztnAffiliationIdTypTxt(String.valueOf(organizationaffiliationidentifiertype.getText()));
		}
		/******************** organizationaffiliationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationaffiliationidentifiertypecoding = organizationaffiliationidentifiertype.getCodingFirstRep();

		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationidentifiertypecoding.hasVersion()) {
			o.setOrgnztnAffiliationIdTypCdgVrsn(String.valueOf(organizationaffiliationidentifiertypecoding.getVersion()));
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationidentifiertypecoding.hasDisplay()) {
			o.setOrgnztnAffiliationIdTypCdgDsply(String.valueOf(organizationaffiliationidentifiertypecoding.getDisplay()));
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationidentifiertypecoding.hasCode()) {
			o.setOrgnztnAffiliationIdTypCdgCd(String.valueOf(organizationaffiliationidentifiertypecoding.getCode()));
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationidentifiertypecoding.hasUserSelected()) {
			o.setOrgnztnAffiliationIdTypCdgUsrSltd(String.valueOf(organizationaffiliationidentifiertypecoding.getUserSelected()));
		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationidentifiertypecoding.hasSystem()) {
			o.setOrgnztnAffiliationIdTypCdgSys(String.valueOf(organizationaffiliationidentifiertypecoding.getSystem()));
		}
		/******************** organizationaffiliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationidentifierperiod = organizationaffiliationidentifier.getPeriod();

		/******************** OrgnztnAffiliation_Id_Prd_Strt ********************************************************************************/
		if(organizationaffiliationidentifierperiod.hasStart()) {
			o.setOrgnztnAffiliationIdPrdStrt(String.valueOf(organizationaffiliationidentifierperiod.getStart()));
		}
		/******************** OrgnztnAffiliation_Id_Prd_End ********************************************************************************/
		if(organizationaffiliationidentifierperiod.hasEnd()) {
			o.setOrgnztnAffiliationIdPrdEnd(String.valueOf(organizationaffiliationidentifierperiod.getEnd()));
		}
		/******************** OrgnztnAffiliation_Id_Assigner ********************************************************************************/
		if(organizationaffiliationidentifier.hasAssigner()) {
			o.setOrgnztnAffiliationIdAssigner(String.valueOf(organizationaffiliationidentifier.getAssigner()));
		}
		/******************** OrgnztnAffiliation_Id_Sys ********************************************************************************/
		if(organizationaffiliationidentifier.hasSystem()) {
			o.setOrgnztnAffiliationIdSys(String.valueOf(organizationaffiliationidentifier.getSystem()));
		}
		/******************** organizationaffiliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse organizationaffiliationidentifieruse = organizationaffiliationidentifier.getUse();
		o.setOrgnztnAffiliationIdUse(organizationaffiliationidentifieruse.toCode());

		/******************** OrgnztnAffiliation_Endpoint ********************************************************************************/
		if(organizationaffiliation.hasEndpoint()) {
			o.setOrgnztnAffiliationEndpoint(String.valueOf(organizationaffiliation.getEndpointFirstRep()));
		}
		/******************** OrgnztnAffiliation_HlthcrSrv ********************************************************************************/
		if(organizationaffiliation.hasHealthcareService()) {
			o.setOrgnztnAffiliationHlthcrSrv(String.valueOf(organizationaffiliation.getHealthcareServiceFirstRep()));
		}
		return o;
	}
}
