package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Account.
 * @see .Account
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AccountConversion 
{
	public Patient Accounts(main.templateoutput.Model.Account account) 
	{
			Patient  Accountobj = new Patient(); 

						Accountobj.addIdentifier(HapiFHIRHelpers.createIdentifier(account.getAccountIdentifierIdentifierUse() /** { "tree" :"Account.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, account.getAccntDntfrDntfrTpCcCSstm() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, account.getAccntDntfrDntfrTpCcCVrsn() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, account.getAccntDntfrDntfrTpCcCCde() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, account.getAccntDntfrDntfrTpCcCDsplay() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, account.getAccntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, account.getAccntDntfrDntfrTpCcTxt() /** { "tree" :"Account.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, account.getAccntDntfrDntfrPrdPrdStrt() /** { "tree" :"Account.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, account.getAccntDntfrDntfrPrdPrdNd() /** { "tree" :"Account.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, account.getAccntDntfrDntfrSsgnr() /** { "tree" :"Account.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, account.getAccntDntfrDntfrVlue() /** { "tree" :"Account.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, account.getAccntDntfrDntfrSstm() /** { "tree" :"Account.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Accountobj.setStatus(HapiFHIRHelpers.createcode(account.getAccountStatusCode() /** { "tree" :"Account.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Accountobj.setType(HapiFHIRHelpers.createCodeableConcept(account.getAccountTypeCcCodingCSystem() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, account.getAccountTypeCcCodingCVersion() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, account.getAccountTypeCcCodingCCode() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, account.getAccountTypeCcCodingCDisplay() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, account.getAccntTpCcCdngCSrSlctd() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, account.getAccountTypeCcText() /** { "tree" :"Account.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Accountobj.setName(HapiFHIRHelpers.createstring(account.getAccountNameString() /** { "tree" :"Account.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Accountobj.addSubject(HapiFHIRHelpers.createReference(account.getAccountSubjectReference() /** { "tree" :"Account.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Accountobj.setServicePeriod(HapiFHIRHelpers.createPeriod(account.getAccountServicePeriodPeriodStart() /** { "tree" :"Account.servicePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServicePeriod, setStart"} **/
						, account.getAccountServicePeriodPeriodEnd() /** { "tree" :"Account.servicePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServicePeriod, setEnd"} **/
						));
Accountobj.setCoverage(HapiFHIRHelpers.createReference(account.getAccntCvrgCvrgRfrnce() /** { "tree" :"Account.coverage.coverage", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addCoverage"] , "methodName" : "setCoverage"} **/
						));
Accountobj.setPriority(HapiFHIRHelpers.createpositiveInt(account.getAccntCvrgPrrtPstvnt() /** { "tree" :"Account.coverage.priority", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addCoverage"] , "methodName" : "setPriority"} **/
						));
Accountobj.setOwner(HapiFHIRHelpers.createReference(account.getAccountOwnerReference() /** { "tree" :"Account.owner", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOwner"} **/
						));
Accountobj.setDescription(HapiFHIRHelpers.createstring(account.getAccountDescriptionString() /** { "tree" :"Account.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Accountobj.setParty(HapiFHIRHelpers.createReference(account.getAccountGuarantorPartyReference() /** { "tree" :"Account.guarantor.party", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addGuarantor"] , "methodName" : "setParty"} **/
						));
Accountobj.setOnHold(HapiFHIRHelpers.createboolean(account.getAccountGuarantorOnHoldBoolean() /** { "tree" :"Account.guarantor.onHold", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addGuarantor"] , "methodName" : "setOnHold"} **/
						));
Accountobj.setPeriod(HapiFHIRHelpers.createPeriod(account.getAccntGrntrPrdPrdStrt() /** { "tree" :"Account.guarantor.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addGuarantor"] , "methodName" : "setPeriod, setStart"} **/
						, account.getAccntGrntrPrdPrdNd() /** { "tree" :"Account.guarantor.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addGuarantor"] , "methodName" : "setPeriod, setEnd"} **/
						));
Accountobj.setPartOf(HapiFHIRHelpers.createReference(account.getAccountPartOfReference() /** { "tree" :"Account.partOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPartOf"} **/
		));
	}
}
