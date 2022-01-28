package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Namingsystem.
 * @see .Namingsystem
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class NamingsystemConversion 
{
	public Patient Namingsystems(main.templateoutput.Model.Namingsystem namingsystem) 
	{
			Patient  Namingsystemobj = new Patient(); 

						Namingsystemobj.setName(HapiFHIRHelpers.createstring(namingsystem.getNamingSystemNameString() /** { "tree" :"NamingSystem.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Namingsystemobj.setStatus(HapiFHIRHelpers.createcode(namingsystem.getNamingSystemStatusCode() /** { "tree" :"NamingSystem.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Namingsystemobj.setKind(HapiFHIRHelpers.createcode(namingsystem.getNamingSystemKindCode() /** { "tree" :"NamingSystem.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setKind"} **/
						));
Namingsystemobj.setDate(HapiFHIRHelpers.createdateTime(namingsystem.getNamingSystemDateDateTime() /** { "tree" :"NamingSystem.date", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Namingsystemobj.setPublisher(HapiFHIRHelpers.createstring(namingsystem.getNamingSystemPublisherString() /** { "tree" :"NamingSystem.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Namingsystemobj.addContact(HapiFHIRHelpers.createContactDetail(namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, namingsystem.getNmngSstmCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, namingsystem.getNmngSstmCntctCntctDtlNme() /** { "tree" :"NamingSystem.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Namingsystemobj.setResponsible(HapiFHIRHelpers.createstring(namingsystem.getNamingSystemResponsibleString() /** { "tree" :"NamingSystem.responsible", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setResponsible"} **/
						));
Namingsystemobj.setType(HapiFHIRHelpers.createCodeableConcept(namingsystem.getNmngSstmTpCcCdngCSstm() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, namingsystem.getNmngSstmTpCcCdngCVrsn() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, namingsystem.getNamingSystemTypeCcCodingCCode() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, namingsystem.getNmngSstmTpCcCdngCDsplay() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, namingsystem.getNmngSstmTpCcCdngCSrSlctd() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, namingsystem.getNamingSystemTypeCcText() /** { "tree" :"NamingSystem.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Namingsystemobj.setDescription(HapiFHIRHelpers.createmarkdown(namingsystem.getNamingSystemDescriptionMarkdown() /** { "tree" :"NamingSystem.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Namingsystemobj.addUseContext(HapiFHIRHelpers.createUsageContext(namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtCdCSstm() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtCdCVrsn() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtCdCCde() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtCdCDsplay() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlRngRngLw() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, namingsystem.getNmngSstmSCntxtSgCntxtVlRfrnce() /** { "tree" :"NamingSystem.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Namingsystemobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(namingsystem.getNmngSstmJrsdctnCcCdngCSstm() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, namingsystem.getNmngSstmJrsdctnCcCdngCVrsn() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, namingsystem.getNmngSstmJrsdctnCcCdngCCde() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, namingsystem.getNmngSstmJrsdctnCcCdngCDsplay() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, namingsystem.getNmngSstmJrsdctnCcCdngCSrSlctd() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, namingsystem.getNamingSystemJurisdictionCcText() /** { "tree" :"NamingSystem.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Namingsystemobj.setUsage(HapiFHIRHelpers.createstring(namingsystem.getNamingSystemUsageString() /** { "tree" :"NamingSystem.usage", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUsage"} **/
						));
Namingsystemobj.setType(HapiFHIRHelpers.createcode(namingsystem.getNamingSystemUniqueIdTypeCode() /** { "tree" :"NamingSystem.uniqueId.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setUniqueId"] , "methodName" : "setType"} **/
						));
Namingsystemobj.setValue(HapiFHIRHelpers.createstring(namingsystem.getNamingSystemUniqueIdValueString() /** { "tree" :"NamingSystem.uniqueId.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setUniqueId"] , "methodName" : "setValue"} **/
						));
Namingsystemobj.setPreferred(HapiFHIRHelpers.createboolean(namingsystem.getNmngSstmNqdPrfrrdBln() /** { "tree" :"NamingSystem.uniqueId.preferred", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setUniqueId"] , "methodName" : "setPreferred"} **/
						));
Namingsystemobj.setComment(HapiFHIRHelpers.createstring(namingsystem.getNmngSstmNqdCmmntStrng() /** { "tree" :"NamingSystem.uniqueId.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setUniqueId"] , "methodName" : "setComment"} **/
						));
Namingsystemobj.setPeriod(HapiFHIRHelpers.createPeriod(namingsystem.getNmngSstmNqdPrdPrdStrt() /** { "tree" :"NamingSystem.uniqueId.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setUniqueId"] , "methodName" : "setPeriod, setStart"} **/
						, namingsystem.getNmngSstmNqdPrdPrdNd() /** { "tree" :"NamingSystem.uniqueId.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setUniqueId"] , "methodName" : "setPeriod, setEnd"} **/
		));
	}
}
