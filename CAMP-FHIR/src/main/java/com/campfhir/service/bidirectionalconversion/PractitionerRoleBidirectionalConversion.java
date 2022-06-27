package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PractitionerRole;
public class PractitionerRoleBidirectionalConversion 
{
	public PractitionerRole PractitionerRoles(org.hl7.fhir.r4.model.PractitionerRole practitionerrole) throws ParseException
	{
		 main.java.com.campfhir.model.PractitionerRole p = new  main.java.com.campfhir.model.PractitionerRole();

		/******************** id ********************************************************************************/
		practitionerrole.setId(p.getId());

		/******************** PrctitnrRole_Orgnztn ********************************************************************************/
		if(practitionerrole.hasOrganization()) {
			p.setPrctitnrRoleOrgnztn(String.valueOf(practitionerrole.getOrganization()));
		}
		/******************** PrctitnrRole_Prctitnr ********************************************************************************/
		if(practitionerrole.hasPractitioner()) {
			p.setPrctitnrRolePrctitnr(String.valueOf(practitionerrole.getPractitioner()));
		}
		/******************** practitionerroleperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleperiod = practitionerrole.getPeriod();

		/******************** PrctitnrRole_Prd_Strt ********************************************************************************/
		if(practitionerroleperiod.hasStart()) {
			p.setPrctitnrRolePrdStrt(String.valueOf(practitionerroleperiod.getStart()));
		}
		/******************** PrctitnrRole_Prd_End ********************************************************************************/
		if(practitionerroleperiod.hasEnd()) {
			p.setPrctitnrRolePrdEnd(String.valueOf(practitionerroleperiod.getEnd()));
		}
		/******************** PrctitnrRole_Active ********************************************************************************/
		if(practitionerrole.hasActive()) {
			p.setPrctitnrRoleActive(String.valueOf(practitionerrole.getActive()));
		}
		/******************** practitionerroletelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint practitionerroletelecom = practitionerrole.getTelecomFirstRep();

		/******************** PrctitnrRole_Tlcm_Vl ********************************************************************************/
		if(practitionerroletelecom.hasValue()) {
			p.setPrctitnrRoleTlcmVl(String.valueOf(practitionerroletelecom.getValue()));
		}
		/******************** practitionerroletelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroletelecomperiod = practitionerroletelecom.getPeriod();

		/******************** PrctitnrRole_Tlcm_Prd_Strt ********************************************************************************/
		if(practitionerroletelecomperiod.hasStart()) {
			p.setPrctitnrRoleTlcmPrdStrt(String.valueOf(practitionerroletelecomperiod.getStart()));
		}
		/******************** PrctitnrRole_Tlcm_Prd_End ********************************************************************************/
		if(practitionerroletelecomperiod.hasEnd()) {
			p.setPrctitnrRoleTlcmPrdEnd(String.valueOf(practitionerroletelecomperiod.getEnd()));
		}
		/******************** practitionerroletelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem practitionerroletelecomsystem = practitionerroletelecom.getSystem();
		p.setPrctitnrRoleTlcmSys(practitionerroletelecomsystem.toCode());

		/******************** practitionerroletelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse practitionerroletelecomuse = practitionerroletelecom.getUse();
		p.setPrctitnrRoleTlcmUse(practitionerroletelecomuse.toCode());

		/******************** PrctitnrRole_Tlcm_Rnk ********************************************************************************/
		if(practitionerroletelecom.hasRank()) {
			p.setPrctitnrRoleTlcmRnk(String.valueOf(practitionerroletelecom.getRank()));
		}
		/******************** practitionerrolecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerrolecode = practitionerrole.getCodeFirstRep();

		/******************** PrctitnrRole_Cd_Txt ********************************************************************************/
		if(practitionerrolecode.hasText()) {
			p.setPrctitnrRoleCdTxt(String.valueOf(practitionerrolecode.getText()));
		}
		/******************** practitionerrolecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerrolecodecoding = practitionerrolecode.getCodingFirstRep();

		/******************** PrctitnrRole_Cd_Cdg_Vrsn ********************************************************************************/
		if(practitionerrolecodecoding.hasVersion()) {
			p.setPrctitnrRoleCdCdgVrsn(String.valueOf(practitionerrolecodecoding.getVersion()));
		}
		/******************** PrctitnrRole_Cd_Cdg_Dsply ********************************************************************************/
		if(practitionerrolecodecoding.hasDisplay()) {
			p.setPrctitnrRoleCdCdgDsply(String.valueOf(practitionerrolecodecoding.getDisplay()));
		}
		/******************** PrctitnrRole_Cd_Cdg_Cd ********************************************************************************/
		if(practitionerrolecodecoding.hasCode()) {
			p.setPrctitnrRoleCdCdgCd(String.valueOf(practitionerrolecodecoding.getCode()));
		}
		/******************** PrctitnrRole_Cd_Cdg_UsrSltd ********************************************************************************/
		if(practitionerrolecodecoding.hasUserSelected()) {
			p.setPrctitnrRoleCdCdgUsrSltd(String.valueOf(practitionerrolecodecoding.getUserSelected()));
		}
		/******************** PrctitnrRole_Cd_Cdg_Sys ********************************************************************************/
		if(practitionerrolecodecoding.hasSystem()) {
			p.setPrctitnrRoleCdCdgSys(String.valueOf(practitionerrolecodecoding.getSystem()));
		}
		/******************** PrctitnrRole_Lctn ********************************************************************************/
		if(practitionerrole.hasLocation()) {
			p.setPrctitnrRoleLctn(String.valueOf(practitionerrole.getLocationFirstRep()));
		}
		/******************** practitionerrolespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerrolespecialty = practitionerrole.getSpecialtyFirstRep();

		/******************** PrctitnrRole_Spclty_Txt ********************************************************************************/
		if(practitionerrolespecialty.hasText()) {
			p.setPrctitnrRoleSpcltyTxt(String.valueOf(practitionerrolespecialty.getText()));
		}
		/******************** practitionerrolespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerrolespecialtycoding = practitionerrolespecialty.getCodingFirstRep();

		/******************** PrctitnrRole_Spclty_Cdg_Vrsn ********************************************************************************/
		if(practitionerrolespecialtycoding.hasVersion()) {
			p.setPrctitnrRoleSpcltyCdgVrsn(String.valueOf(practitionerrolespecialtycoding.getVersion()));
		}
		/******************** PrctitnrRole_Spclty_Cdg_Dsply ********************************************************************************/
		if(practitionerrolespecialtycoding.hasDisplay()) {
			p.setPrctitnrRoleSpcltyCdgDsply(String.valueOf(practitionerrolespecialtycoding.getDisplay()));
		}
		/******************** PrctitnrRole_Spclty_Cdg_Cd ********************************************************************************/
		if(practitionerrolespecialtycoding.hasCode()) {
			p.setPrctitnrRoleSpcltyCdgCd(String.valueOf(practitionerrolespecialtycoding.getCode()));
		}
		/******************** PrctitnrRole_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(practitionerrolespecialtycoding.hasUserSelected()) {
			p.setPrctitnrRoleSpcltyCdgUsrSltd(String.valueOf(practitionerrolespecialtycoding.getUserSelected()));
		}
		/******************** PrctitnrRole_Spclty_Cdg_Sys ********************************************************************************/
		if(practitionerrolespecialtycoding.hasSystem()) {
			p.setPrctitnrRoleSpcltyCdgSys(String.valueOf(practitionerrolespecialtycoding.getSystem()));
		}
		/******************** practitionerroleidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitionerroleidentifier = practitionerrole.getIdentifierFirstRep();

		/******************** PrctitnrRole_Id_Vl ********************************************************************************/
		if(practitionerroleidentifier.hasValue()) {
			p.setPrctitnrRoleIdVl(String.valueOf(practitionerroleidentifier.getValue()));
		}
		/******************** practitionerroleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerroleidentifiertype = practitionerroleidentifier.getType();

		/******************** PrctitnrRole_Id_Typ_Txt ********************************************************************************/
		if(practitionerroleidentifiertype.hasText()) {
			p.setPrctitnrRoleIdTypTxt(String.valueOf(practitionerroleidentifiertype.getText()));
		}
		/******************** practitionerroleidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerroleidentifiertypecoding = practitionerroleidentifiertype.getCodingFirstRep();

		/******************** PrctitnrRole_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitionerroleidentifiertypecoding.hasVersion()) {
			p.setPrctitnrRoleIdTypCdgVrsn(String.valueOf(practitionerroleidentifiertypecoding.getVersion()));
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitionerroleidentifiertypecoding.hasDisplay()) {
			p.setPrctitnrRoleIdTypCdgDsply(String.valueOf(practitionerroleidentifiertypecoding.getDisplay()));
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitionerroleidentifiertypecoding.hasCode()) {
			p.setPrctitnrRoleIdTypCdgCd(String.valueOf(practitionerroleidentifiertypecoding.getCode()));
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitionerroleidentifiertypecoding.hasUserSelected()) {
			p.setPrctitnrRoleIdTypCdgUsrSltd(String.valueOf(practitionerroleidentifiertypecoding.getUserSelected()));
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitionerroleidentifiertypecoding.hasSystem()) {
			p.setPrctitnrRoleIdTypCdgSys(String.valueOf(practitionerroleidentifiertypecoding.getSystem()));
		}
		/******************** practitionerroleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleidentifierperiod = practitionerroleidentifier.getPeriod();

		/******************** PrctitnrRole_Id_Prd_Strt ********************************************************************************/
		if(practitionerroleidentifierperiod.hasStart()) {
			p.setPrctitnrRoleIdPrdStrt(String.valueOf(practitionerroleidentifierperiod.getStart()));
		}
		/******************** PrctitnrRole_Id_Prd_End ********************************************************************************/
		if(practitionerroleidentifierperiod.hasEnd()) {
			p.setPrctitnrRoleIdPrdEnd(String.valueOf(practitionerroleidentifierperiod.getEnd()));
		}
		/******************** PrctitnrRole_Id_Assigner ********************************************************************************/
		if(practitionerroleidentifier.hasAssigner()) {
			p.setPrctitnrRoleIdAssigner(String.valueOf(practitionerroleidentifier.getAssigner()));
		}
		/******************** PrctitnrRole_Id_Sys ********************************************************************************/
		if(practitionerroleidentifier.hasSystem()) {
			p.setPrctitnrRoleIdSys(String.valueOf(practitionerroleidentifier.getSystem()));
		}
		/******************** practitionerroleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitionerroleidentifieruse = practitionerroleidentifier.getUse();
		p.setPrctitnrRoleIdUse(practitionerroleidentifieruse.toCode());

		/******************** PrctitnrRole_Endpoint ********************************************************************************/
		if(practitionerrole.hasEndpoint()) {
			p.setPrctitnrRoleEndpoint(String.valueOf(practitionerrole.getEndpointFirstRep()));
		}
		/******************** PrctitnrRole_AvailabilityExceptions ********************************************************************************/
		if(practitionerrole.hasAvailabilityExceptions()) {
			p.setPrctitnrRoleAvailabilityExceptions(String.valueOf(practitionerrole.getAvailabilityExceptions()));
		}
		/******************** practitionerrolenotavailable ********************************************************************************/
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent practitionerrolenotavailable = practitionerrole.getNotAvailableFirstRep();

		/******************** PrctitnrRole_NotAvailable_Dscrptn ********************************************************************************/
		if(practitionerrolenotavailable.hasDescription()) {
			p.setPrctitnrRoleNotAvailableDscrptn(String.valueOf(practitionerrolenotavailable.getDescription()));
		}
		/******************** practitionerrolenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerrolenotavailableduring = practitionerrolenotavailable.getDuring();

		/******************** PrctitnrRole_NotAvailable_During_Strt ********************************************************************************/
		if(practitionerrolenotavailableduring.hasStart()) {
			p.setPrctitnrRoleNotAvailableDuringStrt(String.valueOf(practitionerrolenotavailableduring.getStart()));
		}
		/******************** PrctitnrRole_NotAvailable_During_End ********************************************************************************/
		if(practitionerrolenotavailableduring.hasEnd()) {
			p.setPrctitnrRoleNotAvailableDuringEnd(String.valueOf(practitionerrolenotavailableduring.getEnd()));
		}
		/******************** practitionerroleavailabletime ********************************************************************************/
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent practitionerroleavailabletime = practitionerrole.getAvailableTimeFirstRep();

		/******************** PrctitnrRole_AvailableTime_AvailableEndTime ********************************************************************************/
		if(practitionerroleavailabletime.hasAvailableEndTime()) {
			p.setPrctitnrRoleAvailableTimeAvailableEndTime(String.valueOf(practitionerroleavailabletime.getAvailableEndTime()));
		}
		/******************** PrctitnrRole_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(practitionerroleavailabletime.hasAvailableStartTime()) {
			p.setPrctitnrRoleAvailableTimeAvailableStrtTime(String.valueOf(practitionerroleavailabletime.getAvailableStartTime()));
		}
		/******************** PrctitnrRole_AvailableTime_AllDay ********************************************************************************/
		if(practitionerroleavailabletime.hasAllDay()) {
			p.setPrctitnrRoleAvailableTimeAllDay(String.valueOf(practitionerroleavailabletime.getAllDay()));
		}
		/******************** PrctitnrRole_HlthcrSrv ********************************************************************************/
		if(practitionerrole.hasHealthcareService()) {
			p.setPrctitnrRoleHlthcrSrv(String.valueOf(practitionerrole.getHealthcareServiceFirstRep()));
		}
		return p;
	}
}
