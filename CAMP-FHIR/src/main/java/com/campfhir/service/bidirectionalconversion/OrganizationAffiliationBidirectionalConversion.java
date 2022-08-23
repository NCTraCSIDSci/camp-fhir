package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OrganizationAffiliation;
public class OrganizationAffiliationBidirectionalConversion 
{
	public OrganizationAffiliation OrganizationAffiliations(org.hl7.fhir.r4.model.OrganizationAffiliation organizationaffiliation) throws ParseException
	{
		 main.java.com.campfhir.model.OrganizationAffiliation o = new  main.java.com.campfhir.model.OrganizationAffiliation();

		/******************** id ********************************************************************************/
		o.setId(organizationaffiliation.getIdElement().getIdPart());

		/******************** OrgnztnAffiliation_Lctn ********************************************************************************/
		if(organizationaffiliation.hasLocation()) {

			String  array = "[";
			for(int incr=0; incr<organizationaffiliation.getLocation().size(); incr++) {
				array = array + organizationaffiliation.getLocation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAffiliationLctn(array);

		} else {
			o.addOrgnztnAffiliationLctn("NULL");
		}


		/******************** organizationaffiliationcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> organizationaffiliationcodelist = organizationaffiliation.getCode();
		for(int organizationaffiliationcodei = 0; organizationaffiliationcodei<organizationaffiliationcodelist.size();organizationaffiliationcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  organizationaffiliationcode = organizationaffiliationcodelist.get(organizationaffiliationcodei);

		/******************** OrgnztnAffiliation_Cd_Txt ********************************************************************************/
		if(organizationaffiliationcodei == 0) {o.addOrgnztnAffiliationCdTxt("[");}
		if(organizationaffiliationcode.hasText()) {

			o.addOrgnztnAffiliationCdTxt(String.valueOf(organizationaffiliationcode.getText()));
		} else {
			o.addOrgnztnAffiliationCdTxt("NULL");
		}

		if(organizationaffiliationcodei == organizationaffiliationcodelist.size()-1) {o.addOrgnztnAffiliationCdTxt("]");}


		/******************** organizationaffiliationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationaffiliationcodecodinglist = organizationaffiliationcode.getCoding();
		for(int organizationaffiliationcodecodingi = 0; organizationaffiliationcodecodingi<organizationaffiliationcodecodinglist.size();organizationaffiliationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationaffiliationcodecoding = organizationaffiliationcodecodinglist.get(organizationaffiliationcodecodingi);

		/******************** OrgnztnAffiliation_Cd_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationcodecodingi == 0) {o.addOrgnztnAffiliationCdCdgDsply("[[");}
		if(organizationaffiliationcodecoding.hasDisplay()) {

			o.addOrgnztnAffiliationCdCdgDsply(String.valueOf(organizationaffiliationcodecoding.getDisplay()));
		} else {
			o.addOrgnztnAffiliationCdCdgDsply("NULL");
		}

		if(organizationaffiliationcodecodingi == organizationaffiliationcodecodinglist.size()-1) {o.addOrgnztnAffiliationCdCdgDsply("]]");}


		/******************** OrgnztnAffiliation_Cd_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationcodecodingi == 0) {o.addOrgnztnAffiliationCdCdgVrsn("[[");}
		if(organizationaffiliationcodecoding.hasVersion()) {

			o.addOrgnztnAffiliationCdCdgVrsn(String.valueOf(organizationaffiliationcodecoding.getVersion()));
		} else {
			o.addOrgnztnAffiliationCdCdgVrsn("NULL");
		}

		if(organizationaffiliationcodecodingi == organizationaffiliationcodecodinglist.size()-1) {o.addOrgnztnAffiliationCdCdgVrsn("]]");}


		/******************** OrgnztnAffiliation_Cd_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationcodecodingi == 0) {o.addOrgnztnAffiliationCdCdgCd("[[");}
		if(organizationaffiliationcodecoding.hasCode()) {

			o.addOrgnztnAffiliationCdCdgCd(String.valueOf(organizationaffiliationcodecoding.getCode()));
		} else {
			o.addOrgnztnAffiliationCdCdgCd("NULL");
		}

		if(organizationaffiliationcodecodingi == organizationaffiliationcodecodinglist.size()-1) {o.addOrgnztnAffiliationCdCdgCd("]]");}


		/******************** OrgnztnAffiliation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationcodecodingi == 0) {o.addOrgnztnAffiliationCdCdgUsrSltd("[[");}
		if(organizationaffiliationcodecoding.hasUserSelected()) {

			o.addOrgnztnAffiliationCdCdgUsrSltd(String.valueOf(organizationaffiliationcodecoding.getUserSelected()));
		} else {
			o.addOrgnztnAffiliationCdCdgUsrSltd("NULL");
		}

		if(organizationaffiliationcodecodingi == organizationaffiliationcodecodinglist.size()-1) {o.addOrgnztnAffiliationCdCdgUsrSltd("]]");}


		/******************** OrgnztnAffiliation_Cd_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationcodecodingi == 0) {o.addOrgnztnAffiliationCdCdgSys("[[");}
		if(organizationaffiliationcodecoding.hasSystem()) {

			o.addOrgnztnAffiliationCdCdgSys(String.valueOf(organizationaffiliationcodecoding.getSystem()));
		} else {
			o.addOrgnztnAffiliationCdCdgSys("NULL");
		}

		if(organizationaffiliationcodecodingi == organizationaffiliationcodecodinglist.size()-1) {o.addOrgnztnAffiliationCdCdgSys("]]");}


		 };
		 };
		/******************** OrgnztnAffiliation_Endpoint ********************************************************************************/
		if(organizationaffiliation.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<organizationaffiliation.getEndpoint().size(); incr++) {
				array = array + organizationaffiliation.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAffiliationEndpoint(array);

		} else {
			o.addOrgnztnAffiliationEndpoint("NULL");
		}


		/******************** organizationaffiliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationperiod = organizationaffiliation.getPeriod();

		/******************** OrgnztnAffiliation_Prd_Strt ********************************************************************************/
		if(organizationaffiliationperiod.hasStart()) {

			o.addOrgnztnAffiliationPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationperiod.getStart())+"\"");
		} else {
			o.addOrgnztnAffiliationPrdStrt("NULL");
		}


		/******************** OrgnztnAffiliation_Prd_End ********************************************************************************/
		if(organizationaffiliationperiod.hasEnd()) {

			o.addOrgnztnAffiliationPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnAffiliationPrdEnd("NULL");
		}


		/******************** organizationaffiliationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> organizationaffiliationidentifierlist = organizationaffiliation.getIdentifier();
		for(int organizationaffiliationidentifieri = 0; organizationaffiliationidentifieri<organizationaffiliationidentifierlist.size();organizationaffiliationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  organizationaffiliationidentifier = organizationaffiliationidentifierlist.get(organizationaffiliationidentifieri);

		/******************** OrgnztnAffiliation_Id_Vl ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdVl("[");}
		if(organizationaffiliationidentifier.hasValue()) {

			o.addOrgnztnAffiliationIdVl(String.valueOf(organizationaffiliationidentifier.getValue()));
		} else {
			o.addOrgnztnAffiliationIdVl("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdVl("]");}


		/******************** organizationaffiliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationaffiliationidentifiertype = organizationaffiliationidentifier.getType();

		/******************** OrgnztnAffiliation_Id_Typ_Txt ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdTypTxt("[");}
		if(organizationaffiliationidentifiertype.hasText()) {

			o.addOrgnztnAffiliationIdTypTxt(String.valueOf(organizationaffiliationidentifiertype.getText()));
		} else {
			o.addOrgnztnAffiliationIdTypTxt("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdTypTxt("]");}


		/******************** organizationaffiliationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationaffiliationidentifiertypecodinglist = organizationaffiliationidentifiertype.getCoding();
		for(int organizationaffiliationidentifiertypecodingi = 0; organizationaffiliationidentifiertypecodingi<organizationaffiliationidentifiertypecodinglist.size();organizationaffiliationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationaffiliationidentifiertypecoding = organizationaffiliationidentifiertypecodinglist.get(organizationaffiliationidentifiertypecodingi);

		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationidentifiertypecodingi == 0) {o.addOrgnztnAffiliationIdTypCdgDsply("[[");}
		if(organizationaffiliationidentifiertypecoding.hasDisplay()) {

			o.addOrgnztnAffiliationIdTypCdgDsply(String.valueOf(organizationaffiliationidentifiertypecoding.getDisplay()));
		} else {
			o.addOrgnztnAffiliationIdTypCdgDsply("NULL");
		}

		if(organizationaffiliationidentifiertypecodingi == organizationaffiliationidentifiertypecodinglist.size()-1) {o.addOrgnztnAffiliationIdTypCdgDsply("]]");}


		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationidentifiertypecodingi == 0) {o.addOrgnztnAffiliationIdTypCdgVrsn("[[");}
		if(organizationaffiliationidentifiertypecoding.hasVersion()) {

			o.addOrgnztnAffiliationIdTypCdgVrsn(String.valueOf(organizationaffiliationidentifiertypecoding.getVersion()));
		} else {
			o.addOrgnztnAffiliationIdTypCdgVrsn("NULL");
		}

		if(organizationaffiliationidentifiertypecodingi == organizationaffiliationidentifiertypecodinglist.size()-1) {o.addOrgnztnAffiliationIdTypCdgVrsn("]]");}


		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationidentifiertypecodingi == 0) {o.addOrgnztnAffiliationIdTypCdgCd("[[");}
		if(organizationaffiliationidentifiertypecoding.hasCode()) {

			o.addOrgnztnAffiliationIdTypCdgCd(String.valueOf(organizationaffiliationidentifiertypecoding.getCode()));
		} else {
			o.addOrgnztnAffiliationIdTypCdgCd("NULL");
		}

		if(organizationaffiliationidentifiertypecodingi == organizationaffiliationidentifiertypecodinglist.size()-1) {o.addOrgnztnAffiliationIdTypCdgCd("]]");}


		/******************** OrgnztnAffiliation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationidentifiertypecodingi == 0) {o.addOrgnztnAffiliationIdTypCdgUsrSltd("[[");}
		if(organizationaffiliationidentifiertypecoding.hasUserSelected()) {

			o.addOrgnztnAffiliationIdTypCdgUsrSltd(String.valueOf(organizationaffiliationidentifiertypecoding.getUserSelected()));
		} else {
			o.addOrgnztnAffiliationIdTypCdgUsrSltd("NULL");
		}

		if(organizationaffiliationidentifiertypecodingi == organizationaffiliationidentifiertypecodinglist.size()-1) {o.addOrgnztnAffiliationIdTypCdgUsrSltd("]]");}


		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationidentifiertypecodingi == 0) {o.addOrgnztnAffiliationIdTypCdgSys("[[");}
		if(organizationaffiliationidentifiertypecoding.hasSystem()) {

			o.addOrgnztnAffiliationIdTypCdgSys(String.valueOf(organizationaffiliationidentifiertypecoding.getSystem()));
		} else {
			o.addOrgnztnAffiliationIdTypCdgSys("NULL");
		}

		if(organizationaffiliationidentifiertypecodingi == organizationaffiliationidentifiertypecodinglist.size()-1) {o.addOrgnztnAffiliationIdTypCdgSys("]]");}


		 };
		/******************** organizationaffiliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationidentifierperiod = organizationaffiliationidentifier.getPeriod();

		/******************** OrgnztnAffiliation_Id_Prd_Strt ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdPrdStrt("[");}
		if(organizationaffiliationidentifierperiod.hasStart()) {

			o.addOrgnztnAffiliationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationidentifierperiod.getStart())+"\"");
		} else {
			o.addOrgnztnAffiliationIdPrdStrt("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdPrdStrt("]");}


		/******************** OrgnztnAffiliation_Id_Prd_End ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdPrdEnd("[");}
		if(organizationaffiliationidentifierperiod.hasEnd()) {

			o.addOrgnztnAffiliationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationidentifierperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnAffiliationIdPrdEnd("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdPrdEnd("]");}


		/******************** organizationaffiliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse organizationaffiliationidentifieruse = organizationaffiliationidentifier.getUse();
		if(organizationaffiliationidentifieruse!=null) {
		if(organizationaffiliationidentifieri == 0) {

		o.addOrgnztnAffiliationIdUse("[");		}
			o.addOrgnztnAffiliationIdUse(organizationaffiliationidentifieruse.toCode());
		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {

		o.addOrgnztnAffiliationIdUse("]");		}

		} else {
			o.addOrgnztnAffiliationIdUse("NULL");
		}

		/******************** OrgnztnAffiliation_Id_Assigner ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdAssigner("[");}
		if(organizationaffiliationidentifier.hasAssigner()) {

			if(organizationaffiliationidentifier.getAssigner().getReference() != null) {
			o.addOrgnztnAffiliationIdAssigner(organizationaffiliationidentifier.getAssigner().getReference());
			}
		} else {
			o.addOrgnztnAffiliationIdAssigner("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdAssigner("]");}


		/******************** OrgnztnAffiliation_Id_Sys ********************************************************************************/
		if(organizationaffiliationidentifieri == 0) {o.addOrgnztnAffiliationIdSys("[");}
		if(organizationaffiliationidentifier.hasSystem()) {

			o.addOrgnztnAffiliationIdSys(String.valueOf(organizationaffiliationidentifier.getSystem()));
		} else {
			o.addOrgnztnAffiliationIdSys("NULL");
		}

		if(organizationaffiliationidentifieri == organizationaffiliationidentifierlist.size()-1) {o.addOrgnztnAffiliationIdSys("]");}


		 };
		/******************** OrgnztnAffiliation_ParticipatingOrgnztn ********************************************************************************/
		if(organizationaffiliation.hasParticipatingOrganization()) {

			if(organizationaffiliation.getParticipatingOrganization().getReference() != null) {
			o.addOrgnztnAffiliationParticipatingOrgnztn(organizationaffiliation.getParticipatingOrganization().getReference());
			}
		} else {
			o.addOrgnztnAffiliationParticipatingOrgnztn("NULL");
		}


		/******************** OrgnztnAffiliation_Orgnztn ********************************************************************************/
		if(organizationaffiliation.hasOrganization()) {

			if(organizationaffiliation.getOrganization().getReference() != null) {
			o.addOrgnztnAffiliationOrgnztn(organizationaffiliation.getOrganization().getReference());
			}
		} else {
			o.addOrgnztnAffiliationOrgnztn("NULL");
		}


		/******************** OrgnztnAffiliation_HlthcrSrv ********************************************************************************/
		if(organizationaffiliation.hasHealthcareService()) {

			String  array = "[";
			for(int incr=0; incr<organizationaffiliation.getHealthcareService().size(); incr++) {
				array = array + organizationaffiliation.getHealthcareService().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAffiliationHlthcrSrv(array);

		} else {
			o.addOrgnztnAffiliationHlthcrSrv("NULL");
		}


		/******************** organizationaffiliationspecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> organizationaffiliationspecialtylist = organizationaffiliation.getSpecialty();
		for(int organizationaffiliationspecialtyi = 0; organizationaffiliationspecialtyi<organizationaffiliationspecialtylist.size();organizationaffiliationspecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  organizationaffiliationspecialty = organizationaffiliationspecialtylist.get(organizationaffiliationspecialtyi);

		/******************** OrgnztnAffiliation_Spclty_Txt ********************************************************************************/
		if(organizationaffiliationspecialtyi == 0) {o.addOrgnztnAffiliationSpcltyTxt("[");}
		if(organizationaffiliationspecialty.hasText()) {

			o.addOrgnztnAffiliationSpcltyTxt(String.valueOf(organizationaffiliationspecialty.getText()));
		} else {
			o.addOrgnztnAffiliationSpcltyTxt("NULL");
		}

		if(organizationaffiliationspecialtyi == organizationaffiliationspecialtylist.size()-1) {o.addOrgnztnAffiliationSpcltyTxt("]");}


		/******************** organizationaffiliationspecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationaffiliationspecialtycodinglist = organizationaffiliationspecialty.getCoding();
		for(int organizationaffiliationspecialtycodingi = 0; organizationaffiliationspecialtycodingi<organizationaffiliationspecialtycodinglist.size();organizationaffiliationspecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationaffiliationspecialtycoding = organizationaffiliationspecialtycodinglist.get(organizationaffiliationspecialtycodingi);

		/******************** OrgnztnAffiliation_Spclty_Cdg_Dsply ********************************************************************************/
		if(organizationaffiliationspecialtycodingi == 0) {o.addOrgnztnAffiliationSpcltyCdgDsply("[[");}
		if(organizationaffiliationspecialtycoding.hasDisplay()) {

			o.addOrgnztnAffiliationSpcltyCdgDsply(String.valueOf(organizationaffiliationspecialtycoding.getDisplay()));
		} else {
			o.addOrgnztnAffiliationSpcltyCdgDsply("NULL");
		}

		if(organizationaffiliationspecialtycodingi == organizationaffiliationspecialtycodinglist.size()-1) {o.addOrgnztnAffiliationSpcltyCdgDsply("]]");}


		/******************** OrgnztnAffiliation_Spclty_Cdg_Vrsn ********************************************************************************/
		if(organizationaffiliationspecialtycodingi == 0) {o.addOrgnztnAffiliationSpcltyCdgVrsn("[[");}
		if(organizationaffiliationspecialtycoding.hasVersion()) {

			o.addOrgnztnAffiliationSpcltyCdgVrsn(String.valueOf(organizationaffiliationspecialtycoding.getVersion()));
		} else {
			o.addOrgnztnAffiliationSpcltyCdgVrsn("NULL");
		}

		if(organizationaffiliationspecialtycodingi == organizationaffiliationspecialtycodinglist.size()-1) {o.addOrgnztnAffiliationSpcltyCdgVrsn("]]");}


		/******************** OrgnztnAffiliation_Spclty_Cdg_Cd ********************************************************************************/
		if(organizationaffiliationspecialtycodingi == 0) {o.addOrgnztnAffiliationSpcltyCdgCd("[[");}
		if(organizationaffiliationspecialtycoding.hasCode()) {

			o.addOrgnztnAffiliationSpcltyCdgCd(String.valueOf(organizationaffiliationspecialtycoding.getCode()));
		} else {
			o.addOrgnztnAffiliationSpcltyCdgCd("NULL");
		}

		if(organizationaffiliationspecialtycodingi == organizationaffiliationspecialtycodinglist.size()-1) {o.addOrgnztnAffiliationSpcltyCdgCd("]]");}


		/******************** OrgnztnAffiliation_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(organizationaffiliationspecialtycodingi == 0) {o.addOrgnztnAffiliationSpcltyCdgUsrSltd("[[");}
		if(organizationaffiliationspecialtycoding.hasUserSelected()) {

			o.addOrgnztnAffiliationSpcltyCdgUsrSltd(String.valueOf(organizationaffiliationspecialtycoding.getUserSelected()));
		} else {
			o.addOrgnztnAffiliationSpcltyCdgUsrSltd("NULL");
		}

		if(organizationaffiliationspecialtycodingi == organizationaffiliationspecialtycodinglist.size()-1) {o.addOrgnztnAffiliationSpcltyCdgUsrSltd("]]");}


		/******************** OrgnztnAffiliation_Spclty_Cdg_Sys ********************************************************************************/
		if(organizationaffiliationspecialtycodingi == 0) {o.addOrgnztnAffiliationSpcltyCdgSys("[[");}
		if(organizationaffiliationspecialtycoding.hasSystem()) {

			o.addOrgnztnAffiliationSpcltyCdgSys(String.valueOf(organizationaffiliationspecialtycoding.getSystem()));
		} else {
			o.addOrgnztnAffiliationSpcltyCdgSys("NULL");
		}

		if(organizationaffiliationspecialtycodingi == organizationaffiliationspecialtycodinglist.size()-1) {o.addOrgnztnAffiliationSpcltyCdgSys("]]");}


		 };
		 };
		/******************** OrgnztnAffiliation_Network ********************************************************************************/
		if(organizationaffiliation.hasNetwork()) {

			String  array = "[";
			for(int incr=0; incr<organizationaffiliation.getNetwork().size(); incr++) {
				array = array + organizationaffiliation.getNetwork().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAffiliationNetwork(array);

		} else {
			o.addOrgnztnAffiliationNetwork("NULL");
		}


		/******************** OrgnztnAffiliation_Active ********************************************************************************/
		if(organizationaffiliation.hasActive()) {

			o.addOrgnztnAffiliationActive(String.valueOf(organizationaffiliation.getActive()));
		} else {
			o.addOrgnztnAffiliationActive("NULL");
		}


		/******************** organizationaffiliationtelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> organizationaffiliationtelecomlist = organizationaffiliation.getTelecom();
		for(int organizationaffiliationtelecomi = 0; organizationaffiliationtelecomi<organizationaffiliationtelecomlist.size();organizationaffiliationtelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  organizationaffiliationtelecom = organizationaffiliationtelecomlist.get(organizationaffiliationtelecomi);

		/******************** OrgnztnAffiliation_Tlcm_Vl ********************************************************************************/
		if(organizationaffiliationtelecomi == 0) {o.addOrgnztnAffiliationTlcmVl("[");}
		if(organizationaffiliationtelecom.hasValue()) {

			o.addOrgnztnAffiliationTlcmVl(String.valueOf(organizationaffiliationtelecom.getValue()));
		} else {
			o.addOrgnztnAffiliationTlcmVl("NULL");
		}

		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {o.addOrgnztnAffiliationTlcmVl("]");}


		/******************** organizationaffiliationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaffiliationtelecomperiod = organizationaffiliationtelecom.getPeriod();

		/******************** OrgnztnAffiliation_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationaffiliationtelecomi == 0) {o.addOrgnztnAffiliationTlcmPrdStrt("[");}
		if(organizationaffiliationtelecomperiod.hasStart()) {

			o.addOrgnztnAffiliationTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationtelecomperiod.getStart())+"\"");
		} else {
			o.addOrgnztnAffiliationTlcmPrdStrt("NULL");
		}

		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {o.addOrgnztnAffiliationTlcmPrdStrt("]");}


		/******************** OrgnztnAffiliation_Tlcm_Prd_End ********************************************************************************/
		if(organizationaffiliationtelecomi == 0) {o.addOrgnztnAffiliationTlcmPrdEnd("[");}
		if(organizationaffiliationtelecomperiod.hasEnd()) {

			o.addOrgnztnAffiliationTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaffiliationtelecomperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnAffiliationTlcmPrdEnd("NULL");
		}

		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {o.addOrgnztnAffiliationTlcmPrdEnd("]");}


		/******************** organizationaffiliationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationaffiliationtelecomuse = organizationaffiliationtelecom.getUse();
		if(organizationaffiliationtelecomuse!=null) {
		if(organizationaffiliationtelecomi == 0) {

		o.addOrgnztnAffiliationTlcmUse("[");		}
			o.addOrgnztnAffiliationTlcmUse(organizationaffiliationtelecomuse.toCode());
		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {

		o.addOrgnztnAffiliationTlcmUse("]");		}

		} else {
			o.addOrgnztnAffiliationTlcmUse("NULL");
		}

		/******************** organizationaffiliationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationaffiliationtelecomsystem = organizationaffiliationtelecom.getSystem();
		if(organizationaffiliationtelecomsystem!=null) {
		if(organizationaffiliationtelecomi == 0) {

		o.addOrgnztnAffiliationTlcmSys("[");		}
			o.addOrgnztnAffiliationTlcmSys(organizationaffiliationtelecomsystem.toCode());
		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {

		o.addOrgnztnAffiliationTlcmSys("]");		}

		} else {
			o.addOrgnztnAffiliationTlcmSys("NULL");
		}

		/******************** OrgnztnAffiliation_Tlcm_Rnk ********************************************************************************/
		if(organizationaffiliationtelecomi == 0) {o.addOrgnztnAffiliationTlcmRnk("[");}
		if(organizationaffiliationtelecom.hasRank()) {

			o.addOrgnztnAffiliationTlcmRnk(String.valueOf(organizationaffiliationtelecom.getRank()));
		} else {
			o.addOrgnztnAffiliationTlcmRnk("NULL");
		}

		if(organizationaffiliationtelecomi == organizationaffiliationtelecomlist.size()-1) {o.addOrgnztnAffiliationTlcmRnk("]");}


		 };
		return o;
	}
}
