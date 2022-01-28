package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Subscription.
 * @see .Subscription
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SubscriptionConversion 
{
	public Patient Subscriptions(main.templateoutput.Model.Subscription subscription) 
	{
			Patient  Subscriptionobj = new Patient(); 

						Subscriptionobj.setStatus(HapiFHIRHelpers.createcode(subscription.getSubscriptionStatusCode() /** { "tree" :"Subscription.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Subscriptionobj.addContact(HapiFHIRHelpers.createContactPoint(subscription.getSbscrptnCntctCntctPntSstm() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setSystem"} **/
						, subscription.getSbscrptnCntctCntctPntSe() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setUse"} **/
						, subscription.getSbscrptnCntctCntctPntPrdPrdStrt() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setStart"} **/
						, subscription.getSbscrptnCntctCntctPntPrdPrdNd() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setEnd"} **/
						, subscription.getSbscrptnCntctCntctPntRnk() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setRank"} **/
						, subscription.getSbscrptnCntctCntctPntVlue() /** { "tree" :"Subscription.contact", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setValue"} **/
						));
Subscriptionobj.setEnd(HapiFHIRHelpers.createinstant(subscription.getSubscriptionEndInstant() /** { "tree" :"Subscription.end", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnd"} **/
						));
Subscriptionobj.setReason(HapiFHIRHelpers.createstring(subscription.getSubscriptionReasonString() /** { "tree" :"Subscription.reason", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setReason"} **/
						));
Subscriptionobj.setCriteria(HapiFHIRHelpers.createstring(subscription.getSubscriptionCriteriaString() /** { "tree" :"Subscription.criteria", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCriteria"} **/
						));
Subscriptionobj.setError(HapiFHIRHelpers.createstring(subscription.getSubscriptionErrorString() /** { "tree" :"Subscription.error", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setError"} **/
						));
Subscriptionobj.setType(HapiFHIRHelpers.createcode(subscription.getSubscriptionChannelTypeCode() /** { "tree" :"Subscription.channel.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setChannel"] , "methodName" : "setType"} **/
						));
Subscriptionobj.setEndpoint(HapiFHIRHelpers.createurl(subscription.getSubscriptionChannelEndpointUrl() /** { "tree" :"Subscription.channel.endpoint", "datatype" : "url", "cardinality" : "ZeroOne", "elementtree" : ["setChannel"] , "methodName" : "setEndpoint"} **/
						));
Subscriptionobj.setPayload(HapiFHIRHelpers.createcode(subscription.getSubscriptionChannelPayloadCode() /** { "tree" :"Subscription.channel.payload", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setChannel"] , "methodName" : "setPayload"} **/
						));
Subscriptionobj.addHeader(HapiFHIRHelpers.createstring(subscription.getSubscriptionChannelHeaderString() /** { "tree" :"Subscription.channel.header", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["setChannel"] , "methodName" : "addHeader"} **/
		));
	}
}
