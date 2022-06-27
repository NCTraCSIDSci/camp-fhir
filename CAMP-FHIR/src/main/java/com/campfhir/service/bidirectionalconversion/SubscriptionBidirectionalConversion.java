package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Subscription;
public class SubscriptionBidirectionalConversion 
{
	public Subscription Subscriptions(org.hl7.fhir.r4.model.Subscription subscription) throws ParseException
	{
		 main.java.com.campfhir.model.Subscription s = new  main.java.com.campfhir.model.Subscription();

		/******************** id ********************************************************************************/
		subscription.setId(s.getId());

		/******************** subscriptionchannel ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent subscriptionchannel = subscription.getChannel();

		/******************** subscriptionchanneltype ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelType subscriptionchanneltype = subscriptionchannel.getType();
		s.setSubscriptionChannelTyp(subscriptionchanneltype.toCode());

		/******************** Subscription_Channel_Payload ********************************************************************************/
		if(subscriptionchannel.hasPayload()) {
			s.setSubscriptionChannelPayload(String.valueOf(subscriptionchannel.getPayload()));
		}
		/******************** Subscription_Channel_Endpoint ********************************************************************************/
		if(subscriptionchannel.hasEndpoint()) {
			s.setSubscriptionChannelEndpoint(String.valueOf(subscriptionchannel.getEndpoint()));
		}
		/******************** Subscription_Rsn ********************************************************************************/
		if(subscription.hasReason()) {
			s.setSubscriptionRsn(String.valueOf(subscription.getReason()));
		}
		/******************** Subscription_Error ********************************************************************************/
		if(subscription.hasError()) {
			s.setSubscriptionError(String.valueOf(subscription.getError()));
		}
		/******************** subscriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionStatus subscriptionstatus = subscription.getStatus();
		s.setSubscriptionSts(subscriptionstatus.toCode());

		/******************** Subscription_End ********************************************************************************/
		if(subscription.hasEnd()) {
			s.setSubscriptionEnd(String.valueOf(subscription.getEnd()));
		}
		/******************** subscriptioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint subscriptioncontact = subscription.getContactFirstRep();

		/******************** Subscription_Cntct_Vl ********************************************************************************/
		if(subscriptioncontact.hasValue()) {
			s.setSubscriptionCntctVl(String.valueOf(subscriptioncontact.getValue()));
		}
		/******************** subscriptioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period subscriptioncontactperiod = subscriptioncontact.getPeriod();

		/******************** Subscription_Cntct_Prd_Strt ********************************************************************************/
		if(subscriptioncontactperiod.hasStart()) {
			s.setSubscriptionCntctPrdStrt(String.valueOf(subscriptioncontactperiod.getStart()));
		}
		/******************** Subscription_Cntct_Prd_End ********************************************************************************/
		if(subscriptioncontactperiod.hasEnd()) {
			s.setSubscriptionCntctPrdEnd(String.valueOf(subscriptioncontactperiod.getEnd()));
		}
		/******************** subscriptioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem subscriptioncontactsystem = subscriptioncontact.getSystem();
		s.setSubscriptionCntctSys(subscriptioncontactsystem.toCode());

		/******************** subscriptioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse subscriptioncontactuse = subscriptioncontact.getUse();
		s.setSubscriptionCntctUse(subscriptioncontactuse.toCode());

		/******************** Subscription_Cntct_Rnk ********************************************************************************/
		if(subscriptioncontact.hasRank()) {
			s.setSubscriptionCntctRnk(String.valueOf(subscriptioncontact.getRank()));
		}
		/******************** Subscription_Criteria ********************************************************************************/
		if(subscription.hasCriteria()) {
			s.setSubscriptionCriteria(String.valueOf(subscription.getCriteria()));
		}
		return s;
	}
}
