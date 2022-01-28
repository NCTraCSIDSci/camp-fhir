package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Specimen.
 * @see .Specimen
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SpecimenConversion 
{
	public Patient Specimens(main.templateoutput.Model.Specimen specimen) 
	{
			Patient  Specimenobj = new Patient(); 

						Specimenobj.addIdentifier(HapiFHIRHelpers.createIdentifier(specimen.getSpecimenIdentifierIdentifierUse() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, specimen.getSpcmnDntfrDntfrTpCcCSstm() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, specimen.getSpcmnDntfrDntfrTpCcCVrsn() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, specimen.getSpcmnDntfrDntfrTpCcCCde() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, specimen.getSpcmnDntfrDntfrTpCcCDsplay() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, specimen.getSpcmnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, specimen.getSpcmnDntfrDntfrTpCcTxt() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, specimen.getSpcmnDntfrDntfrPrdPrdStrt() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, specimen.getSpcmnDntfrDntfrPrdPrdNd() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, specimen.getSpcmnDntfrDntfrSsgnr() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, specimen.getSpcmnDntfrDntfrVlue() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, specimen.getSpcmnDntfrDntfrSstm() /** { "tree" :"Specimen.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Specimenobj.setAccessionIdentifier(HapiFHIRHelpers.createIdentifier(specimen.getSpcmnCcssndntfrDntfrSe() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setUse"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcCSstm() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, addCoding, setSystem"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcCVrsn() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, addCoding, setVersion"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcCCde() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, addCoding, setCode"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcCDsplay() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, addCoding, setDisplay"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcCSrSlctd() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, addCoding, setUserSelected"} **/
						, specimen.getSpcmnCcssndntfrDntfrTpCcTxt() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setType, setText"} **/
						, specimen.getSpcmnCcssndntfrDntfrPrdPrdStrt() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setPeriod, setStart"} **/
						, specimen.getSpcmnCcssndntfrDntfrPrdPrdNd() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setPeriod, setEnd"} **/
						, specimen.getSpcmnCcssndntfrDntfrSsgnr() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setAssigner"} **/
						, specimen.getSpcmnCcssndntfrDntfrVlue() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setValue"} **/
						, specimen.getSpcmnCcssndntfrDntfrSstm() /** { "tree" :"Specimen.accessionIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccessionIdentifier, setSystem"} **/
						));
Specimenobj.setStatus(HapiFHIRHelpers.createcode(specimen.getSpecimenStatusCode() /** { "tree" :"Specimen.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Specimenobj.setType(HapiFHIRHelpers.createCodeableConcept(specimen.getSpecimenTypeCcCodingCSystem() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, specimen.getSpecimenTypeCcCodingCVersion() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, specimen.getSpecimenTypeCcCodingCCode() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, specimen.getSpecimenTypeCcCodingCDisplay() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, specimen.getSpcmnTpCcCdngCSrSlctd() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, specimen.getSpecimenTypeCcText() /** { "tree" :"Specimen.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Specimenobj.setSubject(HapiFHIRHelpers.createReference(specimen.getSpecimenSubjectReference() /** { "tree" :"Specimen.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Specimenobj.setReceivedTime(HapiFHIRHelpers.createdateTime(specimen.getSpecimenReceivedTimeDateTime() /** { "tree" :"Specimen.receivedTime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReceivedTime"} **/
						));
Specimenobj.addParent(HapiFHIRHelpers.createReference(specimen.getSpecimenParentReference() /** { "tree" :"Specimen.parent", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParent"} **/
						));
Specimenobj.addRequest(HapiFHIRHelpers.createReference(specimen.getSpecimenRequestReference() /** { "tree" :"Specimen.request", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRequest"} **/
						));
Specimenobj.setCollector(HapiFHIRHelpers.createReference(specimen.getSpcmnCllctnCllctrRfrnce() /** { "tree" :"Specimen.collection.collector", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollector"} **/
						));
Specimenobj.setCollected(HapiFHIRHelpers.createdateTimetype(specimen.getSpcmnCllctnCllctdDttmDtTme() /** { "tree" :"Specimen.collection.collectedDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedDatetime"} **/
						));
Specimenobj.setCollectedPeriod(HapiFHIRHelpers.createPeriod(specimen.getSpcmnCllctnCllctdPrdPrdStrt() /** { "tree" :"Specimen.collection.collectedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedPeriod, setStart"} **/
						, specimen.getSpcmnCllctnCllctdPrdPrdNd() /** { "tree" :"Specimen.collection.collectedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedPeriod, setEnd"} **/
						));
Specimenobj.setDuration(HapiFHIRHelpers.createDuration(specimen.getSpcmnCllctnDrtnDrtn() /** { "tree" :"Specimen.collection.duration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setDuration"} **/
						));
Specimenobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(specimen.getSpcmnCllctnQnttSmplQntty() /** { "tree" :"Specimen.collection.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setQuantity"} **/
						));
Specimenobj.setMethod(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCllctnMthdCcCdngCSstm() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, specimen.getSpcmnCllctnMthdCcCdngCVrsn() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, specimen.getSpcmnCllctnMthdCcCdngCCde() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, addCoding, setCode"} **/
						, specimen.getSpcmnCllctnMthdCcCdngCDsplay() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, specimen.getSpcmnCllctnMthdCcCdngCSrSlctd() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, specimen.getSpecimenCollectionMethodCcText() /** { "tree" :"Specimen.collection.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setMethod, setText"} **/
						));
Specimenobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCllctnBdStCcCdngCSstm() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, specimen.getSpcmnCllctnBdStCcCdngCVrsn() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, specimen.getSpcmnCllctnBdStCcCdngCCde() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, specimen.getSpcmnCllctnBdStCcCdngCDsplay() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, specimen.getSpcmnCllctnBdStCcCdngCSrSlctd() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, specimen.getSpcmnCllctnBdStCcTxt() /** { "tree" :"Specimen.collection.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setBodySite, setText"} **/
						));
Specimenobj.setFastingStatusCodeableconcept(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCllctnFstngSttsCdblcncptCcCdngCSstm() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, addCoding, setSystem"} **/
						, specimen.getSpcmnCllctnFstngSttsCdblcncptCcCdngCVrsn() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, addCoding, setVersion"} **/
						, specimen.getSpcmnCllctnFstngSttsCdblcncptCcCdngCCde() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, addCoding, setCode"} **/
						, specimen.getSpcmnCllctnFstngSttsCdblcncptCcCdngCDsplay() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, addCoding, setDisplay"} **/
						, specimen.getSpcmnCllctnFstngSttsCdblcncptCcCdngCSrSlctd() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, addCoding, setUserSelected"} **/
						, specimen.getSpcmnCllctnFstngSttsCdblcncptCcTxt() /** { "tree" :"Specimen.collection.fastingStatusCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusCodeableconcept, setText"} **/
						));
Specimenobj.setFastingStatusDuration(HapiFHIRHelpers.createDuration(specimen.getSpcmnCllctnFstngSttsDrtnDrtn() /** { "tree" :"Specimen.collection.fastingStatusDuration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setFastingStatusDuration"} **/
						));
Specimenobj.setDescription(HapiFHIRHelpers.createstring(specimen.getSpcmnPrcssngDscrptnStrng() /** { "tree" :"Specimen.processing.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setDescription"} **/
						));
Specimenobj.setProcedure(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnPrcssngPrcdrCcCdngCSstm() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setSystem"} **/
						, specimen.getSpcmnPrcssngPrcdrCcCdngCVrsn() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setVersion"} **/
						, specimen.getSpcmnPrcssngPrcdrCcCdngCCde() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setCode"} **/
						, specimen.getSpcmnPrcssngPrcdrCcCdngCDsplay() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setDisplay"} **/
						, specimen.getSpcmnPrcssngPrcdrCcCdngCSrSlctd() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setUserSelected"} **/
						, specimen.getSpcmnPrcssngPrcdrCcTxt() /** { "tree" :"Specimen.processing.procedure", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, setText"} **/
						));
Specimenobj.addAdditive(HapiFHIRHelpers.createReference(specimen.getSpcmnPrcssngDdtvRfrnce() /** { "tree" :"Specimen.processing.additive", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addProcessing"] , "methodName" : "addAdditive"} **/
						));
Specimenobj.setTime(HapiFHIRHelpers.createdateTimetype(specimen.getSpcmnPrcssngTmDttmDtTme() /** { "tree" :"Specimen.processing.timeDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimeDatetime"} **/
						));
Specimenobj.setTimePeriod(HapiFHIRHelpers.createPeriod(specimen.getSpcmnPrcssngTmPrdPrdStrt() /** { "tree" :"Specimen.processing.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimePeriod, setStart"} **/
						, specimen.getSpcmnPrcssngTmPrdPrdNd() /** { "tree" :"Specimen.processing.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimePeriod, setEnd"} **/
						));
Specimenobj.addIdentifier(HapiFHIRHelpers.createIdentifier(specimen.getSpcmnCntnrDntfrDntfrSe() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setUse"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcCSstm() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcCVrsn() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcCCde() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcCDsplay() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, specimen.getSpcmnCntnrDntfrDntfrTpCcTxt() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setType, setText"} **/
						, specimen.getSpcmnCntnrDntfrDntfrPrdPrdStrt() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, specimen.getSpcmnCntnrDntfrDntfrPrdPrdNd() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, specimen.getSpcmnCntnrDntfrDntfrSsgnr() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setAssigner"} **/
						, specimen.getSpcmnCntnrDntfrDntfrVlue() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setValue"} **/
						, specimen.getSpcmnCntnrDntfrDntfrSstm() /** { "tree" :"Specimen.container.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : ["addContainer"] , "methodName" : "addIdentifier, setSystem"} **/
						));
Specimenobj.setDescription(HapiFHIRHelpers.createstring(specimen.getSpcmnCntnrDscrptnStrng() /** { "tree" :"Specimen.container.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setDescription"} **/
						));
Specimenobj.setType(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCntnrTpCcCdngCSstm() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, addCoding, setSystem"} **/
						, specimen.getSpcmnCntnrTpCcCdngCVrsn() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, addCoding, setVersion"} **/
						, specimen.getSpcmnCntnrTpCcCdngCCde() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, addCoding, setCode"} **/
						, specimen.getSpcmnCntnrTpCcCdngCDsplay() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, specimen.getSpcmnCntnrTpCcCdngCSrSlctd() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, specimen.getSpecimenContainerTypeCcText() /** { "tree" :"Specimen.container.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setType, setText"} **/
						));
Specimenobj.setCapacity(HapiFHIRHelpers.createSimpleQuantity(specimen.getSpcmnCntnrCpctSmplQntty() /** { "tree" :"Specimen.container.capacity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setCapacity"} **/
						));
Specimenobj.setSpecimenQuantity(HapiFHIRHelpers.createSimpleQuantity(specimen.getSpcmnCntnrSpcmnQnttSmplQntty() /** { "tree" :"Specimen.container.specimenQuantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setSpecimenQuantity"} **/
						));
Specimenobj.setAdditiveCodeableconcept(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCntnrDdtvCdblcncptCcCdngCSstm() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, addCoding, setSystem"} **/
						, specimen.getSpcmnCntnrDdtvCdblcncptCcCdngCVrsn() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, addCoding, setVersion"} **/
						, specimen.getSpcmnCntnrDdtvCdblcncptCcCdngCCde() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, addCoding, setCode"} **/
						, specimen.getSpcmnCntnrDdtvCdblcncptCcCdngCDsplay() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, addCoding, setDisplay"} **/
						, specimen.getSpcmnCntnrDdtvCdblcncptCcCdngCSrSlctd() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, addCoding, setUserSelected"} **/
						, specimen.getSpcmnCntnrDdtvCdblcncptCcTxt() /** { "tree" :"Specimen.container.additiveCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveCodeableconcept, setText"} **/
						));
Specimenobj.setAdditiveReference(substance)(HapiFHIRHelpers.createReference(specimen.getSpcmnCntnrDdtvRfrncRfrnce() /** { "tree" :"Specimen.container.additiveReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addContainer"] , "methodName" : "setAdditiveReference(substance)"} **/
						));
Specimenobj.addCondition(HapiFHIRHelpers.createCodeableConcept(specimen.getSpcmnCndtnCcCdngCSstm() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setSystem"} **/
						, specimen.getSpcmnCndtnCcCdngCVrsn() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setVersion"} **/
						, specimen.getSpcmnCndtnCcCdngCCde() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setCode"} **/
						, specimen.getSpcmnCndtnCcCdngCDsplay() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setDisplay"} **/
						, specimen.getSpcmnCndtnCcCdngCSrSlctd() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setUserSelected"} **/
						, specimen.getSpecimenConditionCcText() /** { "tree" :"Specimen.condition", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, setText"} **/
						));
Specimenobj.addNote(HapiFHIRHelpers.createAnnotation(specimen.getSpecimenNoteAnnotationTime() /** { "tree" :"Specimen.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, specimen.getSpecimenNoteAnnotationText() /** { "tree" :"Specimen.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, specimen.getSpcmnNtNnttnThrRfrnce() /** { "tree" :"Specimen.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, specimen.getSpcmnNtNnttnThrStrng() /** { "tree" :"Specimen.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
