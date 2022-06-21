package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Endpoint;
public class EndpointBidirectionalConversion 
{
	public Endpoint Endpoints(org.hl7.fhir.r4.model.Endpoint endpoint) throws ParseException
	{
		 main.java.com.campfhir.model.Endpoint e = new  main.java.com.campfhir.model.Endpoint();

		/******************** id ********************************************************************************/
		endpoint.setId(e.getId());

		/******************** Endpoint_Nm ********************************************************************************/
		if(endpoint.hasName()) {
			e.setEndpointNm(String.valueOf(endpoint.getName()));
		}
		/******************** Endpoint_Addr ********************************************************************************/
		if(endpoint.hasAddress()) {
			e.setEndpointAddr(String.valueOf(endpoint.getAddress()));
		}
		/******************** endpointstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Endpoint.EndpointStatus endpointstatus = endpoint.getStatus();
		e.setEndpointSts(endpointstatus.toCode());

		/******************** endpointperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointperiod = endpoint.getPeriod();

		/******************** Endpoint_Prd_End ********************************************************************************/
		if(endpointperiod.hasEnd()) {
			e.setEndpointPrdEnd(String.valueOf(endpointperiod.getEnd()));
		}
		/******************** Endpoint_Prd_Strt ********************************************************************************/
		if(endpointperiod.hasStart()) {
			e.setEndpointPrdStrt(String.valueOf(endpointperiod.getStart()));
		}
		/******************** endpointcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint endpointcontact = endpoint.getContactFirstRep();

		/******************** Endpoint_Cntct_Vl ********************************************************************************/
		if(endpointcontact.hasValue()) {
			e.setEndpointCntctVl(String.valueOf(endpointcontact.getValue()));
		}
		/******************** endpointcontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem endpointcontactsystem = endpointcontact.getSystem();
		e.setEndpointCntctSys(endpointcontactsystem.toCode());

		/******************** endpointcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointcontactperiod = endpointcontact.getPeriod();

		/******************** Endpoint_Cntct_Prd_End ********************************************************************************/
		if(endpointcontactperiod.hasEnd()) {
			e.setEndpointCntctPrdEnd(String.valueOf(endpointcontactperiod.getEnd()));
		}
		/******************** Endpoint_Cntct_Prd_Strt ********************************************************************************/
		if(endpointcontactperiod.hasStart()) {
			e.setEndpointCntctPrdStrt(String.valueOf(endpointcontactperiod.getStart()));
		}
		/******************** endpointcontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse endpointcontactuse = endpointcontact.getUse();
		e.setEndpointCntctUse(endpointcontactuse.toCode());

		/******************** Endpoint_Cntct_Rnk ********************************************************************************/
		if(endpointcontact.hasRank()) {
			e.setEndpointCntctRnk(String.valueOf(endpointcontact.getRank()));
		}
		/******************** endpointconnectiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointconnectiontype = endpoint.getConnectionType();

		/******************** Endpoint_ConnectionTyp_Dsply ********************************************************************************/
		if(endpointconnectiontype.hasDisplay()) {
			e.setEndpointConnectionTypDsply(String.valueOf(endpointconnectiontype.getDisplay()));
		}
		/******************** Endpoint_ConnectionTyp_Vrsn ********************************************************************************/
		if(endpointconnectiontype.hasVersion()) {
			e.setEndpointConnectionTypVrsn(String.valueOf(endpointconnectiontype.getVersion()));
		}
		/******************** Endpoint_ConnectionTyp_Cd ********************************************************************************/
		if(endpointconnectiontype.hasCode()) {
			e.setEndpointConnectionTypCd(String.valueOf(endpointconnectiontype.getCode()));
		}
		/******************** Endpoint_ConnectionTyp_Sys ********************************************************************************/
		if(endpointconnectiontype.hasSystem()) {
			e.setEndpointConnectionTypSys(String.valueOf(endpointconnectiontype.getSystem()));
		}
		/******************** Endpoint_ConnectionTyp_UsrSltd ********************************************************************************/
		if(endpointconnectiontype.hasUserSelected()) {
			e.setEndpointConnectionTypUsrSltd(String.valueOf(endpointconnectiontype.getUserSelected()));
		}
		/******************** Endpoint_ManagingOrgnztn ********************************************************************************/
		if(endpoint.hasManagingOrganization()) {
			e.setEndpointManagingOrgnztn(String.valueOf(endpoint.getManagingOrganization()));
		}
		/******************** endpointpayloadtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept endpointpayloadtype = endpoint.getPayloadTypeFirstRep();

		/******************** endpointpayloadtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointpayloadtypecoding = endpointpayloadtype.getCodingFirstRep();

		/******************** Endpoint_PayloadTyp_Cdg_Dsply ********************************************************************************/
		if(endpointpayloadtypecoding.hasDisplay()) {
			e.setEndpointPayloadTypCdgDsply(String.valueOf(endpointpayloadtypecoding.getDisplay()));
		}
		/******************** Endpoint_PayloadTyp_Cdg_Vrsn ********************************************************************************/
		if(endpointpayloadtypecoding.hasVersion()) {
			e.setEndpointPayloadTypCdgVrsn(String.valueOf(endpointpayloadtypecoding.getVersion()));
		}
		/******************** Endpoint_PayloadTyp_Cdg_Cd ********************************************************************************/
		if(endpointpayloadtypecoding.hasCode()) {
			e.setEndpointPayloadTypCdgCd(String.valueOf(endpointpayloadtypecoding.getCode()));
		}
		/******************** Endpoint_PayloadTyp_Cdg_Sys ********************************************************************************/
		if(endpointpayloadtypecoding.hasSystem()) {
			e.setEndpointPayloadTypCdgSys(String.valueOf(endpointpayloadtypecoding.getSystem()));
		}
		/******************** Endpoint_PayloadTyp_Cdg_UsrSltd ********************************************************************************/
		if(endpointpayloadtypecoding.hasUserSelected()) {
			e.setEndpointPayloadTypCdgUsrSltd(String.valueOf(endpointpayloadtypecoding.getUserSelected()));
		}
		/******************** Endpoint_PayloadTyp_Txt ********************************************************************************/
		if(endpointpayloadtype.hasText()) {
			e.setEndpointPayloadTypTxt(String.valueOf(endpointpayloadtype.getText()));
		}
		/******************** endpointidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier endpointidentifier = endpoint.getIdentifierFirstRep();

		/******************** Endpoint_Id_Vl ********************************************************************************/
		if(endpointidentifier.hasValue()) {
			e.setEndpointIdVl(String.valueOf(endpointidentifier.getValue()));
		}
		/******************** endpointidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept endpointidentifiertype = endpointidentifier.getType();

		/******************** endpointidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointidentifiertypecoding = endpointidentifiertype.getCodingFirstRep();

		/******************** Endpoint_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(endpointidentifiertypecoding.hasDisplay()) {
			e.setEndpointIdTypCdgDsply(String.valueOf(endpointidentifiertypecoding.getDisplay()));
		}
		/******************** Endpoint_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(endpointidentifiertypecoding.hasVersion()) {
			e.setEndpointIdTypCdgVrsn(String.valueOf(endpointidentifiertypecoding.getVersion()));
		}
		/******************** Endpoint_Id_Typ_Cdg_Cd ********************************************************************************/
		if(endpointidentifiertypecoding.hasCode()) {
			e.setEndpointIdTypCdgCd(String.valueOf(endpointidentifiertypecoding.getCode()));
		}
		/******************** Endpoint_Id_Typ_Cdg_Sys ********************************************************************************/
		if(endpointidentifiertypecoding.hasSystem()) {
			e.setEndpointIdTypCdgSys(String.valueOf(endpointidentifiertypecoding.getSystem()));
		}
		/******************** Endpoint_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(endpointidentifiertypecoding.hasUserSelected()) {
			e.setEndpointIdTypCdgUsrSltd(String.valueOf(endpointidentifiertypecoding.getUserSelected()));
		}
		/******************** Endpoint_Id_Typ_Txt ********************************************************************************/
		if(endpointidentifiertype.hasText()) {
			e.setEndpointIdTypTxt(String.valueOf(endpointidentifiertype.getText()));
		}
		/******************** Endpoint_Id_Sys ********************************************************************************/
		if(endpointidentifier.hasSystem()) {
			e.setEndpointIdSys(String.valueOf(endpointidentifier.getSystem()));
		}
		/******************** Endpoint_Id_Assigner ********************************************************************************/
		if(endpointidentifier.hasAssigner()) {
			e.setEndpointIdAssigner(String.valueOf(endpointidentifier.getAssigner()));
		}
		/******************** endpointidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointidentifierperiod = endpointidentifier.getPeriod();

		/******************** Endpoint_Id_Prd_End ********************************************************************************/
		if(endpointidentifierperiod.hasEnd()) {
			e.setEndpointIdPrdEnd(String.valueOf(endpointidentifierperiod.getEnd()));
		}
		/******************** Endpoint_Id_Prd_Strt ********************************************************************************/
		if(endpointidentifierperiod.hasStart()) {
			e.setEndpointIdPrdStrt(String.valueOf(endpointidentifierperiod.getStart()));
		}
		/******************** endpointidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse endpointidentifieruse = endpointidentifier.getUse();
		e.setEndpointIdUse(endpointidentifieruse.toCode());

		return e;
	}
}
