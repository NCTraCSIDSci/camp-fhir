package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CapabilityStatement;
public class CapabilityStatementConversion 
{
	public org.hl7.fhir.r4.model.CapabilityStatement CapabilityStatements(CapabilityStatement c) throws ParseException
	{
		org.hl7.fhir.r4.model.CapabilityStatement capabilitystatement = new org.hl7.fhir.r4.model.CapabilityStatement();

		/******************** id ********************************************************************************/
		capabilitystatement.setId(c.getId());

		/******************** capabilitystatementcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail capabilitystatementcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		capabilitystatement.addContact(capabilitystatementcontact);

		/******************** CapbltyStmnt_Cntct_Nm ********************************************************************************/
		if(c.getCapbltyStmntCntctNm() != null) {
			capabilitystatementcontact.setName(c.getCapbltyStmntCntctNm());
		}
		/******************** capabilitystatementcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint capabilitystatementcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		capabilitystatementcontact.addTelecom(capabilitystatementcontacttelecom);

		/******************** capabilitystatementcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period capabilitystatementcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		capabilitystatementcontacttelecom.setPeriod(capabilitystatementcontacttelecomperiod);

		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat CapbltyStmnt_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CapbltyStmnt_Cntct_Tlcm_Prd_Enddate = CapbltyStmnt_Cntct_Tlcm_Prd_Endsdf.parse(c.getCapbltyStmntCntctTlcmPrdEnd());
			capabilitystatementcontacttelecomperiod.setEnd(CapbltyStmnt_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat CapbltyStmnt_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CapbltyStmnt_Cntct_Tlcm_Prd_Strtdate = CapbltyStmnt_Cntct_Tlcm_Prd_Strtsdf.parse(c.getCapbltyStmntCntctTlcmPrdStrt());
			capabilitystatementcontacttelecomperiod.setStart(CapbltyStmnt_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmRnk() != null) {
			capabilitystatementcontacttelecom.setRank(Integer.parseInt(c.getCapbltyStmntCntctTlcmRnk()));
		}
		/******************** capabilitystatementcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory capabilitystatementcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		capabilitystatementcontacttelecom.setSystem(capabilitystatementcontacttelecomsystem.fromCode(c.getCapbltyStmntCntctTlcmSys()));

		/******************** capabilitystatementcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory capabilitystatementcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		capabilitystatementcontacttelecom.setUse(capabilitystatementcontacttelecomuse.fromCode(c.getCapbltyStmntCntctTlcmUse()));

		/******************** CapbltyStmnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmVl() != null) {
			capabilitystatementcontacttelecom.setValue(c.getCapbltyStmntCntctTlcmVl());
		}
		/******************** CapbltyStmnt_Copyright ********************************************************************************/
		if(c.getCapbltyStmntCopyright() != null) {
			capabilitystatement.setCopyright(c.getCapbltyStmntCopyright());
		}
		/******************** CapbltyStmnt_Dt ********************************************************************************/
		if(c.getCapbltyStmntDt() != null) {
			java.text.SimpleDateFormat CapbltyStmnt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CapbltyStmnt_Dtdate = CapbltyStmnt_Dtsdf.parse(c.getCapbltyStmntDt());
			capabilitystatement.setDate(CapbltyStmnt_Dtdate);
		}
		/******************** CapbltyStmnt_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntDscrptn() != null) {
			capabilitystatement.setDescription(c.getCapbltyStmntDscrptn());
		}
		/******************** capabilitystatementdocument ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent capabilitystatementdocument =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent();
		capabilitystatement.addDocument(capabilitystatementdocument);

		/******************** CapbltyStmnt_Doc_Docation ********************************************************************************/
		if(c.getCapbltyStmntDocDocation() != null) {
			capabilitystatementdocument.setDocumentation(c.getCapbltyStmntDocDocation());
		}
		/******************** capabilitystatementdocumentmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.DocumentModeEnumFactory capabilitystatementdocumentmode =  new org.hl7.fhir.r4.model.CapabilityStatement.DocumentModeEnumFactory();
		capabilitystatementdocument.setMode(capabilitystatementdocumentmode.fromCode(c.getCapbltyStmntDocMode()));

		/******************** CapbltyStmnt_Doc_Profile ********************************************************************************/
		if(c.getCapbltyStmntDocProfile() != null) {
			capabilitystatementdocument.setProfile(c.getCapbltyStmntDocProfile());
		}
		/******************** CapbltyStmnt_Exprmtl ********************************************************************************/
		if(c.getCapbltyStmntExprmtl() != null) {
			capabilitystatement.setExperimental(Boolean.parseBoolean(c.getCapbltyStmntExprmtl()));
		}
		/******************** capabilitystatementfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory capabilitystatementfhirversion =  new org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory();
		capabilitystatement.setFhirVersion(capabilitystatementfhirversion.fromCode(c.getCapbltyStmntFhirVrsn()));

		/******************** CapbltyStmnt_Frmat ********************************************************************************/
		if(c.getCapbltyStmntFrmat() != null) {
			capabilitystatement.addFormat(c.getCapbltyStmntFrmat());
		}
		/******************** capabilitystatementimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent capabilitystatementimplementation =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent();
		capabilitystatement.setImplementation(capabilitystatementimplementation);

		/******************** CapbltyStmnt_Implementation_Custodian ********************************************************************************/
		if(c.getCapbltyStmntImplementationCustodian() != null) {
			capabilitystatementimplementation.setCustodian( new org.hl7.fhir.r4.model.Reference(c.getCapbltyStmntImplementationCustodian()));
		}
		/******************** CapbltyStmnt_Implementation_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntImplementationDscrptn() != null) {
			capabilitystatementimplementation.setDescription(c.getCapbltyStmntImplementationDscrptn());
		}
		/******************** CapbltyStmnt_Implementation_Url ********************************************************************************/
		if(c.getCapbltyStmntImplementationUrl() != null) {
			capabilitystatementimplementation.setUrl(c.getCapbltyStmntImplementationUrl());
		}
		/******************** CapbltyStmnt_ImplementationGuide ********************************************************************************/
		if(c.getCapbltyStmntImplementationGuide() != null) {
			capabilitystatement.addImplementationGuide(c.getCapbltyStmntImplementationGuide());
		}
		/******************** CapbltyStmnt_Imports ********************************************************************************/
		if(c.getCapbltyStmntImports() != null) {
			capabilitystatement.addImports(c.getCapbltyStmntImports());
		}
		/******************** CapbltyStmnt_Instantiates ********************************************************************************/
		if(c.getCapbltyStmntInstantiates() != null) {
			capabilitystatement.addInstantiates(c.getCapbltyStmntInstantiates());
		}
		/******************** capabilitystatementjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		capabilitystatement.addJurisdiction(capabilitystatementjurisdiction);

		/******************** capabilitystatementjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		capabilitystatementjurisdiction.addCoding(capabilitystatementjurisdictioncoding);

		/******************** CapbltyStmnt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgCd() != null) {
			capabilitystatementjurisdictioncoding.setCode(c.getCapbltyStmntJrsdctnCdgCd());
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgDsply() != null) {
			capabilitystatementjurisdictioncoding.setDisplay(c.getCapbltyStmntJrsdctnCdgDsply());
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgSys() != null) {
			capabilitystatementjurisdictioncoding.setSystem(c.getCapbltyStmntJrsdctnCdgSys());
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgUsrSltd() != null) {
			capabilitystatementjurisdictioncoding.setUserSelected(Boolean.parseBoolean(c.getCapbltyStmntJrsdctnCdgUsrSltd()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgVrsn() != null) {
			capabilitystatementjurisdictioncoding.setVersion(c.getCapbltyStmntJrsdctnCdgVrsn());
		}
		/******************** CapbltyStmnt_Jrsdctn_Txt ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnTxt() != null) {
			capabilitystatementjurisdiction.setText(c.getCapbltyStmntJrsdctnTxt());
		}
		/******************** capabilitystatementkind ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKindEnumFactory capabilitystatementkind =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKindEnumFactory();
		capabilitystatement.setKind(capabilitystatementkind.fromCode(c.getCapbltyStmntKind()));

		/******************** capabilitystatementmessaging ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent capabilitystatementmessaging =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent();
		capabilitystatement.addMessaging(capabilitystatementmessaging);

		/******************** CapbltyStmnt_Messaging_Docation ********************************************************************************/
		if(c.getCapbltyStmntMessagingDocation() != null) {
			capabilitystatementmessaging.setDocumentation(c.getCapbltyStmntMessagingDocation());
		}
		/******************** capabilitystatementmessagingendpoint ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent capabilitystatementmessagingendpoint =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent();
		capabilitystatementmessaging.addEndpoint(capabilitystatementmessagingendpoint);

		/******************** CapbltyStmnt_Messaging_Endpoint_Addr ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointAddr() != null) {
			capabilitystatementmessagingendpoint.setAddress(c.getCapbltyStmntMessagingEndpointAddr());
		}
		/******************** capabilitystatementmessagingendpointprotocol ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementmessagingendpointprotocol =  new org.hl7.fhir.r4.model.Coding();
		capabilitystatementmessagingendpoint.setProtocol(capabilitystatementmessagingendpointprotocol);

		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Cd ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolCd() != null) {
			capabilitystatementmessagingendpointprotocol.setCode(c.getCapbltyStmntMessagingEndpointProtocolCd());
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Dsply ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolDsply() != null) {
			capabilitystatementmessagingendpointprotocol.setDisplay(c.getCapbltyStmntMessagingEndpointProtocolDsply());
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Sys ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolSys() != null) {
			capabilitystatementmessagingendpointprotocol.setSystem(c.getCapbltyStmntMessagingEndpointProtocolSys());
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolUsrSltd() != null) {
			capabilitystatementmessagingendpointprotocol.setUserSelected(Boolean.parseBoolean(c.getCapbltyStmntMessagingEndpointProtocolUsrSltd()));
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolVrsn() != null) {
			capabilitystatementmessagingendpointprotocol.setVersion(c.getCapbltyStmntMessagingEndpointProtocolVrsn());
		}
		/******************** CapbltyStmnt_Messaging_ReliableCache ********************************************************************************/
		if(c.getCapbltyStmntMessagingReliableCache() != null) {
			capabilitystatementmessaging.setReliableCache(Integer.parseInt(c.getCapbltyStmntMessagingReliableCache()));
		}
		/******************** capabilitystatementmessagingsupportedmessage ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent capabilitystatementmessagingsupportedmessage =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent();
		capabilitystatementmessaging.addSupportedMessage(capabilitystatementmessagingsupportedmessage);

		/******************** CapbltyStmnt_Messaging_SupportedMsg_Dfn ********************************************************************************/
		if(c.getCapbltyStmntMessagingSupportedMsgDfn() != null) {
			capabilitystatementmessagingsupportedmessage.setDefinition(c.getCapbltyStmntMessagingSupportedMsgDfn());
		}
		/******************** capabilitystatementmessagingsupportedmessagemode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityModeEnumFactory capabilitystatementmessagingsupportedmessagemode =  new org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityModeEnumFactory();
		capabilitystatementmessagingsupportedmessage.setMode(capabilitystatementmessagingsupportedmessagemode.fromCode(c.getCapbltyStmntMessagingSupportedMsgMode()));

		/******************** CapbltyStmnt_Nm ********************************************************************************/
		if(c.getCapbltyStmntNm() != null) {
			capabilitystatement.setName(c.getCapbltyStmntNm());
		}
		/******************** CapbltyStmnt_PatchFrmat ********************************************************************************/
		if(c.getCapbltyStmntPatchFrmat() != null) {
			capabilitystatement.addPatchFormat(c.getCapbltyStmntPatchFrmat());
		}
		/******************** CapbltyStmnt_Pblshr ********************************************************************************/
		if(c.getCapbltyStmntPblshr() != null) {
			capabilitystatement.setPublisher(c.getCapbltyStmntPblshr());
		}
		/******************** CapbltyStmnt_Prpse ********************************************************************************/
		if(c.getCapbltyStmntPrpse() != null) {
			capabilitystatement.setPurpose(c.getCapbltyStmntPrpse());
		}
		/******************** capabilitystatementrest ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent capabilitystatementrest =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent();
		capabilitystatement.addRest(capabilitystatementrest);

		/******************** CapbltyStmnt_Rest_Cmprtmnt ********************************************************************************/
		if(c.getCapbltyStmntRestCmprtmnt() != null) {
			capabilitystatementrest.addCompartment(c.getCapbltyStmntRestCmprtmnt());
		}
		/******************** CapbltyStmnt_Rest_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestDocation() != null) {
			capabilitystatementrest.setDocumentation(c.getCapbltyStmntRestDocation());
		}
		/******************** capabilitystatementrestinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent capabilitystatementrestinteraction =  new org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent();
		capabilitystatementrest.addInteraction(capabilitystatementrestinteraction);

		/******************** capabilitystatementrestinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteractionEnumFactory capabilitystatementrestinteractioncode =  new org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteractionEnumFactory();
		capabilitystatementrestinteraction.setCode(capabilitystatementrestinteractioncode.fromCode(c.getCapbltyStmntRestInteractionCd()));

		/******************** CapbltyStmnt_Rest_Interaction_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestInteractionDocation() != null) {
			capabilitystatementrestinteraction.setDocumentation(c.getCapbltyStmntRestInteractionDocation());
		}
		/******************** capabilitystatementrestmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityModeEnumFactory capabilitystatementrestmode =  new org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityModeEnumFactory();
		capabilitystatementrest.setMode(capabilitystatementrestmode.fromCode(c.getCapbltyStmntRestMode()));

		/******************** capabilitystatementrestoperation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent capabilitystatementrestoperation =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent();
		capabilitystatementrest.addOperation(capabilitystatementrestoperation);

		/******************** CapbltyStmnt_Rest_Oprtn_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnDfn() != null) {
			capabilitystatementrestoperation.setDefinition(c.getCapbltyStmntRestOprtnDfn());
		}
		/******************** CapbltyStmnt_Rest_Oprtn_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnDocation() != null) {
			capabilitystatementrestoperation.setDocumentation(c.getCapbltyStmntRestOprtnDocation());
		}
		/******************** CapbltyStmnt_Rest_Oprtn_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnNm() != null) {
			capabilitystatementrestoperation.setName(c.getCapbltyStmntRestOprtnNm());
		}
		/******************** capabilitystatementrestresource ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent capabilitystatementrestresource =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent();
		capabilitystatementrest.addResource(capabilitystatementrestresource);

		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalCreate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalCreate() != null) {
			capabilitystatementrestresource.setConditionalCreate(Boolean.parseBoolean(c.getCapbltyStmntRestRsrcCndtnalCreate()));
		}
		/******************** capabilitystatementrestresourceconditionaldelete ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatusEnumFactory capabilitystatementrestresourceconditionaldelete =  new org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatusEnumFactory();
		capabilitystatementrestresource.setConditionalDelete(capabilitystatementrestresourceconditionaldelete.fromCode(c.getCapbltyStmntRestRsrcCndtnalDelete()));

		/******************** capabilitystatementrestresourceconditionalread ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatusEnumFactory capabilitystatementrestresourceconditionalread =  new org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatusEnumFactory();
		capabilitystatementrestresource.setConditionalRead(capabilitystatementrestresourceconditionalread.fromCode(c.getCapbltyStmntRestRsrcCndtnalRead()));

		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalUpdate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalUpdate() != null) {
			capabilitystatementrestresource.setConditionalUpdate(Boolean.parseBoolean(c.getCapbltyStmntRestRsrcCndtnalUpdate()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcDocation() != null) {
			capabilitystatementrestresource.setDocumentation(c.getCapbltyStmntRestRsrcDocation());
		}
		/******************** capabilitystatementrestresourceinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent capabilitystatementrestresourceinteraction =  new org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent();
		capabilitystatementrestresource.addInteraction(capabilitystatementrestresourceinteraction);

		/******************** capabilitystatementrestresourceinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteractionEnumFactory capabilitystatementrestresourceinteractioncode =  new org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteractionEnumFactory();
		capabilitystatementrestresourceinteraction.setCode(capabilitystatementrestresourceinteractioncode.fromCode(c.getCapbltyStmntRestRsrcInteractionCd()));

		/******************** CapbltyStmnt_Rest_Rsrc_Interaction_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcInteractionDocation() != null) {
			capabilitystatementrestresourceinteraction.setDocumentation(c.getCapbltyStmntRestRsrcInteractionDocation());
		}
		/******************** capabilitystatementrestresourceoperation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent capabilitystatementrestresourceoperation =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent();
		capabilitystatementrestresource.addOperation(capabilitystatementrestresourceoperation);

		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnDfn() != null) {
			capabilitystatementrestresourceoperation.setDefinition(c.getCapbltyStmntRestRsrcOprtnDfn());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnDocation() != null) {
			capabilitystatementrestresourceoperation.setDocumentation(c.getCapbltyStmntRestRsrcOprtnDocation());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnNm() != null) {
			capabilitystatementrestresourceoperation.setName(c.getCapbltyStmntRestRsrcOprtnNm());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Profile ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcProfile() != null) {
			capabilitystatementrestresource.setProfile(c.getCapbltyStmntRestRsrcProfile());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_ReadHis ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcReadHis() != null) {
			capabilitystatementrestresource.setReadHistory(Boolean.parseBoolean(c.getCapbltyStmntRestRsrcReadHis()));
		}
		/******************** capabilitystatementrestresourcereferencepolicy ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicyEnumFactory capabilitystatementrestresourcereferencepolicy =  new org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicyEnumFactory();
		capabilitystatementrestresource.addReferencePolicy(capabilitystatementrestresourcereferencepolicy.fromCode(c.getCapbltyStmntRestRsrcRfrncPolicy()));

		/******************** CapbltyStmnt_Rest_Rsrc_SrchInclude ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchInclude() != null) {
			capabilitystatementrestresource.addSearchInclude(c.getCapbltyStmntRestRsrcSrchInclude());
		}
		/******************** capabilitystatementrestresourcesearchparam ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent capabilitystatementrestresourcesearchparam =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent();
		capabilitystatementrestresource.addSearchParam(capabilitystatementrestresourcesearchparam);

		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamDfn() != null) {
			capabilitystatementrestresourcesearchparam.setDefinition(c.getCapbltyStmntRestRsrcSrchParamDfn());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamDocation() != null) {
			capabilitystatementrestresourcesearchparam.setDocumentation(c.getCapbltyStmntRestRsrcSrchParamDocation());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamNm() != null) {
			capabilitystatementrestresourcesearchparam.setName(c.getCapbltyStmntRestRsrcSrchParamNm());
		}
		/******************** capabilitystatementrestresourcesearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory capabilitystatementrestresourcesearchparamtype =  new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory();
		capabilitystatementrestresourcesearchparam.setType(capabilitystatementrestresourcesearchparamtype.fromCode(c.getCapbltyStmntRestRsrcSrchParamTyp()));

		/******************** CapbltyStmnt_Rest_Rsrc_SrchRevInclude ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchRevInclude() != null) {
			capabilitystatementrestresource.addSearchRevInclude(c.getCapbltyStmntRestRsrcSrchRevInclude());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_SupportedProfile ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSupportedProfile() != null) {
			capabilitystatementrestresource.addSupportedProfile(c.getCapbltyStmntRestRsrcSupportedProfile());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Typ ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcTyp() != null) {
			capabilitystatementrestresource.setType(c.getCapbltyStmntRestRsrcTyp());
		}
		/******************** CapbltyStmnt_Rest_Rsrc_UpdateCreate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcUpdateCreate() != null) {
			capabilitystatementrestresource.setUpdateCreate(Boolean.parseBoolean(c.getCapbltyStmntRestRsrcUpdateCreate()));
		}
		/******************** capabilitystatementrestresourceversioning ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicyEnumFactory capabilitystatementrestresourceversioning =  new org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicyEnumFactory();
		capabilitystatementrestresource.setVersioning(capabilitystatementrestresourceversioning.fromCode(c.getCapbltyStmntRestRsrcVrsning()));

		/******************** capabilitystatementrestsearchparam ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent capabilitystatementrestsearchparam =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent();
		capabilitystatementrest.addSearchParam(capabilitystatementrestsearchparam);

		/******************** CapbltyStmnt_Rest_SrchParam_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamDfn() != null) {
			capabilitystatementrestsearchparam.setDefinition(c.getCapbltyStmntRestSrchParamDfn());
		}
		/******************** CapbltyStmnt_Rest_SrchParam_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamDocation() != null) {
			capabilitystatementrestsearchparam.setDocumentation(c.getCapbltyStmntRestSrchParamDocation());
		}
		/******************** CapbltyStmnt_Rest_SrchParam_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamNm() != null) {
			capabilitystatementrestsearchparam.setName(c.getCapbltyStmntRestSrchParamNm());
		}
		/******************** capabilitystatementrestsearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory capabilitystatementrestsearchparamtype =  new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory();
		capabilitystatementrestsearchparam.setType(capabilitystatementrestsearchparamtype.fromCode(c.getCapbltyStmntRestSrchParamTyp()));

		/******************** capabilitystatementrestsecurity ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent capabilitystatementrestsecurity =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent();
		capabilitystatementrest.setSecurity(capabilitystatementrestsecurity);

		/******************** CapbltyStmnt_Rest_Security_Cors ********************************************************************************/
		if(c.getCapbltyStmntRestSecurityCors() != null) {
			capabilitystatementrestsecurity.setCors(Boolean.parseBoolean(c.getCapbltyStmntRestSecurityCors()));
		}
		/******************** CapbltyStmnt_Rest_Security_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntRestSecurityDscrptn() != null) {
			capabilitystatementrestsecurity.setDescription(c.getCapbltyStmntRestSecurityDscrptn());
		}
		/******************** capabilitystatementrestsecurityservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementrestsecurityservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		capabilitystatementrestsecurity.addService(capabilitystatementrestsecurityservice);

		/******************** capabilitystatementrestsecurityservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementrestsecurityservicecoding =  new org.hl7.fhir.r4.model.Coding();
		capabilitystatementrestsecurityservice.addCoding(capabilitystatementrestsecurityservicecoding);

		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgCd() != null) {
			capabilitystatementrestsecurityservicecoding.setCode(c.getCapbltyStmntRestSecuritySrvCdgCd());
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgDsply() != null) {
			capabilitystatementrestsecurityservicecoding.setDisplay(c.getCapbltyStmntRestSecuritySrvCdgDsply());
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgSys() != null) {
			capabilitystatementrestsecurityservicecoding.setSystem(c.getCapbltyStmntRestSecuritySrvCdgSys());
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgUsrSltd() != null) {
			capabilitystatementrestsecurityservicecoding.setUserSelected(Boolean.parseBoolean(c.getCapbltyStmntRestSecuritySrvCdgUsrSltd()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgVrsn() != null) {
			capabilitystatementrestsecurityservicecoding.setVersion(c.getCapbltyStmntRestSecuritySrvCdgVrsn());
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Txt ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvTxt() != null) {
			capabilitystatementrestsecurityservice.setText(c.getCapbltyStmntRestSecuritySrvTxt());
		}
		/******************** capabilitystatementsoftware ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent capabilitystatementsoftware =  new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent();
		capabilitystatement.setSoftware(capabilitystatementsoftware);

		/******************** CapbltyStmnt_Software_Nm ********************************************************************************/
		if(c.getCapbltyStmntSoftwareNm() != null) {
			capabilitystatementsoftware.setName(c.getCapbltyStmntSoftwareNm());
		}
		/******************** CapbltyStmnt_Software_ReleaseDt ********************************************************************************/
		if(c.getCapbltyStmntSoftwareReleaseDt() != null) {
			java.text.SimpleDateFormat CapbltyStmnt_Software_ReleaseDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CapbltyStmnt_Software_ReleaseDtdate = CapbltyStmnt_Software_ReleaseDtsdf.parse(c.getCapbltyStmntSoftwareReleaseDt());
			capabilitystatementsoftware.setReleaseDate(CapbltyStmnt_Software_ReleaseDtdate);
		}
		/******************** CapbltyStmnt_Software_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntSoftwareVrsn() != null) {
			capabilitystatementsoftware.setVersion(c.getCapbltyStmntSoftwareVrsn());
		}
		/******************** capabilitystatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory capabilitystatementstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		capabilitystatement.setStatus(capabilitystatementstatus.fromCode(c.getCapbltyStmntSts()));

		/******************** CapbltyStmnt_Ttl ********************************************************************************/
		if(c.getCapbltyStmntTtl() != null) {
			capabilitystatement.setTitle(c.getCapbltyStmntTtl());
		}
		/******************** CapbltyStmnt_Url ********************************************************************************/
		if(c.getCapbltyStmntUrl() != null) {
			capabilitystatement.setUrl(c.getCapbltyStmntUrl());
		}
		/******************** capabilitystatementusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext capabilitystatementusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		capabilitystatement.addUseContext(capabilitystatementusecontext);

		/******************** capabilitystatementusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		capabilitystatementusecontext.setCode(capabilitystatementusecontextcode);

		/******************** CapbltyStmnt_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdCd() != null) {
			capabilitystatementusecontextcode.setCode(c.getCapbltyStmntUseCntxtCdCd());
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdDsply() != null) {
			capabilitystatementusecontextcode.setDisplay(c.getCapbltyStmntUseCntxtCdDsply());
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdSys() != null) {
			capabilitystatementusecontextcode.setSystem(c.getCapbltyStmntUseCntxtCdSys());
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdUsrSltd() != null) {
			capabilitystatementusecontextcode.setUserSelected(Boolean.parseBoolean(c.getCapbltyStmntUseCntxtCdUsrSltd()));
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdVrsn() != null) {
			capabilitystatementusecontextcode.setVersion(c.getCapbltyStmntUseCntxtCdVrsn());
		}
		/******************** capabilitystatementusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		capabilitystatementusecontext.setValue(capabilitystatementusecontextvaluecodeableconcept);

		/******************** capabilitystatementusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		capabilitystatementusecontextvaluecodeableconcept.addCoding(capabilitystatementusecontextvaluecodeableconceptcoding);

		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgCd() != null) {
			capabilitystatementusecontextvaluecodeableconceptcoding.setCode(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgDsply() != null) {
			capabilitystatementusecontextvaluecodeableconceptcoding.setDisplay(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgSys() != null) {
			capabilitystatementusecontextvaluecodeableconceptcoding.setSystem(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			capabilitystatementusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn() != null) {
			capabilitystatementusecontextvaluecodeableconceptcoding.setVersion(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptTxt() != null) {
			capabilitystatementusecontextvaluecodeableconcept.setText(c.getCapbltyStmntUseCntxtVlCdbleCncptTxt());
		}
		/******************** capabilitystatementusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		capabilitystatementusecontext.setValue(capabilitystatementusecontextvaluequantity);

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyCd() != null) {
			capabilitystatementusecontextvaluequantity.setCode(c.getCapbltyStmntUseCntxtVlQntyCd());
		}
		/******************** capabilitystatementusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory capabilitystatementusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		capabilitystatementusecontextvaluequantity.setComparator(capabilitystatementusecontextvaluequantitycomparator.fromCode(c.getCapbltyStmntUseCntxtVlQntyCmprtr()));

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntySys() != null) {
			capabilitystatementusecontextvaluequantity.setSystem(c.getCapbltyStmntUseCntxtVlQntySys());
		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyUnt() != null) {
			capabilitystatementusecontextvaluequantity.setUnit(c.getCapbltyStmntUseCntxtVlQntyUnt());
		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyVl() != null) {
			capabilitystatementusecontextvaluequantity.setValue(Double.parseDouble((c.getCapbltyStmntUseCntxtVlQntyVl())));
		}
		/******************** capabilitystatementusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range capabilitystatementusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		capabilitystatementusecontext.setValue(capabilitystatementusecontextvaluerange);

		/******************** capabilitystatementusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		capabilitystatementusecontextvaluerange.setHigh(capabilitystatementusecontextvaluerangehigh);

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiCd() != null) {
			capabilitystatementusecontextvaluerangehigh.setCode(c.getCapbltyStmntUseCntxtVlRngHiCd());
		}
		/******************** capabilitystatementusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory capabilitystatementusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		capabilitystatementusecontextvaluerangehigh.setComparator(capabilitystatementusecontextvaluerangehighcomparator.fromCode(c.getCapbltyStmntUseCntxtVlRngHiCmprtr()));

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiSys() != null) {
			capabilitystatementusecontextvaluerangehigh.setSystem(c.getCapbltyStmntUseCntxtVlRngHiSys());
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiUnt() != null) {
			capabilitystatementusecontextvaluerangehigh.setUnit(c.getCapbltyStmntUseCntxtVlRngHiUnt());
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiVl() != null) {
			capabilitystatementusecontextvaluerangehigh.setValue(Double.parseDouble((c.getCapbltyStmntUseCntxtVlRngHiVl())));
		}
		/******************** capabilitystatementusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		capabilitystatementusecontextvaluerange.setLow(capabilitystatementusecontextvaluerangelow);

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwCd() != null) {
			capabilitystatementusecontextvaluerangelow.setCode(c.getCapbltyStmntUseCntxtVlRngLwCd());
		}
		/******************** capabilitystatementusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory capabilitystatementusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		capabilitystatementusecontextvaluerangelow.setComparator(capabilitystatementusecontextvaluerangelowcomparator.fromCode(c.getCapbltyStmntUseCntxtVlRngLwCmprtr()));

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwSys() != null) {
			capabilitystatementusecontextvaluerangelow.setSystem(c.getCapbltyStmntUseCntxtVlRngLwSys());
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwUnt() != null) {
			capabilitystatementusecontextvaluerangelow.setUnit(c.getCapbltyStmntUseCntxtVlRngLwUnt());
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwVl() != null) {
			capabilitystatementusecontextvaluerangelow.setValue(Double.parseDouble((c.getCapbltyStmntUseCntxtVlRngLwVl())));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRfrnc() != null) {
			capabilitystatementusecontext.setValue( new org.hl7.fhir.r4.model.Reference(c.getCapbltyStmntUseCntxtVlRfrnc()));
		}
		/******************** CapbltyStmnt_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntVrsn() != null) {
			capabilitystatement.setVersion(c.getCapbltyStmntVrsn());
		}
		return capabilitystatement;
	}
}
