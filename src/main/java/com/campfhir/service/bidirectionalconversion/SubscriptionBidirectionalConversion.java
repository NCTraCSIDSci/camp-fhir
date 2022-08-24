package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Subscription;
public class SubscriptionBidirectionalConversion 
{
	public Subscription Subscriptions(org.hl7.fhir.r4.model.Subscription subscription) throws ParseException
	{
		 main.java.com.campfhir.model.Subscription s = new  main.java.com.campfhir.model.Subscription();

		/******************** id ********************************************************************************/
		s.setId(subscription.getIdElement().getIdPart());

		/******************** subscriptionchannel ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent subscriptionchannel = subscription.getChannel();

		/******************** subscriptionchanneltype ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionChannelType subscriptionchanneltype = subscriptionchannel.getType();
		if(subscriptionchanneltype!=null) {
			s.addSubscriptionChannelTyp(subscriptionchanneltype.toCode());
		} else {
			s.addSubscriptionChannelTyp("NULL");
		}

		/******************** Subscription_Channel_Payload ********************************************************************************/
		if(subscriptionchannel.hasPayload()) {

			s.addSubscriptionChannelPayload(String.valueOf(subscriptionchannel.getPayload()));
		} else {
			s.addSubscriptionChannelPayload("NULL");
		}


		/******************** Subscription_Channel_Header ********************************************************************************/
		if(subscriptionchannel.hasHeader()) {

			String  array = "[";
			for(int incr=0; incr<subscriptionchannel.getHeader().size(); incr++) {
				array = array + subscriptionchannel.getHeader().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSubscriptionChannelHeader(array);

		} else {
			s.addSubscriptionChannelHeader("NULL");
		}


		/******************** Subscription_Channel_Endpoint ********************************************************************************/
		if(subscriptionchannel.hasEndpoint()) {

			s.addSubscriptionChannelEndpoint(String.valueOf(subscriptionchannel.getEndpoint()));
		} else {
			s.addSubscriptionChannelEndpoint("NULL");
		}


		/******************** Subscription_Rsn ********************************************************************************/
		if(subscription.hasReason()) {

			s.addSubscriptionRsn(String.valueOf(subscription.getReason()));
		} else {
			s.addSubscriptionRsn("NULL");
		}


		/******************** subscriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Subscription.SubscriptionStatus subscriptionstatus = subscription.getStatus();
		if(subscriptionstatus!=null) {
			s.addSubscriptionSts(subscriptionstatus.toCode());
		} else {
			s.addSubscriptionSts("NULL");
		}

		/******************** subscriptioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> subscriptioncontactlist = subscription.getContact();
		for(int subscriptioncontacti = 0; subscriptioncontacti<subscriptioncontactlist.size();subscriptioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactPoint  subscriptioncontact = subscriptioncontactlist.get(subscriptioncontacti);

		/******************** Subscription_Cntct_Vl ********************************************************************************/
		if(subscriptioncontacti == 0) {s.addSubscriptionCntctVl("[");}
		if(subscriptioncontact.hasValue()) {

			s.addSubscriptionCntctVl(String.valueOf(subscriptioncontact.getValue()));
		} else {
			s.addSubscriptionCntctVl("NULL");
		}

		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {s.addSubscriptionCntctVl("]");}


		/******************** subscriptioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period subscriptioncontactperiod = subscriptioncontact.getPeriod();

		/******************** Subscription_Cntct_Prd_Strt ********************************************************************************/
		if(subscriptioncontacti == 0) {s.addSubscriptionCntctPrdStrt("[");}
		if(subscriptioncontactperiod.hasStart()) {

			s.addSubscriptionCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(subscriptioncontactperiod.getStart())+"\"");
		} else {
			s.addSubscriptionCntctPrdStrt("NULL");
		}

		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {s.addSubscriptionCntctPrdStrt("]");}


		/******************** Subscription_Cntct_Prd_End ********************************************************************************/
		if(subscriptioncontacti == 0) {s.addSubscriptionCntctPrdEnd("[");}
		if(subscriptioncontactperiod.hasEnd()) {

			s.addSubscriptionCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(subscriptioncontactperiod.getEnd())+"\"");
		} else {
			s.addSubscriptionCntctPrdEnd("NULL");
		}

		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {s.addSubscriptionCntctPrdEnd("]");}


		/******************** subscriptioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse subscriptioncontactuse = subscriptioncontact.getUse();
		if(subscriptioncontactuse!=null) {
		if(subscriptioncontacti == 0) {

		s.addSubscriptionCntctUse("[");		}
			s.addSubscriptionCntctUse(subscriptioncontactuse.toCode());
		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {

		s.addSubscriptionCntctUse("]");		}

		} else {
			s.addSubscriptionCntctUse("NULL");
		}

		/******************** subscriptioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem subscriptioncontactsystem = subscriptioncontact.getSystem();
		if(subscriptioncontactsystem!=null) {
		if(subscriptioncontacti == 0) {

		s.addSubscriptionCntctSys("[");		}
			s.addSubscriptionCntctSys(subscriptioncontactsystem.toCode());
		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {

		s.addSubscriptionCntctSys("]");		}

		} else {
			s.addSubscriptionCntctSys("NULL");
		}

		/******************** Subscription_Cntct_Rnk ********************************************************************************/
		if(subscriptioncontacti == 0) {s.addSubscriptionCntctRnk("[");}
		if(subscriptioncontact.hasRank()) {

			s.addSubscriptionCntctRnk(String.valueOf(subscriptioncontact.getRank()));
		} else {
			s.addSubscriptionCntctRnk("NULL");
		}

		if(subscriptioncontacti == subscriptioncontactlist.size()-1) {s.addSubscriptionCntctRnk("]");}


		 };
		/******************** Subscription_Criteria ********************************************************************************/
		if(subscription.hasCriteria()) {

			s.addSubscriptionCriteria(String.valueOf(subscription.getCriteria()));
		} else {
			s.addSubscriptionCriteria("NULL");
		}


		/******************** Subscription_End ********************************************************************************/
		if(subscription.hasEnd()) {

			s.addSubscriptionEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(subscription.getEnd())+"\"");
		} else {
			s.addSubscriptionEnd("NULL");
		}


		/******************** Subscription_Error ********************************************************************************/
		if(subscription.hasError()) {

			s.addSubscriptionError(String.valueOf(subscription.getError()));
		} else {
			s.addSubscriptionError("NULL");
		}


		return s;
	}
}
