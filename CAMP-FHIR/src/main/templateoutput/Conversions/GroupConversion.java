package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Group.
 * @see .Group
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class GroupConversion 
{
	public Patient Groups(main.templateoutput.Model.Group group) 
	{
			Patient  Groupobj = new Patient(); 

						Groupobj.addIdentifier(HapiFHIRHelpers.createIdentifier(group.getGroupIdentifierIdentifierUse() /** { "tree" :"Group.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, group.getGrpDntfrDntfrTpCcCSstm() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, group.getGrpDntfrDntfrTpCcCVrsn() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, group.getGrpDntfrDntfrTpCcCCde() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, group.getGrpDntfrDntfrTpCcCDsplay() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, group.getGrpDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, group.getGrpDntfrDntfrTpCcTxt() /** { "tree" :"Group.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, group.getGrpDntfrDntfrPrdPrdStrt() /** { "tree" :"Group.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, group.getGrpDntfrDntfrPrdPrdNd() /** { "tree" :"Group.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, group.getGrpDntfrDntfrSsgnr() /** { "tree" :"Group.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, group.getGroupIdentifierIdentifierValue() /** { "tree" :"Group.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, group.getGroupIdentifierIdentifierSystem() /** { "tree" :"Group.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Groupobj.setActive(HapiFHIRHelpers.createboolean(group.getGroupActiveBoolean() /** { "tree" :"Group.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Groupobj.setType(HapiFHIRHelpers.createcode(group.getGroupTypeCode() /** { "tree" :"Group.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType"} **/
						));
Groupobj.setActual(HapiFHIRHelpers.createboolean(group.getGroupActualBoolean() /** { "tree" :"Group.actual", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setActual"} **/
						));
Groupobj.setCode(HapiFHIRHelpers.createCodeableConcept(group.getGroupCodeCcCodingCSystem() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, group.getGroupCodeCcCodingCVersion() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, group.getGroupCodeCcCodingCCode() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, group.getGroupCodeCcCodingCDisplay() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, group.getGrpCdCcCdngCSrSlctd() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, group.getGroupCodeCcText() /** { "tree" :"Group.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Groupobj.setName(HapiFHIRHelpers.createstring(group.getGroupNameString() /** { "tree" :"Group.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Groupobj.setQuantity(HapiFHIRHelpers.createunsignedInt(group.getGroupQuantityUnsignedInt() /** { "tree" :"Group.quantity", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity"} **/
						));
Groupobj.setManagingEntity(HapiFHIRHelpers.createReference(group.getGroupManagingEntityReference() /** { "tree" :"Group.managingEntity", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingEntity"} **/
						));
Groupobj.setCode(HapiFHIRHelpers.createCodeableConcept(group.getGrpChrctrCdCcCdngCSstm() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, group.getGrpChrctrCdCcCdngCVrsn() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, group.getGroupChrctrCodeCcCodingCCode() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, addCoding, setCode"} **/
						, group.getGrpChrctrCdCcCdngCDsplay() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, group.getGrpChrctrCdCcCdngCSrSlctd() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, group.getGroupChrctrCodeCcText() /** { "tree" :"Group.characteristic.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setCode, setText"} **/
						));
Groupobj.setValueCodeableconcept(HapiFHIRHelpers.createCodeableConcept(group.getGrpChrctrVlCdblcncptCcCdngCSstm() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, addCoding, setSystem"} **/
						, group.getGrpChrctrVlCdblcncptCcCdngCVrsn() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, addCoding, setVersion"} **/
						, group.getGrpChrctrVlCdblcncptCcCdngCCde() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, addCoding, setCode"} **/
						, group.getGrpChrctrVlCdblcncptCcCdngCDsplay() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, addCoding, setDisplay"} **/
						, group.getGrpChrctrVlCdblcncptCcCdngCSrSlctd() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, addCoding, setUserSelected"} **/
						, group.getGrpChrctrVlCdblcncptCcTxt() /** { "tree" :"Group.characteristic.valueCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueCodeableconcept, setText"} **/
						));
Groupobj.setValue(HapiFHIRHelpers.createbooleantype(group.getGroupChrctrValueBooleanBoolean() /** { "tree" :"Group.characteristic.valueBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueBoolean"} **/
						));
Groupobj.setValueQuantity(HapiFHIRHelpers.createQuantity(group.getGrpChrctrVlQnttQnttCmprtr() /** { "tree" :"Group.characteristic.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueQuantity, setComparator"} **/
						, group.getGrpChrctrVlQnttQnttCde() /** { "tree" :"Group.characteristic.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueQuantity, setCode"} **/
						, group.getGrpChrctrVlQnttQnttVlue() /** { "tree" :"Group.characteristic.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueQuantity, setValue"} **/
						, group.getGrpChrctrVlQnttQnttNt() /** { "tree" :"Group.characteristic.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueQuantity, setUnit"} **/
						, group.getGrpChrctrVlQnttQnttSstm() /** { "tree" :"Group.characteristic.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Groupobj.setValueRange(HapiFHIRHelpers.createRange(group.getGroupChrctrValueRangeRangeLow() /** { "tree" :"Group.characteristic.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueRange, setLow"} **/
						, group.getGroupChrctrValueRangeRangeHigh() /** { "tree" :"Group.characteristic.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueRange, setHigh"} **/
						));
Groupobj.setValueReference()(HapiFHIRHelpers.createReference(group.getGrpChrctrVlRfrncRfrnce() /** { "tree" :"Group.characteristic.valueReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setValueReference()"} **/
						));
Groupobj.setExclude(HapiFHIRHelpers.createboolean(group.getGroupChrctrExcludeBoolean() /** { "tree" :"Group.characteristic.exclude", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addCharacteristic"] , "methodName" : "setExclude"} **/
						));
Groupobj.setPeriod(HapiFHIRHelpers.createPeriod(group.getGroupChrctrPeriodPeriodStart() /** { "tree" :"Group.characteristic.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCharacteristic"] , "methodName" : "setPeriod, setStart"} **/
						, group.getGroupChrctrPeriodPeriodEnd() /** { "tree" :"Group.characteristic.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCharacteristic"] , "methodName" : "setPeriod, setEnd"} **/
						));
Groupobj.setEntity(HapiFHIRHelpers.createReference(group.getGroupMemberEntityReference() /** { "tree" :"Group.member.entity", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addMember"] , "methodName" : "setEntity"} **/
						));
Groupobj.setPeriod(HapiFHIRHelpers.createPeriod(group.getGroupMemberPeriodPeriodStart() /** { "tree" :"Group.member.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addMember"] , "methodName" : "setPeriod, setStart"} **/
						, group.getGroupMemberPeriodPeriodEnd() /** { "tree" :"Group.member.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addMember"] , "methodName" : "setPeriod, setEnd"} **/
						));
Groupobj.setInactive(HapiFHIRHelpers.createboolean(group.getGroupMemberInactiveBoolean() /** { "tree" :"Group.member.inactive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addMember"] , "methodName" : "setInactive"} **/
		));
	}
}
