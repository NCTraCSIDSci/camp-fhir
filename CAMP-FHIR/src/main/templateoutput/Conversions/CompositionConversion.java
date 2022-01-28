package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Composition.
 * @see .Composition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CompositionConversion 
{
	public Patient Compositions(main.templateoutput.Model.Composition composition) 
	{
			Patient  Compositionobj = new Patient(); 

						Compositionobj.setIdentifier(HapiFHIRHelpers.createIdentifier(composition.getCmpstnDntfrDntfrSe() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, composition.getCmpstnDntfrDntfrTpCcCSstm() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, composition.getCmpstnDntfrDntfrTpCcCVrsn() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, composition.getCmpstnDntfrDntfrTpCcCCde() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, composition.getCmpstnDntfrDntfrTpCcCDsplay() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, composition.getCmpstnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, composition.getCmpstnDntfrDntfrTpCcTxt() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, composition.getCmpstnDntfrDntfrPrdPrdStrt() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, composition.getCmpstnDntfrDntfrPrdPrdNd() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, composition.getCmpstnDntfrDntfrSsgnr() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, composition.getCmpstnDntfrDntfrVlue() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, composition.getCmpstnDntfrDntfrSstm() /** { "tree" :"Composition.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Compositionobj.setStatus(HapiFHIRHelpers.createcode(composition.getCompositionStatusCode() /** { "tree" :"Composition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Compositionobj.setType(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnTpCcCdngCSstm() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, composition.getCmpstnTpCcCdngCVrsn() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, composition.getCompositionTypeCcCodingCCode() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, composition.getCmpstnTpCcCdngCDsplay() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, composition.getCmpstnTpCcCdngCSrSlctd() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, composition.getCompositionTypeCcText() /** { "tree" :"Composition.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Compositionobj.addCategory(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnCtgrCcCdngCSstm() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, composition.getCmpstnCtgrCcCdngCVrsn() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, composition.getCmpstnCtgrCcCdngCCde() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, composition.getCmpstnCtgrCcCdngCDsplay() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, composition.getCmpstnCtgrCcCdngCSrSlctd() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, composition.getCompositionCategoryCcText() /** { "tree" :"Composition.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Compositionobj.setSubject(HapiFHIRHelpers.createReference(composition.getCompositionSubjectReference() /** { "tree" :"Composition.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Compositionobj.setEncounter(HapiFHIRHelpers.createReference(composition.getCompositionEncounterReference() /** { "tree" :"Composition.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Compositionobj.setDate(HapiFHIRHelpers.createdateTime(composition.getCompositionDateDateTime() /** { "tree" :"Composition.date", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Compositionobj.setAuthor(HapiFHIRHelpers.createReference(composition.getCompositionAuthorReference() /** { "tree" :"Composition.author", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Compositionobj.setTitle(HapiFHIRHelpers.createstring(composition.getCompositionTitleString() /** { "tree" :"Composition.title", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Compositionobj.setConfidentiality(HapiFHIRHelpers.createcode(composition.getCompositionConfidentialityCode() /** { "tree" :"Composition.confidentiality", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setConfidentiality"} **/
						));
Compositionobj.setMode(HapiFHIRHelpers.createcode(composition.getCompositionAttesterModeCode() /** { "tree" :"Composition.attester.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addAttester"] , "methodName" : "setMode"} **/
						));
Compositionobj.setTime(HapiFHIRHelpers.createdateTime(composition.getCompositionAttesterTimeDateTime() /** { "tree" :"Composition.attester.time", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAttester"] , "methodName" : "setTime"} **/
						));
Compositionobj.setParty(HapiFHIRHelpers.createReference(composition.getCmpstnTtstrPrtRfrnce() /** { "tree" :"Composition.attester.party", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addAttester"] , "methodName" : "setParty"} **/
						));
Compositionobj.setCustodian(HapiFHIRHelpers.createReference(composition.getCompositionCustodianReference() /** { "tree" :"Composition.custodian", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCustodian"} **/
						));
Compositionobj.setCode(HapiFHIRHelpers.createcode(composition.getCompositionRelatesToCodeCode() /** { "tree" :"Composition.relatesTo.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setCode"} **/
						));
Compositionobj.setTargetIdentifier(HapiFHIRHelpers.createIdentifier(composition.getCmpstnRltsTTrgtdntfrDntfrSe() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, code", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setUse"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcCSstm() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, addCoding, setSystem"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcCVrsn() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, addCoding, setVersion"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcCCde() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, addCoding, setCode"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcCDsplay() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, addCoding, setDisplay"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcCSrSlctd() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, addCoding, setUserSelected"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrTpCcTxt() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setType, setText"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrPrdPrdStrt() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setPeriod, setStart"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrPrdPrdNd() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setPeriod, setEnd"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrSsgnr() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setAssigner"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrVlue() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, string", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setValue"} **/
						, composition.getCmpstnRltsTTrgtdntfrDntfrSstm() /** { "tree" :"Composition.relatesTo.targetIdentifier", "datatype" : "Identifier, uri", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetIdentifier, setSystem"} **/
						));
Compositionobj.setTargetReference(composition)(HapiFHIRHelpers.createReference(composition.getCmpstnRltsTTrgtRfrncRfrnce() /** { "tree" :"Composition.relatesTo.targetReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTargetReference(composition)"} **/
						));
Compositionobj.addCode(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnVntCdCcCdngCSstm() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, addCoding, setSystem"} **/
						, composition.getCmpstnVntCdCcCdngCVrsn() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, addCoding, setVersion"} **/
						, composition.getCmpstnVntCdCcCdngCCde() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, addCoding, setCode"} **/
						, composition.getCmpstnVntCdCcCdngCDsplay() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, composition.getCmpstnVntCdCcCdngCSrSlctd() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, composition.getCompositionEventCodeCcText() /** { "tree" :"Composition.event.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addCode, setText"} **/
						));
Compositionobj.setPeriod(HapiFHIRHelpers.createPeriod(composition.getCmpstnVntPrdPrdStrt() /** { "tree" :"Composition.event.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addEvent"] , "methodName" : "setPeriod, setStart"} **/
						, composition.getCmpstnVntPrdPrdNd() /** { "tree" :"Composition.event.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addEvent"] , "methodName" : "setPeriod, setEnd"} **/
						));
Compositionobj.addDetail(HapiFHIRHelpers.createReference(composition.getCompositionEventDetailReference() /** { "tree" :"Composition.event.detail", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addEvent"] , "methodName" : "addDetail"} **/
						));
Compositionobj.setTitle(HapiFHIRHelpers.createstring(composition.getCompositionSectionTitleString() /** { "tree" :"Composition.section.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setTitle"} **/
						));
Compositionobj.setCode(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnSctnCdCcCdngCSstm() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, composition.getCmpstnSctnCdCcCdngCVrsn() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, composition.getCmpstnSctnCdCcCdngCCde() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, addCoding, setCode"} **/
						, composition.getCmpstnSctnCdCcCdngCDsplay() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, composition.getCmpstnSctnCdCcCdngCSrSlctd() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, composition.getCompositionSectionCodeCcText() /** { "tree" :"Composition.section.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setCode, setText"} **/
						));
Compositionobj.addAuthor(HapiFHIRHelpers.createReference(composition.getCmpstnSctnThrRfrnce() /** { "tree" :"Composition.section.author", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addSection"] , "methodName" : "addAuthor"} **/
						));
Compositionobj.setFocus(HapiFHIRHelpers.createReference(composition.getCmpstnSctnFcsRfrnce() /** { "tree" :"Composition.section.focus", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setFocus"} **/
						));
Compositionobj.setText(HapiFHIRHelpers.createNarrative(composition.getCompositionSectionTextNarrative() /** { "tree" :"Composition.section.text", "datatype" : "Narrative", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setText"} **/
						));
Compositionobj.setMode(HapiFHIRHelpers.createcode(composition.getCompositionSectionModeCode() /** { "tree" :"Composition.section.mode", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setMode"} **/
						));
Compositionobj.setOrderedBy(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnSctnRdrdBCcCdngCSstm() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, addCoding, setSystem"} **/
						, composition.getCmpstnSctnRdrdBCcCdngCVrsn() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, addCoding, setVersion"} **/
						, composition.getCmpstnSctnRdrdBCcCdngCCde() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, addCoding, setCode"} **/
						, composition.getCmpstnSctnRdrdBCcCdngCDsplay() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, addCoding, setDisplay"} **/
						, composition.getCmpstnSctnRdrdBCcCdngCSrSlctd() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, addCoding, setUserSelected"} **/
						, composition.getCmpstnSctnRdrdBCcTxt() /** { "tree" :"Composition.section.orderedBy", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setOrderedBy, setText"} **/
						));
Compositionobj.addEntry(HapiFHIRHelpers.createReference(composition.getCmpstnSctnNtrRfrnce() /** { "tree" :"Composition.section.entry", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addSection"] , "methodName" : "addEntry"} **/
						));
Compositionobj.setEmptyReason(HapiFHIRHelpers.createCodeableConcept(composition.getCmpstnSctnMptRsnCcCdngCSstm() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, addCoding, setSystem"} **/
						, composition.getCmpstnSctnMptRsnCcCdngCVrsn() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, addCoding, setVersion"} **/
						, composition.getCmpstnSctnMptRsnCcCdngCCde() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, addCoding, setCode"} **/
						, composition.getCmpstnSctnMptRsnCcCdngCDsplay() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, addCoding, setDisplay"} **/
						, composition.getCmpstnSctnMptRsnCcCdngCSrSlctd() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, addCoding, setUserSelected"} **/
						, composition.getCmpstnSctnMptRsnCcTxt() /** { "tree" :"Composition.section.emptyReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSection"] , "methodName" : "setEmptyReason, setText"} **/
						));
Compositionobj.addSection(HapiFHIRHelpers.createsection(composition.getCmpstnSctnSctnSctn() /** { "tree" :"Composition.section.section", "datatype" : "section", "cardinality" : "Many", "elementtree" : ["addSection"] , "methodName" : "addSection"} **/
		));
	}
}
