package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Supplydelivery.
 * @see .Supplydelivery
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SupplydeliveryConversion 
{
	public Patient Supplydeliverys(main.templateoutput.Model.Supplydelivery supplydelivery) 
	{
			Patient  Supplydeliveryobj = new Patient(); 

						Supplydeliveryobj.addIdentifier(HapiFHIRHelpers.createIdentifier(supplydelivery.getSpplDlvrDntfrDntfrSe() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcCSstm() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcCVrsn() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcCCde() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcCDsplay() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrTpCcTxt() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrPrdPrdStrt() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrPrdPrdNd() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrSsgnr() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrVlue() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, supplydelivery.getSpplDlvrDntfrDntfrSstm() /** { "tree" :"SupplyDelivery.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Supplydeliveryobj.addBasedOn(HapiFHIRHelpers.createReference(supplydelivery.getSupplyDeliveryBasedOnReference() /** { "tree" :"SupplyDelivery.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Supplydeliveryobj.addPartOf(HapiFHIRHelpers.createReference(supplydelivery.getSupplyDeliveryPartOfReference() /** { "tree" :"SupplyDelivery.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Supplydeliveryobj.setStatus(HapiFHIRHelpers.createcode(supplydelivery.getSupplyDeliveryStatusCode() /** { "tree" :"SupplyDelivery.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Supplydeliveryobj.setPatient(HapiFHIRHelpers.createReference(supplydelivery.getSupplyDeliveryPntReference() /** { "tree" :"SupplyDelivery.patient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Supplydeliveryobj.setType(HapiFHIRHelpers.createCodeableConcept(supplydelivery.getSpplDlvrTpCcCdngCSstm() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, supplydelivery.getSpplDlvrTpCcCdngCVrsn() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, supplydelivery.getSpplDlvrTpCcCdngCCde() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, supplydelivery.getSpplDlvrTpCcCdngCDsplay() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, supplydelivery.getSpplDlvrTpCcCdngCSrSlctd() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, supplydelivery.getSupplyDeliveryTypeCcText() /** { "tree" :"SupplyDelivery.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Supplydeliveryobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(supplydelivery.getSpplDlvrSppldtmQnttSmplQntty() /** { "tree" :"SupplyDelivery.suppliedItem.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setQuantity"} **/
						));
Supplydeliveryobj.setItemCodeableconcept(HapiFHIRHelpers.createCodeableConcept(supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcCdngCSstm() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, addCoding, setSystem"} **/
						, supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcCdngCVrsn() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, addCoding, setVersion"} **/
						, supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcCdngCCde() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, addCoding, setCode"} **/
						, supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcCdngCDsplay() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, addCoding, setDisplay"} **/
						, supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcCdngCSrSlctd() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, addCoding, setUserSelected"} **/
						, supplydelivery.getSpplDlvrSppldtmTmCdblcncptCcTxt() /** { "tree" :"SupplyDelivery.suppliedItem.itemCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemCodeableconcept, setText"} **/
						));
Supplydeliveryobj.setItemReference(medication | substance | device)(HapiFHIRHelpers.createReference(supplydelivery.getSpplDlvrSppldtmTmRfrncRfrnce() /** { "tree" :"SupplyDelivery.suppliedItem.itemReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setSuppliedItem"] , "methodName" : "setItemReference(medication | substance | device)"} **/
						));
Supplydeliveryobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(supplydelivery.getSpplDlvrCcrrncDttmDtTme() /** { "tree" :"SupplyDelivery.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Supplydeliveryobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(supplydelivery.getSpplDlvrCcrrncPrdPrdStrt() /** { "tree" :"SupplyDelivery.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, supplydelivery.getSpplDlvrCcrrncPrdPrdNd() /** { "tree" :"SupplyDelivery.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Supplydeliveryobj.setOccurrenceTiming(HapiFHIRHelpers.createTiming(supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcCSstm() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setSystem"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcCVrsn() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setVersion"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcCCde() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setCode"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcCDsplay() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setDisplay"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcCSrSlctd() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setUserSelected"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngCdCcTxt() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, setText"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngVnt() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, addEvent"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptDrtnnt() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationUnit"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptPrdnt() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodUnit"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptDfWk() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addDayOfWeek"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptWhn() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addWhen"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptDrtn() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDuration"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptDrtnMx() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationMax"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptPrd() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriod"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptPrdMx() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodMax"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptBndsDrtn() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsDuration"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptBndsPrd() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsPeriod"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptCnt() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCount"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptCntMx() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCountMax"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptFrqncy() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequency"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptFrqncMx() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequencyMax"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptBndsRnge() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsRange"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptTmfDay() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addTimeOfDay"} **/
						, supplydelivery.getSpplDlvrCcrrncTmngTmngRptFfst() /** { "tree" :"SupplyDelivery.occurrenceTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setOffset"} **/
						));
Supplydeliveryobj.setSupplier(HapiFHIRHelpers.createReference(supplydelivery.getSupplyDeliverySupplierReference() /** { "tree" :"SupplyDelivery.supplier", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSupplier"} **/
						));
Supplydeliveryobj.setDestination(HapiFHIRHelpers.createReference(supplydelivery.getSpplDlvrDstntnRfrnce() /** { "tree" :"SupplyDelivery.destination", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDestination"} **/
						));
Supplydeliveryobj.addReceiver(HapiFHIRHelpers.createReference(supplydelivery.getSupplyDeliveryReceiverReference() /** { "tree" :"SupplyDelivery.receiver", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReceiver"} **/
		));
	}
}
