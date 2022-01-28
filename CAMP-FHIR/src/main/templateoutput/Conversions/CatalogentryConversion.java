package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Catalogentry.
 * @see .Catalogentry
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CatalogentryConversion 
{
	public Patient Catalogentrys(main.templateoutput.Model.Catalogentry catalogentry) 
	{
			Patient  Catalogentryobj = new Patient(); 

						Catalogentryobj.addIdentifier(HapiFHIRHelpers.createIdentifier(catalogentry.getCtlgntrDntfrDntfrSe() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcCSstm() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcCVrsn() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcCCde() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcCDsplay() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, catalogentry.getCtlgntrDntfrDntfrTpCcTxt() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, catalogentry.getCtlgntrDntfrDntfrPrdPrdStrt() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, catalogentry.getCtlgntrDntfrDntfrPrdPrdNd() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, catalogentry.getCtlgntrDntfrDntfrSsgnr() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, catalogentry.getCtlgntrDntfrDntfrVlue() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, catalogentry.getCtlgntrDntfrDntfrSstm() /** { "tree" :"CatalogEntry.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Catalogentryobj.setType(HapiFHIRHelpers.createCodeableConcept(catalogentry.getCtlgntrTpCcCdngCSstm() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrTpCcCdngCVrsn() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, catalogentry.getCatalogEntryTypeCcCodingCCode() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, catalogentry.getCtlgntrTpCcCdngCDsplay() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrTpCcCdngCSrSlctd() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, catalogentry.getCatalogEntryTypeCcText() /** { "tree" :"CatalogEntry.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Catalogentryobj.setOrderable(HapiFHIRHelpers.createboolean(catalogentry.getCatalogEntryOrderableBoolean() /** { "tree" :"CatalogEntry.orderable", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setOrderable"} **/
						));
Catalogentryobj.setReferencedItem(HapiFHIRHelpers.createReference(catalogentry.getCtlgntrRfrncdtmRfrnce() /** { "tree" :"CatalogEntry.referencedItem", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setReferencedItem"} **/
						));
Catalogentryobj.addAdditionalIdentifier(HapiFHIRHelpers.createIdentifier(catalogentry.getCtlgntrDdtnldntfrDntfrSe() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setUse"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcCSstm() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcCVrsn() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, addCoding, setVersion"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcCCde() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, addCoding, setCode"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcCDsplay() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcCSrSlctd() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, addCoding, setUserSelected"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrTpCcTxt() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setType, setText"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrPrdPrdStrt() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setPeriod, setStart"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrPrdPrdNd() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setPeriod, setEnd"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrSsgnr() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setAssigner"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrVlue() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setValue"} **/
						, catalogentry.getCtlgntrDdtnldntfrDntfrSstm() /** { "tree" :"CatalogEntry.additionalIdentifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalIdentifier, setSystem"} **/
						));
Catalogentryobj.addClassification(HapiFHIRHelpers.createCodeableConcept(catalogentry.getCtlgntrClssfctnCcCdngCSstm() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrClssfctnCcCdngCVrsn() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, addCoding, setVersion"} **/
						, catalogentry.getCtlgntrClssfctnCcCdngCCde() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, addCoding, setCode"} **/
						, catalogentry.getCtlgntrClssfctnCcCdngCDsplay() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrClssfctnCcCdngCSrSlctd() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, addCoding, setUserSelected"} **/
						, catalogentry.getCtlgntrClssfctnCcTxt() /** { "tree" :"CatalogEntry.classification", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addClassification, setText"} **/
						));
Catalogentryobj.setStatus(HapiFHIRHelpers.createcode(catalogentry.getCatalogEntryStatusCode() /** { "tree" :"CatalogEntry.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Catalogentryobj.setValidityPeriod(HapiFHIRHelpers.createPeriod(catalogentry.getCtlgntrVldtPrdPrdStrt() /** { "tree" :"CatalogEntry.validityPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValidityPeriod, setStart"} **/
						, catalogentry.getCtlgntrVldtPrdPrdNd() /** { "tree" :"CatalogEntry.validityPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValidityPeriod, setEnd"} **/
						));
Catalogentryobj.setValidTo(HapiFHIRHelpers.createdateTime(catalogentry.getCatalogEntryValidToDateTime() /** { "tree" :"CatalogEntry.validTo", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValidTo"} **/
						));
Catalogentryobj.setLastUpdated(HapiFHIRHelpers.createdateTime(catalogentry.getCatalogEntryLastUpdatedDateTime() /** { "tree" :"CatalogEntry.lastUpdated", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastUpdated"} **/
						));
Catalogentryobj.addAdditionalCharacteristic(HapiFHIRHelpers.createCodeableConcept(catalogentry.getCtlgntrDdtnlchrctrCcCdngCSstm() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrDdtnlchrctrCcCdngCVrsn() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, addCoding, setVersion"} **/
						, catalogentry.getCtlgntrDdtnlchrctrCcCdngCCde() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, addCoding, setCode"} **/
						, catalogentry.getCtlgntrDdtnlchrctrCcCdngCDsplay() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrDdtnlchrctrCcCdngCSrSlctd() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, addCoding, setUserSelected"} **/
						, catalogentry.getCtlgntrDdtnlchrctrCcTxt() /** { "tree" :"CatalogEntry.additionalCharacteristic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalCharacteristic, setText"} **/
						));
Catalogentryobj.addAdditionalClassification(HapiFHIRHelpers.createCodeableConcept(catalogentry.getCtlgntrDdtnlClssfctnCcCdngCSstm() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, addCoding, setSystem"} **/
						, catalogentry.getCtlgntrDdtnlClssfctnCcCdngCVrsn() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, addCoding, setVersion"} **/
						, catalogentry.getCtlgntrDdtnlClssfctnCcCdngCCde() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, addCoding, setCode"} **/
						, catalogentry.getCtlgntrDdtnlClssfctnCcCdngCDsplay() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, addCoding, setDisplay"} **/
						, catalogentry.getCtlgntrDdtnlClssfctnCcCdngCSrSlctd() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, addCoding, setUserSelected"} **/
						, catalogentry.getCtlgntrDdtnlClssfctnCcTxt() /** { "tree" :"CatalogEntry.additionalClassification", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdditionalClassification, setText"} **/
						));
Catalogentryobj.setRelationtype(HapiFHIRHelpers.createcode(catalogentry.getCtlgntrRltdntrRltntpCde() /** { "tree" :"CatalogEntry.relatedEntry.relationtype", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRelatedEntry"] , "methodName" : "setRelationtype"} **/
						));
Catalogentryobj.setItem(HapiFHIRHelpers.createReference(catalogentry.getCtlgntrRltdntrTmRfrnce() /** { "tree" :"CatalogEntry.relatedEntry.item", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addRelatedEntry"] , "methodName" : "setItem"} **/
		));
	}
}
