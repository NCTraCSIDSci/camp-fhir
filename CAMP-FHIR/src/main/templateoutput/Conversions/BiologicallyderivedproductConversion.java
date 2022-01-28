package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Biologicallyderivedproduct.
 * @see .Biologicallyderivedproduct
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class BiologicallyderivedproductConversion 
{
	public Patient Biologicallyderivedproducts(main.templateoutput.Model.Biologicallyderivedproduct biologicallyderivedproduct) 
	{
			Patient  Biologicallyderivedproductobj = new Patient(); 

						Biologicallyderivedproductobj.addIdentifier(HapiFHIRHelpers.createIdentifier(biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrSe() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcCSstm() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcCVrsn() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcCCde() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcCDsplay() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcCSrSlctd() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrTpCcTxt() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrPrdPrdStrt() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrPrdPrdNd() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrSsgnr() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrVlue() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctDntfrDntfrSstm() /** { "tree" :"BiologicallyDerivedProduct.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Biologicallyderivedproductobj.setProductCategory(HapiFHIRHelpers.createcode(biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCtgrCde() /** { "tree" :"BiologicallyDerivedProduct.productCategory", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCategory"} **/
						));
Biologicallyderivedproductobj.setProductCode(HapiFHIRHelpers.createCodeableConcept(biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcCdngCSstm() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, addCoding, setSystem"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcCdngCVrsn() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, addCoding, setVersion"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcCdngCCde() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, addCoding, setCode"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcCdngCDsplay() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, addCoding, setDisplay"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcCdngCSrSlctd() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, addCoding, setUserSelected"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrdctCdCcTxt() /** { "tree" :"BiologicallyDerivedProduct.productCode", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCode, setText"} **/
						));
Biologicallyderivedproductobj.setStatus(HapiFHIRHelpers.createcode(biologicallyderivedproduct.getBlgcllDrvdPrdctSttsCde() /** { "tree" :"BiologicallyDerivedProduct.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Biologicallyderivedproductobj.addRequest(HapiFHIRHelpers.createReference(biologicallyderivedproduct.getBlgcllDrvdPrdctRqstRfrnce() /** { "tree" :"BiologicallyDerivedProduct.request", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRequest"} **/
						));
Biologicallyderivedproductobj.setQuantity(HapiFHIRHelpers.createinteger(biologicallyderivedproduct.getBlgcllDrvdPrdctQnttNtgr() /** { "tree" :"BiologicallyDerivedProduct.quantity", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity"} **/
						));
Biologicallyderivedproductobj.addParent(HapiFHIRHelpers.createReference(biologicallyderivedproduct.getBlgcllDrvdPrdctPrntRfrnce() /** { "tree" :"BiologicallyDerivedProduct.parent", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParent"} **/
						));
Biologicallyderivedproductobj.setCollector(HapiFHIRHelpers.createReference(biologicallyderivedproduct.getBlgcllDrvdPrdctCllctnCllctrRfrnce() /** { "tree" :"BiologicallyDerivedProduct.collection.collector", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollector"} **/
						));
Biologicallyderivedproductobj.setSource(HapiFHIRHelpers.createReference(biologicallyderivedproduct.getBlgcllDrvdPrdctCllctnSrcRfrnce() /** { "tree" :"BiologicallyDerivedProduct.collection.source", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setSource"} **/
						));
Biologicallyderivedproductobj.setCollected(HapiFHIRHelpers.createdateTimetype(biologicallyderivedproduct.getBlgcllDrvdPrdctCllctnCllctdDttmDtTme() /** { "tree" :"BiologicallyDerivedProduct.collection.collectedDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedDatetime"} **/
						));
Biologicallyderivedproductobj.setCollectedPeriod(HapiFHIRHelpers.createPeriod(biologicallyderivedproduct.getBlgcllDrvdPrdctCllctnCllctdPrdPrdStrt() /** { "tree" :"BiologicallyDerivedProduct.collection.collectedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedPeriod, setStart"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctCllctnCllctdPrdPrdNd() /** { "tree" :"BiologicallyDerivedProduct.collection.collectedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setCollection"] , "methodName" : "setCollectedPeriod, setEnd"} **/
						));
Biologicallyderivedproductobj.setDescription(HapiFHIRHelpers.createstring(biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngDscrptnStrng() /** { "tree" :"BiologicallyDerivedProduct.processing.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setDescription"} **/
						));
Biologicallyderivedproductobj.setProcedure(HapiFHIRHelpers.createCodeableConcept(biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcCdngCSstm() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setSystem"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcCdngCVrsn() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setVersion"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcCdngCCde() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setCode"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcCdngCDsplay() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setDisplay"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcCdngCSrSlctd() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, addCoding, setUserSelected"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngPrcdrCcTxt() /** { "tree" :"BiologicallyDerivedProduct.processing.procedure", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setProcedure, setText"} **/
						));
Biologicallyderivedproductobj.setAdditive(HapiFHIRHelpers.createReference(biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngDdtvRfrnce() /** { "tree" :"BiologicallyDerivedProduct.processing.additive", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setAdditive"} **/
						));
Biologicallyderivedproductobj.setTime(HapiFHIRHelpers.createdateTimetype(biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngTmDttmDtTme() /** { "tree" :"BiologicallyDerivedProduct.processing.timeDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimeDatetime"} **/
						));
Biologicallyderivedproductobj.setTimePeriod(HapiFHIRHelpers.createPeriod(biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngTmPrdPrdStrt() /** { "tree" :"BiologicallyDerivedProduct.processing.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimePeriod, setStart"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctPrcssngTmPrdPrdNd() /** { "tree" :"BiologicallyDerivedProduct.processing.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcessing"] , "methodName" : "setTimePeriod, setEnd"} **/
						));
Biologicallyderivedproductobj.setDescription(HapiFHIRHelpers.createstring(biologicallyderivedproduct.getBlgcllDrvdPrdctMnpltnDscrptnStrng() /** { "tree" :"BiologicallyDerivedProduct.manipulation.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setManipulation"] , "methodName" : "setDescription"} **/
						));
Biologicallyderivedproductobj.setTime(HapiFHIRHelpers.createdateTimetype(biologicallyderivedproduct.getBlgcllDrvdPrdctMnpltnTmDttmDtTme() /** { "tree" :"BiologicallyDerivedProduct.manipulation.timeDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setManipulation"] , "methodName" : "setTimeDatetime"} **/
						));
Biologicallyderivedproductobj.setTimePeriod(HapiFHIRHelpers.createPeriod(biologicallyderivedproduct.getBlgcllDrvdPrdctMnpltnTmPrdPrdStrt() /** { "tree" :"BiologicallyDerivedProduct.manipulation.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setManipulation"] , "methodName" : "setTimePeriod, setStart"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctMnpltnTmPrdPrdNd() /** { "tree" :"BiologicallyDerivedProduct.manipulation.timePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setManipulation"] , "methodName" : "setTimePeriod, setEnd"} **/
						));
Biologicallyderivedproductobj.setDescription(HapiFHIRHelpers.createstring(biologicallyderivedproduct.getBlgcllDrvdPrdctStrgDscrptnStrng() /** { "tree" :"BiologicallyDerivedProduct.storage.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addStorage"] , "methodName" : "setDescription"} **/
						));
Biologicallyderivedproductobj.setTemperature(HapiFHIRHelpers.createdecimal(biologicallyderivedproduct.getBlgcllDrvdPrdctStrgTmprtrDcml() /** { "tree" :"BiologicallyDerivedProduct.storage.temperature", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addStorage"] , "methodName" : "setTemperature"} **/
						));
Biologicallyderivedproductobj.setScale(HapiFHIRHelpers.createcode(biologicallyderivedproduct.getBlgcllDrvdPrdctStrgSclCde() /** { "tree" :"BiologicallyDerivedProduct.storage.scale", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addStorage"] , "methodName" : "setScale"} **/
						));
Biologicallyderivedproductobj.setDuration(HapiFHIRHelpers.createPeriod(biologicallyderivedproduct.getBlgcllDrvdPrdctStrgDrtnPrdStrt() /** { "tree" :"BiologicallyDerivedProduct.storage.duration", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addStorage"] , "methodName" : "setDuration, setStart"} **/
						, biologicallyderivedproduct.getBlgcllDrvdPrdctStrgDrtnPrdNd() /** { "tree" :"BiologicallyDerivedProduct.storage.duration", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addStorage"] , "methodName" : "setDuration, setEnd"} **/
		));
	}
}
