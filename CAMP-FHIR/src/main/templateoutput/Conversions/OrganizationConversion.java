package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Organization.
 * @see .Organization
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class OrganizationConversion 
{
	public Patient Organizations(main.templateoutput.Model.Organization organization) 
	{
			Patient  Organizationobj = new Patient(); 

						Organizationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(organization.getOrgnztnDntfrDntfrSe() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, organization.getOrgnztnDntfrDntfrTpCcCSstm() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, organization.getOrgnztnDntfrDntfrTpCcCVrsn() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, organization.getOrgnztnDntfrDntfrTpCcCCde() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, organization.getOrgnztnDntfrDntfrTpCcCDsplay() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, organization.getOrgnztnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, organization.getOrgnztnDntfrDntfrTpCcTxt() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, organization.getOrgnztnDntfrDntfrPrdPrdStrt() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, organization.getOrgnztnDntfrDntfrPrdPrdNd() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, organization.getOrgnztnDntfrDntfrSsgnr() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, organization.getOrgnztnDntfrDntfrVlue() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, organization.getOrgnztnDntfrDntfrSstm() /** { "tree" :"Organization.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Organizationobj.setActive(HapiFHIRHelpers.createboolean(organization.getOrganizationActiveBoolean() /** { "tree" :"Organization.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Organizationobj.addType(HapiFHIRHelpers.createCodeableConcept(organization.getOrgnztnTpCcCdngCSstm() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, organization.getOrgnztnTpCcCdngCVrsn() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, organization.getOrganizationTypeCcCodingCCode() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, organization.getOrgnztnTpCcCdngCDsplay() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, organization.getOrgnztnTpCcCdngCSrSlctd() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, organization.getOrganizationTypeCcText() /** { "tree" :"Organization.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Organizationobj.setName(HapiFHIRHelpers.createstring(organization.getOrganizationNameString() /** { "tree" :"Organization.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Organizationobj.addAlias(HapiFHIRHelpers.createstring(organization.getOrganizationAliasString() /** { "tree" :"Organization.alias", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAlias"} **/
						));
Organizationobj.addTelecom(HapiFHIRHelpers.createContactPoint(organization.getOrgnztnTlcmCntctPntSstm() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, organization.getOrgnztnTlcmCntctPntSe() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, organization.getOrgnztnTlcmCntctPntPrdPrdStrt() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, organization.getOrgnztnTlcmCntctPntPrdPrdNd() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, organization.getOrgnztnTlcmCntctPntRnk() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, organization.getOrgnztnTlcmCntctPntVlue() /** { "tree" :"Organization.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Organizationobj.addAddress(HapiFHIRHelpers.createAddress(organization.getOrganizationAddressAddressUse() /** { "tree" :"Organization.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setUse"} **/
						, organization.getOrganizationAddressAddressType() /** { "tree" :"Organization.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setType"} **/
						, organization.getOrgnztnDdrssDdrssPrdPrdStrt() /** { "tree" :"Organization.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setStart"} **/
						, organization.getOrgnztnDdrssDdrssPrdPrdNd() /** { "tree" :"Organization.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setEnd"} **/
						, organization.getOrganizationAddressAddressText() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setText"} **/
						, organization.getOrganizationAddressAddressLine() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, addLine"} **/
						, organization.getOrganizationAddressAddressCity() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCity"} **/
						, organization.getOrgnztnDdrssDdrssDstrct() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setDistrict"} **/
						, organization.getOrganizationAddressAddressState() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setState"} **/
						, organization.getOrgnztnDdrssDdrssPstlCde() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPostalCode"} **/
						, organization.getOrgnztnDdrssDdrssCntry() /** { "tree" :"Organization.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCounty"} **/
						));
Organizationobj.setPartOf(HapiFHIRHelpers.createReference(organization.getOrganizationPartOfReference() /** { "tree" :"Organization.partOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPartOf"} **/
						));
Organizationobj.setPurpose(HapiFHIRHelpers.createCodeableConcept(organization.getOrgnztnCntctPrpsCcCdngCSstm() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, addCoding, setSystem"} **/
						, organization.getOrgnztnCntctPrpsCcCdngCVrsn() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, addCoding, setVersion"} **/
						, organization.getOrgnztnCntctPrpsCcCdngCCde() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, addCoding, setCode"} **/
						, organization.getOrgnztnCntctPrpsCcCdngCDsplay() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, addCoding, setDisplay"} **/
						, organization.getOrgnztnCntctPrpsCcCdngCSrSlctd() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, addCoding, setUserSelected"} **/
						, organization.getOrgnztnCntctPrpsCcTxt() /** { "tree" :"Organization.contact.purpose", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPurpose, setText"} **/
						));
Organizationobj.setName(HapiFHIRHelpers.createHumanName(organization.getOrgnztnCntctNmHmnNmSe() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setUse"} **/
						, organization.getOrgnztnCntctNmHmnNmPrdPrdStrt() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setPeriod, setStart"} **/
						, organization.getOrgnztnCntctNmHmnNmPrdPrdNd() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setPeriod, setEnd"} **/
						, organization.getOrgnztnCntctNmHmnNmTxt() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setText"} **/
						, organization.getOrgnztnCntctNmHmnNmFmly() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setFamily"} **/
						, organization.getOrgnztnCntctNmHmnNmGvn() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addGiven"} **/
						, organization.getOrgnztnCntctNmHmnNmPrfx() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addPrefix"} **/
						, organization.getOrgnztnCntctNmHmnNmSffx() /** { "tree" :"Organization.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addSuffix"} **/
						));
Organizationobj.addTelecom(HapiFHIRHelpers.createContactPoint(organization.getOrgnztnCntctTlcmCntctPntSstm() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setSystem"} **/
						, organization.getOrgnztnCntctTlcmCntctPntSe() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setUse"} **/
						, organization.getOrgnztnCntctTlcmCntctPntPrdPrdStrt() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, organization.getOrgnztnCntctTlcmCntctPntPrdPrdNd() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, organization.getOrgnztnCntctTlcmCntctPntRnk() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setRank"} **/
						, organization.getOrgnztnCntctTlcmCntctPntVlue() /** { "tree" :"Organization.contact.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setValue"} **/
						));
Organizationobj.setAddress(HapiFHIRHelpers.createAddress(organization.getOrgnztnCntctDdrssDdrssSe() /** { "tree" :"Organization.contact.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setUse"} **/
						, organization.getOrgnztnCntctDdrssDdrssTpe() /** { "tree" :"Organization.contact.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setType"} **/
						, organization.getOrgnztnCntctDdrssDdrssPrdPrdStrt() /** { "tree" :"Organization.contact.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPeriod, setStart"} **/
						, organization.getOrgnztnCntctDdrssDdrssPrdPrdNd() /** { "tree" :"Organization.contact.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPeriod, setEnd"} **/
						, organization.getOrgnztnCntctDdrssDdrssTxt() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setText"} **/
						, organization.getOrgnztnCntctDdrssDdrssLne() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, addLine"} **/
						, organization.getOrgnztnCntctDdrssDdrssCty() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setCity"} **/
						, organization.getOrgnztnCntctDdrssDdrssDstrct() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setDistrict"} **/
						, organization.getOrgnztnCntctDdrssDdrssStte() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setState"} **/
						, organization.getOrgnztnCntctDdrssDdrssPstlCde() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPostalCode"} **/
						, organization.getOrgnztnCntctDdrssDdrssCntry() /** { "tree" :"Organization.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setCounty"} **/
						));
Organizationobj.addEndpoint(HapiFHIRHelpers.createReference(organization.getOrganizationEndpointReference() /** { "tree" :"Organization.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
		));
	}
}
