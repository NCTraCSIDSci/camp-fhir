package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Coverageeligibilityrequest.
 * @see .Coverageeligibilityrequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CoverageeligibilityrequestConversion 
{
	public Patient Coverageeligibilityrequests(main.templateoutput.Model.Coverageeligibilityrequest coverageeligibilityrequest) 
	{
			Patient  Coverageeligibilityrequestobj = new Patient(); 

						Coverageeligibilityrequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(coverageeligibilityrequest.getCerIdentifierIdentifierUse() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcCSstm() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcCVrsn() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcCCde() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcCDsplay() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrTpCcTxt() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrPrdPrdStrt() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, coverageeligibilityrequest.getCrDntfrDntfrPrdPrdNd() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, coverageeligibilityrequest.getCerIdentifierIdentifierAssigner() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, coverageeligibilityrequest.getCerIdentifierIdentifierValue() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, coverageeligibilityrequest.getCerIdentifierIdentifierSystem() /** { "tree" :"CoverageEligibilityRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Coverageeligibilityrequestobj.setStatus(HapiFHIRHelpers.createcode(coverageeligibilityrequest.getCerStatusCode() /** { "tree" :"CoverageEligibilityRequest.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Coverageeligibilityrequestobj.setPriority(HapiFHIRHelpers.createCodeableConcept(coverageeligibilityrequest.getCerPriorityCcCodingCSystem() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCerPriorityCcCodingCVersion() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCerPriorityCcCodingCCode() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCerPriorityCcCodingCDisplay() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrPrrtCcCdngCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCerPriorityCcText() /** { "tree" :"CoverageEligibilityRequest.priority", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, setText"} **/
						));
Coverageeligibilityrequestobj.setPurpose(HapiFHIRHelpers.createcode(coverageeligibilityrequest.getCerPurposeCode() /** { "tree" :"CoverageEligibilityRequest.purpose", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Coverageeligibilityrequestobj.setPatient(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerPntReference() /** { "tree" :"CoverageEligibilityRequest.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Coverageeligibilityrequestobj.setServicedDate(HapiFHIRHelpers.createdate(coverageeligibilityrequest.getCerServicedDateDate() /** { "tree" :"CoverageEligibilityRequest.servicedDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServicedDate"} **/
						));
Coverageeligibilityrequestobj.setServicedPeriod(HapiFHIRHelpers.createPeriod(coverageeligibilityrequest.getCerServicedPeriodPeriodStart() /** { "tree" :"CoverageEligibilityRequest.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServicedPeriod, setStart"} **/
						, coverageeligibilityrequest.getCerServicedPeriodPeriodEnd() /** { "tree" :"CoverageEligibilityRequest.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServicedPeriod, setEnd"} **/
						));
Coverageeligibilityrequestobj.setCreated(HapiFHIRHelpers.createdateTime(coverageeligibilityrequest.getCerCreatedDateTime() /** { "tree" :"CoverageEligibilityRequest.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Coverageeligibilityrequestobj.setEnterer(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerEntererReference() /** { "tree" :"CoverageEligibilityRequest.enterer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnterer"} **/
						));
Coverageeligibilityrequestobj.setProvider(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerProviderReference() /** { "tree" :"CoverageEligibilityRequest.provider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProvider"} **/
						));
Coverageeligibilityrequestobj.setInsurer(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerInsurerReference() /** { "tree" :"CoverageEligibilityRequest.insurer", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setInsurer"} **/
						));
Coverageeligibilityrequestobj.setFacility(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerFacilityReference() /** { "tree" :"CoverageEligibilityRequest.facility", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFacility"} **/
						));
Coverageeligibilityrequestobj.setSequence(HapiFHIRHelpers.createpositiveInt(coverageeligibilityrequest.getCrSpprtngnfSqncPstvnt() /** { "tree" :"CoverageEligibilityRequest.supportingInfo.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setSequence"} **/
						));
Coverageeligibilityrequestobj.setInformation(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCrSpprtngnfNfrmtnRfrnce() /** { "tree" :"CoverageEligibilityRequest.supportingInfo.information", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setInformation"} **/
						));
Coverageeligibilityrequestobj.setAppliesToAll(HapiFHIRHelpers.createboolean(coverageeligibilityrequest.getCrSpprtngnfPplsTllBln() /** { "tree" :"CoverageEligibilityRequest.supportingInfo.appliesToAll", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setAppliesToAll"} **/
						));
Coverageeligibilityrequestobj.setFocal(HapiFHIRHelpers.createboolean(coverageeligibilityrequest.getCerInsuranceFocalBoolean() /** { "tree" :"CoverageEligibilityRequest.insurance.focal", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setFocal"} **/
						));
Coverageeligibilityrequestobj.setCoverage(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerInsuranceCoverageReference() /** { "tree" :"CoverageEligibilityRequest.insurance.coverage", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setCoverage"} **/
						));
Coverageeligibilityrequestobj.setBusinessArrangement(HapiFHIRHelpers.createstring(coverageeligibilityrequest.getCrNsrncBsnssrrngmntStrng() /** { "tree" :"CoverageEligibilityRequest.insurance.businessArrangement", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setBusinessArrangement"} **/
						));
Coverageeligibilityrequestobj.addSupportingInfoSequence(HapiFHIRHelpers.createpositiveInt(coverageeligibilityrequest.getCrTmSpprtngnfSqncPstvnt() /** { "tree" :"CoverageEligibilityRequest.item.supportingInfoSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSupportingInfoSequence"} **/
						));
Coverageeligibilityrequestobj.setCategory(HapiFHIRHelpers.createCodeableConcept(coverageeligibilityrequest.getCrTmCtgrCcCdngCSstm() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCrTmCtgrCcCdngCVrsn() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCerItemCategoryCcCodingCCode() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCrTmCtgrCcCdngCDsplay() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrTmCtgrCcCdngCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCerItemCategoryCcText() /** { "tree" :"CoverageEligibilityRequest.item.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, setText"} **/
						));
Coverageeligibilityrequestobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(coverageeligibilityrequest.getCrTmPrdctrSrvcCcCdngCSstm() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCrTmPrdctrSrvcCcCdngCVrsn() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCrTmPrdctrSrvcCcCdngCCde() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCrTmPrdctrSrvcCcCdngCDsplay() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrTmPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCerItemProductOrServiceCcText() /** { "tree" :"CoverageEligibilityRequest.item.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, setText"} **/
						));
Coverageeligibilityrequestobj.addModifier(HapiFHIRHelpers.createCodeableConcept(coverageeligibilityrequest.getCrTmMdfrCcCdngCSstm() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCrTmMdfrCcCdngCVrsn() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCerItemModifierCcCodingCCode() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCrTmMdfrCcCdngCDsplay() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrTmMdfrCcCdngCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCerItemModifierCcText() /** { "tree" :"CoverageEligibilityRequest.item.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, setText"} **/
						));
Coverageeligibilityrequestobj.setProvider(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerItemProviderReference() /** { "tree" :"CoverageEligibilityRequest.item.provider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setProvider"} **/
						));
Coverageeligibilityrequestobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(coverageeligibilityrequest.getCerItemQuantitySimpleQuantity() /** { "tree" :"CoverageEligibilityRequest.item.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setQuantity"} **/
						));
Coverageeligibilityrequestobj.setUnitPrice(HapiFHIRHelpers.createMoney(coverageeligibilityrequest.getCerItemUnitPriceMoneyCurrency() /** { "tree" :"CoverageEligibilityRequest.item.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, coverageeligibilityrequest.getCerItemUnitPriceMoneyValue() /** { "tree" :"CoverageEligibilityRequest.item.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Coverageeligibilityrequestobj.setFacility(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerItemFacilityReference() /** { "tree" :"CoverageEligibilityRequest.item.facility", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setFacility"} **/
						));
Coverageeligibilityrequestobj.setDiagnosisCodeableconcept(HapiFHIRHelpers.createCodeableConcept(coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcCdngCSstm() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setSystem"} **/
						, coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcCdngCVrsn() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setVersion"} **/
						, coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcCdngCCde() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setCode"} **/
						, coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcCdngCDsplay() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setDisplay"} **/
						, coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcCdngCSrSlctd() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setUserSelected"} **/
						, coverageeligibilityrequest.getCrTmDgnssDgnssCdblcncptCcTxt() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, setText"} **/
						));
Coverageeligibilityrequestobj.setDiagnosisReference(condition)(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCrTmDgnssDgnssRfrncRfrnce() /** { "tree" :"CoverageEligibilityRequest.item.diagnosis.diagnosisReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "setDiagnosisReference(condition)"} **/
						));
Coverageeligibilityrequestobj.addDetail(HapiFHIRHelpers.createReference(coverageeligibilityrequest.getCerItemDetailReference() /** { "tree" :"CoverageEligibilityRequest.item.detail", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addItem", "addDiagnosis"] , "methodName" : "addDetail"} **/
		));
	}
}
