package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchStudy;
public class ResearchStudyBidirectionalConversion 
{
	public ResearchStudy ResearchStudys(org.hl7.fhir.r4.model.ResearchStudy researchstudy) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchStudy r = new  main.java.com.campfhir.model.ResearchStudy();

		/******************** id ********************************************************************************/
		r.setId(researchstudy.getIdElement().getIdPart());

		/******************** researchstudylocation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchstudylocationlist = researchstudy.getLocation();
		for(int researchstudylocationi = 0; researchstudylocationi<researchstudylocationlist.size();researchstudylocationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchstudylocation = researchstudylocationlist.get(researchstudylocationi);

		/******************** RsrchStdy_Lctn_Txt ********************************************************************************/
		if(researchstudylocationi == 0) {r.addRsrchStdyLctnTxt("[");}
		if(researchstudylocation.hasText()) {

			r.addRsrchStdyLctnTxt(String.valueOf(researchstudylocation.getText()));
		} else {
			r.addRsrchStdyLctnTxt("NULL");
		}

		if(researchstudylocationi == researchstudylocationlist.size()-1) {r.addRsrchStdyLctnTxt("]");}


		/******************** researchstudylocationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudylocationcodinglist = researchstudylocation.getCoding();
		for(int researchstudylocationcodingi = 0; researchstudylocationcodingi<researchstudylocationcodinglist.size();researchstudylocationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudylocationcoding = researchstudylocationcodinglist.get(researchstudylocationcodingi);

		/******************** RsrchStdy_Lctn_Cdg_Dsply ********************************************************************************/
		if(researchstudylocationcodingi == 0) {r.addRsrchStdyLctnCdgDsply("[[");}
		if(researchstudylocationcoding.hasDisplay()) {

			r.addRsrchStdyLctnCdgDsply(String.valueOf(researchstudylocationcoding.getDisplay()));
		} else {
			r.addRsrchStdyLctnCdgDsply("NULL");
		}

		if(researchstudylocationcodingi == researchstudylocationcodinglist.size()-1) {r.addRsrchStdyLctnCdgDsply("]]");}


		/******************** RsrchStdy_Lctn_Cdg_Vrsn ********************************************************************************/
		if(researchstudylocationcodingi == 0) {r.addRsrchStdyLctnCdgVrsn("[[");}
		if(researchstudylocationcoding.hasVersion()) {

			r.addRsrchStdyLctnCdgVrsn(String.valueOf(researchstudylocationcoding.getVersion()));
		} else {
			r.addRsrchStdyLctnCdgVrsn("NULL");
		}

		if(researchstudylocationcodingi == researchstudylocationcodinglist.size()-1) {r.addRsrchStdyLctnCdgVrsn("]]");}


		/******************** RsrchStdy_Lctn_Cdg_Cd ********************************************************************************/
		if(researchstudylocationcodingi == 0) {r.addRsrchStdyLctnCdgCd("[[");}
		if(researchstudylocationcoding.hasCode()) {

			r.addRsrchStdyLctnCdgCd(String.valueOf(researchstudylocationcoding.getCode()));
		} else {
			r.addRsrchStdyLctnCdgCd("NULL");
		}

		if(researchstudylocationcodingi == researchstudylocationcodinglist.size()-1) {r.addRsrchStdyLctnCdgCd("]]");}


		/******************** RsrchStdy_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(researchstudylocationcodingi == 0) {r.addRsrchStdyLctnCdgUsrSltd("[[");}
		if(researchstudylocationcoding.hasUserSelected()) {

			r.addRsrchStdyLctnCdgUsrSltd(String.valueOf(researchstudylocationcoding.getUserSelected()));
		} else {
			r.addRsrchStdyLctnCdgUsrSltd("NULL");
		}

		if(researchstudylocationcodingi == researchstudylocationcodinglist.size()-1) {r.addRsrchStdyLctnCdgUsrSltd("]]");}


		/******************** RsrchStdy_Lctn_Cdg_Sys ********************************************************************************/
		if(researchstudylocationcodingi == 0) {r.addRsrchStdyLctnCdgSys("[[");}
		if(researchstudylocationcoding.hasSystem()) {

			r.addRsrchStdyLctnCdgSys(String.valueOf(researchstudylocationcoding.getSystem()));
		} else {
			r.addRsrchStdyLctnCdgSys("NULL");
		}

		if(researchstudylocationcodingi == researchstudylocationcodinglist.size()-1) {r.addRsrchStdyLctnCdgSys("]]");}


		 };
		 };
		/******************** RsrchStdy_Protocol ********************************************************************************/
		if(researchstudy.hasProtocol()) {

			String  array = "[";
			for(int incr=0; incr<researchstudy.getProtocol().size(); incr++) {
				array = array + researchstudy.getProtocol().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchStdyProtocol(array);

		} else {
			r.addRsrchStdyProtocol("NULL");
		}


		/******************** researchstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyStatus researchstudystatus = researchstudy.getStatus();
		if(researchstudystatus!=null) {
			r.addRsrchStdySts(researchstudystatus.toCode());
		} else {
			r.addRsrchStdySts("NULL");
		}

		/******************** RsrchStdy_Dscrptn ********************************************************************************/
		if(researchstudy.hasDescription()) {

			r.addRsrchStdyDscrptn(String.valueOf(researchstudy.getDescription()));
		} else {
			r.addRsrchStdyDscrptn("NULL");
		}


		/******************** researchstudynote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> researchstudynotelist = researchstudy.getNote();
		for(int researchstudynotei = 0; researchstudynotei<researchstudynotelist.size();researchstudynotei++ ) {
		org.hl7.fhir.r4.model.Annotation  researchstudynote = researchstudynotelist.get(researchstudynotei);

		/******************** RsrchStdy_Nt_Time ********************************************************************************/
		if(researchstudynotei == 0) {r.addRsrchStdyNtTime("[");}
		if(researchstudynote.hasTime()) {

			r.addRsrchStdyNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudynote.getTime())+"\"");
		} else {
			r.addRsrchStdyNtTime("NULL");
		}

		if(researchstudynotei == researchstudynotelist.size()-1) {r.addRsrchStdyNtTime("]");}


		/******************** RsrchStdy_Nt_AthrRfrnc ********************************************************************************/
		if(researchstudynotei == 0) {r.addRsrchStdyNtAthrRfrnc("[");}
		if(researchstudynote.hasAuthorReference()) {

			if(researchstudynote.getAuthorReference().getReference() != null) {
			r.addRsrchStdyNtAthrRfrnc(researchstudynote.getAuthorReference().getReference());
			}
		} else {
			r.addRsrchStdyNtAthrRfrnc("NULL");
		}

		if(researchstudynotei == researchstudynotelist.size()-1) {r.addRsrchStdyNtAthrRfrnc("]");}


		/******************** RsrchStdy_Nt_Txt ********************************************************************************/
		if(researchstudynotei == 0) {r.addRsrchStdyNtTxt("[");}
		if(researchstudynote.hasText()) {

			r.addRsrchStdyNtTxt(String.valueOf(researchstudynote.getText()));
		} else {
			r.addRsrchStdyNtTxt("NULL");
		}

		if(researchstudynotei == researchstudynotelist.size()-1) {r.addRsrchStdyNtTxt("]");}


		/******************** RsrchStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(researchstudynotei == 0) {r.addRsrchStdyNtAthrStrgTyp("[");}
		if(researchstudynote.hasAuthorStringType()) {

			r.addRsrchStdyNtAthrStrgTyp("\""+researchstudynote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRsrchStdyNtAthrStrgTyp("NULL");
		}

		if(researchstudynotei == researchstudynotelist.size()-1) {r.addRsrchStdyNtAthrStrgTyp("]");}


		 };
		/******************** researchstudyperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyperiod = researchstudy.getPeriod();

		/******************** RsrchStdy_Prd_Strt ********************************************************************************/
		if(researchstudyperiod.hasStart()) {

			r.addRsrchStdyPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudyperiod.getStart())+"\"");
		} else {
			r.addRsrchStdyPrdStrt("NULL");
		}


		/******************** RsrchStdy_Prd_End ********************************************************************************/
		if(researchstudyperiod.hasEnd()) {

			r.addRsrchStdyPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudyperiod.getEnd())+"\"");
		} else {
			r.addRsrchStdyPrdEnd("NULL");
		}


		/******************** researchstudyidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> researchstudyidentifierlist = researchstudy.getIdentifier();
		for(int researchstudyidentifieri = 0; researchstudyidentifieri<researchstudyidentifierlist.size();researchstudyidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  researchstudyidentifier = researchstudyidentifierlist.get(researchstudyidentifieri);

		/******************** RsrchStdy_Id_Vl ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdVl("[");}
		if(researchstudyidentifier.hasValue()) {

			r.addRsrchStdyIdVl(String.valueOf(researchstudyidentifier.getValue()));
		} else {
			r.addRsrchStdyIdVl("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdVl("]");}


		/******************** researchstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyidentifiertype = researchstudyidentifier.getType();

		/******************** RsrchStdy_Id_Typ_Txt ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdTypTxt("[");}
		if(researchstudyidentifiertype.hasText()) {

			r.addRsrchStdyIdTypTxt(String.valueOf(researchstudyidentifiertype.getText()));
		} else {
			r.addRsrchStdyIdTypTxt("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdTypTxt("]");}


		/******************** researchstudyidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyidentifiertypecodinglist = researchstudyidentifiertype.getCoding();
		for(int researchstudyidentifiertypecodingi = 0; researchstudyidentifiertypecodingi<researchstudyidentifiertypecodinglist.size();researchstudyidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyidentifiertypecoding = researchstudyidentifiertypecodinglist.get(researchstudyidentifiertypecodingi);

		/******************** RsrchStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyidentifiertypecodingi == 0) {r.addRsrchStdyIdTypCdgDsply("[[");}
		if(researchstudyidentifiertypecoding.hasDisplay()) {

			r.addRsrchStdyIdTypCdgDsply(String.valueOf(researchstudyidentifiertypecoding.getDisplay()));
		} else {
			r.addRsrchStdyIdTypCdgDsply("NULL");
		}

		if(researchstudyidentifiertypecodingi == researchstudyidentifiertypecodinglist.size()-1) {r.addRsrchStdyIdTypCdgDsply("]]");}


		/******************** RsrchStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyidentifiertypecodingi == 0) {r.addRsrchStdyIdTypCdgVrsn("[[");}
		if(researchstudyidentifiertypecoding.hasVersion()) {

			r.addRsrchStdyIdTypCdgVrsn(String.valueOf(researchstudyidentifiertypecoding.getVersion()));
		} else {
			r.addRsrchStdyIdTypCdgVrsn("NULL");
		}

		if(researchstudyidentifiertypecodingi == researchstudyidentifiertypecodinglist.size()-1) {r.addRsrchStdyIdTypCdgVrsn("]]");}


		/******************** RsrchStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyidentifiertypecodingi == 0) {r.addRsrchStdyIdTypCdgCd("[[");}
		if(researchstudyidentifiertypecoding.hasCode()) {

			r.addRsrchStdyIdTypCdgCd(String.valueOf(researchstudyidentifiertypecoding.getCode()));
		} else {
			r.addRsrchStdyIdTypCdgCd("NULL");
		}

		if(researchstudyidentifiertypecodingi == researchstudyidentifiertypecodinglist.size()-1) {r.addRsrchStdyIdTypCdgCd("]]");}


		/******************** RsrchStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyidentifiertypecodingi == 0) {r.addRsrchStdyIdTypCdgUsrSltd("[[");}
		if(researchstudyidentifiertypecoding.hasUserSelected()) {

			r.addRsrchStdyIdTypCdgUsrSltd(String.valueOf(researchstudyidentifiertypecoding.getUserSelected()));
		} else {
			r.addRsrchStdyIdTypCdgUsrSltd("NULL");
		}

		if(researchstudyidentifiertypecodingi == researchstudyidentifiertypecodinglist.size()-1) {r.addRsrchStdyIdTypCdgUsrSltd("]]");}


		/******************** RsrchStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyidentifiertypecodingi == 0) {r.addRsrchStdyIdTypCdgSys("[[");}
		if(researchstudyidentifiertypecoding.hasSystem()) {

			r.addRsrchStdyIdTypCdgSys(String.valueOf(researchstudyidentifiertypecoding.getSystem()));
		} else {
			r.addRsrchStdyIdTypCdgSys("NULL");
		}

		if(researchstudyidentifiertypecodingi == researchstudyidentifiertypecodinglist.size()-1) {r.addRsrchStdyIdTypCdgSys("]]");}


		 };
		/******************** researchstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyidentifierperiod = researchstudyidentifier.getPeriod();

		/******************** RsrchStdy_Id_Prd_Strt ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdPrdStrt("[");}
		if(researchstudyidentifierperiod.hasStart()) {

			r.addRsrchStdyIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudyidentifierperiod.getStart())+"\"");
		} else {
			r.addRsrchStdyIdPrdStrt("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdPrdStrt("]");}


		/******************** RsrchStdy_Id_Prd_End ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdPrdEnd("[");}
		if(researchstudyidentifierperiod.hasEnd()) {

			r.addRsrchStdyIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudyidentifierperiod.getEnd())+"\"");
		} else {
			r.addRsrchStdyIdPrdEnd("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdPrdEnd("]");}


		/******************** researchstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchstudyidentifieruse = researchstudyidentifier.getUse();
		if(researchstudyidentifieruse!=null) {
		if(researchstudyidentifieri == 0) {

		r.addRsrchStdyIdUse("[");		}
			r.addRsrchStdyIdUse(researchstudyidentifieruse.toCode());
		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {

		r.addRsrchStdyIdUse("]");		}

		} else {
			r.addRsrchStdyIdUse("NULL");
		}

		/******************** RsrchStdy_Id_Assigner ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdAssigner("[");}
		if(researchstudyidentifier.hasAssigner()) {

			if(researchstudyidentifier.getAssigner().getReference() != null) {
			r.addRsrchStdyIdAssigner(researchstudyidentifier.getAssigner().getReference());
			}
		} else {
			r.addRsrchStdyIdAssigner("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdAssigner("]");}


		/******************** RsrchStdy_Id_Sys ********************************************************************************/
		if(researchstudyidentifieri == 0) {r.addRsrchStdyIdSys("[");}
		if(researchstudyidentifier.hasSystem()) {

			r.addRsrchStdyIdSys(String.valueOf(researchstudyidentifier.getSystem()));
		} else {
			r.addRsrchStdyIdSys("NULL");
		}

		if(researchstudyidentifieri == researchstudyidentifierlist.size()-1) {r.addRsrchStdyIdSys("]");}


		 };
		/******************** researchstudycategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchstudycategorylist = researchstudy.getCategory();
		for(int researchstudycategoryi = 0; researchstudycategoryi<researchstudycategorylist.size();researchstudycategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchstudycategory = researchstudycategorylist.get(researchstudycategoryi);

		/******************** RsrchStdy_Ctgry_Txt ********************************************************************************/
		if(researchstudycategoryi == 0) {r.addRsrchStdyCtgryTxt("[");}
		if(researchstudycategory.hasText()) {

			r.addRsrchStdyCtgryTxt(String.valueOf(researchstudycategory.getText()));
		} else {
			r.addRsrchStdyCtgryTxt("NULL");
		}

		if(researchstudycategoryi == researchstudycategorylist.size()-1) {r.addRsrchStdyCtgryTxt("]");}


		/******************** researchstudycategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudycategorycodinglist = researchstudycategory.getCoding();
		for(int researchstudycategorycodingi = 0; researchstudycategorycodingi<researchstudycategorycodinglist.size();researchstudycategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudycategorycoding = researchstudycategorycodinglist.get(researchstudycategorycodingi);

		/******************** RsrchStdy_Ctgry_Cdg_Dsply ********************************************************************************/
		if(researchstudycategorycodingi == 0) {r.addRsrchStdyCtgryCdgDsply("[[");}
		if(researchstudycategorycoding.hasDisplay()) {

			r.addRsrchStdyCtgryCdgDsply(String.valueOf(researchstudycategorycoding.getDisplay()));
		} else {
			r.addRsrchStdyCtgryCdgDsply("NULL");
		}

		if(researchstudycategorycodingi == researchstudycategorycodinglist.size()-1) {r.addRsrchStdyCtgryCdgDsply("]]");}


		/******************** RsrchStdy_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(researchstudycategorycodingi == 0) {r.addRsrchStdyCtgryCdgVrsn("[[");}
		if(researchstudycategorycoding.hasVersion()) {

			r.addRsrchStdyCtgryCdgVrsn(String.valueOf(researchstudycategorycoding.getVersion()));
		} else {
			r.addRsrchStdyCtgryCdgVrsn("NULL");
		}

		if(researchstudycategorycodingi == researchstudycategorycodinglist.size()-1) {r.addRsrchStdyCtgryCdgVrsn("]]");}


		/******************** RsrchStdy_Ctgry_Cdg_Cd ********************************************************************************/
		if(researchstudycategorycodingi == 0) {r.addRsrchStdyCtgryCdgCd("[[");}
		if(researchstudycategorycoding.hasCode()) {

			r.addRsrchStdyCtgryCdgCd(String.valueOf(researchstudycategorycoding.getCode()));
		} else {
			r.addRsrchStdyCtgryCdgCd("NULL");
		}

		if(researchstudycategorycodingi == researchstudycategorycodinglist.size()-1) {r.addRsrchStdyCtgryCdgCd("]]");}


		/******************** RsrchStdy_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(researchstudycategorycodingi == 0) {r.addRsrchStdyCtgryCdgUsrSltd("[[");}
		if(researchstudycategorycoding.hasUserSelected()) {

			r.addRsrchStdyCtgryCdgUsrSltd(String.valueOf(researchstudycategorycoding.getUserSelected()));
		} else {
			r.addRsrchStdyCtgryCdgUsrSltd("NULL");
		}

		if(researchstudycategorycodingi == researchstudycategorycodinglist.size()-1) {r.addRsrchStdyCtgryCdgUsrSltd("]]");}


		/******************** RsrchStdy_Ctgry_Cdg_Sys ********************************************************************************/
		if(researchstudycategorycodingi == 0) {r.addRsrchStdyCtgryCdgSys("[[");}
		if(researchstudycategorycoding.hasSystem()) {

			r.addRsrchStdyCtgryCdgSys(String.valueOf(researchstudycategorycoding.getSystem()));
		} else {
			r.addRsrchStdyCtgryCdgSys("NULL");
		}

		if(researchstudycategorycodingi == researchstudycategorycodinglist.size()-1) {r.addRsrchStdyCtgryCdgSys("]]");}


		 };
		 };
		/******************** researchstudycontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchstudycontactlist = researchstudy.getContact();
		for(int researchstudycontacti = 0; researchstudycontacti<researchstudycontactlist.size();researchstudycontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchstudycontact = researchstudycontactlist.get(researchstudycontacti);

		/******************** RsrchStdy_Cntct_Nm ********************************************************************************/
		if(researchstudycontacti == 0) {r.addRsrchStdyCntctNm("[");}
		if(researchstudycontact.hasName()) {

			r.addRsrchStdyCntctNm(String.valueOf(researchstudycontact.getName()));
		} else {
			r.addRsrchStdyCntctNm("NULL");
		}

		if(researchstudycontacti == researchstudycontactlist.size()-1) {r.addRsrchStdyCntctNm("]");}


		/******************** researchstudycontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchstudycontacttelecomlist = researchstudycontact.getTelecom();
		for(int researchstudycontacttelecomi = 0; researchstudycontacttelecomi<researchstudycontacttelecomlist.size();researchstudycontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchstudycontacttelecom = researchstudycontacttelecomlist.get(researchstudycontacttelecomi);

		/******************** RsrchStdy_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchstudycontacttelecomi == 0) {r.addRsrchStdyCntctTlcmVl("[[");}
		if(researchstudycontacttelecom.hasValue()) {

			r.addRsrchStdyCntctTlcmVl(String.valueOf(researchstudycontacttelecom.getValue()));
		} else {
			r.addRsrchStdyCntctTlcmVl("NULL");
		}

		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {r.addRsrchStdyCntctTlcmVl("]]");}


		/******************** researchstudycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudycontacttelecomperiod = researchstudycontacttelecom.getPeriod();

		/******************** RsrchStdy_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchstudycontacttelecomi == 0) {r.addRsrchStdyCntctTlcmPrdStrt("[[");}
		if(researchstudycontacttelecomperiod.hasStart()) {

			r.addRsrchStdyCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudycontacttelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchStdyCntctTlcmPrdStrt("NULL");
		}

		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {r.addRsrchStdyCntctTlcmPrdStrt("]]");}


		/******************** RsrchStdy_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchstudycontacttelecomi == 0) {r.addRsrchStdyCntctTlcmPrdEnd("[[");}
		if(researchstudycontacttelecomperiod.hasEnd()) {

			r.addRsrchStdyCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudycontacttelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchStdyCntctTlcmPrdEnd("NULL");
		}

		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {r.addRsrchStdyCntctTlcmPrdEnd("]]");}


		/******************** researchstudycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchstudycontacttelecomuse = researchstudycontacttelecom.getUse();
		if(researchstudycontacttelecomuse!=null) {
		if(researchstudycontacttelecomi == 0) {

		r.addRsrchStdyCntctTlcmUse("[[");		}
			r.addRsrchStdyCntctTlcmUse(researchstudycontacttelecomuse.toCode());
		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {

		r.addRsrchStdyCntctTlcmUse("]]");		}

		} else {
			r.addRsrchStdyCntctTlcmUse("NULL");
		}

		/******************** researchstudycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchstudycontacttelecomsystem = researchstudycontacttelecom.getSystem();
		if(researchstudycontacttelecomsystem!=null) {
		if(researchstudycontacttelecomi == 0) {

		r.addRsrchStdyCntctTlcmSys("[[");		}
			r.addRsrchStdyCntctTlcmSys(researchstudycontacttelecomsystem.toCode());
		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {

		r.addRsrchStdyCntctTlcmSys("]]");		}

		} else {
			r.addRsrchStdyCntctTlcmSys("NULL");
		}

		/******************** RsrchStdy_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchstudycontacttelecomi == 0) {r.addRsrchStdyCntctTlcmRnk("[[");}
		if(researchstudycontacttelecom.hasRank()) {

			r.addRsrchStdyCntctTlcmRnk(String.valueOf(researchstudycontacttelecom.getRank()));
		} else {
			r.addRsrchStdyCntctTlcmRnk("NULL");
		}

		if(researchstudycontacttelecomi == researchstudycontacttelecomlist.size()-1) {r.addRsrchStdyCntctTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchStdy_PrincipalInvestigator ********************************************************************************/
		if(researchstudy.hasPrincipalInvestigator()) {

			if(researchstudy.getPrincipalInvestigator().getReference() != null) {
			r.addRsrchStdyPrincipalInvestigator(researchstudy.getPrincipalInvestigator().getReference());
			}
		} else {
			r.addRsrchStdyPrincipalInvestigator("NULL");
		}


		/******************** researchstudyprimarypurposetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyprimarypurposetype = researchstudy.getPrimaryPurposeType();

		/******************** RsrchStdy_PrimaryPrpseTyp_Txt ********************************************************************************/
		if(researchstudyprimarypurposetype.hasText()) {

			r.addRsrchStdyPrimaryPrpseTypTxt(String.valueOf(researchstudyprimarypurposetype.getText()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypTxt("NULL");
		}


		/******************** researchstudyprimarypurposetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyprimarypurposetypecodinglist = researchstudyprimarypurposetype.getCoding();
		for(int researchstudyprimarypurposetypecodingi = 0; researchstudyprimarypurposetypecodingi<researchstudyprimarypurposetypecodinglist.size();researchstudyprimarypurposetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyprimarypurposetypecoding = researchstudyprimarypurposetypecodinglist.get(researchstudyprimarypurposetypecodingi);

		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Dsply ********************************************************************************/
		if(researchstudyprimarypurposetypecodingi == 0) {r.addRsrchStdyPrimaryPrpseTypCdgDsply("[");}
		if(researchstudyprimarypurposetypecoding.hasDisplay()) {

			r.addRsrchStdyPrimaryPrpseTypCdgDsply(String.valueOf(researchstudyprimarypurposetypecoding.getDisplay()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypCdgDsply("NULL");
		}

		if(researchstudyprimarypurposetypecodingi == researchstudyprimarypurposetypecodinglist.size()-1) {r.addRsrchStdyPrimaryPrpseTypCdgDsply("]");}


		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Vrsn ********************************************************************************/
		if(researchstudyprimarypurposetypecodingi == 0) {r.addRsrchStdyPrimaryPrpseTypCdgVrsn("[");}
		if(researchstudyprimarypurposetypecoding.hasVersion()) {

			r.addRsrchStdyPrimaryPrpseTypCdgVrsn(String.valueOf(researchstudyprimarypurposetypecoding.getVersion()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypCdgVrsn("NULL");
		}

		if(researchstudyprimarypurposetypecodingi == researchstudyprimarypurposetypecodinglist.size()-1) {r.addRsrchStdyPrimaryPrpseTypCdgVrsn("]");}


		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Cd ********************************************************************************/
		if(researchstudyprimarypurposetypecodingi == 0) {r.addRsrchStdyPrimaryPrpseTypCdgCd("[");}
		if(researchstudyprimarypurposetypecoding.hasCode()) {

			r.addRsrchStdyPrimaryPrpseTypCdgCd(String.valueOf(researchstudyprimarypurposetypecoding.getCode()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypCdgCd("NULL");
		}

		if(researchstudyprimarypurposetypecodingi == researchstudyprimarypurposetypecodinglist.size()-1) {r.addRsrchStdyPrimaryPrpseTypCdgCd("]");}


		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyprimarypurposetypecodingi == 0) {r.addRsrchStdyPrimaryPrpseTypCdgUsrSltd("[");}
		if(researchstudyprimarypurposetypecoding.hasUserSelected()) {

			r.addRsrchStdyPrimaryPrpseTypCdgUsrSltd(String.valueOf(researchstudyprimarypurposetypecoding.getUserSelected()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypCdgUsrSltd("NULL");
		}

		if(researchstudyprimarypurposetypecodingi == researchstudyprimarypurposetypecodinglist.size()-1) {r.addRsrchStdyPrimaryPrpseTypCdgUsrSltd("]");}


		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Sys ********************************************************************************/
		if(researchstudyprimarypurposetypecodingi == 0) {r.addRsrchStdyPrimaryPrpseTypCdgSys("[");}
		if(researchstudyprimarypurposetypecoding.hasSystem()) {

			r.addRsrchStdyPrimaryPrpseTypCdgSys(String.valueOf(researchstudyprimarypurposetypecoding.getSystem()));
		} else {
			r.addRsrchStdyPrimaryPrpseTypCdgSys("NULL");
		}

		if(researchstudyprimarypurposetypecodingi == researchstudyprimarypurposetypecodinglist.size()-1) {r.addRsrchStdyPrimaryPrpseTypCdgSys("]");}


		 };
		/******************** researchstudyfocus ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchstudyfocuslist = researchstudy.getFocus();
		for(int researchstudyfocusi = 0; researchstudyfocusi<researchstudyfocuslist.size();researchstudyfocusi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchstudyfocus = researchstudyfocuslist.get(researchstudyfocusi);

		/******************** RsrchStdy_Focus_Txt ********************************************************************************/
		if(researchstudyfocusi == 0) {r.addRsrchStdyFocusTxt("[");}
		if(researchstudyfocus.hasText()) {

			r.addRsrchStdyFocusTxt(String.valueOf(researchstudyfocus.getText()));
		} else {
			r.addRsrchStdyFocusTxt("NULL");
		}

		if(researchstudyfocusi == researchstudyfocuslist.size()-1) {r.addRsrchStdyFocusTxt("]");}


		/******************** researchstudyfocuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyfocuscodinglist = researchstudyfocus.getCoding();
		for(int researchstudyfocuscodingi = 0; researchstudyfocuscodingi<researchstudyfocuscodinglist.size();researchstudyfocuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyfocuscoding = researchstudyfocuscodinglist.get(researchstudyfocuscodingi);

		/******************** RsrchStdy_Focus_Cdg_Dsply ********************************************************************************/
		if(researchstudyfocuscodingi == 0) {r.addRsrchStdyFocusCdgDsply("[[");}
		if(researchstudyfocuscoding.hasDisplay()) {

			r.addRsrchStdyFocusCdgDsply(String.valueOf(researchstudyfocuscoding.getDisplay()));
		} else {
			r.addRsrchStdyFocusCdgDsply("NULL");
		}

		if(researchstudyfocuscodingi == researchstudyfocuscodinglist.size()-1) {r.addRsrchStdyFocusCdgDsply("]]");}


		/******************** RsrchStdy_Focus_Cdg_Vrsn ********************************************************************************/
		if(researchstudyfocuscodingi == 0) {r.addRsrchStdyFocusCdgVrsn("[[");}
		if(researchstudyfocuscoding.hasVersion()) {

			r.addRsrchStdyFocusCdgVrsn(String.valueOf(researchstudyfocuscoding.getVersion()));
		} else {
			r.addRsrchStdyFocusCdgVrsn("NULL");
		}

		if(researchstudyfocuscodingi == researchstudyfocuscodinglist.size()-1) {r.addRsrchStdyFocusCdgVrsn("]]");}


		/******************** RsrchStdy_Focus_Cdg_Cd ********************************************************************************/
		if(researchstudyfocuscodingi == 0) {r.addRsrchStdyFocusCdgCd("[[");}
		if(researchstudyfocuscoding.hasCode()) {

			r.addRsrchStdyFocusCdgCd(String.valueOf(researchstudyfocuscoding.getCode()));
		} else {
			r.addRsrchStdyFocusCdgCd("NULL");
		}

		if(researchstudyfocuscodingi == researchstudyfocuscodinglist.size()-1) {r.addRsrchStdyFocusCdgCd("]]");}


		/******************** RsrchStdy_Focus_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyfocuscodingi == 0) {r.addRsrchStdyFocusCdgUsrSltd("[[");}
		if(researchstudyfocuscoding.hasUserSelected()) {

			r.addRsrchStdyFocusCdgUsrSltd(String.valueOf(researchstudyfocuscoding.getUserSelected()));
		} else {
			r.addRsrchStdyFocusCdgUsrSltd("NULL");
		}

		if(researchstudyfocuscodingi == researchstudyfocuscodinglist.size()-1) {r.addRsrchStdyFocusCdgUsrSltd("]]");}


		/******************** RsrchStdy_Focus_Cdg_Sys ********************************************************************************/
		if(researchstudyfocuscodingi == 0) {r.addRsrchStdyFocusCdgSys("[[");}
		if(researchstudyfocuscoding.hasSystem()) {

			r.addRsrchStdyFocusCdgSys(String.valueOf(researchstudyfocuscoding.getSystem()));
		} else {
			r.addRsrchStdyFocusCdgSys("NULL");
		}

		if(researchstudyfocuscodingi == researchstudyfocuscodinglist.size()-1) {r.addRsrchStdyFocusCdgSys("]]");}


		 };
		 };
		/******************** RsrchStdy_Ttl ********************************************************************************/
		if(researchstudy.hasTitle()) {

			r.addRsrchStdyTtl(String.valueOf(researchstudy.getTitle()));
		} else {
			r.addRsrchStdyTtl("NULL");
		}


		/******************** researchstudyphase ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyphase = researchstudy.getPhase();

		/******************** RsrchStdy_Phase_Txt ********************************************************************************/
		if(researchstudyphase.hasText()) {

			r.addRsrchStdyPhaseTxt(String.valueOf(researchstudyphase.getText()));
		} else {
			r.addRsrchStdyPhaseTxt("NULL");
		}


		/******************** researchstudyphasecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyphasecodinglist = researchstudyphase.getCoding();
		for(int researchstudyphasecodingi = 0; researchstudyphasecodingi<researchstudyphasecodinglist.size();researchstudyphasecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyphasecoding = researchstudyphasecodinglist.get(researchstudyphasecodingi);

		/******************** RsrchStdy_Phase_Cdg_Dsply ********************************************************************************/
		if(researchstudyphasecodingi == 0) {r.addRsrchStdyPhaseCdgDsply("[");}
		if(researchstudyphasecoding.hasDisplay()) {

			r.addRsrchStdyPhaseCdgDsply(String.valueOf(researchstudyphasecoding.getDisplay()));
		} else {
			r.addRsrchStdyPhaseCdgDsply("NULL");
		}

		if(researchstudyphasecodingi == researchstudyphasecodinglist.size()-1) {r.addRsrchStdyPhaseCdgDsply("]");}


		/******************** RsrchStdy_Phase_Cdg_Vrsn ********************************************************************************/
		if(researchstudyphasecodingi == 0) {r.addRsrchStdyPhaseCdgVrsn("[");}
		if(researchstudyphasecoding.hasVersion()) {

			r.addRsrchStdyPhaseCdgVrsn(String.valueOf(researchstudyphasecoding.getVersion()));
		} else {
			r.addRsrchStdyPhaseCdgVrsn("NULL");
		}

		if(researchstudyphasecodingi == researchstudyphasecodinglist.size()-1) {r.addRsrchStdyPhaseCdgVrsn("]");}


		/******************** RsrchStdy_Phase_Cdg_Cd ********************************************************************************/
		if(researchstudyphasecodingi == 0) {r.addRsrchStdyPhaseCdgCd("[");}
		if(researchstudyphasecoding.hasCode()) {

			r.addRsrchStdyPhaseCdgCd(String.valueOf(researchstudyphasecoding.getCode()));
		} else {
			r.addRsrchStdyPhaseCdgCd("NULL");
		}

		if(researchstudyphasecodingi == researchstudyphasecodinglist.size()-1) {r.addRsrchStdyPhaseCdgCd("]");}


		/******************** RsrchStdy_Phase_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyphasecodingi == 0) {r.addRsrchStdyPhaseCdgUsrSltd("[");}
		if(researchstudyphasecoding.hasUserSelected()) {

			r.addRsrchStdyPhaseCdgUsrSltd(String.valueOf(researchstudyphasecoding.getUserSelected()));
		} else {
			r.addRsrchStdyPhaseCdgUsrSltd("NULL");
		}

		if(researchstudyphasecodingi == researchstudyphasecodinglist.size()-1) {r.addRsrchStdyPhaseCdgUsrSltd("]");}


		/******************** RsrchStdy_Phase_Cdg_Sys ********************************************************************************/
		if(researchstudyphasecodingi == 0) {r.addRsrchStdyPhaseCdgSys("[");}
		if(researchstudyphasecoding.hasSystem()) {

			r.addRsrchStdyPhaseCdgSys(String.valueOf(researchstudyphasecoding.getSystem()));
		} else {
			r.addRsrchStdyPhaseCdgSys("NULL");
		}

		if(researchstudyphasecodingi == researchstudyphasecodinglist.size()-1) {r.addRsrchStdyPhaseCdgSys("]");}


		 };
		/******************** researchstudyrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> researchstudyrelatedartifactlist = researchstudy.getRelatedArtifact();
		for(int researchstudyrelatedartifacti = 0; researchstudyrelatedartifacti<researchstudyrelatedartifactlist.size();researchstudyrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  researchstudyrelatedartifact = researchstudyrelatedartifactlist.get(researchstudyrelatedartifacti);

		/******************** RsrchStdy_RltedArtfct_Rsrc ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctRsrc("[");}
		if(researchstudyrelatedartifact.hasResource()) {

			r.addRsrchStdyRltedArtfctRsrc(String.valueOf(researchstudyrelatedartifact.getResource()));
		} else {
			r.addRsrchStdyRltedArtfctRsrc("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctRsrc("]");}


		/******************** researchstudyrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchstudyrelatedartifacttype = researchstudyrelatedartifact.getType();
		if(researchstudyrelatedartifacttype!=null) {
		if(researchstudyrelatedartifacti == 0) {

		r.addRsrchStdyRltedArtfctTyp("[");		}
			r.addRsrchStdyRltedArtfctTyp(researchstudyrelatedartifacttype.toCode());
		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {

		r.addRsrchStdyRltedArtfctTyp("]");		}

		} else {
			r.addRsrchStdyRltedArtfctTyp("NULL");
		}

		/******************** RsrchStdy_RltedArtfct_Url ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctUrl("[");}
		if(researchstudyrelatedartifact.hasUrl()) {

			r.addRsrchStdyRltedArtfctUrl(String.valueOf(researchstudyrelatedartifact.getUrl()));
		} else {
			r.addRsrchStdyRltedArtfctUrl("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctUrl("]");}


		/******************** RsrchStdy_RltedArtfct_Citation ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctCitation("[");}
		if(researchstudyrelatedartifact.hasCitation()) {

			r.addRsrchStdyRltedArtfctCitation(String.valueOf(researchstudyrelatedartifact.getCitation()));
		} else {
			r.addRsrchStdyRltedArtfctCitation("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctCitation("]");}


		/******************** RsrchStdy_RltedArtfct_Lbl ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctLbl("[");}
		if(researchstudyrelatedartifact.hasLabel()) {

			r.addRsrchStdyRltedArtfctLbl(String.valueOf(researchstudyrelatedartifact.getLabel()));
		} else {
			r.addRsrchStdyRltedArtfctLbl("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctLbl("]");}


		/******************** researchstudyrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchstudyrelatedartifactdocument = researchstudyrelatedartifact.getDocument();

		/******************** RsrchStdy_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocSz("[");}
		if(researchstudyrelatedartifactdocument.hasSize()) {

			r.addRsrchStdyRltedArtfctDocSz(String.valueOf(researchstudyrelatedartifactdocument.getSize()));
		} else {
			r.addRsrchStdyRltedArtfctDocSz("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocSz("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocLnguage("[");}
		if(researchstudyrelatedartifactdocument.hasLanguage()) {

			r.addRsrchStdyRltedArtfctDocLnguage(String.valueOf(researchstudyrelatedartifactdocument.getLanguage()));
		} else {
			r.addRsrchStdyRltedArtfctDocLnguage("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocLnguage("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocCntntTyp("[");}
		if(researchstudyrelatedartifactdocument.hasContentType()) {

			r.addRsrchStdyRltedArtfctDocCntntTyp(String.valueOf(researchstudyrelatedartifactdocument.getContentType()));
		} else {
			r.addRsrchStdyRltedArtfctDocCntntTyp("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocCntntTyp("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocHash("[");}
		if(researchstudyrelatedartifactdocument.hasHash()) {

			r.addRsrchStdyRltedArtfctDocHash(new String(researchstudyrelatedartifactdocument.getHash()));
		} else {
			r.addRsrchStdyRltedArtfctDocHash("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocHash("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocData("[");}
		if(researchstudyrelatedartifactdocument.hasData()) {

			r.addRsrchStdyRltedArtfctDocData(new String(researchstudyrelatedartifactdocument.getData()));
		} else {
			r.addRsrchStdyRltedArtfctDocData("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocData("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocCreation("[");}
		if(researchstudyrelatedartifactdocument.hasCreation()) {

			r.addRsrchStdyRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchstudyrelatedartifactdocument.getCreation())+"\"");
		} else {
			r.addRsrchStdyRltedArtfctDocCreation("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocCreation("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocTtl("[");}
		if(researchstudyrelatedartifactdocument.hasTitle()) {

			r.addRsrchStdyRltedArtfctDocTtl(String.valueOf(researchstudyrelatedartifactdocument.getTitle()));
		} else {
			r.addRsrchStdyRltedArtfctDocTtl("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocTtl("]");}


		/******************** RsrchStdy_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchstudyrelatedartifacti == 0) {r.addRsrchStdyRltedArtfctDocUrl("[");}
		if(researchstudyrelatedartifactdocument.hasUrl()) {

			r.addRsrchStdyRltedArtfctDocUrl(String.valueOf(researchstudyrelatedartifactdocument.getUrl()));
		} else {
			r.addRsrchStdyRltedArtfctDocUrl("NULL");
		}

		if(researchstudyrelatedartifacti == researchstudyrelatedartifactlist.size()-1) {r.addRsrchStdyRltedArtfctDocUrl("]");}


		 };
		/******************** researchstudykeyword ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchstudykeywordlist = researchstudy.getKeyword();
		for(int researchstudykeywordi = 0; researchstudykeywordi<researchstudykeywordlist.size();researchstudykeywordi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchstudykeyword = researchstudykeywordlist.get(researchstudykeywordi);

		/******************** RsrchStdy_Keyword_Txt ********************************************************************************/
		if(researchstudykeywordi == 0) {r.addRsrchStdyKeywordTxt("[");}
		if(researchstudykeyword.hasText()) {

			r.addRsrchStdyKeywordTxt(String.valueOf(researchstudykeyword.getText()));
		} else {
			r.addRsrchStdyKeywordTxt("NULL");
		}

		if(researchstudykeywordi == researchstudykeywordlist.size()-1) {r.addRsrchStdyKeywordTxt("]");}


		/******************** researchstudykeywordcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudykeywordcodinglist = researchstudykeyword.getCoding();
		for(int researchstudykeywordcodingi = 0; researchstudykeywordcodingi<researchstudykeywordcodinglist.size();researchstudykeywordcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudykeywordcoding = researchstudykeywordcodinglist.get(researchstudykeywordcodingi);

		/******************** RsrchStdy_Keyword_Cdg_Dsply ********************************************************************************/
		if(researchstudykeywordcodingi == 0) {r.addRsrchStdyKeywordCdgDsply("[[");}
		if(researchstudykeywordcoding.hasDisplay()) {

			r.addRsrchStdyKeywordCdgDsply(String.valueOf(researchstudykeywordcoding.getDisplay()));
		} else {
			r.addRsrchStdyKeywordCdgDsply("NULL");
		}

		if(researchstudykeywordcodingi == researchstudykeywordcodinglist.size()-1) {r.addRsrchStdyKeywordCdgDsply("]]");}


		/******************** RsrchStdy_Keyword_Cdg_Vrsn ********************************************************************************/
		if(researchstudykeywordcodingi == 0) {r.addRsrchStdyKeywordCdgVrsn("[[");}
		if(researchstudykeywordcoding.hasVersion()) {

			r.addRsrchStdyKeywordCdgVrsn(String.valueOf(researchstudykeywordcoding.getVersion()));
		} else {
			r.addRsrchStdyKeywordCdgVrsn("NULL");
		}

		if(researchstudykeywordcodingi == researchstudykeywordcodinglist.size()-1) {r.addRsrchStdyKeywordCdgVrsn("]]");}


		/******************** RsrchStdy_Keyword_Cdg_Cd ********************************************************************************/
		if(researchstudykeywordcodingi == 0) {r.addRsrchStdyKeywordCdgCd("[[");}
		if(researchstudykeywordcoding.hasCode()) {

			r.addRsrchStdyKeywordCdgCd(String.valueOf(researchstudykeywordcoding.getCode()));
		} else {
			r.addRsrchStdyKeywordCdgCd("NULL");
		}

		if(researchstudykeywordcodingi == researchstudykeywordcodinglist.size()-1) {r.addRsrchStdyKeywordCdgCd("]]");}


		/******************** RsrchStdy_Keyword_Cdg_UsrSltd ********************************************************************************/
		if(researchstudykeywordcodingi == 0) {r.addRsrchStdyKeywordCdgUsrSltd("[[");}
		if(researchstudykeywordcoding.hasUserSelected()) {

			r.addRsrchStdyKeywordCdgUsrSltd(String.valueOf(researchstudykeywordcoding.getUserSelected()));
		} else {
			r.addRsrchStdyKeywordCdgUsrSltd("NULL");
		}

		if(researchstudykeywordcodingi == researchstudykeywordcodinglist.size()-1) {r.addRsrchStdyKeywordCdgUsrSltd("]]");}


		/******************** RsrchStdy_Keyword_Cdg_Sys ********************************************************************************/
		if(researchstudykeywordcodingi == 0) {r.addRsrchStdyKeywordCdgSys("[[");}
		if(researchstudykeywordcoding.hasSystem()) {

			r.addRsrchStdyKeywordCdgSys(String.valueOf(researchstudykeywordcoding.getSystem()));
		} else {
			r.addRsrchStdyKeywordCdgSys("NULL");
		}

		if(researchstudykeywordcodingi == researchstudykeywordcodinglist.size()-1) {r.addRsrchStdyKeywordCdgSys("]]");}


		 };
		 };
		/******************** RsrchStdy_Enrollment ********************************************************************************/
		if(researchstudy.hasEnrollment()) {

			String  array = "[";
			for(int incr=0; incr<researchstudy.getEnrollment().size(); incr++) {
				array = array + researchstudy.getEnrollment().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchStdyEnrollment(array);

		} else {
			r.addRsrchStdyEnrollment("NULL");
		}


		/******************** researchstudycondition ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchstudyconditionlist = researchstudy.getCondition();
		for(int researchstudyconditioni = 0; researchstudyconditioni<researchstudyconditionlist.size();researchstudyconditioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchstudycondition = researchstudyconditionlist.get(researchstudyconditioni);

		/******************** RsrchStdy_Cndtn_Txt ********************************************************************************/
		if(researchstudyconditioni == 0) {r.addRsrchStdyCndtnTxt("[");}
		if(researchstudycondition.hasText()) {

			r.addRsrchStdyCndtnTxt(String.valueOf(researchstudycondition.getText()));
		} else {
			r.addRsrchStdyCndtnTxt("NULL");
		}

		if(researchstudyconditioni == researchstudyconditionlist.size()-1) {r.addRsrchStdyCndtnTxt("]");}


		/******************** researchstudyconditioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyconditioncodinglist = researchstudycondition.getCoding();
		for(int researchstudyconditioncodingi = 0; researchstudyconditioncodingi<researchstudyconditioncodinglist.size();researchstudyconditioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyconditioncoding = researchstudyconditioncodinglist.get(researchstudyconditioncodingi);

		/******************** RsrchStdy_Cndtn_Cdg_Dsply ********************************************************************************/
		if(researchstudyconditioncodingi == 0) {r.addRsrchStdyCndtnCdgDsply("[[");}
		if(researchstudyconditioncoding.hasDisplay()) {

			r.addRsrchStdyCndtnCdgDsply(String.valueOf(researchstudyconditioncoding.getDisplay()));
		} else {
			r.addRsrchStdyCndtnCdgDsply("NULL");
		}

		if(researchstudyconditioncodingi == researchstudyconditioncodinglist.size()-1) {r.addRsrchStdyCndtnCdgDsply("]]");}


		/******************** RsrchStdy_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(researchstudyconditioncodingi == 0) {r.addRsrchStdyCndtnCdgVrsn("[[");}
		if(researchstudyconditioncoding.hasVersion()) {

			r.addRsrchStdyCndtnCdgVrsn(String.valueOf(researchstudyconditioncoding.getVersion()));
		} else {
			r.addRsrchStdyCndtnCdgVrsn("NULL");
		}

		if(researchstudyconditioncodingi == researchstudyconditioncodinglist.size()-1) {r.addRsrchStdyCndtnCdgVrsn("]]");}


		/******************** RsrchStdy_Cndtn_Cdg_Cd ********************************************************************************/
		if(researchstudyconditioncodingi == 0) {r.addRsrchStdyCndtnCdgCd("[[");}
		if(researchstudyconditioncoding.hasCode()) {

			r.addRsrchStdyCndtnCdgCd(String.valueOf(researchstudyconditioncoding.getCode()));
		} else {
			r.addRsrchStdyCndtnCdgCd("NULL");
		}

		if(researchstudyconditioncodingi == researchstudyconditioncodinglist.size()-1) {r.addRsrchStdyCndtnCdgCd("]]");}


		/******************** RsrchStdy_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyconditioncodingi == 0) {r.addRsrchStdyCndtnCdgUsrSltd("[[");}
		if(researchstudyconditioncoding.hasUserSelected()) {

			r.addRsrchStdyCndtnCdgUsrSltd(String.valueOf(researchstudyconditioncoding.getUserSelected()));
		} else {
			r.addRsrchStdyCndtnCdgUsrSltd("NULL");
		}

		if(researchstudyconditioncodingi == researchstudyconditioncodinglist.size()-1) {r.addRsrchStdyCndtnCdgUsrSltd("]]");}


		/******************** RsrchStdy_Cndtn_Cdg_Sys ********************************************************************************/
		if(researchstudyconditioncodingi == 0) {r.addRsrchStdyCndtnCdgSys("[[");}
		if(researchstudyconditioncoding.hasSystem()) {

			r.addRsrchStdyCndtnCdgSys(String.valueOf(researchstudyconditioncoding.getSystem()));
		} else {
			r.addRsrchStdyCndtnCdgSys("NULL");
		}

		if(researchstudyconditioncodingi == researchstudyconditioncodinglist.size()-1) {r.addRsrchStdyCndtnCdgSys("]]");}


		 };
		 };
		/******************** RsrchStdy_Sponsor ********************************************************************************/
		if(researchstudy.hasSponsor()) {

			if(researchstudy.getSponsor().getReference() != null) {
			r.addRsrchStdySponsor(researchstudy.getSponsor().getReference());
			}
		} else {
			r.addRsrchStdySponsor("NULL");
		}


		/******************** RsrchStdy_Site ********************************************************************************/
		if(researchstudy.hasSite()) {

			String  array = "[";
			for(int incr=0; incr<researchstudy.getSite().size(); incr++) {
				array = array + researchstudy.getSite().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchStdySite(array);

		} else {
			r.addRsrchStdySite("NULL");
		}


		/******************** researchstudyarm ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyArmComponent> researchstudyarmlist = researchstudy.getArm();
		for(int researchstudyarmi = 0; researchstudyarmi<researchstudyarmlist.size();researchstudyarmi++ ) {
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyArmComponent  researchstudyarm = researchstudyarmlist.get(researchstudyarmi);

		/******************** RsrchStdy_Arm_Nm ********************************************************************************/
		if(researchstudyarmi == 0) {r.addRsrchStdyArmNm("[");}
		if(researchstudyarm.hasName()) {

			r.addRsrchStdyArmNm(String.valueOf(researchstudyarm.getName()));
		} else {
			r.addRsrchStdyArmNm("NULL");
		}

		if(researchstudyarmi == researchstudyarmlist.size()-1) {r.addRsrchStdyArmNm("]");}


		/******************** researchstudyarmtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyarmtype = researchstudyarm.getType();

		/******************** RsrchStdy_Arm_Typ_Txt ********************************************************************************/
		if(researchstudyarmi == 0) {r.addRsrchStdyArmTypTxt("[");}
		if(researchstudyarmtype.hasText()) {

			r.addRsrchStdyArmTypTxt(String.valueOf(researchstudyarmtype.getText()));
		} else {
			r.addRsrchStdyArmTypTxt("NULL");
		}

		if(researchstudyarmi == researchstudyarmlist.size()-1) {r.addRsrchStdyArmTypTxt("]");}


		/******************** researchstudyarmtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyarmtypecodinglist = researchstudyarmtype.getCoding();
		for(int researchstudyarmtypecodingi = 0; researchstudyarmtypecodingi<researchstudyarmtypecodinglist.size();researchstudyarmtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyarmtypecoding = researchstudyarmtypecodinglist.get(researchstudyarmtypecodingi);

		/******************** RsrchStdy_Arm_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyarmtypecodingi == 0) {r.addRsrchStdyArmTypCdgDsply("[[");}
		if(researchstudyarmtypecoding.hasDisplay()) {

			r.addRsrchStdyArmTypCdgDsply(String.valueOf(researchstudyarmtypecoding.getDisplay()));
		} else {
			r.addRsrchStdyArmTypCdgDsply("NULL");
		}

		if(researchstudyarmtypecodingi == researchstudyarmtypecodinglist.size()-1) {r.addRsrchStdyArmTypCdgDsply("]]");}


		/******************** RsrchStdy_Arm_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyarmtypecodingi == 0) {r.addRsrchStdyArmTypCdgVrsn("[[");}
		if(researchstudyarmtypecoding.hasVersion()) {

			r.addRsrchStdyArmTypCdgVrsn(String.valueOf(researchstudyarmtypecoding.getVersion()));
		} else {
			r.addRsrchStdyArmTypCdgVrsn("NULL");
		}

		if(researchstudyarmtypecodingi == researchstudyarmtypecodinglist.size()-1) {r.addRsrchStdyArmTypCdgVrsn("]]");}


		/******************** RsrchStdy_Arm_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyarmtypecodingi == 0) {r.addRsrchStdyArmTypCdgCd("[[");}
		if(researchstudyarmtypecoding.hasCode()) {

			r.addRsrchStdyArmTypCdgCd(String.valueOf(researchstudyarmtypecoding.getCode()));
		} else {
			r.addRsrchStdyArmTypCdgCd("NULL");
		}

		if(researchstudyarmtypecodingi == researchstudyarmtypecodinglist.size()-1) {r.addRsrchStdyArmTypCdgCd("]]");}


		/******************** RsrchStdy_Arm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyarmtypecodingi == 0) {r.addRsrchStdyArmTypCdgUsrSltd("[[");}
		if(researchstudyarmtypecoding.hasUserSelected()) {

			r.addRsrchStdyArmTypCdgUsrSltd(String.valueOf(researchstudyarmtypecoding.getUserSelected()));
		} else {
			r.addRsrchStdyArmTypCdgUsrSltd("NULL");
		}

		if(researchstudyarmtypecodingi == researchstudyarmtypecodinglist.size()-1) {r.addRsrchStdyArmTypCdgUsrSltd("]]");}


		/******************** RsrchStdy_Arm_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyarmtypecodingi == 0) {r.addRsrchStdyArmTypCdgSys("[[");}
		if(researchstudyarmtypecoding.hasSystem()) {

			r.addRsrchStdyArmTypCdgSys(String.valueOf(researchstudyarmtypecoding.getSystem()));
		} else {
			r.addRsrchStdyArmTypCdgSys("NULL");
		}

		if(researchstudyarmtypecodingi == researchstudyarmtypecodinglist.size()-1) {r.addRsrchStdyArmTypCdgSys("]]");}


		 };
		/******************** RsrchStdy_Arm_Dscrptn ********************************************************************************/
		if(researchstudyarmi == 0) {r.addRsrchStdyArmDscrptn("[");}
		if(researchstudyarm.hasDescription()) {

			r.addRsrchStdyArmDscrptn(String.valueOf(researchstudyarm.getDescription()));
		} else {
			r.addRsrchStdyArmDscrptn("NULL");
		}

		if(researchstudyarmi == researchstudyarmlist.size()-1) {r.addRsrchStdyArmDscrptn("]");}


		 };
		/******************** researchstudyreasonstopped ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyreasonstopped = researchstudy.getReasonStopped();

		/******************** RsrchStdy_RsnStopped_Txt ********************************************************************************/
		if(researchstudyreasonstopped.hasText()) {

			r.addRsrchStdyRsnStoppedTxt(String.valueOf(researchstudyreasonstopped.getText()));
		} else {
			r.addRsrchStdyRsnStoppedTxt("NULL");
		}


		/******************** researchstudyreasonstoppedcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyreasonstoppedcodinglist = researchstudyreasonstopped.getCoding();
		for(int researchstudyreasonstoppedcodingi = 0; researchstudyreasonstoppedcodingi<researchstudyreasonstoppedcodinglist.size();researchstudyreasonstoppedcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyreasonstoppedcoding = researchstudyreasonstoppedcodinglist.get(researchstudyreasonstoppedcodingi);

		/******************** RsrchStdy_RsnStopped_Cdg_Dsply ********************************************************************************/
		if(researchstudyreasonstoppedcodingi == 0) {r.addRsrchStdyRsnStoppedCdgDsply("[");}
		if(researchstudyreasonstoppedcoding.hasDisplay()) {

			r.addRsrchStdyRsnStoppedCdgDsply(String.valueOf(researchstudyreasonstoppedcoding.getDisplay()));
		} else {
			r.addRsrchStdyRsnStoppedCdgDsply("NULL");
		}

		if(researchstudyreasonstoppedcodingi == researchstudyreasonstoppedcodinglist.size()-1) {r.addRsrchStdyRsnStoppedCdgDsply("]");}


		/******************** RsrchStdy_RsnStopped_Cdg_Vrsn ********************************************************************************/
		if(researchstudyreasonstoppedcodingi == 0) {r.addRsrchStdyRsnStoppedCdgVrsn("[");}
		if(researchstudyreasonstoppedcoding.hasVersion()) {

			r.addRsrchStdyRsnStoppedCdgVrsn(String.valueOf(researchstudyreasonstoppedcoding.getVersion()));
		} else {
			r.addRsrchStdyRsnStoppedCdgVrsn("NULL");
		}

		if(researchstudyreasonstoppedcodingi == researchstudyreasonstoppedcodinglist.size()-1) {r.addRsrchStdyRsnStoppedCdgVrsn("]");}


		/******************** RsrchStdy_RsnStopped_Cdg_Cd ********************************************************************************/
		if(researchstudyreasonstoppedcodingi == 0) {r.addRsrchStdyRsnStoppedCdgCd("[");}
		if(researchstudyreasonstoppedcoding.hasCode()) {

			r.addRsrchStdyRsnStoppedCdgCd(String.valueOf(researchstudyreasonstoppedcoding.getCode()));
		} else {
			r.addRsrchStdyRsnStoppedCdgCd("NULL");
		}

		if(researchstudyreasonstoppedcodingi == researchstudyreasonstoppedcodinglist.size()-1) {r.addRsrchStdyRsnStoppedCdgCd("]");}


		/******************** RsrchStdy_RsnStopped_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyreasonstoppedcodingi == 0) {r.addRsrchStdyRsnStoppedCdgUsrSltd("[");}
		if(researchstudyreasonstoppedcoding.hasUserSelected()) {

			r.addRsrchStdyRsnStoppedCdgUsrSltd(String.valueOf(researchstudyreasonstoppedcoding.getUserSelected()));
		} else {
			r.addRsrchStdyRsnStoppedCdgUsrSltd("NULL");
		}

		if(researchstudyreasonstoppedcodingi == researchstudyreasonstoppedcodinglist.size()-1) {r.addRsrchStdyRsnStoppedCdgUsrSltd("]");}


		/******************** RsrchStdy_RsnStopped_Cdg_Sys ********************************************************************************/
		if(researchstudyreasonstoppedcodingi == 0) {r.addRsrchStdyRsnStoppedCdgSys("[");}
		if(researchstudyreasonstoppedcoding.hasSystem()) {

			r.addRsrchStdyRsnStoppedCdgSys(String.valueOf(researchstudyreasonstoppedcoding.getSystem()));
		} else {
			r.addRsrchStdyRsnStoppedCdgSys("NULL");
		}

		if(researchstudyreasonstoppedcodingi == researchstudyreasonstoppedcodinglist.size()-1) {r.addRsrchStdyRsnStoppedCdgSys("]");}


		 };
		/******************** researchstudyobjective ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyObjectiveComponent> researchstudyobjectivelist = researchstudy.getObjective();
		for(int researchstudyobjectivei = 0; researchstudyobjectivei<researchstudyobjectivelist.size();researchstudyobjectivei++ ) {
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyObjectiveComponent  researchstudyobjective = researchstudyobjectivelist.get(researchstudyobjectivei);

		/******************** RsrchStdy_Objective_Nm ********************************************************************************/
		if(researchstudyobjectivei == 0) {r.addRsrchStdyObjectiveNm("[");}
		if(researchstudyobjective.hasName()) {

			r.addRsrchStdyObjectiveNm(String.valueOf(researchstudyobjective.getName()));
		} else {
			r.addRsrchStdyObjectiveNm("NULL");
		}

		if(researchstudyobjectivei == researchstudyobjectivelist.size()-1) {r.addRsrchStdyObjectiveNm("]");}


		/******************** researchstudyobjectivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyobjectivetype = researchstudyobjective.getType();

		/******************** RsrchStdy_Objective_Typ_Txt ********************************************************************************/
		if(researchstudyobjectivei == 0) {r.addRsrchStdyObjectiveTypTxt("[");}
		if(researchstudyobjectivetype.hasText()) {

			r.addRsrchStdyObjectiveTypTxt(String.valueOf(researchstudyobjectivetype.getText()));
		} else {
			r.addRsrchStdyObjectiveTypTxt("NULL");
		}

		if(researchstudyobjectivei == researchstudyobjectivelist.size()-1) {r.addRsrchStdyObjectiveTypTxt("]");}


		/******************** researchstudyobjectivetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchstudyobjectivetypecodinglist = researchstudyobjectivetype.getCoding();
		for(int researchstudyobjectivetypecodingi = 0; researchstudyobjectivetypecodingi<researchstudyobjectivetypecodinglist.size();researchstudyobjectivetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchstudyobjectivetypecoding = researchstudyobjectivetypecodinglist.get(researchstudyobjectivetypecodingi);

		/******************** RsrchStdy_Objective_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyobjectivetypecodingi == 0) {r.addRsrchStdyObjectiveTypCdgDsply("[[");}
		if(researchstudyobjectivetypecoding.hasDisplay()) {

			r.addRsrchStdyObjectiveTypCdgDsply(String.valueOf(researchstudyobjectivetypecoding.getDisplay()));
		} else {
			r.addRsrchStdyObjectiveTypCdgDsply("NULL");
		}

		if(researchstudyobjectivetypecodingi == researchstudyobjectivetypecodinglist.size()-1) {r.addRsrchStdyObjectiveTypCdgDsply("]]");}


		/******************** RsrchStdy_Objective_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyobjectivetypecodingi == 0) {r.addRsrchStdyObjectiveTypCdgVrsn("[[");}
		if(researchstudyobjectivetypecoding.hasVersion()) {

			r.addRsrchStdyObjectiveTypCdgVrsn(String.valueOf(researchstudyobjectivetypecoding.getVersion()));
		} else {
			r.addRsrchStdyObjectiveTypCdgVrsn("NULL");
		}

		if(researchstudyobjectivetypecodingi == researchstudyobjectivetypecodinglist.size()-1) {r.addRsrchStdyObjectiveTypCdgVrsn("]]");}


		/******************** RsrchStdy_Objective_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyobjectivetypecodingi == 0) {r.addRsrchStdyObjectiveTypCdgCd("[[");}
		if(researchstudyobjectivetypecoding.hasCode()) {

			r.addRsrchStdyObjectiveTypCdgCd(String.valueOf(researchstudyobjectivetypecoding.getCode()));
		} else {
			r.addRsrchStdyObjectiveTypCdgCd("NULL");
		}

		if(researchstudyobjectivetypecodingi == researchstudyobjectivetypecodinglist.size()-1) {r.addRsrchStdyObjectiveTypCdgCd("]]");}


		/******************** RsrchStdy_Objective_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyobjectivetypecodingi == 0) {r.addRsrchStdyObjectiveTypCdgUsrSltd("[[");}
		if(researchstudyobjectivetypecoding.hasUserSelected()) {

			r.addRsrchStdyObjectiveTypCdgUsrSltd(String.valueOf(researchstudyobjectivetypecoding.getUserSelected()));
		} else {
			r.addRsrchStdyObjectiveTypCdgUsrSltd("NULL");
		}

		if(researchstudyobjectivetypecodingi == researchstudyobjectivetypecodinglist.size()-1) {r.addRsrchStdyObjectiveTypCdgUsrSltd("]]");}


		/******************** RsrchStdy_Objective_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyobjectivetypecodingi == 0) {r.addRsrchStdyObjectiveTypCdgSys("[[");}
		if(researchstudyobjectivetypecoding.hasSystem()) {

			r.addRsrchStdyObjectiveTypCdgSys(String.valueOf(researchstudyobjectivetypecoding.getSystem()));
		} else {
			r.addRsrchStdyObjectiveTypCdgSys("NULL");
		}

		if(researchstudyobjectivetypecodingi == researchstudyobjectivetypecodinglist.size()-1) {r.addRsrchStdyObjectiveTypCdgSys("]]");}


		 };
		 };
		/******************** RsrchStdy_PartOf ********************************************************************************/
		if(researchstudy.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<researchstudy.getPartOf().size(); incr++) {
				array = array + researchstudy.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchStdyPartOf(array);

		} else {
			r.addRsrchStdyPartOf("NULL");
		}


		return r;
	}
}
