package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Molecularsequence.
 * @see .Molecularsequence
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MolecularsequenceConversion 
{
	public Patient Molecularsequences(main.templateoutput.Model.Molecularsequence molecularsequence) 
	{
			Patient  Molecularsequenceobj = new Patient(); 

						Molecularsequenceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(molecularsequence.getMlclrSqncDntfrDntfrSe() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcCSstm() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcCVrsn() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcCCde() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcCDsplay() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrTpCcTxt() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrPrdPrdStrt() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrPrdPrdNd() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrSsgnr() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrVlue() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, molecularsequence.getMlclrSqncDntfrDntfrSstm() /** { "tree" :"MolecularSequence.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Molecularsequenceobj.setType(HapiFHIRHelpers.createcode(molecularsequence.getMolecularSequenceTypeCode() /** { "tree" :"MolecularSequence.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType"} **/
						));
Molecularsequenceobj.setCoordinateSystem(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncCrdntSstmNtgr() /** { "tree" :"MolecularSequence.coordinateSystem", "datatype" : "integer", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCoordinateSystem"} **/
						));
Molecularsequenceobj.setPatient(HapiFHIRHelpers.createReference(molecularsequence.getMolecularSequencePntReference() /** { "tree" :"MolecularSequence.patient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Molecularsequenceobj.setSpecimen(HapiFHIRHelpers.createReference(molecularsequence.getMlclrSqncSpcmnRfrnce() /** { "tree" :"MolecularSequence.specimen", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSpecimen"} **/
						));
Molecularsequenceobj.setDevice(HapiFHIRHelpers.createReference(molecularsequence.getMolecularSequenceDeviceReference() /** { "tree" :"MolecularSequence.device", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDevice"} **/
						));
Molecularsequenceobj.setPerformer(HapiFHIRHelpers.createReference(molecularsequence.getMlclrSqncPrfrmrRfrnce() /** { "tree" :"MolecularSequence.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformer"} **/
						));
Molecularsequenceobj.setQuantity(HapiFHIRHelpers.createQuantity(molecularsequence.getMlclrSqncQnttQnttCmprtr() /** { "tree" :"MolecularSequence.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setComparator"} **/
						, molecularsequence.getMlclrSqncQnttQnttCde() /** { "tree" :"MolecularSequence.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setCode"} **/
						, molecularsequence.getMlclrSqncQnttQnttVlue() /** { "tree" :"MolecularSequence.quantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setValue"} **/
						, molecularsequence.getMlclrSqncQnttQnttNt() /** { "tree" :"MolecularSequence.quantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setUnit"} **/
						, molecularsequence.getMlclrSqncQnttQnttSstm() /** { "tree" :"MolecularSequence.quantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setSystem"} **/
						));
Molecularsequenceobj.setChromosome(HapiFHIRHelpers.createCodeableConcept(molecularsequence.getMlclrSqncRfrncSqChrmsmCcCdngCSstm() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncRfrncSqChrmsmCcCdngCVrsn() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncRfrncSqChrmsmCcCdngCCde() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncRfrncSqChrmsmCcCdngCDsplay() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncRfrncSqChrmsmCcCdngCSrSlctd() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncRfrncSqChrmsmCcTxt() /** { "tree" :"MolecularSequence.referenceSeq.chromosome", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setChromosome, setText"} **/
						));
Molecularsequenceobj.setGenomeBuild(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRfrncSqGnmBldStrng() /** { "tree" :"MolecularSequence.referenceSeq.genomeBuild", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setGenomeBuild"} **/
						));
Molecularsequenceobj.setOrientation(HapiFHIRHelpers.createcode(molecularsequence.getMlclrSqncRfrncSqRnttnCde() /** { "tree" :"MolecularSequence.referenceSeq.orientation", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setOrientation"} **/
						));
Molecularsequenceobj.setReferenceSeqId(HapiFHIRHelpers.createCodeableConcept(molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcCdngCSstm() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcCdngCVrsn() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcCdngCCde() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcCdngCDsplay() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcCdngCSrSlctd() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncRfrncSqRfrncSqdCcTxt() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqId", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqId, setText"} **/
						));
Molecularsequenceobj.setReferenceSeqPointer(HapiFHIRHelpers.createReference(molecularsequence.getMlclrSqncRfrncSqRfrncSqPntrRfrnce() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqPointer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqPointer"} **/
						));
Molecularsequenceobj.setReferenceSeqString(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRfrncSqRfrncSqStrngStrng() /** { "tree" :"MolecularSequence.referenceSeq.referenceSeqString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setReferenceSeqString"} **/
						));
Molecularsequenceobj.setStrand(HapiFHIRHelpers.createcode(molecularsequence.getMlclrSqncRfrncSqStrndCde() /** { "tree" :"MolecularSequence.referenceSeq.strand", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setStrand"} **/
						));
Molecularsequenceobj.setWindowStart(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncRfrncSqWndwStrtNtgr() /** { "tree" :"MolecularSequence.referenceSeq.windowStart", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setWindowStart"} **/
						));
Molecularsequenceobj.setWindowEnd(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncRfrncSqWndwndNtgr() /** { "tree" :"MolecularSequence.referenceSeq.windowEnd", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setReferenceSeq"] , "methodName" : "setWindowEnd"} **/
						));
Molecularsequenceobj.setStart(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncVrntStrtNtgr() /** { "tree" :"MolecularSequence.variant.start", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setStart"} **/
						));
Molecularsequenceobj.setEnd(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncVrntNdNtgr() /** { "tree" :"MolecularSequence.variant.end", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setEnd"} **/
						));
Molecularsequenceobj.setObservedAllele(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncVrntBsrvdlllStrng() /** { "tree" :"MolecularSequence.variant.observedAllele", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setObservedAllele"} **/
						));
Molecularsequenceobj.setReferenceAllele(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncVrntRfrnclllStrng() /** { "tree" :"MolecularSequence.variant.referenceAllele", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setReferenceAllele"} **/
						));
Molecularsequenceobj.setCigar(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncVrntCgrStrng() /** { "tree" :"MolecularSequence.variant.cigar", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setCigar"} **/
						));
Molecularsequenceobj.setVariantPointer(HapiFHIRHelpers.createReference(molecularsequence.getMlclrSqncVrntVrntPntrRfrnce() /** { "tree" :"MolecularSequence.variant.variantPointer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addVariant"] , "methodName" : "setVariantPointer"} **/
						));
Molecularsequenceobj.setObservedSeq(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncBsrvdSqStrng() /** { "tree" :"MolecularSequence.observedSeq", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setObservedSeq"} **/
						));
Molecularsequenceobj.setType(HapiFHIRHelpers.createcode(molecularsequence.getMlclrSqncQltTpCde() /** { "tree" :"MolecularSequence.quality.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addQuality"] , "methodName" : "setType"} **/
						));
Molecularsequenceobj.setStandardSequence(HapiFHIRHelpers.createCodeableConcept(molecularsequence.getMlclrSqncQltStndrdSqncCcCdngCSstm() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncQltStndrdSqncCcCdngCVrsn() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncQltStndrdSqncCcCdngCCde() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncQltStndrdSqncCcCdngCDsplay() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncQltStndrdSqncCcCdngCSrSlctd() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncQltStndrdSqncCcTxt() /** { "tree" :"MolecularSequence.quality.standardSequence", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStandardSequence, setText"} **/
						));
Molecularsequenceobj.setStart(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltStrtNtgr() /** { "tree" :"MolecularSequence.quality.start", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setStart"} **/
						));
Molecularsequenceobj.setEnd(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltNdNtgr() /** { "tree" :"MolecularSequence.quality.end", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setEnd"} **/
						));
Molecularsequenceobj.setScore(HapiFHIRHelpers.createQuantity(molecularsequence.getMlclrSqncQltScrQnttCmprtr() /** { "tree" :"MolecularSequence.quality.score", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setScore, setComparator"} **/
						, molecularsequence.getMlclrSqncQltScrQnttCde() /** { "tree" :"MolecularSequence.quality.score", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setScore, setCode"} **/
						, molecularsequence.getMlclrSqncQltScrQnttVlue() /** { "tree" :"MolecularSequence.quality.score", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setScore, setValue"} **/
						, molecularsequence.getMlclrSqncQltScrQnttNt() /** { "tree" :"MolecularSequence.quality.score", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setScore, setUnit"} **/
						, molecularsequence.getMlclrSqncQltScrQnttSstm() /** { "tree" :"MolecularSequence.quality.score", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setScore, setSystem"} **/
						));
Molecularsequenceobj.setMethod(HapiFHIRHelpers.createCodeableConcept(molecularsequence.getMlclrSqncQltMthdCcCdngCSstm() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncQltMthdCcCdngCVrsn() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncQltMthdCcCdngCCde() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncQltMthdCcCdngCDsplay() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncQltMthdCcCdngCSrSlctd() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncQltMthdCcTxt() /** { "tree" :"MolecularSequence.quality.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setMethod, setText"} **/
						));
Molecularsequenceobj.setTruthTP(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltTrthTpDcml() /** { "tree" :"MolecularSequence.quality.truthTP", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setTruthTP"} **/
						));
Molecularsequenceobj.setQueryTP(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltQrTpDcml() /** { "tree" :"MolecularSequence.quality.queryTP", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setQueryTP"} **/
						));
Molecularsequenceobj.setTruthFN(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltTrthFnDcml() /** { "tree" :"MolecularSequence.quality.truthFN", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setTruthFN"} **/
						));
Molecularsequenceobj.setQueryFP(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltQrFpDcml() /** { "tree" :"MolecularSequence.quality.queryFP", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setQueryFP"} **/
						));
Molecularsequenceobj.setGtFP(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltGtFpDcml() /** { "tree" :"MolecularSequence.quality.gtFP", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setGtFP"} **/
						));
Molecularsequenceobj.setPrecision(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltPrcsnDcml() /** { "tree" :"MolecularSequence.quality.precision", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setPrecision"} **/
						));
Molecularsequenceobj.setRecall(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltRcllDcml() /** { "tree" :"MolecularSequence.quality.recall", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setRecall"} **/
						));
Molecularsequenceobj.setFScore(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltFScrDcml() /** { "tree" :"MolecularSequence.quality.fScore", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addQuality"] , "methodName" : "setFScore"} **/
						));
Molecularsequenceobj.addScore(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltRcScrNtgr() /** { "tree" :"MolecularSequence.quality.roc.score", "datatype" : "integer", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addScore"} **/
						));
Molecularsequenceobj.addNumTP(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltRcNmTpNtgr() /** { "tree" :"MolecularSequence.quality.roc.numTP", "datatype" : "integer", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addNumTP"} **/
						));
Molecularsequenceobj.addNumFP(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltRcNmFpNtgr() /** { "tree" :"MolecularSequence.quality.roc.numFP", "datatype" : "integer", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addNumFP"} **/
						));
Molecularsequenceobj.addNumFN(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncQltRcNmFnNtgr() /** { "tree" :"MolecularSequence.quality.roc.numFN", "datatype" : "integer", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addNumFN"} **/
						));
Molecularsequenceobj.addPrecision(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltRcPrcsnDcml() /** { "tree" :"MolecularSequence.quality.roc.precision", "datatype" : "decimal", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addPrecision"} **/
						));
Molecularsequenceobj.addSensitivity(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltRcSnstvtDcml() /** { "tree" :"MolecularSequence.quality.roc.sensitivity", "datatype" : "decimal", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addSensitivity"} **/
						));
Molecularsequenceobj.addFMeasure(HapiFHIRHelpers.createdecimal(molecularsequence.getMlclrSqncQltRcFMsrDcml() /** { "tree" :"MolecularSequence.quality.roc.fMeasure", "datatype" : "decimal", "cardinality" : "Many", "elementtree" : ["addQuality", "setRoc"] , "methodName" : "addFMeasure"} **/
						));
Molecularsequenceobj.setReadCoverage(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncRdCvrgNtgr() /** { "tree" :"MolecularSequence.readCoverage", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReadCoverage"} **/
						));
Molecularsequenceobj.setType(HapiFHIRHelpers.createcode(molecularsequence.getMlclrSqncRpstrTpCde() /** { "tree" :"MolecularSequence.repository.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRepository"] , "methodName" : "setType"} **/
						));
Molecularsequenceobj.setUrl(HapiFHIRHelpers.createuri(molecularsequence.getMlclrSqncRpstrRlRi() /** { "tree" :"MolecularSequence.repository.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addRepository"] , "methodName" : "setUrl"} **/
						));
Molecularsequenceobj.setName(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRpstrNmStrng() /** { "tree" :"MolecularSequence.repository.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addRepository"] , "methodName" : "setName"} **/
						));
Molecularsequenceobj.setDatasetId(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRpstrDtstdStrng() /** { "tree" :"MolecularSequence.repository.datasetId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addRepository"] , "methodName" : "setDatasetId"} **/
						));
Molecularsequenceobj.setVariantsetId(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRpstrVrntstdStrng() /** { "tree" :"MolecularSequence.repository.variantsetId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addRepository"] , "methodName" : "setVariantsetId"} **/
						));
Molecularsequenceobj.setReadsetId(HapiFHIRHelpers.createstring(molecularsequence.getMlclrSqncRpstrRdstdStrng() /** { "tree" :"MolecularSequence.repository.readsetId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addRepository"] , "methodName" : "setReadsetId"} **/
						));
Molecularsequenceobj.addPointer(HapiFHIRHelpers.createReference(molecularsequence.getMlclrSqncPntrRfrnce() /** { "tree" :"MolecularSequence.pointer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPointer"} **/
						));
Molecularsequenceobj.setVariantType(HapiFHIRHelpers.createCodeableConcept(molecularsequence.getMlclrSqncStrctrVrntVrntTpCcCdngCSstm() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, addCoding, setSystem"} **/
						, molecularsequence.getMlclrSqncStrctrVrntVrntTpCcCdngCVrsn() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, addCoding, setVersion"} **/
						, molecularsequence.getMlclrSqncStrctrVrntVrntTpCcCdngCCde() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, addCoding, setCode"} **/
						, molecularsequence.getMlclrSqncStrctrVrntVrntTpCcCdngCDsplay() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, addCoding, setDisplay"} **/
						, molecularsequence.getMlclrSqncStrctrVrntVrntTpCcCdngCSrSlctd() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, addCoding, setUserSelected"} **/
						, molecularsequence.getMlclrSqncStrctrVrntVrntTpCcTxt() /** { "tree" :"MolecularSequence.structureVariant.variantType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setVariantType, setText"} **/
						));
Molecularsequenceobj.setExact(HapiFHIRHelpers.createboolean(molecularsequence.getMlclrSqncStrctrVrntXctBln() /** { "tree" :"MolecularSequence.structureVariant.exact", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setExact"} **/
						));
Molecularsequenceobj.setLength(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncStrctrVrntLngthNtgr() /** { "tree" :"MolecularSequence.structureVariant.length", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant"] , "methodName" : "setLength"} **/
						));
Molecularsequenceobj.setStart(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncStrctrVrntTrStrtNtgr() /** { "tree" :"MolecularSequence.structureVariant.outer.start", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant", "setOuter"] , "methodName" : "setStart"} **/
						));
Molecularsequenceobj.setEnd(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncStrctrVrntTrNdNtgr() /** { "tree" :"MolecularSequence.structureVariant.outer.end", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant", "setOuter"] , "methodName" : "setEnd"} **/
						));
Molecularsequenceobj.setStart(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncStrctrVrntNnrStrtNtgr() /** { "tree" :"MolecularSequence.structureVariant.inner.start", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant", "setOuter", "setInner"] , "methodName" : "setStart"} **/
						));
Molecularsequenceobj.setEnd(HapiFHIRHelpers.createinteger(molecularsequence.getMlclrSqncStrctrVrntNnrNdNtgr() /** { "tree" :"MolecularSequence.structureVariant.inner.end", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addStructureVariant", "setOuter", "setInner"] , "methodName" : "setEnd"} **/
		));
	}
}
