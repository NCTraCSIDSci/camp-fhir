package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Bundle.
 * @see .Bundle
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class BundleConversion 
{
	public Patient Bundles(main.templateoutput.Model.Bundle bundle) 
	{
			Patient  Bundleobj = new Patient(); 

						Bundleobj.setIdentifier(HapiFHIRHelpers.createIdentifier(bundle.getBundleIdentifierIdentifierUse() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, bundle.getBndlDntfrDntfrTpCcCSstm() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, bundle.getBndlDntfrDntfrTpCcCVrsn() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, bundle.getBndlDntfrDntfrTpCcCCde() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, bundle.getBndlDntfrDntfrTpCcCDsplay() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, bundle.getBndlDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, bundle.getBndlDntfrDntfrTpCcTxt() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, bundle.getBndlDntfrDntfrPrdPrdStrt() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, bundle.getBndlDntfrDntfrPrdPrdNd() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, bundle.getBndlDntfrDntfrSsgnr() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, bundle.getBundleIdentifierIdentifierValue() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, bundle.getBndlDntfrDntfrSstm() /** { "tree" :"Bundle.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Bundleobj.setType(HapiFHIRHelpers.createcode(bundle.getBundleTypeCode() /** { "tree" :"Bundle.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType"} **/
						));
Bundleobj.setTimestamp(HapiFHIRHelpers.createinstant(bundle.getBundleTimestampInstant() /** { "tree" :"Bundle.timestamp", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimestamp"} **/
						));
Bundleobj.setTotal(HapiFHIRHelpers.createunsignedInt(bundle.getBundleTotalUnsignedInt() /** { "tree" :"Bundle.total", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotal"} **/
						));
Bundleobj.setRelation(HapiFHIRHelpers.createstring(bundle.getBundleLinkRelationString() /** { "tree" :"Bundle.link.relation", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addLink"] , "methodName" : "setRelation"} **/
						));
Bundleobj.setUrl(HapiFHIRHelpers.createuri(bundle.getBundleLinkUrlUri() /** { "tree" :"Bundle.link.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addLink"] , "methodName" : "setUrl"} **/
						));
Bundleobj.addLink(HapiFHIRHelpers.createlink(bundle.getBundleEntryLinkLink() /** { "tree" :"Bundle.entry.link", "datatype" : "link", "cardinality" : "Many", "elementtree" : ["addEntry"] , "methodName" : "addLink"} **/
						));
Bundleobj.setFullUrl(HapiFHIRHelpers.createuri(bundle.getBundleEntryFullUrlUri() /** { "tree" :"Bundle.entry.fullUrl", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFullUrl"} **/
						));
Bundleobj.setResource(HapiFHIRHelpers.createResource(bundle.getBundleEntryResourceResource() /** { "tree" :"Bundle.entry.resource", "datatype" : "Resource", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setResource"} **/
						));
Bundleobj.setMode(HapiFHIRHelpers.createcode(bundle.getBundleEntrySearchModeCode() /** { "tree" :"Bundle.entry.search.mode", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch"] , "methodName" : "setMode"} **/
						));
Bundleobj.setScore(HapiFHIRHelpers.createdecimal(bundle.getBundleEntrySearchScoreDecimal() /** { "tree" :"Bundle.entry.search.score", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch"] , "methodName" : "setScore"} **/
						));
Bundleobj.setMethod(HapiFHIRHelpers.createcode(bundle.getBundleEntryRequestMethodCode() /** { "tree" :"Bundle.entry.request.method", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setMethod"} **/
						));
Bundleobj.setUrl(HapiFHIRHelpers.createuri(bundle.getBundleEntryRequestUrlUri() /** { "tree" :"Bundle.entry.request.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setUrl"} **/
						));
Bundleobj.setIfNoneMatch(HapiFHIRHelpers.createstring(bundle.getBndlNtrRqstFNnMtchStrng() /** { "tree" :"Bundle.entry.request.ifNoneMatch", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setIfNoneMatch"} **/
						));
Bundleobj.setIfModifiedSince(HapiFHIRHelpers.createinstant(bundle.getBndlNtrRqstFMdfdSncNstnt() /** { "tree" :"Bundle.entry.request.ifModifiedSince", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setIfModifiedSince"} **/
						));
Bundleobj.setIfMatch(HapiFHIRHelpers.createstring(bundle.getBndlNtrRqstFMtchStrng() /** { "tree" :"Bundle.entry.request.ifMatch", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setIfMatch"} **/
						));
Bundleobj.setIfNoneExist(HapiFHIRHelpers.createstring(bundle.getBndlNtrRqstFNnxstStrng() /** { "tree" :"Bundle.entry.request.ifNoneExist", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest"] , "methodName" : "setIfNoneExist"} **/
						));
Bundleobj.setStatus(HapiFHIRHelpers.createstring(bundle.getBndlNtrRspnsSttsStrng() /** { "tree" :"Bundle.entry.response.status", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addEntry", "setSearch", "setRequest", "setResponse"] , "methodName" : "setStatus"} **/
						));
Bundleobj.setLocation(HapiFHIRHelpers.createuri(bundle.getBundleEntryResponseLocationUri() /** { "tree" :"Bundle.entry.response.location", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest", "setResponse"] , "methodName" : "setLocation"} **/
						));
Bundleobj.setEtag(HapiFHIRHelpers.createstring(bundle.getBundleEntryResponseEtagString() /** { "tree" :"Bundle.entry.response.etag", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest", "setResponse"] , "methodName" : "setEtag"} **/
						));
Bundleobj.setLastModified(HapiFHIRHelpers.createinstant(bundle.getBndlNtrRspnsLstMdfdNstnt() /** { "tree" :"Bundle.entry.response.lastModified", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest", "setResponse"] , "methodName" : "setLastModified"} **/
						));
Bundleobj.setOutcome(HapiFHIRHelpers.createResource(bundle.getBndlNtrRspnsTcmRsrce() /** { "tree" :"Bundle.entry.response.outcome", "datatype" : "Resource", "cardinality" : "ZeroOne", "elementtree" : ["addEntry", "setSearch", "setRequest", "setResponse"] , "methodName" : "setOutcome"} **/
						));
Bundleobj.setSignature(HapiFHIRHelpers.createSignature(bundle.getBundleSignatureSignatureData() /** { "tree" :"Bundle.signature", "datatype" : "Signature, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setData"} **/
						, bundle.getBndlSgntrSgntrTrgtFrmt() /** { "tree" :"Bundle.signature", "datatype" : "Signature, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setTargetFormat"} **/
						, bundle.getBndlSgntrSgntrSgFrmt() /** { "tree" :"Bundle.signature", "datatype" : "Signature, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setSigFormat"} **/
						, bundle.getBndlSgntrSgntrTpCSstm() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, addType, setSystem"} **/
						, bundle.getBndlSgntrSgntrTpCVrsn() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, addType, setVersion"} **/
						, bundle.getBndlSgntrSgntrTpCCde() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, addType, setCode"} **/
						, bundle.getBndlSgntrSgntrTpCDsplay() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, addType, setDisplay"} **/
						, bundle.getBndlSgntrSgntrTpCSrSlctd() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, addType, setUserSelected"} **/
						, bundle.getBundleSignatureSignatureWhen() /** { "tree" :"Bundle.signature", "datatype" : "Signature, instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setWhen"} **/
						, bundle.getBundleSignatureSignatureWho() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setWho"} **/
						, bundle.getBndlSgntrSgntrNBhlff() /** { "tree" :"Bundle.signature", "datatype" : "Signature, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSignature, setOnBehalfOf"} **/
		));
	}
}
