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

		/******************** Subscription_Channel_Endpoint ********************************************************************************/
		if(s.getSubscriptionChannelEndpoint() != null ) {

			if(s.getSubscriptionChannelEndpoint().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionChannelEndpoint()==null) {} else {
			subscription.getChannel().setEndpoint(s.getSubscriptionChannelEndpoint().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Subscription_Channel_Header ********************************************************************************/
		if(s.getSubscriptionChannelHeader() != null ) {

				for( String currListStrSplit : s.getSubscriptionChannelHeader().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			subscription.getChannel().addHeader(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Subscription_Channel_Payload ********************************************************************************/
		if(s.getSubscriptionChannelPayload() != null ) {

			if(s.getSubscriptionChannelPayload().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionChannelPayload()==null) {} else {
			subscription.getChannel().setPayload(s.getSubscriptionChannelPayload().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Subscription_Channel_Typ ********************************************************************************/
		if(s.getSubscriptionChannelTyp() != null ) {

			if(s.getSubscriptionChannelTyp().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionChannelTyp()==null) {} else {
			subscription.getChannel().setType(new org.hl7.fhir.r4.model.Subscription.SubscriptionChannelTypeEnumFactory().fromCode(s.getSubscriptionChannelTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Subscription_Cntct_Prd_End ********************************************************************************/
		if(s.getSubscriptionCntctPrdEnd() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Subscription_Cntct_Prd_Strt ********************************************************************************/
		if(s.getSubscriptionCntctPrdStrt() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Subscription_Cntct_Rnk ********************************************************************************/
		if(s.getSubscriptionCntctRnk() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Subscription_Cntct_Sys ********************************************************************************/
		if(s.getSubscriptionCntctSys() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Subscription_Cntct_Use ********************************************************************************/
		if(s.getSubscriptionCntctUse() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Subscription_Cntct_Vl ********************************************************************************/
		if(s.getSubscriptionCntctVl() != null ) {

			String[] arrayi0 = s.getSubscriptionCntctVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(subscription.getContact().size() < i0+1) { subscription.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {subscription.getContact().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Subscription_Criteria ********************************************************************************/
		if(s.getSubscriptionCriteria() != null ) {

			if(s.getSubscriptionCriteria().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionCriteria()==null) {} else {
			subscription.setCriteria(s.getSubscriptionCriteria().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Subscription_End ********************************************************************************/
		if(s.getSubscriptionEnd() != null ) {

			if(s.getSubscriptionEnd().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionEnd()==null) {} else {
			subscription.setEnd(s.getSubscriptionEnd().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSubscriptionEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Subscription_Error ********************************************************************************/
		if(s.getSubscriptionError() != null ) {

			if(s.getSubscriptionError().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionError()==null) {} else {
			subscription.setError(s.getSubscriptionError().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Subscription_Rsn ********************************************************************************/
		if(s.getSubscriptionRsn() != null ) {

			if(s.getSubscriptionRsn().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionRsn()==null) {} else {
			subscription.setReason(s.getSubscriptionRsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Subscription_Sts ********************************************************************************/
		if(s.getSubscriptionSts() != null ) {

			if(s.getSubscriptionSts().replace("[","").replace("]","").equals("NULL") | s.getSubscriptionSts()==null) {} else {
			subscription.setStatus(new org.hl7.fhir.r4.model.Subscription.SubscriptionStatusEnumFactory().fromCode(s.getSubscriptionSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return subscription;
	}
}
