package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Coverage.
 * @see .Coverage
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CoverageConversion 
{
	public Patient Coverages(main.templateoutput.Model.Coverage coverage) 
	{
			Patient  Coverageobj = new Patient(); 

						Coverageobj.addIdentifier(HapiFHIRHelpers.createIdentifier(coverage.getCoverageIdentifierIdentifierUse() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, coverage.getCvrgDntfrDntfrTpCcCSstm() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, coverage.getCvrgDntfrDntfrTpCcCVrsn() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, coverage.getCvrgDntfrDntfrTpCcCCde() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, coverage.getCvrgDntfrDntfrTpCcCDsplay() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, coverage.getCvrgDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, coverage.getCvrgDntfrDntfrTpCcTxt() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, coverage.getCvrgDntfrDntfrPrdPrdStrt() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, coverage.getCvrgDntfrDntfrPrdPrdNd() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, coverage.getCvrgDntfrDntfrSsgnr() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, coverage.getCvrgDntfrDntfrVlue() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, coverage.getCvrgDntfrDntfrSstm() /** { "tree" :"Coverage.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Coverageobj.setStatus(HapiFHIRHelpers.createcode(coverage.getCoverageStatusCode() /** { "tree" :"Coverage.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Coverageobj.setType(HapiFHIRHelpers.createCodeableConcept(coverage.getCoverageTypeCcCodingCSystem() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, coverage.getCoverageTypeCcCodingCVersion() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, coverage.getCoverageTypeCcCodingCCode() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, coverage.getCoverageTypeCcCodingCDisplay() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, coverage.getCvrgTpCcCdngCSrSlctd() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, coverage.getCoverageTypeCcText() /** { "tree" :"Coverage.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Coverageobj.setPolicyHolder(HapiFHIRHelpers.createReference(coverage.getCoveragePolicyHolderReference() /** { "tree" :"Coverage.policyHolder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyHolder"} **/
						));
Coverageobj.setSubscriber(HapiFHIRHelpers.createReference(coverage.getCoverageSubscriberReference() /** { "tree" :"Coverage.subscriber", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubscriber"} **/
						));
Coverageobj.setSubscriberId(HapiFHIRHelpers.createstring(coverage.getCoverageSubscriberIdString() /** { "tree" :"Coverage.subscriberId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubscriberId"} **/
						));
Coverageobj.setBeneficiary(HapiFHIRHelpers.createReference(coverage.getCoverageBeneficiaryReference() /** { "tree" :"Coverage.beneficiary", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setBeneficiary"} **/
						));
Coverageobj.setDependent(HapiFHIRHelpers.createstring(coverage.getCoverageDependentString() /** { "tree" :"Coverage.dependent", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDependent"} **/
						));
Coverageobj.setRelationship(HapiFHIRHelpers.createCodeableConcept(coverage.getCvrgRltnshpCcCdngCSstm() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setSystem"} **/
						, coverage.getCvrgRltnshpCcCdngCVrsn() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setVersion"} **/
						, coverage.getCvrgRltnshpCcCdngCCde() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setCode"} **/
						, coverage.getCvrgRltnshpCcCdngCDsplay() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setDisplay"} **/
						, coverage.getCvrgRltnshpCcCdngCSrSlctd() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setUserSelected"} **/
						, coverage.getCoverageRelationshipCcText() /** { "tree" :"Coverage.relationship", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRelationship, setText"} **/
						));
Coverageobj.setPeriod(HapiFHIRHelpers.createPeriod(coverage.getCoveragePeriodPeriodStart() /** { "tree" :"Coverage.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, coverage.getCoveragePeriodPeriodEnd() /** { "tree" :"Coverage.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Coverageobj.setPayor(HapiFHIRHelpers.createReference(coverage.getCoveragePayorReference() /** { "tree" :"Coverage.payor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayor"} **/
						));
Coverageobj.setType(HapiFHIRHelpers.createCodeableConcept(coverage.getCvrgClssTpCcCdngCSstm() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, addCoding, setSystem"} **/
						, coverage.getCvrgClssTpCcCdngCVrsn() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, addCoding, setVersion"} **/
						, coverage.getCvrgClssTpCcCdngCCde() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, addCoding, setCode"} **/
						, coverage.getCvrgClssTpCcCdngCDsplay() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, coverage.getCvrgClssTpCcCdngCSrSlctd() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, coverage.getCoverageClassTypeCcText() /** { "tree" :"Coverage.class.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setType, setText"} **/
						));
Coverageobj.setValue(HapiFHIRHelpers.createstring(coverage.getCoverageClassValueString() /** { "tree" :"Coverage.class.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addClass"] , "methodName" : "setValue"} **/
						));
Coverageobj.setName(HapiFHIRHelpers.createstring(coverage.getCoverageClassNameString() /** { "tree" :"Coverage.class.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addClass"] , "methodName" : "setName"} **/
						));
Coverageobj.setOrder(HapiFHIRHelpers.createpositiveInt(coverage.getCoverageOrderPositiveInt() /** { "tree" :"Coverage.order", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrder"} **/
						));
Coverageobj.setNetwork(HapiFHIRHelpers.createstring(coverage.getCoverageNetworkString() /** { "tree" :"Coverage.network", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setNetwork"} **/
						));
Coverageobj.setType(HapiFHIRHelpers.createCodeableConcept(coverage.getCvrgCstTbnfcrTpCcCdngCSstm() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, addCoding, setSystem"} **/
						, coverage.getCvrgCstTbnfcrTpCcCdngCVrsn() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, addCoding, setVersion"} **/
						, coverage.getCvrgCstTbnfcrTpCcCdngCCde() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, addCoding, setCode"} **/
						, coverage.getCvrgCstTbnfcrTpCcCdngCDsplay() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, coverage.getCvrgCstTbnfcrTpCcCdngCSrSlctd() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, coverage.getCvrgCstTbnfcrTpCcTxt() /** { "tree" :"Coverage.costToBeneficiary.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setType, setText"} **/
						));
Coverageobj.setValueSimplequantity(HapiFHIRHelpers.createSimpleQuantity(coverage.getCvrgCstTbnfcrVlSmplqnttSmplQntty() /** { "tree" :"Coverage.costToBeneficiary.valueSimplequantity", "datatype" : "SimpleQuantity", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setValueSimplequantity"} **/
						));
Coverageobj.setValueMoney(HapiFHIRHelpers.createMoney(coverage.getCvrgCstTbnfcrVlMnMnCrrncy() /** { "tree" :"Coverage.costToBeneficiary.valueMoney", "datatype" : "Money, code", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setValueMoney, setCurrency"} **/
						, coverage.getCvrgCstTbnfcrVlMnMnVlue() /** { "tree" :"Coverage.costToBeneficiary.valueMoney", "datatype" : "Money, decimal", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary"] , "methodName" : "setValueMoney, setVal"} **/
						));
Coverageobj.setType(HapiFHIRHelpers.createCodeableConcept(coverage.getCvrgCstTbnfcrXcptnTpCcCdngCSstm() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, addCoding, setSystem"} **/
						, coverage.getCvrgCstTbnfcrXcptnTpCcCdngCVrsn() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, addCoding, setVersion"} **/
						, coverage.getCvrgCstTbnfcrXcptnTpCcCdngCCde() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, addCoding, setCode"} **/
						, coverage.getCvrgCstTbnfcrXcptnTpCcCdngCDsplay() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, coverage.getCvrgCstTbnfcrXcptnTpCcCdngCSrSlctd() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, coverage.getCvrgCstTbnfcrXcptnTpCcTxt() /** { "tree" :"Coverage.costToBeneficiary.exception.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setType, setText"} **/
						));
Coverageobj.setPeriod(HapiFHIRHelpers.createPeriod(coverage.getCvrgCstTbnfcrXcptnPrdPrdStrt() /** { "tree" :"Coverage.costToBeneficiary.exception.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setPeriod, setStart"} **/
						, coverage.getCvrgCstTbnfcrXcptnPrdPrdNd() /** { "tree" :"Coverage.costToBeneficiary.exception.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCostToBeneficiary", "addException"] , "methodName" : "setPeriod, setEnd"} **/
						));
Coverageobj.setSubrogation(HapiFHIRHelpers.createboolean(coverage.getCoverageSubrogationBoolean() /** { "tree" :"Coverage.subrogation", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubrogation"} **/
						));
Coverageobj.addContract(HapiFHIRHelpers.createReference(coverage.getCoverageContractReference() /** { "tree" :"Coverage.contract", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContract"} **/
		));
	}
}
