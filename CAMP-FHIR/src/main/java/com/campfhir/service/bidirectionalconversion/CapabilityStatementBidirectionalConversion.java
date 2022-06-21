package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CapabilityStatement;
public class CapabilityStatementBidirectionalConversion 
{
	public CapabilityStatement CapabilityStatements(org.hl7.fhir.r4.model.CapabilityStatement capabilitystatement) throws ParseException
	{
		 main.java.com.campfhir.model.CapabilityStatement c = new  main.java.com.campfhir.model.CapabilityStatement();

		/******************** id ********************************************************************************/
		capabilitystatement.setId(c.getId());

		/******************** CapbltyStmnt_Nm ********************************************************************************/
		if(capabilitystatement.hasName()) {
			c.setCapbltyStmntNm(String.valueOf(capabilitystatement.getName()));
		}
		/******************** CapbltyStmnt_Vrsn ********************************************************************************/
		if(capabilitystatement.hasVersion()) {
			c.setCapbltyStmntVrsn(String.valueOf(capabilitystatement.getVersion()));
		}
		/******************** CapbltyStmnt_Dt ********************************************************************************/
		if(capabilitystatement.hasDate()) {
			c.setCapbltyStmntDt(String.valueOf(capabilitystatement.getDate()));
		}
		/******************** CapbltyStmnt_Url ********************************************************************************/
		if(capabilitystatement.hasUrl()) {
			c.setCapbltyStmntUrl(String.valueOf(capabilitystatement.getUrl()));
		}
		/******************** capabilitystatementjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementjurisdiction = capabilitystatement.getJurisdictionFirstRep();

		/******************** capabilitystatementjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementjurisdictioncoding = capabilitystatementjurisdiction.getCodingFirstRep();

		/******************** CapbltyStmnt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementjurisdictioncoding.hasDisplay()) {
			c.setCapbltyStmntJrsdctnCdgDsply(String.valueOf(capabilitystatementjurisdictioncoding.getDisplay()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementjurisdictioncoding.hasVersion()) {
			c.setCapbltyStmntJrsdctnCdgVrsn(String.valueOf(capabilitystatementjurisdictioncoding.getVersion()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(capabilitystatementjurisdictioncoding.hasCode()) {
			c.setCapbltyStmntJrsdctnCdgCd(String.valueOf(capabilitystatementjurisdictioncoding.getCode()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(capabilitystatementjurisdictioncoding.hasSystem()) {
			c.setCapbltyStmntJrsdctnCdgSys(String.valueOf(capabilitystatementjurisdictioncoding.getSystem()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementjurisdictioncoding.hasUserSelected()) {
			c.setCapbltyStmntJrsdctnCdgUsrSltd(String.valueOf(capabilitystatementjurisdictioncoding.getUserSelected()));
		}
		/******************** CapbltyStmnt_Jrsdctn_Txt ********************************************************************************/
		if(capabilitystatementjurisdiction.hasText()) {
			c.setCapbltyStmntJrsdctnTxt(String.valueOf(capabilitystatementjurisdiction.getText()));
		}
		/******************** capabilitystatementusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext capabilitystatementusecontext = capabilitystatement.getUseContextFirstRep();

		/******************** capabilitystatementusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementusecontextcode = capabilitystatementusecontext.getCode();

		/******************** CapbltyStmnt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(capabilitystatementusecontextcode.hasDisplay()) {
			c.setCapbltyStmntUseCntxtCdDsply(String.valueOf(capabilitystatementusecontextcode.getDisplay()));
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(capabilitystatementusecontextcode.hasVersion()) {
			c.setCapbltyStmntUseCntxtCdVrsn(String.valueOf(capabilitystatementusecontextcode.getVersion()));
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Sys ********************************************************************************/
		if(capabilitystatementusecontextcode.hasSystem()) {
			c.setCapbltyStmntUseCntxtCdSys(String.valueOf(capabilitystatementusecontextcode.getSystem()));
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(capabilitystatementusecontextcode.hasUserSelected()) {
			c.setCapbltyStmntUseCntxtCdUsrSltd(String.valueOf(capabilitystatementusecontextcode.getUserSelected()));
		}
		/******************** capabilitystatementusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementusecontextvaluecodeableconcept = capabilitystatementusecontext.getValueCodeableConcept();

		/******************** capabilitystatementusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementusecontextvaluecodeableconceptcoding = capabilitystatementusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasDisplay()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptCdgDsply(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasVersion()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasCode()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptCdgCd(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasSystem()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptCdgSys(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconcept.hasText()) {
			c.setCapbltyStmntUseCntxtVlCdbleCncptTxt(String.valueOf(capabilitystatementusecontextvaluecodeableconcept.getText()));
		}
		/******************** capabilitystatementusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluequantity = capabilitystatementusecontext.getValueQuantity();

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(capabilitystatementusecontextvaluequantity.hasValue()) {
			c.setCapbltyStmntUseCntxtVlQntyVl(String.valueOf(capabilitystatementusecontextvaluequantity.getValue()));
		}
		/******************** capabilitystatementusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluequantitycomparator = capabilitystatementusecontextvaluequantity.getComparator();
		c.setCapbltyStmntUseCntxtVlQntyCmprtr(capabilitystatementusecontextvaluequantitycomparator.toCode());

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(capabilitystatementusecontextvaluequantity.hasCode()) {
			c.setCapbltyStmntUseCntxtVlQntyCd(String.valueOf(capabilitystatementusecontextvaluequantity.getCode()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(capabilitystatementusecontextvaluequantity.hasSystem()) {
			c.setCapbltyStmntUseCntxtVlQntySys(String.valueOf(capabilitystatementusecontextvaluequantity.getSystem()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(capabilitystatementusecontextvaluequantity.hasUnit()) {
			c.setCapbltyStmntUseCntxtVlQntyUnt(String.valueOf(capabilitystatementusecontextvaluequantity.getUnit()));
		}
		/******************** capabilitystatementusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range capabilitystatementusecontextvaluerange = capabilitystatementusecontext.getValueRange();

		/******************** capabilitystatementusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangelow = capabilitystatementusecontextvaluerange.getLow();

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(capabilitystatementusecontextvaluerangelow.hasValue()) {
			c.setCapbltyStmntUseCntxtVlRngLwVl(String.valueOf(capabilitystatementusecontextvaluerangelow.getValue()));
		}
		/******************** capabilitystatementusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluerangelowcomparator = capabilitystatementusecontextvaluerangelow.getComparator();
		c.setCapbltyStmntUseCntxtVlRngLwCmprtr(capabilitystatementusecontextvaluerangelowcomparator.toCode());

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(capabilitystatementusecontextvaluerangelow.hasCode()) {
			c.setCapbltyStmntUseCntxtVlRngLwCd(String.valueOf(capabilitystatementusecontextvaluerangelow.getCode()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(capabilitystatementusecontextvaluerangelow.hasSystem()) {
			c.setCapbltyStmntUseCntxtVlRngLwSys(String.valueOf(capabilitystatementusecontextvaluerangelow.getSystem()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(capabilitystatementusecontextvaluerangelow.hasUnit()) {
			c.setCapbltyStmntUseCntxtVlRngLwUnt(String.valueOf(capabilitystatementusecontextvaluerangelow.getUnit()));
		}
		/******************** capabilitystatementusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangehigh = capabilitystatementusecontextvaluerange.getHigh();

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(capabilitystatementusecontextvaluerangehigh.hasValue()) {
			c.setCapbltyStmntUseCntxtVlRngHiVl(String.valueOf(capabilitystatementusecontextvaluerangehigh.getValue()));
		}
		/******************** capabilitystatementusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluerangehighcomparator = capabilitystatementusecontextvaluerangehigh.getComparator();
		c.setCapbltyStmntUseCntxtVlRngHiCmprtr(capabilitystatementusecontextvaluerangehighcomparator.toCode());

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(capabilitystatementusecontextvaluerangehigh.hasCode()) {
			c.setCapbltyStmntUseCntxtVlRngHiCd(String.valueOf(capabilitystatementusecontextvaluerangehigh.getCode()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(capabilitystatementusecontextvaluerangehigh.hasSystem()) {
			c.setCapbltyStmntUseCntxtVlRngHiSys(String.valueOf(capabilitystatementusecontextvaluerangehigh.getSystem()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(capabilitystatementusecontextvaluerangehigh.hasUnit()) {
			c.setCapbltyStmntUseCntxtVlRngHiUnt(String.valueOf(capabilitystatementusecontextvaluerangehigh.getUnit()));
		}
		/******************** CapbltyStmnt_UseCntxt_VlRfrnc ********************************************************************************/
		if(capabilitystatementusecontext.hasValueReference()) {
			c.setCapbltyStmntUseCntxtVlRfrnc(String.valueOf(capabilitystatementusecontext.getValueReference()));
		}
		/******************** capabilitystatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus capabilitystatementstatus = capabilitystatement.getStatus();
		c.setCapbltyStmntSts(capabilitystatementstatus.toCode());

		/******************** CapbltyStmnt_Dscrptn ********************************************************************************/
		if(capabilitystatement.hasDescription()) {
			c.setCapbltyStmntDscrptn(String.valueOf(capabilitystatement.getDescription()));
		}
		/******************** capabilitystatementcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail capabilitystatementcontact = capabilitystatement.getContactFirstRep();

		/******************** CapbltyStmnt_Cntct_Nm ********************************************************************************/
		if(capabilitystatementcontact.hasName()) {
			c.setCapbltyStmntCntctNm(String.valueOf(capabilitystatementcontact.getName()));
		}
		/******************** capabilitystatementcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint capabilitystatementcontacttelecom = capabilitystatementcontact.getTelecomFirstRep();

		/******************** CapbltyStmnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(capabilitystatementcontacttelecom.hasValue()) {
			c.setCapbltyStmntCntctTlcmVl(String.valueOf(capabilitystatementcontacttelecom.getValue()));
		}
		/******************** capabilitystatementcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem capabilitystatementcontacttelecomsystem = capabilitystatementcontacttelecom.getSystem();
		c.setCapbltyStmntCntctTlcmSys(capabilitystatementcontacttelecomsystem.toCode());

		/******************** capabilitystatementcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period capabilitystatementcontacttelecomperiod = capabilitystatementcontacttelecom.getPeriod();

		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(capabilitystatementcontacttelecomperiod.hasEnd()) {
			c.setCapbltyStmntCntctTlcmPrdEnd(String.valueOf(capabilitystatementcontacttelecomperiod.getEnd()));
		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(capabilitystatementcontacttelecomperiod.hasStart()) {
			c.setCapbltyStmntCntctTlcmPrdStrt(String.valueOf(capabilitystatementcontacttelecomperiod.getStart()));
		}
		/******************** capabilitystatementcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse capabilitystatementcontacttelecomuse = capabilitystatementcontacttelecom.getUse();
		c.setCapbltyStmntCntctTlcmUse(capabilitystatementcontacttelecomuse.toCode());

		/******************** CapbltyStmnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(capabilitystatementcontacttelecom.hasRank()) {
			c.setCapbltyStmntCntctTlcmRnk(String.valueOf(capabilitystatementcontacttelecom.getRank()));
		}
		/******************** capabilitystatementdocument ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent capabilitystatementdocument = capabilitystatement.getDocumentFirstRep();

		/******************** CapbltyStmnt_Doc_Profile ********************************************************************************/
		if(capabilitystatementdocument.hasProfile()) {
			c.setCapbltyStmntDocProfile(String.valueOf(capabilitystatementdocument.getProfile()));
		}
		/******************** capabilitystatementdocumentmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode capabilitystatementdocumentmode = capabilitystatementdocument.getMode();
		c.setCapbltyStmntDocMode(capabilitystatementdocumentmode.toCode());

		/******************** capabilitystatementmessaging ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent capabilitystatementmessaging = capabilitystatement.getMessagingFirstRep();

		/******************** capabilitystatementmessagingendpoint ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent capabilitystatementmessagingendpoint = capabilitystatementmessaging.getEndpointFirstRep();

		/******************** CapbltyStmnt_Messaging_Endpoint_Addr ********************************************************************************/
		if(capabilitystatementmessagingendpoint.hasAddress()) {
			c.setCapbltyStmntMessagingEndpointAddr(String.valueOf(capabilitystatementmessagingendpoint.getAddress()));
		}
		/******************** capabilitystatementmessagingendpointprotocol ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementmessagingendpointprotocol = capabilitystatementmessagingendpoint.getProtocol();

		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Dsply ********************************************************************************/
		if(capabilitystatementmessagingendpointprotocol.hasDisplay()) {
			c.setCapbltyStmntMessagingEndpointProtocolDsply(String.valueOf(capabilitystatementmessagingendpointprotocol.getDisplay()));
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Vrsn ********************************************************************************/
		if(capabilitystatementmessagingendpointprotocol.hasVersion()) {
			c.setCapbltyStmntMessagingEndpointProtocolVrsn(String.valueOf(capabilitystatementmessagingendpointprotocol.getVersion()));
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Cd ********************************************************************************/
		if(capabilitystatementmessagingendpointprotocol.hasCode()) {
			c.setCapbltyStmntMessagingEndpointProtocolCd(String.valueOf(capabilitystatementmessagingendpointprotocol.getCode()));
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Sys ********************************************************************************/
		if(capabilitystatementmessagingendpointprotocol.hasSystem()) {
			c.setCapbltyStmntMessagingEndpointProtocolSys(String.valueOf(capabilitystatementmessagingendpointprotocol.getSystem()));
		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_UsrSltd ********************************************************************************/
		if(capabilitystatementmessagingendpointprotocol.hasUserSelected()) {
			c.setCapbltyStmntMessagingEndpointProtocolUsrSltd(String.valueOf(capabilitystatementmessagingendpointprotocol.getUserSelected()));
		}
		/******************** CapbltyStmnt_Messaging_ReliableCache ********************************************************************************/
		if(capabilitystatementmessaging.hasReliableCache()) {
			c.setCapbltyStmntMessagingReliableCache(String.valueOf(capabilitystatementmessaging.getReliableCache()));
		}
		/******************** capabilitystatementmessagingsupportedmessage ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent capabilitystatementmessagingsupportedmessage = capabilitystatementmessaging.getSupportedMessageFirstRep();

		/******************** CapbltyStmnt_Messaging_SupportedMsg_Dfn ********************************************************************************/
		if(capabilitystatementmessagingsupportedmessage.hasDefinition()) {
			c.setCapbltyStmntMessagingSupportedMsgDfn(String.valueOf(capabilitystatementmessagingsupportedmessage.getDefinition()));
		}
		/******************** capabilitystatementmessagingsupportedmessagemode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode capabilitystatementmessagingsupportedmessagemode = capabilitystatementmessagingsupportedmessage.getMode();
		c.setCapbltyStmntMessagingSupportedMsgMode(capabilitystatementmessagingsupportedmessagemode.toCode());

		/******************** CapbltyStmnt_Messaging_Docation ********************************************************************************/
		if(capabilitystatementmessaging.hasDocumentation()) {
			c.setCapbltyStmntMessagingDocation(String.valueOf(capabilitystatementmessaging.getDocumentation()));
		}
		/******************** CapbltyStmnt_Ttl ********************************************************************************/
		if(capabilitystatement.hasTitle()) {
			c.setCapbltyStmntTtl(String.valueOf(capabilitystatement.getTitle()));
		}
		/******************** CapbltyStmnt_Exprmtl ********************************************************************************/
		if(capabilitystatement.hasExperimental()) {
			c.setCapbltyStmntExprmtl(String.valueOf(capabilitystatement.getExperimental()));
		}
		/******************** CapbltyStmnt_Pblshr ********************************************************************************/
		if(capabilitystatement.hasPublisher()) {
			c.setCapbltyStmntPblshr(String.valueOf(capabilitystatement.getPublisher()));
		}
		/******************** CapbltyStmnt_Prpse ********************************************************************************/
		if(capabilitystatement.hasPurpose()) {
			c.setCapbltyStmntPrpse(String.valueOf(capabilitystatement.getPurpose()));
		}
		/******************** CapbltyStmnt_Copyright ********************************************************************************/
		if(capabilitystatement.hasCopyright()) {
			c.setCapbltyStmntCopyright(String.valueOf(capabilitystatement.getCopyright()));
		}
		/******************** capabilitystatementkind ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind capabilitystatementkind = capabilitystatement.getKind();
		c.setCapbltyStmntKind(capabilitystatementkind.toCode());

		/******************** capabilitystatementsoftware ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent capabilitystatementsoftware = capabilitystatement.getSoftware();

		/******************** CapbltyStmnt_Software_Nm ********************************************************************************/
		if(capabilitystatementsoftware.hasName()) {
			c.setCapbltyStmntSoftwareNm(String.valueOf(capabilitystatementsoftware.getName()));
		}
		/******************** CapbltyStmnt_Software_ReleaseDt ********************************************************************************/
		if(capabilitystatementsoftware.hasReleaseDate()) {
			c.setCapbltyStmntSoftwareReleaseDt(String.valueOf(capabilitystatementsoftware.getReleaseDate()));
		}
		/******************** capabilitystatementimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent capabilitystatementimplementation = capabilitystatement.getImplementation();

		/******************** CapbltyStmnt_Implementation_Url ********************************************************************************/
		if(capabilitystatementimplementation.hasUrl()) {
			c.setCapbltyStmntImplementationUrl(String.valueOf(capabilitystatementimplementation.getUrl()));
		}
		/******************** CapbltyStmnt_Implementation_Dscrptn ********************************************************************************/
		if(capabilitystatementimplementation.hasDescription()) {
			c.setCapbltyStmntImplementationDscrptn(String.valueOf(capabilitystatementimplementation.getDescription()));
		}
		/******************** CapbltyStmnt_Implementation_Custodian ********************************************************************************/
		if(capabilitystatementimplementation.hasCustodian()) {
			c.setCapbltyStmntImplementationCustodian(String.valueOf(capabilitystatementimplementation.getCustodian()));
		}
		/******************** capabilitystatementfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersion capabilitystatementfhirversion = capabilitystatement.getFhirVersion();
		c.setCapbltyStmntFhirVrsn(capabilitystatementfhirversion.toCode());

		/******************** capabilitystatementrest ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent capabilitystatementrest = capabilitystatement.getRestFirstRep();

		/******************** capabilitystatementrestsecurity ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent capabilitystatementrestsecurity = capabilitystatementrest.getSecurity();

		/******************** CapbltyStmnt_Rest_Security_Dscrptn ********************************************************************************/
		if(capabilitystatementrestsecurity.hasDescription()) {
			c.setCapbltyStmntRestSecurityDscrptn(String.valueOf(capabilitystatementrestsecurity.getDescription()));
		}
		/******************** CapbltyStmnt_Rest_Security_Cors ********************************************************************************/
		if(capabilitystatementrestsecurity.hasCors()) {
			c.setCapbltyStmntRestSecurityCors(String.valueOf(capabilitystatementrestsecurity.getCors()));
		}
		/******************** capabilitystatementrestsecurityservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementrestsecurityservice = capabilitystatementrestsecurity.getServiceFirstRep();

		/******************** capabilitystatementrestsecurityservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementrestsecurityservicecoding = capabilitystatementrestsecurityservice.getCodingFirstRep();

		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementrestsecurityservicecoding.hasDisplay()) {
			c.setCapbltyStmntRestSecuritySrvCdgDsply(String.valueOf(capabilitystatementrestsecurityservicecoding.getDisplay()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementrestsecurityservicecoding.hasVersion()) {
			c.setCapbltyStmntRestSecuritySrvCdgVrsn(String.valueOf(capabilitystatementrestsecurityservicecoding.getVersion()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Cd ********************************************************************************/
		if(capabilitystatementrestsecurityservicecoding.hasCode()) {
			c.setCapbltyStmntRestSecuritySrvCdgCd(String.valueOf(capabilitystatementrestsecurityservicecoding.getCode()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Sys ********************************************************************************/
		if(capabilitystatementrestsecurityservicecoding.hasSystem()) {
			c.setCapbltyStmntRestSecuritySrvCdgSys(String.valueOf(capabilitystatementrestsecurityservicecoding.getSystem()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementrestsecurityservicecoding.hasUserSelected()) {
			c.setCapbltyStmntRestSecuritySrvCdgUsrSltd(String.valueOf(capabilitystatementrestsecurityservicecoding.getUserSelected()));
		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Txt ********************************************************************************/
		if(capabilitystatementrestsecurityservice.hasText()) {
			c.setCapbltyStmntRestSecuritySrvTxt(String.valueOf(capabilitystatementrestsecurityservice.getText()));
		}
		/******************** capabilitystatementrestresource ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent capabilitystatementrestresource = capabilitystatementrest.getResourceFirstRep();

		/******************** CapbltyStmnt_Rest_Rsrc_Typ ********************************************************************************/
		if(capabilitystatementrestresource.hasType()) {
			c.setCapbltyStmntRestRsrcTyp(String.valueOf(capabilitystatementrestresource.getType()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Profile ********************************************************************************/
		if(capabilitystatementrestresource.hasProfile()) {
			c.setCapbltyStmntRestRsrcProfile(String.valueOf(capabilitystatementrestresource.getProfile()));
		}
		/******************** capabilitystatementrestresourceversioning ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy capabilitystatementrestresourceversioning = capabilitystatementrestresource.getVersioning();
		c.setCapbltyStmntRestRsrcVrsning(capabilitystatementrestresourceversioning.toCode());

		/******************** CapbltyStmnt_Rest_Rsrc_UpdateCreate ********************************************************************************/
		if(capabilitystatementrestresource.hasUpdateCreate()) {
			c.setCapbltyStmntRestRsrcUpdateCreate(String.valueOf(capabilitystatementrestresource.getUpdateCreate()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_ReadHis ********************************************************************************/
		if(capabilitystatementrestresource.hasReadHistory()) {
			c.setCapbltyStmntRestRsrcReadHis(String.valueOf(capabilitystatementrestresource.getReadHistory()));
		}
		/******************** capabilitystatementrestresourceconditionalread ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus capabilitystatementrestresourceconditionalread = capabilitystatementrestresource.getConditionalRead();
		c.setCapbltyStmntRestRsrcCndtnalRead(capabilitystatementrestresourceconditionalread.toCode());

		/******************** capabilitystatementrestresourceinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent capabilitystatementrestresourceinteraction = capabilitystatementrestresource.getInteractionFirstRep();

		/******************** capabilitystatementrestresourceinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction capabilitystatementrestresourceinteractioncode = capabilitystatementrestresourceinteraction.getCode();
		c.setCapbltyStmntRestRsrcInteractionCd(capabilitystatementrestresourceinteractioncode.toCode());

		/******************** CapbltyStmnt_Rest_Rsrc_Interaction_Docation ********************************************************************************/
		if(capabilitystatementrestresourceinteraction.hasDocumentation()) {
			c.setCapbltyStmntRestRsrcInteractionDocation(String.valueOf(capabilitystatementrestresourceinteraction.getDocumentation()));
		}
		/******************** capabilitystatementrestresourceoperation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent capabilitystatementrestresourceoperation = capabilitystatementrestresource.getOperationFirstRep();

		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Nm ********************************************************************************/
		if(capabilitystatementrestresourceoperation.hasName()) {
			c.setCapbltyStmntRestRsrcOprtnNm(String.valueOf(capabilitystatementrestresourceoperation.getName()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Dfn ********************************************************************************/
		if(capabilitystatementrestresourceoperation.hasDefinition()) {
			c.setCapbltyStmntRestRsrcOprtnDfn(String.valueOf(capabilitystatementrestresourceoperation.getDefinition()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Docation ********************************************************************************/
		if(capabilitystatementrestresourceoperation.hasDocumentation()) {
			c.setCapbltyStmntRestRsrcOprtnDocation(String.valueOf(capabilitystatementrestresourceoperation.getDocumentation()));
		}
		/******************** capabilitystatementrestresourcesearchparam ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent capabilitystatementrestresourcesearchparam = capabilitystatementrestresource.getSearchParamFirstRep();

		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Nm ********************************************************************************/
		if(capabilitystatementrestresourcesearchparam.hasName()) {
			c.setCapbltyStmntRestRsrcSrchParamNm(String.valueOf(capabilitystatementrestresourcesearchparam.getName()));
		}
		/******************** capabilitystatementrestresourcesearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType capabilitystatementrestresourcesearchparamtype = capabilitystatementrestresourcesearchparam.getType();
		c.setCapbltyStmntRestRsrcSrchParamTyp(capabilitystatementrestresourcesearchparamtype.toCode());

		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Dfn ********************************************************************************/
		if(capabilitystatementrestresourcesearchparam.hasDefinition()) {
			c.setCapbltyStmntRestRsrcSrchParamDfn(String.valueOf(capabilitystatementrestresourcesearchparam.getDefinition()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Docation ********************************************************************************/
		if(capabilitystatementrestresourcesearchparam.hasDocumentation()) {
			c.setCapbltyStmntRestRsrcSrchParamDocation(String.valueOf(capabilitystatementrestresourcesearchparam.getDocumentation()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_Docation ********************************************************************************/
		if(capabilitystatementrestresource.hasDocumentation()) {
			c.setCapbltyStmntRestRsrcDocation(String.valueOf(capabilitystatementrestresource.getDocumentation()));
		}
		/******************** capabilitystatementrestresourceconditionaldelete ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus capabilitystatementrestresourceconditionaldelete = capabilitystatementrestresource.getConditionalDelete();
		c.setCapbltyStmntRestRsrcCndtnalDelete(capabilitystatementrestresourceconditionaldelete.toCode());

		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalCreate ********************************************************************************/
		if(capabilitystatementrestresource.hasConditionalCreate()) {
			c.setCapbltyStmntRestRsrcCndtnalCreate(String.valueOf(capabilitystatementrestresource.getConditionalCreate()));
		}
		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalUpdate ********************************************************************************/
		if(capabilitystatementrestresource.hasConditionalUpdate()) {
			c.setCapbltyStmntRestRsrcCndtnalUpdate(String.valueOf(capabilitystatementrestresource.getConditionalUpdate()));
		}
		/******************** capabilitystatementrestinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent capabilitystatementrestinteraction = capabilitystatementrest.getInteractionFirstRep();

		/******************** capabilitystatementrestinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction capabilitystatementrestinteractioncode = capabilitystatementrestinteraction.getCode();
		c.setCapbltyStmntRestInteractionCd(capabilitystatementrestinteractioncode.toCode());

		/******************** CapbltyStmnt_Rest_Interaction_Docation ********************************************************************************/
		if(capabilitystatementrestinteraction.hasDocumentation()) {
			c.setCapbltyStmntRestInteractionDocation(String.valueOf(capabilitystatementrestinteraction.getDocumentation()));
		}
		/******************** capabilitystatementrestoperation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent capabilitystatementrestoperation = capabilitystatementrest.getOperationFirstRep();

		/******************** CapbltyStmnt_Rest_Oprtn_Nm ********************************************************************************/
		if(capabilitystatementrestoperation.hasName()) {
			c.setCapbltyStmntRestOprtnNm(String.valueOf(capabilitystatementrestoperation.getName()));
		}
		/******************** CapbltyStmnt_Rest_Oprtn_Dfn ********************************************************************************/
		if(capabilitystatementrestoperation.hasDefinition()) {
			c.setCapbltyStmntRestOprtnDfn(String.valueOf(capabilitystatementrestoperation.getDefinition()));
		}
		/******************** CapbltyStmnt_Rest_Oprtn_Docation ********************************************************************************/
		if(capabilitystatementrestoperation.hasDocumentation()) {
			c.setCapbltyStmntRestOprtnDocation(String.valueOf(capabilitystatementrestoperation.getDocumentation()));
		}
		/******************** capabilitystatementrestsearchparam ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent capabilitystatementrestsearchparam = capabilitystatementrest.getSearchParamFirstRep();

		/******************** CapbltyStmnt_Rest_SrchParam_Nm ********************************************************************************/
		if(capabilitystatementrestsearchparam.hasName()) {
			c.setCapbltyStmntRestSrchParamNm(String.valueOf(capabilitystatementrestsearchparam.getName()));
		}
		/******************** capabilitystatementrestsearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType capabilitystatementrestsearchparamtype = capabilitystatementrestsearchparam.getType();
		c.setCapbltyStmntRestSrchParamTyp(capabilitystatementrestsearchparamtype.toCode());

		/******************** CapbltyStmnt_Rest_SrchParam_Dfn ********************************************************************************/
		if(capabilitystatementrestsearchparam.hasDefinition()) {
			c.setCapbltyStmntRestSrchParamDfn(String.valueOf(capabilitystatementrestsearchparam.getDefinition()));
		}
		/******************** CapbltyStmnt_Rest_SrchParam_Docation ********************************************************************************/
		if(capabilitystatementrestsearchparam.hasDocumentation()) {
			c.setCapbltyStmntRestSrchParamDocation(String.valueOf(capabilitystatementrestsearchparam.getDocumentation()));
		}
		/******************** capabilitystatementrestmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode capabilitystatementrestmode = capabilitystatementrest.getMode();
		c.setCapbltyStmntRestMode(capabilitystatementrestmode.toCode());

		/******************** CapbltyStmnt_Rest_Docation ********************************************************************************/
		if(capabilitystatementrest.hasDocumentation()) {
			c.setCapbltyStmntRestDocation(String.valueOf(capabilitystatementrest.getDocumentation()));
		}
		return c;
	}
}
