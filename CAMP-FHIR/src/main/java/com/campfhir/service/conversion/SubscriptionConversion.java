package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Subscription;
public class SubscriptionConversion 
{
	public org.hl7.fhir.r4.model.Subscription Subscriptions(Subscription s) throws ParseException
	{
		org.hl7.fhir.r4.model.Subscription subscription = new org.hl7.fhir.r4.model.Subscription();

		/******************** id ********************************************************************************/
		subscription.setId(s.getId());

		/******************** subscriptionchannel ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent subscriptionchannel =  new org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent();
		subscription.setChannel(subscriptionchannel);

		/******************** Subscription_Channel_Endpoint ********************************************************************************/
		if(s.getSubscriptionChannelEndpoint() != null) {
			subscriptionchannel.setEndpoint(s.getSubscriptionChannelEndpoint());
		}
		/******************** Subscription_Channel_Header ********************************************************************************/
		if(s.getSubscriptionChannelHeader() != null) {
			subscriptionchannel.addHeader(s.getSubscriptionChannelHeader());
		}
		/******************** Subscription_Channel_Payload ********************************************************************************/
		if(s.getSubscriptionChannelPayload() != null) {
			subscriptionchannel.setPayload(s.getSubscriptionChannelPayload());
		}
		/******************** subscriptionchanneltype ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelTypeEnumFactory subscriptionchanneltype =  new org.hl7.fhir.r4.model.Subscription.SubscriptionChannelTypeEnumFactory();
		subscriptionchannel.setType(subscriptionchanneltype.fromCode(s.getSubscriptionChannelTyp()));

		/******************** subscriptioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint subscriptioncontact =  new org.hl7.fhir.r4.model.ContactPoint();
		subscription.addContact(subscriptioncontact);

		/******************** subscriptioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period subscriptioncontactperiod =  new org.hl7.fhir.r4.model.Period();
		subscriptioncontact.setPeriod(subscriptioncontactperiod);

		/******************** Subscription_Cntct_Prd_End ********************************************************************************/
		if(s.getSubscriptionCntctPrdEnd() != null) {
			java.text.SimpleDateFormat Subscription_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Subscription_Cntct_Prd_Enddate = Subscription_Cntct_Prd_Endsdf.parse(s.getSubscriptionCntctPrdEnd());
			subscriptioncontactperiod.setEnd(Subscription_Cntct_Prd_Enddate);
		}
		/******************** Subscription_Cntct_Prd_Strt ********************************************************************************/
		if(s.getSubscriptionCntctPrdStrt() != null) {
			java.text.SimpleDateFormat Subscription_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Subscription_Cntct_Prd_Strtdate = Subscription_Cntct_Prd_Strtsdf.parse(s.getSubscriptionCntctPrdStrt());
			subscriptioncontactperiod.setStart(Subscription_Cntct_Prd_Strtdate);
		}
		/******************** Subscription_Cntct_Rnk ********************************************************************************/
		if(s.getSubscriptionCntctRnk() != null) {
			subscriptioncontact.setRank(Integer.parseInt(s.getSubscriptionCntctRnk()));
		}
		/******************** subscriptioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory subscriptioncontactsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		subscriptioncontact.setSystem(subscriptioncontactsystem.fromCode(s.getSubscriptionCntctSys()));

		/******************** subscriptioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory subscriptioncontactuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		subscriptioncontact.setUse(subscriptioncontactuse.fromCode(s.getSubscriptionCntctUse()));

		/******************** Subscription_Cntct_Vl ********************************************************************************/
		if(s.getSubscriptionCntctVl() != null) {
			subscriptioncontact.setValue(s.getSubscriptionCntctVl());
		}
		/******************** Subscription_Criteria ********************************************************************************/
		if(s.getSubscriptionCriteria() != null) {
			subscription.setCriteria(s.getSubscriptionCriteria());
		}
		/******************** Subscription_End ********************************************************************************/
		if(s.getSubscriptionEnd() != null) {
			java.text.SimpleDateFormat Subscription_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Subscription_Enddate = Subscription_Endsdf.parse(s.getSubscriptionEnd());
			subscription.setEnd(Subscription_Enddate);
		}
		/******************** Subscription_Error ********************************************************************************/
		if(s.getSubscriptionError() != null) {
			subscription.setError(s.getSubscriptionError());
		}
		/******************** Subscription_Rsn ********************************************************************************/
		if(s.getSubscriptionRsn() != null) {
			subscription.setReason(s.getSubscriptionRsn());
		}
		/******************** subscriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionStatusEnumFactory subscriptionstatus =  new org.hl7.fhir.r4.model.Subscription.SubscriptionStatusEnumFactory();
		subscription.setStatus(subscriptionstatus.fromCode(s.getSubscriptionSts()));

		return subscription;
	}
}
