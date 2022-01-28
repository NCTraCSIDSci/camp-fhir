package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Location.
 * @see .Location
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class LocationConversion 
{
	public Patient Locations(main.templateoutput.Model.Location location) 
	{
			Patient  Locationobj = new Patient(); 

						Locationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(location.getLocationIdentifierIdentifierUse() /** { "tree" :"Location.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, location.getLctnDntfrDntfrTpCcCSstm() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, location.getLctnDntfrDntfrTpCcCVrsn() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, location.getLctnDntfrDntfrTpCcCCde() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, location.getLctnDntfrDntfrTpCcCDsplay() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, location.getLctnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, location.getLctnDntfrDntfrTpCcTxt() /** { "tree" :"Location.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, location.getLctnDntfrDntfrPrdPrdStrt() /** { "tree" :"Location.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, location.getLctnDntfrDntfrPrdPrdNd() /** { "tree" :"Location.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, location.getLctnDntfrDntfrSsgnr() /** { "tree" :"Location.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, location.getLctnDntfrDntfrVlue() /** { "tree" :"Location.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, location.getLctnDntfrDntfrSstm() /** { "tree" :"Location.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Locationobj.setStatus(HapiFHIRHelpers.createcode(location.getLocationStatusCode() /** { "tree" :"Location.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Locationobj.setOperationalStatus(HapiFHIRHelpers.createCoding(location.getLctnPrtnlSttsCSrSlctd() /** { "tree" :"Location.operationalStatus", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus, setUserSelected"} **/
						, location.getLocationOperationalStatusCCode() /** { "tree" :"Location.operationalStatus", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus, setCode"} **/
						, location.getLctnPrtnlSttsCVrsn() /** { "tree" :"Location.operationalStatus", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus, setVersion"} **/
						, location.getLctnPrtnlSttsCDsplay() /** { "tree" :"Location.operationalStatus", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus, setDisplay"} **/
						, location.getLctnPrtnlSttsCSstm() /** { "tree" :"Location.operationalStatus", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus, setSystem"} **/
						));
Locationobj.setName(HapiFHIRHelpers.createstring(location.getLocationNameString() /** { "tree" :"Location.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Locationobj.addAlias(HapiFHIRHelpers.createstring(location.getLocationAliasString() /** { "tree" :"Location.alias", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAlias"} **/
						));
Locationobj.setDescription(HapiFHIRHelpers.createstring(location.getLocationDescriptionString() /** { "tree" :"Location.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Locationobj.setMode(HapiFHIRHelpers.createcode(location.getLocationModeCode() /** { "tree" :"Location.mode", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMode"} **/
						));
Locationobj.addType(HapiFHIRHelpers.createCodeableConcept(location.getLocationTypeCcCodingCSystem() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, location.getLocationTypeCcCodingCVersion() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, location.getLocationTypeCcCodingCCode() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, location.getLocationTypeCcCodingCDisplay() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, location.getLctnTpCcCdngCSrSlctd() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, location.getLocationTypeCcText() /** { "tree" :"Location.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Locationobj.addTelecom(HapiFHIRHelpers.createContactPoint(location.getLctnTlcmCntctPntSstm() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, location.getLocationTelecomContactPointUse() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, location.getLctnTlcmCntctPntPrdPrdStrt() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, location.getLctnTlcmCntctPntPrdPrdNd() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, location.getLocationTelecomContactPointRank() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, location.getLctnTlcmCntctPntVlue() /** { "tree" :"Location.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Locationobj.setAddress(HapiFHIRHelpers.createAddress(location.getLocationAddressAddressUse() /** { "tree" :"Location.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setUse"} **/
						, location.getLocationAddressAddressType() /** { "tree" :"Location.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setType"} **/
						, location.getLctnDdrssDdrssPrdPrdStrt() /** { "tree" :"Location.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setPeriod, setStart"} **/
						, location.getLctnDdrssDdrssPrdPrdNd() /** { "tree" :"Location.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setPeriod, setEnd"} **/
						, location.getLocationAddressAddressText() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setText"} **/
						, location.getLocationAddressAddressLine() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, addLine"} **/
						, location.getLocationAddressAddressCity() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setCity"} **/
						, location.getLocationAddressAddressDistrict() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setDistrict"} **/
						, location.getLocationAddressAddressState() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setState"} **/
						, location.getLctnDdrssDdrssPstlCde() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setPostalCode"} **/
						, location.getLocationAddressAddressCountry() /** { "tree" :"Location.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAddress, setCounty"} **/
						));
Locationobj.setPhysicalType(HapiFHIRHelpers.createCodeableConcept(location.getLctnPhsclTpCcCdngCSstm() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, addCoding, setSystem"} **/
						, location.getLctnPhsclTpCcCdngCVrsn() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, addCoding, setVersion"} **/
						, location.getLctnPhsclTpCcCdngCCde() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, addCoding, setCode"} **/
						, location.getLctnPhsclTpCcCdngCDsplay() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, addCoding, setDisplay"} **/
						, location.getLctnPhsclTpCcCdngCSrSlctd() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, addCoding, setUserSelected"} **/
						, location.getLocationPhysicalTypeCcText() /** { "tree" :"Location.physicalType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalType, setText"} **/
						));
Locationobj.setLongitude(HapiFHIRHelpers.createdecimal(location.getLctnPstnLngtdDcml() /** { "tree" :"Location.position.longitude", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["setPosition"] , "methodName" : "setLongitude"} **/
						));
Locationobj.setLatitude(HapiFHIRHelpers.createdecimal(location.getLocationPositionLatitudeDecimal() /** { "tree" :"Location.position.latitude", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["setPosition"] , "methodName" : "setLatitude"} **/
						));
Locationobj.setAltitude(HapiFHIRHelpers.createdecimal(location.getLocationPositionAltitudeDecimal() /** { "tree" :"Location.position.altitude", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setPosition"] , "methodName" : "setAltitude"} **/
						));
Locationobj.setManagingOrganization(HapiFHIRHelpers.createReference(location.getLctnMngngrgnztnRfrnce() /** { "tree" :"Location.managingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingOrganization"} **/
						));
Locationobj.setPartOf(HapiFHIRHelpers.createReference(location.getLocationPartOfReference() /** { "tree" :"Location.partOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPartOf"} **/
						));
Locationobj.addDaysOfWeek(HapiFHIRHelpers.createcode(location.getLctnHrsfprtnDsfWkCde() /** { "tree" :"Location.hoursOfOperation.daysOfWeek", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addHoursOfOperation"] , "methodName" : "addDaysOfWeek"} **/
						));
Locationobj.setAllDay(HapiFHIRHelpers.createboolean(location.getLctnHrsfprtnLlDBln() /** { "tree" :"Location.hoursOfOperation.allDay", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addHoursOfOperation"] , "methodName" : "setAllDay"} **/
						));
Locationobj.setOpeningTime(HapiFHIRHelpers.createtime(location.getLctnHrsfprtnPnngTmTme() /** { "tree" :"Location.hoursOfOperation.openingTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addHoursOfOperation"] , "methodName" : "setOpeningTime"} **/
						));
Locationobj.setClosingTime(HapiFHIRHelpers.createtime(location.getLctnHrsfprtnClsngTmTme() /** { "tree" :"Location.hoursOfOperation.closingTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addHoursOfOperation"] , "methodName" : "setClosingTime"} **/
						));
Locationobj.setAvailabilityExceptions(HapiFHIRHelpers.createstring(location.getLctnVlbltxcptnsStrng() /** { "tree" :"Location.availabilityExceptions", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAvailabilityExceptions"} **/
						));
Locationobj.addEndpoint(HapiFHIRHelpers.createReference(location.getLocationEndpointReference() /** { "tree" :"Location.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
		));
	}
}
