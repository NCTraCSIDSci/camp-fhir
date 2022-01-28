package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Organizationaffiliation.
 * @see .Organizationaffiliation
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class OrganizationaffiliationConversion 
{
	public Patient Organizationaffiliations(main.templateoutput.Model.Organizationaffiliation organizationaffiliation) 
	{
			Patient  Organizationaffiliationobj = new Patient(); 

						Organizationaffiliationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(organizationaffiliation.getOrgnztnffltnDntfrDntfrSe() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcCSstm() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcCVrsn() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcCCde() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcCDsplay() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrTpCcTxt() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrPrdPrdStrt() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrPrdPrdNd() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrSsgnr() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrVlue() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, organizationaffiliation.getOrgnztnffltnDntfrDntfrSstm() /** { "tree" :"OrganizationAffiliation.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Organizationaffiliationobj.setActive(HapiFHIRHelpers.createboolean(organizationaffiliation.getOrgnztnffltnCtvBln() /** { "tree" :"OrganizationAffiliation.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Organizationaffiliationobj.setPeriod(HapiFHIRHelpers.createPeriod(organizationaffiliation.getOrgnztnffltnPrdPrdStrt() /** { "tree" :"OrganizationAffiliation.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, organizationaffiliation.getOrgnztnffltnPrdPrdNd() /** { "tree" :"OrganizationAffiliation.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Organizationaffiliationobj.setOrganization(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnRgnztnRfrnce() /** { "tree" :"OrganizationAffiliation.organization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrganization"} **/
						));
Organizationaffiliationobj.setParticipatingOrganization(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnPrtcptngrgnztnRfrnce() /** { "tree" :"OrganizationAffiliation.participatingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setParticipatingOrganization"} **/
						));
Organizationaffiliationobj.addNetwork(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnNtwrkRfrnce() /** { "tree" :"OrganizationAffiliation.network", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNetwork"} **/
						));
Organizationaffiliationobj.addCode(HapiFHIRHelpers.createCodeableConcept(organizationaffiliation.getOrgnztnffltnCdCcCdngCSstm() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setSystem"} **/
						, organizationaffiliation.getOrgnztnffltnCdCcCdngCVrsn() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setVersion"} **/
						, organizationaffiliation.getOrgnztnffltnCdCcCdngCCde() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setCode"} **/
						, organizationaffiliation.getOrgnztnffltnCdCcCdngCDsplay() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, organizationaffiliation.getOrgnztnffltnCdCcCdngCSrSlctd() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, organizationaffiliation.getOrgnztnffltnCdCcTxt() /** { "tree" :"OrganizationAffiliation.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setText"} **/
						));
Organizationaffiliationobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(organizationaffiliation.getOrgnztnffltnSpcltCcCdngCSstm() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, organizationaffiliation.getOrgnztnffltnSpcltCcCdngCVrsn() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, organizationaffiliation.getOrgnztnffltnSpcltCcCdngCCde() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, organizationaffiliation.getOrgnztnffltnSpcltCcCdngCDsplay() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, organizationaffiliation.getOrgnztnffltnSpcltCcCdngCSrSlctd() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, organizationaffiliation.getOrgnztnffltnSpcltCcTxt() /** { "tree" :"OrganizationAffiliation.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Organizationaffiliationobj.addLocation(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnLctnRfrnce() /** { "tree" :"OrganizationAffiliation.location", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation"} **/
						));
Organizationaffiliationobj.addHealthcareService(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnHlthcrSrvcRfrnce() /** { "tree" :"OrganizationAffiliation.healthcareService", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addHealthcareService"} **/
						));
Organizationaffiliationobj.addTelecom(HapiFHIRHelpers.createContactPoint(organizationaffiliation.getOrgnztnffltnTlcmCntctPntSstm() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, organizationaffiliation.getOrgnztnffltnTlcmCntctPntSe() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, organizationaffiliation.getOrgnztnffltnTlcmCntctPntPrdPrdStrt() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, organizationaffiliation.getOrgnztnffltnTlcmCntctPntPrdPrdNd() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, organizationaffiliation.getOrgnztnffltnTlcmCntctPntRnk() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, organizationaffiliation.getOrgnztnffltnTlcmCntctPntVlue() /** { "tree" :"OrganizationAffiliation.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Organizationaffiliationobj.addEndpoint(HapiFHIRHelpers.createReference(organizationaffiliation.getOrgnztnffltnNdpntRfrnce() /** { "tree" :"OrganizationAffiliation.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
		));
	}
}
