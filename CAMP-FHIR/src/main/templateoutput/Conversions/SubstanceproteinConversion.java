package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Substanceprotein.
 * @see .Substanceprotein
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SubstanceproteinConversion 
{
	public Patient Substanceproteins(main.templateoutput.Model.Substanceprotein substanceprotein) 
	{
			Patient  Substanceproteinobj = new Patient(); 

						Substanceproteinobj.setSequenceType(HapiFHIRHelpers.createCodeableConcept(substanceprotein.getSbstncPrtnSqncTpCcCdngCSstm() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, addCoding, setSystem"} **/
						, substanceprotein.getSbstncPrtnSqncTpCcCdngCVrsn() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, addCoding, setVersion"} **/
						, substanceprotein.getSbstncPrtnSqncTpCcCdngCCde() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, addCoding, setCode"} **/
						, substanceprotein.getSbstncPrtnSqncTpCcCdngCDsplay() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, addCoding, setDisplay"} **/
						, substanceprotein.getSbstncPrtnSqncTpCcCdngCSrSlctd() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, addCoding, setUserSelected"} **/
						, substanceprotein.getSbstncPrtnSqncTpCcTxt() /** { "tree" :"SubstanceProtein.sequenceType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSequenceType, setText"} **/
						));
Substanceproteinobj.setNumberOfSubunits(HapiFHIRHelpers.createinteger(substanceprotein.getSbstncPrtnNmbrfSbntsNtgr() /** { "tree" :"SubstanceProtein.numberOfSubunits", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setNumberOfSubunits"} **/
						));
Substanceproteinobj.addDisulfideLinkage(HapiFHIRHelpers.createstring(substanceprotein.getSbstncPrtnDslfdLnkgStrng() /** { "tree" :"SubstanceProtein.disulfideLinkage", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDisulfideLinkage"} **/
						));
Substanceproteinobj.setSubunit(HapiFHIRHelpers.createinteger(substanceprotein.getSbstncPrtnSbntSbntNtgr() /** { "tree" :"SubstanceProtein.subunit.subunit", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSubunit"} **/
						));
Substanceproteinobj.setSequence(HapiFHIRHelpers.createstring(substanceprotein.getSbstncPrtnSbntSqncStrng() /** { "tree" :"SubstanceProtein.subunit.sequence", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequence"} **/
						));
Substanceproteinobj.setLength(HapiFHIRHelpers.createinteger(substanceprotein.getSbstncPrtnSbntLngthNtgr() /** { "tree" :"SubstanceProtein.subunit.length", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setLength"} **/
						));
Substanceproteinobj.setSequenceAttachment(HapiFHIRHelpers.createAttachment(substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntDta() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setData"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntHsh() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setHash"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntCntntTpe() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setContentType"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntLngge() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setLanguage"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntCrtn() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setCreation"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntTtle() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setTitle"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntSze() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setSize"} **/
						, substanceprotein.getSbstncPrtnSbntSqncttchmntTtchmntRl() /** { "tree" :"SubstanceProtein.subunit.sequenceAttachment", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setSequenceAttachment, setUrl"} **/
						));
Substanceproteinobj.setNTerminalModificationId(HapiFHIRHelpers.createIdentifier(substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrSe() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setUse"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcCSstm() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, addCoding, setSystem"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcCVrsn() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, addCoding, setVersion"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcCCde() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, addCoding, setCode"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcCDsplay() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, addCoding, setDisplay"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcCSrSlctd() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, addCoding, setUserSelected"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrTpCcTxt() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setType, setText"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrPrdPrdStrt() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setPeriod, setStart"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrPrdPrdNd() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setPeriod, setEnd"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrSsgnr() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setAssigner"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrVlue() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setValue"} **/
						, substanceprotein.getSbstncPrtnSbntNTrmnlMdfctndDntfrSstm() /** { "tree" :"SubstanceProtein.subunit.nTerminalModificationId", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModificationId, setSystem"} **/
						));
Substanceproteinobj.setNTerminalModification(HapiFHIRHelpers.createstring(substanceprotein.getSbstncPrtnSbntNTrmnlMdfctnStrng() /** { "tree" :"SubstanceProtein.subunit.nTerminalModification", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setNTerminalModification"} **/
						));
Substanceproteinobj.setCTerminalModificationId(HapiFHIRHelpers.createIdentifier(substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrSe() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setUse"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcCSstm() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, addCoding, setSystem"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcCVrsn() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, addCoding, setVersion"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcCCde() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, addCoding, setCode"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcCDsplay() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, addCoding, setDisplay"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcCSrSlctd() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, addCoding, setUserSelected"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrTpCcTxt() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setType, setText"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrPrdPrdStrt() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setPeriod, setStart"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrPrdPrdNd() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setPeriod, setEnd"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrSsgnr() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setAssigner"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrVlue() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setValue"} **/
						, substanceprotein.getSbstncPrtnSbntCTrmnlMdfctndDntfrSstm() /** { "tree" :"SubstanceProtein.subunit.cTerminalModificationId", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModificationId, setSystem"} **/
						));
Substanceproteinobj.setCTerminalModification(HapiFHIRHelpers.createstring(substanceprotein.getSbstncPrtnSbntCTrmnlMdfctnStrng() /** { "tree" :"SubstanceProtein.subunit.cTerminalModification", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSubunit"] , "methodName" : "setCTerminalModification"} **/
		));
	}
}
